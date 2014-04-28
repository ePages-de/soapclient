use strict;
use Test::More tests => 39;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);

my $PriceListAssignService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/PriceListAssignmentService/2005/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'product'   => 'Products/ho_1112105010',
    'pricelist' => 'PriceLists/RegularCustomer_EUR',
};

my $quantityDiscounts = [
    {'Quantity'  => 100, 'Discount' => 10 },
    {'Quantity'  => 200, 'Discount' => 20 },
];
my $valueDiscounts = [
    {'Value'  => 100, 'Discount' => 10 },
    {'Value'  => 200, 'Discount' => 20 },
];

my $scalePrices = [
    {'Quantity'  => 10, 'Price' => 100 },
    {'Quantity'  => 20, 'Price' => 200 },
];

# Create a QuantityDiscount and check if the creation was successful
sub testSetQuantityDiscounts {

    my $PriceListAssignment_in = {
        'Product' => $options->{'product'},
        'PriceList' => $options->{'pricelist'},
        'QuantityDiscounts' => $quantityDiscounts,
    };

    my $ahResults = $PriceListAssignService->setQuantityDiscounts( [$PriceListAssignment_in] )->result;
    ok( scalar @$ahResults == 1, "setQuantityDiscounts result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "setQuantityDiscounts: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq $PriceListAssignment_in->{'Product'}, "product" );
    ok( $hResult->{'updated'} == 1, "updated?" );
}

# Retrieve information about an QuantityDiscount. Check if the returned data are equal to
# the data of create or update call
sub testGetQuantityDiscounts {

    my $ahResults = $PriceListAssignService->getQuantityDiscounts( [$options->{'product'}], [$options->{'pricelist'}] )->result;
    ok( scalar @$ahResults == 1, "getQuantityDiscounts result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getQuantityDiscounts: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq WEBSERVICE_SHOP_PATH.$options->{'product'}, "product" );

    my $aPriceLists = $hResult->{'PriceLists'};
    ok( scalar @$aPriceLists == 1, "number of pricelists" );

    my $PriceList = $aPriceLists->[0];
    ok( $PriceList->{'PriceList'} eq WEBSERVICE_SHOP_PATH.$options->{'pricelist'}, "pricelist path" );

    my $quantityDiscounts_out = $PriceList->{'QuantityDiscounts'};
    ok( $quantityDiscounts_out->[0]->{'Quantity'} == $quantityDiscounts->[0]->{'Quantity'}, "quantity" );
    ok( $quantityDiscounts_out->[0]->{'Discount'} == $quantityDiscounts->[0]->{'Discount'}, "discount" );

    ok( $quantityDiscounts_out->[1]->{'Quantity'} == $quantityDiscounts->[1]->{'Quantity'}, "quantity" );
    ok( $quantityDiscounts_out->[1]->{'Discount'} == $quantityDiscounts->[1]->{'Discount'}, "discount" );
}

# Create a ValueDiscount and check if the creation was successful
sub testSetValueDiscounts {

    my $PriceListAssignment_in = {
        'Product' => $options->{'product'},
        'PriceList' => $options->{'pricelist'},
        'ValueDiscounts' => $valueDiscounts,
    };

    my $ahResults = $PriceListAssignService->setValueDiscounts( [$PriceListAssignment_in] )->result;
    ok( scalar @$ahResults == 1, "setValueDiscounts result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "setValueDiscounts: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq $PriceListAssignment_in->{'Product'}, "product" );
    ok( $hResult->{'updated'} == 1, "updated?" );
}

# Retrieve information about an ValueDiscount. Check if the returned data are equal to
# the data of create or update call
sub testGetValueDiscounts {

    my $ahResults = $PriceListAssignService->getValueDiscounts( [$options->{'product'}], [$options->{'pricelist'}] )->result;
    ok( scalar @$ahResults == 1, "getValueDiscounts result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getValueDiscounts: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq WEBSERVICE_SHOP_PATH.$options->{'product'}, "product" );

    my $aPriceLists = $hResult->{'PriceLists'};
    ok( scalar @$aPriceLists == 1, "number of pricelists" );

    my $PriceList = $aPriceLists->[0];
    ok( $PriceList->{'PriceList'} eq WEBSERVICE_SHOP_PATH.$options->{'pricelist'}, "pricelist path" );

    my $valueDiscounts_out = $PriceList->{'ValueDiscounts'};
    ok( $valueDiscounts_out->[0]->{'Value'}     == $valueDiscounts->[0]->{'Value'},     "value" );
    ok( $valueDiscounts_out->[0]->{'Discount'}  == $valueDiscounts->[0]->{'Discount'},  "discount" );

    ok( $valueDiscounts_out->[1]->{'Value'}     == $valueDiscounts->[1]->{'Value'},     "value" );
    ok( $valueDiscounts_out->[1]->{'Discount'}  == $valueDiscounts->[1]->{'Discount'},  "discount" );
}

# Create a ScalePrice and check if the creation was successful
sub testSetScalePrices {

    my $PriceListAssignment_in = {
        'Product' => $options->{'product'},
        'PriceList' => $options->{'pricelist'},
        'ScalePrices' => $scalePrices,
    };

    my $ahResults = $PriceListAssignService->setScalePrices( [$PriceListAssignment_in] )->result;
    ok( scalar @$ahResults == 1, "setScalePrices result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "setScalePrices: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq $PriceListAssignment_in->{'Product'}, "product" );
    ok( $hResult->{'updated'} == 1, "updated?" );
}

# Retrieve information about an ScalePrice. Check if the returned data are equal to
# the data of create or update call
sub testGetScalePrices {

    my $ahResults = $PriceListAssignService->getScalePrices( [$options->{'product'}], [$options->{'pricelist'}] )->result;
    ok( scalar @$ahResults == 1, "getScalePrices result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getScalePrices: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq WEBSERVICE_SHOP_PATH.$options->{'product'}, "product" );

    my $aPriceLists = $hResult->{'PriceLists'};
    ok( scalar @$aPriceLists == 1, "number of pricelists" );

    my $PriceList = $aPriceLists->[0];
    ok( $PriceList->{'PriceList'} eq WEBSERVICE_SHOP_PATH.$options->{'pricelist'}, "pricelist path" );

    my $scalePrices_out = $PriceList->{'ScalePrices'};
    ok( $scalePrices_out->[0]->{'Quantity'} == $scalePrices->[0]->{'Quantity'}, "quantity" );
    ok( $scalePrices_out->[0]->{'Price'}    == $scalePrices->[0]->{'Price'},    "price" );

    ok( $scalePrices_out->[1]->{'Quantity'} == $scalePrices->[1]->{'Quantity'}, "quantity" );
    ok( $scalePrices_out->[1]->{'Price'}    == $scalePrices->[1]->{'Price'},    "price" );
}

# run test suite
testSetQuantityDiscounts();
testGetQuantityDiscounts();
testSetValueDiscounts();
testGetValueDiscounts();
testSetScalePrices();
testGetScalePrices();
