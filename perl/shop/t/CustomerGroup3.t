use strict;
use Test::More tests => 30;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );
use WebServiceTools qw( TLocalizedString hLocalizedString );

# Create a SOAP::Lite client object
my $CustomerGroupService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/CustomerGroupService/2011/10' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $Options = {
    'Alias' => 'perl_testGroup-1',
    'Path'  => 'Groups/',
    'Name_in' => {
        'de'  => 'TestGruppe',
        'en'  => 'TestGroup',
    },
    'Name_up' => {
        'de'  => 'TestGruppe modifiziert',
        'en'  => 'TestGroup changed',
    },
};
$Options->{'FullPath'} = $Options->{'Path'}.$Options->{'Alias'};

my $group_in = {
    'Alias' => $Options->{'Alias'},
    'Name'  => TLocalizedString( $Options->{'Name_in'} ),
};

my $group_up = {
    'Alias' => $Options->{'Alias'},
    'Name'  => TLocalizedString( $Options->{'Name_up'} ),
};

# Retrieve a list of CustomerGroups
sub testGetList {

    my $ahResults = $CustomerGroupService->getList()->result;
    ok( scalar @$ahResults >= 1, "getList result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getList: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq "NewCustomer" || $hResult->{'Alias'} eq "RegularCustomer",
        "customer group test" );
}

# Create a Customer and check if the creation was successful
sub testCreate {

    my $ahResults = $CustomerGroupService->create( [$group_in] )->result;
    is( scalar @$ahResults, 1, "create result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $group_in->{'Alias'}, "customer group alias" );
    is( $hResult->{'created'}, 1, "created?" );
}

# Update a Customer and check if the update was successful
sub testUpdate {

    my $ahResults = $CustomerGroupService->update( [$group_up] )->result;
    is( scalar @$ahResults, 1, "update result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $group_in->{'Alias'}, "customer group alias" );
    is( $hResult->{'updated'}, 1, "updated?" );
}

# Retrieve information about an Group. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $CustomerGroupService->getInfo( [$Options->{'Alias'}] )->result;
    is( scalar @$ahResults, 1, "getInfo result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $Options->{'Alias'}, 'group alias' );
    ok( $hResult->{'Class'} eq 'CustomerGroup', 'group class');

}

# Test if a Customer exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $CustomerGroupService->exists( [$Options->{'Alias'}] )->result;
    is( scalar @$ahResults, 1, "exists result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    is( $hResult->{'exists'}, $exists, "exists?" );
}

# Delete a Customer and check if no error occured.
sub testDelete {

    my $ahResults = $CustomerGroupService->delete( [$Options->{'Alias'}] )->result;
    is( scalar @$ahResults, 1, "delete result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    is( $hResult->{'deleted'}, 1, "deleted?" );
}

sub testDeleteRegular {
    my $ahResults = $CustomerGroupService->delete( ['RegularCustomer'] )->result;
    is( scalar @$ahResults, 1, "delete result count" );
}

sub testCreateRegular {
    my $ahResults = $CustomerGroupService->create( [{'Alias'=>'RegularCustomer'}] )->result;
    is( scalar @$ahResults, 1, "create result count" );
}



# run test suite
testGetList();
testDeleteRegular();
testCreate();
testExists(1);
testGetInfo();
testUpdate();
testGetInfo(1);
testDelete();
testExists(0);
testCreateRegular();

