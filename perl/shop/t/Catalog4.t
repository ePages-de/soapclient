use utf8;
use strict;
use Test::More tests => 55;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH WEBSERVICE_SHOP_NAME);
use WebServiceTools qw( TLocalizedString TAttributes hAttributes cmpDateTime );

my $CatalogService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/CatalogService/2009/05' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my %Options = (
    'Alias'     => 'perl_test-1',
    'Path'      => 'Categories',
    'Name_in'   => {
        'de'    => 'Mein Katalogname',
        'en'    => 'my catalog name',
    },
    'Name_up'   => {
        'de'    => 'Mein geänderter Katalogname',
        'en'    => 'my updated catalog name',
    },
    'Attr_in'   => {
        'Date'  => '2005-12-24T10:00:00',
    },
    'Attr_up'   => {
        'Date'  => '2005-12-24T18:00:00',
    },
    'Tmpl_in' => {
        'Content-Order' => 'Base_Products_Pages',
        'Content-Pages' => 'Pages_SingleColumn',
    },
    'Tmpl_up' => {
        'Content-Order' => 'Pages_Products_Base',
        'Content-Pages' => 'Pages_TwoColumns',
    },
);
$Options{'FullPath'} = "$Options{'Path'}/$Options{'Alias'}";

my $Catalog_in      = {
    'Alias'         => $Options{'Alias'},
    'ParentCatalog' => $Options{'Path'},
    'Name'          => TLocalizedString( $Options{'Name_in'} ),
    'Attributes'    => TAttributes(      $Options{'Attr_in'} ),
    'TemplateTypes' => TAttributes(      $Options{'Tmpl_in'} ),
    'URI' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('soapPerl-c01-de')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('soapPerl-c01-en')
        }
    ],
};

my $Catalog_update  = {
    'Path'          => $Options{'FullPath'},
    'Name'          => TLocalizedString( $Options{'Name_up'} ),
    'Attributes'    => TAttributes(      $Options{'Attr_up'} ),
    'TemplateTypes' => TAttributes(      $Options{'Tmpl_up'} ),
    'URI' => [
        {
          'LanguageCode' => 'de',
          'Value' => SOAP::Data->type('string')->value('soapPerl-c01-de')
        },
        {
          'LanguageCode' => 'en',
          'Value' => SOAP::Data->type('string')->value('soapPerl-c01-en')
        }
    ],
};

my $Catalog_sort1    = {
    'Path'          => 'Categories/Tents/IndividualTents',
    'sort'          => 'alphabetize',
};

my $Catalog_sort2    = {
    'Path'          => 'Categories/Tents/FamilyTents',
    'sort'          => 'byPriceDESC',
};

my $Catalog_sort3    = {
    'Path'          => 'Categories/Tents',
    'sort'          => 'byPriceASC',
    'allSub'        => 1,
};
#'sort' could be also 'byNew', 'byStockLevel', 'byProductAlias'

# get domain name from provisioning service
my $DomainName;
eval { ## no critic qw(RequireExistsError)
    my $WS_URL = WEBSERVICE_URL; $WS_URL =~ s/Store/Site/;
    $DomainName = WebServiceClient
    ->proxy( $WS_URL )->xmlschema( '2001' )
    ->uri( 'urn://epages.de/WebService/ShopConfigService/2007/03' )
    ->userinfo( '/Providers/Distributor/Users/admin:admin' )
    ->getInfo({'Alias'=>WEBSERVICE_SHOP_NAME})->result->{'DomainName'};
};

# Create a Catalog and check if the creation was successful
sub testCreate {

    my $ahResults = $CatalogService->create( [$Catalog_in] )->result;
    is( scalar @$ahResults, 1, 'create result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'create: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $Options{'Alias'}, 'catalog alias' );
    is( $hResult->{'created'}, 1, 'created?' );
}

# Update a Catalog and check if the update was successful
sub testUpdate {

    my $ahResults = $CatalogService->update( [$Catalog_update] )->result;
    is( scalar @$ahResults, 1, 'update result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'update: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'catalog path' );
    is( $hResult->{'updated'}, 1, 'updated?' );
}

