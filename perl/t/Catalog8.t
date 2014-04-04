use utf8;
use strict;

use Test::More tests => 82;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH WEBSERVICE_SHOP_NAME);
use WebServiceTools qw( TLocalizedString TAttributes hAttributes cmpDateTime fsplit GetFileContent);


my $CatalogService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/CatalogService/2011/11' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.

use constant NUMBER_OF_DEMO_CATEGORIES => 13;

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
    'Description_in'   => {
        'de'    => 'Eine Katalogbeschreibung',
        'en'    => 'a catalog description',
    },
    'Description_up'   => {
        'de'    => 'Eine geänderte Katalogbeschreibung',
        'en'    => 'a updated catalog description',
    },
    'Title_in'   => {
        'de'    => 'Der Katalogtitel',
        'en'    => 'the catalog title',
    },
    'Title_up'   => {
        'de'    => 'Der geänderte Katalogtitel',
        'en'    => 'the updated catalog title',
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
    'Description'   => TLocalizedString( $Options{'Description_in'} ),
    'Titel'         => TLocalizedString( $Options{'Title_in'} ),
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
    'IsVisibleContentView' => 1,
};

my $Catalog_update  = {
    'Path'          => $Options{'FullPath'},
    'Name'          => TLocalizedString( $Options{'Name_up'} ),
    'Description'   => TLocalizedString( $Options{'Description_up'} ),
    'Titel'         => TLocalizedString( $Options{'Title_up'} ),
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
    'IsVisibleContentView' => 1,
};

my %Images_upload = (
    'Small'     => '../TestData/CatalogService/Jacket.gif',
    'Medium'    => '../TestData/CatalogService/Jacket.gif',
    #'1'         => '../TestData/CatalogService/Jacket.gif',
    #'2'         => '../TestData/CatalogService/Jacket.gif',
);


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

my $Catalog_move  = {
    'Path'          => $Options{'FullPath'},
    'MoveToParentCatalog' => 'Categories/Tents',
};

my $Catalog_move_back  = {
    'Path'          => 'Categories/Tents/'.$Options{'Alias'},
    'MoveToParentCatalog' => $Options{'Path'},
};


# get domain name from provisioning service
my $DomainName;
eval { ## no critic "RequireExistsError"
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
    ok( scalar @$ahResults == 1, 'create result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'create: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $Options{'Alias'}, 'catalog alias' );
    ok( $hResult->{'created'} == 1, 'created?' );
}

# Update a Catalog and check if the update was successful
sub testUpdate {

    my $ahResults = $CatalogService->update( [$Catalog_update] )->result;
    ok( scalar @$ahResults == 1, 'update result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'update: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'catalog path' );
    ok( $hResult->{'updated'} == 1, 'updated?' );
}

# Retrieve information about an Catalog. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $CatalogService->getInfo( [$Options{'FullPath'}], ['Date'] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'getInfo: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    is( $hResult->{'ParentCatalog'}, WEBSERVICE_SHOP_PATH.$Options{'Path'},             'parent catalog' );
    is( $hResult->{'Path'},          WEBSERVICE_SHOP_PATH.$Options{'FullPath'},         'catalog path' );

    my $hReference = $alreadyUpdated ? $Catalog_update : $Catalog_in;

    is( $hResult->{'IsVisibleContentView'}, $hReference->{'IsVisibleContentView'}, 'IsVisibleContentView' );

    # convert localized value from array to hash (languge code => value)
    my @LocAttributeNames = qw( Name URI CanonicalURL Description Title);
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

    is( $LocResult{'Description'}{'en'}, $LocReference{'Description'}{'en'}, 'Description (en) is OK' );
    is( $LocResult{'Description'}{'de'}, $LocReference{'Description'}{'de'}, 'Description (de) is OK' );

    is( $LocResult{'Title'}{'en'}, $LocReference{'Title'}{'en'}, 'Title (en) is OK' );
    is( $LocResult{'Title'}{'de'}, $LocReference{'Title'}{'de'}, 'Title (de) is OK' );

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
    ok( 0 == cmpDateTime($hAttributes->{'Date'}, $Options{"Attr$ext"}{'Date'}), 'attribute value (Date)' );

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
    ok( scalar @$ahResults == 1, 'delete result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'delete: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'catalog path' );
    ok( $hResult->{'deleted'} == 1, 'deleted?' );
}

