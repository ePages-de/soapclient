use utf8;
use strict;
use Test::More tests => 45;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( TLocalizedString TAttributes hLocalizedString hAttributes cmpDateTime );

my $PriceListService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/PriceListService/2005/01' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my %Options = (
    'Alias'     => 'perl_test-1',
    'Path'      => 'PriceLists',
    'CurrencyID'=> 'EUR',
    'TaxModel'  => 'gross',
    'ValidFrom' => '2005-12-01T00:00:00',
    'ValidTo'   => '2005-12-31T23:59:59',
    'Customers' => ['Customers/1001'],
    'Name_in'   => {
        'de'    => 'meine Preisliste',
        'en'    => 'my price list',
    },
    'Name_up'   => {
        'de'    => 'meine geänderte Preisliste',
        'en'    => 'my updated price list',
    },
    'Attr_in'   => {
        'CreationDate'  => '2006-01-01T00:00:00',
    },
    'Attr_up'   => {
        'CreationDate'  => '2006-01-01T11:11:11',
    },
);
$Options{'FullPath'} = "$Options{'Path'}/$Options{'Alias'}";
$Options{'CustomerGroups'} = [ _testGroups()->[0] ];


my $PriceList_in = {
    'Alias'     => $Options{'Alias'},
    'Path'      => $Options{'Path'},
    'CurrencyID'=> $Options{'CurrencyID'},
    'TaxModel'  => $Options{'TaxModel'},
    'ValidFrom' => $Options{'ValidFrom'},
    'ValidTo'   => $Options{'ValidTo'},
    'CustomerGroups' => $Options{'CustomerGroups'},
    'Customers' => $Options{'Customers'},
    'Name'      => TLocalizedString( $Options{'Name_in'} ),
    'Attributes'=> TAttributes(      $Options{'Attr_in'} ),
};

my $PriceList_update = {
    'Path'          => $Options{'FullPath'},
    'Name'          => TLocalizedString( $Options{'Name_up'} ),
    'Attributes'    => TAttributes(      $Options{'Attr_up'} ),
};

# Create a PriceList and check if the creation was successful
sub testCreate {

    my $ahResults = $PriceListService->create( [$PriceList_in] )->result;
    ok( scalar @$ahResults == 1, 'create result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'create: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $Options{'Alias'}, 'pricelist alias' );
    ok( $hResult->{'created'} == 1, 'created?' );
}

# Update a PriceList and check if the update was successful
sub testUpdate {

    my $ahResults = $PriceListService->update( [$PriceList_update] )->result;
    ok( scalar @$ahResults == 1, 'update result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'update: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'pricelist path' );
    ok( $hResult->{'updated'} == 1, 'updated?' );
}

# Retrieve information about an PriceList. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $PriceListService->getInfo( [$Options{'FullPath'}], ['CreationDate'] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'getInfo: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'}       eq WEBSERVICE_SHOP_PATH.$Options{'FullPath'},           'pricelist path' );
    ok( $hResult->{'CurrencyID'} eq $PriceList_in->{'CurrencyID'},  'currencyid' );
    ok( $hResult->{'TaxModel'}   eq $PriceList_in->{'TaxModel'},    'tax model' );
    ok( 0 == cmpDateTime($hResult->{'ValidFrom'}, $PriceList_in->{'ValidFrom'}),   'valid from' );
    ok( 0 == cmpDateTime($hResult->{'ValidTo'},   $PriceList_in->{'ValidTo'}),     'valid to' );
    ok( scalar @{$hResult->{'CustomerGroups'}}  == 1, 'number of customer groups' );
    ok( scalar @{$hResult->{'Customers'}}       == 1, 'number of customers' );

    my $hName = hLocalizedString($hResult->{'Name'});
    ok( $hName->{'de'} eq $Options{"Name$ext"}{'de'},   'name (de)' );
    ok( $hName->{'en'} eq $Options{"Name$ext"}{'en'},   'name (en)' );

    my  $hAttributes = hAttributes($hResult->{'Attributes'});
    ok( 0 == cmpDateTime($hAttributes->{'CreationDate'}, $Options{"Attr$ext"}{'CreationDate'}), 'attribute value (CreationDate)' );
}

sub deleteIfExists {
    my $ahResults = $PriceListService->exists( [$Options{'FullPath'}] )->result;
    die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};

    if ( $ahResults->[0]->{'exists'} ) {
        $ahResults = $PriceListService->delete( [$Options{'FullPath'}] );
        die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};
    }
}

# Delete a PriceList and check if no error occured.
sub testDelete {

    my $ahResults = $PriceListService->delete( [$Options{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'delete result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'delete: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'pricelist path' );
    ok( $hResult->{'deleted'} == 1, 'deleted?' );
}

# Test if a PriceList exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $PriceListService->exists( [$Options{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'exists result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'exists: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'pricelist path' );
    ok( $hResult->{'exists'} == $exists, 'exists?' );
}

# Retrieve all PriceLists of the connected shop
sub testGetAllInfo {
    my $ahResults = $PriceListService->getInfo( ['*'] )->result;
    ok( scalar @$ahResults == 2, 'getAllInfo result count' );
}

sub _testGroups {
    my $CustomerGroupService = WebServiceClient
        ->uri( 'urn://epages.de/WebService/CustomerGroupService/2006/06' )
        ->proxy( WEBSERVICE_URL )
        ->userinfo( WEBSERVICE_USER )
        ->xmlschema('2001');
    my $ahResults = $CustomerGroupService->getList()->result;
    return[map{WEBSERVICE_SHOP_PATH."Groups/$_->{'Alias'}"}@$ahResults];
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
testGetAllInfo();
