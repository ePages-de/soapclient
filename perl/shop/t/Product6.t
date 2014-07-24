use strict;
use utf8;
use Test::More tests => 98;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH WEBSERVICE_SHOP_NAME);
use WebServiceTools qw( cmpDateTime );


my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductService/2010/10' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

my $hOptions = {
    'Alias' => 'perl_test-6',
    'Path'  => 'Products',
};
$hOptions->{'FullPath'} = $hOptions->{'Path'}.'/'.$hOptions->{'Alias'};

my $Product_in = {
    'Alias' => $hOptions->{'Alias'},
    'Class' => 'ProductTypes/Shoe',
    'Name' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('Test-Hauptprodukt')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('test master product')
        }
    ],
    'LongDescription' => [
        {
            'LanguageCode' => 'de',
            'Value' => SOAP::Data->type('string')->value('Test-Hauptprodukt Beschreibung')
        },
        {
            'LanguageCode' => 'en',
            'Value' => SOAP::Data->type('string')->value('test master product long description')
        }
    ],
    'Title' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('Test-Pagetitle')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('test page title')
        }
    ],
    'TaxClass' => '/TaxMatrixGermany/normal',
    'IsVisible' => SOAP::Data->type('boolean')->value(1),
    'IsNew' => SOAP::Data->type('boolean')->value(1),
    'OrderUnit' => '/Units/piece',
    'PriceQuantity' => 1,
    'MinOrder' => 1,
    'IntervalOrder' => 1,
    'WeightUnit' => '/Units/gram',
    'Weight' => 240,
    'RefUnit' => 'Units/gram/kilogram',
    'RefAmount' => 1,
    'RefContentAmount' => 0.240,
    'StockLevel' => 123,
    'StockLevelAlert' => 100,
    'DeliveryPeriod' => 'asap',
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 123, 'TaxModel' => 'gross', },
    ],
    'ManufacturerPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 150, 'TaxModel' => 'gross', },
    ],
    'DepositPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 5, 'TaxModel' => 'gross', },
    ],
    'PrepaymentPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 10, 'TaxModel' => 'gross', },
    ],
    'AvailabilityDate' => '2005-12-24T10:00:00',
    'IsAvailable' => SOAP::Data->type('boolean')->value(1),
    'AvailabilityComment' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('Das Produkt xyz ist zur Zeit nicht lieferbar.')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('The product xyz is not available right now.')
        }
    ],
    'URI' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('soapPerl-01-de')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('soapPerl-01-en')
        }
    ],
    'Attributes' => [
        {
            'Name' => 'Keywords',
            'LocalizedValues' => [
                { 'LanguageCode' => 'de', 'Value' => 'keyword_de' },
                { 'LanguageCode' => 'en', 'Value' => 'keyword_en' },
            ],
            'Type' => 'LocalizedString',
        },
        {
            'Name' => 'InstructionManual',
            'LocalizedValues' => [
                { 'LanguageCode' => 'de', 'Value' => 'file_de.pdf' },
                { 'LanguageCode' => 'en', 'Value' => 'file_en.pdf' },
            ],
            'Type' => 'LocalizedFile',
        },
    ],
};

my $Product_update = {
    'Path' => $hOptions->{'FullPath'},
    'Name' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('geaendert Test-Hauptprodukt')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('updated test master product')
        }
    ],
    'Title' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('geaendert Test-Pagetitle')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('updated test page title')
        }
    ],
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 123.5, 'TaxModel' => 'gross', },
    ],
    'ManufacturerPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 150.5, 'TaxModel' => 'gross', },
    ],
    'DepositPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 5.5, 'TaxModel' => 'gross', },
    ],
    'PrepaymentPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 10.5, 'TaxModel' => 'gross', },
    ],
    'AvailabilityDate' => undef,
    'DeliveryPeriod' => 'as soon as possible',
    'AvailabilityComment' => [
        {
                'LanguageCode' => 'de',
                'Value' => SOAP::Data->type('string')->value('Das Produkt xyz ist im Moment nicht lieferbar.')
        },
        {
                'LanguageCode' => 'en',
                'Value' => SOAP::Data->type('string')->value('The product xyz is not available at the moment.')
        }
    ],
    'URI' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('soapPerl-01u-de')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('soapPerl-01u-en')
        }
    ],
    'LongDescription' => [
        {
            'LanguageCode' => 'de',
            'Value' => SOAP::Data->type('string')->value('Test-Hauptprodukt Beschreibung modifiziert')
        },
        {
            'LanguageCode' => 'en',
            'Value' => SOAP::Data->type('string')->value('test master product long description updated')
        }
    ],
};

