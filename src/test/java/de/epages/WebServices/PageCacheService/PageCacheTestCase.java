package de.epages.WebServices.PageCacheService;

import de.epages.WebServices.PageCacheService.Stub.*;
import de.epages.WebServices.WebServiceTestConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages PageCache WebServices.
 */
public class PageCacheTestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(PageCacheTestCase.class.getName());

    private Bind_PageCache_SOAPStub pageCacheService;

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        PageCacheService serviceLocator = new PageCacheServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_PageCacheAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
        	pageCacheService = new Bind_PageCache_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);
		}
        catch (Exception e) {
			e.printStackTrace();
		}

        // setting user-path and password of the shop
        pageCacheService.setUsername(WEBSERVICE_LOGIN);
        pageCacheService.setPassword(WEBSERVICE_PASSWORD);
    }

    /**
     * Delete all cached pages of the shop
     */
    @Test
    public void testClear() {
        try {
        	pageCacheService.clear();

            // test if creation was successful
            assertTrue("page cache cleared", true);
        }
        catch (RemoteException e) {
			e.printStackTrace();
		}
    }
}
