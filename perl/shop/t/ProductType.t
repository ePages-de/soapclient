use strict;
use utf8;
use Test::More tests => 255;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH);

my $ProductTypeService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductTypeService/2007/10' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductTypeService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

use constant PRODUCTTYPES_PATH         => WEBSERVICE_SHOP_PATH . 'ProductTypes/';
use constant NOT_EXISTING_ALIAS        => 'NotExisting';
use constant NOT_EXISTING_PATH         => PRODUCTTYPES_PATH . NOT_EXISTING_ALIAS;
use constant PERL_TEST1_ALIAS          => 'perlTest1';
use constant PERL_TEST1_PATH           => PRODUCTTYPES_PATH . PERL_TEST1_ALIAS;
use constant PERL_TEST1_NAME_DE        => 'perlTest1DE';
use constant PERL_TEST1_NAME_EN        => 'perlTest1EN';
use constant PERL_TEST1_LAYOUT_BUNDLES => 'BundlesTable';

use constant PERL_TEST2_ALIAS          => 'perlTest2';
use constant PERL_TEST2_PATH           => PRODUCTTYPES_PATH . PERL_TEST2_ALIAS;
use constant PERL_TEST2_NAME_DE        => 'perlTest2DE';
use constant PERL_TEST2_NAME_EN        => 'perlTest2EN';
use constant PERL_TEST2_LAYOUT_BASE    => 'ImageRight';

use constant ATTRIBUTES_PATH     => PERL_TEST1_PATH . '/Attributes/';
use constant ATTRIBUTE1_ALIAS    => 'attribute1';
use constant ATTRIBUTE1_TYPE     => 'LocalizedString';
use constant ATTRIBUTE1_PATH     => ATTRIBUTES_PATH . ATTRIBUTE1_ALIAS;
use constant ATTRIBUTE1_NAME_DE  => 'attribute1DE';
use constant ATTRIBUTE1_NAME_EN  => 'attribute1EN';
use constant ATTRIBUTE1_DESCR_DE => 'attribute1descrDE';
use constant ATTRIBUTE1_DESCR_EN => 'attribute1descrEN';

use constant ATTRIBUTE2_ALIAS    => 'attribute2';
use constant ATTRIBUTE2_PATH     => ATTRIBUTES_PATH . ATTRIBUTE2_ALIAS;
use constant ATTRIBUTE2_TYPE     => 'PreDefString';
use constant ATTRIBUTE2_NAME_DE  => 'attribute2DE';
use constant ATTRIBUTE2_NAME_EN  => 'attribute2EN';
use constant ATTRIBUTE2_DESCR_DE => 'attribute2descrDE';
use constant ATTRIBUTE2_DESCR_EN => 'attribute2descrEN';

use constant PREDEF_ATTRIBUTES_PATH  => ATTRIBUTE2_PATH . '/PreDefAttributes/';
use constant PREDEF_ATTRIBUTE1_ALIAS => 'predef1';
use constant PREDEF_ATTRIBUTE1_PATH  => PREDEF_ATTRIBUTES_PATH . PREDEF_ATTRIBUTE1_ALIAS;
use constant PREDEF_ATTRIBUTE1_NAME  => 'predef1Name';
use constant PREDEF_ATTRIBUTE2_ALIAS => 'predef2';
use constant PREDEF_ATTRIBUTE2_PATH  => PREDEF_ATTRIBUTES_PATH . PREDEF_ATTRIBUTE2_ALIAS;
use constant PREDEF_ATTRIBUTE2_NAME  => 'predef2Name';

#---------------------------------------------------------------------------------------------------
sub testGetBaseProductType {
    my $result = $ProductTypeService->getBaseProductType()->result;
    ok($result eq WEBSERVICE_SHOP_PATH . 'ProductClass', 'getBaseProductType');
}

#---------------------------------------------------------------------------------------------------
sub testCreate {
    my @ProductTypes = (
        {'Alias'                  => PERL_TEST1_ALIAS,
         'Layout.Content-Bundles' => PERL_TEST1_LAYOUT_BUNDLES,
         'Name' => [{'LanguageCode' => 'de', Value => PERL_TEST1_NAME_DE}, {'LanguageCode' => 'en', Value => PERL_TEST1_NAME_EN}]
        },
        {'Alias'               => PERL_TEST2_ALIAS,
         'Layout.Content-Base' => PERL_TEST2_LAYOUT_BASE,
         'Name' => [{'LanguageCode' => 'de', Value => PERL_TEST2_NAME_DE}, {'LanguageCode' => 'en', Value => PERL_TEST2_NAME_EN}]
        }
    );

    my $ahResults = $ProductTypeService->create(\@ProductTypes)->result;
    is(scalar @$ahResults, 2, "create: results count");

    foreach my $hResult(@$ahResults) {
        diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
        ok(!$hResult->{'Error'}, "create: no error");
        ok($hResult->{'created'}, "create: created true");
    }
    ok($ahResults->[0]->{'Alias'} eq PERL_TEST1_ALIAS, "product type alias 1" );
    ok($ahResults->[1]->{'Alias'} eq PERL_TEST2_ALIAS, "product type alias 2" );
}

#---------------------------------------------------------------------------------------------------
sub testGetAllInfo {
    my $baseProductType = $ProductTypeService->getBaseProductType()->result;

    my $ahResults = $ProductTypeService->getAllInfo([], [])->result;

    my ($perlTest1Found, $perlTest2Found, $baseFound) = (0, 0, 0);
    my $ErrorMessage;

    foreach my $hResult(@$ahResults) {
        if( $hResult->{'Error'} ) {
            diag $ErrorMessage = "Error: $hResult->{'Error'}->{'Message'}\n";
            next;
        }

        if ($hResult->{'Alias'} eq PERL_TEST1_ALIAS) {
            $perlTest1Found = 1;
            ok(PERL_TEST1_LAYOUT_BUNDLES eq $hResult->{'Layout.Content-Bundles'}, PERL_TEST1_ALIAS . ' getAllInfo: Layout.Content-Bundles');
            foreach my $hName (@{$hResult->{'Name'}}) {
                if ($hName->{'LanguageCode'} eq 'de') {
                    ok(PERL_TEST1_NAME_DE eq $hName->{'Value'}, PERL_TEST1_ALIAS . ' getAllInfo: name de');
                }
                elsif ($hName->{'LanguageCode'} eq 'en') {
                    ok(PERL_TEST1_NAME_EN eq $hName->{'Value'}, PERL_TEST1_ALIAS . ' getAllInfo: name en');
                }
            }
        }
        elsif ($hResult->{'Alias'} eq PERL_TEST2_ALIAS) {
            $perlTest2Found = 1;
            ok(PERL_TEST2_LAYOUT_BASE eq $hResult->{'Layout.Content-Base'}, PERL_TEST2_ALIAS . ' getAllInfo: Layout.Content-Base');
            foreach my $hName (@{$hResult->{'Name'}}) {
                if ($hName->{'LanguageCode'} eq 'de') {
                    ok(PERL_TEST2_NAME_DE eq $hName->{'Value'}, PERL_TEST2_ALIAS . ' getAllInfo: name de');
                }
                elsif ($hName->{'LanguageCode'} eq 'en') {
                    ok(PERL_TEST2_NAME_EN eq $hName->{'Value'}, PERL_TEST2_ALIAS . ' getAllInfo: name en');
                }
            }
        }
        elsif ($hResult->{'Path'} eq $baseProductType) {
            $baseFound = 1;
        }
    }
    ok(!$ErrorMessage,  'getAllInfo: no error');
    ok($perlTest1Found, 'getAllInfo: ' . PERL_TEST1_ALIAS . ' found');
    ok($perlTest2Found, 'getAllInfo: ' . PERL_TEST2_ALIAS . ' found');
    ok($baseFound, 'getAllInfo: base product type found');
}

