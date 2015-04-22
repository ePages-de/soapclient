use strict;
use Test::More tests => 88;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH);

my $OrderDocService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/OrderDocumentService/2005/01' )
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

#-- documents without Alias
my $invoice_in_new = {
    'Class' => '/Classes/Invoice',
    'Order' => 'Customers/1001/Orders/1001',
    'Issued' => 0,
};

my $packingslip_in_new = {
    'Class' => '/Classes/PackingSlip',
    'Order' => 'Customers/1001/Orders/1001',
    'Issued' => 0,
};

my $creditnote_in_new = {
    'Class' => '/Classes/CreditNote',
    'Order' => 'Customers/1001/Orders/1001',
    'Issued' => 0,
};

#-- issued documents
my $invoice_in_issued = {
    'Class' => '/Classes/Invoice',
    'Order' => $options->{'order'},
    'Alias' => $options->{'invoice_alias'},
    'Issued' => 1,
};

#my $packingslip_in = {
#    'Class' => '/Classes/PackingSlip',
#    'Order' => $options->{'order'},
#    'Alias' => $options->{'packingslip_alias'},
#    'Issued' => 0,
#};
#
#my $creditnote_in = {
#    'Class' => '/Classes/CreditNote',
#    'Order' => $options->{'order'},
#    'Alias' => $options->{'creditnote_alias'},
#    'Issued' => 0,
#};

my $aDocumentPaths = [
    $options->{'invoice_path'}      . $options->{'invoice_alias'},
    $options->{'packingslip_path'}  . $options->{'packingslip_alias'},
    $options->{'creditnote_path'}   . $options->{'creditnote_alias'},
];