my $Product_var1 = {
    'Alias' => $hOptions->{'Alias'}.'-var1',
    'Class' => 'ProductTypes/Shoe',
    'Name' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('Test-Produktvariante1')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('test sub product 1')
        }
    ],
    'TaxClass' => '/TaxMatrixGermany/normal',
    'IsVisible' => SOAP::Data->type('boolean')->value(1),
    'StockLevel' => 155,

    #variation settings
    'IsDefault' => SOAP::Data->type('boolean')->value(1),
    'SuperProduct' => $hOptions->{'FullPath'},
    'VariationAttributes' => [
        {
            'Name' => 'USSize',
            'Value' => '10',
            'Type' => 'String',
        },
    ],
    'HasSubOwnPrices' => SOAP::Data->type('boolean')->value(1),
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 155, 'TaxModel' => 'gross', },
    ],
};

my $Product_var2 = {
    'Alias' => $hOptions->{'Alias'}.'-var2',
    'Class' => 'ProductTypes/Shoe',
    'Name' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('Test-Produktvariante2')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('test sub product 2')
        }
    ],
    'TaxClass' => '/TaxMatrixGermany/normal',
    'IsVisible' => SOAP::Data->type('boolean')->value(1),
    'StockLevel' => 66,

    #variation settings
    'SuperProduct' => $hOptions->{'FullPath'},
    'VariationAttributes' => [
        {
            'Name' => 'USSize',
            'Value' => '6',
            'Type' => 'String',
        },
    ],
    'HasSubOwnPrices' => SOAP::Data->type('boolean')->value(1),
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 66, 'TaxModel' => 'gross', },
    ],
};

# get domain name from provisioning service
my $DomainName;
eval {
    my $WS_URL = WEBSERVICE_URL; $WS_URL =~ s/Store/Site/;
    $DomainName = WebServiceClient
    ->proxy( $WS_URL )->xmlschema( '2001' )
    ->uri( 'urn://epages.de/WebService/ShopConfigService/2007/03' )
    ->userinfo( '/Providers/Distributor/Users/admin:admin' )
    ->getInfo({'Alias'=>WEBSERVICE_SHOP_NAME})->result->{'DomainName'};
};

