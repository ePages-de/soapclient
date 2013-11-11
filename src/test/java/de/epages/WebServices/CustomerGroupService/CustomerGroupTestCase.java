package de.epages.WebServices.CustomerGroupService;

import de.epages.WebServices.CustomerGroupService.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages CustomerGroup WebServices.
 */
public class CustomerGroupTestCase extends WebServiceConfiguration {
    private static Logger log = Logger.getLogger(CustomerGroupTestCase.class.getName());

    private Bind_CustomerGroup_SOAPStub customerGroupService;

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
    }

    /**
     * Get a list of all customer groups
     */
    @Test
    public void testGetList() throws RemoteException {
    	TGetList_Return[] customerGroups = customerGroupService.getList();

        int count = customerGroups.length; 
        log.info("Total customer groups: " + count);

        assertEquals( "number of customer groups", 2, count );
        assertTrue( "first customer group", customerGroups[0].getAlias().equals("NewCustomer") );
        assertTrue( "second customer group", customerGroups[1].getAlias().equals("RegularCustomer") );
    }
}
