use strict;
use Test::More tests => 86;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );

my $ALIAS = 'perl_test-1';
my $NEW_ALIAS = 'perl_test-1-new';
my $DATABASE = 'Store'; # default database

sub Init {
    Cleanup();
}

sub Cleanup {
    deleteIfExists( $ALIAS );
    deleteIfExists( $NEW_ALIAS );
}

sub deleteIfExists {
    my ($Alias) = @_;

    my $ShopConfigService = WebServiceClient
        ->uri( 'urn://epages.de/WebService/ShopConfigService/2009/09' )
        ->proxy( WEBSERVICE_URL )
        ->xmlschema( '2001' );
    $ShopConfigService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

    if( $ShopConfigService->exists( { 'Alias' => $Alias } )->result ) {
        $ShopConfigService->deleteShopRef( { 'Alias' => $Alias } );
    }
}

sub TestSuite {

    # Create a SOAP::Lite client object
    my $SimpleProvisioningService = WebServiceClient
        ->uri( 'urn://epages.de/WebService/SimpleProvisioningService/2014/11' )
        ->proxy( WEBSERVICE_URL )
        ->xmlschema( '2001' );
    $SimpleProvisioningService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

    # create with all data
    my $Shop_in = {
        'Alias' => $ALIAS,
        'ShopType' => 'ECom100',
        'IsClosed' => 1,
        'IsTrialShop' => 1,
        'IsInternalTestShop' => 1,
        'DomainName' => 'test-domain-1',
        'HasSSLCertificate' => 0,
        'MerchantLogin' => 'max',
        'MerchantPassword' => '123456',
        'MerchantEMail' => 'max@nowhere.de',
        'AdditionalAttributes' => [
            {   'Name' => 'Channel',
                'Type' => 'String',
                'Value' => 'MailingCampaign'
            },
        ]
    };
    my $Result = $SimpleProvisioningService->create( $Shop_in )->result;
    is( $Result, undef, "create" );

    my $exists = $SimpleProvisioningService->exists( { 'Alias' => $ALIAS } )->result;
    ok( $exists, "exists" );

    my $hResult = $SimpleProvisioningService->getInfo( { 'Alias' => $ALIAS } )->result;
    is( $hResult->{'Alias'}, $Shop_in->{'Alias'}, "Alias created");
    is( $hResult->{'ShopType'}, $Shop_in->{'ShopType'}, "ShopType created");
    is( $hResult->{'Database'}, $DATABASE, "Database created");
    is( $hResult->{'IsClosed'}, $Shop_in->{'IsClosed'}, "IsClosed created");
    ok( !$hResult->{'IsDeleted'},  "IsDeleted created");
    is( $hResult->{'IsTrialShop'},$Shop_in->{'IsTrialShop'}, "IsTrialShop created");
    is( $hResult->{'IsInternalTestShop'}, $Shop_in->{'IsInternalTestShop'}, "IsInternalTestShop created");
    is( $hResult->{'DomainName'}, $Shop_in->{'DomainName'}, "DomainName created" );
    is( $hResult->{'HasSSLCertificate'}, $Shop_in->{'HasSSLCertificate'}, "HasSSLCertificate created" );
    is( $hResult->{'MerchantLogin'}, $Shop_in->{'MerchantLogin'}, "MerchantLogin created");
    is( $hResult->{'MerchantEMail'}, $Shop_in->{'MerchantEMail'}, "MerchantEMail created");
    ok( !$hResult->{'IsMarkedForDel'}, "IsMarkedForDel created");
    is( $hResult->{'StorefrontURL'}, "http://$Shop_in->{'DomainName'}/epages/$Shop_in->{'Alias'}.sf", "StorefrontURL created");
    like( $hResult->{'BackofficeURL'}, qr!http(s?)://$Shop_in->{'DomainName'}/epages/$Shop_in->{'Alias'}.admin!, "BackofficeURL created");
    is( $hResult->{'LastMerchantLoginDate'}, undef, "LastMerchantLoginDate created");
    #check additional attribute
    ok( scalar $hResult->{'AdditionalAttributes'} > 0, "AdditionalAttributes");
    my $hRefAttr = $Shop_in->{AdditionalAttributes}->[0];
    my($hAttr) = grep {$_->{Name} eq $hRefAttr->{Name}} @{$hResult->{'AdditionalAttributes'}};
    ok( $hAttr->{Name} eq $hRefAttr->{Name} , "AdditionalAttributes $hAttr->{Name} created");
    ok( $hAttr->{Value} eq $hRefAttr->{Value} , "AdditionalAttributes $hAttr->{Value}");
    ok( $hAttr->{Type} eq $hRefAttr->{Type} , "AdditionalAttributes $hAttr->{Type}");

    # update the shop
    my $Shop_update = {
        'Alias' => $ALIAS,
        'ShopType' => 'ECom5000',
        'IsClosed' => 1,
        'IsTrialShop' => 1,
        'IsInternalTestShop' => 1,
        'DomainName' => 'test-domain-1-new',
        'HasSSLCertificate' => 0,
        'MerchantLogin' => 'gabi',
        'MerchantPassword' => '654321',
        'MerchantEMail' => 'gabi@nowhere.de',

        'AdditionalAttributes' => [
            {   'Name' => 'Channel',
                'Type' => 'String',
                'Value' => 'Phone-Campaign'
            },
            {   'Name' => 'SetupFee',
                'Type' => 'Float',
                'Value' => 12.67
            }
        ]
    };
    $SimpleProvisioningService->update( $Shop_update );

    $hResult = $SimpleProvisioningService->getInfo( { 'Alias' => $ALIAS } )->result;
    is( $hResult->{'Alias'}, $ALIAS, "Alias has not changed on update");
    is( $hResult->{'ShopType'}, $Shop_update->{'ShopType'}, "ShopType updated");
    is( $hResult->{'Database'}, $DATABASE, "Database updated");
    ok( $hResult->{'IsClosed'}, "IsClosed updated");
    ok( !$hResult->{'IsDeleted'}, "IsDeleted updated");
    ok( $hResult->{'IsTrialShop'}, "IsTrialShop updated");
    ok( $hResult->{'IsInternalTestShop'}, "IsInternalTestShop updated");
    is( $hResult->{'DomainName'}, $Shop_update->{'DomainName'}, "DomainName updated" );
    is( $hResult->{'MerchantLogin'}, $Shop_update->{'MerchantLogin'}, "MerchantLogin updated");
    is( $hResult->{'MerchantEMail'}, $Shop_update->{'MerchantEMail'}, "MerchantEMail updated");
    is( $hResult->{'LastMerchantLoginDate'}, undef, "LastMerchantLoginDate updated");
    ok( !$hResult->{'IsMarkedForDel'}, "IsMarkedForDel updated");
    is( $hResult->{'StorefrontURL'}, "http://$Shop_update->{'DomainName'}/epages/$Shop_update->{'Alias'}.sf", "StorefrontURL updated");
    like( $hResult->{'BackofficeURL'}, qr!http(s?)://$Shop_update->{'DomainName'}/epages/$Shop_update->{'Alias'}.admin!, "BackofficeURL updated");

    #check added additional attribute
    ok( scalar $hResult->{'AdditionalAttributes'} > 1, "AdditionalAttributes > 1");
    $hRefAttr = $Shop_update->{AdditionalAttributes}->[1];
    ($hAttr) = grep {$_->{Name} eq $hRefAttr->{Name}} @{$hResult->{'AdditionalAttributes'}};
    ok( $hAttr->{Name} eq $hRefAttr->{Name} , "AdditionalAttributes $hAttr->{Name} added");
    ok( $hAttr->{Value} eq $hRefAttr->{Value} , "AdditionalAttributes $hAttr->{Value}");
    ok( $hAttr->{Type} eq $hRefAttr->{Type} , "AdditionalAttributes $hAttr->{Type}");

    #check changed additional attribute
    $hRefAttr = $Shop_update->{AdditionalAttributes}->[0];
    ($hAttr) = grep {$_->{Name} eq $hRefAttr->{Name}} @{$hResult->{'AdditionalAttributes'}};
    ok( $hAttr->{Name} eq $hRefAttr->{Name} , "AdditionalAttributes $hAttr->{Name} changed");
    ok( $hAttr->{Value} eq $hRefAttr->{Value} , "AdditionalAttributes $hAttr->{Value}");
    ok( $hAttr->{Type} eq $hRefAttr->{Type} , "AdditionalAttributes $hAttr->{Type}");

    # rename
    my $Shop_rename = {
        'Alias' => $ALIAS,
        'NewAlias' => $NEW_ALIAS,
    };
    $SimpleProvisioningService->rename( $Shop_rename );

    $exists = $SimpleProvisioningService->exists( { 'Alias' => $ALIAS } )->result;
    ok( !$exists, "old alias no longer exists" );

    $exists = $SimpleProvisioningService->exists( { 'Alias' => $NEW_ALIAS } )->result;
    ok( $exists, "new alias exists" );

    $hResult = $SimpleProvisioningService->getInfo( { 'Alias' => $NEW_ALIAS } )->result;
    is( $hResult->{'Alias'}, $NEW_ALIAS, "Alias renamed");
    is( $hResult->{'ShopType'}, $Shop_update->{'ShopType'}, "ShopType renamed");
    is( $hResult->{'Database'}, $DATABASE, "Database renamed");
    is( $hResult->{'IsClosed'}, $Shop_update->{'IsClosed'}, "IsClosed renamed");
    ok( !$hResult->{'IsDeleted'}, "IsDeleted renamed");
    ok( $hResult->{'IsTrialShop'}, "IsTrialShop renamed");
    ok( $hResult->{'IsInternalTestShop'}, "IsInternalTestShop renamed");
    is( $hResult->{'DomainName'}, $Shop_update->{'DomainName'}, "DomainName renamed" );
    is( $hResult->{'MerchantLogin'}, $Shop_update->{'MerchantLogin'}, "MerchantLogin renamed");
    is( $hResult->{'MerchantEMail'}, $Shop_update->{'MerchantEMail'}, "MerchantEMail renamed");
    is( $hResult->{'LastMerchantLoginDate'}, undef, "LastMerchantLoginDate created");
    ok( !$hResult->{'IsMarkedForDel'}, "IsMarkedForDel renamed");
    is( $hResult->{'StorefrontURL'}, "http://$Shop_update->{'DomainName'}/epages/$Shop_rename->{'NewAlias'}.sf", "StorefrontURL renamed");
    like( $hResult->{'BackofficeURL'}, qr!http(s?)://$Shop_update->{'DomainName'}/epages/$Shop_rename->{'NewAlias'}.admin!, "BackofficeURL renamed");

    # delete
    $SimpleProvisioningService->markForDeletion( { 'Alias' => $NEW_ALIAS } );

    $exists = $SimpleProvisioningService->exists( { 'Alias' => $NEW_ALIAS } )->result;
    ok( $exists, "shop still exists" );

    $hResult = $SimpleProvisioningService->getInfo( { 'Alias' => $NEW_ALIAS } )->result;
    is( $hResult->{'Alias'}, $NEW_ALIAS, "Alias deleted");
    is( $hResult->{'ShopType'}, $Shop_update->{'ShopType'}, "ShopType deleted");
    is( $hResult->{'Database'}, $DATABASE, "Database deleted");
    ok( $hResult->{'IsClosed'}, "IsClosed deleted");
    ok( !$hResult->{'IsDeleted'}, "IsDeleted deleted");
    ok( $hResult->{'IsTrialShop'}, "IsTrialShop deleted");
    ok( $hResult->{'IsInternalTestShop'}, "IsInternalTestShop deleted");
    is( $hResult->{'DomainName'}, $Shop_update->{'DomainName'}, "DomainName deleted" );
    is( $hResult->{'MerchantLogin'}, $Shop_update->{'MerchantLogin'}, "MerchantLogin deleted");
    is( $hResult->{'MerchantEMail'}, $Shop_update->{'MerchantEMail'}, "MerchantEMail deleted");
    ok( $hResult->{'IsMarkedForDel'}, "IsMarkedForDel deleted");

    # create a shop with minimal data
    my $Shop_in_min = {
        'Alias' => $ALIAS,
        'ShopType' => 'ECom100',
    };
    $Result = $SimpleProvisioningService->create( $Shop_in_min )->result;
    is( $Result, undef, "create" );

    $exists = $SimpleProvisioningService->exists( { 'Alias' => $ALIAS } )->result;
    ok( $exists, "exists" );

    $hResult = $SimpleProvisioningService->getInfo( { 'Alias' => $ALIAS } )->result;
    is( $hResult->{'ShopType'}, $Shop_in_min->{'ShopType'}, "ShopType" );
    is( $hResult->{'Database'}, $DATABASE, "Database default");
    ok( !$hResult->{'IsClosed'}, "IsClosed default");
    ok( !$hResult->{'IsDeleted'}, "IsDeleted  default");
    ok( !$hResult->{'IsTrialShop'}, "IsTrialShop default" );
    ok( !$hResult->{'IsInternalTestShop'}, "IsInternalTestShop default" );
    is( $hResult->{'DomainName'}, undef, "DomainName default" );
    ok( !$hResult->{'HasSSLCertificate'}, "HasSSLCertificate default" );
    is( $hResult->{'MerchantLogin'}, 'admin', "MerchantLogin default");
    is( $hResult->{'MerchantEMail'}, undef, "MerchantEMail default");
    is( $hResult->{'LastMerchantLoginDate'}, undef, "LastMerchantLoginDate default");
    ok( !$hResult->{'IsMarkedForDel'}, "IsMarkedForDel default");
    like( $hResult->{'StorefrontURL'}, qr!http(s?)://.+/epages/$Shop_in_min->{'Alias'}.sf!, "StorefrontURL default");
    like( $hResult->{'BackofficeURL'}, qr!http(s?)://.+/epages/$Shop_in_min->{'Alias'}.admin!, "BackofficeURL default");
}

Init();
eval { TestSuite(); };
my $Error = $@;
eval { Cleanup(); };
warn "Error in Cleanup: $@\n" if $@;
die $Error if $Error;
