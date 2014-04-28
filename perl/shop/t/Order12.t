use strict;
use Test::More tests => 161;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( TAttributes hAttributes cmpDateTime );

# Create a SOAP::Lite client object
my $OrderService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/OrderService/2013/04' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'Alias'      => 'perl_test-1',
    'Path'       => 'Customers/1001/Orders/',
    'Customer'   => 'Customers/1001',
    'Address_in' => {
        'EMail'     => 'perl_test-1@epages.de',
        'FirstName' => 'Klaus',
        'LastName'  => 'Klaussen',
        'Street'    => 'Musterstrasse 2',
        'Street2'   => 'Ortsteil Niederfingeln',
        'CodePorte' => '13a',
    },
    'Address_up' => {
        'FirstName' => 'Hans',
        'LastName'  => 'Hanssen',
        'Street'    => 'Musterstrasse 2b',
        'Street2'   => 'Ortsteil Oberfingeln',
        'CodePorte' => '13u',
    },
    'AdressAttributes' => {
        'JobTitle'  => 'best Job',
        'Salutation'=> 'Dr.',
    },
    'LineItemContainer' => {
        'CurrencyID'        => 'EUR',
        'PaymentMethod'     => 'PaymentMethods/Invoice',
        'ShippingMethod'    => 'ShippingMethods/Express',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => 'Products/ho_1112105010', 'Quantity' => '10'},
        ],
    },
    'LineItemContainer_NoShip' => {
        'CurrencyID'        => 'EUR',
        'PaymentMethod'     => 'PaymentMethods/Invoice',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => 'Products/ho_1112105010', 'Quantity' => '10'},
        ],
    },
    'LineItemContainer_NoPay' => {
        'CurrencyID'        => 'EUR',
        'ShippingMethod'    => 'ShippingMethods/Express',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => 'Products/ho_1112105010', 'Quantity' => '10'},
        ],
    },
    'LineItemContainer_NoItem' => {
        'CurrencyID'        => 'EUR',
        'PaymentMethod'     => 'PaymentMethods/Invoice',
        'ShippingMethod'    => 'ShippingMethods/Express',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
    },
    'LineItemContainer_Micro' => {
        'CurrencyID'        => 'EUR',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
    },
    'LineItemContainer_TaxLessShipping' => {
        'CurrencyID'        => 'EUR',
        'PaymentMethod'     => 'PaymentMethods/Invoice',
        'ShippingMethod'    => 'ShippingMethods/PickupByCustomer',
        'TaxArea'           => '/TaxMatrixGermany/EU',
        'TaxModel'          => 'gross',
        'ProductLineItems' => [
            {'Product' => 'Products/ho_1112105010', 'Quantity' => '10'},
        ],
    },
    'Attributes_in' => {
        'Comment'   => 'my customer commment',
    },
    'Attributes_up' => {
        'Comment'   => 'my updated customer comment',
    },
    'ViewedOn'      => '2006-01-01T20:00:00',
    'CreationDate'  => '2006-01-01T00:00:00',
    'ReturnedOn'    => '2013-04-14T03:44:55',
};
$options->{'FullPath'} = $options->{'Path'}.$options->{'Alias'};

