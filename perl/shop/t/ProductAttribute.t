use strict;
use Test::More tests => 4;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );

# Create a SOAP::Lite client object
my $ProductAttributeService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductAttributeService/2006/07' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductAttributeService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

# Retrieve a list of product attributes from the shop
sub testGetInfoList {

    my $aAttributes = $ProductAttributeService->getInfoList()->result;

    ok( scalar @$aAttributes >= 2, "getInfoList result count" );

	my $hAttribute = $aAttributes->[0];
    ok( $hAttribute-> {'Alias'} eq 'Color' || $hAttribute-> {'Alias'} eq 'Size', "first attribute is 'Color' or 'Size'" );
    ok( $hAttribute-> {'ProductType'} eq 'Jacket' , "is an attribute of product type 'Jacket'" );
    ok( $hAttribute-> {'IsVariationAttribute'}, "'Color' is a variation attribute" );

}

# run test suite
testGetInfoList();
