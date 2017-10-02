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

my $ProductAlias1 = "productalias1";
my $ProductAlias2 = "productalias2";

# create test products
my $ProductIn1 = {
    'Alias'         => $ProductAlias1,
    'StockLevel'    => 200,
    'ProductPrices' => [ { 'CurrencyID' => 'EUR', 'Price' => 123, 'TaxModel' => 'gross', }, ],
    'IsAvailable'   => SOAP::Data->type('boolean')->value(1)
};
my $ProductIn2 = {
    'Alias'         => $ProductAlias2,
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
    testAddProductLineItem();
    testUpdateProductLineItem();
    testDeleteProductLineItem();
    testUpdateBasket();
    testGetInfoReference();
    _cleanup();
}

sub testCreateBasket {
    my $hExpBasket = _setupTestBasketHash();
    my $ahBaskets = $BasketService->create( [$hExpBasket] )->result;

    is( scalar @$ahBaskets, 1, 'testCreateBasket: response format' );

    my $hCreate = $ahBaskets->[0];
    ok( !$hCreate->{'Error'}, 'testCreateBasket: check error' );
    is( $hCreate->{'created'}, 1, 'testCreateBasket: created' );

    my $BasketPath = $hCreate->{'Path'};
    my $ExistsBasketResult = $BasketService->exists( [$BasketPath] )->result;
    is( $ExistsBasketResult->[0]->{'exists'}, 1, 'testCreateBasket: basket exists' );
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

    my $ExistsBasketResult = $BasketService->exists( [$BasketPath] )->result;
    is( $ExistsBasketResult->[0]->{'exists'}, 0, 'testCreateBasket: basket exists' );
}

sub testAddProductLineItem {
    my $BasketPath = _setupTestBasketInDB();
    my $Quantity   = 200;

    _deleteProductsIfExists( [$ProductAlias1] );
    _createProductsInDB(     [$ProductIn1] );
    my $ProductGUID = _fetchProductGuid($ProductAlias1);

    my $LineItem = {
        'GUID'     => $ProductGUID,
        'Quantity' => $Quantity,
    };

    my $ahResultAddLineItem = $BasketService->addProductLineItem( $BasketPath, [$LineItem] )->result;
    is( scalar @$ahResultAddLineItem, 1, 'testAddProductLineItem: result count' );

    my $hResultAddLineItem = $ahResultAddLineItem->[0];
    ok( !$hResultAddLineItem->{'Error'}, 'testAddProductLineItem: check error' );
    diag $hResultAddLineItem->{'Error'}->{'Message'} . "\n"
      if $hResultAddLineItem->{'Error'};

    is( $hResultAddLineItem->{'GUID'}, $LineItem->{GUID}, 'testAddProductLineItem: product GUID' );
    is( $hResultAddLineItem->{'added'}, 1, 'testAddProductLineItem: added' );

    my $hBasketInfo = _getInfo($BasketPath);
    is( scalar( @{ $hBasketInfo->{'LineItemContainer'}->{'ProductLineItems'} } ),
        1, 'testAddProductLineItem: additional ProductLineItem' );
}

sub testUpdateProductLineItem {
    my $BasketPath     = _setupTestBasketInDB();
    my $ChangeQuantity = '17';

    _deleteProductsIfExists( [$ProductAlias1] );
    _createProductsInDB(     [$ProductIn1] );
    my $ProductGUID = _fetchProductGuid($ProductAlias1);

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
    ok( !$hUpdate->{'Error'}, 'testUpdateProductLineItem: check error' );
    diag $hUpdate->{'Error'}->{'Message'} . "\n" if $hUpdate->{'Error'};

    my $LineItemPath = "$BasketPath/LineItemContainer/$LineItem->{Alias}";
    is( $hUpdate->{'Path'},    $LineItemPath, 'testUpdateProductLineItem: line item path' );
    is( $hUpdate->{'updated'}, 1,             'testUpdateProductLineItem: updated' );

    my $hBasketInfoUpdated = _getInfo($BasketPath);
    is( $hBasketInfoUpdated->{'LineItemContainer'}->{'ProductLineItems'}->[0]->{'Quantity'},
        $ChangeQuantity, 'testUpdateProductLineItem: quantity changed' );

    my $hBasketInfo = _getInfo($BasketPath);
    is( $hBasketInfo->{'LineItemContainer'}->{'ProductLineItems'}->[0]->{'Quantity'},
        $ChangeQuantity, 'testUpdateProductLineItem: additional ProductLineItem' );
}

sub testDeleteProductLineItem {
    my $BasketPath = _setupTestBasketInDB();

    _deleteProductsIfExists( [$ProductAlias1] );
    _createProductsInDB(     [$ProductIn1] );
    my $ProductGUID = _fetchProductGuid($ProductAlias1);

    my $ProductLineItem = {
        'GUID'     => $ProductGUID,
        'Quantity' => 50,
    };
    $BasketService->addProductLineItem( $BasketPath, [$ProductLineItem] )->result;

    my $hBasketInfo   = _getInfo($BasketPath);
    my $LineItemAlias = $hBasketInfo->{LineItemContainer}->{'ProductLineItems'}->[0]->{'Alias'};

    my $ahResultDelete = $BasketService->deleteLineItem( $BasketPath, [$LineItemAlias] )->result;
    is( scalar @$ahResultDelete, 1, 'testDeleteProductLineItem: result count' );
    my $hResultDelete = $ahResultDelete->[0];
    ok( !$hResultDelete->{'Error'}, 'testDeleteProductLineItem: check error' );
    diag $hResultDelete->{'Error'}->{'Message'} . "\n" if $hResultDelete->{'Error'};

    my $LineItemPath = "$BasketPath/LineItemContainer/$LineItemAlias";
    is( $hResultDelete->{'Path'},    $LineItemPath, 'testDeleteProductLineItem: line item path' );
    is( $hResultDelete->{'deleted'}, 1,             'testDeleteProductLineItem: deleted' );

    $hBasketInfo = _getInfo($BasketPath);
    is( scalar( @{ $hBasketInfo->{'LineItemContainer'}->{'ProductLineItems'} } ),
        0, 'testDeleteProductLineItem: no ProductLineItems' );
}

sub testUpdateBasket {
    my $BasketPath = _setupTestBasketInDB();

    _deleteProductsIfExists( [ $ProductAlias1, $ProductAlias2 ] );
    _createProductsInDB( [ $ProductIn1, $ProductIn2 ] );
    my $ProductGUID_1 = _fetchProductGuid($ProductAlias1);
    my $ProductGUID_2 = _fetchProductGuid($ProductAlias2);

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

sub testGetInfoReference {
    my $BasketPath = _setupTestBasketInDB();
    my $hExpBasket = _setupTestBasketHash();
    my $Quantity   = '170';

    _deleteProductsIfExists( [$ProductAlias1] );
    _createProductsInDB(     [$ProductIn1] );
    my $ProductGUID = _fetchProductGuid($ProductAlias1);

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
    _deleteProductsIfExists( [ $ProductAlias1, $ProductAlias2 ] );
}

main();

1;
