use strict;
use utf8;
use Test::More tests => 28;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH );

my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ResourceService/2009/08' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

my $hOptions = {
    'Alias' => 'perl_test_ress-1',
    'Path'  => 'Appointments',
};
$hOptions->{'FullPath'} = $hOptions->{'Path'}.'/'.$hOptions->{'Alias'};

my $Product_in = {
    'Alias' => $hOptions->{'Alias'},
    'IsVisible' => SOAP::Data->type('boolean')->value(1),
};

my $Product_update = {
    'Path' => $hOptions->{'FullPath'},
};

sub testCreate {

    my $aProducts = [$Product_in];

    my $ahResults = $ProductService->create( $aProducts )->result;
    ok( scalar @$ahResults == 1, 'create result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'create: no error' );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, 'product alias' );
    ok( $hResult->{'created'} == 1, 'created?' );
}

sub testUpdate {

    my $aProducts = [$Product_update];

    my $ahResults = $ProductService->update( $aProducts )->result;
    ok( scalar @$ahResults == 1, 'update result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'update: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    ok( $hResult->{'updated'} == 1, 'updated?' );
}

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my $ahResults = $ProductService->getInfo( [$hOptions->{'FullPath'}], ['AvailabilityDate'], ['de', 'en'] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result count' );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, 'getInfo: no error' );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, 'product path' );

    my $hResult = $ahResults->[0];
    my $hReference = $alreadyUpdated ? $Product_update : $Product_in;

    # convert localized value from array to hash (languge code => value)
    my @LocAttributeNames = qw( );
    my %LocResult; my %LocReference;
    foreach my $AttributeName (@LocAttributeNames) {
        foreach my $hAttribute (@{$hResult->{$AttributeName}}) {
          $LocResult{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'};
        }
        foreach my $hAttribute (@{$hReference->{$AttributeName}}) {
          $LocReference{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'}->value();
        }
    }

    # convert localized value from array to hash (languge code => value) for attributes
    foreach my $Attribute (@{$hResult->{'Attributes'}}) {
        if ( $Attribute->{'Type'} eq 'LocalizedString' ||
             $Attribute->{'Type'} eq 'LocalizedFile')
        {
            my $AttributeName = $Attribute->{'Name'};
            foreach my $hAttribute (@{$hResult->{$AttributeName}}) {
              $LocResult{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'};
            }
            foreach my $hAttribute (@{$hReference->{$AttributeName}}) {
              $LocReference{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'}->value();
            }
        }
    }

    # convert prices to hash (CurrencyID => value)
    my $MapSub = sub {
        return map { defined $_->{'Price'} ? ($_->{'CurrencyID'} => $_->{'Price'}) : () } @_;
    };
    my %ResultPrices = $MapSub->( @{$hResult->{'ProductPrices'}} );
    my %RefPrices = $MapSub->( @{$hReference->{'ProductPrices'}} );
    is_deeply( \%ResultPrices, \%RefPrices, 'updated price' );

}

sub deleteIfExists {

    my $ahResults = $ProductService->exists( [$hOptions->{'FullPath'}] )->result;

    return unless $ahResults->[0]->{'exists'};

    $ProductService->delete( [$hOptions->{'FullPath'}] );
}

sub testDelete {

    my $ahResults = $ProductService->delete( [$hOptions->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'delete result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'delete: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    ok( $hResult->{'deleted'} == 1, 'deleted?' );
}

sub testExists {
    my ($exists) = @_;

    my $ahResults = $ProductService->exists( [$hOptions->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'exists result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'exists: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'product path' );
    ok( $hResult->{'exists'} == $exists, 'exists?' );
}

# run test suite
deleteIfExists();
testCreate();
testExists(1);
testGetInfo(0);
testUpdate();
testGetInfo(1);
testDelete();
testExists(0);
