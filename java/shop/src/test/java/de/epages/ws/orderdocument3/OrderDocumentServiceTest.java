package de.epages.ws.orderdocument3;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.orderdocument3.model.TCreate_Input;
import de.epages.ws.orderdocument3.model.TCreate_Return;
import de.epages.ws.orderdocument3.model.TDelete_Return;
import de.epages.ws.orderdocument3.model.TExists_Return;
import de.epages.ws.orderdocument3.model.TGetCreditNotes_Return;
import de.epages.ws.orderdocument3.model.TGetInfo_Return;
import de.epages.ws.orderdocument3.model.TGetInvoices_Return;
import de.epages.ws.orderdocument3.model.TGetPackingSlips_Return;

public class OrderDocumentServiceTest {
    private static final OrderDocumentServiceClientImpl orderDocService = new OrderDocumentServiceClientImpl(new WebServiceTestConfiguration());

    private static final String Customer = "Customers/1001"; /* mmustermann */
    private static final String Order = Customer + "/Orders/1002";

    private static final String I = "Invoice";
    private static final String P = "PackingSlip";
    private static final String C = "CreditNote";

    private static final String AliasI = "javaTest1-" + I;
    private static final String AliasP = "javaTest1-" + P;
    private static final String AliasC = "javaTest1-" + C;

    private static final String ClassI = "/Classes/" + I;
    private static final String ClassP = "/Classes/" + P;
    private static final String ClassC = "/Classes/" + C;

    private static final String Invoices = Order + "/" + I + "s/";
    private static final String Packings = Order + "/" + P + "s/";
    private static final String Credites = Order + "/" + C + "s/";

    private static final String Invoice = Invoices + AliasI;
    private static final String Packing = Packings + AliasP;
    private static final String Creditn = Credites + AliasC;
    private static final String[] Docs = new String[] { Invoice, Packing, Creditn };

    private static final TCreate_Input Invoice_in = new TCreate_Input(AliasI, Order, ClassI, false, null);
    private static final TCreate_Input Packing_in = new TCreate_Input(AliasP, Order, ClassP, false, null);
    private static final TCreate_Input Creditn_in = new TCreate_Input(AliasC, Order, ClassC, false, null);
    private static final TCreate_Input[] Docs_in = new TCreate_Input[] { Invoice_in, Packing_in, Creditn_in };

    private static final String[] OrderAttributes = new String[] { "Comment" };
    private static final String[] AddressAttributes = new String[] { "JobTitle" /* ,"Salutation" */};

    /**
     * Sets all the required prerequisites for the tests. Will be called before and after
     * the test are run.
     */
    @ClassRule
    public static final ExternalResource setUpObjects = new ExternalResource() {
        protected void before() throws Throwable {
            cleanupObjects();
        };
        protected void after() {
            cleanupObjects();
        };
        private void cleanupObjects() {
            // delete the test order documents if they exist
            TExists_Return[] Doc_exists_out = orderDocService.exists(Docs);
            for (TExists_Return exist : Doc_exists_out) {
                if (exist.getExists()) {
                    TDelete_Return[] Doc_delete_out = orderDocService.delete(new String[] { exist.getPath() });
                    assertEquals("delete result set", 1, Doc_delete_out.length);
                    assertNoError(Doc_delete_out[0].getError());
                }
            }
        }
    };

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
        TGetInfo_Return[] Doc_out = orderDocService.getInfo(Docs, OrderAttributes, AddressAttributes, null);
        assertEquals("get invoices result set", 3, Doc_out.length);
        for (TGetInfo_Return document : Doc_out) {
            assertThat(document.getOrder(), endsWith(Order));

            String DocClass = document.get_class();
            assertTrue("check order class " + DocClass + " one of( " + ClassI + ", " + ClassP + ", " + ClassC + ")",
                    DocClass.equals(ClassI) || DocClass.equals(ClassP) || DocClass.equals(ClassC));

            if (DocClass.equals(ClassI)) {
                assertThat(document.getPath(), endsWith(Invoice));
            } else if (DocClass.equals(ClassP)) {
                assertThat(document.getPath(), endsWith(Packing));
            } else if (DocClass.equals(ClassC)) {
                assertThat(document.getPath(), endsWith(Creditn));
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
            assertThat(order.getInvoices()[0], endsWith(Invoice));
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
            assertThat(order.getPackingSlips()[0], endsWith(Packing));
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
            assertThat(order.getCreditNotes()[0], endsWith(Creditn));
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