# Test if a Catalog exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $CatalogService->exists( [$Options{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'exists result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'exists: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $Options{'FullPath'}, 'catalog path' );
    ok( $hResult->{'exists'} == $exists, 'exists?' );
}

# Sort a Catalog and check if the sort was successful
sub testSort {
    my ( $run ) = @_;

    my $Catalog_sort = $Catalog_sort3;
    $Catalog_sort = $Catalog_sort1 if $run==1;
    $Catalog_sort = $Catalog_sort2 if $run==2;

    my $ahResults = $CatalogService->sortProducts( [$Catalog_sort] )->result;
    ok( scalar @$ahResults == 1, 'sort result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'sort: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'sorted'} == 1, 'sorted?' );
}

sub testUploadImage {

    my @parts;
    foreach my $ImageType (keys %Images_upload) {
        my $FilePath = $Images_upload{$ImageType};
        my $Content = GetFileContent( $FilePath );
        my ($Dir, $FileName, $Extension) = fsplit( $FilePath );
        $Dir = undef; #not used
        $FileName .= $Extension;

        # transfer content as binary, base 64 encoded
        push @parts, {
          'FileName'=> SOAP::Data->type( 'string' => $FileName ),
          'Type'    => SOAP::Data->type( 'string' => $ImageType ),
          'Content' => SOAP::Data->type( 'base64' => $Content ),
        };
    }

    my $ahResults = $CatalogService->uploadImage( $Options{'FullPath'}, {'ImageData' => \@parts})->result;

    ok( scalar @$ahResults == 2, 'upload result count' );

    foreach my $hResult (@$ahResults) {
      ok( !$hResult->{Error}, 'upload: no error' );
      ok( $hResult->{'WriteOK'}, "$hResult->{'File'} written?" );
        diag 'An error occured: ' . $_->{'Error'}->{'Message'} ."\n" if $hResult->{Error};
    }

}

# Test if a Catalog exists or not
sub testGetCategories {

    my $som = $CatalogService->getCategories();
    my $ahResults = $som->result;
    ok( scalar @$ahResults == NUMBER_OF_DEMO_CATEGORIES, 'getCategories result count' );

    # check some examples
    my @testPaths = ( WEBSERVICE_SHOP_PATH.'Categories', WEBSERVICE_SHOP_PATH.'Categories/Jackets');
    my %count;
    foreach my $Path (@$ahResults) {
        foreach my $testPath (@testPaths) {
            $count{$Path}++ if $Path eq $testPath;
        }
    }

    # each hove to be one times checked
    foreach my $testPath (@testPaths) {
        ok( $count{$testPath}, "getCategories OK exists $testPath" );
        ok( $count{$testPath} == 1, "getCategories OK count $testPath" );
    }

    ok( !$som->fault, 'getCategories: no error' );
    diag "Error: $som->faultstring\n" if $som->fault;
}

# Test change parent
sub testMove {
    my ($Catalog) = @_;

    my $ahResults = $CatalogService->update( [$Catalog] )->result;
    ok( scalar @$ahResults == 1, 'update parent result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'exists: no error' );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'updated'}, 'updated?' );
}





# run test suite
deleteIfExists();
testCreate();
testExists(1);
testGetInfo(0);
testUpdate();
testGetInfo(1);
testUploadImage();
testMove($Catalog_move);
testMove($Catalog_move_back);
testDelete();
testExists(0);
testSort(1);
testSort(2);
testSort(3);
testGetCategories();