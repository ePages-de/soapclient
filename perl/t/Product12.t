use strict;
use utf8;
use Test::More tests => 176;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH WEBSERVICE_SHOP_NAME);
use WebServiceTools qw( cmpDateTime GetFileContent );


my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductService/2014/04' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

my $hOptions = {
    'Alias' => 'perl_test-9',
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
    'Text' => [
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
    'MainCharacteristics' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('EiFon lila 128GB'),
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('iiFon purple 128GB'),
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
    'EcoParticipationPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 7, 'TaxModel' => 'gross', },
    ],
    'ShippingMethods' => [
        { 'Path' => 'ShippingMethods/Post' },
        { 'Path' => 'ShippingMethods/Express' },
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
    'MainCharacteristics' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('EiFon rosa 64GB'),
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('iiFon pink 64GB'),
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
    'EcoParticipationPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 7.5, 'TaxModel' => 'gross', },
    ],
    'ShippingMethods' => [
        { 'Path' => 'ShippingMethods/PickupByCustomer' },
        { 'Path' => 'ShippingMethods/Express', 'delete' => 1 },
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
    'Text' => [
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

#Variation with wrong super product (points to a variation)
my $Product_var3 = {
    'Alias' => $hOptions->{'Alias'}.'-var3',
    'Class' => 'ProductTypes/Shoe',
    'TaxClass' => '/TaxMatrixGermany/normal',

    #variation settings
    'SuperProduct' => $hOptions->{'FullPath'}.'/SubProducts/'.$Product_var2->{'Alias'},
    'VariationAttributes' => [
        {
            'Name' => 'USSize',
            'Value' => '12',
            'Type' => 'String',
        },
    ],
};

#Variation within variations to set as sub product (should not work)
my $Product_var4 = {
    'Path' => $hOptions->{'FullPath'},

    'SuperProduct' => 'Products/md_49412090',
    'VariationAttributes' => [
        {
            'Name' => 'USSize',
            'Value' => '13',
            'Type' => 'String',
        },
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
    ok( scalar @$ahResults == 1, "create result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "create: no error" );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, "product alias" );
    ok( $hResult->{'created'} == 1, "created?" );
}

sub testUpdate {

    my $aProducts = [$Product_update];

    my $ahResults = $ProductService->update( $aProducts )->result;
    ok( scalar @$ahResults == 1, "update result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "update: no error" );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, "product path" );
    ok( $hResult->{'updated'} == 1, "updated?" );
}

sub testUpdateError {

    my $aProducts = [$Product_update];
    $aProducts->[0]->{'StockLevelAlert'} = 0;

    my $ahResults = $ProductService->update( $aProducts )->result;
    ok( scalar @$ahResults == 1, "update result count" );

    my $hResult = $ahResults->[0];
    ok( $hResult->{'Error'}, "update: error" );
    ok( $hResult->{'Error'}->{'Message'} =~ /FLOAT_TO_SMALL.*StockLevelAlert/, "update: error message FLOAT_TO_SMALL StockLevelAlert" );
    ok( !$hResult->{'updated'}, "updated?" );
}

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], ['AvailabilityDate','Date'], ['de', 'en'] )->result;
    ok( scalar @$ahResults == 1, "getInfo result count" );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, "getInfo: no error" );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );

    my $hResult = $ahResults->[0];
    my $hReference = $Product_in;
       $hReference = $Product_update if $alreadyUpdated;

    # convert localized value from array to hash (languge code => value)
    my @LocAttributeNames = qw(
        Name Text Title
        AvailabilityComment
        URI CanonicalURL
        MainCharacteristics
    );
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
    ok( $LocResult{'Text'}{'en'} eq $LocReference{'Text'}{'en'}, "Text (en)" );
    ok( $LocResult{'Text'}{'de'} eq $LocReference{'Text'}{'de'}, "Text (de)" );
    ok( $LocResult{'Title'}{'en'} eq $LocReference{'Title'}{'en'}, "updated title (en)" );
    ok( $LocResult{'Title'}{'de'} eq $LocReference{'Title'}{'de'}, "updated title (de)" );
    ok( $LocResult{'AvailabilityComment'}{'de'} eq $LocReference{'AvailabilityComment'}{'de'}, "attribute AvailabilityComment in language DE is correct" );
    ok( $LocResult{'AvailabilityComment'}{'en'} eq $LocReference{'AvailabilityComment'}{'en'}, "attribute AvailabilityComment in language EN is correct" );
    ok( $LocResult{'MainCharacteristics'}{'de'} eq $LocReference{'MainCharacteristics'}{'de'}, "attribute AvailabilityComment in language DE is correct" );
    ok( $LocResult{'MainCharacteristics'}{'en'} eq $LocReference{'MainCharacteristics'}{'en'}, "attribute AvailabilityComment in language EN is correct" );

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

    %ResultPrices = $MapSub->( @{$hResult->{'EcoParticipationPrices'}} );
    %RefPrices = $MapSub->( @{$hReference->{'EcoParticipationPrices'}} );
    is_deeply( \%ResultPrices, \%RefPrices, 'updated eco participation' );

    ok( $hResult->{'DeliveryPeriod'} eq $hReference->{'DeliveryPeriod'}, "product delivery period" );

    ok( scalar @{$hResult->{'ShippingMethods'}} == 2, "result count shipping methods" );
    my %shippingPaths;
    @shippingPaths{map{$_->{'Path'}}@{$hResult->{'ShippingMethods'}}} = (1,1);

    if ( $alreadyUpdated ) {
        ok( !$hResult->{'AvailabilityDate'}, "deleted date attribute" );
        ok( $shippingPaths{WEBSERVICE_SHOP_PATH.'ShippingMethods/Post'}, 'do not touch shipping path 1' );
        ok( $shippingPaths{WEBSERVICE_SHOP_PATH.'ShippingMethods/PickupByCustomer'}, 'added new shipping path' );
        ok( !$shippingPaths{WEBSERVICE_SHOP_PATH.'ShippingMethods/Express'}, 'deleted shipping path' );
    } else {
        ok( 0 == cmpDateTime($hResult->{'AvailabilityDate'}, $hReference->{'AvailabilityDate'}), "created date attribute" );
        ok( $shippingPaths{WEBSERVICE_SHOP_PATH.'ShippingMethods/Post'}, 'created shipping path 1' );
        ok( $shippingPaths{WEBSERVICE_SHOP_PATH.'ShippingMethods/Express'}, 'created shipping path 2' );
    }

    ok( $hResult->{'IsAvailable'} == $Product_in->{'IsAvailable'}->value, "attribute IsAvailable is correct" );

    ok( $hResult->{'TaxClass'}  eq $Product_in->{'TaxClass'}, "tax class" );
    ok( $hResult->{'IsVisible'} == $Product_in->{'IsVisible'}->value, "is visible" );
    ok( $hResult->{'OrderUnit'} eq $Product_in->{'OrderUnit'}, "order unit" );
}

sub deleteIfExists {

    my $ahResults = $ProductService->exists( [$hOptions->{'FullPath'}] )->result;

    return unless $ahResults->[0]->{'exists'};

    $ProductService->delete( [$hOptions->{'FullPath'}] );
}

sub testDelete {

    my $ahResults = $ProductService->delete( [$hOptions->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, "delete result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "delete: no error" );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, "product path" );
    ok( $hResult->{'deleted'} == 1, "deleted?" );
}

sub testExists {
    my ($exists) = @_;

    my $ahResults = $ProductService->exists( [$hOptions->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, "exists result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "exists: no error" );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, "product path" );
    ok( $hResult->{'exists'} == $exists, "exists?" );
}

sub testFindByAlias {

    my $aResults = $ProductService->find( {'Alias' => $hOptions->{'Alias'}} )->result;
    is( scalar @$aResults, 1, "find result count" );

    is( $aResults->[0], WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );
}

sub testFindByLastUpdate {
    my $aResults = $ProductService->find( {'LastUpdate' => '1976-01-01T00:00:00'} )->result;
    ok( scalar @$aResults > 0, "find result count" );
    ok( defined $aResults->[0], "product path" );
}

sub testFindAll {

    my $aResults = $ProductService->find()->result;
    is( scalar @$aResults, 80, "find all result count" );

    my @sortResults = sort @$aResults;
    my $ProductPath = WEBSERVICE_SHOP_PATH.'Products';
    is( $sortResults[0], "$ProductPath/be_40401", "1. search result path" );
    is( $sortResults[10], "$ProductPath/be_40401/SubProducts/be_4040104007", "1. search result on 2nd page" );
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

my $Content = GetFileContent('../../TestData/ProductImageService/be_40401_blue.jpg');
my $Product_down_upload = { %Product,
    'IsDownloadProduct' => SOAP::Data->type('boolean')->value(1),
    'MaxDownloadTime'   => 5,
    'MaxDownloadCount'  => 3,
    'DownloadProductMaps' => [
        {
            'IsExternal' => SOAP::Data->type('boolean')->value(0),
            'FileName'   => 'image_download.jpg',
            'FileContent'=> SOAP::Data->type( 'base64' => $Content ),
            'Position'   => 10,
        }
    ],
};

my $Product_down_empty = { %Product,
    'IsDownloadProduct' => SOAP::Data->type('boolean')->value(1),
    'MaxDownloadTime'   => 5,
    'MaxDownloadCount'  => 3,
};



sub testCreateDownload {

    my $aProducts = [$Product_down];

    my $ahResults = $ProductService->create( $aProducts )->result;
    ok( scalar @$ahResults == 1, "create result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "create: no error" );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, "product alias" );
    ok( $hResult->{'created'} == 1, "created?" );

}


sub testGetInfoDownload {

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], [], ['de', 'en'] )->result;
    ok( scalar @$ahResults == 1, "getInfo result count" );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, "getInfo: no error" );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );

    my $hResult = $ahResults->[0];
    my $hReference = $Product_down;

    foreach my $Attr qw(IsDownloadProduct) {
        ok( $hResult->{$Attr} == $hReference->{$Attr}->value, "soap attribute $Attr is correct" );
    }

    foreach my $Attr qw(MaxDownloadTime MaxDownloadCount) {
        ok( $hResult->{$Attr} == $hReference->{$Attr}, "int attribute $Attr is correct" );
    }

    my $hRefeMap = $hReference->{'DownloadProductMaps'}->[0];
    my $hProductMap = $hResult->{'DownloadProductMaps'}->[0];
    ok( $hProductMap->{'Position'} eq $hRefeMap->{'Position'}, "Position is correct" );
    ok( $hProductMap->{'TargetUrl'} eq $hRefeMap->{'FileName'}, "TargetUrl is correct" );

    ok( $hResult->{'URI'}, 'generated URI' );

}


sub testCreateDownload_empty {

    my $aProducts = [$Product_down_empty];

    my $ahResults = $ProductService->create( $aProducts )->result;
    ok( scalar @$ahResults == 1, "create result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "create: no error" );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, "product alias" );
    ok( $hResult->{'created'} == 1, "created?" );

}

sub testGetInfoDownload_empty {

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], [], ['de', 'en'] )->result;
    ok( scalar @$ahResults == 1, "getInfo result count" );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, "getInfo: no error" );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );

    my $hResult = $ahResults->[0];
    my $hReference = $Product_down;

}