#---------------------------------------------------------------------------------------------------
sub testGetInfo {
    my $ahResults = $ProductTypeService->getInfo(
        [PERL_TEST1_PATH, PERL_TEST2_PATH, NOT_EXISTING_PATH],
        ['WebUrl'],
        ['de', 'en']
    )->result;

    is(3, scalar(@$ahResults), 'getInfo: results count');

    # check first created test product type
    ok(!$ahResults->[0]->{'Error'},                                              PERL_TEST1_ALIAS . ' getInfo: no error');
    ok(PERL_TEST1_ALIAS eq $ahResults->[0]->{'Alias'},                           PERL_TEST1_ALIAS . ' getInfo: Alias');
    ok(PERL_TEST1_PATH eq $ahResults->[0]->{'Path'},                             PERL_TEST1_ALIAS . ' getInfo: Path');
    ok(PERL_TEST1_LAYOUT_BUNDLES eq $ahResults->[0]->{'Layout.Content-Bundles'}, PERL_TEST1_ALIAS . ' getInfo: Layout.Content-Bundles');

    foreach my $hName (@{$ahResults->[0]->{'Name'}}) {
        if ($hName->{'LanguageCode'} eq 'de') {
            ok(PERL_TEST1_NAME_DE eq $hName->{'Value'}, PERL_TEST1_ALIAS . ' getInfo: name de');
        }
        elsif ($hName->{'LanguageCode'} eq 'en') {
            ok(PERL_TEST1_NAME_EN eq $hName->{'Value'}, PERL_TEST1_ALIAS . ' getInfo: name en');
        }
    }
    my $ahAttributes = $ahResults->[0]->{'Attributes'};
    is(scalar(@$ahAttributes), 1,              PERL_TEST1_ALIAS . ' getInfo: Attributes');
    ok($ahAttributes->[0]->{'Name'} eq 'WebUrl', PERL_TEST1_ALIAS . ' getInfo: WebUrl Name');
    ok($ahAttributes->[0]->{'Value'} =~ /^http/, PERL_TEST1_ALIAS . ' getInfo: WebUrl Value');

    # check first created test product type
    ok(!$ahResults->[1]->{'Error'},                                        PERL_TEST2_ALIAS . ' getInfo: no error');
    ok(PERL_TEST2_ALIAS eq $ahResults->[1]->{'Alias'},                     PERL_TEST2_ALIAS . ' getInfo: Alias');
    ok(PERL_TEST2_PATH eq $ahResults->[1]->{'Path'},                       PERL_TEST2_ALIAS . ' getInfo: Path');
    ok(PERL_TEST2_LAYOUT_BASE eq $ahResults->[1]->{'Layout.Content-Base'}, PERL_TEST2_ALIAS . ' getInfo: Layout.Content-Base');

    foreach my $hName (@{$ahResults->[1]->{'Name'}}) {
        if ($hName->{'LanguageCode'} eq 'de') {
            ok(PERL_TEST2_NAME_DE eq $hName->{'Value'}, PERL_TEST2_ALIAS . ' getInfo: name de');
        }
        elsif ($hName->{'LanguageCode'} eq 'en') {
            ok(PERL_TEST2_NAME_EN eq $hName->{'Value'}, PERL_TEST2_ALIAS . ' getInfo: name en');
        }
    }
    $ahAttributes = $ahResults->[1]->{'Attributes'};
    is(scalar(@$ahAttributes), 1,              PERL_TEST2_ALIAS . ' getInfo: Attributes');
    ok($ahAttributes->[0]->{'Name'} eq 'WebUrl', PERL_TEST2_ALIAS . ' getInfo: WebUrl Name');
    ok($ahAttributes->[0]->{'Value'} =~ /^http/, PERL_TEST2_ALIAS . ' getInfo: WebUrl Value');

    # 3rd must be error
    ok($ahResults->[2]->{'Error'}, NOT_EXISTING_ALIAS . ' getInfo: error');
}

#---------------------------------------------------------------------------------------------------
sub testExists {
    my $ahResults = $ProductTypeService->exists([PERL_TEST1_PATH, PERL_TEST2_PATH, NOT_EXISTING_PATH])->result;

    is(3, scalar(@$ahResults), 'exists: results count');
    foreach my $hResult (@$ahResults) {
        ok(!$hResult->{'Error'}, 'exists: no error');
    }

    ok(PERL_TEST1_PATH eq $ahResults->[0]->{'Path'},   PERL_TEST1_ALIAS . ' exists: Path');
    ok($ahResults->[0]->{'exists'},                    PERL_TEST1_ALIAS . ' exists: exists true');
    ok(PERL_TEST2_PATH eq $ahResults->[1]->{'Path'},   PERL_TEST2_ALIAS . ' exists: Path');
    ok($ahResults->[1]->{'exists'},                    PERL_TEST2_ALIAS . ' exists: exists true');
    ok(NOT_EXISTING_PATH eq $ahResults->[2]->{'Path'}, NOT_EXISTING_ALIAS . ' exists: Path');
    ok(!$ahResults->[2]->{'exists'},                   NOT_EXISTING_ALIAS . ' exists: exists false');
}

