use strict;
use Test::More tests => 28;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $ProductBundleService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductBundleService/2007/07' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my %Options = (
    'Product'           => 'Products/cg_0100504001',
    'BundledProduct'    => 'Products/de_3203104010', #Deuter Kangaroo
    'BundledProduct2'   => 'Products/eg_1000111010', #Eureka El Capitan IV
);

my $Exists = {
    'Product'           => $Options{'Product'},
    'BundledProduct'    => $Options{'BundledProduct'},
};

my $Create = {
    'Product'           => $Options{'Product'},
    'BundledProducts'   => [
        {
            'Path' => $Options{'BundledProduct'},
            'Position' => 10,
            'Quantity' => 3,
        },
        {
            'Path' => $Options{'BundledProduct2'},
            'Position' => 20,
            'Quantity' => 1,
        },
    ],
};

my $CreateSelfBundle = {
    'Product'           => $Options{'Product'},
    'BundledProducts'   => [
        {
            'Path' => $Options{'Product'},
            'Position' => 10,
            'Quantity' => 3,
        },
    ],
};

my $CreateBundledLoop = {
    'Product'           => $Options{'BundledProduct'},
    'BundledProducts'   => [
        {
            'Path' => $Options{'Product'},
            'Position' => 10,
            'Quantity' => 1,
        },
    ],
};

my $Delete = {
    'Product'           => $Options{'Product'},
    'BundledProducts'   => [
        {
            'Path' => $Options{'BundledProduct'},
        }
    ],
};

my $GetInfo = $Options{'Product'};

# insert a product bundle and check if the creation was successful
sub testCreate {

    my $ahResults = $ProductBundleService->create( [$Create] )->result;
    is( scalar @$ahResults, 1, "create: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}        eq $Create->{'Product'},        "create: product path" );
    is( $hResult->{'created'}, 1, "created?" );
}

# delete a product bundle
sub testDelete {

    my $ahResults = $ProductBundleService->delete( [$Delete] )->result;
    is( scalar @$ahResults, 1, "delete: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}        eq $Delete->{'Product'},        "delete: product path" );
    is( $hResult->{'deleted'}, 1, "deleted?" );
}

# check if product bundle exists
sub testExists {
    my ($expected) = @_;

    my $ahResults = $ProductBundleService->exists( [$Exists] )->result;
    is( scalar @$ahResults, 1, "exists: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}        eq $Exists->{'Product'},        "exists: product path" );
    ok( $hResult->{'BundledProduct'} eq $Exists->{'BundledProduct'}, "exists: bundled product path" );
    is( $hResult->{'exists'}, $expected, "exists?" );
}

# get cross sellings after insert
sub testGetInfo {

    my $ahResults = $ProductBundleService->getInfo( [$GetInfo] )->result;
    is( scalar @$ahResults, 1, "getInfo: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

}

# insert a product bundle and check if the creation was successful
sub testCreateWrongBundles {

    my $ahResults = $ProductBundleService->create( [$CreateSelfBundle] )->result;
    is( scalar @$ahResults, 1, "create(wrong)1: result count" );
    my $hResult = $ahResults->[0];
    ok( $hResult->{'Error'}, "create(wrong)1: error" ); #can not bundled with itself.
    ok( $hResult->{'Error'}->{'Message'} =~ /can not bundled with itself/, "create(wrong)1: error message = can not bundled with itself" );

    $ahResults = $ProductBundleService->create( [$CreateBundledLoop] )->result;
    is( scalar @$ahResults, 1, "create(wrong)2: result count" );
    $hResult = $ahResults->[0];
    ok( $hResult->{'Error'}, "create(wrong)2: error" ); #can't be added to the bundle, because it is a bundle
    ok( $hResult->{'Error'}->{'Message'} =~ /can't be added to the bundle, because it is a bundle/, "create(wrong)2: error message = can't be added to the bundle, because it is a bundle" );

}



# run test suite
testCreate();
testCreateWrongBundles();
testExists(1);
testGetInfo();
testDelete();
testGetInfo();
testExists(0);