sub testCreate {

    my $aProducts = [$Product_in];

    my $ahResults = $ProductService->create( $aProducts )->result;
    is( scalar @$ahResults, 1, "create result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "create: no error" );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, "product alias" );
    is( $hResult->{'created'}, 1, "created?" );
}

sub testUpdate {

    my $aProducts = [$Product_update];

    my $ahResults = $ProductService->update( $aProducts )->result;
    is( scalar @$ahResults, 1, "update result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "update: no error" );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, "product path" );
    is( $hResult->{'updated'}, 1, "updated?" );
}

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], ['AvailabilityDate','Date'], ['de', 'en'] )->result;
    is( scalar @$ahResults, 1, "getInfo result count" );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, "getInfo: no error" );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );

    my $hResult = $ahResults->[0];
    my $hReference = $alreadyUpdated ? $Product_update : $Product_in;

    # convert localized value from array to hash (languge code => value)
    my @LocAttributeNames = qw( Name LongDescription Title AvailabilityComment URI CanonicalURL );
    my %LocResult; my %LocReference;
    foreach my $AttributeName (@LocAttributeNames) {
        foreach my $hAttribute (@{$hResult->{$AttributeName}}) {
          $LocResult{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'};
        }
        foreach my $hAttribute (@{$hReference->{$AttributeName}}) {
          $LocReference{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'}->value();
        }
    }

    # convert localized value from array to hash (languge code => value) for attributes
    foreach my $Attribute (@{$hResult->{'Attributes'}}) {
        if ( $Attribute->{'Type'} eq "LocalizedString" ||
             $Attribute->{'Type'} eq "LocalizedFile")
        {
            my $AttributeName = $Attribute->{'Name'};
            foreach my $hAttribute (@{$hResult->{$AttributeName}}) {
              $LocResult{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'};
            }
            foreach my $hAttribute (@{$hReference->{$AttributeName}}) {
              $LocReference{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'}->value();
            }
        }
    }

    ok( $LocResult{'Name'}{'en'} eq $LocReference{'Name'}{'en'}, "updated name (en)" );
    ok( $LocResult{'Name'}{'de'} eq $LocReference{'Name'}{'de'}, "updated name (de)" );
    ok( $LocResult{'LongDescription'}{'en'} eq $LocReference{'LongDescription'}{'en'}, "LongDescription (en)" );
    ok( $LocResult{'LongDescription'}{'de'} eq $LocReference{'LongDescription'}{'de'}, "LongDescription (de)" );
    ok( $LocResult{'Title'}{'en'} eq $LocReference{'Title'}{'en'}, "updated title (en)" );
    ok( $LocResult{'Title'}{'de'} eq $LocReference{'Title'}{'de'}, "updated title (de)" );
    ok( $LocResult{'AvailabilityComment'}{'de'} eq $LocReference{'AvailabilityComment'}{'de'}, "attribute AvailabilityComment in language DE is correct" );
    ok( $LocResult{'AvailabilityComment'}{'en'} eq $LocReference{'AvailabilityComment'}{'en'}, "attribute AvailabilityComment in language EN is correct" );

    ok( $LocResult{'URI'}{'de'} eq $LocReference{'URI'}{'de'}, "attribute URI in language DE is correct" );
    ok( $LocResult{'URI'}{'en'} eq $LocReference{'URI'}{'en'}, "attribute URI in language EN is correct" );

    if ( $DomainName ) {
        # these tests only work if the shop has its own domain name
        like( $LocResult{'CanonicalURL'}{'de'}, qr/.*($LocReference{'URI'}{'de'})$/, "attribute URI ist end part of CanonicalURL in language DE" );
        like( $LocResult{'CanonicalURL'}{'en'}, qr/.*($LocReference{'URI'}{'en'})$/, "attribute URI ist end part of CanonicalURL in language EN" );
    } else {
        #dummi tests if domain name missig
        like( '',qr//,"skip CanonicalURL de test, because missing individual domain name");
        like( '',qr//,"skip CanonicalURL en test, because missing individual domain name");
    }

    # convert prices to hash (CurrencyID => value)
    my $MapSub = sub {
        return map { defined $_->{'Price'} ? ($_->{'CurrencyID'} => $_->{'Price'}) : () } @_;
    };
    my %ResultPrices = $MapSub->( @{$hResult->{'ProductPrices'}} );
    my %RefPrices = $MapSub->( @{$hReference->{'ProductPrices'}} );
    is_deeply( \%ResultPrices, \%RefPrices, 'updated price' );

    %ResultPrices = $MapSub->( @{$hResult->{'ManufacturerPrices'}} );
    %RefPrices = $MapSub->( @{$hReference->{'ManufacturerPrices'}} );
    is_deeply( \%ResultPrices, \%RefPrices, 'updated manufacturer price' );

    %ResultPrices = $MapSub->( @{$hResult->{'DepositPrices'}} );
    %RefPrices = $MapSub->( @{$hReference->{'DepositPrices'}} );
    is_deeply( \%ResultPrices, \%RefPrices, 'updated deposit price' );

    %ResultPrices = $MapSub->( @{$hResult->{'PrepaymentPrices'}} );
    %RefPrices = $MapSub->( @{$hReference->{'PrepaymentPrices'}} );
    is_deeply( \%ResultPrices, \%RefPrices, 'updated manufacturer price' );

    ok( $hResult->{'DeliveryPeriod'} eq $hReference->{'DeliveryPeriod'}, "product delivery period" );

    if ( $alreadyUpdated ) {
        ok( !$hResult->{'AvailabilityDate'}, "deleted date attribute" );
    } else {
        is( 0, cmpDateTime($hResult->{'AvailabilityDate'}, $hReference->{'AvailabilityDate'}), "created date attribute" );
    }

    is( $hResult->{'IsAvailable'}, $Product_in->{'IsAvailable'}->value, "attribute IsAvailable is correct" );

    ok( $hResult->{'TaxClass'}  eq $Product_in->{'TaxClass'}, "tax class" );
    is( $hResult->{'IsVisible'}, $Product_in->{'IsVisible'}->value, "is visible" );
    ok( $hResult->{'OrderUnit'} eq $Product_in->{'OrderUnit'}, "order unit" );
}

sub deleteIfExists {

    my $ahResults = $ProductService->exists( [$hOptions->{'FullPath'}] )->result;

    return unless $ahResults->[0]->{'exists'};

    $ProductService->delete( [$hOptions->{'FullPath'}] );
}

sub testDelete {

    my $ahResults = $ProductService->delete( [$hOptions->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, "delete result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "delete: no error" );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, "product path" );
    is( $hResult->{'deleted'}, 1, "deleted?" );
}

sub testExists {
    my ($exists) = @_;

    my $ahResults = $ProductService->exists( [$hOptions->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, "exists result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "exists: no error" );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, "product path" );
    is( $hResult->{'exists'}, $exists, "exists?" );
}

sub testFind {

    my $aResults = $ProductService->find( {'Alias' => $hOptions->{'Alias'}} )->result;
    is( scalar @$aResults, 1, "find result count" );

    ok( $aResults->[0] eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );
}


my %Product = %$Product_in;
my $Product_down = { %Product,
    'IsDownloadProduct' => SOAP::Data->type('boolean')->value(1),
    'MaxDownloadTime'   => 5,
    'MaxDownloadCount'  => 3,
    'DownloadProductMaps' => [
        {
            'IsExternal' => SOAP::Data->type('boolean')->value(1),
            'FileName'   => 'http://www.epages.com/de/download/de-epages6-SEO.pdf',
            'Position'   => 10,
        }
    ],
};


sub testCreateDownload {

    my $aProducts = [$Product_down];

    my $ahResults = $ProductService->create( $aProducts )->result;
    is( scalar @$ahResults, 1, "create result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "create: no error" );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, "product alias" );
    is( $hResult->{'created'}, 1, "created?" );
}


sub testGetInfoDownload {

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], [], ['de', 'en'] )->result;
    is( scalar @$ahResults, 1, "getInfo result count" );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, "getInfo: no error" );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );

    my $hResult = $ahResults->[0];
    my $hReference = $Product_down;

    foreach my $Attr qw(IsDownloadProduct) {
        is( $hResult->{$Attr}, $hReference->{$Attr}->value, "soap attribute $Attr is correct" );
    }

    foreach my $Attr qw(MaxDownloadTime MaxDownloadCount) {
        is( $hResult->{$Attr}, $hReference->{$Attr}, "int attribute $Attr is correct" );
    }

    my $hRefeMap = $hReference->{'DownloadProductMaps'}->[0];
    my $hProductMap = $hResult->{'DownloadProductMaps'}->[0];
    ok( $hProductMap->{'Position'} eq $hRefeMap->{'Position'}, "Position is correct" );
    ok( $hProductMap->{'TargetUrl'} eq $hRefeMap->{'FileName'}, "TargetUrl is correct" );

}


sub testCreateVariations {

    my $aProducts = [$Product_var1, $Product_var2];

    my $ahResults = $ProductService->create( $aProducts )->result;
    is( scalar @$ahResults, 2, "create variation result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "create: no error" );

}




# run test suite
deleteIfExists();
testCreate();
testExists(1);
testFind();
testGetInfo(0);
testUpdate();
testGetInfo(1);
testCreateVariations();
testDelete();
testExists(0);
testCreateDownload();
testExists(1);
testGetInfoDownload();
testDelete();
testExists(0);