#---------------------------------------------------------------------------------------------------
sub testUpdate {
    my @Update = (
        {'Path'                   => PERL_TEST1_PATH,
         'Layout.Content-Bundles' => 'BundlesList',
         'Name'                   => [{'LanguageCode' => 'de', 'Value' => PERL_TEST1_NAME_DE . 'updated'}]
        },
        {'Path' => NOT_EXISTING_PATH,
        }
    );
    my $ahResults = $ProductTypeService->update(\@Update)->result;
    is(2, scalar(@$ahResults), 'update: results count');
    ok(!$ahResults->[0]->{'Error'}, PERL_TEST1_ALIAS . ' update: no error');
    ok(PERL_TEST1_PATH eq $ahResults->[0]->{'Path'}, PERL_TEST1_ALIAS . ' update: Path');
    ok($ahResults->[1]->{'Error'}, NOT_EXISTING_ALIAS . ' update: error');

    $ahResults = $ProductTypeService->getInfo([PERL_TEST1_PATH], [], ['de', 'en'])->result;
    is(1, scalar(@$ahResults), 'getInfo results count');

    ok(PERL_TEST1_PATH eq $ahResults->[0]->{'Path'},                                            PERL_TEST1_ALIAS . ' getInfo: Path');
    ok(PERL_TEST1_ALIAS eq $ahResults->[0]->{'Alias'},                                          PERL_TEST1_ALIAS . ' getInfo: Alias');
    ok('BundlesList' eq $ahResults->[0]->{'Layout.Content-Bundles'}, PERL_TEST1_ALIAS . ' getInfo: Layout.Content-Bundles');

    my $ahNames = $ahResults->[0]->{'Name'};
    is(2, scalar(@$ahNames),                                     PERL_TEST1_ALIAS . ' getInfo: Names count');
    ok('de' eq $ahNames->[0]->{'LanguageCode'},                    PERL_TEST1_ALIAS . ' getInfo: language code de');
    ok(PERL_TEST1_NAME_DE . 'updated' eq $ahNames->[0]->{'Value'}, PERL_TEST1_ALIAS . ' getInfo: value de');
    ok('en' eq $ahNames->[1]->{'LanguageCode'},                    PERL_TEST1_ALIAS . ' getInfo: language code en');
    ok(PERL_TEST1_NAME_EN eq $ahNames->[1]->{'Value'},             PERL_TEST1_ALIAS . ' getInfo: value en');
}

sub testDelete {
    my $ahResults = $ProductTypeService->delete([PERL_TEST1_PATH, PERL_TEST2_PATH, NOT_EXISTING_PATH])->result;

    is(3, scalar(@$ahResults), 'delete: results count');

    ok(PERL_TEST1_PATH eq $ahResults->[0]->{'Path'}, PERL_TEST1_ALIAS . ' delete: Path');
    ok(!$ahResults->[0]->{'Error'},                  PERL_TEST1_ALIAS . ' delete: no error');
    ok($ahResults->[0]->{'deleted'},                 PERL_TEST1_ALIAS . ' delete: deleted true');

    ok(PERL_TEST2_PATH eq $ahResults->[1]->{'Path'}, PERL_TEST2_ALIAS . ' delete: Path');
    ok(!$ahResults->[1]->{'Error'},                  PERL_TEST2_ALIAS . ' delete: no error');
    ok($ahResults->[1]->{'deleted'},                 PERL_TEST2_ALIAS . ' delete: deleted true');

    ok(NOT_EXISTING_PATH eq $ahResults->[2]->{'Path'}, NOT_EXISTING_ALIAS . ' delete: Path');
    ok($ahResults->[2]->{'Error'},                     NOT_EXISTING_ALIAS . ' delete: error');


    $ahResults = $ProductTypeService->exists([PERL_TEST1_PATH, PERL_TEST2_PATH])->result;
    is(2, scalar(@$ahResults), 'exists: results count');

    ok(PERL_TEST1_PATH eq $ahResults->[0]->{'Path'}, PERL_TEST1_ALIAS . ' exists: Path');
    ok(!$ahResults->[0]->{'Error'},                  PERL_TEST1_ALIAS . ' exists: no error');
    ok(!$ahResults->[0]->{'exists'},                 PERL_TEST1_ALIAS . ' exists: exists false');

    ok(PERL_TEST2_PATH eq $ahResults->[1]->{'Path'}, PERL_TEST2_ALIAS . ' exists: Path');
    ok(!$ahResults->[1]->{'Error'},                  PERL_TEST2_ALIAS . ' exists: no error');
    ok(!$ahResults->[1]->{'exists'},                 PERL_TEST2_ALIAS . ' exists: exists false');
}

#---------------------------------------------------------------------------------------------------
sub testCreateProductAttribute {
    my @Create = (
        {'Alias'        => ATTRIBUTE1_ALIAS,
         'Type'         => ATTRIBUTE1_TYPE,
         'Name'         => [{'LanguageCode' => 'de', 'Value' => ATTRIBUTE1_NAME_DE},
                            {'LanguageCode' => 'en', 'Value' => ATTRIBUTE1_NAME_EN}],
         'Description'  => [{'LanguageCode' => 'de', 'Value' => ATTRIBUTE1_DESCR_DE},
                            {'LanguageCode' => 'en', 'Value' => ATTRIBUTE1_DESCR_EN}],
         'IsVisible'    => 1,
         'IsHTML'       => 1,
         'Position'     => 8192
        },
        {'Alias'        => ATTRIBUTE2_ALIAS,
         'Type'         => ATTRIBUTE2_TYPE,
         'Name'         => [{'LanguageCode' => 'de', 'Value' => ATTRIBUTE2_NAME_DE},
                            {'LanguageCode' => 'en', 'Value' => ATTRIBUTE2_NAME_EN}],
         'Description'  => [{'LanguageCode' => 'de', 'Value' => ATTRIBUTE2_DESCR_DE},
                            {'LanguageCode' => 'en', 'Value' => ATTRIBUTE2_DESCR_EN}],
         'Position'     => 4096
        },
        {'Alias' => 'CurrencyID', # reserved attribute alias
         'Type'  => ATTRIBUTE1_TYPE
        }
    );

    my $hResult = $ProductTypeService->createProductAttribute(PERL_TEST1_PATH, \@Create)->result;
    ok(!$hResult->{'Error'}, 'createProductAttribute: no error');

    my $ahAttributes = $hResult->{'ProductAttributes'};
    is(3, scalar(@$ahAttributes), 'createProductAttribute: results count');

    ok(ATTRIBUTE1_ALIAS eq $ahAttributes->[0]->{'Alias'}, ATTRIBUTE1_ALIAS . ' createProductAttribute: Alias');
    ok(!$ahAttributes->[0]->{'Error'},                    ATTRIBUTE1_ALIAS . ' createProductAttribute: no error');
    ok(ATTRIBUTE1_PATH eq $ahAttributes->[0]->{'Path'},   ATTRIBUTE1_ALIAS . ' createProductAttribute: Path');
    ok($ahAttributes->[0]->{'created'},                   ATTRIBUTE1_ALIAS . ' createProductAttribute: created true');

    ok(ATTRIBUTE2_ALIAS eq $ahAttributes->[1]->{'Alias'}, ATTRIBUTE2_ALIAS . ' createProductAttribute: Alias');
    ok(!$ahAttributes->[1]->{'Error'},                    ATTRIBUTE2_ALIAS . ' createProductAttribute: no error');
    ok(ATTRIBUTE2_PATH eq $ahAttributes->[1]->{'Path'},   ATTRIBUTE2_ALIAS . ' createProductAttribute: Path');
    ok($ahAttributes->[1]->{'created'},                   ATTRIBUTE2_ALIAS . ' createProductAttribute: created true');

    ok('CurrencyID' eq $ahAttributes->[2]->{'Alias'}, 'CurrencyID createProductAttribute: Alias');
    ok($ahAttributes->[2]->{'Error'},                 'CurrencyID createProductAttribute: error');
}

