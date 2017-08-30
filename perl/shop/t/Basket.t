use strict;
use Test::More;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $BasketService =
  WebServiceClient->uri('urn://epages.de/WebService/BasketService/2013/11')->proxy(WEBSERVICE_URL)
  ->userinfo(WEBSERVICE_USER)->xmlschema('2001');

# use product service to get GUIDs by given object paths of demo products
my $ProductService =
  WebServiceClient->uri('urn://epages.de/WebService/ProductService/2013/01')->proxy(WEBSERVICE_URL)
  ->userinfo(WEBSERVICE_USER)->xmlschema('2001');

my $Product_alias_1 = "productalias1";
my $Product_alias_2 = "productalias2";

# create test products
my $Product_in_1 = {
    'Alias'         => $Product_alias_1,
    'StockLevel'    => 200,
    'ProductPrices' => [ { 'CurrencyID' => 'EUR', 'Price' => 123, 'TaxModel' => 'gross', }, ],
    'IsAvailable'   => SOAP::Data->type('boolean')->value(1)
};
my $Product_in_2 = {
    'Alias'         => $Product_alias_2,
    'StockLevel'    => 300,
    'ProductPrices' => [ { 'CurrencyID' => 'EUR', 'Price' => 1234, 'TaxModel' => 'gross', }, ],
    'IsAvailable'   => SOAP::Data->type('boolean')->value(1)
};

sub main {
    init();
    test();
    done_testing();
}

sub init() {
    _cleanup();
}

sub test {
    testCreateBasket();
    testExistsBasket();
    testDeleteBasket();
    testaddProductLineItem();
    testGetInfoReference();
    testUpdateLineItem();
    testDeleteLineItem();
    testUpdateBasket();
}

sub testCreateBasket {
    my $hExpBasket = _setupTestBasketHash();
    my $ahBaskets = $BasketService->create( [$hExpBasket] )->result;

    is( scalar @$ahBaskets, 1, 'testCreateBasket: response format' );

    my $hCreate = $ahBaskets->[0];
    ok( !$hCreate->{'Error'}, 'testCreateBasket: check error' );
    is( $hCreate->{'created'}, 1, 'testCreateBasket: created' );
}

sub testDeleteLineItem {
    my $BasketPath = _setupTestBasketInDB();

    _deleteProductsIfExists( [$Product_alias_1] );
    _createProductsInDB(     [$Product_in_1] );
    my $ProductGUID = _fetchProductGuid($Product_alias_1);

    my $ProductLineItem = {
        'GUID'     => $ProductGUID,
        'Quantity' => 50,
    };
    $BasketService->addProductLineItem( $BasketPath, [$ProductLineItem] )->result;

    my $hBasketInfo = _getInfo($BasketPath);

    my $LineItemAlias = $hBasketInfo->{LineItemContainer}->{'ProductLineItems'}->[0]->{'Alias'};

    my $ahResultDelete = $BasketService->deleteLineItem( $BasketPath, [$LineItemAlias] )->result;
    is( scalar @$ahResultDelete, 1, 'testDeleteLineItem: result count' );
    my $hResultDelete = $ahResultDelete->[0];
    ok( !$hResultDelete->{'Error'}, 'testDeleteLineItem: check error' );
    diag $hResultDelete->{'Error'}->{'Message'} . "\n" if $hResultDelete->{'Error'};

    my $LineItemPath = "$BasketPath/LineItemContainer/$LineItemAlias";
    is( $hResultDelete->{'Path'},    $LineItemPath, 'testDeleteLineItem: line item path' );
    is( $hResultDelete->{'deleted'}, 1,             'testDeleteLineItem: deleted' );
}

sub testExistsBasket {
    my $BasketPath = _setupTestBasketInDB();

    my $ahResultExists = $BasketService->exists( [$BasketPath] )->result;
    is( scalar @$ahResultExists, 1, 'testExistsBasket: response format' );

    my $hResultExists = $ahResultExists->[0];
    ok( !$hResultExists->{'Error'}, 'testExistsBasket: check error' );
    diag $hResultExists->{'Error'}->{'Message'} . "\n" if $hResultExists->{'Error'};

    is( $hResultExists->{'Path'},   $BasketPath, 'testExistsBasket: basket path' );
    is( $hResultExists->{'exists'}, 1,           'testExistsBasket: exists' );
}

sub testDeleteBasket {
    my $BasketPath = _setupTestBasketInDB();

    my $ahResultDelete = $BasketService->delete( [$BasketPath] )->result;
    is( scalar @$ahResultDelete, 1, 'testDeleteBasket: result count' );

    my $hResultDelete = $ahResultDelete->[0];
    ok( !$hResultDelete->{'Error'}, 'testDeleteBasket: check error' );
    diag $hResultDelete->{'Error'}->{'Message'} . "\n" if $hResultDelete->{'Error'};

    is( $hResultDelete->{'Path'},    $BasketPath, 'testDeleteBasket: basket path' );
    is( $hResultDelete->{'deleted'}, 1,           'testDeleteBasket: deleted' );
}

