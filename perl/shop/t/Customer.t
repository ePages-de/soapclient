use utf8;
use strict;
use Test::More tests => 38;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( TAttributes hAttributes );

# Create a SOAP::Lite client object
my $CustomerService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/CustomerService/2005/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'Alias' => 'perl_test-1',
    'Path'  => 'Customers/',
    'Address_in' => {
        'EMail'     => 'perl_test-1@epages.de',
        'FirstName' => 'Klaus',
        'LastName'  => 'Klaussen',
        'Street'    => SOAP::Data->type('string')->value('Musterstraße 2'),
        'Birthday'  => '1976-09-25T11:22:33',
    },
    'Address_up' => {
        'FirstName' => 'Hans',
        'LastName'  => 'Hanssen',
        'Street'    => SOAP::Data->type('string')->value('Musterstraße 2b'),
    },
    'CustomerGroup' => 'CustomerGroups/Neukunde',
    'Attributes_in' => {
        'Comment'   => 'my customer commment',
    },
    'Attributes_up' => {
        'Comment'   => 'my updated customer comment',
    },
};
$options->{'FullPath'} = $options->{'Path'}.$options->{'Alias'};
$options->{'CustomerGroup'} = _testGroups()->[0];

my $customer_in = {
    'Alias'             => $options->{'Alias'},
    'BillingAddress'    => $options->{'Address_in'},
    'CustomerGroup'     => $options->{'CustomerGroup'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};

my $customer_update = {
    'Path'              => $options->{'FullPath'},
    'BillingAddress'    => $options->{'Address_up'},
    'Attributes'        => TAttributes($options->{'Attributes_up'}),
};

# Create a Customer and check if the creation was successful
sub testCreate {

    my $ahResults = $CustomerService->create( [$customer_in] )->result;
    is( scalar @$ahResults, 1, "create result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $customer_in->{'Alias'}, "customer alias" );
    is( $hResult->{'created'}, 1, "created?" );
}

# Update a Customer and check if the update was successful
sub testUpdate {

    my $ahResults = $CustomerService->update( [$customer_update] )->result;
    is( scalar @$ahResults, 1, "udpate result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "update: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $customer_update->{'Path'}, "customer path" );
    is( $hResult->{'updated'}, 1, "updated?" );
}

# Retrieve information about an Customer. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $CustomerService->getInfo( [$options->{'FullPath'}], ['Comment'] )->result;
    is( scalar @$ahResults, 1, "getInfo result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'}, "customer path" );
    ok( $hResult->{'CustomerGroup'} eq WEBSERVICE_SHOP_PATH.$options->{'CustomerGroup'}, "cutomer group path" );

    my $bill  = $hResult->{'BillingAddress'};
    my $bill2 = $options->{"Address$ext"};
    ok( $bill->{'FirstName'}    eq $bill2->{'FirstName'},   "first name" );
    ok( $bill->{'LastName'}     eq $bill2->{'LastName'},    "last name" );
    ok( $bill->{'Street'}       eq $bill2->{'Street'}->value, "street" );

    my $hAttributes = hAttributes($hResult->{'Attributes'});
    ok( $hAttributes->{'Comment'} eq $options->{"Attributes$ext"}->{'Comment'}, "comment" );
}

sub deleteIfExists {
    my $ahResults = $CustomerService->exists( [$options->{'FullPath'}] )->result;
    die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};

    if ( $ahResults->[0]->{'exists'} ) {
        $ahResults = $CustomerService->delete( [$options->{'FullPath'}] )->result;
        die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};
    }
}

# Delete a Customer and check if no error occured.
sub testDelete {

    my $ahResults = $CustomerService->delete( [$options->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, "delete result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $options->{'FullPath'}, "customer path" );
    is( $hResult->{'deleted'}, 1, "deleted?" );
}

# Test if a Customer exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $CustomerService->exists( [$options->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, "exists result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $options->{'FullPath'}, "customer path" );
    is( $hResult->{'exists'}, $exists, "exists?" );
}

# Test if a customer is found by EMail
sub testFind {

    my $aResults = $CustomerService->find( {'EMail'=>$options->{'Address_in'}->{'EMail'}} )->result;
    is( scalar @$aResults, 1, "find result count" );

    ok( $aResults->[0] eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'}, "customer path" );
}

sub _testGroups {
    my $CustomerGroupService = WebServiceClient
        ->uri( 'urn://epages.de/WebService/CustomerGroupService/2006/06' )
        ->proxy( WEBSERVICE_URL )
        ->userinfo( WEBSERVICE_USER )
        ->xmlschema('2001');
    my $ahResults = $CustomerGroupService->getList()->result;
    return[
    	map { "Groups/$_->{'Alias'}"}
    	@$ahResults
    ];
}

# run test suite
deleteIfExists();
testCreate();
testExists(1);
testFind();
testGetInfo(0);
testUpdate();
testGetInfo(1);
testDelete();
testExists(0);