#---------------------------------------------------------------------------------------------------
sub testGetAllProductAttibutesInfo {
    my $hResult = $ProductTypeService->getAllProductAttributesInfo(PERL_TEST1_PATH, ['de', 'en'])->result;
    ok(!$hResult->{'Error'}, 'getAllProductAttributesInfo: no error');

    my ($attribute1Found, $attribute2Found) = (0, 0);

    my $ahAttributes = $hResult->{'ProductAttributes'};
    foreach my $hAttribute(@$ahAttributes) {
        if ($hAttribute->{'Alias'} eq ATTRIBUTE1_ALIAS) {
            $attribute1Found = 1;
            ok(ATTRIBUTE1_PATH eq $hAttribute->{'Path'}, ATTRIBUTE1_ALIAS . ' getAllProductAttributesInfo: Path');
            ok(ATTRIBUTE1_TYPE eq $hAttribute->{'Type'}, ATTRIBUTE1_ALIAS . ' getAllProductAttributesInfo: Type');
            ok($hAttribute->{'IsVisible'},               ATTRIBUTE1_ALIAS . ' getAllProductAttributesInfo: IsVisible');
            ok($hAttribute->{'IsHTML'},                  ATTRIBUTE1_ALIAS . ' getAllProductAttributesInfo: IsHTML');

            foreach my $hName(@{$hAttribute->{'Name'}}) {
                if ('de' eq $hName->{'LanguageCode'}) {
                    ok(ATTRIBUTE1_NAME_DE eq $hName->{'Value'}, ATTRIBUTE1_ALIAS . ' getAllProductAttributesInfo: Name de');
                }
                elsif ('en' eq $hName->{'LanguageCode'}) {
                    ok(ATTRIBUTE1_NAME_EN eq $hName->{'Value'}, ATTRIBUTE1_ALIAS . ' getAllProductAttributesInfo: Name en');
                }
            }

            foreach my $hDescription(@{$hAttribute->{'Description'}}) {
                if ('de' eq $hDescription->{'LanguageCode'}) {
                    ok(ATTRIBUTE1_DESCR_DE eq $hDescription->{'Value'}, ATTRIBUTE1_ALIAS . ' getAllProductAttributesInfo: Description de');
                }
                elsif ('en' eq $hDescription->{'LanguageCode'}) {
                    ok(ATTRIBUTE1_DESCR_EN eq $hDescription->{'Value'}, ATTRIBUTE1_ALIAS . ' getAllProductAttributesInfo: Description en');
                }
            }
        }
        elsif ($hAttribute->{'Alias'} eq ATTRIBUTE2_ALIAS) {
            $attribute2Found = 1;
            ok(ATTRIBUTE2_PATH eq $hAttribute->{'Path'}, ATTRIBUTE2_ALIAS . ' getAllProductAttributesInfo: Path');
            ok(ATTRIBUTE2_TYPE eq $hAttribute->{'Type'}, ATTRIBUTE2_ALIAS . ' getAllProductAttributesInfo: Type');
            ok(!$hAttribute->{'IsVisible'},              ATTRIBUTE2_ALIAS . ' getAllProductAttributesInfo: IsVisible');
            ok(!$hAttribute->{'IsHTML'},                 ATTRIBUTE2_ALIAS . ' getAllProductAttributesInfo: IsHTML');

            foreach my $hName(@{$hAttribute->{'Name'}}) {
                if ('de' eq $hName->{'LanguageCode'}) {
                    ok(ATTRIBUTE2_NAME_DE eq $hName->{'Value'}, ATTRIBUTE2_ALIAS . ' getAllProductAttributesInfo: Name de');
                }
                elsif ('en' eq $hName->{'LanguageCode'}) {
                    ok(ATTRIBUTE2_NAME_EN eq $hName->{'Value'}, ATTRIBUTE2_ALIAS . ' getAllProductAttributesInfo: Name en');
                }
            }

            foreach my $hDescription(@{$hAttribute->{'Description'}}) {
                if ('de' eq $hDescription->{'LanguageCode'}) {
                    ok(ATTRIBUTE2_DESCR_DE eq $hDescription->{'Value'}, ATTRIBUTE2_ALIAS . ' getAllProductAttributesInfo: Description de');
                }
                elsif ('en' eq $hDescription->{'LanguageCode'}) {
                    ok(ATTRIBUTE2_DESCR_EN eq $hDescription->{'Value'}, ATTRIBUTE2_ALIAS . ' getAllProductAttributesInfo: Description en');
                }
            }
        }
    }

    ok($attribute1Found, 'getAllProductAttributesInfo: ' . ATTRIBUTE1_ALIAS. ' found');
    ok($attribute2Found, 'getAllProductAttributesInfo: ' . ATTRIBUTE2_ALIAS. ' found');
}

