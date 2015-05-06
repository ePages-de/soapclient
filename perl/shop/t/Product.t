use strict;
use utf8;
use Test::More tests => 42;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( cmpDateTime );

my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductService/2005/01' )
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
        { 'CurrencyID' => 'EUR', 'Price' => 146.37, 'TaxModel' => 'gross', },
    ],
    'Attributes' => [
        {
            'Name'  => 'AvailabilityDate',
            'Value' => '2005-12-24T10:00:00+01:00',
        },
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
            'Value' => SOAP::Data->type('string')->value('geändert Test-Hauptprodukt')
        },
        {
            'LanguageCode' => 'en',
            'Value' => SOAP::Data->type('string')->value('updated test master product')
        }
    ],
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 123.5, 'TaxModel' => 'gross', },

    ],
    'Attributes' => [
        {
            'Name'  => 'AvailabilityDate',
            'Value' => '2005-12-24T18:00:00+01:00',
        },
    ],
};

my $Product_update1 = {
    'Path' => $hOptions->{'FullPath'},
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => undef, 'TaxModel' => 'gross', },

    ],
};

my $Product_update2 = {
    'Path' => $hOptions->{'FullPath'},
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => undef, 'TaxModel' => 'gross', },

    ],
};

my $Product_update3 = {
    'Path' => $hOptions->{'FullPath'},
    'ProductPrices' => [
        { 'CurrencyID' => 'EUR', 'Price' => 123.5, 'TaxModel' => 'gross', },

    ],
};




sub testCreate {

    my $aProducts = [$Product_in];

    my $ahResults = $ProductService->create( $aProducts )->result;
    is( scalar @$ahResults, 1, 'create result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'create: no error' );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, 'product alias' );
    is( $hResult->{'created'}, 1, 'created?' );
}

sub testUpdate {

    my $aProducts = [$Product_update];

    my $ahResults = $ProductService->update( $aProducts )->result;
    is( scalar @$ahResults, 1, 'update result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'update: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    is( $hResult->{'updated'}, 1, 'updated?' );
}

sub testUpdate1 {

    my $aProducts = [$Product_update1];

    my $ahResults = $ProductService->update( $aProducts )->result;
    is( scalar @$ahResults, 1, 'update1 result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'update1: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    is( $hResult->{'updated'}, 1, 'updated?' );
}
sub testUpdate2 {

    my $aProducts = [$Product_update2];

    my $ahResults = $ProductService->update( $aProducts )->result;
    is( scalar @$ahResults, 1, 'update2 result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'update1: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    is( $hResult->{'updated'}, 1, 'updated?' );
}

sub testUpdate3 {

    my $aProducts = [$Product_update3];

    my $ahResults = $ProductService->update( $aProducts )->result;
    is( scalar @$ahResults, 1, 'update3 result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'update3: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    is( $hResult->{'updated'}, 1, 'updated?' );
}

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], ['AvailabilityDate'], ['de', 'en'] )->result;
    is( scalar @$ahResults, 1, 'getInfo result count' );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, 'getInfo: no error' );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, 'product path' );

    my $hResult = $ahResults->[0];
    my $hReference = $alreadyUpdated ? $Product_update : $Product_in;

    # convert localized value from array to hash (languge code => value)
    my @LocAttributeNames = qw(Name);
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
        if ( $Attribute->{'Type'} eq 'LocalizedString' ||
             $Attribute->{'Type'} eq 'LocalizedFile')
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

    ok( $LocResult{'Name'}{'en'} eq $LocReference{'Name'}{'en'}, 'updated name (en)' );
    ok( $LocResult{'Name'}{'de'} eq $LocReference{'Name'}{'de'}, 'updated name (de)' );

    # convert prices to hash (CurrencyID => value)
    my $MapSub = sub {
        return map { defined $_->{'Price'} ? ($_->{'CurrencyID'} => $_->{'Price'}) : () } @_;
    };
    my %ResultPrices = $MapSub->( @{$hResult->{'ProductPrices'}} );
    my %RefPrices = $MapSub->( @{$hReference->{'ProductPrices'}} );
    is_deeply( \%ResultPrices, \%RefPrices, 'updated price' );

    is( 0, cmpDateTime($hResult->{'Attributes'}->[0]->{'Value'}, $hReference->{'Attributes'}->[0]->{'Value'}), 'updated availability date' );

    ok( $hResult->{'TaxClass'}  eq $Product_in->{'TaxClass'}, 'tax class' );
    is( $hResult->{'IsVisible'}, $Product_in->{'IsVisible'}->value, 'is visible' );
    ok( $hResult->{'OrderUnit'} eq $Product_in->{'OrderUnit'}, 'order unit' );
}

sub deleteIfExists {

    my $ahResults = $ProductService->exists( [$hOptions->{'FullPath'}] )->result;

    return unless $ahResults->[0]->{'exists'};

    $ProductService->delete( [$hOptions->{'FullPath'}] );
}

sub testDelete {

    my $ahResults = $ProductService->delete( [$hOptions->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, 'delete result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'delete: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    is( $hResult->{'deleted'}, 1, 'deleted?' );
}

sub testExists {
    my ($exists) = @_;

    my $ahResults = $ProductService->exists( [$hOptions->{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, 'exists result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'exists: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    is( $hResult->{'exists'}, $exists, 'exists?' );
}

sub testFind {

    my $aResults = $ProductService->find( {'Alias' => $hOptions->{'Alias'}} )->result;
    is( scalar @$aResults, 1, 'find result count' );

    ok( $aResults->[0] eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, 'product path' );
}

# run test suite
deleteIfExists();
testCreate();
testExists(1);
testFind();
testGetInfo(0);
testUpdate();
testUpdate1();
testUpdate2();
testUpdate3();
testGetInfo(1);
testDelete();
testExists(0);