sub testCreateDownload_upload {

    my $aProducts = [$Product_down_upload];

    my $ahResults = $ProductService->create( $aProducts )->result;
    ok( scalar @$ahResults == 1, "create result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "create: no error" );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, "product alias" );
    ok( $hResult->{'created'} == 1, "created?" );

}


sub testGetInfoDownload_upload {

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], [], ['de', 'en'] )->result;
    ok( scalar @$ahResults == 1, "getInfo result count" );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, "getInfo: no error" );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );

    my $hResult = $ahResults->[0];
    my $hReference = $Product_down_upload;

}

sub testGetInfoVariations {

    my @Products = (
    	"$hOptions->{'FullPath'}/SubProducts/$Product_var1->{'Alias'}",
    	"$hOptions->{'FullPath'}/SubProducts/$Product_var2->{'Alias'}",
    	$hOptions->{'FullPath'}
    );

    my $ahResults = $ProductService->getInfo( \@Products )->result;

    my $hSub1 = $ahResults->[0];
    is $hSub1->{'DefaultSubProduct'}, undef, 'Sub.DefaultSubProduct';
    is scalar @{$hSub1->{'SubProducts'}}, 0, 'Sub.SubProducts count';

	is scalar @{ $hSub1->{'VariationAttributes'} }, 1, 'Sub.VariationAttributes count';
	is $hSub1->{'VariationAttributes'}->[0]->{'Name'}, 'USSize', 'Sub.VariationAttribute name';
	is $hSub1->{'VariationAttributes'}->[0]->{'Value'}, '10', 'Sub.VariationAttribute value';

    my $hMaster = $ahResults->[2];
    is $hMaster->{'DefaultSubProduct'}, WEBSERVICE_SHOP_PATH."$hOptions->{'FullPath'}/SubProducts/$Product_var1->{'Alias'}", 'Master.DefaultSubProduct';
    is scalar @{$hMaster->{'SubProducts'}}, 2, 'Master.SubProducts count';
    is $hMaster->{'SubProducts'}->[0], WEBSERVICE_SHOP_PATH."$hOptions->{'FullPath'}/SubProducts/$Product_var1->{'Alias'}", 'Master.SubProducts[0]';
    is $hMaster->{'SubProducts'}->[1], WEBSERVICE_SHOP_PATH."$hOptions->{'FullPath'}/SubProducts/$Product_var2->{'Alias'}", 'Master.SubProducts[1]';

	is scalar @{ $hMaster->{'VariationAttributes'} }, 1, 'Master.VariationAttributes count';
	is $hMaster->{'VariationAttributes'}->[0]->{'Name'}, 'USSize', 'Master.VariationAttribute name';
	is $hMaster->{'VariationAttributes'}->[0]->{'Value'}, '6,10', 'Master.VariationAttribute value';
}

