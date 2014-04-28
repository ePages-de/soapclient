use strict;
use utf8;
use Test::More tests => 30;

use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);
use WebServiceTools qw( cmpDateTime );


my $AppointmentService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/AppointmentService/2009/06' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema ('2001');

my $hOptions = {
    'RessourceAlias' => 'perl_test_ress-1',
    'CalendarAlias' => 'BusinessHours',
    'Alias' => 'perl_test_app_1',
    'Path'  => 'Appointments',
};
$hOptions->{'ResourcePath'} = $hOptions->{'Path'}.          '/'.$hOptions->{'RessourceAlias'};
$hOptions->{'CalendarPath'} = $hOptions->{'ResourcePath'}.  '/'.$hOptions->{'CalendarAlias'};
$hOptions->{'FullPath'}     = $hOptions->{'CalendarPath'}.  '/'.$hOptions->{'Alias'};

my $Appointment_in = {
    'Alias' => $hOptions->{'Alias'},
    'Ressource'  => $hOptions->{'ResourcePath'},
    'StartDate' => '2009-12-01T09:00:00',
    'EndDate'   => '2009-12-01T10:00:00',
    'Quantity'  => 1,
};

my $Appointment_update = {
    'Path' => $hOptions->{'FullPath'},
    'StartDate' => '2009-12-01T10:30:00',
    'EndDate'   => '2009-12-01T11:30:00',
};


sub testCreate {

    my $aAppointments = [$Appointment_in];

    my $ahResults = $AppointmentService->create( $aAppointments )->result;
    ok( scalar @$ahResults == 1, 'create result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'create: no error' );

    ok( $hResult->{'Alias'} eq $hOptions->{'Alias'}, 'appointment alias' );
    ok( $hResult->{'created'} == 1, 'created?' );
}

sub testUpdate {

    my $aAppointments = [$Appointment_update];

    my $ahResults = $AppointmentService->update( $aAppointments )->result;
    ok( scalar @$ahResults == 1, 'update result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'update: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'appointment path' );
    ok( $hResult->{'updated'} == 1, 'updated?' );
}

sub testGetInfo {
    my ($alreadyUpdated) = @_;

    my $ahResults = $AppointmentService->getInfo( [$hOptions->{'FullPath'}], [], ['de', 'en'] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result count' );

    diag "Error: $ahResults->[0]->{'Error'}->{'Message'}\n" if $ahResults->[0]->{'Error'};
    ok( !$ahResults->[0]->{'Error'}, 'getInfo: no error' );
    ok( $ahResults->[0]->{'Path'} eq WEBSERVICE_SHOP_PATH.$hOptions->{'FullPath'}, 'appointment path' );

    my $hResult = $ahResults->[0];
    my $hReference = $alreadyUpdated ? $Appointment_update : $Appointment_in;

    ok( 0 == cmpDateTime($hResult->{'StartDate'}, $hReference->{'StartDate'}), 'start date' );
    ok( 0 == cmpDateTime($hResult->{'EndDate'}, $hReference->{'EndDate'}), 'end date' );
}

sub deleteIfExists {

    my $ahResults = $AppointmentService->exists( [$hOptions->{'FullPath'}] )->result;

    return unless $ahResults->[0]->{'exists'};

    $AppointmentService->delete( [$hOptions->{'FullPath'}] );
}

sub testDelete {

    my $ahResults = $AppointmentService->delete( [$hOptions->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'delete result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'delete: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'appointment path' );
    ok( $hResult->{'deleted'} == 1, 'deleted?' );
}

sub testExists {
    my ($exists) = @_;

    my $ahResults = $AppointmentService->exists( [$hOptions->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'exists result count' );

    my $hResult = $ahResults->[0];
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( !$hResult->{'Error'}, 'exists: no error' );

    ok( $hResult->{'Path'} eq $hOptions->{'FullPath'}, 'appointment path' );
    ok( $hResult->{'exists'} == $exists, 'exists?' );
}

#handle test ressource
my $RessourceService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/ResourceService/2009/08' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

sub _existsTestRessource {
    return $RessourceService->exists([$hOptions->{'ResourcePath'}])->result->[0]->{'exists'};
}

sub _createTestRessource {
    if (!_existsTestRessource()) {
        $RessourceService->create([{
            'Alias' => $hOptions->{'RessourceAlias'},
            'IsVisible' => SOAP::Data->type('boolean')->value(1),
            'ProductPrices' => [{'CurrencyID'=>'EUR', 'Price'=>23, 'TaxModel'=>'gross'}],
        }])
    }
}

sub _deleteTestRessource {
    $RessourceService->delete([$hOptions->{'ResourcePath'}]);
}


# run test suite
_createTestRessource();

deleteIfExists();
testCreate();
testExists(1);
testGetInfo(0);
testUpdate();
testGetInfo(1);
testDelete();
testExists(0);

_deleteTestRessource();
