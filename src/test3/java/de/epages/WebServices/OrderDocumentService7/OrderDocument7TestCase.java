package de.epages.WebServices.OrderDocumentService7;

import de.epages.WebServices.OrderDocumentService7.Stub.*;
import de.epages.WebServices.OrderService9.Stub.TAttribute;
import de.epages.WebServices.WebServiceTestConfiguration;
import org.junit.*;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;
import java.net.MalformedURLException;

/**
 * A JUnit TestSuite to test epages Order WebServices.
 */
public class OrderDocument7TestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(OrderDocument7TestCase.class.getName());

    private Bind_OrderDocument_SOAPStub orderDocService;

    String Customer = "/Shops/DemoShop/Customers/1001"; /* mmustermann */
    String Order = Customer + "/Orders/1002";

    String I = "Invoice";
    String P = "PackingSlip";
    String C = "CreditNote";

    String AliasI = "javaTest1-"+I;
    String AliasP = "javaTest1-"+P;
    String AliasC = "javaTest1-"+C;

    String ClassI = "/Classes/"+I;
    String ClassP = "/Classes/"+P;
    String ClassC = "/Classes/"+C;

    String Invoices = Order+"/"+I+"s/";
    String Packings = Order+"/"+P+"s/";
    String Credites = Order+"/"+C+"s/";

    String Invoice = Invoices+AliasI;
    String Packing = Packings+AliasP;
    String Creditn = Credites+AliasC;
    String[] Docs = new String[]{Invoice,Packing,Creditn};

    TCreate_Input Invoice_in = new TCreate_Input(AliasI, Order, ClassI, false, null);
    TCreate_Input Packing_in = new TCreate_Input(AliasP, Order, ClassP, false, null);
    TCreate_Input Creditn_in = new TCreate_Input(AliasC, Order, ClassC, false, null);
    TCreate_Input[] Docs_in = new TCreate_Input[]{Invoice_in, Packing_in, Creditn_in};

    TUpdate_Input Creditn_up = new TUpdate_Input(
            Creditn,"CreditNote",
            true, //set Issued flag
            null, null, null,
            null );

    TUpdate_Input Creditn_up2 = new TUpdate_Input(
            Creditn,"CreditNote",
            false, //reset Issued flag
            null, null, null,
            null );

    String[] OrderAttributes = new String[]{"Comment"};
    String[] AddressAttributes = new String[]{"JobTitle" /*,"Salutation" */ };
    String[] LineAttributes = new String[]{"Alias"};

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        log.info("OrderDocument3TestCase: setUp");

        OrderDocumentService serviceLocator = new OrderDocumentServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_OrderDocumentAddress() );
        log.info("using web service Url: " + WEBSERVICE_URL);

        orderDocService = new Bind_OrderDocument_SOAPStub(WEBSERVICE_URL, serviceLocator);

        // setting user-path and password of the shop
        orderDocService.setUsername(WEBSERVICE_LOGIN);
        orderDocService.setPassword(WEBSERVICE_PASSWORD);

        // delete the test order documents if it exists
        try {
            TExists_Return[] Doc_exists_out = orderDocService.exists(Docs);
            for (TExists_Return exist : Doc_exists_out) {
                if( exist.getExists() ) {
                    TDelete_Return[] Doc_delete_out = orderDocService.delete(new String[]{exist.getPath()});
                    assertEquals("delete result set", 1, Doc_delete_out.length);
                    log.info("OrderDocument3TestCase: setUp deleted "+Doc_delete_out[0].getPath());
                }
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create Order Documents and check if the creation was successful
     */
    public void testCreate() throws RemoteException {
        log.info("OrderDocument3TestCase: testCreate");
        try {
            TCreate_Return[] Doc_create_out = orderDocService.create(Docs_in);
            assertEquals("create result set", 3, Doc_create_out.length);
            for (TCreate_Return create : Doc_create_out) {
                assertEquals("created?", new Boolean(true), create.getCreated());
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete Order Documents and check if the deletion was successful
     */
    public void testDelete() throws RemoteException {
        log.info("OrderDocument3TestCase: testDelete");
        try {
            TDelete_Return[] Doc_delete_out = orderDocService.delete(Docs);
            assertEquals("delete result set", 3, Doc_delete_out.length);
            for (TDelete_Return del : Doc_delete_out) {
                assertEquals("created?", new Boolean(true), del.getDeleted());
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieve information about an OrderDocument. Check if the returned data are equal to
     * the data of create call
     */
    public void testGetInfo() throws RemoteException {
        log.info("OrderDocument3TestCase: testGetInfo");
        try {
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
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieve all invoices for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetInvoices() throws RemoteException {
        log.info("OrderDocument3TestCase: testGetInvoices");
        try {
            TGetInvoices_Return[] Invoice_out = orderDocService.getInvoices(new String[]{Order});
            assertEquals("get invoices result set", 1, Invoice_out.length);
            for (TGetInvoices_Return order : Invoice_out) {
                assertEquals("order path", Order, order.getOrder() );
                assertEquals("invoices result set", 1, order.getInvoices().length);
                assertEquals("invoice path", Invoice, order.getInvoices()[0]);
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieve all PackingSlips for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetPackingSlips() throws RemoteException {
        log.info("OrderDocument3TestCase: testGetPackingSlips");
        try {
            TGetPackingSlips_Return[] Packing_out = orderDocService.getPackingSlips(new String[]{Order});
            assertEquals("get packing slips result set", 1, Packing_out.length);
            for (TGetPackingSlips_Return order : Packing_out) {
                assertEquals("order path", Order, order.getOrder() );
                assertEquals("packing slips result set", 1, order.getPackingSlips().length);
                assertEquals("packing slip path", Packing, order.getPackingSlips()[0]);
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }


    /**
     * Retrieve all CreditNotes for an Order. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetCreditNotes() throws RemoteException {
        log.info("OrderDocument3TestCase: testGetCreditNotes");
        try {
            TGetCreditNotes_Return[] Credits_out = orderDocService.getCreditNotes(new String[]{Order});
            assertEquals("get packing slips result set", 1, Credits_out.length);
            for (TGetCreditNotes_Return order : Credits_out) {
                assertEquals("order path", Order, order.getOrder() );
                assertEquals("packing slips result set", 1, order.getCreditNotes().length);
                assertEquals("packing slip path", Creditn, order.getCreditNotes()[0]);
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
    * test exists method
    * @param expected  if false, test is successful if the Order Document does NOT exists
    */
    public void testExists(boolean expected) throws RemoteException {
        log.info("Order3TestCase: testExists");
        try {
            TExists_Return[] Doc_exists_out = orderDocService.exists(Docs);
            for (TExists_Return exist : Doc_exists_out) {
                assertEquals("exists?", new Boolean(expected), exist.getExists());
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
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
