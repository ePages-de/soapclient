package de.epages.WebServices.CrossSellingService;

import de.epages.WebServices.CrossSellingService.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;
import java.math.BigInteger;
import java.net.MalformedURLException;

/**
 * A JUnit TestSuite to test epages CrossSelling WebServices.
 */
public class CrossSellingTestCase extends WebServiceConfiguration {
    private static Logger log = Logger.getLogger(CrossSellingTestCase.class.getName());

    private Bind_CrossSelling_SOAPStub crossSellingService;

    String product          = "Products/de_3203104010";
    String target_product   = "Products/de_3206199010";
    
    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        log.info("CrossSellingTestCase: setUp");

        CrossSellingService serviceLocator = new CrossSellingServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_CrossSellingAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        crossSellingService = new Bind_CrossSelling_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);

        // setting user-path and password of the shop
        crossSellingService.setUsername(WEBSERVICE_LOGIN);
        crossSellingService.setPassword(WEBSERVICE_PASSWORD);
        
        // remove all assigned cross selling products
        TDeleteCrossSelling_Input CrossSelling_in = new TDeleteCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct("*");
        CrossSelling_in.setType("CrossSelling");
        TDeleteCrossSelling_Input[] CrossSellings = new TDeleteCrossSelling_Input[]{CrossSelling_in};
        TDeleteCrossSelling_Return[] CrossSellings_out = crossSellingService.delete( CrossSellings );
        
        log.info("delete all CrossSelling: " + CrossSellings_out.length);
        for( TDeleteCrossSelling_Return result : CrossSellings_out )
        {
            if( result.getError() != null )
                log.severe("delete CrossSelling failed:" + result.getError().getMessage());
            else
                log.info("deleted CrossSelling: " + result.getTargetProduct() + " : " + result.getDeleted() );
        }

        CrossSelling_in = new TDeleteCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct("*");
        CrossSelling_in.setType("Accessory");
        CrossSellings = new TDeleteCrossSelling_Input[]{CrossSelling_in};
        CrossSellings_out = crossSellingService.delete( CrossSellings );

        log.info("delete all Accessory: " + CrossSellings_out.length);
        for( TDeleteCrossSelling_Return result : CrossSellings_out )
        {
            if( result.getError() != null )
                log.severe("delete failed:" + CrossSellings_out[0].getError().getMessage());
            else
                log.info("deleted Accessory: " + result.getTargetProduct() + " : " + result.getDeleted() );
        }

        CrossSelling_in = new TDeleteCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct("*");
        CrossSelling_in.setType("ProductComparison");
        CrossSellings = new TDeleteCrossSelling_Input[]{CrossSelling_in};
        CrossSellings_out = crossSellingService.delete( CrossSellings );

        log.info("delete all ProductComparison: " + CrossSellings_out.length);
        for( TDeleteCrossSelling_Return result : CrossSellings_out )
        {
            if( result.getError() != null )
                log.severe("delete ProductComparison failed:" + CrossSellings_out[0].getError().getMessage());
            else
                log.info("deleted ProductComparison: " + result.getTargetProduct() + " : " + result.getDeleted() );
        }
        
    }

    /**
    * insert a cross selling and check if the creation was successful
    */
    public void testInsert() throws RemoteException
    {
        log.info("CrossSellingTestCase: testInsert");
        
        // insert a CrossSelling, a ProductComparison and an Accessory product
        TInsertCrossSelling_Input crossSelling = new TInsertCrossSelling_Input();
        crossSelling.setProduct(product);
        crossSelling.setTargetProduct(target_product);
        crossSelling.setType("CrossSelling");
        crossSelling.setPosition(new BigInteger("10"));
        
        TInsertCrossSelling_Input productComparison = new TInsertCrossSelling_Input();
        productComparison.setProduct(product);
        productComparison.setTargetProduct(target_product);
        productComparison.setType("ProductComparison");
        productComparison.setPosition(new BigInteger("10"));
        
        TInsertCrossSelling_Input accessory = new TInsertCrossSelling_Input();
        accessory.setProduct(product);
        accessory.setTargetProduct(target_product);
        accessory.setType("Accessory");
        accessory.setPosition(new BigInteger("10"));
        
        TInsertCrossSelling_Input[] CrossSellings = new TInsertCrossSelling_Input[]{
            crossSelling,
            productComparison,
            accessory,
        };

        TInsertCrossSelling_Return[] CrossSellings_out = crossSellingService.insert(CrossSellings);
        
        // test if creation was successful
        TInsertCrossSelling_Return  CrossSelling_out = CrossSellings_out[0];
        assertEquals("insert result count", 3, CrossSellings_out.length);
        if (CrossSelling_out.getError() == null) {
            log.info("successfully inserted CrossSelling for product: " + CrossSelling_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + CrossSelling_out.getError().getMessage());
        }
        
        assertNull("insert: no error", CrossSelling_out.getError());
        assertTrue("assigned?", CrossSelling_out.getInserted());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("CrossSelling type", "CrossSelling", CrossSelling_out.getType());
    }

    /**
    * delete a cross selling and check if the deletion was successful
    */
    public void testDelete() throws RemoteException
    {
        log.info("CrossSellingTestCase: testDelete");

        TDeleteCrossSelling_Input crossSelling = new TDeleteCrossSelling_Input();
        crossSelling.setProduct(product);
        crossSelling.setTargetProduct(target_product);
        crossSelling.setType("CrossSelling");
        
        TDeleteCrossSelling_Input productComparison = new TDeleteCrossSelling_Input();
        productComparison.setProduct(product);
        productComparison.setTargetProduct(target_product);
        productComparison.setType("ProductComparison");
        
        TDeleteCrossSelling_Input accessory = new TDeleteCrossSelling_Input();
        accessory.setProduct(product);
        accessory.setTargetProduct(target_product);
        accessory.setType("Accessory");
        
        TDeleteCrossSelling_Input[] CrossSellings = new TDeleteCrossSelling_Input[]{
            crossSelling,
            productComparison,
            accessory,
        };

        TDeleteCrossSelling_Return[] CrossSellings_out = crossSellingService.delete(CrossSellings);

        // test if deletion was successful
        assertEquals("delete result count", 3, CrossSellings_out.length);
        TDeleteCrossSelling_Return  CrossSelling_out = CrossSellings_out[0];
        if (CrossSelling_out.getError() == null) {
            log.info("successfully deleted CrossSelling for product: " + CrossSelling_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + CrossSelling_out.getError().getMessage());
        }

        assertNull("delete: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertTrue("deleted?", CrossSelling_out.getDeleted());
    }

    /**
    * test exists method
    * @param expected  if false, test is successful if the CrossSelling does NOT exists
    */
    public void testExists(boolean expected) throws RemoteException
    {
        log.info("CrossSellingTestCase: testExists");

        // all cross selling types (Type=null)
        TExistsCrossSelling_Input CrossSelling_in = new TExistsCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct(target_product);
        TExistsCrossSelling_Input[] CrossSellings = new TExistsCrossSelling_Input[]{CrossSelling_in};

        TExistsCrossSelling_Return[] CrossSellings_out = crossSellingService.exists(CrossSellings);

        // test if exists check was successful
        assertEquals("exists result count (only CrossSelling)", 1, CrossSellings_out.length);
        TExistsCrossSelling_Return  CrossSelling_out = CrossSellings_out[0];
        if (CrossSelling_out.getError() == null) {
            log.info("successfully tested CrossSelling for product: " + CrossSelling_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + CrossSelling_out.getError().getMessage());
        }
        
        assertNull("exists: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("exists?", expected, CrossSelling_out.getExists());

        // only Accessories
        CrossSelling_in = new TExistsCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct(target_product);
        CrossSelling_in.setType("Accessory");
        CrossSellings = new TExistsCrossSelling_Input[]{CrossSelling_in};

        CrossSellings_out = crossSellingService.exists(CrossSellings);
        
        assertEquals("exists result count (only Accessories)", 1, CrossSellings_out.length);
        if (CrossSelling_out.getError() == null) {
            log.info("successfully tested Accessories for product: " + CrossSelling_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + CrossSelling_out.getError().getMessage());
        }

        assertNull("exists: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("exists?", expected, CrossSelling_out.getExists());
    }

    /**
    * test get method
    */
    public void testGet() throws RemoteException
    {
        log.info("CrossSellingTestCase: testGet");

        TGetCrossSelling_Input CrossSelling_in = new TGetCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setType("CrossSelling");
        TGetCrossSelling_Input[] CrossSellings = new TGetCrossSelling_Input[]{CrossSelling_in};

        TGetCrossSelling_Return[] CrossSellings_out = crossSellingService.get(CrossSellings);

        // test if exists check was successful
        assertEquals("get result count", 1, CrossSellings_out.length);
        TGetCrossSelling_Return CrossSelling_out = CrossSellings_out[0];
        if (CrossSelling_out.getError() == null) {
            log.info("successfully retrieved CrossSelling for product: " + CrossSelling_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + CrossSelling_out.getError().getMessage());
        }

        assertNull("get: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product path", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("Position", new BigInteger("10"), CrossSelling_out.getPosition());
        assertEquals("Type", "CrossSelling", CrossSelling_out.getType());

        // Type: ProductComparison
        CrossSelling_in.setType("ProductComparison");
        CrossSellings_out = crossSellingService.get(CrossSellings);
    
        assertEquals("get result count", 1, CrossSellings_out.length);
        CrossSelling_out = CrossSellings_out[0];
        if (CrossSelling_out.getError() == null) {
            log.info("successfully retrieved CrossSelling for product: " + CrossSelling_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + CrossSelling_out.getError().getMessage());
        }

        assertNull("get: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product path", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("Position", new BigInteger("10"), CrossSelling_out.getPosition());
        assertEquals("Type", "ProductComparison", CrossSelling_out.getType());
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() throws RemoteException
    {
        testInsert();
        testExists(true);
        testGet();
        testDelete();
        testExists(false);
    }
}
