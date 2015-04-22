package WebServiceConfiguration;
use base Exporter;

our @EXPORT = qw( WEBSERVICE_URL WEBSERVICE_LOGIN WEBSERVICE_PASSWORD WEBSERVICE_USER WEBSERVICE_SHOP_PATH WEBSERVICE_SHOP_NAME );

use Config::IniFiles;
use IO::File;
use Test::More;
use Log::Log4perl;
Log::Log4perl->init_once('../../conf/log4perl.conf');

BEGIN {
    eval "use SOAP::Transport::HTTP::Log4perl logger => 'COMMUNICATION';";
    if ($@) {
        warn 'install SOAP::Transport::HTTP::Log4perl for communications logging.';
    }
}

#get server from epages/Shared/Config/epages.conf SystemDomainName
sub _getWServer {
    my $WServer = $ENV{'wsHostName'};

    eval{
        if (!defined($WServer) && -e $ENV{EPAGES_CONFIG}.'/epages.conf' ) {
            my $file = IO::File->new( $ENV{EPAGES_CONFIG}.'/epages.conf' );
            my $cfg = Config::IniFiles->new( -file => $file );
            $WServer = $cfg->val('DE_EPAGES::Object', 'SystemDomainName');
        }
    };

    print "try to connect to server '$WServer'\n";
    print "the server can be set via ENV variable 'wsHostName'\n";

    return $WServer;
}

# Common configuration data for all web services
use constant WEBSERVICE_SERVER     => _getWServer();
use constant WEBSERVICE_URL       => $ENV{'wsUrl'}  // 'http://'.WEBSERVICE_SERVER.'/epages/Store.soap';
use constant WEBSERVICE_SHOP_NAME => $ENV{'wsShop'} // 'DemoShop';
use constant WEBSERVICE_SHOP_PATH => '/Shops/'.WEBSERVICE_SHOP_NAME.'/';
use constant WEBSERVICE_LOGIN => ($ENV{'wsUser'} // WEBSERVICE_SHOP_PATH . "Users/admin")
    .(defined $ENV{'wsAppName'} ? "\x{1}".$ENV{'wsAppName'} : '');
use constant WEBSERVICE_PASSWORD  => ($ENV{'wsPassword'} // 'admin')
    .(defined $ENV{'wsAppPassword'} ? "\x{1}".$ENV{'wsAppPassword'} : '');
use constant WEBSERVICE_USER => WEBSERVICE_LOGIN.':'.WEBSERVICE_PASSWORD;

my $log = Log::Log4perl->get_logger('COMMUNICATION');
$log->debug("Running with these settings: " . WEBSERVICE_SERVER . " " . WEBSERVICE_URL . " " . WEBSERVICE_USER);

1;
