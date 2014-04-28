use strict;
use Test::More tests => 3;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );
use WebServiceTools qw( sortByStrings );

# Create a SOAP::Lite client object
my $TaxAreaService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/TaxAreaService/2006/07' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$TaxAreaService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

# Retrieve a list of TaxAreas from the shop
sub testGetList {

    my $ahResult = $TaxAreaService->getList()->result;

    ok( scalar @$ahResult >= 2, "getList result set" );

    @$ahResult = sortByStrings 'Path', @$ahResult;
    ok( $ahResult->[0]-> {'Path'} eq '/TaxMatrixGermany/"non EU"' , "tax area 1" );
    ok( $ahResult->[1]-> {'Path'} eq "/TaxMatrixGermany/EU" , "tax area 2" );
}

# run test suite
testGetList();
