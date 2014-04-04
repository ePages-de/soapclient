use strict;
use Test::More tests => 122;
use Data::Dumper;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( TAttributes hAttributes cmpDateTime );

# Create a SOAP::Lite client object
my $BasketService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/BasketService/2013/11' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# use product service to get GUIDs by given object paths of demo products
my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductService/2013/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# array of product paths that involved in basket tests
my @ProductPaths = map "Products/$_", qw(ho_1112105010 eg_1000111010 de_3201212002);
my $prodInfoResult = $ProductService->getInfo(\@ProductPaths,['GUID'])->result;
    ok( !$prodInfoResult->[0]->{'Error'}, "getInfo product GUIDs: no error" );
# store GUID for easy acces via $GUID{$Alias}
my %GUID = map { $_->{Alias} => $_->{Attributes}->[0]->{Value} } @$prodInfoResult;


sub testExistsByPath {
    my ( $Path, $exists ) = @_;

    my $ahResults = $BasketService->exists( [$Path] )->result;
    ok( scalar @$ahResults == 1, 'exists: result count' );

    my $hExists = $ahResults->[0];
    ok( !$hExists->{'Error'}, 'exists: no error' );
    diag $hExists->{'Error'}->{'Message'}."\n" if $hExists->{'Error'};

    ok( $hExists->{'Path'} eq $Path, 'exists: basket path' );
    ok( $hExists->{'exists'} == $exists, 'exists?' );
    
}

# Create a Basket and check if the creation was successful
sub testCreateBasket {
    my ($Basket) = @_;

    my $ahResults = $BasketService->create( [$Basket] )->result; 
    ok( scalar @$ahResults == 1, 'create: result count' );

    my $hCreate = $ahResults->[0];
    ok( !$hCreate->{'Error'}, 'create: no error' );
    diag $hCreate->{'Error'}->{'Message'}."\n" if $hCreate->{'Error'};

    ok( $hCreate->{'created'} == 1, 'created?' );
    
    return $hCreate->{'Path'};
}

