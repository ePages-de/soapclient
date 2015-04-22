use utf8;
use strict;
use Test::More tests => 40;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( TAttributes hAttributes );

# Create a SOAP::Lite client object
my $UserService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/UserService/2005/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'Alias'     => 'perl_test-1',
    'Path'      => 'Users/',
    'Password'  => 'epages',
    'Name_in'   => 'Klaus Klaussen',
    'Name_up'   => 'Hans Hanssen',
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
    'Attributes_in' => {
        'ChallengePhrase'   => 'my challenge phrase',
    },
    'Attributes_up' => {
        'ChallengePhrase'   => 'my updated challenge phrase',
    },
};
$options->{'FullPath'} = $options->{'Path'}.$options->{'Alias'};

my $user_in = {
    'Alias'             => $options->{'Alias'},
    'Password'          => $options->{'Password'},
    'Name'              => $options->{'Name_in'},
    'BillingAddress'    => $options->{'Address_in'},
    'ShippingAddress'   => $options->{'Address_in'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};

my $user_update = {
    'Path'              => $options->{'FullPath'},
    'Name'              => $options->{'Name_up'},
    'BillingAddress'    => $options->{'Address_up'},
    'Attributes'        => TAttributes($options->{'Attributes_up'}),
};

# Create a User and check if the creation was successful
sub testCreate {

    my $ahResults = $UserService->create( [$user_in] )->result;
    is( scalar @$ahResults, 1, "create result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "create: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $user_in->{'Alias'}, "user alias" );
    is( $hResult->{'created'}, 1, "created?" );
}

# Update a User and check if the update was successful
sub testUpdate {

    my $ahResults = $UserService->update( [$user_update] )->result;
    is( scalar @$ahResults, 1, "udpate result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "update: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $user_update->{'Path'}, "user path" );
    is( $hResult->{'updated'}, 1, "updated?" );
}

# Retrieve information about an User. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $UserService->getInfo( [$options->{'FullPath'}], ['ChallengePhrase'] )->result;
    is( scalar @$ahResults, 1, "getInfo result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'}, "user path" );
    ok( $hResult->{'Name'} eq $options->{"Name$ext"}, "user name" );

    my $bill  = $hResult->{'BillingAddress'};
    my $bill2 = $options->{"Address$ext"};
    ok( $bill->{'FirstName'}    eq $bill2->{'FirstName'},   "first name" );
    ok( $bill->{'LastName'}     eq $bill2->{'LastName'},    "last name" );
    ok( $bill->{'Street'}       eq $bill2->{'Street'}->value, "street" );

    #--- email have not updated
    ok( $bill->{'EMail'} eq $user_in->{'BillingAddress'}->{'EMail'}, "email" );

    my $hAttributes = hAttributes($hResult->{'Attributes'});
    ok( $hAttributes->{'ChallengePhrase'} eq $options->{"Attributes$ext"}->{'ChallengePhrase'}, "challenge phrase" );

    # sent and returned password are not the same ... returned password is already crypted
    ok( $hResult->{'Password'} ne $user_in->{'Password'}, "password" );
}

sub deleteIfExists {
    my $ahResults = $UserService->exists( [$options->{'FullPath'}] )->result;
    die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};

    if ( $ahResults->[0]->{'exists'} ) {
        $ahResults = $UserService->delete( [$options->{'FullPath'}] )->result;
        die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};
    }
}

# Delete a User and check if no error occured.
sub testDelete {

    my $ahResults = $UserService->delete( [$options->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, "delete result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "delete: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $options->{'FullPath'}, "user path" );
    is( $hResult->{'deleted'}, 1, "deleted?" );
}

# Test if a User exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $UserService->exists( [$options->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, "exists result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "exists: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $options->{'FullPath'}, "user path" );
    is( $hResult->{'exists'}, $exists, "exists?" );
}

# run test suite
deleteIfExists();
testCreate();
testExists(1);
testGetInfo(0);
testUpdate();
testGetInfo(1);
testDelete();
testExists(0);
