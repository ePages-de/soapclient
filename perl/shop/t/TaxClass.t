use utf8;
use strict;
use Test::More tests => 4;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );
use WebServiceTools qw( sortByStrings );

# Create a SOAP::Lite client object
my $TaxClassService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/TaxClassService/2006/07' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$TaxClassService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

# Retrieve a list of TaxClasss from the shop
sub testGetList {

    my $ahResult = $TaxClassService->getList()->result;

    ok( scalar @$ahResult >= 2, 'getList result set' );

    @$ahResult = sortByStrings 'Path', @$ahResult;
    ok( $ahResult->[0]-> {'Path'} eq '/TaxMatrixGermany/none' , 'tax area 1' );
    ok( $ahResult->[1]-> {'Path'} eq '/TaxMatrixGermany/normal' , 'tax area 2' );
    ok( $ahResult->[2]-> {'Path'} eq '/TaxMatrixGermany/reduced' , 'tax area 3' );
}

# run test suite
testGetList();
