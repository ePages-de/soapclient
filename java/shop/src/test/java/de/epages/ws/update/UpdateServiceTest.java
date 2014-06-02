package de.epages.ws.update;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.product9.ProductServiceClientImpl;
import de.epages.ws.product9.model.TCreate_Input;
import de.epages.ws.product9.model.TProductPrice;
import de.epages.ws.product9.model.TShippingMethod;
import de.epages.ws.product9.model.TUpdate_Input;
import de.epages.ws.update.stub.TFindDeletes_Return;
import de.epages.ws.update.stub.TFindUpdates_Return;

public class UpdateServiceTest {
    private static final WebServiceConfiguration config = new WebServiceTestConfiguration();

    private static final ProductServiceClientImpl productService = new ProductServiceClientImpl(config);

    private static final UpdateServiceClientImpl updateService = new UpdateServiceClientImpl(config);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testFindDeletes() throws InterruptedException {
        Calendar productCreation = DateTime.now().toGregorianCalendar();

        createProduct("alias");
        deleteProduct("Products/alias");

        Thread.sleep(1);

        TFindDeletes_Return[] deletes = updateService.findDeletes(productCreation, "Product");
        assertEquals(1, deletes.length);
        assertEquals("Products/alias", deletes[0].getPath());
    }

    @Test
    public void testFindProductStockLevelUpdates() throws InterruptedException {
        Calendar productCreation = DateTime.now().toGregorianCalendar();

        createProduct("alias");
        updateProductStockLevel("Products/alias");

        Thread.sleep(1);

        TFindUpdates_Return updateSet = updateService.findUpdates(productCreation, "Product", "StockLevel");
        assertEquals(1, updateSet.getUpdates().length);
        assertBetween(productCreation.getTimeInMillis(), updateSet.getLatestUpdate().getTimeInMillis(), Calendar.getInstance()
                .getTimeInMillis());
    }

    @Test
    public void testFindProductListPriceUpdates() throws InterruptedException {
        Calendar productCreation = DateTime.now().toGregorianCalendar();

        createProduct("alias");
        updateProductPrice("Products/alias");

        Thread.sleep(1);

        TFindUpdates_Return updateSet = updateService.findUpdates(productCreation, "Product", "ListPrice");
        assertEquals(1, updateSet.getUpdates().length);
        assertBetween(productCreation.getTimeInMillis(), updateSet.getLatestUpdate().getTimeInMillis(), Calendar.getInstance()
                .getTimeInMillis());
    }

    private void createProduct(String alias) {
        TCreate_Input Product_in = new TCreate_Input();
        Product_in.setAlias(alias);
        Product_in.set_class("ProductTypes/Shoe");
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
        Product_in.setShippingMethods(new TShippingMethod[] { new TShippingMethod("ShippingMethods/Post", false),
                new TShippingMethod("ShippingMethods/Express", false), });
        Product_in.setIsAvailable(true);
        Product_in.setAvailabilityComment(new TLocalizedValue[] { new TLocalizedValue("de", "verfügbar bis update test"),
                new TLocalizedValue("en", "available until update test"), });
        Product_in.setAvailabilityDate(new GregorianCalendar(2007, 11, 25, 12, 00));

        TAttribute attr1 = new TAttribute();
        attr1.setName("Manufacturer");
        attr1.setValue("java WebService client tester");
        Product_in.setAttributes(new TAttribute[] { attr1 });

        productService.create(new TCreate_Input[] { Product_in });
    }

    private void deleteProduct(String path) {
        productService.delete(new String[] { path });
    }

    private void updateProductStockLevel(String path) {
        TUpdate_Input Product_update = new TUpdate_Input();
        Product_update.setPath(path);
        Product_update.setStockLevel(new Float(3));
        productService.update(new TUpdate_Input[] { Product_update });
    }

    private void updateProductPrice(String path) {
        TUpdate_Input Product_update = new TUpdate_Input();
        Product_update.setPath(path);
        Product_update.setProductPrices(new TProductPrice[] { new TProductPrice((float) 150, "EUR", "gross"), });
        productService.update(new TUpdate_Input[] { Product_update });
    }

    private void assertBetween(long before, long actual, long after) {
        assertTrue("before: " + before + ", actual: " + actual + ", after: " + after, before <= actual && actual <= after);
    }

}
