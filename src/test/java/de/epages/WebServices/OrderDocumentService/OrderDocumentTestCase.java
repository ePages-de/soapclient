package de.epages.WebServices.OrderDocumentService;

import de.epages.WebServices.OrderDocumentService.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages OrderDocument WebServices.
 */
public class OrderDocumentTestCase {
    private static Logger log = Logger.getLogger(OrderDocumentTestCase.class.getName());
    OrderDocumentServiceClient serviceClient;
    TCreate_Input invoice_in = new TCreate_Input();
    TCreate_Input packingslip_in = new TCreate_Input();
    TCreate_Input creditnote_in = new TCreate_Input();
    TCreate_Input invoiceIssuedIn = new TCreate_Input();

    String order = "/Shops/DemoShop/Customers/1001/Orders/1002";
    String invoice_path = "/Shops/DemoShop/Customers/1001/Orders/1002/Invoices/";
    String invoice_alias = "myinvoice";
    String packingslip_path = "/Shops/DemoShop/Customers/1001/Orders/1002/PackingSlips/";
    String packingslip_alias = "mypackingslip";
    String creditnote_path = "/Shops/DemoShop/Customers/1001/Orders/1002/CreditNotes/";
    String creditnote_alias = "mycreditnote";

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new OrderDocumentServiceClient();

        // create test OrderDocuments that can be used with the create and update methods
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

        // create test OrderDocuments that can be used with the create and update methods
        invoiceIssuedIn.setOrder(order);
        invoiceIssuedIn.set_class("/Classes/Invoice");
        invoiceIssuedIn.setIssued(true);

