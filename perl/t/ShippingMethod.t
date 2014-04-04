use strict;
use Test::More tests => 4;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH);

# Create a SOAP::Lite client object
my $ShippingmethodService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ShippingMethodService/2008/03' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ShippingmethodService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

# Retrieve a list of ShippingMethods from the shop
sub testGetList {

    my $ahResult = $ShippingmethodService->getList()->result;

	#use Data::Dumper;
	#diag Dumper( $ahResult );

    ok( scalar @$ahResult >= 3, "getList result set" );

    ok( $ahResult->[0]-> {'Path'} eq WEBSERVICE_SHOP_PATH."ShippingMethods/Post" , "shipping method 1" );
    ok( $ahResult->[1]-> {'Path'} eq WEBSERVICE_SHOP_PATH."ShippingMethods/Express"  , "shipping method 2" );
	ok( $ahResult->[2]-> {'Path'} eq WEBSERVICE_SHOP_PATH."ShippingMethods/PickupByCustomer"  , "shipping method 3" );
}

# run test suite
testGetList();