# Retrieve information about an Catalog. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $CatalogService->getInfo( [$Options{'FullPath'}], ['Date'] )->result;
    is( scalar @$ahResults, 1, 'getInfo result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'getInfo: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    is( $hResult->{'ParentCatalog'}, WEBSERVICE_SHOP_PATH.$Options{'Path'},             'parent catalog' );
    is( $hResult->{'Path'},          WEBSERVICE_SHOP_PATH.$Options{'FullPath'},         'catalog path' );

    my $hReference = $alreadyUpdated ? $Catalog_update : $Catalog_in;

    # convert localized value from array to hash (languge code => value)
    my @LocAttributeNames = qw( Name URI CanonicalURL );
    my %LocResult; my %LocReference;
    foreach my $AttributeName (@LocAttributeNames) {
        foreach my $hAttribute (@{$hResult->{$AttributeName}}) {
          $LocResult{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'};
        }
        foreach my $hAttribute (@{$hReference->{$AttributeName}}) {
          $LocReference{$AttributeName}{$hAttribute->{'LanguageCode'}} = $hAttribute->{'Value'}->value();
        }
    }

    is( $LocResult{'Name'}{'en'}, $LocReference{'Name'}{'en'}, 'name (en) is OK' );
    is( $LocResult{'Name'}{'de'}, $LocReference{'Name'}{'de'}, 'name (de) is OK' );

    ok( $LocResult{'URI'}{'de'} eq $LocReference{'URI'}{'de'}, 'attribute URI in language DE is correct' );
    ok( $LocResult{'URI'}{'en'} eq $LocReference{'URI'}{'en'}, 'attribute URI in language EN is correct' );

    if ( $DomainName ) {
        # these tests only work if the shop has its own domain name
        like( $LocResult{'CanonicalURL'}{'de'}, qr/.*($LocReference{'URI'}{'de'})$/x, 'attribute URI ist end part of CanonicalURL in language DE' );
        like( $LocResult{'CanonicalURL'}{'en'}, qr/.*($LocReference{'URI'}{'en'})$/x, 'attribute URI ist end part of CanonicalURL in language EN' );
    } else {
        #dummi tests if domain name missig
        like( '',qr//,'skip CanonicalURL de test, because missing individual domain name');
        like( '',qr//,'skip CanonicalURL en test, because missing individual domain name');
    }


    my  $hAttributes = hAttributes($hResult->{'Attributes'});
    is( 0, cmpDateTime($hAttributes->{'Date'}, $Options{"Attr$ext"}{'Date'}), 'attribute value (Date)' );

    my $hTemplateTypes = hAttributes($hResult->{'TemplateTypes'});
    is( $hTemplateTypes->{'Content-Order'}, $Options{"Tmpl$ext"}{'Content-Order'}, 'template type (Content-Order)' );
    is( $hTemplateTypes->{'Content-Pages'}, $Options{"Tmpl$ext"}{'Content-Pages'}, 'template type (Content-Pages)' );
}

sub deleteIfExists {
    my $ahResults = $CatalogService->exists( [$Options{'FullPath'}] )->result;
    die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};

    if ( $ahResults->[0]->{'exists'} ) {
        $ahResults = $CatalogService->delete( [$Options{'FullPath'}] )->result;
        die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};
    }
}

# Delete a Catalog and check if no error occured.
sub testDelete {

    my $ahResults = $CatalogService->delete( [$Options{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, 'delete result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'delete: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'catalog path' );
    is( $hResult->{'deleted'}, 1, 'deleted?' );
}

# Test if a Catalog exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $CatalogService->exists( [$Options{'FullPath'}] )->result;
    is( scalar @$ahResults, 1, 'exists result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'exists: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'catalog path' );
    is( $hResult->{'exists'}, $exists, 'exists?' );
}

# Sort a Catalog and check if the sort was successful
sub testSort {
    my ( $run ) = @_;

    my $Catalog_sort = $Catalog_sort3;
    $Catalog_sort = $Catalog_sort1 if $run==1;
    $Catalog_sort = $Catalog_sort2 if $run==2;

    my $ahResults = $CatalogService->sortProducts( [$Catalog_sort] )->result;
    is( scalar @$ahResults, 1, 'sort result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'sort: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    is( $hResult->{'sorted'}, 1, 'sorted?' );
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
testSort(1);
testSort(2);
testSort(3);
