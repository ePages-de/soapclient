use strict;
use Test::More tests => 10;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH);

# Create a SOAP::Lite client object
my $PaymentmethodService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/PaymentMethodService/2008/03' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$PaymentmethodService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

# Retrieve a list of PaymentMethods from the shop
sub testGetList {
    my $ahResult = $PaymentmethodService->getList()->result;
    cmp_ok( scalar @$ahResult, '>=', 8, "getList result set" );
    my %Methods = map { $_->{'Path'} => 1 } @$ahResult;
}

# run test suite
testGetList();
