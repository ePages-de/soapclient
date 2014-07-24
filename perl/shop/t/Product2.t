use strict;
use utf8;
use Test::More tests => 52;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( cmpDateTime );


my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductService/2007/07' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

my $hOptions = {
    'Alias' => 'perl_test-1',
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
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 123, 'TaxModel' => 'gross', },
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
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 123.5, 'TaxModel' => 'gross', },
    ],
    'AvailabilityDate' => '2005-12-24T18:00:00',
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

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], ['AvailabilityDate'], ['de', 'en'] )->result;
    is( scalar @$ahResults, 1, "getInfo result count" );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, "getInfo: no error" );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, "product path" );

    my $hResult = $ahResults->[0];
    my $hReference = $alreadyUpdated ? $Product_update : $Product_in;

    # convert localized value from array to hash (languge code => value)
    my @LocAttributeNames = qw( Name LongDescription AvailabilityComment );
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
    ok( $LocResult{'AvailabilityComment'}{'de'} eq $LocReference{'AvailabilityComment'}{'de'}, "attribute AvailabilityComment in language DE is correct" );
    ok( $LocResult{'AvailabilityComment'}{'en'} eq $LocReference{'AvailabilityComment'}{'en'}, "attribute AvailabilityComment in language EN is correct" );

    # convert prices to hash (CurrencyID => value)
    my $MapSub = sub {
        return map { defined $_->{'Price'} ? ($_->{'CurrencyID'} => $_->{'Price'}) : () } @_;
    };
    my %ResultPrices = $MapSub->( @{$hResult->{'ProductPrices'}} );
    my %RefPrices = $MapSub->( @{$hReference->{'ProductPrices'}} );
    is_deeply( \%ResultPrices, \%RefPrices, 'updated price' );

    is( 0, cmpDateTime($hResult->{'AvailabilityDate'}, $hReference->{'AvailabilityDate'}), "updated availability date" );
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

# run test suite
deleteIfExists();
testCreate();
testExists(1);
testFind();
testGetInfo(0);
testUpdate();
testGetInfo(1);
testDelete();
testExists(0);
