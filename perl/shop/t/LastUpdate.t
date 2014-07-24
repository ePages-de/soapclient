use strict;
use Test::More tests => 62;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $UpdateService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ChangeLogService/2014/06' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductService/2013/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

my $CustomerService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/CustomerService/2013/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

sub createTestProducts {
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

sub updateStockLevel {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $ProductService->update([{
           Path => "Products/$Alias",
           StockLevel => 2,
       }]);
   }
}

sub updateListPrice {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $ProductService->update([{
           Path => "Products/$Alias",
           ProductPrices => [{CurrencyID=>'EUR',Price=>2,TaxModel=>'gross'}],
       }]);
   }
}

sub updateContent {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $ProductService->update([{
           Path => "Products/$Alias",
           Name  => [{
             LanguageCode => 'de',
             'Value' => SOAP::Data->type('string')->value("TestProduct $Alias updated")
           }],
       }]);
   }
}

sub removeTestProducts {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $ProductService->delete(["Products/$Alias"]);
   }
}


sub createTestCustomers {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $CustomerService->create([{
           Alias => $Alias,
           BillingAddress  => {
               EMail     => $Alias.'-perl-test@epages.de',
               FirstName => 'Klaus',
               LastName  => 'Klaussen',
               Street    => SOAP::Data->type('string')->value('Musterweg 42'),
               CountryID => 276,
           },
       }]);
   }
}

sub removeTestCustomers {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $CustomerService->delete(["Customers/$Alias"]);
   }
}

sub updateAddress {
   my @Aliases = @_;
   foreach my $Alias (@Aliases) {
       $CustomerService->update([{
           Path => "Customers/$Alias",
           BillingAddress  => { FirstName => 'Klausimausi'},
       }]);
   }
}

# run test suite
use Data::Dumper;

my @TestProducts = qw(Alias-01 Alias-02 Alias-03);
my @TestCustomers = qw(Cust-01 Cust-02);
removeTestCustomers(@TestCustomers);
removeTestProducts(@TestProducts);      #remove old values


#get last sync time and number of created products
my $response = $UpdateService->findCreatedObjects('2013-04-14T03:44:55', 'Product');
ok( !$response->fault, 'findCreatedObjects called to get sync date' );
my $LastSync = $response->result->{LatestCreate};
my $LastSyncNumber = scalar @{$response->result->{CreatedObjects}};
ok( $LastSyncNumber >= 0, "$LastSyncNumber created Products initial");

#get creates products again only since last sync
$response = $UpdateService->findCreatedObjects($LastSync, 'Product');
ok( !$response->fault, "findCreatedObjects($LastSync,'Product') called" );
my $ahCreates = $response->result->{CreatedObjects};
my $LastCreateNumber = scalar @$ahCreates;
ok( $LastCreateNumber >= 0, "$LastCreateNumber created Products at last sync time $LastSync");
#check if nothing of test products in the result
foreach my $Alias (@TestProducts) {
    is( (0, grep {$_->{Path} =~ m|Products/$Alias$|} @$ahCreates), "$Alias not in findCreatedObjects call before create TestProducts" );
};

#get creates customers since last sync
$response = $UpdateService->findCreatedObjects($LastSync, 'Customer');
ok( !$response->fault, "findCreatedObjects($LastSync,'Product') called" );
$ahCreates = $response->result->{CreatedObjects};
my $LastCreateCustNumber = scalar @$ahCreates;
ok( $LastCreateCustNumber >= 0, "$LastCreateCustNumber created Customer at last sync time $LastSync");
#check if nothing of test customer in the result
foreach my $Alias (@TestCustomers) {
    is( (0, grep {$_->{Path} =~ m|Customers/$Alias$|} @$ahCreates), "$Alias not in findCreatedObjects call before create TestCustomers" );
};

#get products since last sync which updated Content,StockLevel,ListPrice
$response = $UpdateService->findUpdatedObjects($LastSync, 'Product', 'Content');
ok( !$response->fault, "findUpdatedObjects($LastSync, 'Product', 'Content' called" );
my $ahUpdates = $response->result->{UpdatedObjects};
my $LastUpdateNumber = scalar @$ahUpdates;
ok( $LastUpdateNumber >= 0, "$LastUpdateNumber Content updated Products at last sync time $LastSync");
#check if nothing of test products in the result
foreach my $Alias (@TestProducts) {
    is( (0, grep {$_->{Path} =~ m|Products/$Alias$|} @$ahUpdates), "$Alias not in findUpdatedObjects Content call" );
};

$response = $UpdateService->findUpdatedObjects($LastSync, 'Product', 'StockLevel');
ok( !$response->fault, "findUpdatedObjects($LastSync, 'Product', 'StockLevel' called" );
$ahUpdates = $response->result->{UpdatedObjects};
my $LastStockNumber = scalar @$ahUpdates;
ok( $LastStockNumber >= 0, "$LastStockNumber StockLevel updated Products at last sync time $LastSync");
#check if nothing of test products in the result
foreach my $Alias (@TestProducts) {
    is( (0, grep {$_->{Path} =~ m|Products/$Alias$|} @$ahUpdates), "$Alias not in findUpdatedObjects StockLevel call" );
};

$response = $UpdateService->findUpdatedObjects($LastSync, 'Product', 'ListPrice');
ok( !$response->fault, "findUpdatedObjects($LastSync, 'Product', 'ListPrice' called" );
$ahUpdates = $response->result->{UpdatedObjects};
my $LastPriceNumber = scalar @$ahUpdates;
ok( $LastPriceNumber >= 0, "$LastPriceNumber Content updated Products at last sync time $LastSync");
#check if nothing of test products in the result
foreach my $Alias (@TestProducts) {
    is( (0, grep {$_->{Path} =~ m|Products/$Alias$|} @$ahUpdates), "$Alias not in findUpdatedObjects ListPrice call" );
};

