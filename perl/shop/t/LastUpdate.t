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
my $response = $UpdateService->findCreates('2013-04-14T03:44:55', 'Product');
ok( !$response->fault, 'findCreates called to get sync date' );
my $LastSync = $response->result->{LatestCreate};
my $LastSyncNumber = scalar @{$response->result->{Creates}};
ok( $LastSyncNumber >= 0, "$LastSyncNumber created Products initial");

#get creates products again only since last sync
$response = $UpdateService->findCreates($LastSync, 'Product');
ok( !$response->fault, "findCreates($LastSync,'Product') called" );
my $ahCreates = $response->result->{Creates};
my $LastCreateNumber = scalar @$ahCreates;
ok( $LastCreateNumber >= 0, "$LastCreateNumber created Products at last sync time $LastSync");
#check if nothing of test products in the result
foreach my $Alias (@TestProducts) {
    ok( (0 == grep {$_->{Path} =~ m|Products/$Alias$|} @$ahCreates), "$Alias not in findCreates call before create TestProducts" );   
};

#get creates customers since last sync
$response = $UpdateService->findCreates($LastSync, 'Customer');
ok( !$response->fault, "findCreates($LastSync,'Product') called" );
$ahCreates = $response->result->{Creates};
my $LastCreateCustNumber = scalar @$ahCreates;
ok( $LastCreateCustNumber >= 0, "$LastCreateCustNumber created Customer at last sync time $LastSync");
#check if nothing of test customer in the result
foreach my $Alias (@TestCustomers) {
    ok( (0 == grep {$_->{Path} =~ m|Customers/$Alias$|} @$ahCreates), "$Alias not in findCreates call before create TestCustomers" );   
};

#get products since last sync which updated Content,StockLevel,ListPrice
$response = $UpdateService->findUpdates($LastSync, 'Product', 'Content');
ok( !$response->fault, "findUpdates($LastSync, 'Product', 'Content' called" );
my $ahUpdates = $response->result->{Updates};
my $LastUpdateNumber = scalar @$ahUpdates;
ok( $LastUpdateNumber >= 0, "$LastUpdateNumber Content updated Products at last sync time $LastSync");
#check if nothing of test products in the result
foreach my $Alias (@TestProducts) {
    ok( (0 == grep {$_->{Path} =~ m|Products/$Alias$|} @$ahUpdates), "$Alias not in findUpdates Content call" );   
};

$response = $UpdateService->findUpdates($LastSync, 'Product', 'StockLevel');
ok( !$response->fault, "findUpdates($LastSync, 'Product', 'StockLevel' called" );
$ahUpdates = $response->result->{Updates};
my $LastStockNumber = scalar @$ahUpdates;
ok( $LastStockNumber >= 0, "$LastStockNumber StockLevel updated Products at last sync time $LastSync");
#check if nothing of test products in the result
foreach my $Alias (@TestProducts) {
    ok( (0 == grep {$_->{Path} =~ m|Products/$Alias$|} @$ahUpdates), "$Alias not in findUpdates StockLevel call" );   
};

$response = $UpdateService->findUpdates($LastSync, 'Product', 'ListPrice');
ok( !$response->fault, "findUpdates($LastSync, 'Product', 'ListPrice' called" );
$ahUpdates = $response->result->{Updates};
my $LastPriceNumber = scalar @$ahUpdates;
ok( $LastPriceNumber >= 0, "$LastPriceNumber Content updated Products at last sync time $LastSync");
#check if nothing of test products in the result
foreach my $Alias (@TestProducts) {
    ok( (0 == grep {$_->{Path} =~ m|Products/$Alias$|} @$ahUpdates), "$Alias not in findUpdates ListPrice call" );   
};

#get customers since last sync which updated Address
$response = $UpdateService->findUpdates($LastSync, 'Customer', 'Address');
ok( !$response->fault, "findUpdates($LastSync, 'Customer', 'Address' called" );
$ahUpdates = $response->result->{Updates};
my $LastUpdateCustNumber = scalar @$ahUpdates;
ok( $LastUpdateCustNumber >= 0, "$LastUpdateCustNumber Address updated Customer at last sync time $LastSync");
#check if nothing of test customers in the result
foreach my $Alias (@TestCustomers) {
    ok( (0 == grep {$_->{Path} =~ m|Customers/$Alias$|} @$ahUpdates), "$Alias not in findUpdates Address call" );   
};



createTestProducts(@TestProducts);      #create some test products
createTestCustomers(@TestCustomers);      #create some test customers

