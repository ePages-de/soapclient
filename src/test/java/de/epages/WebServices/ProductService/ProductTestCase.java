package de.epages.WebServices.ProductService;

import de.epages.WebServices.ProductService.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.text.*;
import java.util.*;
import java.util.logging.Logger;
import java.rmi.RemoteException;

/**
 * A JUnit TestSuite to test epages Product WebServices.
 *
 * User: tmangner
 * Date: 08.12.2005
 * Time: 14:19:18
 */
public class ProductTestCase {
    private static Logger log = Logger.getLogger(ProductTestCase.class.getName());
    ProductServiceClient serviceClient;
    TCreate_Input Product_in = new TCreate_Input();
    TUpdate_Input Product_update = new TUpdate_Input();

    String path = "/Shops/DemoShop/Products/";
    String alias = "java_test-1";

    SimpleDateFormat sdf_in  = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    SimpleDateFormat sdf_out = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new ProductServiceClient();

        // create test products that can be used with the create and update methods
        Product_in.setAlias(alias);
        Product_in.set_class("/Shops/DemoShop/ProductTypes/Shoe");
        Product_in.setName(new TLocalizedValue[]{
                    new TLocalizedValue("de", "Test-Hauptprodukt"),
                    new TLocalizedValue("en", "test master product"),
                });
        Product_in.setTaxClass("/TaxMatrixGermany/normal");
        Product_in.setIsVisible(true);
        Product_in.setOrderUnit("/Units/piece");
        Product_in.setPriceQuantity((float)1);
        Product_in.setMinOrder((float)1);
        Product_in.setIntervalOrder((float)1);

        Product_in.setWeightUnit("/Units/gram");
        Product_in.setWeight((float)240);
        Product_in.setRefUnit("Units/gram/kilogram");
        Product_in.setRefAmount((float)1);
        Product_in.setRefContentAmount((float)0.240);

        Product_in.setStockLevel((float)140);
        Product_in.setStockLevelAlert((float)100);

        Product_in.setProductPrices(new TProductPrice[]{
                    new TProductPrice((float)123, "EUR", "gross"),
                });

        String dateStr = new String(sdf_in.format(new GregorianCalendar(2005,11,24,18,00).getTime()));
        TAttribute attr1 = new TAttribute();
        attr1.setName("AvailabilityDate");
        attr1.setType("DateTime");
        attr1.setValue(dateStr);
        Product_in.setAttributes(new TAttribute[]{attr1});

        Product_update.setPath(path + alias);
        Product_update.setName(new TLocalizedValue[]{
                    new TLocalizedValue("de", "verändertes Test-Hauptprodukt"),
                    new TLocalizedValue("en", "updated test master product"),
                });
        Product_update.setProductPrices(new TProductPrice[]{
                    new TProductPrice((float)123.50, "EUR", "gross"),
                });

        dateStr = new String(sdf_in.format(new GregorianCalendar(2005,11,25,18,00).getTime()));
        TAttribute attr_update = new TAttribute();
        attr_update.setName("AvailabilityDate");
        attr_update.setType("DateTime");
        attr_update.setValue(dateStr);
        Product_update.setAttributes(new TAttribute[]{attr_update});
        