sub testGetInfoReference {
    my ( $basketPath, $basketRef ) = @_;

    my $ahResults = $BasketService->getInfo( [$basketPath], [], [] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result set' );

    my $hInfo = $ahResults->[0];
    ok( !$hInfo->{'Error'}, 'getInfo: no error' );
    diag "Error: $hInfo->{'Error'}\n" if $hInfo->{'Error'};

    my $hLineItemContainer  = $hInfo->{'LineItemContainer'};
    my $hLineItemContainer2 = $basketRef->{'LineItemContainer'};
    ok( $hLineItemContainer->{'TaxArea'}    eq $hLineItemContainer2->{'TaxArea'},       'tax area' );
    ok( $hLineItemContainer->{'TaxModel'}   eq $hLineItemContainer2->{'TaxModel'},      'tax model' );
    ok( $hLineItemContainer->{'CurrencyID'} eq $hLineItemContainer2->{'CurrencyID'},    'currencyid' );

    ok( $hLineItemContainer->{'ProductLineItems'}, 'list of all product line items');
    my @ProductLineItems = 
        map {{$_->{Product},$_->{Quantity}}} sort {$a->{Product} le $b->{Product}} 
        @{$hLineItemContainer->{'ProductLineItems'}};
    my @ProductLineItemsRef = 
        map {{$_->{Product},$_->{Quantity}}} sort {$a->{Product} le $b->{Product}} 
        @{$hLineItemContainer2->{'ProductLineItems'}};

    is_deeply( \@ProductLineItems, \@ProductLineItemsRef, 'product line items');
    
    return $hInfo;
}

sub testDeleteBasket {
    my ( $basketPath ) = @_;

    my $ahResults = $BasketService->delete( [$basketPath] )->result;
    ok( scalar @$ahResults == 1, 'delete: result count' );

    my $hDelete = $ahResults->[0];
    ok( !$hDelete->{'Error'}, 'delete: no error' );
    diag $hDelete->{'Error'}->{'Message'}."\n" if $hDelete->{'Error'};

    ok( $hDelete->{'Path'} eq $basketPath, 'delete: order path' );
    ok( $hDelete->{'deleted'} == 1, 'deleted?' );
}

sub testUpdateBasket {
    my ($Path, $Basket) = @_;
    $Basket->{Path} = $Path;

    my $ahResults = $BasketService->update( [$Basket] )->result;
    ok( scalar @$ahResults == 1, 'update: result count' );

    my $hUpdate = $ahResults->[0];
    ok( !$hUpdate->{'Error'}, 'update: no error' );
    diag $hUpdate->{'Error'}->{'Message'}."\n" if $hUpdate->{'Error'};

    ok( $hUpdate->{'Path'} eq $Path, 'path path' );
    ok( $hUpdate->{'updated'} == 1, 'updated?' );

}

sub testAddProductLineItem {
    my ($Path, $LineItem, $Basket) = @_;
    $Basket->{Path} = $Path;

    my $ahResults = $BasketService->addProductLineItem( $Path, [$LineItem] )->result;
    ok( scalar @$ahResults == 1, 'add product: result count' );

    my $hUpdate = $ahResults->[0];
    ok( !$hUpdate->{'Error'}, 'add product: no error' );
    diag $hUpdate->{'Error'}->{'Message'}."\n" if $hUpdate->{'Error'};

    ok( $hUpdate->{'GUID'} eq $LineItem->{GUID}, 'product GUID' );
    ok( $hUpdate->{'added'} == 1, 'added?' );
}

sub testUpdateLineItem {
    my ($Path, $LineItem, $Basket) = @_;
    $Basket->{Path} = $Path;

    my $ahResults = $BasketService->updateLineItem( $Path, [$LineItem] )->result;
    ok( scalar @$ahResults == 1, 'update: result count' );

    my $hUpdate = $ahResults->[0];
    ok( !$hUpdate->{'Error'}, 'update: no error' );
    diag $hUpdate->{'Error'}->{'Message'}."\n" if $hUpdate->{'Error'};

    my $LineItemPath = "$Path/LineItemContainer/$LineItem->{Alias}";
    ok( $hUpdate->{'Path'} eq $LineItemPath, 'line item path' );
    ok( $hUpdate->{'updated'} == 1, 'updated?' );
}

sub testDeleteLineItem {
    my ($Path, $LineItemAlias, $Basket) = @_;
    $Basket->{Path} = $Path;

    my $ahResults = $BasketService->deleteLineItem( $Path, [$LineItemAlias] )->result;
    ok( scalar @$ahResults == 1, 'delete: result count' );

    my $hDelete = $ahResults->[0];
    ok( !$hDelete->{'Error'}, 'delete: no error' );
    diag $hDelete->{'Error'}->{'Message'}."\n" if $hDelete->{'Error'};

    my $LineItemPath = "$Path/LineItemContainer/$LineItemAlias";
    ok( $hDelete->{'Path'} eq $LineItemPath, 'line item path' );
    ok( $hDelete->{'deleted'} == 1, 'deleted?' );
}




# run test suite

#create basket1 with 1 product
my $basket1 = {
    'LineItemContainer' => {
        'CurrencyID'        => 'EUR',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => $GUID{ho_1112105010}, 'Quantity' => '10'},
        ],
    },
};
my $basket1Path = testCreateBasket( $basket1 );

#exists basket1?
testExistsByPath( $basket1Path, 1 );

#check info of basket1
testGetInfoReference( $basket1Path, $basket1 );

#delete basket?
testDeleteBasket( $basket1Path );

#dont exists basket1?
testExistsByPath( $basket1Path, 0 );


#create basket2 with 2 products
my $basket2 = {
    'LineItemContainer' => {
        'CurrencyID'        => 'EUR',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => $GUID{ho_1112105010}, 'Quantity' => '2'},
            {'Product' => $GUID{eg_1000111010}, 'Quantity' => '3'},
        ],
    },
};
my $basket2Path = testCreateBasket( $basket2 );

#exists basket2?
testExistsByPath( $basket2Path, 1 );

#check info of basket2
testGetInfoReference( $basket2Path, $basket2 );