# Create a OrderDocument and check if the creation was successful
sub testCreate {
    my $aOrderDocuments = [$invoice_in, $packingslip_in, $creditnote_in];

    my $ahResults = $OrderDocService->create( $aOrderDocuments )->result;
    is( scalar @$ahResults, @$aOrderDocuments, "create result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $invoice_in->{'Order'}, "invoice order path" );
    ok( $hResult->{'Alias'} eq $invoice_in->{'Alias'}, "invoice" );
    is( $hResult->{'created'}, 1, "created?" );

    $hResult = $ahResults->[1];
    ok( !$hResult->{'Error'}, "packingslip create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $packingslip_in->{'Order'}, "packingslip order path" );
    ok( $hResult->{'Alias'} eq $packingslip_in->{'Alias'}, "packingslip" );
    is( $hResult->{'created'}, 1, "created?" );

    $hResult = $ahResults->[2];
    ok( !$hResult->{'Error'}, "creditnote create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $creditnote_in->{'Order'}, "creditnote order path" );
    ok( $hResult->{'Alias'} eq $creditnote_in->{'Alias'}, "creditnote" );
    is( $hResult->{'created'}, 1, "created?" );
}

# Retrieve information about an OrderDocument. Check if the returned data are equal to
# the data of create call
sub testGetInfo {

    my $ahResults = $OrderDocService->getInfo( $aDocumentPaths )->result;
    is( scalar @$ahResults, @$aDocumentPaths, "getInfo result set" );

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
    is( scalar @$ahResults, 1, "getInvoices result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getInvoices: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Order'} eq $invoice_in->{'Order'}, "invoices order path" );

    my $aDocumentPaths = $hResult->{'Invoices'};
    is( scalar @$aDocumentPaths, 1, "number of invoices" );
    ok( $aDocumentPaths->[0] eq WEBSERVICE_SHOP_PATH.$options->{'invoice_path'}.$options->{'invoice_alias'}, "invoice path" );
}

# Get all PackingSlips of an Order. Check if the returned data are equal to
# the data of create call
sub testGetPackingSlips {

    my $ahResults = $OrderDocService->getPackingSlips( [$packingslip_in->{'Order'}] )->result;
    is( scalar @$ahResults, 1, "getPackingSlips result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getPackingSlips: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Order'} eq $packingslip_in->{'Order'}, "packingslips order path" );

    my $aDocumentPaths = $hResult->{'PackingSlips'};
    is( scalar @$aDocumentPaths, 1, "number of packingslips" );
    ok( $aDocumentPaths->[0] eq WEBSERVICE_SHOP_PATH.$options->{'packingslip_path'}.$options->{'packingslip_alias'}, "packingslip path" );
}

# Get all CreditNotes of an Order. Check if the returned data are equal to
# the data of create call
sub testGetCreditNotes {

    my $ahResults = $OrderDocService->getCreditNotes( [$creditnote_in->{'Order'}] )->result;
    is( scalar @$ahResults, 1, "getPackingSlips result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "getCreditNote: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Order'} eq $creditnote_in->{'Order'}, "creditnotes order path" );

    my $aDocumentPaths = $hResult->{'CreditNotes'};
    is( scalar @$aDocumentPaths, 1, "number of creditnotes" );
    ok( $aDocumentPaths->[0] eq WEBSERVICE_SHOP_PATH.$options->{'creditnote_path'}.$options->{'creditnote_alias'}, "packingslip path" );
}

# Delete a OrderDocument and check if no error occured.
sub testDelete {

    my $ahResults = $OrderDocService->delete( $aDocumentPaths )->result;
    is( scalar @$ahResults, @$aDocumentPaths, "delete result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    is( $hResult->{'deleted'}, 1, "deleted?" );

    $hResult = $ahResults->[1];
    ok( !$hResult->{'Error'}, "packingslip delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    is( $hResult->{'deleted'}, 1, "deleted?" );

    $hResult = $ahResults->[2];
    ok( !$hResult->{'Error'}, "creditnote delete: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    is( $hResult->{'deleted'}, 1, "deleted?" );
}

# Test if a OrderDocument exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $OrderDocService->exists( $aDocumentPaths )->result;
    is( scalar @$ahResults, @$aDocumentPaths, "exists result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'invoice_path'}.$options->{'invoice_alias'}, "invoice path" );
    is( $hResult->{'exists'}, $exists, "exists?" );

    $hResult = $ahResults->[1];
    ok( !$hResult->{'Error'}, "packingslip exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'packingslip_path'}.$options->{'packingslip_alias'}, "packingslip path" );
    is( $hResult->{'exists'}, $exists, "exists?" );

    $hResult = $ahResults->[2];
    ok( !$hResult->{'Error'}, "creditnote exists: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Path'} eq $options->{'creditnote_path'}.$options->{'creditnote_alias'}, "creditnote path" );
    is( $hResult->{'exists'}, $exists, "exists?" );
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


# Create a OrderDocument with Alias generation and check if the creation was successful
sub testCreate_new {
    my $aOrderDocuments = [$invoice_in_new, $packingslip_in_new, $creditnote_in_new];

    my $ahResults = $OrderDocService->create( $aOrderDocuments )->result;
    is( scalar @$ahResults, @$aOrderDocuments, "create result set" );

    my @Paths;

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $invoice_in_new->{'Order'}, "invoice order path" );
    ok( $hResult->{'Alias'}, "new invoice alias $hResult->{'Alias'}" );
    is( $hResult->{'created'}, 1, "created?" );
    push @Paths, $hResult->{'Path'};

    $hResult = $ahResults->[1];
    ok( !$hResult->{'Error'}, "packingslip create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $packingslip_in_new->{'Order'}, "packingslip order path" );
    ok( $hResult->{'Alias'}, "new packingslip alias $hResult->{'Alias'}" );
    is( $hResult->{'created'}, 1, "created?" );
    push @Paths, $hResult->{'Path'};

    $hResult = $ahResults->[2];
    ok( !$hResult->{'Error'}, "creditnote create: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $creditnote_in_new->{'Order'}, "creditnote order path" );
    ok( $hResult->{'Alias'}, "new creditnote alias $hResult->{'Alias'}" );
    is( $hResult->{'created'}, 1, "created?" );
    push @Paths, $hResult->{'Path'};

    return \@Paths;
}

# Create a OrderDocument with issued flag
sub testCreate_issued {
    my $aOrderDocuments = [$invoice_in_issued];

    my $ahResults = $OrderDocService->create( $aOrderDocuments )->result;
    is( scalar @$ahResults, @$aOrderDocuments, "create result set" );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "invoice create issued: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq $invoice_in_issued->{'Order'}, "invoice order path" );
    ok( $hResult->{'Alias'}, "new invoice alias $hResult->{'Alias'}" );
    is( $hResult->{'created'}, 1, "created?" );

    #check result with getInfo
    $ahResults = $OrderDocService->getInfo( [$hResult->{'Path'}] )->result;
    is( scalar @$ahResults, 1, "getInfo issued invoice result set" );

    $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, "issued invoice getInfo: no error" );
    diag "Error: $hResult->{'Error'}->{'Message'}\n" if $hResult->{'Error'};
    ok( $hResult->{'Order'} eq WEBSERVICE_SHOP_PATH.$invoice_in_issued->{'Order'}, "issued invoice order path" );
    ok( $hResult->{'Class'} eq $invoice_in_issued->{'Class'}, "issued invoice class" );
    ok( $hResult->{'Alias'} eq $invoice_in_issued->{'Alias'}, "issued invoice alias" );
    ok( $hResult->{'Issued'} eq $invoice_in_issued->{'Issued'}, "issued invoice flag" );

}



# run test suite
deleteIfExists();
testCreate();
testExists(1);
testGetInvoices();
testGetPackingSlips();
testGetCreditNotes();
testGetInfo();
testDelete();
testExists(0);

#--- test Alias generation
$aDocumentPaths = testCreate_new();
testDelete();

#--- test issued generation
#testCreate_issued();
