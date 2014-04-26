use strict;
use Test::More tests => 54;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $CrossSellingService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/CrossSellingService/2006/05' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'Product'       => 'Products/de_3203104010', #Deuter Kangaroo
    'TargetProduct' => 'Products/de_3206199010', #Deuter Schmusebär
    'TargetProduct2'=> 'Products/de_3201212002', #Deuter Hydro 2.0
    'TargetProduct3'=> 'Products/eg_1000111010', #Eureka El Capitan IV
};

my $CrossSelling_in = {
    'Product'         => $options->{'Product'},
    'TargetProduct'   => $options->{'TargetProduct'},
};

my $aCrossSelling_in2 = [
    {
        'Product'         => $options->{'Product'},
        'TargetProduct'   => $options->{'TargetProduct2'},
        'Type'            => 'Accessory',
    },
    {
        'Product'         => $options->{'Product'},
        'TargetProduct'   => $options->{'TargetProduct3'},
        'Type'            => 'ProductComparison',
    },
    {
        'Product'         => $options->{'Product'},
        'TargetProduct'   => $options->{'TargetProduct'},
        'Type'            => 'ProductComparison',
    },
];

my $CrossSelling_Get_in = {
    'Product'         => $options->{'Product'},
    'Type'            => 'CrossSelling',
};

# insert a cross selling and check if the creation was successful
sub testInsert {

    my $ahResults = $CrossSellingService->insert( [$CrossSelling_in] )->result;
    ok( scalar @$ahResults == 1, "insert: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "insert: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $options->{'Product'},       "insert: product path" );
    ok( $hResult->{'TargetProduct'} eq $options->{'TargetProduct'}, "insert: target product path" );
    ok( $hResult->{'Type'}          eq 'CrossSelling',              "insert: default type" );
    ok( $hResult->{'inserted'} == 1, "created?" );
}

# insert more cross selling different types and check if the creation was successful
sub testInsert2 {

    my $ahResults = $CrossSellingService->insert( $aCrossSelling_in2 )->result;
    ok( scalar @$ahResults == @$aCrossSelling_in2, "insert2: result count" );

    for my $i (0..scalar @$ahResults -1) {
        my $CrossSelling = $aCrossSelling_in2->[$i];
        my $hResult = $ahResults->[$i];
        ok( !$hResult->{'Error'}, "insert2: no error" );
        diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

        ok( $hResult->{'Product'}       eq $CrossSelling->{'Product'},          "insert2: product path" );
        ok( $hResult->{'TargetProduct'} eq $CrossSelling->{'TargetProduct'},    "insert2: target product path" );
        ok( $hResult->{'Type'}          eq $CrossSelling->{'Type'},             "insert2: accessory type" );
        ok( $hResult->{'inserted'} == 1, "created?" );
    }
}

# delete a cross selling and check if the deletion was successful
sub testDelete {

    my $ahResults = $CrossSellingService->delete( [$CrossSelling_in] )->result;
    ok( scalar @$ahResults == 1, "delete: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_in->{'Product'},       "delete: product path" );
    ok( $hResult->{'TargetProduct'} eq $CrossSelling_in->{'TargetProduct'}, "delete: target product path" );
    ok( $hResult->{'deleted'} == 1, "deleted?" );
}

sub testDelete2 {

    my $ahResults = $CrossSellingService->delete( $aCrossSelling_in2 )->result;
    ok( scalar @$ahResults == @$aCrossSelling_in2, "delete2: result count" );

    for my $i (0..scalar @$ahResults -1) {
        my $CrossSelling = $aCrossSelling_in2->[$i];
        my $hResult = $ahResults->[$i];
        ok( !$hResult->{'Error'}, "delete2: no error" );
        diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

        ok( $hResult->{'Product'}       eq $CrossSelling->{'Product'},          "delete2: product path" );
        ok( $hResult->{'TargetProduct'} eq $CrossSelling->{'TargetProduct'},    "delete2: target product path" );
        ok( $hResult->{'deleted'} == 1, "deleted?" );
    }
}

# check if a cross selling exists
sub testExists {
    my ($expected) = @_;
    my $ahResults = $CrossSellingService->exists( [$CrossSelling_in] )->result;
    ok( scalar @$ahResults == 1, "exists: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_in->{'Product'},       "exists: product path" );
    ok( $hResult->{'TargetProduct'} eq $CrossSelling_in->{'TargetProduct'}, "exists: target product path" );
    ok( $hResult->{'exists'} == $expected, "exists?" );
}

# get cross sellings
sub testGet {

    my $ahResults = $CrossSellingService->get( [$CrossSelling_Get_in] )->result;
    ok( scalar @$ahResults == 1, "get: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "get: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_Get_in->{'Product'},       "get: product path" );
    ok( $hResult->{'TargetProduct'} eq $options->{'TargetProduct'},             "get: target product path" );
}


# run test suite
testInsert();
testExists(1);
testGet();
testDelete();
testExists(0);
testInsert2();
testDelete2();