#---------------------------------------------------------------------------------------------------
sub testGetProductAttributeInfo {
    my $hResult = $ProductTypeService->getProductAttributeInfo(
        PERL_TEST1_PATH,
        [ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS],
        ["en", "de"]
    )->result;

    ok(!$hResult->{'Error'}, 'getProductAttributeInfo: no error');

    my $ahAttributes = $hResult->{'ProductAttributes'};
    is(3, scalar(@$ahAttributes), 'getProductAttributeInfo: results count');

    ok(ATTRIBUTE1_ALIAS eq $ahAttributes->[0]->{'Alias'}, ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Alias');
    ok(!$ahAttributes->[0]->{'Error'},                    ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: no error');
    ok(ATTRIBUTE1_PATH eq $ahAttributes->[0]->{'Path'},   ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Path');
    ok(ATTRIBUTE1_TYPE eq $ahAttributes->[0]->{'Type'},   ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Type');
    ok($ahAttributes->[0]->{'IsVisible'},                 ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: IsVisible');
    ok($ahAttributes->[0]->{'IsHTML'},                    ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: IsHTML');
    is(0, $ahAttributes->[0]->{'Position'} % 10,        ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Position');

    ok(ATTRIBUTE2_ALIAS eq $ahAttributes->[1]->{'Alias'}, ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Alias');
    ok(!$ahAttributes->[1]->{'Error'},                    ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: no error');
    ok(ATTRIBUTE2_PATH eq $ahAttributes->[1]->{'Path'},   ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Path');
    ok(ATTRIBUTE2_TYPE eq $ahAttributes->[1]->{'Type'},   ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Type');
    ok(!$ahAttributes->[1]->{'IsVisible'},                ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: IsVisible');
    ok(!$ahAttributes->[1]->{'IsHTML'},                   ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: IsHTML');
    is(0, $ahAttributes->[1]->{'Position'} % 10,        ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Position');

    ok($ahAttributes->[0]->{'Position'} > $ahAttributes->[1]->{'Position'}, 'getProductAttributeInfo: attributes order');

    ok(NOT_EXISTING_ALIAS eq $ahAttributes->[2]->{'Alias'}, NOT_EXISTING_ALIAS . ' getProductAttributeInfo: Alias');
    ok($ahAttributes->[2]->{'Error'},                       NOT_EXISTING_ALIAS . ' getProductAttributeInfo: error');
}

#---------------------------------------------------------------------------------------------------
sub testExistsProductAttribute {
    my $hResult = $ProductTypeService->existsProductAttribute(
        PERL_TEST1_PATH,
        [ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS]
    )->result;

    ok(!$hResult->{'Error'}, 'existsProductAttribute: no error');

    my $ahAttributes = $hResult->{'ProductAttributes'};
    is(3, scalar(@$ahAttributes), 'existsProductAttribute: results count');

    ok(ATTRIBUTE1_ALIAS eq $ahAttributes->[0]->{'Alias'},   ATTRIBUTE1_ALIAS . ' existsProductAttribute: Alias');
    ok($ahAttributes->[0]->{'exists'},                      ATTRIBUTE1_ALIAS . ' existsProductAttribute: exists true');
    ok(ATTRIBUTE2_ALIAS eq $ahAttributes->[1]->{'Alias'},   ATTRIBUTE2_ALIAS . ' existsProductAttribute: Alias');
    ok($ahAttributes->[1]->{'exists'},                      ATTRIBUTE2_ALIAS . ' existsProductAttribute: exists true');
    ok(NOT_EXISTING_ALIAS eq $ahAttributes->[2]->{'Alias'}, NOT_EXISTING_ALIAS . ' existsProductAttribute: Alias');
    ok(!$ahAttributes->[2]->{'exists'},                     NOT_EXISTING_ALIAS . ' existsProductAttribute: exists false');
}

#---------------------------------------------------------------------------------------------------
sub testUpdateProductAttribute {
    my @Update = (
        {'Alias'       => ATTRIBUTE1_ALIAS,
         'IsHTML'      => 0,
         'Description' => [{'LanguageCode' => 'en', 'Value' => ATTRIBUTE1_DESCR_EN . "updated"}],
         'Position'    => 1
        },
        {'Alias'     => ATTRIBUTE2_ALIAS,
         'IsVisible' => 1,
         'Name'      => [{'LanguageCode' => 'de', 'Value' => ATTRIBUTE2_NAME_DE . "updated"}],
        },
        {'Alias' => NOT_EXISTING_ALIAS
        }
    );

    my $hResult = $ProductTypeService->updateProductAttribute(PERL_TEST1_PATH, \@Update)->result;
    ok(!$hResult->{'Error'}, 'updateProductAttribute: no error');

    my $ahAttributes = $hResult->{'ProductAttributes'};
    is(3, scalar(@$ahAttributes), 'updateProductAttribute: results count');

    ok(ATTRIBUTE1_ALIAS eq $ahAttributes->[0]->{'Alias'}, ATTRIBUTE1_ALIAS . ' updateProductAttribute: Alias');
    ok(!$ahAttributes->[0]->{'Error'},                    ATTRIBUTE1_ALIAS . ' updateProductAttribute: no error');
    ok($ahAttributes->[0]->{'updated'},                   ATTRIBUTE1_ALIAS . ' updateProductAttribute: updated true');

    ok(ATTRIBUTE2_ALIAS eq $ahAttributes->[1]->{'Alias'}, ATTRIBUTE2_ALIAS . ' updateProductAttribute: Alias');
    ok(!$ahAttributes->[1]->{'Error'},                    ATTRIBUTE2_ALIAS . ' updateProductAttribute: no error');
    ok($ahAttributes->[1]->{'updated'},                   ATTRIBUTE2_ALIAS . ' updateProductAttribute: updated true');

    ok(NOT_EXISTING_ALIAS eq $ahAttributes->[2]->{'Alias'}, NOT_EXISTING_ALIAS . ' updateProductAttribute: Alias');
    ok($ahAttributes->[2]->{'Error'}, NOT_EXISTING_ALIAS . ' updateProductAttribute: error');


    $hResult = $ProductTypeService->getProductAttributeInfo(
        PERL_TEST1_PATH,
        [ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS],
        ['en', 'de']
    )->result;
    ok(!$hResult->{'Error'}, 'getProductAttributeInfo: no error');

    $ahAttributes = $hResult->{'ProductAttributes'};
    is(2, scalar(@$ahAttributes), 'getProductAttributeInfo: results count');

    ok(ATTRIBUTE1_ALIAS eq $ahAttributes->[0]->{'Alias'}, ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Alias');
    ok(!$ahAttributes->[0]->{'Error'},                    ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: no error');
    ok(ATTRIBUTE1_PATH eq $ahAttributes->[0]->{'Path'},   ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Path');
    ok($ahAttributes->[0]->{'IsVisible'},                 ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: IsVisible');
    ok(!$ahAttributes->[0]->{'IsHTML'},                   ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: IsHTML');
    is(0, $ahAttributes->[0]->{'Position'} % 10,        ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Position');
    foreach my $hDescription(@{$ahAttributes->[0]->{'Description'}}) {
        if ('de' eq $hDescription->{'LanguageCode'}) {
            ok(ATTRIBUTE1_DESCR_DE eq $hDescription->{'Value'}, ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Description de');
        }
        elsif ('en' eq $hDescription->{'LanguageCode'}) {
            ok(ATTRIBUTE1_DESCR_EN . 'updated' eq $hDescription->{'Value'}, ATTRIBUTE1_ALIAS . ' getProductAttributeInfo: Description en');
        }
    }

    ok(ATTRIBUTE2_ALIAS eq $ahAttributes->[1]->{'Alias'}, ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Alias');
    ok(!$ahAttributes->[1]->{'Error'},                    ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: no error');
    ok(ATTRIBUTE2_PATH eq $ahAttributes->[1]->{'Path'},   ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Path');
    ok($ahAttributes->[1]->{'IsVisible'},                 ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: IsVisible');
    ok(!$ahAttributes->[1]->{'IsHTML'},                   ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: IsHTML');
    is(0, $ahAttributes->[1]->{'Position'} % 10,        ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Position');
    foreach my $hName(@{$ahAttributes->[1]->{'Name'}}) {
        if ('de' eq $hName->{'LanguageCode'}) {
            ok(ATTRIBUTE2_NAME_DE . 'updated' eq $hName->{'Value'}, ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Name de');
        }
        elsif ('en' eq $hName->{'LanguageCode'}) {
            ok(ATTRIBUTE2_NAME_EN eq $hName->{'Value'}, ATTRIBUTE2_ALIAS . ' getProductAttributeInfo: Name en');
        }
    }

    ok($ahAttributes->[0]->{'Position'} < $ahAttributes->[1]->{'Position'}, 'getProductAttributeInfo: attributes order');
}

#---------------------------------------------------------------------------------------------------
sub testDeleteProductAttribute {
    my $hResult = $ProductTypeService->deleteProductAttribute(PERL_TEST1_PATH, [ATTRIBUTE1_ALIAS, NOT_EXISTING_ALIAS])->result;
    ok(!$hResult->{'Error'}, 'deleteProductAttribute: no error');

    my $ahAttributes = $hResult->{'ProductAttributes'};
    is(2, scalar(@$ahAttributes), 'deleteProductAttribute: results count');

    ok(ATTRIBUTE1_ALIAS eq $ahAttributes->[0]->{'Alias'}, ATTRIBUTE1_ALIAS . ' deleteProductAttribute: Alias');
    ok(!$ahAttributes->[0]->{'Error'},                    ATTRIBUTE1_ALIAS . ' deleteProductAttribute: no error');
    ok($ahAttributes->[0]->{'deleted'},                   ATTRIBUTE1_ALIAS . ' deleteProductAttribute: deleted true');

    ok(NOT_EXISTING_ALIAS eq $ahAttributes->[1]->{'Alias'}, NOT_EXISTING_ALIAS . ' deleteProductAttribute: Alias');
    ok($ahAttributes->[1]->{'Error'},                       NOT_EXISTING_ALIAS . ' deleteProductAttribute: error');


    $hResult = $ProductTypeService->existsProductAttribute(PERL_TEST1_PATH, [ATTRIBUTE1_ALIAS])->result;
    ok(!$hResult->{'Error'}, 'existsProductAttribute: no error');

    $ahAttributes = $hResult->{'ProductAttributes'};
    is(1, scalar(@$ahAttributes),                       'existsProductAttribute: results count');
    ok(ATTRIBUTE1_ALIAS eq $ahAttributes->[0]->{'Alias'}, ATTRIBUTE1_ALIAS . ' existsProductAttribute: Alias');
    ok(!$ahAttributes->[0]->{'exists'},                   ATTRIBUTE1_ALIAS . ' existsProductAttribute: exists false');
}

#---------------------------------------------------------------------------------------------------
sub testCreatePreDefAttribute {
    my @Create = (
        {'Alias'       => PREDEF_ATTRIBUTE1_ALIAS,
         'ValueString' => PREDEF_ATTRIBUTE1_NAME,
         'Position'    => 32
        },
        {'Alias'       => PREDEF_ATTRIBUTE2_ALIAS,
         'ValueString' => PREDEF_ATTRIBUTE2_NAME,
         'Position'    => 33
        },
        {'Alias'       => PREDEF_ATTRIBUTE2_ALIAS
        }
    );

    my $hResult = $ProductTypeService->createPreDefAttribute(ATTRIBUTE2_PATH, \@Create)->result;
    ok(!$hResult->{'Error'}, 'createPreDefAttribute: no error');

    my $ahPreDefs = $hResult->{'PreDefAttributes'};
    is(3, scalar(@$ahPreDefs), 'createPreDefAttribute: results count');

    ok(PREDEF_ATTRIBUTE1_ALIAS eq $ahPreDefs->[0]->{'Alias'}, PREDEF_ATTRIBUTE1_ALIAS . ' createPreDefAttribute: Alias');
    ok(!$ahPreDefs->[0]->{'Error'},                           PREDEF_ATTRIBUTE1_ALIAS . ' createPreDefAttribute: no error');
    ok(PREDEF_ATTRIBUTE1_PATH eq $ahPreDefs->[0]->{'Path'},   PREDEF_ATTRIBUTE1_ALIAS . ' createPreDefAttribute: Path');
    ok($ahPreDefs->[0]->{'created'},                          PREDEF_ATTRIBUTE1_ALIAS . ' createPreDefAttribute: created true');

    ok(PREDEF_ATTRIBUTE2_ALIAS eq $ahPreDefs->[1]->{'Alias'}, PREDEF_ATTRIBUTE2_ALIAS . ' createPreDefAttribute: Alias');
    ok(!$ahPreDefs->[1]->{'Error'},                           PREDEF_ATTRIBUTE2_ALIAS . ' createPreDefAttribute: no error');
    ok(PREDEF_ATTRIBUTE2_PATH eq $ahPreDefs->[1]->{'Path'},   PREDEF_ATTRIBUTE2_ALIAS . ' createPreDefAttribute: Path');
    ok($ahPreDefs->[1]->{'created'},                          PREDEF_ATTRIBUTE2_ALIAS . ' createPreDefAttribute: created true');

    ok(PREDEF_ATTRIBUTE2_ALIAS eq $ahPreDefs->[2]->{'Alias'}, PREDEF_ATTRIBUTE2_ALIAS . ' createPreDefAttribute: Alias');
    ok($ahPreDefs->[2]->{'Error'}, PREDEF_ATTRIBUTE2_ALIAS . ' createPreDefAttribute: error');
}

#---------------------------------------------------------------------------------------------------
sub testGetAllPreDefAttributesInfo {
    my $hResult = $ProductTypeService->getAllPreDefAttributesInfo(ATTRIBUTE2_PATH, [])->result;
    ok(!$hResult->{'Error'}, 'getAllPreDefAttributesInfo: no error');

    my $ahPreDefs = $hResult->{'PreDefAttributes'};

    my ($predef1Found, $predef2Found);
    foreach my $hPreDef (@$ahPreDefs) {
        if (PREDEF_ATTRIBUTE1_ALIAS eq $hPreDef->{'Alias'}) {
            $predef1Found = 1;
            ok(PREDEF_ATTRIBUTE1_PATH eq $hPreDef->{'Path'},        PREDEF_ATTRIBUTE1_ALIAS . ' getAllPreDefAttributesInfo: Path');
            ok(PREDEF_ATTRIBUTE1_NAME eq $hPreDef->{'ValueString'}, PREDEF_ATTRIBUTE1_ALIAS . ' getAllPreDefAttributesInfo: ValueString');
            ok(!defined($hPreDef->{'ValueLocString'}),              PREDEF_ATTRIBUTE1_ALIAS . ' getAllPreDefAttributesInfo: ValueLocString');
        }
        elsif (PREDEF_ATTRIBUTE2_ALIAS eq $hPreDef->{'Alias'}) {
            $predef2Found = 1;
            ok(PREDEF_ATTRIBUTE2_PATH eq $hPreDef->{'Path'},        PREDEF_ATTRIBUTE2_ALIAS . ' getAllPreDefAttributesInfo: Path');
            ok(PREDEF_ATTRIBUTE2_NAME eq $hPreDef->{'ValueString'}, PREDEF_ATTRIBUTE2_ALIAS . ' getAllPreDefAttributesInfo: ValueString');
            ok(!defined($hPreDef->{'ValueLocString'}),              PREDEF_ATTRIBUTE2_ALIAS . ' getAllPreDefAttributesInfo: ValueString');
        }
    }

    ok($predef1Found, 'getAllPreDefAttributesInfo: ' . PREDEF_ATTRIBUTE1_ALIAS . ' found');
    ok($predef2Found, 'getAllPreDefAttributesInfo: ' . PREDEF_ATTRIBUTE2_ALIAS . ' found');
}

#---------------------------------------------------------------------------------------------------
sub testGetPreDefAttributeInfo {
    my $hResult = $ProductTypeService->getPreDefAttributeInfo(
        ATTRIBUTE2_PATH,
        [PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS],
        []
    )->result;
    ok(!$hResult->{'Error'}, 'getPreDefAttributeInfo: no error');

    my $ahPreDefs = $hResult->{'PreDefAttributes'};
    is(3, scalar(@$ahPreDefs), 'getPreDefAttributeInfo: results count');

    ok(PREDEF_ATTRIBUTE1_ALIAS eq $ahPreDefs->[0]->{'Alias'},      PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: Alias');
    ok(!$ahPreDefs->[0]->{'Error'},                                PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: no error');
    ok(PREDEF_ATTRIBUTE1_PATH eq $ahPreDefs->[0]->{'Path'},        PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: Path');
    ok(PREDEF_ATTRIBUTE1_NAME eq $ahPreDefs->[0]->{'ValueString'}, PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: ValueString');
    ok(!defined($ahPreDefs->[0]->{'ValueLocString'}),              PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: ValueLocString');
    is(0, $ahPreDefs->[0]->{'Position'} % 10,                    PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: Position');


    ok(PREDEF_ATTRIBUTE2_ALIAS eq $ahPreDefs->[1]->{'Alias'},      PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: Alias');
    ok(!$ahPreDefs->[1]->{'Error'},                                PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: no error');
    ok(PREDEF_ATTRIBUTE2_PATH eq $ahPreDefs->[1]->{'Path'},        PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: Path');
    ok(PREDEF_ATTRIBUTE2_NAME eq $ahPreDefs->[1]->{'ValueString'}, PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: ValueString');
    ok(!defined($ahPreDefs->[1]->{'ValueLocString'}),              PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: ValueLocString');
    is(0, $ahPreDefs->[1]->{'Position'} % 10,                    PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: Position');

    ok($ahPreDefs->[0]->{'Position'} < $ahPreDefs->[1]->{'Position'}, 'getPreDefAttributeInfo: predefs order');

    ok(NOT_EXISTING_ALIAS eq $ahPreDefs->[2]->{'Alias'}, NOT_EXISTING_ALIAS . ' getPreDefAttributeInfo: Alias');
    ok($ahPreDefs->[2]->{'Error'},                       NOT_EXISTING_ALIAS . ' getPreDefAttributeInfo: error');
}

sub testExistsPreDefAttribute {
    my $hResult = $ProductTypeService->existsPreDefAttribute(
        ATTRIBUTE2_PATH,
        [PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS]
    )->result;
    ok(!$hResult->{'Error'}, 'existsPreDefAttribute: no error');

    my $ahPreDefs = $hResult->{'PreDefAttributes'};
    is(3, scalar(@$ahPreDefs), 'existsPreDefAttribute: results count');

    ok(PREDEF_ATTRIBUTE1_ALIAS eq $ahPreDefs->[0]->{'Alias'}, PREDEF_ATTRIBUTE1_ALIAS . ' existsPreDefAttribute: Alias');
    ok($ahPreDefs->[0]->{'exists'},                           PREDEF_ATTRIBUTE1_ALIAS . ' existsPreDefAttribute: exists true');

    ok(PREDEF_ATTRIBUTE2_ALIAS eq $ahPreDefs->[1]->{'Alias'}, PREDEF_ATTRIBUTE2_ALIAS . ' existsPreDefAttribute: Alias');
    ok($ahPreDefs->[1]->{'exists'},                           PREDEF_ATTRIBUTE2_ALIAS . ' existsPreDefAttribute: exists true');

    ok(NOT_EXISTING_ALIAS eq $ahPreDefs->[2]->{'Alias'}, NOT_EXISTING_ALIAS . ' existsPreDefAttribute: Alias');
    ok(!$ahPreDefs->[2]->{'exists'},                     NOT_EXISTING_ALIAS . ' existsPreDefAttribute: exists false');
}

#---------------------------------------------------------------------------------------------------
sub testUpdatePreDefAttibute {
    my @Update = (
        {'Alias'       => PREDEF_ATTRIBUTE1_ALIAS,
         'ValueString' => PREDEF_ATTRIBUTE1_NAME . 'updated',
         'Position'    => 99999
        },
        {'Alias' => NOT_EXISTING_ALIAS
        }
    );

    my $hResult = $ProductTypeService->updatePreDefAttribute(ATTRIBUTE2_PATH, \@Update)->result;
    ok(!$hResult->{'Error'}, 'updatePreDefAttribute: no error');

    my $ahPreDefs = $hResult->{'PreDefAttributes'};
    is(2, scalar(@$ahPreDefs), 'updatePreDefAttribute: results count');

    ok(PREDEF_ATTRIBUTE1_ALIAS eq $ahPreDefs->[0]->{'Alias'}, PREDEF_ATTRIBUTE1_ALIAS . ' updatePreDefAttribute: Alias');
    ok(!$ahPreDefs->[0]->{'Error'},                           PREDEF_ATTRIBUTE1_ALIAS . ' updatePreDefAttribute: no error');
    ok($ahPreDefs->[0]->{'updated'},                          PREDEF_ATTRIBUTE1_ALIAS . ' updatePreDefAttribute: updated true');

    ok(NOT_EXISTING_ALIAS eq $ahPreDefs->[1]->{'Alias'}, NOT_EXISTING_ALIAS . ' updatePreDefAttribute: Alias');
    ok($ahPreDefs->[1]->{'Error'},                       NOT_EXISTING_ALIAS . ' updatePreDefAttribute: error');

    $hResult = $ProductTypeService->getPreDefAttributeInfo(
        ATTRIBUTE2_PATH,
        [PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS],
        []
    )->result;
    ok(!$hResult->{'Error'}, 'getPreDefAttributeInfo: no error');

    $ahPreDefs = $hResult->{'PreDefAttributes'};
    is(2, scalar(@$ahPreDefs), 'getPreDefAttributeInfo: results count');

    ok(PREDEF_ATTRIBUTE1_ALIAS eq $ahPreDefs->[0]->{'Alias'},                  PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: Alias');
    ok(!$ahPreDefs->[0]->{'Error'},                                            PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: no error');
    ok(PREDEF_ATTRIBUTE1_NAME . 'updated' eq $ahPreDefs->[0]->{'ValueString'}, PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: ValueString');
    ok(!defined($ahPreDefs->[0]->{'ValueLocString'}),                          PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: ValueLocString');
    is(0, $ahPreDefs->[0]->{'Position'} % 10,                                PREDEF_ATTRIBUTE1_ALIAS . ' getPreDefAttributeInfo: Position');

    ok(PREDEF_ATTRIBUTE2_ALIAS eq $ahPreDefs->[1]->{'Alias'},                  PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: Alias');
    ok(!$ahPreDefs->[1]->{'Error'},                                            PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: no error');
    ok(PREDEF_ATTRIBUTE2_NAME eq $ahPreDefs->[1]->{'ValueString'},             PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: ValueString');
    ok(!defined($ahPreDefs->[1]->{'ValueLocString'}),                          PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: ValueLocString');
    is(0, $ahPreDefs->[1]->{'Position'} % 10,                                PREDEF_ATTRIBUTE2_ALIAS . ' getPreDefAttributeInfo: Position');

    ok($ahPreDefs->[0]->{'Position'} > $ahPreDefs->[1]->{'Position'}, 'getPreDefAttributeInfo: predefs order');
}

#---------------------------------------------------------------------------------------------------
sub testDeletePreDefAttribute {
    my $hResult = $ProductTypeService->deletePreDefAttribute(
        ATTRIBUTE2_PATH,
        [PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS]
    )->result;
    ok(!$hResult->{'Error'}, 'deletePreDefAttribute: no error');

    my $ahPreDefs = $hResult->{'PreDefAttributes'};
    is(2, scalar(@$ahPreDefs), 'deletePreDefAttribute: results count');

    ok(PREDEF_ATTRIBUTE2_ALIAS eq $ahPreDefs->[0]->{'Alias'}, PREDEF_ATTRIBUTE2_ALIAS . ' deletePreDefAttribute: Alias');
    ok(!$ahPreDefs->[0]->{'Error'},                           PREDEF_ATTRIBUTE2_ALIAS . ' deletePreDefAttribute: no error');
    ok($ahPreDefs->[0]->{'deleted'},                          PREDEF_ATTRIBUTE2_ALIAS . ' deletePreDefAttribute: deleted true');

    ok(NOT_EXISTING_ALIAS eq $ahPreDefs->[1]->{'Alias'}, NOT_EXISTING_ALIAS . ' deletePreDefAttribute: Alias');
    ok($ahPreDefs->[1]->{'Error'},                       NOT_EXISTING_ALIAS . ' deletePreDefAttribute: error');


    $hResult = $ProductTypeService->existsPreDefAttribute(ATTRIBUTE2_PATH, [PREDEF_ATTRIBUTE2_ALIAS])->result;
    ok(!$hResult->{'Error'}, 'existsPreDefAttribute: no error');

    $ahPreDefs = $hResult->{'PreDefAttributes'};
    is(1, scalar(@$ahPreDefs), 'existsPreDefAttribute: results count');

    ok(PREDEF_ATTRIBUTE2_ALIAS eq $ahPreDefs->[0]->{'Alias'}, PREDEF_ATTRIBUTE2_ALIAS . ' existsPreDefAttribute: Alias');
    ok(!$ahPreDefs->[0]->{'Error'},                           PREDEF_ATTRIBUTE2_ALIAS . ' existsPreDefAttribute: no error');
    ok(!$ahPreDefs->[0]->{'exists'},                          PREDEF_ATTRIBUTE2_ALIAS . ' existsPreDefAttribute: exists false');

    #try to delete predefined attribute that is still in use
    $hResult = $ProductTypeService->deletePreDefAttribute(
        'ProductTypes/Jacket/Attributes/Color',
        ['Black']
    )->result;
    my $hPreDef = $hResult->{'PreDefAttributes'}->[0];
    ok($hPreDef->{'Error'}, 'deletePreDefAttribute: error OK by try to delete used predefined attribute');
    ok($hPreDef->{'Error'}->{'Message'} =~ /can not be deleted as it is still used by variation products/, 'deletePreDefAttribute: error message OK by try to delete used predefined attribute');
}


#---------------------------------------------------------------------------------------------------
sub deleteIfExists {
    my $ahResults = $ProductTypeService->exists( [PERL_TEST1_PATH, PERL_TEST2_PATH] )->result;

    my @Existing = ();
    push(@Existing, PERL_TEST1_PATH) if ($ahResults->[0]->{'exists'});
    push(@Existing, PERL_TEST2_PATH) if ($ahResults->[1]->{'exists'});

    if (scalar(@Existing) > 0) {
        $ProductTypeService->delete(\@Existing);
    }
}

#---------------------------------------------------------------------------------------------------
# run test suite
deleteIfExists();
testGetBaseProductType();
testCreate();
testGetAllInfo();
testGetInfo();
testExists();
testUpdate();
#
testCreateProductAttribute();
testGetAllProductAttibutesInfo();
testGetProductAttributeInfo();
testExistsProductAttribute();
testUpdateProductAttribute();
#
testCreatePreDefAttribute();
testGetAllPreDefAttributesInfo();
testGetPreDefAttributeInfo();
testExistsPreDefAttribute();
testUpdatePreDefAttibute();
testDeletePreDefAttribute();
##
testDeleteProductAttribute();
##
testDelete();
