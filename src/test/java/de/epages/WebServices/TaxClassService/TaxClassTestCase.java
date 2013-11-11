package de.epages.WebServices.TaxClassService;

import de.epages.WebServices.TaxClassService.Stub.*;
import de.epages.WebServices.WebServiceTestConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.*;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages TaxClass WebServices.
 */
public class TaxClassTestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(TaxClassTestCase.class.getName());

    private Bind_TaxClass_SOAPStub taxClassService;

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        TaxClassService serviceLocator = new TaxClassServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_TaxClassAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
        	taxClassService = new Bind_TaxClass_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);
		}
        catch (Exception e) {
			e.printStackTrace();
		}

        // setting user-path and password of the shop
        taxClassService.setUsername(WEBSERVICE_LOGIN);
        taxClassService.setPassword(WEBSERVICE_PASSWORD);
    }

    /**
     * Get a list of all tax classes
     */
    @Test
    public void testGetList() {
        try {
        	TGetList_Return[] TaxClasses = taxClassService.getList();

            int count = TaxClasses.length; 
            log.info("Total tax classes: " + count);
            assertEquals( "number of tax classes", 3, count );
            
            HashMap<String, TGetList_Return> results = new HashMap<String, TGetList_Return>();
            for ( TGetList_Return result:  TaxClasses ) results.put(result.getPath(),result);
            assertTrue("first tax class", results.containsKey("/TaxMatrixGermany/normal") );
            assertTrue("second tax class", results.containsKey("/TaxMatrixGermany/reduced") );
            assertTrue("third tax class", results.containsKey("/TaxMatrixGermany/none") );

        }
        catch (RemoteException e) {
			e.printStackTrace();
		}
    }
}
