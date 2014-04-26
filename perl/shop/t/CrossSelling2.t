use strict;
use Test::More tests => 111;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );
use WebServiceTools qw( TLocalizedString hLocalizedString );

# Create a SOAP::Lite client object
my $CrossSellingService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/CrossSellingService/2007/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'Product'       => 'Products/de_3203104010', #Deuter Kangaroo
    'TargetProduct' => 'Products/de_3206199010', #Deuter Schmusebär
    'TargetProduct2'=> 'Products/de_3201212002', #Deuter Hydro 2.0
    'TargetProduct3'=> 'Products/eg_1000111010', #Eureka El Capitan IV
    'Comment'       => {
        'de'    => 'CrossSellingService Test',
        'en'    => 'CrossSellingService test',
    },
    'Comment_update'=> {
        'de'    => 'CrossSellingService Test Aktualisierung',
        'en'    => 'CrossSellingService test update',
    },
    'Comment_delete'=> {
        'de'    => '',
    },
};

my $CrossSelling_in = {
    'Product'         => $options->{'Product'},
    'TargetProduct'   => $options->{'TargetProduct'},
    'Type'            => 'CrossSelling',
    'Comment'         => TLocalizedString($options->{'Comment'}),
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

my $CrossSelling_update = {
    'Product'         => $options->{'Product'},
    'TargetProduct'   => $options->{'TargetProduct'},
    'Type'            => 'CrossSelling',
    'Comment'         => TLocalizedString($options->{'Comment_update'}),
};

my $CrossSelling_update2 = {
    'Product'         => $options->{'Product'},
    'TargetProduct'   => $options->{'TargetProduct'},
    'Type'            => 'CrossSelling',
    'Comment'         => TLocalizedString($options->{'Comment_delete'}),
};

my $CrossSelling_Get_in = {
    'Product'         => $options->{'Product'},
    'Type'            => 'CrossSelling',
};

my $CrossSelling_Get_invalid = {
    'Product'         => $options->{'Product'},
    'Type'            => 'CrossssSelling',
};

# delete a all cross sellings related to the product
sub testClean {

    my $aCrossSellings = [{'Product'=>$options->{'Product'},'TargetProduct'=>'*','Type'=>'*'}];
    my $result = $CrossSellingService->delete( $aCrossSellings )->result;

    my $error;
    foreach my $r (@$result) { $error=1 if defined $r->{'Error'}; }
    ok( !$error, "clean: no error" );
}

# insert a cross selling and check if the creation was successful
sub testCreate {

    my $ahResults = $CrossSellingService->create( [$CrossSelling_in] )->result;
    ok( scalar @$ahResults == 1, "create: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_in->{'Product'},       "create: product path" );
    ok( $hResult->{'TargetProduct'} eq $CrossSelling_in->{'TargetProduct'}, "create: target product path" );
    ok( $hResult->{'Type'}          eq $CrossSelling_in->{'Type'},          "create: default type" );
    ok( $hResult->{'created'} == 1, "created?" );
}

# insert more cross selling different types and check if the creation was successful
sub testCreate2 {

    my $ahResults = $CrossSellingService->create( $aCrossSelling_in2 )->result;
    ok( scalar @$ahResults == scalar @$aCrossSelling_in2, "create2: result count" );

    for my $i (0..scalar @$ahResults -1) {
        my $CrossSelling_in = $aCrossSelling_in2->[$i];
        my $hResult = $ahResults->[$i];
        ok( !$hResult->{'Error'}, "create2: no error" );
        diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

        ok( $hResult->{'Product'}       eq $CrossSelling_in->{'Product'},       "create2: product path" );
        ok( $hResult->{'TargetProduct'} eq $CrossSelling_in->{'TargetProduct'}, "create2: target product path" );
        ok( $hResult->{'Type'}          eq $CrossSelling_in->{'Type'},          "create2: type" );
        ok( $hResult->{'created'} == 1, "created?" );
    }
}

# update a cross selling and check if the update was successful
sub testUpdate {

    my $ahResults = $CrossSellingService->update( [$CrossSelling_update] )->result;
    ok( scalar @$ahResults == 1, "update: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "update: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_update->{'Product'},       "update: product path" );
    ok( $hResult->{'TargetProduct'} eq $CrossSelling_update->{'TargetProduct'}, "update: target product path" );
    ok( $hResult->{'Type'}          eq $CrossSelling_update->{'Type'},          "update: type" );
    ok( $hResult->{'updated'} == 1, "updated?" );
}

# update a cross selling with an empty comment (de)
sub testUpdate2 {

    my $ahResults = $CrossSellingService->update( [$CrossSelling_update2] )->result;
    ok( scalar @$ahResults == 1, "update2: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "update2: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_update2->{'Product'},       "update2: product path" );
    ok( $hResult->{'TargetProduct'} eq $CrossSelling_update2->{'TargetProduct'}, "update2: target product path" );
    ok( $hResult->{'Type'}          eq $CrossSelling_update2->{'Type'},          "update2: type" );
    ok( $hResult->{'updated'} == 1, "updated?" );
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

        ok( $hResult->{'Product'}       eq $CrossSelling->{'Product'},       "delete2: product path" );
        ok( $hResult->{'TargetProduct'} eq $CrossSelling->{'TargetProduct'}, "delete2: target product path" );
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

# check if a cross selling exists
sub testExists2 {
    my ($expected) = @_;

    my $ahResults = $CrossSellingService->exists( $aCrossSelling_in2 )->result;
    ok( scalar @$ahResults == @$aCrossSelling_in2, "exists2: result count" );

    for my $i (0..scalar @$ahResults -1) {
        my $CrossSelling = $aCrossSelling_in2->[$i];
        my $hResult = $ahResults->[$i];
        ok( !$hResult->{'Error'}, "exists2: no error" );
        diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

        ok( $hResult->{'Product'}       eq $CrossSelling->{'Product'},       "exists2: product path" );
        ok( $hResult->{'TargetProduct'} eq $CrossSelling->{'TargetProduct'}, "exists2: target product path" );
        ok( $hResult->{'exists'} == $expected, "exists?" );
    }
}

# get cross sellings after insert
sub testGetInfo {

    my $ahResults = $CrossSellingService->getInfo( [$CrossSelling_Get_in], ['de','en'] )->result;
    ok( scalar @$ahResults == 1, "getInfo: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_in->{'Product'},       "getInfo: product path" );
    ok( $hResult->{'TargetProduct'} eq $CrossSelling_in->{'TargetProduct'}, "getInfo: target product path" );

    my $hComment = hLocalizedString($hResult->{'Comment'});
    ok( $hComment->{'de'} eq $options->{'Comment'}{'de'},                   "getInfo: comment (de)" );
    ok( $hComment->{'en'} eq $options->{'Comment'}{'en'},                   "getInfo: comment (en)" );
}

# get cross sellings after insert
sub testGetInfoInvalid {

    my $ahResults = $CrossSellingService->getInfo( [$CrossSelling_Get_invalid] )->result;
    ok( scalar @$ahResults == 1, "getInfo invalid: result count" );

    my $hResult = $ahResults->[0];
    ok( $hResult->{'Error'}, "getInfo invalid: error" );
    ok( $hResult->{'Error'}->{'Message'} eq 'Invalid Type "'.$CrossSelling_Get_invalid->{'Type'}.'"', "getInfo invalid: error message" );
}

# get cross sellings after update
sub testGetInfo2 {

    my $ahResults = $CrossSellingService->getInfo( [$CrossSelling_Get_in], ['de','en'] )->result;
    ok( scalar @$ahResults == 1, "getInfo2: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo2: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_update->{'Product'},       "getInfo2: product path" );
    ok( $hResult->{'TargetProduct'} eq $CrossSelling_update->{'TargetProduct'}, "getInfo2: target product path" );

    my $hComment = hLocalizedString($hResult->{'Comment'});
    ok( $hComment->{'de'} eq $options->{'Comment_update'}{'de'},                "getInfo2: comment (de)" );
    ok( $hComment->{'en'} eq $options->{'Comment_update'}{'en'},                "getInfo2: comment (en)" );
}

# get cross sellings after update with empty comment (de)
sub testGetInfo3 {

    my $ahResults = $CrossSellingService->getInfo( [$CrossSelling_Get_in], ['de','en'] )->result;
    ok( scalar @$ahResults == 1, "getInfo2: result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo2: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Product'}       eq $CrossSelling_update->{'Product'},       "getInfo3: product path" );
    ok( $hResult->{'TargetProduct'} eq $CrossSelling_update->{'TargetProduct'}, "getInfo3: target product path" );

    my $hComment = hLocalizedString($hResult->{'Comment'});
    ok( $hComment->{'en'} eq $options->{'Comment_update'}{'en'}, "getInfo3: comment (en)" );
    ok( !$hComment->{'de'}, "getInfo3: comment (de)" );
}

sub testGetAllInfo {

    my $ahResults = $CrossSellingService->getInfo([{'Product'=>$options->{'Product'},'Type'=>'*'}])->result;
    ok( scalar @$ahResults == 3, "getInfo: result count" );

}



# run test suite
testClean();
testCreate();
testExists(1);
testGetInfo();
testGetInfoInvalid();
testUpdate();
testGetInfo2();
testUpdate2();
testGetInfo3();
testDelete();
testExists(0);
testCreate2();
testExists2(1);
testGetAllInfo();
testDelete2();
testExists2(0);
