package de.epages.ws.update;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.joda.time.DateTime;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.product9.ProductServiceClientImpl;
import de.epages.ws.product9.model.TCreate_Input;
import de.epages.ws.product9.model.TProductPrice;
import de.epages.ws.product9.model.TUpdate_Input;
import de.epages.ws.update.stub.TFindDeletes_Return;
import de.epages.ws.update.stub.TFindUpdates_Return;

public class UpdateServiceTest {
    private static final WebServiceConfiguration config = new WebServiceTestConfiguration();

    private static final ProductServiceClientImpl productService = new ProductServiceClientImpl(config);

    private static final UpdateServiceClientImpl updateService = new UpdateServiceClientImpl(config);

    private Calendar productCreation;

    @Rule
    public ExternalResource res = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            productCreation = DateTime.now().toGregorianCalendar();
            Thread.sleep(1000);
            createProduct("javatest-sync");
        }

        @Override
        protected void after() {
            deleteProduct("javatest-sync");
        }
    };

    @Test
    public void testFindDeletes() throws InterruptedException {
        deleteProduct("javatest-sync");
        Thread.sleep(200);

        TFindDeletes_Return[] deletes = updateService.findDeletes(productCreation, "Product");
        assertBetween(1, deletes.length, 3);
        assertEquals("Products/javatest-sync", deletes[0].getPath());
    }

    @Test
    public void testFindProductStockLevelUpdates() throws InterruptedException {
        updateProductStockLevel("javatest-sync");
        Thread.sleep(200);

        TFindUpdates_Return updateSet = updateService.findUpdates(productCreation, "Product", "StockLevel");
        assertEquals(1, updateSet.getUpdates().length);
        assertBetween(productCreation.getTimeInMillis(), updateSet.getLatestUpdate().getTimeInMillis(), Calendar.getInstance()
                .getTimeInMillis());
    }

    @Test
    public void testFindProductListPriceUpdates() throws InterruptedException {
        updateProductPrice("Products/javatest-sync");
        Thread.sleep(200);

        TFindUpdates_Return updateSet = updateService.findUpdates(productCreation, "Product", "ListPrice");
        assertEquals(1, updateSet.getUpdates().length);
        assertBetween(productCreation.getTimeInMillis(), updateSet.getLatestUpdate().getTimeInMillis(), Calendar.getInstance()
                .getTimeInMillis());
    }

    private void createProduct(String alias) {
        TCreate_Input Product_in = new TCreate_Input();
        Product_in.setAlias(alias);
        Product_in.setTaxClass("/TaxMatrixGermany/normal");
        Product_in.setStockLevel(140f);
        Product_in.setProductPrices(new TProductPrice[] { new TProductPrice(123f, "EUR", "gross"), });

        productService.create(new TCreate_Input[] { Product_in });
    }

    private void deleteProduct(String alias) {
        productService.delete(new String[] { "Products/" + alias });
    }

    private void updateProductStockLevel(String alias) {
        TUpdate_Input Product_update = new TUpdate_Input();
        Product_update.setPath("Products/" + alias);
        Product_update.setStockLevel(3f);
        productService.update(new TUpdate_Input[] { Product_update });
    }

    private void updateProductPrice(String path) {
        TUpdate_Input Product_update = new TUpdate_Input();
        Product_update.setPath(path);
        Product_update.setProductPrices(new TProductPrice[] { new TProductPrice(150f, "EUR", "gross"), });
        productService.update(new TUpdate_Input[] { Product_update });
    }

    private void assertBetween(long before, long actual, long after) {
        assertTrue("before: " + before + ", actual: " + actual + ", after: " + after, before <= actual && actual <= after);
    }

}
