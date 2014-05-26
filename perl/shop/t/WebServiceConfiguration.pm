package WebServiceConfiguration;
use base Exporter;

our @EXPORT = qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_USER WEBSERVICE_SHOP_PATH WEBSERVICE_SHOP_NAME );

use Config::IniFiles;

#get server from epages/Shared/Config/epages.conf SystemDomainName
sub _getWServer {
    my $WServer = $ENV{'ep6HostName'};

    eval{
        if (!defined($WServer) && -e $ENV{EPAGES_CONFIG}.'/epages.conf' ) {
            my $cfg = Config::IniFiles->new( -file => $ENV{EPAGES_CONFIG}.'/epages.conf' );
            $WServer = $cfg->val('DE_EPAGES::Object', 'SystemDomainName');
        }
    };

    print "try to connect to server '$WServer'\n";
    print "the server can be set via ENV variable 'ep6HostName'\n";

    return $WServer;
}

# Common configuration data for all web services
use constant WEBSERVICE_SERVER     => _getWServer();
    #use explicit servername and port for tracing
    #use constant WEBSERVICE_SERVER     => 'hmoye:8080';
use constant WEBSERVICE_URL       => $ENV{'wsUrl'}  // 'http://'.WEBSERVICE_SERVER.'/epages/Store.soap';
use constant WEBSERVICE_SHOP_NAME => $ENV{'wsShop'} // 'DemoShop';
use constant WEBSERVICE_SHOP_PATH => '/Shops/'.WEBSERVICE_SHOP_NAME.'/';
use constant WEBSERVICE_LOGIN     => $ENV{'wsUser'} // WEBSERVICE_SHOP_PATH . "Users/admin";
use constant WEBSERVICE_PASSWORD  => $ENV{'wsPassword'} // "admin";
use constant WEBSERVICE_USER      => WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD;

1;