sub testaddProductLineItem {
    my $BasketPath = _setupTestBasketInDB();
    my $Quantity   = 200;

    _deleteProductsIfExists( [$Product_alias_1] );
    _createProductsInDB(     [$Product_in_1] );
    my $ProductGUID = _fetchProductGuid($Product_alias_1);

    my $LineItem = {
        'GUID'     => $ProductGUID,
        'Quantity' => $Quantity,
    };

    my $ahResultAddLineItem = $BasketService->addProductLineItem( $BasketPath, [$LineItem] )->result;
    is( scalar @$ahResultAddLineItem, 1, 'testaddProductLineItem: result count' );

    my $hResultAddLineItem = $ahResultAddLineItem->[0];
    ok( !$hResultAddLineItem->{'Error'}, 'testaddProductLineItem: check error' );
    diag $hResultAddLineItem->{'Error'}->{'Message'} . "\n"
      if $hResultAddLineItem->{'Error'};

    is( $hResultAddLineItem->{'GUID'}, $LineItem->{GUID}, 'testaddProductLineItem: product GUID' );
    is( $hResultAddLineItem->{'added'}, 1, 'testaddProductLineItem: added' );
}

sub testGetInfoReference {
    my $BasketPath = _setupTestBasketInDB();
    my $hExpBasket = _setupTestBasketHash();
    my $Quantity   = '170';

    _deleteProductsIfExists( [$Product_alias_1] );
    _createProductsInDB(     [$Product_in_1] );
    my $ProductGUID = _fetchProductGuid($Product_alias_1);

    _addProductToBasketHash( $hExpBasket, $ProductGUID, $Quantity );

    my $LineItem = {
        'GUID'     => $ProductGUID,
        'Quantity' => $Quantity
    };
    $BasketService->addProductLineItem( $BasketPath, [$LineItem] );

    my $ahBasketInfo = $BasketService->getInfo( [$BasketPath], [], [] )->result;
    is( scalar @$ahBasketInfo, 1, 'testGetInfoReference: result set' );

    my $hBasket = $ahBasketInfo->[0];
    ok( !$hBasket->{'Error'}, 'testGetInfoReference: check error' );
    diag "Error: $hBasket->{'Error'}\n" if $hBasket->{'Error'};

    my $hLineItemContainer    = $hBasket->{'LineItemContainer'};
    my $hExpLineItemContainer = $hExpBasket->{'LineItemContainer'};
    is( $hLineItemContainer->{'TaxArea'},  $hExpLineItemContainer->{'TaxArea'},  'testGetInfoReference: tax area', );
    is( $hLineItemContainer->{'TaxModel'}, $hExpLineItemContainer->{'TaxModel'}, 'testGetInfoReference: tax model' );
    is(
        $hLineItemContainer->{'CurrencyID'},
        $hExpLineItemContainer->{'CurrencyID'},
        'testGetInfoReference: currencyid'
    );

    ok( $hLineItemContainer->{'ProductLineItems'}, 'testGetInfoReference: list of all product line items' );
    my @ProductLineItems =
      map {
        {
            $_->{'Product'},
              {
                'Quantity'  => $_->{'Quantity'},
                'OrderUnit' => $_->{'OrderUnit'}
              }
        }
      } sort { $a->{Product} le $b->{Product} } @{ $hLineItemContainer->{'ProductLineItems'} };
    my @ProductLineItemsRef =
      map {
        {
            $_->{'Product'},
              {
                'Quantity'  => $_->{'Quantity'},
                'OrderUnit' => $_->{'OrderUnit'}
              }
        }
      } sort { $a->{Product} le $b->{Product} } @{ $hExpLineItemContainer->{'ProductLineItems'} };

    is_deeply( \@ProductLineItems, \@ProductLineItemsRef, 'testGetInfoReference: product line items' );

    return $hBasket;
}

sub testUpdateLineItem {
    my $BasketPath     = _setupTestBasketInDB();
    my $ChangeQuantity = '17';

    _deleteProductsIfExists( [$Product_alias_1] );
    _createProductsInDB(     [$Product_in_1] );
    my $ProductGUID = _fetchProductGuid($Product_alias_1);

    my $ProductLineItem = {
        'GUID'     => $ProductGUID,
        'Quantity' => 50,
    };
    $BasketService->addProductLineItem( $BasketPath, [$ProductLineItem] )->result;
    my $hBasketInfo = _getInfo($BasketPath);

    my $hContainer      = $hBasketInfo->{LineItemContainer};
    my $hLineItem       = $hContainer->{'ProductLineItems'}->[0];
    my $changedQuantity = $ChangeQuantity;
    my $LineItem        = {
        'Alias'     => $hLineItem->{Alias},
        'Quantity'  => $changedQuantity,
        'OrderUnit' => '/Units/piece'
    };

    my $ahResults = $BasketService->updateLineItem( $BasketPath, [$LineItem] )->result;
    is( scalar @$ahResults, 1, 'testUpdateLineItem: result count' );

    my $hUpdate = $ahResults->[0];
    ok( !$hUpdate->{'Error'}, 'testUpdateLineItem: check error' );
    diag $hUpdate->{'Error'}->{'Message'} . "\n" if $hUpdate->{'Error'};

    my $LineItemPath = "$BasketPath/LineItemContainer/$LineItem->{Alias}";
    is( $hUpdate->{'Path'},    $LineItemPath, 'testUpdateLineItem: line item path' );
    is( $hUpdate->{'updated'}, 1,             'testUpdateLineItem: updated' );

    my $hBasketInfoUpdated = _getInfo($BasketPath);
    is( $hBasketInfoUpdated->{'LineItemContainer'}->{'ProductLineItems'}->[0]->{'Quantity'},
        $ChangeQuantity, 'testUpdateLineItem: quantity changed' );
}

