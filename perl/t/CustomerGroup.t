use strict;
use Test::More tests => 3;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $CustomerGroupService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/CustomerGroupService/2006/06' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

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

# run test suite
testGetList();
