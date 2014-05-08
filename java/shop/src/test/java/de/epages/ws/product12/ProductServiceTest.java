package de.epages.ws.product12;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.FileUtil;
import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.product12.model.TCreate_Input;
import de.epages.ws.product12.model.TCreate_Return;
import de.epages.ws.product12.model.TDelete_Return;
import de.epages.ws.product12.model.TDownload;
import de.epages.ws.product12.model.TExists_Return;
import de.epages.ws.product12.model.TGetInfo_Return;
import de.epages.ws.product12.model.TProductPrice;
import de.epages.ws.product12.model.TShippingMethod;
import de.epages.ws.product12.model.TUpdate_Input;
import de.epages.ws.product12.model.TUpdate_Return;
import de.epages.ws.product12.stub.TFind_Input;

public class ProductServiceTest {
    private ProductServiceClientImpl serviceClient;
    private TCreate_Input Product_in;
    private TUpdate_Input Product_update;
    private TCreate_Input Product_down;
    private TCreate_Input Product_down_up;
    private TCreate_Input Product_var1 = new TCreate_Input();
    private TCreate_Input Product_var2 = new TCreate_Input();

    private static final String path = "/Shops/DemoShop/Products/";
    private static final String alias = "java_test-1";
    private static final String alias_var1 = "java_variant-1";
    private static final String alias_var2 = "java_variant-2";

