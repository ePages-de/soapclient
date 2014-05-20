package de.epages.ws.orderdocument;

import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.orderdocument.model.TCreate_Input;
import de.epages.ws.orderdocument.model.TCreate_Return;
import de.epages.ws.orderdocument.model.TDelete_Return;
import de.epages.ws.orderdocument.model.TExists_Return;
import de.epages.ws.orderdocument.model.TGetCreditNotes_Return;
import de.epages.ws.orderdocument.model.TGetInfo_Return;
import de.epages.ws.orderdocument.model.TGetInvoices_Return;
import de.epages.ws.orderdocument.model.TGetPackingSlips_Return;

public class OrderDocumentServiceTest {
    private static final OrderDocumentServiceClientImpl serviceClient = new OrderDocumentServiceClientImpl(
            new WebServiceTestConfiguration());
    private static final TCreate_Input invoice_in = new TCreate_Input();
    private static final TCreate_Input packingslip_in = new TCreate_Input();
    private static final TCreate_Input creditnote_in = new TCreate_Input();
    private static final TCreate_Input invoiceIssuedIn = new TCreate_Input();

    private static final String order = "Customers/1001/Orders/1002";
    private static final String invoice_path = "Customers/1001/Orders/1002/Invoices/";
    private static final String invoice_alias = "javaTest1-Invoice";
    private static final String packingslip_path = "Customers/1001/Orders/1002/PackingSlips/";
    private static final String packingslip_alias = "javaTest1-PackingSlip";
    private static final String creditnote_path = "Customers/1001/Orders/1002/CreditNotes/";
    private static final String creditnote_alias = "javaTest1-CreditNote";

    @ClassRule
    public static final ExternalResource setUpObjects = new ExternalResource() {
        protected void before() throws Throwable {
            cleanupObjects();
        };
        @Override
        protected void after() {
            cleanupObjects();
        }
        private void cleanupObjects() {
            serviceClient.delete(new String[] { invoice_path + invoice_alias , packingslip_path + packingslip_alias , creditnote_path + creditnote_alias });
        }
    };


    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // create test OrderDocuments that can be used with the create and
        // update methods
        invoice_in.setOrder(order);
        invoice_in.set_class("/Classes/Invoice");
        invoice_in.setAlias(invoice_alias);
        invoice_in.setIssued(false);

        packingslip_in.setOrder(order);
        packingslip_in.set_class("/Classes/PackingSlip");
        packingslip_in.setAlias(packingslip_alias);
        packingslip_in.setIssued(false);

        creditnote_in.setOrder(order);
        creditnote_in.set_class("/Classes/CreditNote");
        creditnote_in.setAlias(creditnote_alias);
        creditnote_in.setIssued(false);

