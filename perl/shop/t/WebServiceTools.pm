package WebServiceTools;
use base Exporter;
our @EXPORT_OK = qw(
    TLocalizedString
    TAttributes
    hLocalizedString
    hAttributes
    cmpDateTime
    sortByStrings
    sortByInts
    fsplit
    GetFileContent
);

use Data::Dumper;
use File::Basename  qw ( dirname basename );

#--- returns all key language depend values as array referense
sub TLocalizedString{
    my ( $hLocalizedString ) = @_;
    return [ map {
            {
                'LanguageCode' => $_,
                'Value'        => SOAP::Data->type('string')->value($hLocalizedString->{$_})
            }
        } keys %$hLocalizedString
    ];
}

#--- extracts from hash all elements of keys and returns key,value pair of this elements by definition
sub hLocalizedString {
    my ( $TLocalizedString ) = @_;
    my $hLocalizedString = {};
    foreach my $e (@$TLocalizedString) {
        $hLocalizedString->{$e->{'LanguageCode'}} = $e->{'Value'};
    }
    return $hLocalizedString;
}

#--- returns a array reference to a list of Name,Value pairs
sub TAttributes {
    my ( $hAttributes ) = @_;
    return [ map {
            {
                'Name'  => $_,
                'Value' => $hAttributes->{$_}
            }
        } keys %$hAttributes
    ];
}

#--- extracts from hash all elements of keys and returns key,value pair of this elements by definition
sub hAttributes {
    my ( $TAttributes ) = @_;
    my $hAttributes = {};
    foreach my $e (@$TAttributes) {
        $hAttributes->{$e->{'Name'}} = $e->{'Value'};
    }
    return $hAttributes;
}

# compares the values of 2 ISO formated DateTime strings
sub cmpDateTime {
    my ( $A, $B, $TimeZone ) = @_;

    return parse_datetime( $A, $TimeZome ) cmp parse_datetime( $B, $TimeZome );
}

# converts an ISO formated string to a DateTime object
sub parse_datetime {
    my ( $String, $TimeZone ) = @_;

    # dynamically use DateTime modules, because they're included in Core Perl
    eval "use DateTime"; die $@ if $@;
    eval "use DateTime::Format::ISO8601"; die $@ if $@;

    $String =~ s/GMT$/Z/g;

    # remove milliseconds -> not ISO8601 compliant
    $String =~ s/\.\d+//g;

    my $iso = new DateTime::Format::ISO8601;

    my $dt = $iso->parse_datetime( $String );

    if ( (defined $TimeZone) && $dt->time_zone_long_name eq 'floating' ) {
        $dt->set_time_zone( $TimeZone );
    }

    return $dt;
}

sub sortByStrings {
    my $key = shift;
    return sort {$a->{$key} cmp $b->{$key}} @_;
}

sub sortByInts {
    my $key = shift;
    return sort {$a->{$key} <=> $b->{$key}} @_;
}

##
# Helper functions for file handling
##

sub fsplit ($) {
    my ($FilePath) = @_;

    # define file name
    my $FileName = $FilePath;
    $FileName =~ s/\\/\//go;
    $FileName = basename($FileName);

    # define path
    $FilePath =~ s/\Q$FileName\E$//;
    $FilePath =~ s/(.)[\\\/]+$/$1/;

    # define extension
    my $Extension = $FileName =~ s/(\.[^\.]*)$// ? $1 : undef;

    return ($FilePath, $FileName, $Extension);
}

sub GetFileContent ($) {
    my ( $FileName ) = @_;

    my $OpenMode = '<';
    local *FILE_DESCR; # save global FILE_DESCR
    open(FILE_DESCR, $OpenMode, $FileName) or die "Can't read file $FileName: ".$!;
    binmode (FILE_DESCR);
    my $Content = join ('', <FILE_DESCR>);
    close(FILE_DESCR) or die "Can't close file $FileName: ".$!;

    return $Content;
}


#sub print_debug {
#    my( $header, $content ) = shift =~ /^(.*?)\n\n(.*)/s;
#    #print "$header\n";
#    use XML::Tidy;
#    my $tidy = XML::Tidy->new('xml'=>$content)->tidy->toString;
#    print "$tidy\n";
#}
#

1;
