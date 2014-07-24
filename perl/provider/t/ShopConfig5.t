use strict;
use Test::More tests => 20;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );

# Create a SOAP::Lite client object
my $ShopConfigService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ShopConfigService/2009/04' )
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
    'IsTrialShop' => 1,
    'IsInternalTestShop' => 0,
};

my $Shop_update = {
    'Alias' => $options->{'Alias'},
    'MarkedForDelete' => 1,
    'ShopAlias' => 'perl_test-shop-alias-1-new',
    'NewAlias' => 'perl_test-1-new'
};

sub deleteIfExists {

    if( $ShopConfigService->exists( { 'Alias' => $options->{'Alias'} } )->result ) {
        $ShopConfigService->delete( { 'Alias' => $options->{'Alias'} } );
        $ShopConfigService->deleteShopRef( { 'Alias' => $options->{'Alias'} } );
    }
    if( $ShopConfigService->exists( { 'Alias' => $Shop_update->{'NewAlias'} } )->result ) {
        $ShopConfigService->delete( { 'Alias' => $Shop_update->{'NewAlias'} } );
        $ShopConfigService->deleteShopRef( { 'Alias' => $Shop_update->{'NewAlias'} } );
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

use Data::Dumper;

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my @Attributes = qw(WebUrl WebUrlAdmin);
    my $hResult;
    if ($alreadyUpdated){
    	$hResult = $ShopConfigService->getInfo( { 'Alias' => $Shop_update->{'NewAlias'}, 'Attributes'=>\@Attributes, 'Languages'=>[] } )->result;
    }
    else{
    	$hResult = $ShopConfigService->getInfo( { 'Alias' => $options->{'Alias'}, 'Attributes'=>\@Attributes, 'Languages'=>[] } )->result;
	}

    if ($alreadyUpdated) {

        ok( $hResult->{'MarkedForDelOn'}, "marked for delete");
        ok( $hResult->{'ObjectPath'} eq '/Shops/' . $Shop_update->{'ShopAlias'}, "store object path changed");
    } else {
        ok( $hResult->{'ShopType'} eq $Shop_in->{'ShopType'}, "ShopType" );
        ok( $hResult->{'DomainName'} eq $Shop_in->{'DomainName'}, "DomainName" );
        ok( $hResult->{'IsTrialShop'}, "updated IsTrialShop" );
        ok( !$hResult->{'IsInternalTestShop'}, "updated IsInternalTestShop" );
        ok( !$hResult->{'MarkedForDelOn'}, "not marked for delete");
        ok( $hResult->{'ObjectPath'} eq '/Shops/' . $options->{'Alias'}, "store object path doesnt change" );
    }
    ok( $hResult->{'Database'} eq $Shop_in->{'Database'}, "Database" );
}

sub testGetAllInfo {

    my $ahResult = $ShopConfigService->getAllInfo()->result;

    ok( scalar @$ahResult > 0, "GetAllInfo result set" );
}

sub testDelete {

    $ShopConfigService->delete( { 'Alias' => $Shop_update->{'ShopAlias'} } );

    ok( 1, "shop deleted" );
}

sub testDeleteShopRef {

    $ShopConfigService->deleteShopRef( { 'Alias' => $Shop_update->{'NewAlias'} } );

    ok( 1, "shop ref deleted" );
}

sub testExists {
    my ($expected) = @_;

    my $result = $ShopConfigService->exists( { 'Alias' => $options->{'Alias'} } )->result;

    is( $result, $expected, "exists?" );
}

sub testExistsUpdated {
    my ($expected) = @_;

    my $result = $ShopConfigService->exists( { 'Alias' => $Shop_update->{'NewAlias'} } )->result;

    is( $result, $expected, "exists?" );
}

sub testDefaultDatabase {

    # create a shop in the default database
    my $Shop_in = {
        'Alias' => $options->{'Alias'},
        'Database' => undef,
        'ImportFiles' => [],
        'ShopAlias' => $options->{'Alias'},
        'ShopType' => 'ECom100',
        'DomainName' => 'test-domain-1',
        'IsTrialShop' => 1,
        'IsInternalTestShop' => 0,
    };
    my $ShopID = $ShopConfigService->create( $Shop_in );
    ok( $ShopID > 0, "created in default database" );

    # test in which database the shop was actually created
    my $hResult = $ShopConfigService->getInfo( { 'Alias' => $options->{'Alias'} } )->result;
    ok( defined $hResult->{'Database'}, "shop was created in database $hResult->{'Database'}" );

    # delete the shop completely
    $ShopConfigService->deleteShopRef( { 'Alias' => $options->{'Alias'} } );
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
testExistsUpdated(1);
testDeleteShopRef();
testExistsUpdated(0);
testDefaultDatabase();