sub testCreateVariations {

    my $aProducts = [$Product_var1, $Product_var2];

    my $ahResults = $ProductService->create( $aProducts )->result;
    ok( scalar @$ahResults == 2, "create variation result count" );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, "create: no error" );

}

sub testCreateWrongVariations {

    #try to create a variation with another variation as parent
    my $ahResults = $ProductService->create([$Product_var3])->result;
    ok( scalar @$ahResults == 1, "create wrong variation result count" );
    ok( $ahResults->[0]->{'Error'}, "create wrong variation: error" );
    ok( $ahResults->[0]->{'Error'}->{'Message'} =~ /is a variation.*can't be a master product/, "create wrong variation: error message = variation can't be a master product" );

    #try to set a master product (within variation) as an sub product
    $ahResults = $ProductService->update([$Product_var4])->result;
    ok( scalar @$ahResults == 1, "update wrong variation result count" );
    #check super product
    $ahResults = $ProductService->getInfo([$Product_var4->{'Path'}])->result;
    ok( !$ahResults->[0]->{'SuperProduct'}, "super product not changed" );

}



# run test suite
deleteIfExists();
testCreate();
testExists(1);
testFindByAlias();
testFindByLastUpdate();
testGetInfo(0);
testUpdate();
testGetInfo(1);
testUpdateError();
testCreateVariations();
testGetInfoVariations();
testCreateWrongVariations();
testDelete();
testExists(0);
testCreateDownload();
testExists(1);
testGetInfoDownload();
testDelete();
testExists(0);
testCreateDownload_empty();
testExists(1);
testGetInfoDownload_empty();
testDelete();
testExists(0);
testCreateDownload_upload();
testExists(1);
testGetInfoDownload_upload();
testDelete();
testExists(0);
testFindAll();

