#========================================================================================
# §package      WebServiceClient
# §state        public
# §base         SOAP::Lite
#----------------------------------------------------------------------------------------
# §description  Loads the SOAP::Lite module and installs a universal error handler.
#----------------------------------------------------------------------------------------
# §example      use WebServiceClient;
#               my $soap = WebServiceClient
#                   ->uri('urn://epages.de/WebService/HelloService/2004/04')
#                   ->proxy('http://servername/epages/Site.soap');
#                   ->userinfo('login:password');
#               my $result = eval { $soap->protected->result; };
#               print STDERR $@ if $@;
#========================================================================================
package WebServiceClient;
use base qw( SOAP::Lite );

use strict;
use URI;

sub on_fault {
    return \&SoapError;
};

sub SoapError {
    my $soap = shift;
    my $res = shift;

    die "TRANSPORT ERROR: " . $soap->transport->status unless $res;
    die "SOAP ERROR: " . $res unless ref $res;
    die "SOAP FAULT: " . $res->faultstring if $res->fault;

    my $SoapSerializer = SOAP::Serializer->new;
    my $Content = $SoapSerializer->serialize( $res->dataof );
    die "Invalid SOAP response: " . $Content;
}

#========================================================================================
# §function     userinfo
# §state        public
#----------------------------------------------------------------------------------------
# §syntax       $Service = $Service->userinfo( "$Login:$Password" );
# §syntax       $UserInfo = $Service->userinfo;
# §example      $Service->userinfo( "wurzel:geheim" );
# §example      my $Service = DE_EPAGES::WebService::API::Client->new
#                   ->proxy( 'http://localhost/epages/MyStore.soap' )
#                   ->userinfo( '/Users/wsadmin:wsadmin' );
#----------------------------------------------------------------------------------------
# §description  Sets the login and password for Basic Authentication.
#----------------------------------------------------------------------------------------
# §input        $Login | login | string
# §input        $Password | password | string
# §return       $Service | returns the web service object | object
# §retrun       $UserInfo | login:password | string
#========================================================================================
sub userinfo {
    my $self = shift;
    my ($UserInfo) = @_;

    if( scalar @_ ) {
        # set the user info
        my $URI = URI->new( $self->proxy->endpoint );
        $URI->userinfo( $UserInfo );
        $self->proxy->endpoint( $URI->as_string );
    }
    else {
        # get the user info
        return URI->new( $self->proxy->endpoint )->userinfo;
    }
}

1;
