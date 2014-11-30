package de.epages.ws.changelog;

import static de.epages.ws.changelog.Assert.assertAfterOrSame;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.epages.ws.ShopWebServiceTestConfiguration;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.changelog.stub.TFindCreatedObject;
import de.epages.ws.changelog.stub.TFindCreatedObjects_Return;
import de.epages.ws.changelog.stub.TFindDeletedObject;
import de.epages.ws.changelog.stub.TFindDeletedObjects_Return;
import de.epages.ws.changelog.stub.TFindUpdatedObject;
import de.epages.ws.changelog.stub.TFindUpdatedObjects_Return;
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

    private static final WebServiceConfiguration config = new ShopWebServiceTestConfiguration();

    private static final ProductServiceClient productService = new ProductServiceClientImpl(config);

    private static final ChangeLogServiceClient changeLogService = new ChangeLogServiceClientImpl(config);

    // use 1 day time frame to be safe against mis-aligned system clocks
    private static final Calendar START = DateTime.now().minusDays(1).toGregorianCalendar();

    @Before
    public void before() {
        createProduct(PRODUCT_ALIAS);
    }

    @After
    public void tearDown() {
        deleteProduct(PRODUCT_ALIAS);
    }

    @Test
    public void testFindCreatedObjects() throws InterruptedException {
        Calendar latestCreate = changeLogService.findCreatedObjects(START, "Product").getLatestCreate();

        // wait 2 seconds to be safe that we're outside of the old timeframe
        Thread.sleep(2000);
        latestCreate.add(Calendar.SECOND, 2);

        TFindCreatedObjects_Return createdObjects = changeLogService.findCreatedObjects(latestCreate, "Product");
        assertFalse("product not found in createset", findProductInCreateSet(PRODUCT_ALIAS, createdObjects));

        deleteProduct(PRODUCT_ALIAS);
        createProduct(PRODUCT_ALIAS);

        createdObjects = changeLogService.findCreatedObjects(latestCreate, "Product");
        assertTrue("product found in createset", findProductInCreateSet(PRODUCT_ALIAS, createdObjects));

    }

    @Test
    public void testFindDeletedObjects() throws InterruptedException {
        Calendar latestDelete = changeLogService.findDeletedObjects(START, "Product").getLatestDelete();
        TFindDeletedObjects_Return deleteSet = changeLogService.findDeletedObjects(latestDelete, "Product");
        int existingDeletes = deleteSet.getDeletedObjects().length;

        String productToDelete = PRODUCT_ALIAS + "_del";
		createProduct(productToDelete);
        deleteProduct(productToDelete);
        Thread.sleep(1000);
        deleteSet = changeLogService.findDeletedObjects(latestDelete, "Product");

        assertEquals(existingDeletes + 1, deleteSet.getDeletedObjects().length);
        assertAfterOrSame(latestDelete, deleteSet.getLatestDelete());
        StringBuilder allPaths = new StringBuilder();
        for (int i = 0; i < deleteSet.getDeletedObjects().length; i++) {
        	TFindDeletedObject tFindDeletedObject = deleteSet.getDeletedObjects()[i];
        	allPaths.append(tFindDeletedObject.getPath() + ",");
		}
        assertThat("Expecting absolute path", allPaths.toString(), containsString("/Products/" + productToDelete));
    }

    @Test
    public void testFindProductUpdates() {
        TFindUpdatedObjects_Return listPriceUpdateSet = changeLogService.findUpdatedObjects(START, "Product", "ListPrice");
        assertTrue("product found in ListPrice update set", findProductInUpdateSet(PRODUCT_ALIAS, listPriceUpdateSet));

        TFindUpdatedObjects_Return stockLevelUpdateSet = changeLogService.findUpdatedObjects(listPriceUpdateSet.getLatestUpdate(), "Product", "StockLevel");
        assertFalse("product not found in StockLevel update set yet", findProductInUpdateSet(PRODUCT_ALIAS, stockLevelUpdateSet));

        updateProductStockLevel(PRODUCT_ALIAS);
        TFindUpdatedObjects_Return stockLevelUpdateSet2 = changeLogService.findUpdatedObjects(listPriceUpdateSet.getLatestUpdate(), "Product", "ListPrice");
        assertTrue("product found in StockLevel update set", findProductInUpdateSet(PRODUCT_ALIAS, stockLevelUpdateSet2));

        assertAfterOrSame(listPriceUpdateSet.getLatestUpdate(), stockLevelUpdateSet2.getLatestUpdate());
    }

    private boolean findProductInUpdateSet(String alias, TFindUpdatedObjects_Return updateSet) {
        boolean found = false;
        for (TFindUpdatedObject element : updateSet.getUpdatedObjects()) {
            if (element.getPath().endsWith("/Products/" + alias)) {
                found = true;
            }
        }
        return found;
    }

    private boolean findProductInCreateSet(String alias, TFindCreatedObjects_Return createSet) {
        boolean found = false;
        for (TFindCreatedObject element : createSet.getCreatedObjects()) {
            if (element.getPath().endsWith("/Products/" + alias)) {
                found = true;
            }
        }
        return found;
    }

    private void createProduct(String alias) {
        if (exists(alias)) {
            return;
        }
        TCreate_Input Product_in = new TCreate_Input();
        Product_in.setAlias(alias);
        Product_in.setTaxClass("/TaxMatrixGermany/normal");
        // do not set stocklevel yet.
        // Product_in.setStockLevel(140f);
        Product_in.setProductPrices(new TProductPrice[] { new TProductPrice(123f, "GBP", "gross"), });
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

    private void updateProductStockLevel(String alias) {
        TUpdate_Input Product_update = new TUpdate_Input();
        Product_update.setPath("Products/" + alias);
        Product_update.setStockLevel(3f);
        TUpdate_Return[] updated = productService.update(new TUpdate_Input[] { Product_update });
        assertTrue(updated[0].getUpdated());
    }

}