my $Order_in = {
    'Alias'             => $options->{'Alias'},
    'Customer'          => $options->{'Customer'},
    'BillingAddress'    => $options->{'Address_in'},
    'LineItemContainer' => $options->{'LineItemContainer'},
    'ViewedOn'          => $options->{'ViewedOn'},
    'CreationDate'      => $options->{'CreationDate'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};
$Order_in->{'BillingAddress'}->{'Attributes'} = TAttributes($options->{'AdressAttributes'});

my $Order_update = {
    'Path'              => $options->{'FullPath'},
    'BillingAddress'    => $options->{'Address_up'},
    'Attributes'        => TAttributes($options->{'Attributes_up'}),
    'InProcessOn'       => $options->{'InProcessOn'},
};

my $Order_update2 = {
    'Path'              => $options->{'FullPath'},
    'ReturnedOn'       => $options->{'ReturnedOn'},
};

my $Order_update_with_empty_CreationDate = {
    'CreationDate'      => '',
};

#Orders with missing data
my $Order_in_NoPay = {
    'Alias'             => $options->{'Alias'},
    'Customer'          => $options->{'Customer'},
    'BillingAddress'    => $options->{'Address_in'},
    'LineItemContainer' => $options->{'LineItemContainer_NoPay'},
    'ViewedOn'          => $options->{'ViewedOn'},
    'CreationDate'      => $options->{'CreationDate'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};

my $Order_in_NoShip = {
    'Alias'             => $options->{'Alias'},
    'Customer'          => $options->{'Customer'},
    'BillingAddress'    => $options->{'Address_in'},
    'LineItemContainer' => $options->{'LineItemContainer_NoShip'},
    'ViewedOn'          => $options->{'ViewedOn'},
    'CreationDate'      => $options->{'CreationDate'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};

my $Order_in_NoItem = {
    'Alias'             => $options->{'Alias'},
    'Customer'          => $options->{'Customer'},
    'BillingAddress'    => $options->{'Address_in'},
    'LineItemContainer' => $options->{'LineItemContainer_NoItem'},
    'ViewedOn'          => $options->{'ViewedOn'},
    'CreationDate'      => $options->{'CreationDate'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};

my $Order_in_Micro = {
    'Alias'             => $options->{'Alias'},
    'Customer'          => $options->{'Customer'},
    'BillingAddress'    => $options->{'Address_in'},
    'LineItemContainer' => $options->{'LineItemContainer_Micro'},
    'ViewedOn'          => $options->{'ViewedOn'},
    'CreationDate'      => $options->{'CreationDate'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};

my $Order_in_NoCont = {
    'Alias'             => $options->{'Alias'},
    'Customer'          => $options->{'Customer'},
    'BillingAddress'    => $options->{'Address_in'},
    'ViewedOn'          => $options->{'ViewedOn'},
    'CreationDate'      => $options->{'CreationDate'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};

my $Order_in_TaxLessShipping = {
    'Alias'             => $options->{'Alias'},
    'Customer'          => $options->{'Customer'},
    'BillingAddress'    => $options->{'Address_in'},
    'LineItemContainer' => $options->{'LineItemContainer_TaxLessShipping'},
    'ViewedOn'          => $options->{'ViewedOn'},
    'CreationDate'      => $options->{'CreationDate'},
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
};


# Create a Order and check if the creation was successful
sub testCreate {
    my ($Order) = @_;
    $Order = $Order_in unless $Order;

    my $ahResults = $OrderService->create( [$Order] )->result;
    ok( scalar @$ahResults == 1, 'create: result count' );

    my $hCreate = $ahResults->[0];
    ok( !$hCreate->{'Error'}, 'create: no error' );
    diag $hCreate->{'Error'}->{'Message'}."\n" if $hCreate->{'Error'};

    ok( $hCreate->{'Alias'} eq $Order_in->{'Alias'}, 'order alias' );
    ok( $hCreate->{'created'} == 1, 'created?' );
}

# Update a Order and check if the update was successful
sub testUpdate {

    my $ahResults = $OrderService->update( [$Order_update] )->result;
    ok( scalar @$ahResults == 1, 'update: result count' );

    my $hUpdate = $ahResults->[0];
    ok( !$hUpdate->{'Error'}, 'update: no error' );
    diag $hUpdate->{'Error'}->{'Message'}."\n" if $hUpdate->{'Error'};

    ok( $hUpdate->{'Path'} eq $Order_update->{'Path'}, 'order path' );
    ok( $hUpdate->{'updated'} == 1, 'updated?' );

    $ahResults= $OrderService->update( [$Order_update_with_empty_CreationDate] )->result;
    ok( scalar @$ahResults == 1, 'update: result count' );

    $hUpdate = $ahResults->[0];
    ok( $hUpdate->{'Error'}, 'Update resulting in eror, because clearing the \'CreationDate\' is not allowed.' );
    ok( !$hUpdate->{'updated'}, 'Update was not successful.' );
}

# Retrieve information about an Order. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated, $hLineItemContainerComp) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $OrderService->getInfo( [$options->{'FullPath'}], ['Comment'], [] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result set' );

    my $hInfo = $ahResults->[0];
    ok( !$hInfo->{'Error'}, 'getInfo: no error' );
    diag "Error: $hInfo->{'Error'}\n" if $hInfo->{'Error'};

    ok( $hInfo->{'Path'}     eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'},      'order path' );
    ok( $hInfo->{'Customer'} eq WEBSERVICE_SHOP_PATH.$Order_in->{'Customer'}, 'customer' );
    ok( 0 == cmpDateTime($hInfo->{'CreationDate'}, $options->{'CreationDate'}),  'CreationDate' );
    ok( 0 == cmpDateTime($hInfo->{'ViewedOn'}, $options->{'ViewedOn'}),  'ViewedOn' );

    my $hLineItemContainer  = $hInfo->{'LineItemContainer'};
    my $hLineItemContainer2 = $options->{'LineItemContainer'};
    $hLineItemContainer2 = $hLineItemContainerComp if $hLineItemContainerComp;
    ok( $hLineItemContainer->{'TaxArea'}    eq $hLineItemContainer2->{'TaxArea'},       'tax area' );
    ok( $hLineItemContainer->{'TaxModel'}   eq $hLineItemContainer2->{'TaxModel'},      'tax model' );
    ok( $hLineItemContainer->{'CurrencyID'} eq $hLineItemContainer2->{'CurrencyID'},    'currencyid' );

    ok( $hLineItemContainer->{'AllBaseLineItems'}, 'list of all base line items');
    my $hRefBaseLineItem = $options->{'LineItemContainer'}->{'ProductLineItems'}->[0];
    foreach my $hBaseLineItem (@{$hLineItemContainer->{'AllBaseLineItems'}}) {
        if ( $hBaseLineItem->{'SKU'} && ('Products/'.$hBaseLineItem->{'SKU'} eq $hRefBaseLineItem->{'Product'}) )
        {
           ok( $hBaseLineItem->{'Class'} eq 'LineItemProduct', 'base line item is a product' );
           ok( $hBaseLineItem->{'Quantity'} eq $hRefBaseLineItem->{'Quantity'}, 'base line item quantity' );
        }
    }

    if ( $hLineItemContainer->{'ShippingLineItem'} ) {
        my $ShippingMethod = $hLineItemContainer->{'ShippingLineItem'}->{'ShippingMethod'};
        ok( $ShippingMethod eq WEBSERVICE_SHOP_PATH.$hLineItemContainer2->{'ShippingMethod'}, 'shipping' );
    }
    if ( $hLineItemContainer->{'PaymentLineItem'} ) {
        my $PaymentMethod = $hLineItemContainer->{'PaymentLineItem'}->{'PaymentMethod'};
        ok( $PaymentMethod eq WEBSERVICE_SHOP_PATH.$hLineItemContainer2->{'PaymentMethod'},   'payment' );
    }

    my $bill  = $hInfo->{'BillingAddress'};
    my $bill2 = $options->{"Address$ext"};
    ok( $bill->{'FirstName'}    eq $bill2->{'FirstName'},   'first name' );
    ok( $bill->{'LastName'}     eq $bill2->{'LastName'},    'last name' );
    ok( $bill->{'Street'}       eq $bill2->{'Street'},      'street' );
    ok( $bill->{'Street2'}      eq $bill2->{'Street2'},     'street2' );
    ok( $bill->{'CodePorte'}    eq $bill2->{'CodePorte'},   'code porte' );

    my $hAttributes = hAttributes($hInfo->{'Attributes'});
    ok( $hAttributes->{'Comment'} eq $options->{"Attributes$ext"}->{'Comment'}, 'comment' );
}

# Update a Order with new Status and check if the update was successful
sub testUpdateStatusReturned {

    my $ahResults = $OrderService->update( [$Order_update2] )->result;
    ok( scalar @$ahResults == 1, 'update: result count' );

    my $hUpdate = $ahResults->[0];
    ok( !$hUpdate->{'Error'}, 'update: no error' );
    diag $hUpdate->{'Error'}->{'Message'}."\n" if $hUpdate->{'Error'};

    ok( $hUpdate->{'Path'} eq $Order_update->{'Path'}, 'order path' );
    ok( $hUpdate->{'updated'} == 1, 'updated?' );

    #check update result
    $ahResults = $OrderService->getInfo( [$options->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result set' );

    my $hInfo = $ahResults->[0];
    ok( !$hInfo->{'Error'}, 'getInfo: no error' );
    diag "Error: $hInfo->{'Error'}\n" if $hInfo->{'Error'};

    ok( $hInfo->{'Path'}     eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'},      'order path' );

    ok( 0 == cmpDateTime($hInfo->{'ReturnedOn'}, $options->{'ReturnedOn'}),  'ReturnedOn' );
}

# Retrieve information about an Order.
# diag out additional attributes, coupon and shipping options
sub showGetInfo {
    my @Params = @_;
    my $ahResults = $OrderService->getInfo(@Params)->result;

    foreach my $hInfo (@$ahResults) {
      diag "\n\nError: $hInfo->{'Error'}\n" if $hInfo->{'Error'};

    diag"order $hInfo->{'Path'}\n";

      #additional order attributes
      if ( $hInfo->{'Attributes'} ) {
        diag"additional order attributes:\n";
          my $hAttr = hAttributes($hInfo->{'Attributes'});
          diag"$_=$hAttr->{$_}\n" foreach keys %$hAttr;
      }

      #additional address attributes
      if ( $hInfo->{'BillingAddress'}->{'Attributes'} ) {
        diag"additional address attributes:\n";
          my $hAttr = hAttributes($hInfo->{'BillingAddress'}->{'Attributes'});
          diag"$_=$hAttr->{$_}\n" foreach keys %$hAttr;
      }

      #shipping options
      if ( $hInfo->{'LineItemContainer'}->{'ShippingOptionLineItems'} ) {
        diag"first shipping option:\n";
          my %Option = %{$hInfo->{'LineItemContainer'}->{'ShippingOptionLineItems'}->[0]};
          diag"option $Option{'SKU'}:$Option{'ChoiceName'} ($Option{'Comment'}):$Option{'LineItemPrice'}\n";
      }

      #coupons
      if ( $hInfo->{'LineItemContainer'}->{'CouponLineItems'} ) {
        diag"first coupon:\n";
          my %Coupon = %{$hInfo->{'LineItemContainer'}->{'CouponLineItems'}->[0]};
          diag"coupon $Coupon{'SKU'}:$Coupon{'LineItemPrice'}\n";
      }

      #basket discounts
      if ( $hInfo->{'LineItemContainer'}->{'GlobalValueDiscountLineItems'} ) {
        diag"first basket discount:\n";
          my %Discount = %{$hInfo->{'LineItemContainer'}->{'GlobalValueDiscountLineItems'}->[0]};
          diag"discount $Discount{'SKU'}:$Discount{'Discount'}\% $Discount{'LineItemPrice'}\n";
      }

      #additional line item attributes
      my @AllLineItems = (
         @{$hInfo->{'LineItemContainer'}->{'ProductLineItems'}},
          $hInfo->{'LineItemContainer'}->{'ShippingLineItem'},
          $hInfo->{'LineItemContainer'}->{'PaymentLineItem'},
      );
      push @AllLineItems, @{$hInfo->{'LineItemContainer'}->{'ShippingOptionLineItems'}} if defined $hInfo->{'LineItemContainer'}->{'ShippingOptionLineItems'};
      push @AllLineItems, @{$hInfo->{'LineItemContainer'}->{'CouponLineItems'}} if defined $hInfo->{'LineItemContainer'}->{'CouponLineItems'};
      push @AllLineItems, @{$hInfo->{'LineItemContainer'}->{'GlobalValueDiscountLineItems'}} if defined $hInfo->{'LineItemContainer'}->{'GlobalValueDiscountLineItems'};

      diag"additional line item attributes attributes:\n" if scalar @AllLineItems;

      foreach my $LineItem ( @AllLineItems ) {
      diag"line item: $LineItem->{'Class'}($LineItem->{'SKU'}) - $LineItem->{'Name'}\n";
        if ( $LineItem->{'Attributes'} ) {
            my $hAttr = hAttributes($LineItem->{'Attributes'});
            diag"$_=$hAttr->{$_}\n" foreach keys %$hAttr;
        } else {
            diag"no additional attributes\n";
        }
      }
  }

    foreach my $hInfo (@$ahResults) {
      diag "\n\nError: $hInfo->{'Error'}\n" if $hInfo->{'Error'};

    diag"order $hInfo->{'Path'}\n";

      #additional order attributes
      if ( $hInfo->{'Attributes'} ) {
        diag"additional order attributes:\n";
          my $hAttr = hAttributes($hInfo->{'Attributes'});
          diag"$_=$hAttr->{$_}\n" foreach keys %$hAttr;
      }

      #additional address attributes
      if ( $hInfo->{'BillingAddress'}->{'Attributes'} ) {
        diag"additional address attributes:\n";
          my $hAttr = hAttributes($hInfo->{'BillingAddress'}->{'Attributes'});
          diag"$_=$hAttr->{$_}\n" foreach keys %$hAttr;
      }

      #shipping options
      if ( $hInfo->{'LineItemContainer'}->{'ShippingOptionLineItems'} ) {
        diag"first shipping option:\n";
          my %Option = %{$hInfo->{'LineItemContainer'}->{'ShippingOptionLineItems'}->[0]};
          diag"option $Option{'SKU'}:$Option{'ChoiceName'} ($Option{'Comment'}):$Option{'LineItemPrice'}\n";
      }

      #coupons
      if ( $hInfo->{'LineItemContainer'}->{'CouponLineItems'} ) {
        diag"first coupon:\n";
          my %Coupon = %{$hInfo->{'LineItemContainer'}->{'CouponLineItems'}->[0]};
          diag"coupon $Coupon{'SKU'}:$Coupon{'LineItemPrice'}\n";
      }

      #basket discounts
      if ( $hInfo->{'LineItemContainer'}->{'GlobalValueDiscountLineItems'} ) {
        diag"first basket discount:\n";
          my %Discount = %{$hInfo->{'LineItemContainer'}->{'GlobalValueDiscountLineItems'}->[0]};
          diag"discount $Discount{'SKU'}:$Discount{'Discount'}\% $Discount{'LineItemPrice'}\n";
      }

      #additional line item attributes
      my @AllLineItems = (
         @{$hInfo->{'LineItemContainer'}->{'ProductLineItems'}},
          $hInfo->{'LineItemContainer'}->{'ShippingLineItem'},
          $hInfo->{'LineItemContainer'}->{'PaymentLineItem'},
      );
      push @AllLineItems, @{$hInfo->{'LineItemContainer'}->{'ShippingOptionLineItems'}} if defined $hInfo->{'LineItemContainer'}->{'ShippingOptionLineItems'};
      push @AllLineItems, @{$hInfo->{'LineItemContainer'}->{'CouponLineItems'}} if defined $hInfo->{'LineItemContainer'}->{'CouponLineItems'};
      push @AllLineItems, @{$hInfo->{'LineItemContainer'}->{'GlobalValueDiscountLineItems'}} if defined $hInfo->{'LineItemContainer'}->{'GlobalValueDiscountLineItems'};

      diag"additional line item attributes attributes:\n" if scalar @AllLineItems;

      foreach my $LineItem ( @AllLineItems ) {
      diag"line item: $LineItem->{'Class'}($LineItem->{'SKU'}) - $LineItem->{'Name'}\n";
        if ( $LineItem->{'Attributes'} ) {
            my $hAttr = hAttributes($LineItem->{'Attributes'});
            diag"$_=$hAttr->{$_}\n" foreach keys %$hAttr;
        } else {
            diag"no additional attributes\n";
        }
      }

  }
}

sub deleteIfExists {
    my $ahResults = $OrderService->exists( [$options->{'FullPath'}] )->result;
    die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};

    if ( $ahResults->[0]->{'exists'} ) {
        $ahResults = $OrderService->delete( [$options->{'FullPath'}] )->result;
        die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};
    }
}

# Delete a Order and check if no error occured.
sub testDelete {

    my $ahResults = $OrderService->delete( [$options->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'delete: result count' );

    my $hDelete = $ahResults->[0];
    ok( !$hDelete->{'Error'}, 'delete: no error' );
    diag $hDelete->{'Error'}->{'Message'}."\n" if $hDelete->{'Error'};

    ok( $hDelete->{'Path'} eq $options->{'FullPath'}, 'delete: order path' );
    ok( $hDelete->{'deleted'} == 1, 'deleted?' );
}

# Test if a Order exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $OrderService->exists( [$options->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'exists: result count' );

    my $hExists = $ahResults->[0];
    ok( !$hExists->{'Error'}, 'exists: no error' );
    diag $hExists->{'Error'}->{'Message'}."\n" if $hExists->{'Error'};

    ok( $hExists->{'Path'} eq $options->{'FullPath'}, 'exists: order path' );
    ok( $hExists->{'exists'} == $exists, 'exists?' );
}

sub testFind {

    my $ahResults = $OrderService->find( {'Alias'=>$options->{'Alias'}, 'IsViewed'=>1} )->result;
    ok( scalar @$ahResults == 1, 'find: result count' );

    ok( $ahResults->[0] eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'}, 'find: order path' );
}

sub testFindCustomerOrders {

    my $ahResults = $OrderService->find( {'Customer'=>$options->{'Customer'}} )->result;
    ok( scalar @$ahResults >= 1, 'find: result count' );

}

sub testShippingTaxes {

    #set reduced tax of a product
    my $ProductPath = 'Products/wb_1003111010';

    my $ProductService = WebServiceClient
        ->uri( 'urn://epages.de/WebService/ProductService/2011/10' )
        ->proxy( WEBSERVICE_URL )
        ->userinfo( WEBSERVICE_USER )
        ->xmlschema('2001');
    my $ahResults = $ProductService->update([{
        'Path'  => $ProductPath,
        'TaxClass' => '/TaxMatrixGermany/reduced',
    }])->result;
    ok( scalar @$ahResults == 1, "product update result count" );

    #create an order within 2 product of different tax rates
    my $OrderAlias = $options->{'Alias'}.'_shipTaxes';
    my $ShippingTaxesOrder = {
        'Alias'             => $OrderAlias,
        'Customer'          => $options->{'Customer'},
        'BillingAddress'    => $options->{'Address_in'},
        'LineItemContainer' => {
            'CurrencyID'        => 'EUR',
            'PaymentMethod'     => 'PaymentMethods/Invoice',
            'ShippingMethod'    => 'ShippingMethods/Express',
            'TaxArea'           => '/TaxMatrixGermany/EU',
            'TaxModel'          => 'gross',
            'ProductLineItems' => [
                {'Product' => 'Products/ho_1112105010', 'Quantity' => '1'},
                {'Product' => $ProductPath, 'Quantity' => '1'},
            ],
        }
    };
    $ahResults = $OrderService->create( [$ShippingTaxesOrder] )->result;
    my $OrderPath = $ahResults->[0]->{'Path'};


    $ahResults = $OrderService->getInfo( [$OrderPath], [], [] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result set' );

    my $hInfo = $ahResults->[0];
    ok( !$hInfo->{'Error'}, 'getInfo: no error' );
    diag "Error: $hInfo->{'Error'}\n" if $hInfo->{'Error'};

    my $hLineItemContainer  = $hInfo->{'LineItemContainer'};
    my $hShippingLineItem = $hLineItemContainer->{'ShippingLineItem'};
    my $ahShippingTaxes = $hShippingLineItem->{'Taxes'};

    my $hResultShippingTaxeValue;
    foreach my $hShippingTax (@{$ahShippingTaxes}) {
        $hResultShippingTaxeValue->{$hShippingTax->{'TaxClass'}} = $hShippingTax->{'Value'};
    }
    ok( $hResultShippingTaxeValue->{'normal'} == 8.18, 'shipping tax normal '.$hResultShippingTaxeValue->{'normal'});
    ok( $hResultShippingTaxeValue->{'reduced'} == 3.82, 'shipping tax reduced '.$hResultShippingTaxeValue->{'reduced'});


    $ahResults = $OrderService->delete( [$OrderPath] )->result;
    ok( scalar @$ahResults == 1, 'delete: result count' );

    #turn back the tax class
    $ahResults = $ProductService->update([{
        'Path'  => $ProductPath,
        'TaxClass' => '/TaxMatrixGermany/normal',
    }])->result;
    ok( scalar @$ahResults == 1, "product update result count" );

}


# run test suite
deleteIfExists();
testCreate($Order_in);
testExists(1);
testFind();
testFindCustomerOrders();
testGetInfo(0);
testUpdate($Order_in);
testGetInfo(1);
testUpdateStatusReturned();
testDelete();
testExists(0);

#additional test with missing data
testCreate($Order_in_NoPay);
testDelete();
testExists(0);

testCreate($Order_in_NoShip);
testDelete();
testExists(0);

testCreate($Order_in_NoItem);
testDelete();
testExists(0);

testCreate($Order_in_Micro);
testDelete();
testExists(0);

testCreate($Order_in_TaxLessShipping);
testGetInfo(0, $options->{'LineItemContainer_TaxLessShipping'});
testDelete();
testExists(0);

testShippingTaxes();

#individual tests for the GetInfo method
#showGetInfo(
#   ['Customers/1001/Orders/1001'], #orders paths
#   ['Comment'],                    #additional order attributes
#   ['Street2'],                    #additional address attributes
#   ['TransID','Weight']            #additional lineitem attributes
#);
