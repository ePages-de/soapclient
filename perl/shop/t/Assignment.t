use strict;
use Test::More tests => 26;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);

# Create a SOAP::Lite client object
my $AssignmentService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/AssignmentService/2005/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'Catalog' => WEBSERVICE_SHOP_PATH.'Categories/Jackets',
    'Product' => WEBSERVICE_SHOP_PATH.'Products/ho_1112105010',
};

my $hAssignment_in = {
	'Catalog' => $options->{'Catalog'},
	'Product' => $options->{'Product'},
};

# Create a Assignment and check if the creation was successful
sub testAssignProductToCatalog {

    my $ahResults = $AssignmentService->assignProductToCatalog( [ $hAssignment_in ] )->result;
    is( scalar @$ahResults, 1, "assignProductToCatalog result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "assignProductToCatalog: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq $options->{'Product'}, "product path" );
    is( $hResult->{'assigned'}, 1, "assigned?" );
}

# get Catalogs assign to Product and check result
sub testGetCatalogsAssignedToProduct {

    my $ahResults = $AssignmentService->getCatalogsAssignedToProduct( [$options->{'Product'}] )->result;
    is( scalar @$ahResults, 1, "getCatalogsAssignedToProduct result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getCatalogsAssignedToProduct: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq $options->{'Product'}, "product path" );
    ok( scalar @{$hResult->{'Catalogs'}} > 0, "at least one Catalog?" );

    my $found = 0;
    foreach (@{$hResult->{'Catalogs'}}) {
        $found = 1 if $_->{'Path'} eq $options->{'Catalog'};
    }
    is( $found, 1, "is Catalog assigned?" );
}

# get Products assign to Catalog and check result
sub testGetProductsAssignedToCatalog {

    my $ahResults = $AssignmentService->getProductsAssignedToCatalog( [$options->{'Catalog'}] )->result;
    is( scalar @$ahResults, 1, "getProductsAssignedToCatalog result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getProductsAssignedToCatalog: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Catalog'} eq $options->{'Catalog'}, "catalog path" );
    ok( scalar @{$hResult->{'Products'}} > 0, "at least one Product" );

    my $found = 0;
    foreach (@{$hResult->{'Products'}}) {
        $found = 1 if $_->{'Path'} eq $options->{'Product'};
    }
    is( $found, 1, "is Product assigned?" );
}

# Remove an Assignment and check if no error occured.
sub testRemoveProductFromCatalog {

    my $ahResults = $AssignmentService->removeProductFromCatalog( [$hAssignment_in] )->result;
    is( scalar @$ahResults, 1, "removeProductFromCatalog result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "removeProductFromCatalog: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq $options->{'Product'}, "product path" );
    is( $hResult->{'removed'}, 1, "removed?" );
}

# Test if a Assignment exists or not
sub testIsProductAssignedToCatalog {
    my ($expected) = @_;

    my $ahResults = $AssignmentService->isProductAssignedToCatalog( [$hAssignment_in] )->result;
    is( scalar @$ahResults, 1, "isProductAssignedToCatalog result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "isProductAssignedToCatalog: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'} eq $options->{'Product'}, "product path" );
    is( $hResult->{'assigned'}, $expected, "exists?" );
}

# run test suite
testAssignProductToCatalog();
testIsProductAssignedToCatalog(1);
testGetCatalogsAssignedToProduct();
testGetProductsAssignedToCatalog();
testRemoveProductFromCatalog();
testIsProductAssignedToCatalog(0);