        // create test OrderDocuments that can be used with the create and
        // update methods
        invoiceIssuedIn.setOrder(order);
        invoiceIssuedIn.set_class("/Classes/Invoice");
        invoiceIssuedIn.setIssued(true);
    }

    /**
     * Create a OrderDocument and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Input[] OrderDocuments_create_in = { invoice_in, packingslip_in, creditnote_in };

        TCreate_Return[] OrderDocuments_create_out = serviceClient.create(OrderDocuments_create_in);

        // test if creation was successful
        assertEquals("create result set", 3, OrderDocuments_create_out.length);
        assertEquals("invoice created?", true, OrderDocuments_create_out[0].getCreated());
        assertEquals("packingslip created?", true, OrderDocuments_create_out[1].getCreated());
        assertEquals("creditnote created?", true, OrderDocuments_create_out[2].getCreated());
    }

    /**
     * Create an issued OrderDocument and check if the creation was successful
     * and the issued flag is true
     */
    public void testCreate_issued() {
        TCreate_Input[] orderDocsCreateIssuedIn = { invoiceIssuedIn };
        TCreate_Return[] orderDocsCreateOut = serviceClient.create(orderDocsCreateIssuedIn);

        // test if creation was successful
        assertEquals("create (issued) result set", 1, orderDocsCreateOut.length);

        // get info of the issued order document
        String orderDucumentPath = orderDocsCreateOut[0].getPath();
        TGetInfo_Return[] orderDocsInfoOut = serviceClient.getInfo(new String[] { orderDucumentPath });

        // test if issued flag is true
        assertTrue("got issued is true", orderDocsInfoOut[0].getIssued());
    }

    /**
     * Retrieve information about an OrderDocument. Check if the returned data
     * are equal to the data of create call
     */
    public void testGetInfo() {
        TGetInfo_Return[] OrderDocuments_info_out = serviceClient.getInfo(new String[] { invoice_path + invoice_alias,
                packingslip_path + packingslip_alias, creditnote_path + creditnote_alias });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 3, OrderDocuments_info_out.length);

        TGetInfo_Return invoice_out = OrderDocuments_info_out[0];
        assertThat(invoice_out.getOrder(), endsWith(order));
        assertEquals("invoice class", invoice_in.get_class(), invoice_out.get_class());
        assertEquals("invoice alias", invoice_in.getAlias(), invoice_out.getAlias());

        TGetInfo_Return packingslip_out = OrderDocuments_info_out[1];
        assertThat(packingslip_out.getOrder(), endsWith(order));
        assertEquals("packingslip class", packingslip_in.get_class(), packingslip_out.get_class());
        assertEquals("packingslip alias", packingslip_in.getAlias(), packingslip_out.getAlias());

        TGetInfo_Return creditnote_out = OrderDocuments_info_out[2];
        assertThat(creditnote_out.getOrder(), endsWith(order));
        assertEquals("creditnote class", creditnote_in.get_class(), creditnote_out.get_class());
        assertEquals("creditnote alias", creditnote_in.getAlias(), creditnote_out.getAlias());
    }

    /**
     * Retrieve all invoices for an Order. Check if the returned data are equal
     * to the data of create or update call
     */
    public void testGetInvoices() {
        TGetInvoices_Return[] invoices_out = serviceClient.getInvoices(new String[] { order });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getInvoices result set", 1, invoices_out.length);

        TGetInvoices_Return invoice_out = invoices_out[0];

        assertEquals("alias", order, invoice_out.getOrder());
        assertTrue("invoices result set", invoice_out.getInvoices().length > 0);
        // assertEquals("invoice path", invoice_path + invoice_alias,
        // invoice_out.getInvoices()[0]);
    }

    /**
     * Retrieve all PpackingSlips for an Order. Check if the returned data are
     * equal to the data of create or update call
     */
    public void testGetPackingSlips() {
        TGetPackingSlips_Return[] packingslips_out = serviceClient.getPackingSlips(new String[] { order });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getpackingslips result set", 1, packingslips_out.length);

        TGetPackingSlips_Return packingslip_out = packingslips_out[0];

        assertEquals("alias", order, packingslip_out.getOrder());
        assertEquals("packingslips result set", 1, packingslip_out.getPackingSlips().length);
        assertThat(packingslip_out.getPackingSlips()[0], endsWith(packingslip_path + packingslip_alias));
    }

    /**
     * Retrieve all CreditNotes for an Order. Check if the returned data are
     * equal to the data of create or update call
     */
    public void testGetCreditNotes() {
        TGetCreditNotes_Return[] creditnotes_out = serviceClient.getCreditNotes(new String[] { order });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getCreditNotes result set", 1, creditnotes_out.length);

        TGetCreditNotes_Return creditnote_out = creditnotes_out[0];

        assertEquals("alias", order, creditnote_out.getOrder());
        assertEquals("creditnotes result set", 1, creditnote_out.getCreditNotes().length);
        assertThat(creditnote_out.getCreditNotes()[0], endsWith(creditnote_path + creditnote_alias));
    }

    /**
     * Delete a OrderDocument and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] OrderDocuments_delete_out = serviceClient.delete(new String[] { invoice_path + invoice_alias,
                packingslip_path + packingslip_alias, creditnote_path + creditnote_alias });

        // test if deletion was successful
        assertEquals("delete result set", 3, OrderDocuments_delete_out.length);

        assertTrue("invoice deleted?", OrderDocuments_delete_out[0].getDeleted());
        assertTrue("packingslip deleted?", OrderDocuments_delete_out[1].getDeleted());
        assertTrue("creditnote deleted?", OrderDocuments_delete_out[2].getDeleted());
    }

    /**
     * Test if a OrderDocument exists or not
     *
     * @param expected
     *            if false the Test will be successful if the OrderDocument does
     *            NOT exist
     */
    public void testExists(boolean expected) {
        TExists_Return[] OrderDocuments_exists_out = serviceClient.exists(new String[] { invoice_path + invoice_alias,
                packingslip_path + packingslip_alias, creditnote_path + creditnote_alias });

        // test if exists check was successful
        assertEquals("exists result set", 3, OrderDocuments_exists_out.length);

        assertEquals("invoice exists?", expected, OrderDocuments_exists_out[0].getExists());
        assertEquals("packingslip exists?", expected, OrderDocuments_exists_out[1].getExists());
        assertEquals("creditnote exists?", expected, OrderDocuments_exists_out[2].getExists());
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>create a OrderDocument</li>
     * <li>test if this OrderDocument exists afterwards</li>
     * <li>retrieve info about this OrderDocument, and check if the data equals
     * to the input data of create</li>
     * <li>delete the OrderDocument</li>
     * <li>check if the OrderDocument still exists</li>
     * </ol>
     */
    @Test
    public void testAll() {
        testCreate();
        testExists(true);
        testGetInvoices();
        testGetPackingSlips();
        testGetCreditNotes();
        testGetInfo();
        testDelete();
        testExists(false);
        // enable the test of issued documents
        // only if no following test needs a clean demo content
        // testCreate_issued();
    }
}
