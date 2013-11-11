package de.epages.WebServices.OrderService;

import de.epages.WebServices.OrderService.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.*;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages Order WebServices.
 *
 * User: tmangner
 * Date: 08.12.2005
 * Time: 14:19:18
 */
public class OrderTestCase {
    private static Logger log = Logger.getLogger(OrderTestCase.class.getName());
    OrderServiceClient serviceClient;
    TCreate_Input Order_in = new TCreate_Input();
    TUpdate_Input Order_update = new TUpdate_Input();

    String path = "/Shops/DemoShop/Customers/1001/Orders/";
    String alias = "java_test-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new OrderServiceClient();

        // create test Orders that can be used with the create and update methods
        Order_in.setAlias(alias);
        Order_in.setCreationDate(new GregorianCalendar(2006,0,1,11,11));
        Order_in.setCustomer("/Shops/DemoShop/Customers/1001");

        TProductLineItemIn productLineItem = new TProductLineItemIn("/Shops/DemoShop/Products/ho_1112105010", (float)10);
        TLineItemContainerIn lineItemContainer = new TLineItemContainerIn();
        lineItemContainer.setCurrencyID("EUR");
        lineItemContainer.setPaymentMethod("/Shops/DemoShop/PaymentMethods/Invoice");
        lineItemContainer.setShippingMethod("/Shops/DemoShop/ShippingMethods/Express");
        lineItemContainer.setTaxArea("/TaxMatrixGermany/EU");
        lineItemContainer.setTaxModel("gross");
        lineItemContainer.setProductLineItems(new TProductLineItemIn[]{productLineItem});

        Order_in.setLineItemContainer(lineItemContainer);
        Order_in.setViewedOn(new GregorianCalendar(2006,0,2,12,00));

        TAddress bill = new TAddress();
        bill.setFirstName("Klaus");
        bill.setLastName("Klaussen");
        bill.setStreet("Musterstraße 2");
        bill.setEMail("java_test-1@epages.de");
        bill.setBirthday(new GregorianCalendar(1976,9,25,11,33));
        Order_in.setBillingAddress(bill);

        TAttribute attr1 = new TAttribute();
        attr1.setName("Comment");
        attr1.setValue("my Order comment");
        Order_in.setAttributes(new TAttribute[]{ attr1 });

        Order_update.setPath(path + alias);
        Order_update.setCreationDate(new GregorianCalendar(2006,0,1,11,33));
        Order_update.setViewedOn(new GregorianCalendar(2006,0,2,12,30));

        TAddress bill_update = new TAddress();
        bill_update.setFirstName("Hans");
        bill_update.setLastName("Hanssen");
        bill_update.setStreet("Musterstraße 2b");
        Order_update.setBillingAddress(bill_update);

        TAttribute attr_update = new TAttribute();
        attr_update.setName("Comment");
        attr_update.setValue("my updated Order comment");
        Order_update.setAttributes(new TAttribute[]{ attr_update });

