use strict;
use Test::More tests => 9;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD );

# Create a SOAP::Lite client object
my $ProductAttributeService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ProductAttributeService/2007/01' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$ProductAttributeService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

# Retrieve a list of product attributes from the shop
sub testGetInfoList {

    my $aAttributes = $ProductAttributeService->getInfoList()->result;

    ok( scalar @$aAttributes >= 2, "getInfoList result count" );

    my ($hProductTypes,$AttributeAlias,$ProductTypeAlias,$hAttribute);
    foreach my $Attribute (@$aAttributes) {
        $AttributeAlias   = $Attribute->{'Alias'};
        $ProductTypeAlias = $Attribute->{'ProductTypeAlias'};
        $hAttribute={
            'Name_de'   =>_locValue($Attribute->{'Name'},'de'),
            'Name_en'   =>_locValue($Attribute->{'Name'},'en'),
            'Type'      => $Attribute->{'Type'},
        };
        if ( defined $Attribute->{'PreDefAttributes'} ) {
            foreach my $PreDefAttribute (@{$Attribute->{'PreDefAttributes'}}) {
                $hAttribute->{$PreDefAttribute->{'Alias'}} = {
                    'Value'     => $PreDefAttribute->{'Alias'},
                    'Value_de'  =>_locValue($PreDefAttribute->{'LocalizedValues'},'de'),
                    'Value_en'  =>_locValue($PreDefAttribute->{'LocalizedValues'},'en'),
                }
            }
        }
        $hProductTypes->{$ProductTypeAlias}->{$AttributeAlias} = $hAttribute;
    }

    ok( defined $hProductTypes->{'Jacket'},                                 "attributes of type 'Jacket' exists" );
    ok( defined $hProductTypes->{'Jacket'}->{'Size'},                       "attribute 'Size' of type Jacket exists" );
    ok( defined $hProductTypes->{'Jacket'}->{'Size'}->{'XXL'},              "attribute 'Size' has predefined attribute 'XXL'" );
    ok( $hProductTypes->{'Jacket'}->{'Size'}->{'XXL'}->{'Value'} eq 'XXL',  "attribute 'Size' has right predefined value 'XXL'" );
    ok( defined $hProductTypes->{'Jacket'}->{'Color'},                      "attribute 'Color' of type Jacket exists" );
    ok( defined $hProductTypes->{'Jacket'}->{'Color'}->{'Black'},           "attribute 'Color' has predefined attribute 'Black'" );
    ok( $hProductTypes->{'Jacket'}->{'Color'}->{'Black'}->{'Value_en'} eq 'Black',   "attribute 'Color' has right predefined value (en) 'Black'" );
    ok( $hProductTypes->{'Jacket'}->{'Color'}->{'Black'}->{'Value_de'} eq 'Schwarz', "attribute 'Color' has right predefined value (de) 'Schwarz'" );

}

sub _locValue {
    my ($aLocValues,$lang) = @_;
    my $value;
    if ( defined $aLocValues ) {
        foreach my $locValue (@$aLocValues) {
            if ( $locValue->{'LanguageCode'} eq $lang ) {
                $value=$locValue->{'Value'}
            }
        }
    }
    return $value;
}


# run test suite
testGetInfoList();
