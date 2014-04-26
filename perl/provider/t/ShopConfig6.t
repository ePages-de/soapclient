use strict;
use Test::More tests => 28;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );

# Create a SOAP::Lite client object
my $ShopConfigService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ShopConfigService/2009/09' )
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
    'MerchantLogin' => 'max',
    'MerchantEMail' => 'max@nowhere.de',
    'MerchantPassword' => '123456',
};

my $Shop_update = {
    'Alias' => $options->{'Alias'},
    'MarkedForDelete' => 1,
    'DomainName' => 'test-domain-1-new',
    'ShopAlias' => 'perl_test-shop-alias-1-new',
    'NewAlias' => 'perl_test-1-new',
    'MerchantLogin' => 'gabi',
    'MerchantEMail' => 'gabi@nowhere.de',
    'MerchantPassword' => '654321',
};

sub deleteIfExists {

    if( $ShopConfigService->exists( { 'Alias' => $options->{'Alias'} } )->result ) {
        $ShopConfigService->deleteShopRef( { 'Alias' => $options->{'Alias'} } );
    }

    if( $ShopConfigService->exists( { 'Alias' => $Shop_update->{'NewAlias'} } )->result ) {
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

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my @Attributes = qw(WebUrl WebUrlAdmin);
    my $Alias = $alreadyUpdated ? $Shop_update->{'NewAlias'} : $options->{'Alias'};
    my $hResult = $ShopConfigService->getInfo( { 'Alias' => $Alias, 'Attributes'=>\@Attributes, 'Languages'=>[] } )->result;

	my %Attributes = map { $_->{'Name'} => $_->{'Value'} } @{$hResult->{Attributes}};

    if ($alreadyUpdated) {
        ok( $hResult->{'MarkedForDelOn'}, "marked for delete");
        is( $hResult->{'ObjectPath'}, '/Shops/' . $Shop_update->{'ShopAlias'}, "store object path changed");
        is( $hResult->{'MerchantLogin'}, $Shop_update->{'MerchantLogin'}, "MerchantLogin updated");
        is( $hResult->{'MerchantEMail'}, $Shop_update->{'MerchantEMail'}, "MerchantEMail updated");
        is( $Attributes{'WebUrl'}, "http://$Shop_update->{'DomainName'}/epages/$Shop_in->{'Database'}.sf", "attribute WebUrl" );
        is( $Attributes{'WebUrlAdmin'}, "http://$Shop_update->{'DomainName'}/epages/$Shop_in->{'Database'}.admin", "attribute WebUrl" );
    }
    else {
        is( $hResult->{'ShopType'}, $Shop_in->{'ShopType'}, "ShopType" );
        is( $hResult->{'DomainName'}, $Shop_in->{'DomainName'}, "DomainName" );
        ok( $hResult->{'IsTrialShop'}, "updated IsTrialShop" );
        ok( !$hResult->{'IsInternalTestShop'}, "updated IsInternalTestShop" );
        ok( !$hResult->{'MarkedForDelOn'}, "not marked for delete");
        is( $hResult->{'ObjectPath'}, '/Shops/' . $options->{'Alias'}, "store object path doesnt change" );
        is( $hResult->{'MerchantLogin'}, $Shop_in->{'MerchantLogin'}, "MerchantLogin set on create");
        is( $hResult->{'MerchantEMail'}, $Shop_in->{'MerchantEMail'}, "MerchantEMail set on create");
        is( $Attributes{'WebUrl'}, "http://$Shop_in->{'DomainName'}/epages/$Shop_in->{'Database'}.sf", "updated attribute WebUrl" );
        is( $Attributes{'WebUrlAdmin'}, "http://$Shop_in->{'DomainName'}/epages/$Shop_in->{'Database'}.admin", "updated attribute WebUrl" );
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

    ok( $result == $expected, "exists?" );
}

sub testExistsUpdated {
    my ($expected) = @_;

    my $result = $ShopConfigService->exists( { 'Alias' => $Shop_update->{'NewAlias'} } )->result;

    ok( $result == $expected, "exists?" );
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
