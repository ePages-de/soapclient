package de.epages.ws.product8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.product8.model.TCreate_Input;
import de.epages.ws.product8.model.TCreate_Return;
import de.epages.ws.product8.model.TDelete_Return;
import de.epages.ws.product8.model.TDownload;
import de.epages.ws.product8.model.TExists_Return;
import de.epages.ws.product8.model.TGetInfo_Return;
import de.epages.ws.product8.model.TProductPrice;
import de.epages.ws.product8.model.TShippingMethod;
import de.epages.ws.product8.model.TUpdate_Input;
import de.epages.ws.product8.model.TUpdate_Return;
import de.epages.ws.product8.stub.TFind_Input;

public class ProductServiceTest {
    private static final ProductServiceClientImpl serviceClient = new ProductServiceClientImpl(new WebServiceTestConfiguration());
    private final TCreate_Input Product_in = new TCreate_Input();
    private final TUpdate_Input Product_update = new TUpdate_Input();
    private final TCreate_Input Product_down = new TCreate_Input();

    private final String path = "/Shops/DemoShop/Products/";
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
        Product_in.set_class("/Shops/DemoShop/ProductTypes/Shoe");
        Product_in.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Hauptprodukt"),
                new TLocalizedValue("en", "test master product"), });
        Product_in.setText(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Hauptprodukt Beschreibung"),
                new TLocalizedValue("en", "test master product long description"), });
        Product_in.setTitle(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Pagetitle"),
                new TLocalizedValue("en", "test page title"), });
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
        Product_in.setManufacturerPrices(new TProductPrice[] { new TProductPrice((float) 150, "EUR", "gross"), });
        Product_in.setDepositPrices(new TProductPrice[] { new TProductPrice((float) 5, "EUR", "gross"), });
        Product_in.setPrepaymentPrices(new TProductPrice[] { new TProductPrice((float) 10, "EUR", "gross"), });
        Product_in.setEcoParticipationPrices(new TProductPrice[] { new TProductPrice((float) 7, "EUR", "gross"), });
        Product_in.setShippingMethods( new TShippingMethod[] {
                new TShippingMethod("ShippingMethods/Post",false),
                new TShippingMethod("ShippingMethods/Express",false),
        });
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
        Product_update.setText(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Hauptprodukt Beschreibung modifiziert"),
                new TLocalizedValue("en", "test master product long description updated"), });
        Product_update.setTitle(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Pagetitle modifiziert"),
                new TLocalizedValue("en", "test page title updated"), });
        Product_update.setProductPrices(new TProductPrice[] { new TProductPrice((float) 123.50, "EUR", "gross"), });
        Product_update.setManufacturerPrices(new TProductPrice[] { new TProductPrice((float) 150.50, "EUR", "gross"), });
        Product_update.setDepositPrices(new TProductPrice[] { new TProductPrice((float) 5.50, "EUR", "gross"), });
        Product_update.setPrepaymentPrices(new TProductPrice[] { new TProductPrice((float) 10.50, "EUR", "gross"), });
        Product_update.setEcoParticipationPrices(new TProductPrice[] { new TProductPrice((float) 7.50, "EUR", "gross"), });
        Product_update.setShippingMethods( new TShippingMethod[] {
                new TShippingMethod("ShippingMethods/PickupByCustomer",false),
                new TShippingMethod("ShippingMethods/Express",true),
        });

        Product_update.setDeliveryPeriod("as soon as possible");

        Product_update.setIsAvailable(false);
        Product_update.setAvailabilityComment(new TLocalizedValue[] { new TLocalizedValue("de", "wird gleich gelöscht"),
                new TLocalizedValue("en", "will deleted soon"), });
        Product_update.setAvailabilityDate(new GregorianCalendar(2007, 11, 26, 12, 00));

        TAttribute attr_update = new TAttribute();
        attr_update.setName("Manufacturer");
        attr_update.setValue("java WebService client tester again");
        Product_update.setAttributes(new TAttribute[] { attr_update });

        Product_down.setAlias(alias);
        Product_down.set_class("/Shops/DemoShop/ProductTypes/Shoe");
        Product_down.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Downloadprodukt") });
        Product_down.setTaxClass("/TaxMatrixGermany/normal");
        Product_down.setIsAvailable(true);

        Product_down.setIsDownloadProduct(true);
        Product_down.setMaxDownloadTime(new BigInteger("5"));
        Product_down.setMaxDownloadCount(new BigInteger("3"));
        TDownload download = new TDownload();
        download.setIsExternal(true);
        download.setFileName("http://www.epages.com/de/download/de-epages6-SEO.pdf");
        download.setTargetUrl("http://www.epages.com/de/download/de-epages6-SEO.pdf");
        download.setPosition(new BigInteger("10"));
        Product_down.setDownloadProductMaps(new TDownload[] { download });

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

        HashMap<String, String> hashLongDescription = new HashMap<String, String>();
        hashLongDescription.put(Product_info_out.getText()[0].getLanguageCode(), Product_info_out.getText()[0].getValue());
        hashLongDescription.put(Product_info_out.getText()[1].getLanguageCode(), Product_info_out.getText()[1].getValue());

        HashMap<String, String> hashTitle = new HashMap<String, String>();
        hashTitle.put(Product_info_out.getTitle()[0].getLanguageCode(), Product_info_out.getTitle()[0].getValue());
        hashTitle.put(Product_info_out.getTitle()[1].getLanguageCode(), Product_info_out.getTitle()[1].getValue());

        HashMap<String, String> hashAComment = new HashMap<String, String>();
        hashAComment.put(Product_info_out.getAvailabilityComment()[0].getLanguageCode(),
                Product_info_out.getAvailabilityComment()[0].getValue());
        hashAComment.put(Product_info_out.getAvailabilityComment()[1].getLanguageCode(),
                Product_info_out.getAvailabilityComment()[1].getValue());

        HashMap<String, Float> priceHash = new HashMap<String, Float>();
        priceHash.put(Product_info_out.getProductPrices()[0].getCurrencyID(), Product_info_out.getProductPrices()[0].getPrice());
        priceHash.put(Product_info_out.getProductPrices()[1].getCurrencyID(), Product_info_out.getProductPrices()[1].getPrice());

        HashMap<String, Float> priceHash2 = new HashMap<String, Float>();
        priceHash2.put(Product_info_out.getManufacturerPrices()[0].getCurrencyID(), Product_info_out.getManufacturerPrices()[0].getPrice());
        priceHash2.put(Product_info_out.getManufacturerPrices()[1].getCurrencyID(), Product_info_out.getManufacturerPrices()[1].getPrice());

        HashMap<String, Float> priceHash3 = new HashMap<String, Float>();
        priceHash3.put(Product_info_out.getDepositPrices()[0].getCurrencyID(), Product_info_out.getDepositPrices()[0].getPrice());
        priceHash3.put(Product_info_out.getDepositPrices()[1].getCurrencyID(), Product_info_out.getDepositPrices()[1].getPrice());

        HashMap<String, Float> priceHash4 = new HashMap<String, Float>();
        priceHash4.put(Product_info_out.getPrepaymentPrices()[0].getCurrencyID(), Product_info_out.getPrepaymentPrices()[0].getPrice());
        priceHash4.put(Product_info_out.getPrepaymentPrices()[1].getCurrencyID(), Product_info_out.getPrepaymentPrices()[1].getPrice());

        HashMap<String, Float> priceHash5 = new HashMap<String, Float>();
        priceHash5.put(Product_info_out.getEcoParticipationPrices()[0].getCurrencyID(),
                Product_info_out.getEcoParticipationPrices()[0].getPrice());
        priceHash5.put(Product_info_out.getEcoParticipationPrices()[1].getCurrencyID(),
                Product_info_out.getEcoParticipationPrices()[1].getPrice());
        assertEquals("Number of shipping methods", 2, Product_info_out.getShippingMethods().length );
        HashMap<String, String> shippHash = new HashMap<String, String>();
        shippHash.put(Product_info_out.getShippingMethods()[0].getPath(), "1");
        shippHash.put(Product_info_out.getShippingMethods()[1].getPath(), "1");

        if (isAlreadyUpdated) {
            assertEquals("updated Manufacturer", Product_update.getAttributes()[0].getValue(),
                    Product_info_out.getAttributes()[0].getValue());
            assertEquals("updated localized Name", Product_update.getName()[0].getValue(),
                    hashName.get(Product_update.getName()[0].getLanguageCode()));
            assertEquals("updated localized Name", Product_update.getName()[1].getValue(),
                    hashName.get(Product_update.getName()[1].getLanguageCode()));
            assertEquals("updated localized LongDescription", Product_update.getText()[0].getValue(),
                    hashLongDescription.get(Product_update.getText()[0].getLanguageCode()));
            assertEquals("updated localized LongDescription", Product_update.getText()[1].getValue(),
                    hashLongDescription.get(Product_update.getText()[1].getLanguageCode()));
            assertEquals("updated localized Title", Product_update.getTitle()[0].getValue(),
                    hashTitle.get(Product_update.getTitle()[0].getLanguageCode()));
            assertEquals("updated localized Title", Product_update.getTitle()[1].getValue(),
                    hashTitle.get(Product_update.getTitle()[1].getLanguageCode()));

            assertEquals("Price Value", Product_update.getProductPrices()[0].getPrice(),
                    priceHash.get(Product_update.getProductPrices()[0].getCurrencyID()), 0.0f);
            assertEquals("Manufacturer Price Value", Product_update.getManufacturerPrices()[0].getPrice(),
                    priceHash2.get(Product_update.getManufacturerPrices()[0].getCurrencyID()), 0.0f);
            assertEquals("Deposit Price Value", Product_update.getDepositPrices()[0].getPrice(),
                    priceHash3.get(Product_update.getDepositPrices()[0].getCurrencyID()), 0.0f);
            assertEquals("Prepayment Price Value", Product_update.getPrepaymentPrices()[0].getPrice(),
                    priceHash4.get(Product_update.getPrepaymentPrices()[0].getCurrencyID()), 0.0f);
            assertEquals("EcoParticipation Price Value", Product_update.getEcoParticipationPrices()[0].getPrice(),
                    priceHash5.get(Product_update.getEcoParticipationPrices()[0].getCurrencyID()), 0.0f);

            assertFalse("updated isAvailable", Product_update.getIsAvailable());
            assertEquals("updated localized AvailabilityComment", Product_update.getAvailabilityComment()[0].getValue(),
                    hashAComment.get(Product_update.getAvailabilityComment()[0].getLanguageCode()));
            assertEquals("updated localized AvailabilityComment", Product_update.getAvailabilityComment()[1].getValue(),
                    hashAComment.get(Product_update.getAvailabilityComment()[1].getLanguageCode()));
            assertEquals("updated AvailabilityDate", Product_update.getAvailabilityDate().getTime(), Product_info_out.getAvailabilityDate()
                    .getTime());

            assertEquals("updated delivery period", Product_update.getDeliveryPeriod(), Product_info_out.getDeliveryPeriod());
            assertTrue("do not touch shipping path", shippHash.containsKey("/Shops/DemoShop/ShippingMethods/Post"));
            assertTrue("added new shipping path", shippHash.containsKey("/Shops/DemoShop/ShippingMethods/PickupByCustomer"));
            assertTrue("deleted shipping path", !shippHash.containsKey("/Shops/DemoShop/ShippingMethods/Express"));
        } else {
            assertEquals("Manufacturer", Product_in.getAttributes()[0].getValue(), Product_info_out.getAttributes()[0].getValue());
            assertEquals("initial localized Name", Product_in.getName()[0].getValue(),
                    hashName.get(Product_update.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", Product_in.getName()[1].getValue(),
                    hashName.get(Product_update.getName()[1].getLanguageCode()));
            assertEquals("updated localized LongDescription", Product_in.getText()[0].getValue(),
                    hashLongDescription.get(Product_in.getText()[0].getLanguageCode()));
            assertEquals("updated localized LongDescription", Product_in.getText()[1].getValue(),
                    hashLongDescription.get(Product_in.getText()[1].getLanguageCode()));
            assertEquals("updated localized Title", Product_in.getTitle()[0].getValue(),
                    hashTitle.get(Product_in.getTitle()[0].getLanguageCode()));
            assertEquals("updated localized Title", Product_in.getTitle()[1].getValue(),
                    hashTitle.get(Product_in.getTitle()[1].getLanguageCode()));

            assertEquals("Price Value", Product_in.getProductPrices()[0].getPrice(),
                    priceHash.get(Product_in.getProductPrices()[0].getCurrencyID()), 0.0f);
            assertEquals("Manufacturer Price Value", Product_in.getManufacturerPrices()[0].getPrice(),
                    priceHash2.get(Product_in.getManufacturerPrices()[0].getCurrencyID()), 0.0f);
            assertEquals("Deposit Price Value", Product_in.getDepositPrices()[0].getPrice(),
                    priceHash3.get(Product_in.getDepositPrices()[0].getCurrencyID()), 0.0f);
            assertEquals("Prepayment Price Value", Product_in.getPrepaymentPrices()[0].getPrice(),
                    priceHash4.get(Product_in.getPrepaymentPrices()[0].getCurrencyID()), 0.0f);
            assertEquals("EcoParticipation Price Value", Product_in.getEcoParticipationPrices()[0].getPrice(),
                    priceHash5.get(Product_in.getEcoParticipationPrices()[0].getCurrencyID()), 0.0f);

            assertTrue("isAvailable", Product_in.getIsAvailable());
            assertEquals("localized AvailabilityComment", Product_in.getAvailabilityComment()[0].getValue(),
                    hashAComment.get(Product_in.getAvailabilityComment()[0].getLanguageCode()));
            assertEquals("localized AvailabilityComment", Product_in.getAvailabilityComment()[1].getValue(),
                    hashAComment.get(Product_in.getAvailabilityComment()[1].getLanguageCode()));
            assertEquals("AvailabilityDate", Product_in.getAvailabilityDate().getTime(), Product_info_out.getAvailabilityDate().getTime());
            assertEquals("delivery period", Product_in.getDeliveryPeriod(), Product_info_out.getDeliveryPeriod());

            assertTrue("shipping path 1", shippHash.containsKey("/Shops/DemoShop/ShippingMethods/Post"));
            assertTrue("shipping path 2", shippHash.containsKey("/Shops/DemoShop/ShippingMethods/Express"));
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
        assertEquals("found path", path + alias, Products_find_out[0]);
    }

    public void testCreateDownload() {
        TCreate_Input[] Products_create_in = { Product_down };
        TCreate_Return[] Products_create_out = serviceClient.create(Products_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, Products_create_out.length);
        assertEquals("created?", true, Products_create_out[0].getCreated());
    }

    public void testGetInfoDownload() {
        TGetInfo_Return[] Products_info_out = serviceClient.getInfo(new String[] { path + alias }, new String[] {}, new String[] { "de",
                "en" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Products_info_out.length);

        TGetInfo_Return Product_info_out = Products_info_out[0];

        assertEquals("alias", alias, Product_info_out.getAlias());
        assertTrue("isDownloadProduct", Product_info_out.isIsDownloadProduct());
        assertEquals("MaxDownloadTime", Product_info_out.getMaxDownloadTime(), Product_down.getMaxDownloadTime());
        assertEquals("MaxDownloadCount", Product_info_out.getMaxDownloadCount(), Product_down.getMaxDownloadCount());

        TDownload getDownload = Product_info_out.getDownloadProductMaps()[0];
        TDownload refDownload = Product_down.getDownloadProductMaps()[0];
        assertEquals("Position", getDownload.getPosition(), refDownload.getPosition());
        assertEquals("TargetUrl", getDownload.getTargetUrl(), refDownload.getTargetUrl());
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

        testCreateDownload();
        testExists(true);
        testGetInfoDownload();
        testDelete();
        testExists(false);
    }
}
