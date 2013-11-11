package de.epages.WebServices.OrderDocumentService2;

import de.epages.WebServices.OrderDocumentService2.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages OrderDocument WebServices.
 *
 * User: tmangner
 * Date: 08.12.2005
 * Time: 14:19:18
 */
public class OrderDocument2TestCase {
    private static Logger log = Logger.getLogger(OrderDocument2TestCase.class.getName());
    OrderDocumentService2Client serviceClient;
    TCreate_Input invoice_in = new TCreate_Input();
    TCreate_Input packingslip_in = new TCreate_Input();
    TCreate_Input creditnote_in = new TCreate_Input();

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
        serviceClient = new OrderDocumentService2Client();

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
    }

    /**
     * Create a OrderDocument and check if the creation was successful
     */
    public void testCreate() {
        List<TCreate_Input> OrderDocuments_create_in = new ArrayList();
        OrderDocuments_create_in.add(invoice_in);
        OrderDocuments_create_in.add(packingslip_in);
        OrderDocuments_create_in.add(creditnote_in);

        List<TCreate_Return> OrderDocuments_create_out = new ArrayList();

        try {
            OrderDocuments_create_out = serviceClient.createOrderDocument(OrderDocuments_create_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        Assert.assertEquals("create result set", 3, OrderDocuments_create_out.size());
        Assert.assertEquals("invoice created?", new Boolean(true), OrderDocuments_create_out.get(0).getCreated());
        Assert.assertEquals("packingslip created?", new Boolean(true), OrderDocuments_create_out.get(1).getCreated());
        Assert.assertEquals("creditnote created?", new Boolean(true), OrderDocuments_create_out.get(2).getCreated());
    }

    /**
     * Retrieve information about an OrderDocument. Check if the returned data are equal to
     * the data of create call
     */
    public void testGetInfo() {
        List<TGetInfo_Return> OrderDocuments_info_out = new ArrayList();
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
        Assert.assertEquals("getinfo result set", 3, OrderDocuments_info_out.size());

        TGetInfo_Return invoice_out = OrderDocuments_info_out.get(0);
        Assert.assertEquals("order path", order, invoice_out.getOrder());
        Assert.assertEquals("invoice class", invoice_in.get_class(), invoice_out.get_class());
        Assert.assertEquals("invoice alias", invoice_in.getAlias(),  invoice_out.getAlias());

        TGetInfo_Return packingslip_out = OrderDocuments_info_out.get(1);
        Assert.assertEquals("order path", order, packingslip_out.getOrder());
        Assert.assertEquals("packingslip class", packingslip_in.get_class(), packingslip_out.get_class());
        Assert.assertEquals("packingslip alias", packingslip_in.getAlias(),  packingslip_out.getAlias());

        TGetInfo_Return creditnote_out = OrderDocuments_info_out.get(2);
        Assert.assertEquals("order path", order, creditnote_out.getOrder());
        Assert.assertEquals("creditnote class", creditnote_in.get_class(), creditnote_out.get_class());
        Assert.assertEquals("creditnote alias", creditnote_in.getAlias(),  creditnote_out.getAlias());
    }

    /**
     * Retrieve all invoices for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetInvoices() {
        List<TGetInvoices_Return> invoices_out = new ArrayList();
        try {
            invoices_out = serviceClient.getInvoices(
                new String[]{order}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        Assert.assertEquals("getInvoices result set", 1, invoices_out.size());

        TGetInvoices_Return invoice_out = invoices_out.get(0);

        Assert.assertEquals("alias", order, invoice_out.getOrder());
        Assert.assertEquals("invoices result set", 1, invoice_out.getInvoices().length);
        Assert.assertEquals("invoice path", invoice_path + invoice_alias, invoice_out.getInvoices()[0]);
    }

    /**
     * Retrieve all PpackingSlips for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetPackingSlips() {
        List<TGetPackingSlips_Return> packingslips_out = new ArrayList();
        try {
            packingslips_out = serviceClient.getPackingSlips(
                new String[]{order}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        Assert.assertEquals("getpackingslips result set", 1, packingslips_out.size());

        TGetPackingSlips_Return packingslip_out = packingslips_out.get(0);

        Assert.assertEquals("alias", order, packingslip_out.getOrder());
        Assert.assertEquals("packingslips result set", 1, packingslip_out.getPackingSlips().length);
        Assert.assertEquals("packingslip path", packingslip_path + packingslip_alias, packingslip_out.getPackingSlips()[0]);
    }

    /**
     * Retrieve all CreditNotes for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetCreditNotes() {
        List<TGetCreditNotes_Return> creditnotes_out = new ArrayList();
        try {
            creditnotes_out = serviceClient.getCreditNotes(
                new String[]{order}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        Assert.assertEquals("getCreditNotes result set", 1, creditnotes_out.size());

        TGetCreditNotes_Return creditnote_out = creditnotes_out.get(0);

        Assert.assertEquals("alias", order, creditnote_out.getOrder());
        Assert.assertEquals("creditnotes result set", 1, creditnote_out.getCreditNotes().length);
        Assert.assertEquals("creditnote path", creditnote_path + creditnote_alias, creditnote_out.getCreditNotes()[0]);
    }

    /**
     * Delete a OrderDocument and check if no error occured.
     */
    public void testDelete() {
        List<TDelete_Return> OrderDocuments_delete_out = new ArrayList();
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
        Assert.assertEquals("delete result set", 3, OrderDocuments_delete_out.size());

        Assert.assertEquals("invoice deleted?", new Boolean(true), OrderDocuments_delete_out.get(0).getDeleted());
        Assert.assertEquals("packingslip deleted?", new Boolean(true), OrderDocuments_delete_out.get(1).getDeleted());
        Assert.assertEquals("creditnote deleted?", new Boolean(true), OrderDocuments_delete_out.get(2).getDeleted());
    }

    /**
     * Test if a OrderDocument exists or not
     * @param expected if false the Test will be successful if the OrderDocument does NOT exist
     */
    public void testExists(boolean expected) {
        List<TExists_Return> OrderDocuments_exists_out = new ArrayList();
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
        Assert.assertEquals("exists result set", 3, OrderDocuments_exists_out.size());

        Assert.assertEquals("invoice exists?", new Boolean(expected), OrderDocuments_exists_out.get(0).getExists());
        Assert.assertEquals("packingslip exists?", new Boolean(expected), OrderDocuments_exists_out.get(1).getExists());
        Assert.assertEquals("creditnote exists?", new Boolean(expected), OrderDocuments_exists_out.get(2).getExists());
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
    }
}
