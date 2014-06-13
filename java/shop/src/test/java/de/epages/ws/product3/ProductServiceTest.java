package de.epages.ws.product3;

import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.ShopWebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.product3.model.TCreate_Input;
import de.epages.ws.product3.model.TCreate_Return;
import de.epages.ws.product3.model.TDelete_Return;
import de.epages.ws.product3.model.TExists_Return;
import de.epages.ws.product3.model.TGetInfo_Return;
import de.epages.ws.product3.model.TProductPrice;
import de.epages.ws.product3.model.TUpdate_Input;
import de.epages.ws.product3.model.TUpdate_Return;
import de.epages.ws.product3.stub.TFind_Input;

public class ProductServiceTest {

    private static final ProductServiceClientImpl serviceClient = new ProductServiceClientImpl(new ShopWebServiceTestConfiguration());
    private final TCreate_Input Product_in = new TCreate_Input();
    private final TUpdate_Input Product_update = new TUpdate_Input();

    private final String path = "Products/";
    private final String alias = "java_test-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // create test products that can be used with the create and update
        // methods
        Product_in.setAlias(alias);
        Product_in.set_class("ProductTypes/Shoe");
        Product_in.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Hauptprodukt"),
                new TLocalizedValue("en", "test master product"), });
        Product_in.setTaxClass("/TaxMatrixGermany/normal");
        Product_in.setIsVisible(true);
        Product_in.setOrderUnit("/Units/piece");
        Product_in.setPriceQuantity((float) 1);
        Product_in.setMinOrder((float) 1);
        Product_in.setIntervalOrder((float) 1);

        Product_in.setWeightUnit("/Units/gram");
        Product_in.setWeight((float) 240);
        Product_in.setRefUnit("Units/gram/kilogram");
        Product_in.setRefAmount((float) 1);
        Product_in.setRefContentAmount((float) 0.240);

        Product_in.setStockLevel((float) 140);
        Product_in.setStockLevelAlert((float) 100);

        Product_in.setDeliveryPeriod("asap");

        Product_in.setProductPrices(new TProductPrice[] { new TProductPrice((float) 123, "EUR", "gross"), });
        Product_in.setIsAvailable(true);
        Product_in.setAvailabilityComment(new TLocalizedValue[] { new TLocalizedValue("de", "verfügbar bis update test"),
                new TLocalizedValue("en", "available until update test"), });
        Product_in.setAvailabilityDate(new GregorianCalendar(2007, 11, 25, 12, 00));

        TAttribute attr1 = new TAttribute();
        attr1.setName("Manufacturer");
        attr1.setValue("java WebService client tester");
        Product_in.setAttributes(new TAttribute[] { attr1 });

        Product_update.setPath(path + alias);
        Product_update.setName(new TLocalizedValue[] { new TLocalizedValue("de", "verändertes Test-Hauptprodukt"),
                new TLocalizedValue("en", "updated test master product"), });
        Product_update.setProductPrices(new TProductPrice[] { new TProductPrice((float) 123.50, "EUR", "gross"), });

        Product_update.setDeliveryPeriod("as soon as possible");

        Product_update.setIsAvailable(false);
        Product_update.setAvailabilityComment(new TLocalizedValue[] { new TLocalizedValue("de", "wird gleich gelöscht"),
                new TLocalizedValue("en", "will deleted soon"), });
        Product_update.setAvailabilityDate(new GregorianCalendar(2007, 11, 26, 12, 00));

        TAttribute attr_update = new TAttribute();
        attr_update.setName("Manufacturer");
        attr_update.setValue("java WebService client tester again");
        Product_update.setAttributes(new TAttribute[] { attr_update });

        // delete the test product if it exists
        TExists_Return[] Products_exists_out = serviceClient.exists(new String[] { path + alias });
        if (Products_exists_out[0].getExists()) {
            serviceClient.delete(new String[] { path + alias });
        }
    }

    /**
     * Create a Product and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Input[] Products_create_in = { Product_in };
        TCreate_Return[] Products_create_out = serviceClient.create(Products_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, Products_create_out.length);
        assertEquals("created?", true, Products_create_out[0].getCreated());
    }

    /**
     * Update a Product and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Input[] Products_update_in = { Product_update };
        TUpdate_Return[] Products_update_out = serviceClient.update(Products_update_in);

        // test if update was successful
        assertEquals("udpate result set", 1, Products_update_out.length);
        assertEquals("updated?", true, Products_update_out[0].getUpdated());
    }

    /**
     * Retrieve information about an Product. Check if the returned data are
     * equal to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        TGetInfo_Return[] Products_info_out = serviceClient.getInfo(new String[] { path + alias }, new String[] { "Manufacturer" },
                new String[] { "de", "en" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Products_info_out.length);

        TGetInfo_Return Product_info_out = Products_info_out[0];

        assertEquals("alias", alias, Product_info_out.getAlias());
        assertEquals("Number of languages", 2, Product_info_out.getName().length);

        HashMap<String, String> hashName = new HashMap<String, String>();
        hashName.put(Product_info_out.getName()[0].getLanguageCode(), Product_info_out.getName()[0].getValue());
        hashName.put(Product_info_out.getName()[1].getLanguageCode(), Product_info_out.getName()[1].getValue());

        HashMap<String, String> hashAComment = new HashMap<String, String>();
        hashAComment.put(Product_info_out.getAvailabilityComment()[0].getLanguageCode(),
                Product_info_out.getAvailabilityComment()[0].getValue());
        hashAComment.put(Product_info_out.getAvailabilityComment()[1].getLanguageCode(),
                Product_info_out.getAvailabilityComment()[1].getValue());

        HashMap<String, Float> priceHash = new HashMap<String, Float>();
        priceHash.put(Product_info_out.getProductPrices()[0].getCurrencyID(), Product_info_out.getProductPrices()[0].getPrice());
        priceHash.put(Product_info_out.getProductPrices()[1].getCurrencyID(), Product_info_out.getProductPrices()[1].getPrice());

        if (isAlreadyUpdated) {
            assertEquals("updated Manufacturer", Product_update.getAttributes()[0].getValue(),
                    Product_info_out.getAttributes()[0].getValue());
            assertEquals("updated localized Name", Product_update.getName()[0].getValue(),
                    hashName.get(Product_update.getName()[0].getLanguageCode()));
            assertEquals("updated localized Name", Product_update.getName()[1].getValue(),
                    hashName.get(Product_update.getName()[1].getLanguageCode()));

            assertEquals("Price Value", Product_update.getProductPrices()[0].getPrice(),
                    priceHash.get(Product_update.getProductPrices()[0].getCurrencyID()), 0.0f);

            assertFalse("updated isAvailable", Product_update.getIsAvailable());
            assertEquals("updated localized AvailabilityComment", Product_update.getAvailabilityComment()[0].getValue(),
                    hashAComment.get(Product_update.getAvailabilityComment()[0].getLanguageCode()));
            assertEquals("updated localized AvailabilityComment", Product_update.getAvailabilityComment()[1].getValue(),
                    hashAComment.get(Product_update.getAvailabilityComment()[1].getLanguageCode()));
            assertEquals("updated AvailabilityDate", Product_update.getAvailabilityDate().getTime(), Product_info_out.getAvailabilityDate()
                    .getTime());
            assertEquals("updated delivery period", Product_update.getDeliveryPeriod(), Product_info_out.getDeliveryPeriod());
        } else {
            assertEquals("Manufacturer", Product_in.getAttributes()[0].getValue(), Product_info_out.getAttributes()[0].getValue());
            assertEquals("initial localized Name", Product_in.getName()[0].getValue(),
                    hashName.get(Product_update.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", Product_in.getName()[1].getValue(),
                    hashName.get(Product_update.getName()[1].getLanguageCode()));

            assertEquals("Price Value", Product_in.getProductPrices()[0].getPrice(),
                    priceHash.get(Product_in.getProductPrices()[0].getCurrencyID()), 0.0f);

            assertTrue("isAvailable", Product_in.getIsAvailable());
            assertEquals("localized AvailabilityComment", Product_in.getAvailabilityComment()[0].getValue(),
                    hashAComment.get(Product_in.getAvailabilityComment()[0].getLanguageCode()));
            assertEquals("localized AvailabilityComment", Product_in.getAvailabilityComment()[1].getValue(),
                    hashAComment.get(Product_in.getAvailabilityComment()[1].getLanguageCode()));
            assertEquals("AvailabilityDate", Product_in.getAvailabilityDate().getTime(), Product_info_out.getAvailabilityDate().getTime());
            assertEquals("delivery period", Product_in.getDeliveryPeriod(), Product_info_out.getDeliveryPeriod());
        }

        assertEquals("TaxClass", Product_in.getTaxClass(), Product_info_out.getTaxClass());
        assertEquals("OrderUnit", Product_in.getOrderUnit(), Product_info_out.getOrderUnit());
        assertEquals("IsVisible", Product_in.getIsVisible(), Product_info_out.getIsVisible());
        assertThat(Product_info_out.get_class(), endsWith(Product_in.get_class()));
    }

    /**
     * Delete a Product and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] Products_delete_out = serviceClient.delete(new String[] { path + alias });

        // test if deletion was successful
        assertEquals("delete result set", 1, Products_delete_out.length);
        assertEquals("deleted?", true, Products_delete_out[0].getDeleted());
    }

    /**
     * Test if a Product exists or not
     *
     * @param expected
     *            if false the Test will be successful if the Product does NOT
     *            exist
     */
    public void testExists(boolean expected) {
        TExists_Return[] Products_exists_out = serviceClient.exists(new String[] { path + alias });

        // test if exists check was successful
        assertEquals("exists result set", 1, Products_exists_out.length);
        assertEquals("exists?", expected, Products_exists_out[0].getExists());
    }

    public void testFind() {
        TFind_Input parameters = new TFind_Input();
        parameters.setAlias(Product_in.getAlias());

        String[] Products_find_out = serviceClient.find(parameters);

        // test if find was successful
        assertEquals("find result set", 1, Products_find_out.length);
        assertThat(Products_find_out[0], endsWith(path + alias));
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>create a Product</li>
     * <li>test if this Product exists afterwards</li>
     * <li>test if Product is found by search</li>
     * <li>retrieve info about this Product, and check if the data equals to the
     * input data of create</li>
     * <li>updates the Product</li>
     * <li>again retrieve data, and check if the data are equal to the update
     * input data</li>
     * <li>delete the Product</li>
     * <li>check if the Product still exists</li>
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
