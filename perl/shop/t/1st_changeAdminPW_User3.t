use utf8;
use strict;
use Test::More tests => 4;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER );

# Create a SOAP::Lite client object
my $UserService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/UserService/2007/08' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Update a User and check if the update was successful
sub testUpdate_onlyPw {

    my $ahResults = $UserService->update( [{
        'Path'      => 'Users/admin',
        'Password'  => 'admin',
    }] )->result;
    ok( scalar @$ahResults == 1, "udpate result count" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "update2: no error" );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq 'Users/admin', "user path" );
    ok( $hResult->{'updated'} == 1, "updated?" );

}

# run test suite
testUpdate_onlyPw();
