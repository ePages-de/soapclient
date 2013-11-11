package de.epages.WebServices.ProductBundleService;

import de.epages.WebServices.ProductBundleService.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;
import java.math.BigInteger;
import java.net.MalformedURLException;

/**
 * A JUnit TestSuite to test epages ProductBundle WebServices.
 */
public class ProductBundleTestCase extends WebServiceConfiguration {
    private static Logger log = Logger.getLogger(ProductBundleTestCase.class.getName());

    private Bind_ProductBundle_SOAPStub productBundleService;

    String product          = "Products/de_3203104010"; //Deuter Kangaroo
    String bundled_product  = "Products/de_3206199010"; //Deuter Schmusebär
    String bundled_product2 = "Products/de_3201212002"; //Deuter Hydro 2.0

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        log.info("ProductBundleTestCase: setUp");

        ProductBundleService serviceLocator = new ProductBundleServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_ProductBundleAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        productBundleService = new Bind_ProductBundle_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);

        // setting user-path and password of the shop
        productBundleService.setUsername(WEBSERVICE_LOGIN);
        productBundleService.setPassword(WEBSERVICE_PASSWORD);
    }

    /**
    * insert a cross selling and check if the creation was successful
    */
    public void testCreate() throws RemoteException
    {
        log.info("ProductBundleTestCase: testCreate");

        // create a ProductBundle
        TBundledProduct bundledProduct = new TBundledProduct(
        		//bundled_product, new String("10"),
        		//new BigInteger("3"), null
        );
        bundledProduct.setPath(bundled_product);
        bundledProduct.setPosition(new BigInteger("10"));
        bundledProduct.setQuantity(3);
        TBundledProduct bundledProduct2 = new TBundledProduct(
        		//bundled_product2, "20",
        		//new BigInteger("1"), null
        );
        bundledProduct2.setPath(bundled_product2);
        bundledProduct2.setPosition(new BigInteger("20"));
        bundledProduct2.setQuantity(1);
        
        TBundledProduct[] bundledProducts = new TBundledProduct[] { bundledProduct, bundledProduct2 };
        TCreate_Input productBundle = new TCreate_Input(product,bundledProducts);
		TCreate_Input[] productBundles = new TCreate_Input[]{productBundle};
        TCreate_Return[] ProductBundles_out = productBundleService.create(productBundles);

        // test if creation was successful
        assertEquals("create result count", 1, ProductBundles_out.length);
    }

    /**
     * update a cross selling and check if the update was successful
     */
     public void testUpdate() throws RemoteException
     {
         log.info("ProductBundleTestCase: testUpdate2");

     }

    /**
    * delete a product bundle and check if the deletion was successful
    */
    public void testDelete() throws RemoteException
    {
        log.info("ProductBundleTestCase: testDelete");

        TBundledProductPath bundledProductPath = new TBundledProductPath(bundled_product2);
        TBundledProductPath[] bundledProductPaths = new TBundledProductPath[] { bundledProductPath };
		TDelete_Input productBundle = new TDelete_Input(product,bundledProductPaths);
		TDelete_Input[] productBundles = new TDelete_Input[]{productBundle};
		TDelete_Return[] ProductBundles_out = productBundleService.delete(productBundles);

        // test if deletion was successful
        assertEquals("delete result count", 1, ProductBundles_out.length);
        TDelete_Return  ProductBundle_out = ProductBundles_out[0];
        if (ProductBundle_out.getError() == null) {
            log.info("successfully deleted ProductBundle for product: " + ProductBundle_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + ProductBundle_out.getError().getMessage());
        }
        assertNull("delete: no error", ProductBundle_out.getError());
        assertEquals("Product path", product, ProductBundle_out.getProduct());
        assertTrue("deleted?", ProductBundle_out.getDeleted());
    }

    /**
    * test exists method
    * @param expected  if false, test is successful if the ProductBundle does NOT exists
    */
    public void testExists(boolean expected) throws RemoteException
    {
        log.info("ProductBundleTestCase: testExists");

		TExists_Input productBundle = new TExists_Input(product,bundled_product2);
		TExists_Input[] productBundles = new TExists_Input[]{productBundle};
		TExists_Return[] ProductBundles_out = productBundleService.exists(productBundles);
        TExists_Return  ProductBundle_out = ProductBundles_out[0];

        if (ProductBundle_out.getError() == null) {
            log.info("successfully tested ProductBundle for product: " + ProductBundle_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + ProductBundle_out.getError().getMessage());
        }

        // test if exists check was successful
        assertNull("exists: no error", ProductBundle_out.getError());
        assertEquals("Product path", product, ProductBundle_out.getProduct());
    }

    /**
    * test getInfo method
    */
    public void testGetInfo() throws RemoteException
    {
        log.info("ProductBundleTestCase: testGetInfo");

		String[] productBundles = new String[]{product};
		TGetInfo_Return[] ProductBundles_out = productBundleService.getInfo(productBundles);

        // test if get call was successful
        assertEquals("getInfo result count", 1, ProductBundles_out.length);
        TGetInfo_Return ProductBundle_out = ProductBundles_out[0];
        if (ProductBundle_out.getError() == null) {
            log.info("successfully retrieved ProductBundle for product: " + ProductBundle_out.getProduct());
        } else {
            log.severe("an error occured (Epages Error):\n" + ProductBundle_out.getError().getMessage());
        }
        assertNull("getInfo: no error", ProductBundle_out.getError());
        assertEquals("Product path", product, ProductBundle_out.getProduct());
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() throws RemoteException
    {
        testCreate();
        testExists(true);
        testGetInfo();
        testDelete();
        testExists(false);
    }
}