#get customers since last sync which updated Address
$response = $UpdateService->findUpdatedObjects($LastSync, 'Customer', 'Address');
ok( !$response->fault, "findUpdatedObjects($LastSync, 'Customer', 'Address' called" );
$ahUpdates = $response->result->{UpdatedObjects};
my $LastUpdateCustNumber = scalar @$ahUpdates;
ok( $LastUpdateCustNumber >= 0, "$LastUpdateCustNumber Address updated Customer at last sync time $LastSync");
#check if nothing of test customers in the result
foreach my $Alias (@TestCustomers) {
    is( (0, grep {$_->{Path} =~ m|Customers/$Alias$|} @$ahUpdates), "$Alias not in findUpdatedObjects Address call" );
};



createTestProducts(@TestProducts);      #create some test products
createTestCustomers(@TestCustomers);      #create some test customers

#get last sync time and number of created products
$response = $UpdateService->findCreatedObjects($LastSync, 'Product');
ok( !$response->fault, "findCreatedObjects($LastSync,'Product') called" );
$ahCreates = $response->result->{CreatedObjects};
is( 3+$LastCreateNumber, @$ahCreates, '3 more created Products');
#check if all test products in the result
foreach my $Alias (@TestProducts) {
    is( (1, grep {$_->{Path} =~ m|Products/$Alias$|} @$ahCreates), "$Alias in findCreatedObjects call after create TestProducts" );
};

sleep( 3 );

#update content, and get new sync time
updateContent($TestProducts[0]);
$response = $UpdateService->findUpdatedObjects(  $LastSync, 'Product', 'Content');
ok( !$response->fault, "findUpdatedObjects($LastSync,'Product','Content') called to get new sync date" );
my $NewSync = $response->result->{LatestUpdate};
$LastSyncNumber = scalar @{$response->result->{UpdatedObjects}};
ok( 1, "have $LastSyncNumber Content updates after $LastSync");

$response = $UpdateService->findUpdatedObjects(  $NewSync, 'Product', 'Content');
ok( !$response->fault, "findUpdatedObjects($NewSync,'Product','Content') called" );
$ahUpdates = $response->result->{UpdatedObjects};
$LastSyncNumber = scalar @{$ahUpdates};
is( 1, $LastSyncNumber, "1 Content updates after $NewSync");
ok( $ahUpdates->[0]->{Path} =~ m|Products/$TestProducts[0]$|, 'Path of Content update');

#update stock level
updateStockLevel($TestProducts[1]);
$response = $UpdateService->findUpdatedObjects($NewSync, 'Product', 'StockLevel');
ok( !$response->fault, "findUpdatedObjects($NewSync,'Product','StockLevel') called" );
$ahUpdates = $response->result->{UpdatedObjects};
is( 1, @$ahUpdates, "1 StockLevel update after $NewSync");
ok( $ahUpdates->[0]->{Path} =~ m|Products/$TestProducts[1]$|, 'Path of StockLevel update');

#update price
updateListPrice($TestProducts[2]);
$response = $UpdateService->findUpdatedObjects($NewSync, 'Product', 'ListPrice');
ok( !$response->fault, "findUpdatedObjects($NewSync,'Product','ListPrice') called" );
$ahUpdates = $response->result->{UpdatedObjects};
is( 1, @$ahUpdates, "1 ListPrice update after $NewSync");
ok( $ahUpdates->[0]->{Path} =~ m|Products/$TestProducts[2]$|, 'Path of StockLevel update');

#update customer address
updateAddress($TestCustomers[0]);
$response = $UpdateService->findUpdatedObjects($NewSync, 'Customer', 'Address');
ok( !$response->fault, "findUpdatedObjects($NewSync,'Customer','Address') called" );
$ahUpdates = $response->result->{UpdatedObjects};
is( 1, @$ahUpdates, "1 address update after $NewSync");
ok( $ahUpdates->[0]->{Path} =~ m|Customers/$TestCustomers[0]$|, 'Path of Address update');


#get deletes after last sync
$response = $UpdateService->findDeletedObjects( $NewSync, 'Product' );
ok( !$response->fault, 'findDeletedObjects Product called' );
my $ahDeletes = $response->result->{DeletedObjects};
is( 0, scalar @$ahDeletes, 'no product deletes jet');

$response = $UpdateService->findDeletedObjects( $NewSync, 'Customer' );
ok( !$response->fault, 'findDeletedObjects Customer called' );
$ahDeletes = $response->result->{DeletedObjects};
is( 0, scalar @$ahDeletes, 'no customer deletes jet');

#remove
removeTestProducts(@TestProducts);
removeTestCustomers(@TestCustomers);

#check remove
$response = $UpdateService->findDeletedObjects( $NewSync, 'Product' );
ok( !$response->fault, 'findDeletedObjects called' );
$ahDeletes = $response->result->{DeletedObjects};
is( 3, @$ahDeletes, '3 product deletes now');
#check if all test products in the result
foreach my $Alias (@TestProducts) {
    is( (1, grep {$_->{Path} =~ m|Products/$Alias$|} @$ahDeletes), "$Alias in findDeletedObjects call after remove TestProducts" );
};
$response = $UpdateService->findDeletedObjects( $NewSync, 'Customer' );
ok( !$response->fault, 'findDeletedObjects called' );
$ahDeletes = $response->result->{DeletedObjects};
is( 2, @$ahDeletes, '2 customer deletes now');
#check if all test customers in the result
foreach my $Alias (@TestCustomers) {
    is( (1, grep {$_->{Path} =~ m|Customers/$Alias$|} @$ahDeletes), "$Alias in findDeletedObjects call after remove TestCustomers" );
};

