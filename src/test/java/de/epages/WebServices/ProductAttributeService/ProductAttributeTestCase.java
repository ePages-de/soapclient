package de.epages.WebServices.ProductAttributeService;

import de.epages.WebServices.ProductAttributeService.Stub.*;
import de.epages.WebServices.WebServiceTestConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages ProductAttribute WebServices.
 */
public class ProductAttributeTestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(ProductAttributeTestCase.class.getName());

    private Bind_ProductAttribute_SOAPStub productAttributeService;

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        ProductAttributeService serviceLocator = new ProductAttributeServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_ProductAttributeAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        productAttributeService = new Bind_ProductAttribute_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);
        productAttributeService.setUsername(WEBSERVICE_LOGIN);
        productAttributeService.setPassword(WEBSERVICE_PASSWORD);
    }

    /**
     * Get a list of all product attributes
     */
    @Test
    public void testGetList() throws RemoteException {
        log.info("ProductAttributeTestCase: testGetList");

        TGetInfoList_Return[] allAttributes = productAttributeService.getInfoList();

        // test if transfer was successful
        assertTrue("number of attributes > 10", allAttributes.length > 10);

        // test if the attribute "Color" exists in product type "Jacket"
        boolean existsAttribute = false;
        for( TGetInfoList_Return attributeInfo : allAttributes )
        {
            if( attributeInfo.getAlias().equals("Color") && 
            	attributeInfo.getProductType().equals("Jacket") )
            {
                existsAttribute = true;
                assertTrue("attribute 'Color' is a variation attribute", attributeInfo.getIsVariationAttribute());
            }
        }

        assertTrue("attribute 'Color' exists in class 'Jacket'", existsAttribute);
    }
}
