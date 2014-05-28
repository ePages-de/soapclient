use strict;
use Test::More tests => 1;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $UpdateService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/UpdateService/2014/06' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# clear page cache
sub testfindDeletes {
    my $results = $UpdateService->findDeletes('2013-04-14T03:44:55', 'Product');
    ok( !$results->fault, 'findDeletes called' );
}

sub testfindUpdatesStock {
    my $results = $UpdateService->findUpdates('2013-04-14T03:44:55', 'Product', 'StockLevel');
    ok( !$results->fault, 'findUpdates called' );
}

# run test suite
testfindDeletes();
testfindUpdatesStock();
