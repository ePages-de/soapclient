package de.epages.WebServices.CustomerGroupService2;

import de.epages.WebServices.CustomerGroupService2.Stub.*;
import de.epages.WebServices.WebServiceTestConfiguration;
import org.junit.*;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages CustomerGroup WebServices.
 */
public class CustomerGroup2TestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(CustomerGroup2TestCase.class.getName());
    private Bind_CustomerGroup_SOAPStub customerGroupService;

    private TCreate_Input group_in = new TCreate_Input();
    private TUpdate_Input group_up = new TUpdate_Input();
    
    private String alias = "java_TestGroup-1";
    private String groupPath = "Groups/";
    private String path = groupPath + alias;
    
    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        CustomerGroupService serviceLocator = new CustomerGroupServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_CustomerGroupAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
        	customerGroupService = new Bind_CustomerGroup_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);
		}
        catch (Exception e) {
			e.printStackTrace();
		}

        // setting user-path and password of the shop
        customerGroupService.setUsername(WEBSERVICE_LOGIN);
        customerGroupService.setPassword(WEBSERVICE_PASSWORD);
        
        group_in.setAlias(alias);
        group_in.setName(new TLocalizedValue[]{
                new TLocalizedValue("de", "TestGruppe"),
                new TLocalizedValue("en", "test group"),
            });
        
        group_up.setAlias(alias);
        group_up.setName(new TLocalizedValue[]{
                new TLocalizedValue("de", "TestGruppe modifiziert"),
                new TLocalizedValue("en", "test group changed"),
            });
        
    }

    /**
     * Create a customer group and check if the creation was successful
     */
    public void testCreate() {
        log.info("CustomerGroup2TestCase: testCreate");
        try {
    		TCreate_Return[] customers_out = customerGroupService.create(new TCreate_Input[]{group_in});

    		// test if creation was successful
            assertEquals("create result set", 1, customers_out.length );
            assertTrue("created?", customers_out[0].getCreated() );
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get a list of all customer groups
     */
    public void testGetList() throws RemoteException {
    	TGetList_Return[] customerGroups = customerGroupService.getList();

        int count = customerGroups.length;
        log.info("Total customer groups: " + count);

        assertEquals( "number of customer groups", 2, count );
        assertTrue( "first customer group", customerGroups[0].getAlias().equals("NewCustomer") );
        assertTrue( "second customer group", customerGroups[1].getAlias().equals("RegularCustomer") );
    }

    /**
     * Update a customer group and check if the update was successful
     */
   public void testUpdate() {
        log.info("CustomerGroup2TestCase: testUpdate");
        try {
    		TUpdate_Return[] customers_out = customerGroupService.update(new TUpdate_Input[]{group_up});

    		// test if update was successful
            assertEquals("create result set", 1, customers_out.length );
            assertTrue("updated?", customers_out[0].getUpdated() );
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

   /**
    * Delete a customer group and check if no error occured.
    */
   public void testDelete() {
       log.info("CustomerGroup2TestCase: testDelete");
       try {
    	   TDelete_Return[] customers_out = customerGroupService.delete(new String[]{alias});

    	   // test if update was successful
           assertEquals("create result set", 1, customers_out.length );
           assertTrue("deleted?", customers_out[0].getDeleted() );
       } catch (RemoteException e) {
           e.printStackTrace();
       }
   }

   /**
    * Test if a customer group exists or not
    * @param expected if false the Test will be successful if the customer does NOT exist
    */
   public void testExists() { testExists(true); }
   public void testExists(boolean expected) {
       log.info("CustomerGroup2TestCase: testExists("+(expected?"true":"false")+")");
       try {
       	TExists_Return[] customers_out = customerGroupService.exists(new String[]{alias});

       	// test if exists check was successful
           assertEquals("exists result set", 1, customers_out.length );
           assertEquals("exists?", new Boolean(expected), customers_out[0].getExists() );
       } catch (RemoteException e) {
           e.printStackTrace();
       }

   }

    /**
     * runs all tests
     */
    @Test
    public void testAll() throws RemoteException
    {
    	testGetList();
    	testCreate();
    	testExists();
    	testUpdate();
    	testDelete();
    	testExists(false);
    }
}
