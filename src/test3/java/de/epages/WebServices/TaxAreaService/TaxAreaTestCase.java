package de.epages.WebServices.TaxAreaService;

import de.epages.WebServices.TaxAreaService.Stub.*;
import de.epages.WebServices.WebServiceTestConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.*;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages TaxArea WebServices.
 */
public class TaxAreaTestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(TaxAreaTestCase.class.getName());

    private Bind_TaxArea_SOAPStub taxAreaService;

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        TaxAreaService serviceLocator = new TaxAreaServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_TaxAreaAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
        	taxAreaService = new Bind_TaxArea_SOAPStub(WEBSERVICE_URL, serviceLocator);
		}
        catch (Exception e) {
			e.printStackTrace();
		}

        // setting user-path and password of the shop
        taxAreaService.setUsername(WEBSERVICE_LOGIN);
        taxAreaService.setPassword(WEBSERVICE_PASSWORD);
    }

    /**
     * Get a list of all tax areas
     */
    @Test
    public void testGetList() {
        try {
        	TGetList_Return[] TaxAreas = taxAreaService.getList();

            int count = TaxAreas.length; 
            log.info("Total tax areas: " + count);
            assertEquals( "number of tax areas", 2, count );

            HashMap<String, TGetList_Return> results = new HashMap<String, TGetList_Return>();
            for ( TGetList_Return result:  TaxAreas ) results.put(result.getPath(),result);
            assertTrue("first tax area", results.containsKey("/TaxMatrixGermany/EU") );
            assertTrue("second tax area", results.containsKey("/TaxMatrixGermany/\"non EU\"") );

        }
        catch (RemoteException e) {
			e.printStackTrace();
		}
    }
}
