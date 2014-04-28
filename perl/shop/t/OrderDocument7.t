use strict;
use Test::More tests => 81;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);

my $OrderDocService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/OrderDocumentService/2011/08' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'order'             => 'Customers/1001/Orders/1002',
    'invoice_path'      => 'Customers/1001/Orders/1002/Invoices/',
    'invoice_alias'     => 'myinvoice',
    'packingslip_path'  => 'Customers/1001/Orders/1002/PackingSlips/',
    'packingslip_alias' => 'mypackingslip',
    'creditnote_path'   => 'Customers/1001/Orders/1002/CreditNotes/',
    'creditnote_alias'  => 'mycreditnote',
};

my $invoice_in = {
    'Class' => '/Classes/Invoice',
    'Order' => $options->{'order'},
    'Alias' => $options->{'invoice_alias'},
    'Issued' => 0,
};

my $packingslip_in = {
    'Class' => '/Classes/PackingSlip',
    'Order' => $options->{'order'},
    'Alias' => $options->{'packingslip_alias'},
    'Issued' => 0,
};

my $creditnote_in = {
    'Class' => '/Classes/CreditNote',
    'Order' => $options->{'order'},
    'Alias' => $options->{'creditnote_alias'},
    'Issued' => 0,
};

my $creditnote_up = {
    'Class' => '/Classes/CreditNote',
    'Path'   => $options->{'creditnote_path'}.$options->{'creditnote_alias'},
    'Issued' => 1,
};

my $creditnote_up2 = {
    'Class' => '/Classes/CreditNote',
    'Path'   => $options->{'creditnote_path'}.$options->{'creditnote_alias'},
    'Issued' => 0,
};

my $aDocumentPaths = [
    $options->{'invoice_path'}      . $options->{'invoice_alias'},
    $options->{'packingslip_path'}  . $options->{'packingslip_alias'},
    $options->{'creditnote_path'}   . $options->{'creditnote_alias'},
];

