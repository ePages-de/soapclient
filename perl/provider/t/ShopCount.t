use strict;
use Test::More tests => 11;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );

# Create a SOAP::Lite client object
my $ShopCountService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ShopCountService/2006/08' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema( '2001' );
$ShopCountService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

sub testGetCount {

    # count all shops
    my $TotalCount = $ShopCountService->getCount({})->result;
    # print "total shop count = $TotalCount\n";
    ok( $TotalCount > 0, "total shop count" );

    # count only real live shops
    my $LiveCount = $ShopCountService->getCount({
        IsPreCreated => 0,
        IsClosed => 0,
        IsTrialShop => 0,
        IsInternalTestShop => 0,
        IsDeleted => 0,
    })->result;
    # print "live shop count = $LiveCount\n";
    ok( $LiveCount > 0, "live shop count" );

    ok( $LiveCount <= $TotalCount, "live <= total" );
}

sub testGetAllCounts {

    my $ahCounters = $ShopCountService->getAllCounts({
        IsPreCreated => 0,
        IsClosed => 0,
        IsTrialShop => 0,
        IsInternalTestShop => 0,
        IsDeleted => 0,
    })->result;
    
    ok( scalar @$ahCounters > 0, "getAllCounts list is not empty" ); 

    my $hCounter = $ahCounters->[0];
    ok( defined $hCounter->{Database}, "getAllCounts[0].Database is defined" );
    ok( defined $hCounter->{ShopType}, "getAllCounts[0].ShopType is defined" );
    ok( defined $hCounter->{Trial_Closed}, "getAllCounts[0].Trial_Closed is defined" );
    ok( defined $hCounter->{Trial_NotClosed}, "getAllCounts[0].Trial_NotClosed is defined" );
    ok( defined $hCounter->{NotTrial_Closed}, "getAllCounts[0].NotTrial_Closed is defined" );
    ok( defined $hCounter->{NotTrial_NotClosed}, "getAllCounts[0].NotTrial_NotClosed is defined" );
    ok( defined $hCounter->{PreCreated}, "getAllCounts[0].PreCreated is defined" );
}

# run test suite
testGetCount();
testGetAllCounts();