        // delete the test product if it exists
        List<TExists_Return> Products_exists_out;
        try {           
            Products_exists_out = serviceClient.existsProduct(new String[]{path + alias});
            if( Products_exists_out.get(0).getExists() ) {
                serviceClient.deleteProduct(new String[]{path + alias});
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a Product and check if the creation was successful
     */
    public void testCreate() {
        List<TCreate_Input> Products_create_in = new ArrayList();
        Products_create_in.add(Product_in);

        List<TCreate_Return> Products_create_out = new ArrayList();

        try {
            Products_create_out = serviceClient.createProduct(Products_create_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        assertEquals("create result set", 1, Products_create_out.size());
        assertEquals("created?", new Boolean(true), Products_create_out.get(0).getCreated());
    }

    /**
     * Update a Product and check if the update was successful
     */
    public void testUpdate() {
        List<TUpdate_Input> Products_update_in = new ArrayList();
        Products_update_in.add(Product_update);

        List<TUpdate_Return> Products_update_out = new ArrayList();

        try {
            Products_update_out = serviceClient.updateProduct(Products_update_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if update was successful
        assertEquals("udpate result set", 1, Products_update_out.size());
        assertEquals("updated?", new Boolean(true), Products_update_out.get(0).getUpdated());
    }

    /**
     * Retrieve information about an Product. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        List<TGetInfo_Return> Products_info_out = new ArrayList();
        try {
            Products_info_out = serviceClient.getProductInfo(
                new String[]{path + alias},
                new String[]{"AvailabilityDate"},
                new String[]{"de", "en"}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Products_info_out.size());

        TGetInfo_Return Product_info_out = Products_info_out.get(0);

        assertEquals("alias", alias, Product_info_out.getAlias());
        assertEquals("Number of languages", 2, Product_info_out.getName().length );
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put(Product_info_out.getName()[0].getLanguageCode(), Product_info_out.getName()[0].getValue());
        hash.put(Product_info_out.getName()[1].getLanguageCode(), Product_info_out.getName()[1].getValue());
        
        HashMap<String, Float> priceHash = new HashMap<String, Float>();
        priceHash.put(Product_info_out.getProductPrices()[0].getCurrencyID(), Product_info_out.getProductPrices()[0].getPrice());
        priceHash.put(Product_info_out.getProductPrices()[1].getCurrencyID(), Product_info_out.getProductPrices()[1].getPrice());
        

        if (isAlreadyUpdated) {

        	try {
        		Date date_in  = sdf_in.parse(Product_update.getAttributes()[0].getValue());
        		Date date_out = sdf_out.parse(Product_info_out.getAttributes()[0].getValue());
                assertEquals("AvailabilityDate", date_in, date_out);
        	} catch (ParseException e) {
                e.printStackTrace();
        	}
            
            assertEquals("updated localized Name", Product_update.getName()[0].getValue(), hash.get(Product_update.getName()[0].getLanguageCode()));
            assertEquals("updated localized Name", Product_update.getName()[1].getValue(), hash.get(Product_update.getName()[1].getLanguageCode()));

            assertEquals("Price Value", (float)Product_update.getProductPrices()[0].getPrice(), (float)priceHash.get(Product_update.getProductPrices()[0].getCurrencyID()) );
        }
        else {
        	
        	try {
        		Date date_in  = sdf_in.parse(Product_in.getAttributes()[0].getValue());
        		Date date_out = sdf_out.parse(Product_info_out.getAttributes()[0].getValue());
                assertEquals("AvailabilityDate", date_in, date_out);
        	} catch (ParseException e) {
                e.printStackTrace();
        	}
            
            assertEquals("initial localized Name", Product_in.getName()[0].getValue(), hash.get(Product_update.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", Product_in.getName()[1].getValue(), hash.get(Product_update.getName()[1].getLanguageCode()));

            assertEquals("Price Value", (float)Product_in.getProductPrices()[0].getPrice(), (float)priceHash.get(Product_in.getProductPrices()[0].getCurrencyID()) );
        }

        assertEquals("TaxClass", Product_in.getTaxClass(), Product_info_out.getTaxClass());
        assertEquals("OrderUnit", Product_in.getOrderUnit(), Product_info_out.getOrderUnit());
        assertEquals("IsVisible", Product_in.getIsVisible(), Product_info_out.getIsVisible());
        assertEquals("class", Product_in.get_class(), Product_info_out.get_class());
    }

    /**
     * Delete a Product and check if no error occured.
     */
    public void testDelete() {
        List<TDelete_Return> Products_delete_out = new ArrayList();
        try {
            Products_delete_out = serviceClient.deleteProduct(new String[]{path + alias});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if deletion was successful
        assertEquals("delete result set", 1, Products_delete_out.size());
        assertEquals("deleted?", new Boolean(true), Products_delete_out.get(0).getDeleted());
    }

    /**
     * Test if a Product exists or not
     *
     * @param expected if false the Test will be successful if the Product does NOT exist
     */
    public void testExists(boolean expected) {
        List<TExists_Return> Products_exists_out = new ArrayList();
        try {
            Products_exists_out = serviceClient.existsProduct(new String[]{path + alias});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if exists check was successful
        assertEquals("exists result set", 1, Products_exists_out.size());
        assertEquals("exists?", new Boolean(expected), Products_exists_out.get(0).getExists());
    }

    public void testFind() {
        TFind_Input parameters = new TFind_Input();
        parameters.setAlias(Product_in.getAlias());

        String[] Products_find_out = new String[]{};
        try {
            Products_find_out = serviceClient.findProducts(parameters);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if find was successful
        assertEquals("find result set", 1, Products_find_out.length);
        assertEquals("found path", path + alias, Products_find_out[0]);
    }

    /**
     * Runs all tests:
     * <ol>
     *   <li>create a Product</li>
     *   <li>test if this Product exists afterwards</li>
     *   <li>test if Product is found by search</li>
     *   <li>retrieve info about this Product, and check if the data equals to the input data of create</li>
     *   <li>updates the Product</li>
     *   <li>again retrieve data, and check if the data are equal to the update input data</li>
     *   <li>delete the Product</li>
     *   <li>check if the Product still exists</li>
     * </ol>
     */
    @Test
    public void testAll() {
        testCreate();
        testExists(true);
        testFind();
        testGetInfo(false);
        testUpdate();
        testGetInfo(true);
        testDelete();
        testExists(false);
    }
}
