use strict;
use Test::More tests => 42;
use File::Basename  qw ( basename );
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $ProductImageService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductImageService/2006/03' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductImageService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

# Create a SOAP::Lite client object for the product service
my $ProductService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductService/2005/01' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

my $hOptions = {
    'Alias' => 'perl_test-1',
    'Path'  => 'Products/',
    'TestExistsFileName' => 'cg_0100504001.jpg',
    'TestExistsFileName2' => 'cg_0100504001',
};

my @ProductImages_upload = (
    '../../../TestData/ProductImageService/be_40401_blue.jpg',
    '../../../TestData/ProductImageService/cg_0100504001.jpg',
);

my @ProductImage_uploadScale = (
    '../../../TestData/ProductImageService/be_40401_blue.jpg',
    '../../../TestData/ProductImageService/cg_0100504001.jpg',
);

#ImagesSlideShowStringUpload
my @ImagesSlideShowStringUpload = ('be_40401_blue.jpg', 'cg_0100504001.jpg');

#ImagesSlideShowStringScale
my @ImagesSlideShowStringScale = ('be_40401_blue.jpg', 'cg_0100504001.jpg', 'cg_0100504001_h.jpg','be_40401_blue_m.jpg');


my $hScaleParams = {
    'SCALE_SIZE_m' => 200,
    'SCALE_SIZE_s' => 100,
    'SCALE_SIZE_h' => 150,
    'SCALE_NAME_m' => 'ImageMedium',
    'SCALE_NAME_s' => 'ImageSmall',
    'SCALE_NAME_h' => 'ImageHotDeal',
    'SCALE_BORDER_IMAGE_m' => SOAP::Data->type('boolean')->value(1),
    'SCALE_BORDER_IMAGE_h' => SOAP::Data->type('boolean')->value(1),
    'SCALE_BORDER_COLOR_m' => '#FFFFFF',
    'SCALE_BORDER_COLOR_h' => '#FFFFFF',
};


my @ProductImage_delete = (
    'be_40401_blue.jpg',
    'cg_0100504001.jpg',
);

# create a test product
sub Setup {

  eval { Cleanup() }; ## no critic "RequireExistsError"
  my $ahResults = $ProductService->create( [ { Alias => $hOptions->{Alias} } ] )->result;
  die $ahResults->[0]->{Error}->{Message} if $ahResults->[0]->{Error};
}

# delete the test product
sub Cleanup {

  my $ObjectPath = $hOptions->{'Path'} . $hOptions->{'Alias'};
  my $ahResults = $ProductService->delete( [ $ObjectPath ] )->result;
  die $ahResults->[0]->{Error}->{Message} if $ahResults->[0]->{Error};
}

sub testExists {
    my ($exists) = @_;

  my $ObjectPath = $hOptions->{'Path'} . $hOptions->{'Alias'};
  my $FileName = $hOptions->{'TestExistsFileName'};
    my $result = $ProductImageService->exists( $ObjectPath, $FileName )->result;

    is( $result, $exists, 'exists?' );
}

sub testUpload {

    my @parts;
    foreach my $FilePath (@ProductImages_upload) {
        my $Content = GetFileContent( $FilePath );
        my ($Dir, $FileName, $Extension) = fsplit( $FilePath );
        $Dir = undef; #not used
        $FileName .= $Extension;

        # transfer content as binary, base 64 encoded
        push @parts, {
          'FileName'=> SOAP::Data->type( 'string' => $FileName ),
          'Content' => SOAP::Data->type( 'base64' => $Content )
        };
    }


  my $ImagesSlideShowStringUpload = scalar(@ImagesSlideShowStringUpload) ? join(';',@ImagesSlideShowStringUpload) : undef ;
  $ImagesSlideShowStringUpload = SOAP::Data->type( 'string' => $ImagesSlideShowStringUpload );

  my $ObjectPath = $hOptions->{'Path'} . $hOptions->{'Alias'};
    my $ahResults = $ProductImageService->upload( $ObjectPath, {'ImageData' => \@parts,
                                'ImagesSlideShowString' => $ImagesSlideShowStringUpload
                                  })->result;

    is( scalar @$ahResults, 2, 'upload result count' );

    foreach my $hResult (@$ahResults) {
      ok( !$hResult->{Error}, 'upload: no error' );
      ok( $hResult->{'WriteOK'}, "$hResult->{'File'} written?" );
        diag 'An error occured: ' . $_->{'Error'}->{'Message'} ."\n" if $hResult->{Error};
    }
}