        // delete the test order if it exists
        try {
        	List<TExists_Return> Orders_exists_out = serviceClient.existsOrder(new String[]{path + alias});
        	if( Orders_exists_out.get(0).getExists() ) {
        		serviceClient.deleteOrder(new String[]{path + alias});
        	}
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a Order and check if the creation was successful
     */
    public void testCreate() {
        List<TCreate_Input> Orders_create_in = new ArrayList();
        Orders_create_in.add(Order_in);

        List<TCreate_Return> Orders_create_out = new ArrayList();

        try {
            Orders_create_out = serviceClient.createOrder(Orders_create_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        assertEquals("create result set", 1, Orders_create_out.size());
        assertEquals("created?", new Boolean(true), Orders_create_out.get(0).getCreated());
    }

    /**
     * Update a Order and check if the update was successful
     */
    public void testUpdate() {
        List<TUpdate_Input> Orders_update_in = new ArrayList();
        Orders_update_in.add(Order_update);

        List<TUpdate_Return> Orders_update_out = new ArrayList();

        try {
            Orders_update_out = serviceClient.updateOrder(Orders_update_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if update was successful
        assertEquals("update result set", 1, Orders_update_out.size());
        assertEquals("updated?", new Boolean(true), Orders_update_out.get(0).getUpdated());
    }

    /**
     * Retrieve information about an Order. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        List<TGetInfo_Return> Orders_info_out = new ArrayList();
        try {
            Orders_info_out = serviceClient.getOrderInfo(
                new String[]{path + alias},
                new String[]{"Comment"}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Orders_info_out.size());

        TGetInfo_Return Order_info_out = Orders_info_out.get(0);

        assertEquals("alias", alias, Order_info_out.getAlias());

        if (isAlreadyUpdated) {
            assertEquals("FirstName", Order_update.getBillingAddress().getFirstName(), Order_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", Order_update.getBillingAddress().getLastName() , Order_info_out.getBillingAddress().getLastName() );
            assertEquals("Street", Order_update.getBillingAddress().getStreet()   , Order_info_out.getBillingAddress().getStreet()   );
            assertEquals("Comment", Order_update.getAttributes()[0].getValue()     , Order_info_out.getAttributes()[0].getValue()     );

            assertEquals("ViewedOn", Order_update.getViewedOn().getTime(), Order_info_out.getViewedOn().getTime());
            assertEquals("CreationDate", Order_update.getCreationDate().getTime(), Order_info_out.getCreationDate().getTime());
        } else {
            assertEquals("FirstName", Order_in.getBillingAddress().getFirstName(), Order_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", Order_in.getBillingAddress().getLastName() , Order_info_out.getBillingAddress().getLastName() );
            assertEquals("Street", Order_in.getBillingAddress().getStreet()   , Order_info_out.getBillingAddress().getStreet()   );
            assertEquals("Comment", Order_in.getAttributes()[0].getValue()     , Order_info_out.getAttributes()[0].getValue()     );

            assertEquals("ViewedOn", Order_in.getViewedOn().getTime(), Order_info_out.getViewedOn().getTime());
            assertEquals("CreationDate", Order_in.getCreationDate().getTime(), Order_info_out.getCreationDate().getTime());
        }

        assertEquals("Customer", Order_in.getCustomer(), Order_info_out.getCustomer());

        assertEquals("TaxArea", Order_in.getLineItemContainer().getTaxArea()      , Order_info_out.getLineItemContainer().getTaxArea()      );
        assertEquals("TaxModel", Order_in.getLineItemContainer().getTaxModel()     , Order_info_out.getLineItemContainer().getTaxModel()     );
        assertEquals("CurrencyID", Order_in.getLineItemContainer().getCurrencyID()   , Order_info_out.getLineItemContainer().getCurrencyID()   );
    }

    /**
     * Delete a Order and check if no error occured.
     */
    public void testDelete() {
        List<TDelete_Return> Orders_delete_out = new ArrayList();
        try {
            Orders_delete_out = serviceClient.deleteOrder(new String[]{path + alias});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if deletion was successful
        assertEquals("delete result set", 1, Orders_delete_out.size());
        assertEquals("deleted?", new Boolean(true), Orders_delete_out.get(0).getDeleted());
    }

    /**
     * Test if a Order exists or not
     * @param expected if false the Test will be successful if the Order does NOT exist
     */
    public void testExists(boolean expected) {
        List<TExists_Return> Orders_exists_out = new ArrayList();
        try {
            Orders_exists_out = serviceClient.existsOrder(new String[]{path + alias});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if exists check was successful
        assertEquals("exists result set", 1, Orders_exists_out.size());
        assertEquals("exists?", new Boolean(expected), Orders_exists_out.get(0).getExists());
    }

    /**
     * Test if a Order is found by EMail
     */
    public void testFind() {
        TFind_Input parameters = new TFind_Input();
        parameters.setAlias(alias);
        parameters.setIsViewed(true);

        String[] Orders_find_out = new String[]{};
        try {
            Orders_find_out = serviceClient.findOrders(parameters);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if find was successful
        assertEquals("find result set", 1, Orders_find_out.length);
        assertEquals("found path", path + alias, Orders_find_out[0]);
    }

    /**
     * Runs all tests:
     * <ol>
     *   <li>create a Order</li>
     *   <li>test if this Order exists afterwards</li>
     *   <li>test if Order is found by search</li>
     *   <li>retrieve info about this Order, and check if the data equals to the input data of create</li>
     *   <li>updates the Order</li>
     *   <li>again retrieve data, and check if the data are equal to the update input data</li>
     *   <li>delete the Order</li>
     *   <li>check if the Order still exists</li>
     * </ol>
     */
    @Test
    public void testAll() {
    	testCreate();
        testExists(true);
        testFind();
        testGetInfo(false);
        testUpdate();
        testGetInfo(true);
        testDelete();
        testExists(false);
    }
}
