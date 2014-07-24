use strict;
use Test::More tests => 14;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );

# Create a SOAP::Lite client object
my $ShopConfigService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ShopConfigService/2005/03' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema( '2001' );
$ShopConfigService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

my $options = {
    'Alias' => 'perl_test-1',
};

my $Shop_in = {
    'Alias' => $options->{'Alias'},
    'Database' => 'Store',
    'ImportFiles' => [],
    'ShopAlias' => $options->{'Alias'},
    'ShopType' => 'ECom100',
    'DomainName' => 'test-domain-1',
};

my $Shop_update = {
    'Alias' => $options->{'Alias'},
    'Database' => 'Store',
    'ShopType' => 'ECom1000',
    'DomainName' => 'test-domain-2',
};

sub deleteIfExists {

    if( $ShopConfigService->exists( { 'Alias' => $options->{'Alias'} } )->result ) {
        $ShopConfigService->delete( { 'Alias' => $options->{'Alias'} } );
        $ShopConfigService->deleteShopRef( { 'Alias' => $options->{'Alias'} } );
    }
}

sub testCreate {

    $ShopConfigService->create( $Shop_in );

    ok( 1, "created?" );
}

sub testUpdate {

    $ShopConfigService->update( $Shop_update );

    ok( 1, "shop updated" );
}

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my $hResult = $ShopConfigService->getInfo( { 'Alias' => $options->{'Alias'} } )->result;

    if ($alreadyUpdated) {
        ok( $hResult->{'ShopType'} eq $Shop_update->{'ShopType'}, "updated ShopType" );
        ok( $hResult->{'DomainName'} eq $Shop_update->{'DomainName'}, "updated DomainName" );
    } else {
        ok( $hResult->{'ShopType'} eq $Shop_in->{'ShopType'}, "ShopType" );
        ok( $hResult->{'DomainName'} eq $Shop_in->{'DomainName'}, "DomainName" );
    }
    ok( $hResult->{'Database'} eq $Shop_in->{'Database'}, "Database" );
}

sub testGetAllInfo {

    my $ahResult = $ShopConfigService->getAllInfo()->result;

    ok( scalar @$ahResult > 0, "GetAllInfo result set" );
}

sub testDelete {

    $ShopConfigService->delete( { 'Alias' => $options->{'Alias'} } );

    ok( 1, "shop deleted" );
}

sub testDeleteShopRef {

    $ShopConfigService->deleteShopRef( { 'Alias' => $options->{'Alias'} } );

    ok( 1, "shop ref deleted" );
}

sub testExists {
    my ($expected) = @_;

    my $result = $ShopConfigService-> exists( { 'Alias' => $options->{'Alias'} } )->result;

    is( $result, $expected, "exists?" );
}

# run test suite
deleteIfExists();
testCreate();
testExists(1);
testGetInfo(0);
testGetAllInfo();
testUpdate();
testGetInfo(1);
testDelete();
testExists(1);
testDeleteShopRef();
testExists(0);
