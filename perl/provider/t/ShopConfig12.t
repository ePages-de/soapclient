use strict;
use Test::More tests => 49;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );

# Create a SOAP::Lite client object
my $ShopConfigService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ShopConfigService/2017/11' )
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
    'SecondaryDomains' => ['secondary-domain-1', 'secondary-domain-2'],
    'IsTrialShop' => 1,
    'IsInternalTestShop' => 0,
    'MerchantLogin' => 'max',
    'MerchantEMail' => 'max@nowhere.de',
    'MerchantPassword' => '123456',
    'ShopAddress_FirstName' => 'Karl',
    'ShopAddress_LastName' => 'Kaufmann',
    'ShopAddress_CountryID' => 276,
    'ShopAddress_Street' => 'Heinrich-Heine-Str. 1',
    'ShopAddress_Zipcode' => '07743',
    'ShopAddress_City' => 'Jena',
    'ShopAddress_State' => 'TH',
    'Name' => 'iFrig Shopping'
};

my $Shop_update = {
    'Alias' => $options->{'Alias'},
    'MarkedForDelete' => 1,
    'DomainName' => 'test-domain-1-new',
    'SecondaryDomains' => ['secondary-domain-1-new', 'secondary-domain-2-new'],
    'ShopAlias' => 'perl_test-shop-alias-1-new',
    'NewAlias' => 'perl_test-1-new',
    'MerchantLogin' => 'gabi',
    'MerchantEMail' => 'gabi@nowhere.de',
    'MerchantPassword' => '654321',
    'ShopAddress_FirstName' => 'Gabi',
    'ShopAddress_LastName' => 'Kauffrau',
    'ShopAddress_CountryID' => 840,
    'ShopAddress_Street' => '61 Greenpoint Ave. #642',
    'ShopAddress_Zipcode' => '11222',
    'ShopAddress_City' => 'Brooklyn',
    'ShopAddress_State' => 'NY',
    'Name' => 'epages.com'
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

    ok( 1, 'created?' );
}

sub testUpdate {

    $ShopConfigService->update( $Shop_update );

    ok( 1, 'shop updated' );
}

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my @Attributes = qw(WebUrl WebUrlAdmin);
    my $Alias = $alreadyUpdated ? $Shop_update->{'NewAlias'} : $options->{'Alias'};
    my $hResult = $ShopConfigService->getInfo( { 'Alias' => $Alias, 'Attributes'=>\@Attributes, 'Languages'=>[] } )->result;

    my %Attributes = map { $_->{'Name'} => $_->{'Value'} } @{$hResult->{Attributes}};

    if ($alreadyUpdated) {
        ok( $hResult->{'MarkedForDelOn'}, 'marked for delete');
        is( $hResult->{'ObjectPath'}, '/Shops/' . $Shop_update->{'ShopAlias'}, 'store object path changed');
        is( $hResult->{'MerchantLogin'}, $Shop_update->{'MerchantLogin'}, 'MerchantLogin updated');
        is( $hResult->{'MerchantEMail'}, $Shop_update->{'MerchantEMail'}, 'MerchantEMail updated');
        is( $hResult->{'ShopAddress_FirstName'}, $Shop_update->{'ShopAddress_FirstName'}, 'ShopAddress_FirstName updated');
        is( $hResult->{'ShopAddress_LastName'}, $Shop_update->{'ShopAddress_LastName'}, 'ShopAddress_LastName updated');
        is( $hResult->{'ShopAddress_CountryID'}, $Shop_update->{'ShopAddress_CountryID'}, 'ShopAddress_CountryID updated');
        is( $hResult->{'ShopAddress_Street'}, $Shop_update->{'ShopAddress_Street'}, 'ShopAddress_Street updated');
        is( $hResult->{'ShopAddress_Zipcode'}, $Shop_update->{'ShopAddress_Zipcode'}, 'ShopAddress_Zipcode updated');
        is( $hResult->{'ShopAddress_City'}, $Shop_update->{'ShopAddress_City'}, 'ShopAddress_City updated');
        is( $hResult->{'ShopAddress_State'}, $Shop_update->{'ShopAddress_State'}, 'ShopAddress_State updated');
        is( $hResult->{'ShopAddress_EMail'}, $Shop_update->{'MerchantEMail'}, 'ShopAddress_EMail updated');
        is( $hResult->{'Name'}, $Shop_update->{'Name'}, 'Name updated');
        is( $Attributes{'WebUrl'}, "http://$Shop_update->{'DomainName'}/epages/$Shop_in->{'Database'}.sf", 'attribute WebUrl' );
        is( $Attributes{'WebUrlAdmin'}, "http://$Shop_update->{'DomainName'}/epages/$Shop_in->{'Database'}.admin", 'attribute WebUrl' );
        is_deeply( $hResult->{'SecondaryDomains'}, $Shop_update->{'SecondaryDomains'}, 'SecondaryDomains updated' );
    }
    else {
        is( $hResult->{'ShopType'}, $Shop_in->{'ShopType'}, 'ShopType' );
        is( $hResult->{'DomainName'}, $Shop_in->{'DomainName'}, 'DomainName' );
        is_deeply( $hResult->{'SecondaryDomains'}, $Shop_in->{'SecondaryDomains'}, 'SecondaryDomains' );
        ok( $hResult->{'IsTrialShop'}, 'updated IsTrialShop' );
        ok( !$hResult->{'IsInternalTestShop'}, 'updated IsInternalTestShop' );
        ok( !$hResult->{'MarkedForDelOn'}, 'not marked for delete');
        is( $hResult->{'ObjectPath'}, '/Shops/' . $options->{'Alias'}, 'store object path doesnt change' );
        is( $hResult->{'MerchantLogin'}, $Shop_in->{'MerchantLogin'}, 'MerchantLogin set on create');
        is( $hResult->{'MerchantEMail'}, $Shop_in->{'MerchantEMail'}, 'MerchantEMail set on create');
        is( $hResult->{'ShopAddress_FirstName'}, $Shop_in->{'ShopAddress_FirstName'}, 'ShopAddress_FirstName set on create');
        is( $hResult->{'ShopAddress_LastName'}, $Shop_in->{'ShopAddress_LastName'}, 'ShopAddress_LastName set on create');
        is( $hResult->{'ShopAddress_CountryID'}, $Shop_in->{'ShopAddress_CountryID'}, 'ShopAddress_CountryID set on create');
        is( $hResult->{'ShopAddress_Street'}, $Shop_in->{'ShopAddress_Street'}, 'ShopAddress_Street set on create');
        is( $hResult->{'ShopAddress_Zipcode'}, $Shop_in->{'ShopAddress_Zipcode'}, 'ShopAddress_Zipcode set on create');
        is( $hResult->{'ShopAddress_City'}, $Shop_in->{'ShopAddress_City'}, 'ShopAddress_City set on create');
        is( $hResult->{'ShopAddress_State'}, $Shop_in->{'ShopAddress_State'}, 'ShopAddress_State set on create');
        is( $hResult->{'ShopAddress_EMail'}, $Shop_in->{'MerchantEMail'}, 'ShopAddress_EMail set on create');
        is( $hResult->{'Name'}, $Shop_in->{'Name'}, 'Name set on create');
        is( $Attributes{'WebUrl'}, "http://$Shop_in->{'DomainName'}/epages/$Shop_in->{'Database'}.sf", 'updated attribute WebUrl' );
        is( $Attributes{'WebUrlAdmin'}, "http://$Shop_in->{'DomainName'}/epages/$Shop_in->{'Database'}.admin", 'updated attribute WebUrl' );
    }
    ok( $hResult->{'Database'} eq $Shop_in->{'Database'}, 'Database' );
}

