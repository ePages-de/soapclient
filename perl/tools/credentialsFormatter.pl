use strict;
use warnings;

use utf8;
use Getopt::Long;
use MIME::Base64 qw(encode_base64);

sub Main {
    local $| = 1;

    my $help;
    my $noOutput;
    my $username;
    my $password;
    my $clientApplicationName;
    my $clientApplicationPassword;

    GetOptions(
        'help'          => \$help,
        'nooutput'      => \$noOutput,
        'username=s'    => \$username,
        'password=s'    => \$password,
        'ca-name=s'     => \$clientApplicationName,
        'ca-password=s' => \$clientApplicationPassword,
    );

    usage() if defined $help;
    usage() unless defined $username;
    usage() unless defined $password;
    usage() if ( defined($clientApplicationName) ^ defined($clientApplicationPassword) );

    my $wsUsername;
    my $wsPassword;

    if ( defined($clientApplicationName) and defined($clientApplicationPassword) ) {
        $wsUsername = "$username\x{1}$clientApplicationName";
        $wsPassword = "$password\x{1}$clientApplicationPassword";
    }
    else {
        $wsUsername = $username;
        $wsPassword = $password;
    }

    print "Header Name:\n";
    print "Authorization\n";
    print "Header Value:\n";
    print 'Basic ' . encode_base64("$wsUsername:$wsPassword") . "\n";
}

sub usage {
    print <<END_USAGE;
Usage:
    perl $0 [options] flags objects

options:
    -username    Complete path of ws user            (/Shops/DemoShop/Users/admin)
    -password    Password of ws user                 (admin)
    -ca-name     Name of client application          (MyWebServiceClientApp_V1)
    -ca-password Password of client application      (MyWebService_qwert6)

flags:
    -help       show the command line options
    -nooutput   do not print any output

Example:
    perl $0 -username /Shops/DemoShop/Users/admin -password admin -ca-name MyWebServiceClientApp_V1 -ca-password MyWebService_qwert6

END_USAGE
    exit 2;
}

__PACKAGE__->Main();