sub testUpdateBasket {
    my $BasketPath = _setupTestBasketInDB();

    _deleteProductsIfExists( [ $Product_alias_1, $Product_alias_2 ] );
    _createProductsInDB( [ $Product_in_1, $Product_in_2 ] );
    my $ProductGUID_1 = _fetchProductGuid($Product_alias_1);
    my $ProductGUID_2 = _fetchProductGuid($Product_alias_2);

    my $ProductLineItem = {
        'GUID'     => $ProductGUID_1,
        'Quantity' => 50,
    };
    $BasketService->addProductLineItem( $BasketPath, [$ProductLineItem] )->result;

    my $UpdateBasket = {
        'LineItemContainer' => {
            'ProductLineItems' => [ { 'Product' => $ProductGUID_2, 'Quantity' => '1' }, ],
        },
    };
    $UpdateBasket->{Path} = $BasketPath;

    my $ahResults = $BasketService->update( [$UpdateBasket] )->result;
    is( scalar @$ahResults, 1, 'testUpdateBasket: result count' );

    my $hUpdate = $ahResults->[0];
    ok( !$hUpdate->{'Error'}, 'testUpdateBasket: check error' );
    diag $hUpdate->{'Error'}->{'Message'} . "\n" if $hUpdate->{'Error'};

    is( $hUpdate->{'Path'},    $BasketPath, 'testUpdateBasket: check path' );
    is( $hUpdate->{'updated'}, 1,           'testUpdateBasket: updated' );

    my $hBasketInfoUpdated = _getInfo($BasketPath);
    is( scalar( @{ $hBasketInfoUpdated->{'LineItemContainer'}->{'ProductLineItems'} } ),
        2, 'testUpdateBasket: Expected quantity and result quantity' );
}

sub _setupTestBasketInDB {
    my $hBasket = _setupTestBasketHash();
    my $ahResultCreate = $BasketService->create( [$hBasket] )->result;
    return $ahResultCreate->[0]->{'Path'};
}

sub _createProductsInDB {
    my ($aProducts) = @_;

    foreach my $Product ($aProducts) {
        $ProductService->create($Product)->result;
    }

}

sub _deleteProductsIfExists {
    my ($aProductAliases) = @_;

    foreach my $Alias (@$aProductAliases) {
        my $ahResults = $ProductService->exists( [ '/Shops/DemoShop/Products/' . $Alias ] )->result;

        next unless $ahResults->[0]->{'exists'};

        $ProductService->delete( [ '/Shops/DemoShop/Products/' . $Alias ] );
    }

    return;
}

sub _fetchProductGuid {
    my ($Product) = @_;

    # array of product paths that involved in basket tests
    my @ProductPaths = map { "Products/$_" } ($Product);
    my $prodInfoResult = $ProductService->getInfo( \@ProductPaths, ['GUID'] )->result;
    ok( !$prodInfoResult->[0]->{'Error'}, "_fetch_product_guid: no error" );

    return ( @$prodInfoResult[0]->{Attributes}->[0]->{Value} );
}

sub _setupTestBasketHash {
    return {
        'LineItemContainer' => {
            'CurrencyID' => 'EUR',
            'TaxArea'    => '/TaxMatrixGermany/EU',
            'TaxModel'   => 'gross',
        },
    };
}

sub _addProductToBasketHash {
    my ( $hBasket, $GUID, $Quantity ) = @_;

    my $aProductLineItems = $hBasket->{'LineItemContainer'}->{'ProductLineItems'};
    $aProductLineItems = [] unless defined $aProductLineItems;
    my $hProduct = {
        'Product'   => $GUID,
        'Quantity'  => $Quantity,
        'OrderUnit' => '/Units/piece'
    };

    push( @$aProductLineItems, $hProduct );
    $hBasket->{'LineItemContainer'}->{'ProductLineItems'} = $aProductLineItems;

    return $hBasket;
}

sub _getInfo {
    my ($basketPath) = @_;

    my $ahResults = $BasketService->getInfo( [$basketPath], [], [] )->result;

    return $ahResults->[0];
}

sub _cleanup {
    _deleteProductsIfExists( [ $Product_alias_1, $Product_alias_2 ] );
}

main();

1;