sub testGetAllInfo {

    my $ahResult = $ShopConfigService->getAllInfo()->result;

    ok( scalar @$ahResult > 0, 'GetAllInfo result set' );
}

sub testDelete {

    $ShopConfigService->delete( { 'Alias' => $Shop_update->{'ShopAlias'} } );

    ok( 1, 'shop deleted' );
}

sub testDeleteShopRef {

    $ShopConfigService->deleteShopRef( { 'Alias' => $Shop_update->{'NewAlias'} } );

    ok( 1, 'shop ref deleted' );
}

sub testSetSecondaryDomains {

    my $Domains = ['epages.com', 'epages.de'];
    my $Alias = $Shop_update->{'NewAlias'};

    my $hOptions = { 'Alias' => $Alias };
    $ShopConfigService->setSecondaryDomains( $hOptions, [@$Domains] );
    my $hInfo = $ShopConfigService->getInfo( $hOptions )->result;

    is_deeply($hInfo->{'SecondaryDomains'}, $Domains, 'setSecondaryDomains');
}

sub testExists {
    my ($expected) = @_;

    my $result = $ShopConfigService->exists( { 'Alias' => $options->{'Alias'} } )->result;

    is( $result, $expected, 'exists?' );
}

sub testExistsUpdated {
    my ($expected) = @_;

    my $result = $ShopConfigService->exists( { 'Alias' => $Shop_update->{'NewAlias'} } )->result;

    is( $result, $expected, 'exists?' );
}

sub testDefaultDatabase {

    # create a shop in the default database
    my $Shop_options = {
        'Alias' => $options->{'Alias'},
        'Database' => undef,
        'ImportFiles' => [],
        'ShopAlias' => $options->{'Alias'},
        'ShopType' => 'ECom100',
        'DomainName' => 'test-domain-1',
        'IsTrialShop' => 1,
        'IsInternalTestShop' => 0,
    };
    my $ShopID = $ShopConfigService->create( $Shop_options );
    ok( $ShopID > 0, 'created in default database' );

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
testSetSecondaryDomains();
testDelete();
testExistsUpdated(1);
testDeleteShopRef();
testExistsUpdated(0);
testDefaultDatabase();
