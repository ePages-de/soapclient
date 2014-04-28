use strict;
use Test::More tests => 1;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $PageCacheService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/PageCacheService/2006/07' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# clear page cache
sub testClear {
    my $results = $PageCacheService->clear;
    ok( !$results->fault, 'clear page cache' );
}

# run test suite
testClear();
