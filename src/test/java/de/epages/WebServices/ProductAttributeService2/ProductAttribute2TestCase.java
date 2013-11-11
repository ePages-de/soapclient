package de.epages.WebServices.ProductAttributeService2;

import de.epages.WebServices.ProductAttributeService2.Stub.*;
import de.epages.WebServices.WebServiceTestConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages ProductAttribute WebServices.
 */
public class ProductAttribute2TestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(ProductAttribute2TestCase.class.getName());

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
        log.info("ProductAttribute2TestCase: testGetList");
        TGetInfoList_Return[] allAttributes = productAttributeService.getInfoList();

        // test if transfer was successful
        assertTrue("number of attributes > 10", allAttributes.length > 10);

        // test attributes "Size" and Color in product type "Jacket"
        for ( TGetInfoList_Return attributeInfo : allAttributes ) {
            // check product type Jacket
        	if ( attributeInfo.getProductTypeAlias().equals("Jacket") ) {
                // check attribute Size
            	if ( attributeInfo.getAlias().equals("Size") ) {
                    log.info("ProductAttribute2TestCase: testGetList check attribute Size");
                    assertTrue("attribute 'Size' of Type 'Jacket' exists", true );
                    TPreDefAttribute[] preDefAttributes = attributeInfo.getPreDefAttributes();
                    assertTrue("attribute 'Size' of Type 'Jacket' has predefined attributes", preDefAttributes.length > 0 );
                    for ( int i=0; i<preDefAttributes.length; i++ ) {
                    	if ( preDefAttributes[i].getAlias().equals("S") ) {
                            log.info("ProductAttribute2TestCase: testGetList check pre defined attribute Size/S");
                            assertTrue("attribute 'Size' has predefined attribute 'S'", true );
                            assertEquals("attribute 'Size' has right predefined value 'S'", "S", preDefAttributes[i].getValue());
                    	}
                    	if ( preDefAttributes[i].getAlias().equals("XXL") ) {
                            log.info("ProductAttribute2TestCase: testGetList check pre defined attribute Size/XXL");
                            assertTrue("attribute 'Size' has predefined attribute 'XXL'", true );
                            assertEquals("attribute 'Size' has right predefined value 'XXL'", "XXL", preDefAttributes[i].getValue());
                    	}
                    }
            	}
                // check attribute Color
            	if ( attributeInfo.getAlias().equals("Color") ){
                    log.info("ProductAttribute2TestCase: testGetList check attribute Color");
                    assertTrue("attribute 'Color' of Type 'Jacket' exists", true );
                    TPreDefAttribute[] preDefAttributes = attributeInfo.getPreDefAttributes();
                    assertTrue("attribute 'Color' of Type 'Jacket' has predefined attributes", preDefAttributes.length > 0 );
                    for ( int i=0; i<preDefAttributes.length; i++ ) {
                    	if ( preDefAttributes[i].getAlias().equals("Black") ) {
                            log.info("ProductAttribute2TestCase: testGetList check pre defined attribute Color/Black");
                            assertTrue("attribute 'Color' has predefined attribute 'Black'", true );
                            TLocalizedValue[] locValue = preDefAttributes[i].getLocalizedValues();
                            assertTrue("predefined attribute 'Black' has localized values", locValue.length>= 2);
                            for ( int j=0; j<locValue.length; j++ ) {
                            	if ( locValue[j].getLanguageCode().equals("en") ) {
                            		assertEquals("attribute 'Color' has right predefined value 'Black'", "Black", locValue[j].getValue());
                            	}
                            	if ( locValue[j].getLanguageCode().equals("de") ) {
                            		assertEquals("attribute 'Color' has right predefined value 'Schwarz'", "Schwarz", locValue[j].getValue());
                            	}
                            }
                    	}
                    	if ( preDefAttributes[i].getAlias().equals("ExtremeRed") ) {
                            log.info("ProductAttribute2TestCase: testGetList check pre defined attribute Color/ExtremeRed");
                            assertTrue("attribute 'Color' has predefined attribute 'ExtremeRed'", true );
                            TLocalizedValue[] locValue = preDefAttributes[i].getLocalizedValues();
                            assertTrue("predefined attribute 'ExtremeRed' has localized values", locValue.length>= 2);
                            for ( int j=0; j<locValue.length; j++ ) {
                            	if ( locValue[j].getLanguageCode().equals("en") ) {
                            		assertEquals("attribute 'Color' has right predefined value 'Extreme red'", "Extreme red", locValue[j].getValue());
                            	}
                            	if ( locValue[j].getLanguageCode().equals("de") ) {
                            		assertEquals("attribute 'Color' has right predefined value 'Extrem Rot'", "Extrem Rot", locValue[j].getValue());
                            	}
                            }
                    	}
                    }
            	}
            }
        }
    }
}
