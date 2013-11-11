package de.epages.WebServices.CustomerService;

import de.epages.WebServices.WebServiceTestConfiguration;
import de.epages.WebServices.CustomerGroupService.Stub.*;
import de.epages.WebServices.CustomerService.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;
import java.util.logging.Logger;
import java.rmi.RemoteException;

/**
 * A JUnit TestSuite to test epages Customer WebServices.
 *
 * User: tmangner
 * Date: 08.12.2005
 * Time: 14:19:18
 */
public class CustomerTestCase {
    private static Logger log = Logger.getLogger(CustomerTestCase.class.getName());
    CustomerServiceClient serviceClient;
    TCreate_Input customer_in = new TCreate_Input();
    TUpdate_Input customer_update = new TUpdate_Input();

    String path = "/Shops/DemoShop/Customers/";
    String alias = "java_test-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {

    	/* try to get customer groups at first, because they are different since patch 7
    	 */
    	String customerGroupsPath = "/Shops/DemoShop/Groups/";
    	String[] customerGroups = new String[]{
    		customerGroupsPath+"Neukunde",
    		customerGroupsPath+"Stammkunde"
    	};
    	
        try {
            CustomerGroupService serviceLocator = new CustomerGroupServiceLocator();
            
            java.net.URL webServiceURL = new java.net.URL(new de.epages.WebServices.WebServiceTestConfiguration().WEBSERVICE_URL);
            
            Bind_CustomerGroup_SOAPStub customerGroupService = new Bind_CustomerGroup_SOAPStub(webServiceURL, serviceLocator);
            customerGroupService.setUsername(de.epages.WebServices.WebServiceTestConfiguration.WEBSERVICE_LOGIN);
            customerGroupService.setPassword(de.epages.WebServices.WebServiceTestConfiguration.WEBSERVICE_PASSWORD);
            
        	TGetList_Return[] retGroups = customerGroupService.getList();
        	customerGroups[0] = customerGroupsPath+retGroups[0].getAlias();
        	customerGroups[1] = customerGroupsPath+retGroups[1].getAlias();
        } catch (Exception e) {
			e.printStackTrace();
		}

    	serviceClient = new CustomerServiceClient(new WebServiceTestConfiguration());

        // create test customers that can be used with the create and update methods
        customer_in.setAlias(alias);
        customer_in.setCustomerGroup(customerGroups[0]);
        customer_in.setTaxArea("/TaxMatrixGermany/EU");
        customer_in.setTaxModel("gross");
        customer_in.setCurrencyID("EUR");

        TAddress bill = new TAddress();
        bill.setFirstName("Klaus");
        bill.setLastName("Klaussen");
        bill.setStreet("Musterstraße 2");
        bill.setEMail("java_test-1@epages.de");
        bill.setBirthday(new GregorianCalendar(1976,9,25,11,33));
        customer_in.setBillingAddress(bill);

        TAttribute attr1 = new TAttribute();
        attr1.setName("Comment");
        attr1.setValue("my customer comment");
        customer_in.setAttributes(new TAttribute[]{ attr1 });

        customer_update.setPath(path + alias);

        TAddress bill_update = new TAddress();
        bill_update.setFirstName("Hans");
        bill_update.setLastName("Hanssen");
        bill_update.setStreet("Musterstraße 2b");
        bill_update.setBirthday(new GregorianCalendar(1976,9,25,12,00));
        customer_update.setBillingAddress(bill_update);

        TAttribute attr_update = new TAttribute();
        attr_update.setName("Comment");
        attr_update.setValue("my updated customer comment");
        customer_update.setAttributes(new TAttribute[]{ attr_update });

