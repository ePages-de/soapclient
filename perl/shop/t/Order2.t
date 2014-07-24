use utf8;
use strict;
use Test::More tests => 50;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( TAttributes hAttributes cmpDateTime );

# Create a SOAP::Lite client object
my $OrderService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/OrderService/2006/07' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'Alias'      => 'perl_test-1',
    'Path'       => 'Customers/1001/Orders/',
    'Customer'   => 'Customers/1001',
    'Address_in' => {
        'EMail'     => 'perl_test-1@epages.de',
        'FirstName' => 'Klaus',
        'LastName'  => 'Klaussen',
        'Street'    => SOAP::Data->type('string')->value('Musterstraße 2'),
        'Street2'   => 'Ortsteil Niederfingeln',
    },
    'Address_up' => {
        'FirstName' => 'Hans',
        'LastName'  => 'Hanssen',
        'Street'    => SOAP::Data->type('string')->value('Musterstraße 2b'),
        'Street2'   => 'Ortsteil Oberfingeln',
    },
    'AdressAttributes' => {
        'JobTitle'  => 'best Job',
        'Salutation'=> 'Dr.',
    },
    'LineItemContainer' => {
        'CurrencyID'        => 'EUR',
        'PaymentMethod'     => 'PaymentMethods/Invoice',
        'ShippingMethod'    => 'ShippingMethods/Express',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => 'Products/ho_1112105010', 'Quantity' => '10'},
        ],
    },
    'Attributes_in' => {
        'Comment'   => 'my customer commment',
    },
    'Attributes_up' => {
        'Comment'   => 'my updated customer comment',
    },
    'ViewedOn'      => '2006-01-01T20:00:00',
    'CreationDate'  => '2006-01-01T00:00:00',
};
$options->{'FullPath'} = $options->{'Path'}.$options->{'Alias'};

my $Order_in = {
    'Alias'             => $options->{'Alias'},
    'Customer'          => $options->{'Customer'},
    'BillingAddress'    => $options->{'Address_in'},
    'LineItemContainer' => $options->{'LineItemContainer'},
    'ViewedOn'          => $options->{'ViewedOn'},
    'CreationDate'      => $options->{'CreationDate'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};
$Order_in->{'BillingAddress'}->{'Attributes'} = TAttributes($options->{'AdressAttributes'});

my $Order_update = {
    'Path'              => $options->{'FullPath'},
    'BillingAddress'    => $options->{'Address_up'},
    'Attributes'        => TAttributes($options->{'Attributes_up'}),
    'InProcessOn'       => $options->{'InProcessOn'},
};

# Create a Order and check if the creation was successful
sub testCreate {

    my $ahResults = $OrderService->create( [$Order_in] )->result;
    is( scalar @$ahResults, 1, "create: result count" );

    my $hCreate = $ahResults->[0];
    ok( !$hCreate->{'Error'}, "create: no error" );
    diag $hCreate->{'Error'}->{'Message'}."\n" if $hCreate->{'Error'};

    ok( $hCreate->{'Alias'} eq $Order_in->{'Alias'}, "order alias" );
    is( $hCreate->{'created'}, 1, "created?" );
}

# Update a Order and check if the update was successful
sub testUpdate {

    my $ahResults = $OrderService->update( [$Order_update] )->result;
    is( scalar @$ahResults, 1, "update: result count" );

    my $hUpdate = $ahResults->[0];
    ok( !$hUpdate->{'Error'}, "update: no error" );
    diag $hUpdate->{'Error'}->{'Message'}."\n" if $hUpdate->{'Error'};

    ok( $hUpdate->{'Path'} eq $Order_update->{'Path'}, "order path" );
    is( $hUpdate->{'updated'}, 1, "updated?" );
}

# Retrieve information about an Order. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $OrderService->getInfo( [$options->{'FullPath'}], ['Comment'], [] )->result;
    is( scalar @$ahResults, 1, "getInfo result set" );

    my $hInfo = $ahResults->[0];
    ok( !$hInfo->{'Error'}, "getInfo: no error" );
    diag "Error: $hInfo->{'Error'}\n" if $hInfo->{'Error'};

    ok( $hInfo->{'Path'}     eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'},      "order path" );
    ok( $hInfo->{'Customer'} eq WEBSERVICE_SHOP_PATH.$Order_in->{'Customer'}, "customer" );
    is( 0, cmpDateTime($hInfo->{'CreationDate'}, $options->{'CreationDate'}),  "CreationDate" );
    is( 0, cmpDateTime($hInfo->{'ViewedOn'},     $options->{'ViewedOn'}),      "ViewedOn" );

    my $hLineItemContainer  = $hInfo->{'LineItemContainer'};
    my $hLineItemContainer2 = $options->{'LineItemContainer'};
    ok( $hLineItemContainer->{'TaxArea'}    eq $hLineItemContainer2->{'TaxArea'},       "tax area" );
    ok( $hLineItemContainer->{'TaxModel'}   eq $hLineItemContainer2->{'TaxModel'},      "tax model" );
    ok( $hLineItemContainer->{'CurrencyID'} eq $hLineItemContainer2->{'CurrencyID'},    "currencyid" );

    my $bill  = $hInfo->{'BillingAddress'};
    my $bill2 = $options->{"Address$ext"};
    ok( $bill->{'FirstName'}    eq $bill2->{'FirstName'},   "first name" );
    ok( $bill->{'LastName'}     eq $bill2->{'LastName'},    "last name" );
    ok( $bill->{'Street'}       eq $bill2->{'Street'}->value, "street" );
    ok( $bill->{'Street2'}      eq $bill2->{'Street2'},    "street2" );

    my $hAttributes = hAttributes($hInfo->{'Attributes'});
    ok( $hAttributes->{'Comment'} eq $options->{"Attributes$ext"}->{'Comment'}, "comment" );
}

sub deleteIfExists {
    my $ahResults = $OrderService->exists( [$options->{'FullPath'}] )->result;
    die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};

    if ( $ahResults->[0]->{'exists'} ) {
        $ahResults = $OrderService->delete( [$options->{'FullPath'}] )->result;
        die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};
    }
}

# Delete a Order and check if no error occured.
sub testDelete {

    my $ahResults = $OrderService->delete( [$options->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, "delete: result count" );

    my $hDelete = $ahResults->[0];
    ok( !$hDelete->{'Error'}, "delete: no error" );
    diag $hDelete->{'Error'}->{'Message'}."\n" if $hDelete->{'Error'};

    ok( $hDelete->{'Path'} eq $options->{'FullPath'}, "delete: order path" );
    is( $hDelete->{'deleted'}, 1, "deleted?" );
}

# Test if a Order exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $OrderService->exists( [$options->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, "exists: result count" );

    my $hExists = $ahResults->[0];
    ok( !$hExists->{'Error'}, "exists: no error" );
    diag $hExists->{'Error'}->{'Message'}."\n" if $hExists->{'Error'};

    ok( $hExists->{'Path'} eq $options->{'FullPath'}, "exists: order path" );
    is( $hExists->{'exists'}, $exists, "exists?" );
}

# Test if a Order is found by EMail
sub testFind {

    my $ahResults = $OrderService->find( {'Alias'=>$options->{'Alias'}, 'IsViewed'=>1} )->result;
    is( scalar @$ahResults, 1, "find: result count" );

    ok( $ahResults->[0] eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'}, "find: order path" );
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
