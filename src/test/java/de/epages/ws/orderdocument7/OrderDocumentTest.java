package de.epages.ws.orderdocument7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.orderdocument7.model.TCreate_Input;
import de.epages.ws.orderdocument7.model.TCreate_Return;
import de.epages.ws.orderdocument7.model.TDelete_Return;
import de.epages.ws.orderdocument7.model.TExists_Return;
import de.epages.ws.orderdocument7.model.TGetCreditNotes_Return;
import de.epages.ws.orderdocument7.model.TGetInfo_Return;
import de.epages.ws.orderdocument7.model.TGetInvoices_Return;
import de.epages.ws.orderdocument7.model.TGetPackingSlips_Return;


/**
 * A JUnit TestSuite to test epages Order WebServices.
 */
public class OrderDocumentTest {

    private OrderDocumentServiceClient orderDocService = new OrderDocumentServiceClientImpl(new WebServiceTestConfiguration());

    private String Customer = "/Shops/DemoShop/Customers/1001"; /* mmustermann */
    private String Order = Customer + "/Orders/1002";

    private String I = "Invoice";
    private String P = "PackingSlip";
    private String C = "CreditNote";

    private String AliasI = "javaTest1-"+I;
    private String AliasP = "javaTest1-"+P;
    private String AliasC = "javaTest1-"+C;

    private String ClassI = "/Classes/"+I;
    private String ClassP = "/Classes/"+P;
    private String ClassC = "/Classes/"+C;

    private String Invoices = Order+"/"+I+"s/";
    private String Packings = Order+"/"+P+"s/";
    private String Credites = Order+"/"+C+"s/";

    private String Invoice = Invoices+AliasI;
    private String Packing = Packings+AliasP;
    private String Creditn = Credites+AliasC;
    private String[] Docs = new String[]{Invoice,Packing,Creditn};

    private TCreate_Input Invoice_in = new TCreate_Input(AliasI, Order, ClassI, false, null);
    private TCreate_Input Packing_in = new TCreate_Input(AliasP, Order, ClassP, false, null);
    private TCreate_Input Creditn_in = new TCreate_Input(AliasC, Order, ClassC, false, null);
    private TCreate_Input[] Docs_in = new TCreate_Input[]{Invoice_in, Packing_in, Creditn_in};

    private String[] OrderAttributes = new String[]{"Comment"};
    private String[] AddressAttributes = new String[]{"JobTitle" /*,"Salutation" */ };
    private String[] LineAttributes = new String[]{"Alias"};

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        // delete the test order documents if it exists
        TExists_Return[] Doc_exists_out = orderDocService.exists(Docs);
        for (TExists_Return exist : Doc_exists_out) {
            if( exist.getExists() ) {
                TDelete_Return[] Doc_delete_out = orderDocService.delete(new String[]{exist.getPath()});
                assertEquals("delete result set", 1, Doc_delete_out.length);
            }
        }
    }

    /**
     * Create Order Documents and check if the creation was successful
     */
    public void testCreate() throws RemoteException {
        TCreate_Return[] Doc_create_out = orderDocService.create(Docs_in);
        assertEquals("create result set", 3, Doc_create_out.length);
        for (TCreate_Return create : Doc_create_out) {
            assertEquals("created?", new Boolean(true), create.getCreated());
        }
    }

    /**
     * Delete Order Documents and check if the deletion was successful
     */
    public void testDelete() throws RemoteException {
        TDelete_Return[] Doc_delete_out = orderDocService.delete(Docs);
        assertEquals("delete result set", 3, Doc_delete_out.length);
        for (TDelete_Return del : Doc_delete_out) {
            assertEquals("created?", new Boolean(true), del.getDeleted());
        }
    }

    /**
     * Retrieve information about an OrderDocument. Check if the returned data are equal to
     * the data of create call
     */
    public void testGetInfo() throws RemoteException {
        TGetInfo_Return[] Doc_out = orderDocService.getInfo(Docs, OrderAttributes, AddressAttributes, LineAttributes, null);
        assertEquals("get invoices result set", 3, Doc_out.length);
        for (TGetInfo_Return document : Doc_out) {
            assertEquals("order path", Order, document.getOrder() );

            String DocClass = document.get_class();
            assertTrue("check order class "+DocClass+" one of( "+ClassI+", "+ClassP+", "+ClassC+")",
                    DocClass.equals(ClassI) || DocClass.equals(ClassP) || DocClass.equals(ClassC));

            if ( DocClass.equals(ClassI) ) {
                assertEquals("invoice path", Invoice, document.getPath());
            } else if  ( DocClass.equals(ClassP) ) {
                assertEquals("packing slip path", Packing, document.getPath());
            } else if  ( DocClass.equals(ClassC) ) {
                assertEquals("credit note path", Creditn, document.getPath());
            }
        }
    }

    /**
     * Retrieve all invoices for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetInvoices() throws RemoteException {
        TGetInvoices_Return[] Invoice_out = orderDocService.getInvoices(new String[]{Order});
        assertEquals("get invoices result set", 1, Invoice_out.length);
        for (TGetInvoices_Return order : Invoice_out) {
            assertEquals("order path", Order, order.getOrder() );
            assertEquals("invoices result set", 1, order.getInvoices().length);
            assertEquals("invoice path", Invoice, order.getInvoices()[0]);
        }
    }

    /**
     * Retrieve all PackingSlips for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetPackingSlips() throws RemoteException {
        TGetPackingSlips_Return[] Packing_out = orderDocService.getPackingSlips(new String[]{Order});
        assertEquals("get packing slips result set", 1, Packing_out.length);
        for (TGetPackingSlips_Return order : Packing_out) {
            assertEquals("order path", Order, order.getOrder() );
            assertEquals("packing slips result set", 1, order.getPackingSlips().length);
            assertEquals("packing slip path", Packing, order.getPackingSlips()[0]);
        }
    }


    /**
     * Retrieve all CreditNotes for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetCreditNotes() throws RemoteException {
        TGetCreditNotes_Return[] Credits_out = orderDocService.getCreditNotes(new String[]{Order});
        assertEquals("get packing slips result set", 1, Credits_out.length);
        for (TGetCreditNotes_Return order : Credits_out) {
            assertEquals("order path", Order, order.getOrder() );
            assertEquals("packing slips result set", 1, order.getCreditNotes().length);
            assertEquals("packing slip path", Creditn, order.getCreditNotes()[0]);
        }
    }

    /**
    * test exists method
    * @param expected  if false, test is successful if the Order Document does NOT exists
    */
    public void testExists(boolean expected) throws RemoteException {
        TExists_Return[] Doc_exists_out = orderDocService.exists(Docs);
        for (TExists_Return exist : Doc_exists_out) {
            assertEquals("exists?", new Boolean(expected), exist.getExists());
        }
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() throws RemoteException
    {
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
