package de.epages.ws.orderdocument5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.orderdocument5.model.TCreate_Input;
import de.epages.ws.orderdocument5.model.TCreate_Return;
import de.epages.ws.orderdocument5.model.TDelete_Return;
import de.epages.ws.orderdocument5.model.TExists_Return;
import de.epages.ws.orderdocument5.model.TGetCreditNotes_Return;
import de.epages.ws.orderdocument5.model.TGetInfo_Return;
import de.epages.ws.orderdocument5.model.TGetInvoices_Return;
import de.epages.ws.orderdocument5.model.TGetPackingSlips_Return;

public class OrderDocumentServiceTest {
    private static final OrderDocumentServiceClientImpl orderDocService = new OrderDocumentServiceClientImpl(new WebServiceTestConfiguration());

    private final String Customer = "Customers/1001"; /* mmustermann */
    private final String Order = Customer + "/Orders/1002";

    private final String I = "Invoice";
    private final String P = "PackingSlip";
    private final String C = "CreditNote";

    private final String AliasI = "javaTest1-" + I;
    private final String AliasP = "javaTest1-" + P;
    private final String AliasC = "javaTest1-" + C;

    private final String ClassI = "/Classes/" + I;
    private final String ClassP = "/Classes/" + P;
    private final String ClassC = "/Classes/" + C;

    private final String Invoices = Order + "/" + I + "s/";
    private final String Packings = Order + "/" + P + "s/";
    private final String Credites = Order + "/" + C + "s/";

    private final String Invoice = Invoices + AliasI;
    private final String Packing = Packings + AliasP;
    private final String Creditn = Credites + AliasC;
    private final String[] Docs = new String[] { Invoice, Packing, Creditn };

    private final TCreate_Input Invoice_in = new TCreate_Input(AliasI, Order, ClassI, false, null);
    private final TCreate_Input Packing_in = new TCreate_Input(AliasP, Order, ClassP, false, null);
    private final TCreate_Input Creditn_in = new TCreate_Input(AliasC, Order, ClassC, false, null);
    private final TCreate_Input[] Docs_in = new TCreate_Input[] { Invoice_in, Packing_in, Creditn_in };

    private final String[] OrderAttributes = new String[] { "Comment" };
    private final String[] AddressAttributes = new String[] { "JobTitle" /* ,"Salutation" */};
    private final String[] LineAttributes = new String[]{"Alias"};

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // delete the test order documents if it exists
        TExists_Return[] Doc_exists_out = orderDocService.exists(Docs);
        for (TExists_Return exist : Doc_exists_out) {
            if (exist.getExists()) {
                TDelete_Return[] Doc_delete_out = orderDocService.delete(new String[] { exist.getPath() });
                assertEquals("delete result set", 1, Doc_delete_out.length);
            }
        }
    }

    /**
     * Create Order Documents and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Return[] Doc_create_out = orderDocService.create(Docs_in);
        assertEquals("create result set", 3, Doc_create_out.length);
        for (TCreate_Return create : Doc_create_out) {
            assertEquals("created?", true, create.getCreated());
        }
    }

    /**
     * Delete Order Documents and check if the deletion was successful
     */
    public void testDelete() {
        TDelete_Return[] Doc_delete_out = orderDocService.delete(Docs);
        assertEquals("delete result set", 3, Doc_delete_out.length);
        for (TDelete_Return del : Doc_delete_out) {
            assertEquals("created?", true, del.getDeleted());
        }
    }

    /**
     * Retrieve information about an OrderDocument. Check if the returned data
     * are equal to the data of create call
     */
    public void testGetInfo() {
        TGetInfo_Return[] Doc_out = orderDocService.getInfo(Docs, OrderAttributes, AddressAttributes, LineAttributes, null);
        assertEquals("get invoices result set", 3, Doc_out.length);
        for (TGetInfo_Return document : Doc_out) {
            assertEquals("order path", Order, document.getOrder());

            String DocClass = document.get_class();
            assertTrue("check order class " + DocClass + " one of( " + ClassI + ", " + ClassP + ", " + ClassC + ")",
                    DocClass.equals(ClassI) || DocClass.equals(ClassP) || DocClass.equals(ClassC));

            if (DocClass.equals(ClassI)) {
                assertEquals("invoice path", Invoice, document.getPath());
            } else if (DocClass.equals(ClassP)) {
                assertEquals("packing slip path", Packing, document.getPath());
            } else if (DocClass.equals(ClassC)) {
                assertEquals("credit note path", Creditn, document.getPath());
            }
        }
    }

    /**
     * Retrieve all invoices for an Order. Check if the returned data are equal
     * to the data of create or update call
     */
    public void testGetInvoices() {
        TGetInvoices_Return[] Invoice_out = orderDocService.getInvoices(new String[] { Order });
        assertEquals("get invoices result set", 1, Invoice_out.length);
        for (TGetInvoices_Return order : Invoice_out) {
            assertEquals("order path", Order, order.getOrder());
            assertEquals("invoices result set", 1, order.getInvoices().length);
            assertEquals("invoice path", Invoice, order.getInvoices()[0]);
        }
    }

    /**
     * Retrieve all PackingSlips for an Order. Check if the returned data are
     * equal to the data of create or update call
     */
    public void testGetPackingSlips() {
        TGetPackingSlips_Return[] Packing_out = orderDocService.getPackingSlips(new String[] { Order });
        assertEquals("get packing slips result set", 1, Packing_out.length);
        for (TGetPackingSlips_Return order : Packing_out) {
            assertEquals("order path", Order, order.getOrder());
            assertEquals("packing slips result set", 1, order.getPackingSlips().length);
            assertEquals("packing slip path", Packing, order.getPackingSlips()[0]);
        }
    }

    /**
     * Retrieve all CreditNotes for an Order. Check if the returned data are
     * equal to the data of create or update call
     */
    public void testGetCreditNotes() {
        TGetCreditNotes_Return[] Credits_out = orderDocService.getCreditNotes(new String[] { Order });
        assertEquals("get packing slips result set", 1, Credits_out.length);
        for (TGetCreditNotes_Return order : Credits_out) {
            assertEquals("order path", Order, order.getOrder());
            assertEquals("packing slips result set", 1, order.getCreditNotes().length);
            assertEquals("packing slip path", Creditn, order.getCreditNotes()[0]);
        }
    }

    /**
     * test exists method
     *
     * @param expected
     *            if false, test is successful if the Order Document does NOT
     *            exists
     */
    public void testExists(boolean expected) {
        TExists_Return[] Doc_exists_out = orderDocService.exists(Docs);
        for (TExists_Return exist : Doc_exists_out) {
            assertEquals("exists?", expected, exist.getExists());
        }
    }

    /**
     * runs all tests
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
