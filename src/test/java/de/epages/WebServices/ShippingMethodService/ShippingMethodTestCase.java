package de.epages.WebServices.ShippingMethodService;

import de.epages.WebServices.ShippingMethodService.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages ShippingMethod WebServices.
 */
public class ShippingMethodTestCase extends WebServiceConfiguration {
    private static Logger log = Logger.getLogger(ShippingMethodTestCase.class.getName());

    private Bind_ShippingMethod_SOAPStub shippingMethodService;

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        ShippingMethodService serviceLocator = new ShippingMethodServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_ShippingMethodAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
        	shippingMethodService = new Bind_ShippingMethod_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);
		}
        catch (Exception e) {
			e.printStackTrace();
		}

        // setting user-path and password of the shop
        shippingMethodService.setUsername(WEBSERVICE_LOGIN);
        shippingMethodService.setPassword(WEBSERVICE_PASSWORD);
    }

    /**
     * Get a list of all shipping methods
     */
    @Test
    public void testGetList() {
        try {
        	TGetList_Return[] ShippingMethods = shippingMethodService.getList();

            int count = ShippingMethods.length; 
            log.info("Total shipping methods: " + count);

            assertEquals( "number of shipping methods", 3, count );
            assertEquals( "first shipping method", "/Shops/DemoShop/ShippingMethods/Post", ShippingMethods[0].getPath() );
            assertEquals( "second shipping method", "/Shops/DemoShop/ShippingMethods/Express", ShippingMethods[1].getPath() );
			assertEquals( "third shipping method", "/Shops/DemoShop/ShippingMethods/PickupByCustomer", ShippingMethods[2].getPath() );
        }
        catch (RemoteException e) {
			e.printStackTrace();
		}
    }
}