# Create a OrderDocument and check if the creation was successful
sub testCreate {
    my $aOrderDocuments = [$invoice_in, $packingslip_in, $creditnote_in];

    my $ahResults = $OrderDocService->create( $aOrderDocuments )->result;
    ok( scalar @$ahResults == @$aOrderDocuments, "create result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $invoice_in->{'Order'}, "invoice order path" );
    ok( $hResult->{'Alias'} eq $invoice_in->{'Alias'}, "invoice" );
    ok( $hResult->{'created'} == 1, "created?" );

    $hResult = $ahResults->[1];
    ok( !$hResult->{'Error'}, "packingslip create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $packingslip_in->{'Order'}, "packingslip order path" );
    ok( $hResult->{'Alias'} eq $packingslip_in->{'Alias'}, "packingslip" );
    ok( $hResult->{'created'} == 1, "created?" );

    $hResult = $ahResults->[2];
    ok( !$hResult->{'Error'}, "creditnote create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $creditnote_in->{'Order'}, "creditnote order path" );
    ok( $hResult->{'Alias'} eq $creditnote_in->{'Alias'}, "creditnote" );
    ok( $hResult->{'created'} == 1, "created?" );
}

# Retrieve information about an OrderDocument. Check if the returned data are equal to
# the data of create call
sub testGetInfo {

    my $ahResults = $OrderDocService->getInfo( $aDocumentPaths )->result;
    ok( scalar @$ahResults == @$aDocumentPaths, "getInfo result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice getInfo: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq WEBSERVICE_SHOP_PATH.$invoice_in->{'Order'}, "invoice order path" );
    ok( $hResult->{'Class'} eq $invoice_in->{'Class'}, "invoice class" );
    ok( $hResult->{'Alias'} eq $invoice_in->{'Alias'}, "invoice alias" );

    $hResult = $ahResults->[1];
    ok( !$hResult->{'Error'}, "packingslip getInfo: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq WEBSERVICE_SHOP_PATH.$packingslip_in->{'Order'}, "packingslip order path" );
    ok( $hResult->{'Class'} eq $packingslip_in->{'Class'}, "packingslip class" );
    ok( $hResult->{'Alias'} eq $packingslip_in->{'Alias'}, "packingslip alias" );

    $hResult = $ahResults->[2];
    ok( !$hResult->{'Error'}, "creditnote getInfo: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq WEBSERVICE_SHOP_PATH.$creditnote_in->{'Order'}, "creditnote order path" );
    ok( $hResult->{'Class'} eq $creditnote_in->{'Class'}, "creditnote class" );
    ok( $hResult->{'Alias'} eq $creditnote_in->{'Alias'}, "creditnote alias" );
}

# Get all invoices of an Order. Check if the returned data are equal to
# the data of create call
sub testGetInvoices {

    my $ahResults = $OrderDocService->getInvoices( [$invoice_in->{'Order'}] )->result;
    ok( scalar @$ahResults == 1, "getInvoices result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInvoices: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Order'} eq $invoice_in->{'Order'}, "invoices order path" );

    my $aDocumentPaths = $hResult->{'Invoices'};
    ok( scalar @$aDocumentPaths == 1, "number of invoices" );
    ok( $aDocumentPaths->[0] eq WEBSERVICE_SHOP_PATH.$options->{'invoice_path'}.$options->{'invoice_alias'}, "invoice path" );
}

# Get all PackingSlips of an Order. Check if the returned data are equal to
# the data of create call
sub testGetPackingSlips {

    my $ahResults = $OrderDocService->getPackingSlips( [$packingslip_in->{'Order'}] )->result;
    ok( scalar @$ahResults == 1, "getPackingSlips result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getPackingSlips: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Order'} eq $packingslip_in->{'Order'}, "packingslips order path" );

    my $aDocumentPaths = $hResult->{'PackingSlips'};
    ok( scalar @$aDocumentPaths == 1, "number of packingslips" );
    ok( $aDocumentPaths->[0] eq WEBSERVICE_SHOP_PATH.$options->{'packingslip_path'}.$options->{'packingslip_alias'}, "packingslip path" );
}

# Get all CreditNotes of an Order. Check if the returned data are equal to
# the data of create call
sub testGetCreditNotes {

    my $ahResults = $OrderDocService->getCreditNotes( [$creditnote_in->{'Order'}] )->result;
    ok( scalar @$ahResults == 1, "getPackingSlips result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getCreditNote: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Order'} eq $creditnote_in->{'Order'}, "creditnotes order path" );

    my $aDocumentPaths = $hResult->{'CreditNotes'};
    ok( scalar @$aDocumentPaths == 1, "number of creditnotes" );
    ok( $aDocumentPaths->[0] eq WEBSERVICE_SHOP_PATH.$options->{'creditnote_path'}.$options->{'creditnote_alias'}, "packingslip path" );
}

# Delete a OrderDocument and check if no error occured.
sub testDelete {

    my $ahResults = $OrderDocService->delete( $aDocumentPaths )->result;
    ok( scalar @$ahResults == @$aDocumentPaths, "delete result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'invoice_path'}.$options->{'invoice_alias'}, "invoice path" );
    ok( $hResult->{'deleted'} == 1, "deleted?" );

    $hResult = $ahResults->[1];
    ok( !$hResult->{'Error'}, "packingslip delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'packingslip_path'}.$options->{'packingslip_alias'}, "packingslip path" );
    ok( $hResult->{'deleted'} == 1, "deleted?" );

    $hResult = $ahResults->[2];
    ok( !$hResult->{'Error'}, "creditnote delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'creditnote_path'}.$options->{'creditnote_alias'}, "creditnote path" );
    ok( $hResult->{'deleted'} == 1, "deleted?" );
}

# Test if a OrderDocument exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $OrderDocService->exists( $aDocumentPaths )->result;
    ok( scalar @$ahResults == @$aDocumentPaths, "exists result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'invoice_path'}.$options->{'invoice_alias'}, "invoice path" );
    ok( $hResult->{'exists'} == $exists, "exists?" );

    $hResult = $ahResults->[1];
    ok( !$hResult->{'Error'}, "packingslip exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'packingslip_path'}.$options->{'packingslip_alias'}, "packingslip path" );
    ok( $hResult->{'exists'} == $exists, "exists?" );

    $hResult = $ahResults->[2];
    ok( !$hResult->{'Error'}, "creditnote exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'creditnote_path'}.$options->{'creditnote_alias'}, "creditnote path" );
    ok( $hResult->{'exists'} == $exists, "exists?" );
}

sub deleteIfExists {
    my $ahResults = $OrderDocService->exists( $aDocumentPaths )->result;
    foreach my $hResult (@$ahResults) {
        die $hResult->{'Error'}->{'Message'} if $hResult->{'Error'};
        if ( $hResult->{'exists'} ) {
            my $ahResults2 = $OrderDocService->delete([$hResult->{'Path'}])->result;
            die $ahResults2->[0]->{'Error'}->{'Message'} if $ahResults2->[0]->{'Error'};
        }
    }
}

sub updateCreditNote {
    my $ahResults = $OrderDocService->update( [$creditnote_up] )->result;
    ok( scalar @$ahResults == 1, "update result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "creditNote update: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    #check update
    $ahResults = $OrderDocService->getInfo( [$creditnote_up->{'Path'}] )->result;
    ok( scalar @$ahResults == 1, "getInfo after update result set" );

    $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo after update: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Issued'} eq $creditnote_up->{'Issued'}, "issued updated" );



    #reset issed flag
    $ahResults = $OrderDocService->update( [$creditnote_up2] )->result;
    ok( scalar @$ahResults == 1, "update result set" );

    $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "creditNote update: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    #check resetted issued flag
    $ahResults = $OrderDocService->getInfo( [$creditnote_up2->{'Path'}] )->result;
    ok( scalar @$ahResults == 1, "getInfo after update result set" );

    $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInfo after update: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Issued'} eq $creditnote_up2->{'Issued'}, "issued reset" );

}


# run test suite
deleteIfExists();
testCreate();
testExists(1);
testGetInvoices();
testGetPackingSlips();
testGetCreditNotes();
testGetInfo();
updateCreditNote();
testDelete();
testExists(0);
