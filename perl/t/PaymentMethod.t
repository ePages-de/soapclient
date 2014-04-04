use strict;
use Test::More tests => 10;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_SHOP_PATH);

# Create a SOAP::Lite client object
my $PaymentmethodService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/PaymentMethodService/2008/03' )
    ->proxy( WEBSERVICE_URL )
    ->xmlschema ('2001');
$PaymentmethodService->userinfo( WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD );

# Retrieve a list of PaymentMethods from the shop
sub testGetList {

    my $ahResult = $PaymentmethodService->getList()->result;

  #use Data::Dumper;
  #diag Dumper( $ahResult );

    cmp_ok( scalar @$ahResult, '>=', 8, "getList result set" );

    my %Methods = map { $_->{'Path'} => 1 } @$ahResult;

  foreach my $Name(
       'CashInAdvance',
       'Invoice',
       'CashOnDelivery',
       'Cash',
       'DirectDebit',
       'Skrill',
       'WorldPay',
       'Saferpay',
  ) {
    my $QuotedName = $Name;
    $QuotedName =~ s/"/""/g; #"
    $QuotedName = '"'. $QuotedName . '"' if $Name =~ /\s/ || $Name =~ /\// || $Name =~ /"/; #"
    my $Path = WEBSERVICE_SHOP_PATH."PaymentMethods/$QuotedName";
    ok( exists $Methods{$Path}, "payment method $Name exists" );
    delete $Methods{$Path};
  }

  ok( 0 == scalar keys %Methods, "no extra payment methods" );
  diag "#  extra payment method: $_\n" foreach keys %Methods;
}

# run test suite
testGetList();