#update quantity of one product in basket2
my $QuantityBefore0 = $basket2->{'LineItemContainer'}->{'ProductLineItems'}->[0]->{'Quantity'};
$basket2->{'LineItemContainer'}->{'ProductLineItems'}->[0]->{'Quantity'} = 7;
my $QuantityBefore1 = $basket2->{'LineItemContainer'}->{'ProductLineItems'}->[1]->{'Quantity'};
$basket2->{'LineItemContainer'}->{'ProductLineItems'}->[1]->{'Quantity'} = 1;
testUpdateBasket( $basket2Path, $basket2 );

#check info of basket2
$basket2->{'LineItemContainer'}->{'ProductLineItems'}->[0]->{'Quantity'} += $QuantityBefore0;
$basket2->{'LineItemContainer'}->{'ProductLineItems'}->[1]->{'Quantity'} += $QuantityBefore1;
testGetInfoReference( $basket2Path, $basket2 );

#add 3rd product to basket2
testUpdateBasket( $basket2Path,  {
    'LineItemContainer' => {
        'CurrencyID'        => 'EUR',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => $GUID{de_3201212002}, 'Quantity' => '1'},
        ],
    },
});

#check info of basket2
push @{$basket2->{LineItemContainer}->{ProductLineItems}},
    {'Product' => $GUID{de_3201212002}, 'Quantity' => '1'};
my $hBasket = testGetInfoReference( $basket2Path, $basket2 );

#change first line item product to basket2
my $hContainer = $hBasket->{LineItemContainer};
my $hLineItem = $hContainer->{'ProductLineItems'}->[0];
my $changedProduct = $hLineItem->{Product};
my $changedQuantity = 17;
my $LineItem = { Alias=>$hLineItem->{Alias}, Quantity=>$changedQuantity};
testUpdateLineItem( $basket2Path, $LineItem,  $basket2 );

#check info of basket2
foreach $LineItem (@{$basket2->{'LineItemContainer'}->{'ProductLineItems'}}) {
    $LineItem->{'Quantity'} = $changedQuantity if $LineItem->{Product} eq $changedProduct;
}
$hBasket = testGetInfoReference( $basket2Path, $basket2 );


#remove last changed line item
testDeleteLineItem( $basket2Path, $hLineItem->{Alias} );

#check info of basket2
my @Items = grep {$_ if $_->{Product} ne $changedProduct} @{$basket2->{'LineItemContainer'}->{'ProductLineItems'}};
$basket2->{'LineItemContainer'}->{'ProductLineItems'} = \@Items;
$hBasket = testGetInfoReference( $basket2Path, $basket2 );


#put this prodcut back to basket
$LineItem = { GUID=>$changedProduct, Quantity=>$changedQuantity};
testAddProductLineItem( $basket2Path, $LineItem,  $basket2 );

#check info of basket2
push @{$basket2->{LineItemContainer}->{ProductLineItems}},
    { Product=>$changedProduct, Quantity=>$changedQuantity};
testGetInfoReference( $basket2Path, $basket2 );


#delete basket2
testDeleteBasket( $basket2Path );

#dont exists basket2?
testExistsByPath( $basket2Path, 0 );


#create basket3 with 2 products and address data
my $basket3 = {
    'BillingAddress' => {
        'EMail'     => 'mmustermann@epages.de',
        'FirstName' => 'Max',
        'LastName'  => 'Mustermann',
        'Street'    => 'Musterstrasse 2',
        'Street2'   => 'Ortsteil Niederfingeln',
        'CodePorte' => '13a',
    },
    'LineItemContainer' => {
        'CurrencyID'        => 'EUR',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => $GUID{ho_1112105010}, 'Quantity' => '2'},
            {'Product' => $GUID{eg_1000111010}, 'Quantity' => '3'},
        ],
    },
};
my $basket3Path = testCreateBasket( $basket3 );

#chek if exist
testExistsByPath( $basket3Path, 1 );

#check result of creation
$hBasket = testGetInfoReference( $basket3Path, $basket3 );

#delete basket3
testDeleteBasket( $basket3Path );

#dont exists basket3?
testExistsByPath( $basket3Path, 0 );