    private TAttribute makeStringAttribute(String name, String value) {
        final TAttribute attribute = new TAttribute();
        attribute.setType("String");
        attribute.setName(name);
        attribute.setValue(value);
        return attribute;
    }

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() throws IOException {
        serviceClient = new ProductServiceClientImpl(new WebServiceTestConfiguration());

        Product_in = new TCreate_Input();
        Product_update = new TUpdate_Input();
        Product_down = new TCreate_Input();
        Product_down_up = new TCreate_Input();

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
        Product_in.setMainCharacteristics(new TLocalizedValue[] { new TLocalizedValue("de", "EiFon lila 128GB"),
                new TLocalizedValue("en", "iFon purple 128GB"), });
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
        Product_in.setShippingMethods(new TShippingMethod[] { new TShippingMethod("ShippingMethods/Post", false),
                new TShippingMethod("ShippingMethods/Express", false), });
        Product_in.setIsAvailable(true);
        Product_in.setAvailabilityComment(new TLocalizedValue[] { new TLocalizedValue("de", "verfügbar bis update test"),
                new TLocalizedValue("en", "available until update test"), });
        Product_in.setAvailabilityDate(new GregorianCalendar(2007, 11, 25, 12, 00));
        Product_in.setAttributes(new TAttribute[] { makeStringAttribute("Manufacturer", "java WebService client tester") });

        Product_update.setPath(path + alias);
        Product_update.setName(new TLocalizedValue[] { new TLocalizedValue("de", "verändertes Test-Hauptprodukt"),
                new TLocalizedValue("en", "updated test master product"), });
        Product_update.setText(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Hauptprodukt Beschreibung modifiziert"),
                new TLocalizedValue("en", "test master product long description updated"), });
        Product_update.setTitle(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Pagetitle modifiziert"),
                new TLocalizedValue("en", "test page title updated"), });
        Product_update.setMainCharacteristics(new TLocalizedValue[] { new TLocalizedValue("de", "EiFon rosa 64GB"),
                new TLocalizedValue("en", "iiFon pink 64GB"), });
        Product_update.setProductPrices(new TProductPrice[] { new TProductPrice((float) 123.50, "EUR", "gross"), });
        Product_update.setManufacturerPrices(new TProductPrice[] { new TProductPrice((float) 150.50, "EUR", "gross"), });
        Product_update.setDepositPrices(new TProductPrice[] { new TProductPrice((float) 5.50, "EUR", "gross"), });
        Product_update.setPrepaymentPrices(new TProductPrice[] { new TProductPrice((float) 10.50, "EUR", "gross"), });
        Product_update.setEcoParticipationPrices(new TProductPrice[] { new TProductPrice((float) 7.50, "EUR", "gross"), });
        Product_update.setShippingMethods(new TShippingMethod[] { new TShippingMethod("ShippingMethods/PickupByCustomer", false),
                new TShippingMethod("ShippingMethods/Express", true), });

        Product_update.setDeliveryPeriod("as soon as possible");
        Product_update.setWeight(1.0f);
        Product_update.setWeightUnit("/Units/gram/kilogram");

        Product_update.setIsAvailable(false);
        Product_update.setAvailabilityComment(new TLocalizedValue[] { new TLocalizedValue("de", "wird gleich gelöscht"),
                new TLocalizedValue("en", "will deleted soon"), });
        Product_update.setAvailabilityDate(new GregorianCalendar(2007, 11, 26, 12, 00));
        Product_update.setAttributes(new TAttribute[] { makeStringAttribute("Manufacturer", "java WebService client tester again") });
        TAttribute attr_update = new TAttribute();
        attr_update.setName("Manufacturer");
        attr_update.setValue("java WebService client tester again");
        Product_update.setAttributes(new TAttribute[]{attr_update});
        Product_update.setExpiryDate(new GregorianCalendar(2020,01,01,00,00));

        Product_down.setAlias(alias);
        Product_down.set_class("ProductTypes/Shoe");
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

        Product_down_up.setAlias(alias);
        Product_down_up.set_class("ProductTypes/Shoe");
        Product_down_up.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Downloadprodukt") });
        Product_down_up.setTaxClass("/TaxMatrixGermany/normal");
        Product_down_up.setIsAvailable(true);

        Product_down_up.setIsDownloadProduct(true);
        Product_down_up.setMaxDownloadTime(new BigInteger("5"));
        Product_down_up.setMaxDownloadCount(new BigInteger("3"));
        TDownload download_up = new TDownload();
        download_up.setIsExternal(false);
        download_up.setFileName("image_download.jpg");
        download_up.setPosition(new BigInteger("10"));
        download_up.setFileContent(FileUtil.readFileFromClasspath("TestData/ProductImageService/cg_0100504001.jpg"));
        // TODO: Why has this become mandatory?
        download_up.setTargetUrl("http://localhost/");
        Product_down_up.setDownloadProductMaps(new TDownload[] { download_up });

        String superProductPath = path + alias;
        Product_var1.setAlias(alias_var1);
        Product_var1.set_class("ProductTypes/Shoe");
        Product_var1.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Produktvariante1"),
                new TLocalizedValue("en", "test sub product 1"), });
        Product_var1.setTaxClass("/TaxMatrixGermany/normal");
        Product_var1.setIsVisible(true);
        Product_var1.setStockLevel((float) 155.0);

        // variation settings
        Product_var1.setIsDefault(true);
        Product_var1.setSuperProduct(superProductPath);
        Product_var1.setHasSubOwnPrices(true);
        Product_var1.setProductPrices(new TProductPrice[] { new TProductPrice((float) 155, "EUR", "gross"), });
        Product_var1.setVariationAttributes(new TAttribute[] { makeStringAttribute("USSize", "10") });

        Product_var2.setAlias(alias_var2);
        Product_var2.set_class("ProductTypes/Shoe");
        Product_var2.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Produktvariante2"),
                new TLocalizedValue("en", "test sub product 2"), });
        Product_var2.setTaxClass("/TaxMatrixGermany/normal");
        Product_var2.setIsVisible(true);
        Product_var2.setStockLevel((float) 66.0);

        // variation settings
        Product_var2.setIsDefault(false);
        Product_var2.setSuperProduct(superProductPath);
        Product_var2.setHasSubOwnPrices(true);
        Product_var2.setProductPrices(new TProductPrice[] { new TProductPrice((float) 66, "EUR", "gross"), });
        Product_var2.setVariationAttributes(new TAttribute[] { makeStringAttribute("USSize", "6") });

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
        TCreate_Input[] Products_create_in = new TCreate_Input[] { Product_in };
        TCreate_Return[] Products_create_out = serviceClient.create(Products_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, Products_create_out.length);
        assertNoError(Products_create_out[0].getError());
        assertEquals("created?", true, Products_create_out[0].getCreated());
    }

    /**
     * Update a Product and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Input[] Products_update_in = new TUpdate_Input[] { Product_update };
        TUpdate_Return[] Products_update_out = serviceClient.update(Products_update_in);

        // test if update was successful
        assertEquals("udpate result set", 1, Products_update_out.length);
        assertNoError(Products_update_out[0].getError());
        assertEquals("updated?", true, Products_update_out[0].getUpdated());
    }

    /**
     * Retrieve information about an Product. Check if the returned data are
     * equal to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     */
    public void getInfo(boolean isAlreadyUpdated) {
        TGetInfo_Return[] Products_info_out = serviceClient.getInfo(new String[] { path + alias }, new String[] { "Manufacturer" },
                new String[] { "de", "en" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Products_info_out.length);
        assertNoError(Products_info_out[0].getError());

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

        HashMap<String, String> hashMainCharact = new HashMap<String, String>();
        hashMainCharact.put(Product_info_out.getMainCharacteristics()[0].getLanguageCode(),
                Product_info_out.getMainCharacteristics()[0].getValue());
        hashMainCharact.put(Product_info_out.getMainCharacteristics()[1].getLanguageCode(),
                Product_info_out.getMainCharacteristics()[1].getValue());

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

        assertEquals("Number of shipping methods", 2, Product_info_out.getShippingMethods().length);
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
            assertEquals("updated localized MainCharacteristic", Product_update.getMainCharacteristics()[0].getValue(),
                    hashMainCharact.get(Product_update.getMainCharacteristics()[0].getLanguageCode()));
            assertEquals("updated localized MainCharacteristic", Product_update.getMainCharacteristics()[1].getValue(),
                    hashMainCharact.get(Product_update.getMainCharacteristics()[1].getLanguageCode()));

            assertEquals("Price Value", (float) Product_update.getProductPrices()[0].getPrice(),
                    (float) priceHash.get(Product_update.getProductPrices()[0].getCurrencyID()), 0.001);
            assertEquals("Manufacturer Price Value", (float) Product_update.getManufacturerPrices()[0].getPrice(),
                    (float) priceHash2.get(Product_update.getManufacturerPrices()[0].getCurrencyID()), 0.001);
            assertEquals("Deposit Price Value", (float) Product_update.getDepositPrices()[0].getPrice(),
                    (float) priceHash3.get(Product_update.getDepositPrices()[0].getCurrencyID()), 0.001);
            assertEquals("Prepayment Price Value", (float) Product_update.getPrepaymentPrices()[0].getPrice(),
                    (float) priceHash4.get(Product_update.getPrepaymentPrices()[0].getCurrencyID()), 0.001);
            assertEquals("EcoParticipation Price Value", (float) Product_update.getEcoParticipationPrices()[0].getPrice(),
                    (float) priceHash5.get(Product_update.getEcoParticipationPrices()[0].getCurrencyID()), 0.001);

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
            assertEquals("expirydate", Product_update.getExpiryDate().getTime(), Product_info_out.getExpiryDate().getTime());

            assertEquals("/Units/gram/kilogram", Product_update.getWeightUnit());
            assertEquals(1f,Product_update.getWeight(),0.0f);
        } else {
            assertEquals("Manufacturer", Product_in.getAttributes()[0].getValue(), Product_info_out.getAttributes()[0].getValue());
            assertEquals("initial localized Name", Product_in.getName()[0].getValue(),
                    hashName.get(Product_update.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", Product_in.getName()[1].getValue(),
                    hashName.get(Product_update.getName()[1].getLanguageCode()));
            assertEquals("initial localized LongDescription", Product_in.getText()[0].getValue(),
                    hashLongDescription.get(Product_in.getText()[0].getLanguageCode()));
            assertEquals("initial localized LongDescription", Product_in.getText()[1].getValue(),
                    hashLongDescription.get(Product_in.getText()[1].getLanguageCode()));
            assertEquals("initial localized Title", Product_in.getTitle()[0].getValue(),
                    hashTitle.get(Product_in.getTitle()[0].getLanguageCode()));
            assertEquals("initial localized Title", Product_in.getTitle()[1].getValue(),
                    hashTitle.get(Product_in.getTitle()[1].getLanguageCode()));
            assertEquals("initial localized MainCharacteristic", Product_in.getMainCharacteristics()[0].getValue(),
                    hashMainCharact.get(Product_in.getMainCharacteristics()[0].getLanguageCode()));
            assertEquals("initial localized MainCharacteristic", Product_in.getMainCharacteristics()[1].getValue(),
                    hashMainCharact.get(Product_in.getMainCharacteristics()[1].getLanguageCode()));

            assertEquals("Price Value", (float) Product_in.getProductPrices()[0].getPrice(),
                    (float) priceHash.get(Product_in.getProductPrices()[0].getCurrencyID()), 0.001);
            assertEquals("Manufacturer Price Value", (float) Product_in.getManufacturerPrices()[0].getPrice(),
                    (float) priceHash2.get(Product_in.getManufacturerPrices()[0].getCurrencyID()), 0.001);
            assertEquals("Deposit Price Value", (float) Product_in.getDepositPrices()[0].getPrice(),
                    (float) priceHash3.get(Product_in.getDepositPrices()[0].getCurrencyID()), 0.001);
            assertEquals("Prepayment Price Value", (float) Product_in.getPrepaymentPrices()[0].getPrice(),
                    (float) priceHash4.get(Product_in.getPrepaymentPrices()[0].getCurrencyID()), 0.001);
            assertEquals("EcoParticipation Price Value", (float) Product_in.getEcoParticipationPrices()[0].getPrice(),
                    (float) priceHash5.get(Product_in.getEcoParticipationPrices()[0].getCurrencyID()), 0.001);

            assertTrue("isAvailable", Product_in.getIsAvailable());
            assertEquals("localized AvailabilityComment", Product_in.getAvailabilityComment()[0].getValue(),
                    hashAComment.get(Product_in.getAvailabilityComment()[0].getLanguageCode()));
            assertEquals("localized AvailabilityComment", Product_in.getAvailabilityComment()[1].getValue(),
                    hashAComment.get(Product_in.getAvailabilityComment()[1].getLanguageCode()));
            assertEquals("AvailabilityDate", Product_in.getAvailabilityDate().getTime(), Product_info_out.getAvailabilityDate().getTime());
            assertEquals("delivery period", Product_in.getDeliveryPeriod(), Product_info_out.getDeliveryPeriod());

            assertTrue("shipping path 1", shippHash.containsKey("/Shops/DemoShop/ShippingMethods/Post"));
            assertTrue("shipping path 2", shippHash.containsKey("/Shops/DemoShop/ShippingMethods/Express"));
            assertEquals("/Units/gram", Product_info_out.getWeightUnit());
            assertEquals(240f,Product_info_out.getWeight(),0.0f);
        }

        assertEquals("TaxClass", Product_in.getTaxClass(), Product_info_out.getTaxClass());
        assertEquals("OrderUnit", Product_in.getOrderUnit(), Product_info_out.getOrderUnit());
        assertEquals("IsVisible", Product_in.getIsVisible(), Product_info_out.getIsVisible());
        assertEquals("class", Product_in.get_class(), Product_info_out.get_class());
        assertFalse("IsMaster", Product_info_out.getIsMaster());
    }

    public void testGetInfoMasterProduct() {
        TGetInfo_Return[] Products_info_out = serviceClient.getInfo(new String[] { path + "ho_40407" }, new String[0], new String[0]);
        assertNoError(Products_info_out[0].getError());
        assertTrue("IsMaster", Products_info_out[0].getIsMaster());
    }

    /**
     * Delete a Product and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] Products_delete_out = serviceClient.delete(new String[] { path + alias });

        // test if deletion was successful
        assertEquals("delete result set", 1, Products_delete_out.length);
        assertNoError(Products_delete_out[0].getError());
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
        assertNoError(Products_exists_out[0].getError());
        assertEquals("exists?", expected, Products_exists_out[0].getExists());
    }

    public void testFindByAlias() {
        TFind_Input parameters = new TFind_Input();
        parameters.setAlias(Product_in.getAlias());

        String[] Products_find_out = new String[] {};
        Products_find_out = serviceClient.find(parameters);

        // test if find was successful
        assertEquals("find result set", 1, Products_find_out.length);
        assertEquals("found path", path + alias, Products_find_out[0]);
    }

    public void testFindByLastUpdate() {
        TFind_Input parameters = new TFind_Input();
        parameters.setLastUpdate(new GregorianCalendar(1976, 01, 01));

        String[] Products_find_out = new String[] {};
        Products_find_out = serviceClient.find(parameters);

        // test if find was successful
        assertTrue("find result set", Products_find_out.length > 0);
        assertNotNull("found path", Products_find_out[0]);
    }

    public void testCreateDownload() {
        TCreate_Input[] Products_create_in = new TCreate_Input[] { Product_down };
        TCreate_Return[] Products_create_out = serviceClient.create(Products_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, Products_create_out.length);
        assertNoError(Products_create_out[0].getError());
        assertEquals("created?", true, Products_create_out[0].getCreated());
    }

    public void testGetInfoDownload() {
        TGetInfo_Return[] Products_info_out = serviceClient.getInfo(new String[] { path + alias }, new String[] {}, new String[] { "de",
                "en" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Products_info_out.length);
        assertNoError(Products_info_out[0].getError());

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

    public void testCreateDownloadWithUpload() {
        TCreate_Input[] Products_create_in = new TCreate_Input[] { Product_down_up };
        TCreate_Return[] Products_create_out = serviceClient.create(Products_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, Products_create_out.length);
        assertNoError(Products_create_out[0].getError());
        assertEquals("created?", true, Products_create_out[0].getCreated());
    }

    public void testGetInfoDownloadWithUpload() {
        TGetInfo_Return[] Products_info_out = serviceClient.getInfo(new String[] { path + alias }, new String[] {}, new String[] { "de",
                "en" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Products_info_out.length);
        assertNoError(Products_info_out[0].getError());
        TGetInfo_Return Product_info_out = Products_info_out[0];

        assertEquals("alias", alias, Product_info_out.getAlias());
        assertTrue("isDownloadProduct", Product_info_out.isIsDownloadProduct());
        assertEquals("MaxDownloadTime", Product_info_out.getMaxDownloadTime(), Product_down_up.getMaxDownloadTime());
        assertEquals("MaxDownloadCount", Product_info_out.getMaxDownloadCount(), Product_down_up.getMaxDownloadCount());

        TDownload getDownload = Product_info_out.getDownloadProductMaps()[0];
        TDownload refDownload = Product_down_up.getDownloadProductMaps()[0];
        assertEquals("Position", getDownload.getPosition(), refDownload.getPosition());
    }

    public void testGetInfoVariations() {
        String masterPath = path + alias;

        TGetInfo_Return[] Products_info_out = serviceClient.getInfo(new String[] {

        masterPath + "/SubProducts/" + Product_var1.getAlias(), masterPath + "/SubProducts/" + Product_var2.getAlias(), masterPath });
        TGetInfo_Return sub1 = Products_info_out[0];
        assertEquals("Sub.DefaultSubProduct", null, sub1.getDefaultSubProduct());
        assertEquals("Sub.SubProducts.count", 0, sub1.getSubProducts().length);
        TAttribute[] variationAttributes = sub1.getVariationAttributes();
        assertEquals("Sub.VariationAttributes.count", 1, variationAttributes.length);
        assertEquals("Sub.VariationAttribute[0].name", "USSize", variationAttributes[0].getName());
        assertEquals("Sub.VariationAttribute[0].value", "10", variationAttributes[0].getValue());

        TGetInfo_Return master = Products_info_out[2];
        assertEquals("Master.DefaultSubProduct", masterPath + "/SubProducts/" + Product_var1.getAlias(), master.getDefaultSubProduct());
        String[] subProducts = master.getSubProducts();
        assertEquals("Master.SubProducts count", 2, subProducts.length);
        assertEquals("Master.SubProducts[0]", masterPath + "/SubProducts/" + Product_var1.getAlias(), subProducts[0]);
        assertEquals("Master.SubProducts[1]", masterPath + "/SubProducts/" + Product_var2.getAlias(), subProducts[1]);
        variationAttributes = master.getVariationAttributes();
        assertEquals("Master.VariationAttributes.count", 1, variationAttributes.length);
        assertEquals("Master.VariationAttribute[0].name", "USSize", variationAttributes[0].getName());
        assertEquals("Master.VariationAttribute[0].value", "6,10", variationAttributes[0].getValue());
    }

    public void testCreateVariations() {
        TCreate_Input[] Products_create_in = new TCreate_Input[] { Product_var1, Product_var2 };
        TCreate_Return[] Products_create_out = serviceClient.create(Products_create_in);

        // test if creation was successful
        assertEquals("create result set", 2, Products_create_out.length);

        TCreate_Return result2 = Products_create_out[1];
        assertNoError(result2.getError());
        assertTrue("created?", result2.getCreated());
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
    public void testAll() throws IOException {
        testCreate();
        testExists(true);
        testFindByAlias();
        testFindByLastUpdate();
        getInfo(false);
        testGetInfoMasterProduct();
        testUpdate();
        getInfo(true);
        testCreateVariations();
        testGetInfoVariations();
        testDelete();
        testExists(false);

        testCreateDownload();
        testExists(true);
        testGetInfoDownload();
        testDelete();
        testExists(false);

        testCreateDownloadWithUpload();
        testExists(true);
        testGetInfoDownloadWithUpload();
        testDelete();
        testExists(false);
    }
}