#get last sync time and number of created products
$response = $UpdateService->findCreates($LastSync, 'Product');
ok( !$response->fault, "findCreates($LastSync,'Product') called" );
$LastSync = $response->result->{LatestCreate};
$ahCreates = $response->result->{Creates};
ok( 3+$LastCreateNumber == @$ahCreates, '3 more created Products');
#check if all test products in the result
foreach my $Alias (@TestProducts) {
    ok( (1 == grep {$_->{Path} =~ m|Products/$Alias$|} @$ahCreates), "$Alias in findCreates call after create TestProducts" );   
};

sleep( 2 );

#update content, and get new sync time
updateContent($TestProducts[0]);
$response = $UpdateService->findUpdates(  $LastSync, 'Product', 'Content');
ok( !$response->fault, "findUpdates($LastSync,'Product','Content') called to get new sync date" );
my $NewSync = $response->result->{LatestUpdate};
$LastSyncNumber = scalar @{$response->result->{Updates}};
ok( 1, "have $LastSyncNumber Content updates after $LastSync");

$response = $UpdateService->findUpdates(  $NewSync, 'Product', 'Content');
ok( !$response->fault, "findUpdates($NewSync,'Product','Content') called" );
$ahUpdates = $response->result->{Updates};
$LastSyncNumber = scalar @{$ahUpdates};
ok( 1 == $LastSyncNumber, "1 Content updates after $NewSync");
ok( $ahUpdates->[0]->{Path} =~ m|Products/$TestProducts[0]$|, 'Path of Content update');

#update stock level
updateStockLevel($TestProducts[1]);
$response = $UpdateService->findUpdates($NewSync, 'Product', 'StockLevel');
ok( !$response->fault, "findUpdates($NewSync,'Product','StockLevel') called" );
$ahUpdates = $response->result->{Updates};
ok( 1 == @$ahUpdates, "1 StockLevel update after $NewSync");
ok( $ahUpdates->[0]->{Path} =~ m|Products/$TestProducts[1]$|, 'Path of StockLevel update');

#update price
updateListPrice($TestProducts[2]);
$response = $UpdateService->findUpdates($NewSync, 'Product', 'ListPrice');
ok( !$response->fault, "findUpdates($NewSync,'Product','ListPrice') called" );
$ahUpdates = $response->result->{Updates};
ok( 1 == @$ahUpdates, "1 ListPrice update after $NewSync");
ok( $ahUpdates->[0]->{Path} =~ m|Products/$TestProducts[2]$|, 'Path of StockLevel update');

#update customer address
updateAddress($TestCustomers[0]);
$response = $UpdateService->findUpdates($NewSync, 'Customer', 'Address');
ok( !$response->fault, "findUpdates($NewSync,'Customer','Address') called" );
$ahUpdates = $response->result->{Updates};
ok( 1 == @$ahUpdates, "1 address update after $NewSync");
ok( $ahUpdates->[0]->{Path} =~ m|Customers/$TestCustomers[0]$|, 'Path of Address update');


#get deletes after last sync
$response = $UpdateService->findDeletes( $NewSync, 'Product' );
ok( !$response->fault, 'findDeletes Product called' );
ok( 0 == @{$response->result->{Deletes}}, 'no product deletes jet');
$response = $UpdateService->findDeletes( $NewSync, 'Customer' );
ok( !$response->fault, 'findDeletes Customer called' );
ok( 0 == @{$response->result->{Deletes}}, 'no customer deletes jet');

#remove
removeTestProducts(@TestProducts);
removeTestCustomers(@TestCustomers);

#check remove
$response = $UpdateService->findDeletes( $NewSync, 'Product' );
ok( !$response->fault, 'findDeletes called' );
my $ahDeletes = $response->result->{Deletes};
ok( 3 == @$ahDeletes, '3 product deletes now');
#check if all test products in the result
foreach my $Alias (@TestProducts) {
    ok( (1 == grep {$_->{Path} =~ m|Products/$Alias$|} @$ahDeletes), "$Alias in findDeletes call after remove TestProducts" );   
};
$response = $UpdateService->findDeletes( $NewSync, 'Customer' );
ok( !$response->fault, 'findDeletes called' );
$ahDeletes = $response->result->{Deletes};
ok( 2 == @$ahDeletes, '2 customer deletes now');
#check if all test customers in the result
foreach my $Alias (@TestCustomers) {
    ok( (1 == grep {$_->{Path} =~ m|Customers/$Alias$|} @$ahDeletes), "$Alias in findDeletes call after remove TestCustomers" );   
};

