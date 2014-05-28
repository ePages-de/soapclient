use strict;
use Test::More tests => 1;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $UpdateService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/UpdateService/2014/06' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductService/2013/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# find deleted products
sub testfindDeletes {
    my $results = $UpdateService->findDeletes('2013-04-14T03:44:55', 'Product');
    ok( !$results->fault, 'findDeletes called' );
}

# find updated products
sub testfindUpdatesStock {
    my $results = $UpdateService->findUpdates('2013-04-14T03:44:55', 'Product', 'StockLevel');
    ok( !$results->fault, 'findUpdates called' );
}

sub createTestProducts() {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $ProductService->create([{
           Alias => $Alias,
           Name  => [{
             LanguageCode => 'de',
             'Value' => SOAP::Data->type('string')->value("TestProduct $Alias")
           }],
           StockLevel => 1,
           ProductPrices => [{CurrencyID => 'EUR', Price => 1, TaxModel => 'gross', }],
       }]);
   }
}

sub updateStockLevel() {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $ProductService->update([{
           Path => "Products/$Alias",
           StockLevel => 2,
       }]);
   }
}

sub removeTestProducts() {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $ProductService->delete(["Products/$Alias"]);
   }
}

# run test suite
my @TestProducts = qw(Alias-01 Alias-02 Alias-03);
createTestProducts(@TestProducts);      #create some test products
testfindUpdatesStock(0,@TestProducts);  #find no updates related to test products
testfindDeletes(0,@TestProducts);       #find no deletes related to test products
updateStockLevel($TestProducts[0]);     #update stock level
testfindUpdatesStock(1,@TestProducts);  #find 1 updated product
updateStockLevel($TestProducts[1]);     #update another stock level
testfindUpdatesStock(2,@TestProducts);  #find 2 updated products
updateStockLevel($TestProducts[0]);     #update a stock level again
testfindUpdatesStock(2,@TestProducts);  #still find only 2 updated products
removeTestProducts($TestProducts[0]);   #delete a product
testfindDeletes(1,@TestProducts);       #find 1 deleted product
removeTestProducts(@TestProducts);      #delete all product
testfindDeletes(3,@TestProducts);       #find 1 deleted product

