package de.epages.ws.orderdocument2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.orderdocument2.model.TCreate_Input;
import de.epages.ws.orderdocument2.model.TCreate_Return;
import de.epages.ws.orderdocument2.model.TDelete_Return;
import de.epages.ws.orderdocument2.model.TExists_Return;
import de.epages.ws.orderdocument2.model.TGetCreditNotes_Return;
import de.epages.ws.orderdocument2.model.TGetInfo_Return;
import de.epages.ws.orderdocument2.model.TGetInvoices_Return;
import de.epages.ws.orderdocument2.model.TGetPackingSlips_Return;

public class OrderDocumentServiceTest {
    private static final OrderDocumentServiceClientImpl serviceClient = new OrderDocumentServiceClientImpl(
            new WebServiceTestConfiguration());

    private final TCreate_Input invoice_in = new TCreate_Input();
    private final TCreate_Input packingslip_in = new TCreate_Input();
    private final TCreate_Input creditnote_in = new TCreate_Input();

    private final String order = "Customers/1001/Orders/1002";
    private final String invoice_path = "Customers/1001/Orders/1002/Invoices/";
    private final String invoice_alias = "myinvoice";
    private final String packingslip_path = "Customers/1001/Orders/1002/PackingSlips/";
    private final String packingslip_alias = "mypackingslip";
    private final String creditnote_path = "Customers/1001/Orders/1002/CreditNotes/";
    private final String creditnote_alias = "mycreditnote";

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
    }

    /**
     * Create a OrderDocument and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Input[] OrderDocuments_create_in = { invoice_in, packingslip_in, creditnote_in };
        TCreate_Return[] OrderDocuments_create_out = serviceClient.create(OrderDocuments_create_in);

        // test if creation was successful
        Assert.assertEquals("create result set", 3, OrderDocuments_create_out.length);
        Assert.assertEquals("invoice created?", true, OrderDocuments_create_out[0].getCreated());
        Assert.assertEquals("packingslip created?", true, OrderDocuments_create_out[1].getCreated());
        Assert.assertEquals("creditnote created?", true, OrderDocuments_create_out[2].getCreated());
    }

    /**
     * Retrieve information about an OrderDocument. Check if the returned data
     * are equal to the data of create call
     */
    public void testGetInfo() {
        TGetInfo_Return[] OrderDocuments_info_out = serviceClient.getInfo(new String[] { invoice_path + invoice_alias,
                packingslip_path + packingslip_alias, creditnote_path + creditnote_alias });

        // test if getinfo was successful and if all data are equal to input
        Assert.assertEquals("getinfo result set", 3, OrderDocuments_info_out.length);

        TGetInfo_Return invoice_out = OrderDocuments_info_out[0];
        Assert.assertEquals("order path", order, invoice_out.getOrder());
        Assert.assertEquals("invoice class", invoice_in.get_class(), invoice_out.get_class());
        Assert.assertEquals("invoice alias", invoice_in.getAlias(), invoice_out.getAlias());

        TGetInfo_Return packingslip_out = OrderDocuments_info_out[1];
        Assert.assertEquals("order path", order, packingslip_out.getOrder());
        Assert.assertEquals("packingslip class", packingslip_in.get_class(), packingslip_out.get_class());
        Assert.assertEquals("packingslip alias", packingslip_in.getAlias(), packingslip_out.getAlias());

        TGetInfo_Return creditnote_out = OrderDocuments_info_out[2];
        Assert.assertEquals("order path", order, creditnote_out.getOrder());
        Assert.assertEquals("creditnote class", creditnote_in.get_class(), creditnote_out.get_class());
        Assert.assertEquals("creditnote alias", creditnote_in.getAlias(), creditnote_out.getAlias());
    }

    /**
     * Retrieve all invoices for an Order. Check if the returned data are equal
     * to the data of create or update call
     */
    public void testGetInvoices() {
        TGetInvoices_Return[] invoices_out = serviceClient.getInvoices(new String[] { order });

        // test if getinfo was successful and if all data are equal to input
        Assert.assertEquals("getInvoices result set", 1, invoices_out.length);

        TGetInvoices_Return invoice_out = invoices_out[0];

        Assert.assertEquals("alias", order, invoice_out.getOrder());
        Assert.assertEquals("invoices result set", 1, invoice_out.getInvoices().length);
        Assert.assertEquals("invoice path", invoice_path + invoice_alias, invoice_out.getInvoices()[0]);
    }

    /**
     * Retrieve all PpackingSlips for an Order. Check if the returned data are
     * equal to the data of create or update call
     */
    public void testGetPackingSlips() {
        TGetPackingSlips_Return[] packingslips_out = serviceClient.getPackingSlips(new String[] { order });

        // test if getinfo was successful and if all data are equal to input
        Assert.assertEquals("getpackingslips result set", 1, packingslips_out.length);

        TGetPackingSlips_Return packingslip_out = packingslips_out[0];

        Assert.assertEquals("alias", order, packingslip_out.getOrder());
        Assert.assertEquals("packingslips result set", 1, packingslip_out.getPackingSlips().length);
        Assert.assertEquals("packingslip path", packingslip_path + packingslip_alias, packingslip_out.getPackingSlips()[0]);
    }

    /**
     * Retrieve all CreditNotes for an Order. Check if the returned data are
     * equal to the data of create or update call
     */
    public void testGetCreditNotes() {
        TGetCreditNotes_Return[] creditnotes_out = serviceClient.getCreditNotes(new String[] { order });

        // test if getinfo was successful and if all data are equal to input
        Assert.assertEquals("getCreditNotes result set", 1, creditnotes_out.length);

        TGetCreditNotes_Return creditnote_out = creditnotes_out[0];

        Assert.assertEquals("alias", order, creditnote_out.getOrder());
        Assert.assertEquals("creditnotes result set", 1, creditnote_out.getCreditNotes().length);
        Assert.assertEquals("creditnote path", creditnote_path + creditnote_alias, creditnote_out.getCreditNotes()[0]);
    }

    /**
     * Delete a OrderDocument and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] OrderDocuments_delete_out = serviceClient.delete(new String[] { invoice_path + invoice_alias,
                packingslip_path + packingslip_alias, creditnote_path + creditnote_alias });

        // test if deletion was successful
        Assert.assertEquals("delete result set", 3, OrderDocuments_delete_out.length);

        Assert.assertEquals("invoice deleted?", true, OrderDocuments_delete_out[0].getDeleted());
        Assert.assertEquals("packingslip deleted?", true, OrderDocuments_delete_out[1].getDeleted());
        Assert.assertEquals("creditnote deleted?", true, OrderDocuments_delete_out[2].getDeleted());
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
        Assert.assertEquals("exists result set", 3, OrderDocuments_exists_out.length);

        Assert.assertEquals("invoice exists?", expected, OrderDocuments_exists_out[0].getExists());
        Assert.assertEquals("packingslip exists?", expected, OrderDocuments_exists_out[1].getExists());
        Assert.assertEquals("creditnote exists?", expected, OrderDocuments_exists_out[2].getExists());
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
    }
}
