package de.epages.ws.changelog;

import static de.epages.ws.changelog.Assert.assertAfterOrSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.changelog.stub.TFindDeletedObjects_Return;
import de.epages.ws.changelog.stub.TFindUpdatedObjects_Return;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.product12.ProductServiceClient;
import de.epages.ws.product12.ProductServiceClientImpl;
import de.epages.ws.product12.model.TCreate_Input;
import de.epages.ws.product12.model.TCreate_Return;
import de.epages.ws.product12.model.TDelete_Return;
import de.epages.ws.product12.model.TExists_Return;
import de.epages.ws.product12.model.TProductPrice;
import de.epages.ws.product12.model.TUpdate_Input;
import de.epages.ws.product12.model.TUpdate_Return;

public class ChangeLogServiceTest {

    private static final String PRODUCT_ALIAS = "javatest-sync-product";

    private static final WebServiceConfiguration config = new WebServiceTestConfiguration();

    private static final ProductServiceClient productService = new ProductServiceClientImpl(config);

    private static final ChangeLogServiceClient changeLogService = new ChangeLogServiceClientImpl(config);

    private static final GregorianCalendar LAST_YEAR = DateTime.now().minusYears(1).toGregorianCalendar();

    @Before
    public void before() {
        createProduct(PRODUCT_ALIAS);
    }

    @After
    public void tearDown() {
        deleteProduct(PRODUCT_ALIAS);
    }

    @Test
    public void testFindDeletedObjects() {
        Calendar latestDelete = changeLogService.findDeletedObjects(LAST_YEAR, "Product").getLatestDelete();
        latestDelete = new DateTime(latestDelete.getTimeInMillis()).plusMillis(1000).toGregorianCalendar();
        TFindDeletedObjects_Return deleteSet = changeLogService.findDeletedObjects(latestDelete, "Product");
        int existingDeletes = deleteSet.getDeletedObjects().length;

        deleteProduct(PRODUCT_ALIAS);

        deleteSet = changeLogService.findDeletedObjects(latestDelete, "Product");

        assertEquals(existingDeletes + 1, deleteSet.getDeletedObjects().length);
        assertAfterOrSame(latestDelete, deleteSet.getLatestDelete());
        assertEquals("Products/" + PRODUCT_ALIAS, deleteSet.getDeletedObjects()[0].getPath());
    }

    @Test
    public void testFindProductContentUpdates() throws InterruptedException {
        Calendar latestUpdate = changeLogService.findUpdatedObjects(LAST_YEAR, "Product", "Content").getLatestUpdate();

        TFindUpdatedObjects_Return updateSet = changeLogService.findUpdatedObjects(latestUpdate, "Product", "Content");
        int existingUpdates = updateSet.getUpdatedObjects().length;

        Thread.sleep(1000);
        updateProductContent(PRODUCT_ALIAS);

        updateSet = changeLogService.findUpdatedObjects(latestUpdate, "Product", "Content");
        assertEquals(existingUpdates + 1, updateSet.getUpdatedObjects().length);
        assertAfterOrSame(latestUpdate, updateSet.getLatestUpdate());
        assertTrue("Actual: " + updateSet.getUpdatedObjects()[0].getPath(),
                updateSet.getUpdatedObjects()[0].getPath().endsWith("/Products/" + PRODUCT_ALIAS));
    }

    @Test
    public void testFindProductStockLevelUpdates() throws InterruptedException {
        Calendar latestUpdate = changeLogService.findUpdatedObjects(LAST_YEAR, "Product", "StockLevel").getLatestUpdate();

        TFindUpdatedObjects_Return updateSet = changeLogService.findUpdatedObjects(latestUpdate, "Product", "StockLevel");
        int existingUpdates = updateSet.getUpdatedObjects().length;

        Thread.sleep(1000);
        updateProductStockLevel(PRODUCT_ALIAS);

        updateSet = changeLogService.findUpdatedObjects(latestUpdate, "Product", "StockLevel");
        assertEquals(existingUpdates + 1, updateSet.getUpdatedObjects().length);
        assertAfterOrSame(latestUpdate, updateSet.getLatestUpdate());
        assertTrue("Actual: " + updateSet.getUpdatedObjects()[0].getPath(),
                updateSet.getUpdatedObjects()[0].getPath().endsWith("/Products/" + PRODUCT_ALIAS));
    }

    @Test
    public void testFindProductListPriceUpdates() throws InterruptedException {
        Calendar latestUpdate = changeLogService.findUpdatedObjects(LAST_YEAR, "Product", "ListPrice").getLatestUpdate();

        TFindUpdatedObjects_Return updateSet = changeLogService.findUpdatedObjects(latestUpdate, "Product", "ListPrice");
        int existingUpdates = updateSet.getUpdatedObjects().length;

        Thread.sleep(1000);
        updateProductPrice(PRODUCT_ALIAS);

        updateSet = changeLogService.findUpdatedObjects(latestUpdate, "Product", "ListPrice");
        assertEquals(existingUpdates + 1, updateSet.getUpdatedObjects().length);
        assertAfterOrSame(latestUpdate, updateSet.getLatestUpdate());
        assertTrue("Actual: " + updateSet.getUpdatedObjects()[0].getPath(),
                updateSet.getUpdatedObjects()[0].getPath().endsWith("/Products/" + PRODUCT_ALIAS));
    }

    private void createProduct(String alias) {
        if (exists(alias)) {
            return;
        }
        TCreate_Input Product_in = new TCreate_Input();
        Product_in.setAlias(alias);
        Product_in.setTaxClass("/TaxMatrixGermany/normal");
        Product_in.setStockLevel(140f);
        Product_in.setProductPrices(new TProductPrice[] { new TProductPrice(123f, "EUR", "gross"), });
        TCreate_Return[] created = productService.create(new TCreate_Input[] { Product_in });
        assertTrue(created[0].getCreated());
    }

    private void deleteProduct(String alias) {
        if (!exists(alias)) {
            return;
        }
        TDelete_Return[] deleted = productService.delete(new String[] { "Products/" + alias });
        assertTrue(deleted[0].getDeleted());
    }

    private boolean exists(String alias) {
        TExists_Return[] Products_exists_out = productService.exists(new String[] { "Products/" + alias });
        return Products_exists_out[0].getExists();
    }

    private void updateProductContent(String alias) {
        TUpdate_Input Product_update = new TUpdate_Input();
        Product_update.setPath("Products/" + alias);
        Product_update.setDescription(new TLocalizedValue[] { new TLocalizedValue("de", "new description") });
        TUpdate_Return[] updated = productService.update(new TUpdate_Input[] { Product_update });
        assertTrue(updated[0].getUpdated());
    }

    private void updateProductStockLevel(String alias) {
        TUpdate_Input Product_update = new TUpdate_Input();
        Product_update.setPath("Products/" + alias);
        Product_update.setStockLevel(3f);
        TUpdate_Return[] updated = productService.update(new TUpdate_Input[] { Product_update });
        assertTrue(updated[0].getUpdated());
    }

    private void updateProductPrice(String alias) {
        TUpdate_Input Product_update = new TUpdate_Input();
        Product_update.setPath("Products/" + alias);
        Product_update.setProductPrices(new TProductPrice[] { new TProductPrice(150f, "EUR", "gross"), });
        TUpdate_Return[] updated = productService.update(new TUpdate_Input[] { Product_update });
        assertTrue(updated[0].getUpdated());
    }

}