        // delete the test customer if it exists
        try {
            List<TExists_Return> Customers_exists_out = serviceClient.existsCustomer(new String[]{path + alias});
            if( Customers_exists_out.get(0).getExists() ) {
                serviceClient.deleteCustomer(new String[]{path + alias});
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a customer and check if the creation was successful
     */
    public void testCreate() {
        List<TCreate_Input> customers_create_in = new ArrayList();
        customers_create_in.add(customer_in);

        List<TCreate_Return> customers_create_out = new ArrayList();

        try {
            customers_create_out = serviceClient.createCustomer(customers_create_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        Assert.assertEquals("create result set", 1, customers_create_out.size());
        Assert.assertEquals("created?", new Boolean(true), customers_create_out.get(0).getCreated());
    }

    /**
     * Update a customer and check if the update was successful
     */
    public void testUpdate() {
        List<TUpdate_Input> customers_update_in = new ArrayList();
        customers_update_in.add(customer_update);

        List<TUpdate_Return> customers_update_out = new ArrayList();

        try {
            customers_update_out = serviceClient.updateCustomer(customers_update_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if update was successful
        Assert.assertEquals("update result set", 1, customers_update_out.size());
        Assert.assertEquals("updated?", new Boolean(true), customers_update_out.get(0).getUpdated());
    }

    /**
     * Retrieve information about an customer. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        List<TGetInfo_Return> customers_info_out = new ArrayList();
        try {
            customers_info_out = serviceClient.getCustomerInfo(
                new String[]{path + alias},
                new String[]{"Comment"}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, customers_info_out.size());

        TGetInfo_Return customer_info_out = customers_info_out.get(0);

        assertEquals("alias", alias, customer_info_out.getAlias());

        if (isAlreadyUpdated) {
            assertEquals("FirstName", customer_update.getBillingAddress().getFirstName(), customer_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", customer_update.getBillingAddress().getLastName() , customer_info_out.getBillingAddress().getLastName() );
            assertEquals("Street", customer_update.getBillingAddress().getStreet()   , customer_info_out.getBillingAddress().getStreet()   );
            assertEquals("Birthday", customer_update.getBillingAddress().getBirthday().getTime(), customer_info_out.getBillingAddress().getBirthday().getTime()   );

            assertEquals("Comment", customer_update.getAttributes()[0].getValue()     , customer_info_out.getAttributes()[0].getValue()     );
        } else {
            assertEquals("FirstName", customer_in.getBillingAddress().getFirstName(), customer_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", customer_in.getBillingAddress().getLastName() , customer_info_out.getBillingAddress().getLastName() );
            assertEquals("Street", customer_in.getBillingAddress().getStreet()   , customer_info_out.getBillingAddress().getStreet()   );
            assertEquals("Birthday", customer_in.getBillingAddress().getBirthday().getTime()   , customer_info_out.getBillingAddress().getBirthday().getTime()   );

            assertEquals("Comment", customer_in.getAttributes()[0].getValue(), customer_info_out.getAttributes()[0].getValue()     );
        }

        assertEquals("CustomerGroup", customer_in.getCustomerGroup(), customer_info_out.getCustomerGroup());
        assertEquals("TaxArea", customer_in.getTaxArea()      , customer_info_out.getTaxArea()      );
        assertEquals("TaxModel", customer_in.getTaxModel()     , customer_info_out.getTaxModel()     );
        
        // attribute CurrencyID is obsolete
        //assertEquals("CurrencyID", customer_in.getCurrencyID()   , customer_info_out.getCurrencyID()   );
    }

    /**
     * Delete a customer and check if no error occured.
     */
    public void testDelete() {
        List<TDelete_Return> customers_delete_out = new ArrayList();
        try {
            customers_delete_out = serviceClient.deleteCustomer(new String[]{path + alias});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if deletion was successful
        assertEquals("delete result set", 1, customers_delete_out.size());
        assertEquals("deleted?", new Boolean(true), customers_delete_out.get(0).getDeleted());
    }

    /**
     * Test if a customer exists or not
     * @param expected if false the Test will be successful if the customer does NOT exist
     */
    public void testExists(boolean expected) {
        List<TExists_Return> customers_exists_out = new ArrayList();
        try {
            customers_exists_out = serviceClient.existsCustomer(new String[]{path + alias});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if exists check was successful
        assertEquals("exists result set", 1, customers_exists_out.size());
        assertEquals("exists?", new Boolean(expected), customers_exists_out.get(0).getExists());
    }

    /**
     * Test if a customer is found by EMail
     */
    public void testFind() {
        TFind_Input parameters = new TFind_Input();
        parameters.setEMail(customer_in.getBillingAddress().getEMail());

        String[] customers_find_out = new String[]{};
        try {
            customers_find_out = serviceClient.findCustomers(parameters);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if find was successful
        assertEquals("find result set", 1, customers_find_out.length);
        assertEquals("found path", path + alias, customers_find_out[0]);
    }

    /**
     * Creates a TestSuite that will do:
     * <ol>
     *   <li>create a customer</li>
     *   <li>test if this customer exists afterwards</li>
     *   <li>test if customer is found by search</li>
     *   <li>retrieve info about this customer, and check if the data equals to the input data of create</li>
     *   <li>updates the customer</li>
     *   <li>again retrieve data, and check if the data are equal to the update input data</li>
     *   <li>delete the customer</li>
     *   <li>check if the customer still exists</li>
     * </ol>
     *
     * @return  a suite that can be run
     * @see     TestSuite
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
