package WebServiceConfiguration;
use base Exporter;

our @EXPORT = qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_USER WEBSERVICE_SHOP_PATH WEBSERVICE_SHOP_NAME );

use Config::IniFiles;

#get server from epages/Shared/Config/epages.conf SystemDomainName
sub _getWServer {
    my $WServer = 'localhost';

    eval{
        if ( -e $ENV{EPAGES_CONFIG}.'/epages.conf' ) {
            my $cfg = Config::IniFiles->new( -file => $ENV{EPAGES_CONFIG}.'/epages.conf' );
            $WServer = $cfg->val('DE_EPAGES::Object', 'SystemDomainName');
        }
    };

    print "try to connect to server '$WServer'\n";
    print "the server can reconfigure in file ".$INC{__PACKAGE__.'.pm'}."\n";

    return $WServer;
}

# Common configuration data for all web services
use constant WEBSERVICE_SERVER     => _getWServer();
    #use explicit servername and port for tracing
    #use constant WEBSERVICE_SERVER     => 'hmoye:8080';
use constant WEBSERVICE_URL       => 'http://'.WEBSERVICE_SERVER.'/epages/Store.soap';
use constant WEBSERVICE_SHOP_NAME => 'DemoShop';
use constant WEBSERVICE_SHOP_PATH => '/Shops/'.WEBSERVICE_SHOP_NAME.'/';
use constant WEBSERVICE_LOGIN     => WEBSERVICE_SHOP_PATH . "Users/admin";
use constant WEBSERVICE_PASSWORD  => "admin";
use constant WEBSERVICE_USER      => WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD;

1;
