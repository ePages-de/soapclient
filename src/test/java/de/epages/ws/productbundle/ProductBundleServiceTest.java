package de.epages.ws.productbundle;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.rmi.RemoteException;

import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.productbundle.model.TBundledProduct;
import de.epages.ws.productbundle.model.TBundledProductPath;
import de.epages.ws.productbundle.model.TCreate_Input;
import de.epages.ws.productbundle.model.TCreate_Return;
import de.epages.ws.productbundle.model.TDelete_Input;
import de.epages.ws.productbundle.model.TDelete_Return;
import de.epages.ws.productbundle.model.TExists_Input;
import de.epages.ws.productbundle.model.TExists_Return;
import de.epages.ws.productbundle.model.TGetInfo_Return;

public class ProductBundleServiceTest {

    private static final ProductBundleServiceClientImpl productBundleService = new ProductBundleServiceClientImpl(
            new WebServiceTestConfiguration());

    private final String product = "Products/cg_0100504001";
    private final String bundled_product = "Products/de_3203104010"; // Deuter
                                                                     // Kangaroo
    private final String bundled_product2 = "Products/eg_1000111010"; // Eureka
                                                                      // El
                                                                      // Capitan
                                                                      // IV

    /**
     * insert a cross selling and check if the creation was successful
     */
    public void testCreate() throws RemoteException {
        // create a ProductBundle
        TBundledProduct bundledProduct = new TBundledProduct(
        // bundled_product, new String("10"),
        // new BigInteger("3"), null
        );
        bundledProduct.setPath(bundled_product);
        bundledProduct.setPosition(new BigInteger("10"));
        bundledProduct.setQuantity(3);
        TBundledProduct bundledProduct2 = new TBundledProduct(
        // bundled_product2, "20",
        // new BigInteger("1"), null
        );
        bundledProduct2.setPath(bundled_product2);
        bundledProduct2.setPosition(new BigInteger("20"));
        bundledProduct2.setQuantity(1);

        TBundledProduct[] bundledProducts = new TBundledProduct[] { bundledProduct, bundledProduct2 };
        TCreate_Input productBundle = new TCreate_Input(product, bundledProducts);
        TCreate_Input[] productBundles = new TCreate_Input[] { productBundle };
        TCreate_Return[] ProductBundles_out = productBundleService.create(productBundles);

        // test if creation was successful
        assertEquals("create result count", 1, ProductBundles_out.length);
    }

    /**
     * delete a product bundle and check if the deletion was successful
     */
    public void testDelete() throws RemoteException {
        TBundledProductPath bundledProductPath = new TBundledProductPath(bundled_product2);
        TBundledProductPath[] bundledProductPaths = new TBundledProductPath[] { bundledProductPath };
        TDelete_Input productBundle = new TDelete_Input(product, bundledProductPaths);
        TDelete_Input[] productBundles = new TDelete_Input[] { productBundle };
        TDelete_Return[] ProductBundles_out = productBundleService.delete(productBundles);

        // test if deletion was successful
        assertEquals("delete result count", 1, ProductBundles_out.length);
        TDelete_Return ProductBundle_out = ProductBundles_out[0];
        assertNoError(ProductBundle_out.getError());
        assertNull("delete: no error", ProductBundle_out.getError());
        assertEquals("Product path", product, ProductBundle_out.getProduct());
        assertTrue("deleted?", ProductBundle_out.getDeleted());
    }

    /**
     * test exists method
     *
     * @param expected
     *            if false, test is successful if the ProductBundle does NOT
     *            exists
     */
    public void testExists(boolean expected) throws RemoteException {
        TExists_Input productBundle = new TExists_Input(product, bundled_product2);
        TExists_Input[] productBundles = new TExists_Input[] { productBundle };
        TExists_Return[] ProductBundles_out = productBundleService.exists(productBundles);
        TExists_Return ProductBundle_out = ProductBundles_out[0];

        assertNoError(ProductBundle_out.getError());

        // test if exists check was successful
        assertNull("exists: no error", ProductBundle_out.getError());
        assertEquals("Product path", product, ProductBundle_out.getProduct());
    }

    /**
     * test getInfo method
     */
    public void testGetInfo() throws RemoteException {
        String[] productBundles = new String[] { product };
        TGetInfo_Return[] ProductBundles_out = productBundleService.getInfo(productBundles);

        // test if get call was successful
        assertEquals("getInfo result count", 1, ProductBundles_out.length);
        TGetInfo_Return ProductBundle_out = ProductBundles_out[0];
        assertNoError(ProductBundle_out.getError());
        assertNull("getInfo: no error", ProductBundle_out.getError());
        assertEquals("Product path", product, ProductBundle_out.getProduct());
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() throws RemoteException {
        testCreate();
        testExists(true);
        testGetInfo();
        testDelete();
        testExists(false);
    }
}