sub testUploadScale {

    my @parts;
    foreach my $FilePath (@ProductImage_uploadScale) {
        my $Content = GetFileContent( $FilePath );
        my ($Dir, $FileName, $Extension) = fsplit( $FilePath );
        $Dir = undef; #not used
        $FileName .= $Extension;

        # transfer content as binary, base 64 encoded
        push @parts, {
          'FileName'=> SOAP::Data->type( 'string' => $FileName ),
          'Content' => SOAP::Data->type( 'base64' => $Content )
        };
    }


  my $ImagesSlideShowStringScale = scalar(@ImagesSlideShowStringScale) ? join(';',@ImagesSlideShowStringScale) : undef ;
  $ImagesSlideShowStringScale = SOAP::Data->type( 'string' => $ImagesSlideShowStringScale );

    # 1st image
  my $ObjectPath = $hOptions->{'Path'} . $hOptions->{'Alias'};
    my $ahResults = $ProductImageService->uploadscale( $ObjectPath, {'ImageData' => \@parts,
                                   'ImagesSlideShowString' => $ImagesSlideShowStringScale,
                                    }, $hScaleParams )->result;

    is( scalar @$ahResults, 2, 'uploadscale result count' );

    foreach my $hResult (@$ahResults) {
      ok( !$hResult->{Error}, 'uploadscale: no error' );
      ok( $hResult->{'WriteOK'}, "$hResult->{'File'} written?" );
      ok( $hResult->{'ScaleOK'}, "$hResult->{'File'} scaled?" );
        diag 'An error occured: ' . $_->{'Error'}->{'Message'} ."\n" if $hResult->{Error};
    }

    my $ImageLarge = getProductAttribute( $ObjectPath, 'ImageLarge' );
    ok( $ImageLarge eq $hOptions->{'TestExistsFileName'}, "ImageLarge: $ImageLarge");

    my $ImageSmall = getProductAttribute( $ObjectPath, 'ImageSmall' );
    ok( $ImageSmall eq $hOptions->{'TestExistsFileName2'}.'_s.jpg', "ImageSmall: $ImageSmall");

    my $ImageMedium = getProductAttribute( $ObjectPath, 'ImageMedium' );
    ok( $ImageMedium eq $hOptions->{'TestExistsFileName2'}.'_m.jpg', "ImageMedium: $ImageMedium");

    my $ImageHotDeal = getProductAttribute( $ObjectPath, 'ImageHotDeal' );
    ok( $ImageHotDeal eq $hOptions->{'TestExistsFileName2'}.'_h.jpg', "ImageHotDeal: $ImageHotDeal");

    my $ImageThumbnail = getProductAttribute( $ObjectPath, 'ImageThumbnail' );
    ok( $ImageThumbnail eq $hOptions->{'TestExistsFileName2'}.'_xs.jpg', "ImageThumbnail: $ImageThumbnail");

}

sub testDelete {

  my $ObjectPath = $hOptions->{'Path'} . $hOptions->{'Alias'};
    my $ahResults = $ProductImageService->delete( $ObjectPath, \@ProductImage_delete )->result;

    is( scalar @$ahResults, 2, 'delete result count' );
    foreach my $hResult (@$ahResults) {
      ok( !$hResult->{Error}, 'delete: no error' );
      ok( $hResult->{'deleted'}, "$hResult->{'Path'} deleted?" );
        diag 'An error occured: ' . $_->{'Error'}->{'Message'} ."\n" if $hResult->{Error};
    }

    my $ImageLarge = getProductAttribute($ObjectPath,'ImageLarge');
    ok( !$ImageLarge, 'image ref deleted' );

    my $ImageSmall = getProductAttribute( $ObjectPath, 'ImageSmall' );
    ok( !$ImageSmall, '$ImageSmall ref deleted' );

    my $ImageMedium = getProductAttribute( $ObjectPath, 'ImageMedium' );
    ok( !$ImageSmall, '$ImageMedium ref deleted' );

    my $ImageHotDeal = getProductAttribute( $ObjectPath, 'ImageHotDeal' );
    ok( !$ImageSmall, '$ImageHotDeal ref deleted' );

    my $ImageThumbnail = getProductAttribute( $ObjectPath, 'ImageThumbnail' );
    ok( !$ImageSmall, '$ImageThumbnail ref deleted' );


}

sub getProductAttribute {
    my ($ProductsPath,$AttrName) = @_;
    my $ProductService2 = WebServiceClient
        ->uri( 'urn://epages.de/WebService/ProductService/2009/05' )
        ->proxy( WEBSERVICE_URL )
        ->userinfo( WEBSERVICE_USER )
        ->xmlschema('2001');
    my $ahResults = $ProductService2->getInfo( [$ProductsPath], [$AttrName], ['de', 'en'] )->result;
    return $ahResults->[0]->{'Attributes'}->[0]->{'Value'};
}


# run test suite
Setup();
testExists(0);
testUpload();
testExists(1);

testDelete();
testExists(0);
testUploadScale();
testExists(1);
testDelete();
testExists(0);
Cleanup();

##
# Helper functions
##

sub fsplit ($) {
    my ($FilePath) = @_;

    # define file name
    my $FileName = $FilePath;
    $FileName =~ s/\\/\//go;
    $FileName = basename($FileName);

    # define path
    $FilePath =~ s/\Q$FileName\E$//x;
    $FilePath =~ s/(.)[\\\/]+$/$1/x;

    # define extension
    my $Extension = $FileName =~ s/(\.[^\.]*)$//x ? $1 : undef;

    return ($FilePath, $FileName, $Extension);
}

sub GetFileContent ($) {
    my ( $FileName ) = @_;

    my $OpenMode = '<';
    local *FILE_DESCR;                                                              ## no critic "RequireInitializationForLocalVars"
    open(FILE_DESCR, $OpenMode, $FileName) or die "Can't read file $FileName: ".$!; ## no critic qw(RequireBriefOpen ProhibitBarewordFileHandles)
    binmode (FILE_DESCR);
    my $Content = join ('', <FILE_DESCR>);                                          ## no critic "ProhibitJoinedReadline"
    close(FILE_DESCR) or die "Can't close file $FileName: ".$!;

    return $Content;
}