        // delete the test order document if it exists
        List<TExists_Return> OrderDocuments_exists_out;
        try {
            OrderDocuments_exists_out = serviceClient.existsOrderDocument(new String[]{
                    invoice_path + invoice_alias,
                    packingslip_path + packingslip_alias,
                    creditnote_path + creditnote_alias
            });
            if( OrderDocuments_exists_out.get(0).getExists() ) {
                serviceClient.deleteOrderDocument(new String[]{
                        invoice_path + invoice_alias,
                        packingslip_path + packingslip_alias,
                        creditnote_path + creditnote_alias
                });
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a OrderDocument and check if the creation was successful
     */
    public void testCreate() {
        List<TCreate_Input> OrderDocuments_create_in = new Vector<TCreate_Input>();
        OrderDocuments_create_in.add(invoice_in);
        OrderDocuments_create_in.add(packingslip_in);
        OrderDocuments_create_in.add(creditnote_in);

        List<TCreate_Return> OrderDocuments_create_out = null;

        try {
            OrderDocuments_create_out = serviceClient.createOrderDocument(OrderDocuments_create_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        assertEquals("create result set", 3, OrderDocuments_create_out.size());
        assertEquals("invoice created?", new Boolean(true), OrderDocuments_create_out.get(0).getCreated());
        assertEquals("packingslip created?", new Boolean(true), OrderDocuments_create_out.get(1).getCreated());
        assertEquals("creditnote created?", new Boolean(true), OrderDocuments_create_out.get(2).getCreated());
    }

    /**
     * Create an issued OrderDocument and check if the creation was successful and the issued flag is true
     */
    public void testCreate_issued() {
        List<TCreate_Input> orderDocsCreateIssuedIn = new Vector<TCreate_Input>();
        orderDocsCreateIssuedIn.add(invoiceIssuedIn);

        try {
            List<TCreate_Return> orderDocsCreateOut = null;
            orderDocsCreateOut = serviceClient.createOrderDocument(orderDocsCreateIssuedIn);

            // test if creation was successful
            assertEquals("create (issued) result set", 1, orderDocsCreateOut.size());

            // get info of the issued order document
            String orderDucumentPath = orderDocsCreateOut.get(0).getPath();
            List<TGetInfo_Return> orderDocsInfoOut = null;
            orderDocsInfoOut = serviceClient.getOrderDocumentInfo( new String[]{orderDucumentPath} );

            // test if issued flag is true
            assertTrue("got issued is true", orderDocsInfoOut.get(0).getIssued());

        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieve information about an OrderDocument. Check if the returned data are equal to
     * the data of create call
     */
    public void testGetInfo() {
        List<TGetInfo_Return> OrderDocuments_info_out = null;
        try {
            OrderDocuments_info_out = serviceClient.getOrderDocumentInfo(
                new String[]{
                        invoice_path + invoice_alias,
                        packingslip_path + packingslip_alias,
                        creditnote_path + creditnote_alias
                    }
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 3, OrderDocuments_info_out.size());

        TGetInfo_Return invoice_out = OrderDocuments_info_out.get(0);
        assertEquals("order path", order, invoice_out.getOrder());
        assertEquals("invoice class", invoice_in.get_class(), invoice_out.get_class());
        assertEquals("invoice alias", invoice_in.getAlias(),  invoice_out.getAlias());

        TGetInfo_Return packingslip_out = OrderDocuments_info_out.get(1);
        assertEquals("order path", order, packingslip_out.getOrder());
        assertEquals("packingslip class", packingslip_in.get_class(), packingslip_out.get_class());
        assertEquals("packingslip alias", packingslip_in.getAlias(),  packingslip_out.getAlias());

        TGetInfo_Return creditnote_out = OrderDocuments_info_out.get(2);
        assertEquals("order path", order, creditnote_out.getOrder());
        assertEquals("creditnote class", creditnote_in.get_class(), creditnote_out.get_class());
        assertEquals("creditnote alias", creditnote_in.getAlias(),  creditnote_out.getAlias());
    }

    /**
     * Retrieve all invoices for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetInvoices() {
        List<TGetInvoices_Return> invoices_out = null;
        try {
            invoices_out = serviceClient.getInvoices(
                new String[]{order}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getInvoices result set", 1, invoices_out.size());

        TGetInvoices_Return invoice_out = invoices_out.get(0);

        assertEquals("alias", order, invoice_out.getOrder());
        assertTrue("invoices result set", invoice_out.getInvoices().length > 0);
        //assertEquals("invoice path", invoice_path + invoice_alias, invoice_out.getInvoices()[0]);
    }

    /**
     * Retrieve all PpackingSlips for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetPackingSlips() {
        List<TGetPackingSlips_Return> packingslips_out = null;
        try {
            packingslips_out = serviceClient.getPackingSlips(
                new String[]{order}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getpackingslips result set", 1, packingslips_out.size());

        TGetPackingSlips_Return packingslip_out = packingslips_out.get(0);

        assertEquals("alias", order, packingslip_out.getOrder());
        assertEquals("packingslips result set", 1, packingslip_out.getPackingSlips().length);
        assertEquals("packingslip path", packingslip_path + packingslip_alias, packingslip_out.getPackingSlips()[0]);
    }

    /**
     * Retrieve all CreditNotes for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetCreditNotes() {
        List<TGetCreditNotes_Return> creditnotes_out = null;
        try {
            creditnotes_out = serviceClient.getCreditNotes(
                new String[]{order}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getCreditNotes result set", 1, creditnotes_out.size());

        TGetCreditNotes_Return creditnote_out = creditnotes_out.get(0);

        assertEquals("alias", order, creditnote_out.getOrder());
        assertEquals("creditnotes result set", 1, creditnote_out.getCreditNotes().length);
        assertEquals("creditnote path", creditnote_path + creditnote_alias, creditnote_out.getCreditNotes()[0]);
    }

    /**
     * Delete a OrderDocument and check if no error occured.
     */
    public void testDelete() {
        List<TDelete_Return> OrderDocuments_delete_out = null;
        try {
            OrderDocuments_delete_out = serviceClient.deleteOrderDocument(new String[]{
                        invoice_path + invoice_alias,
                        packingslip_path + packingslip_alias,
                        creditnote_path + creditnote_alias
                    });
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if deletion was successful
        assertEquals("delete result set", 3, OrderDocuments_delete_out.size());

        assertEquals("invoice deleted?", new Boolean(true), OrderDocuments_delete_out.get(0).getDeleted());
        assertEquals("packingslip deleted?", new Boolean(true), OrderDocuments_delete_out.get(1).getDeleted());
        assertEquals("creditnote deleted?", new Boolean(true), OrderDocuments_delete_out.get(2).getDeleted());
    }

    /**
     * Test if a OrderDocument exists or not
     * @param expected if false the Test will be successful if the OrderDocument does NOT exist
     */
    public void testExists(boolean expected) {
        List<TExists_Return> OrderDocuments_exists_out = null;
        try {
            OrderDocuments_exists_out = serviceClient.existsOrderDocument(new String[]{
                        invoice_path + invoice_alias,
                        packingslip_path + packingslip_alias,
                        creditnote_path + creditnote_alias
                    });
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if exists check was successful
        assertEquals("exists result set", 3, OrderDocuments_exists_out.size());

        assertEquals("invoice exists?", new Boolean(expected), OrderDocuments_exists_out.get(0).getExists());
        assertEquals("packingslip exists?", new Boolean(expected), OrderDocuments_exists_out.get(1).getExists());
        assertEquals("creditnote exists?", new Boolean(expected), OrderDocuments_exists_out.get(2).getExists());
    }

    /**
     * Runs all tests:
     * <ol>
     *   <li>create a OrderDocument</li>
     *   <li>test if this OrderDocument exists afterwards</li>
     *   <li>retrieve info about this OrderDocument, and check if the data equals to the input data of create</li>
     *   <li>delete the OrderDocument</li>
     *   <li>check if the OrderDocument still exists</li>
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
        //enable the test of issued documents
        //only if no following test needs a clean demo content
        //testCreate_issued();
    }
}
