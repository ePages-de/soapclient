package de.epages.ws.crossselling;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.crossselling.model.TDeleteCrossSelling_Input;
import de.epages.ws.crossselling.model.TDeleteCrossSelling_Return;
import de.epages.ws.crossselling.model.TExistsCrossSelling_Input;
import de.epages.ws.crossselling.model.TExistsCrossSelling_Return;
import de.epages.ws.crossselling.model.TGetCrossSelling_Input;
import de.epages.ws.crossselling.model.TGetCrossSelling_Return;
import de.epages.ws.crossselling.model.TInsertCrossSelling_Input;
import de.epages.ws.crossselling.model.TInsertCrossSelling_Return;

public class CrossSellingServiceTest {

    private static final CrossSellingServiceClientImpl crossSellingService = new CrossSellingServiceClientImpl(
            new WebServiceTestConfiguration());

    private final String product = "Products/de_3203104010";
    private final String target_product = "Products/de_3206199010";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // remove all assigned cross selling products
        TDeleteCrossSelling_Input CrossSelling_in = new TDeleteCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct("*");
        CrossSelling_in.setType("CrossSelling");
        TDeleteCrossSelling_Input[] CrossSellings = new TDeleteCrossSelling_Input[] { CrossSelling_in };
        TDeleteCrossSelling_Return[] CrossSellings_out = crossSellingService.delete(CrossSellings);

        for (TDeleteCrossSelling_Return result : CrossSellings_out) {
            assertNoError(result.getError());
        }

        CrossSelling_in = new TDeleteCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct("*");
        CrossSelling_in.setType("Accessory");
        CrossSellings = new TDeleteCrossSelling_Input[] { CrossSelling_in };
        CrossSellings_out = crossSellingService.delete(CrossSellings);

        for (TDeleteCrossSelling_Return result : CrossSellings_out) {
            assertNoError(result.getError());
        }

        CrossSelling_in = new TDeleteCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct("*");
        CrossSelling_in.setType("ProductComparison");
        CrossSellings = new TDeleteCrossSelling_Input[] { CrossSelling_in };
        CrossSellings_out = crossSellingService.delete(CrossSellings);

        for (TDeleteCrossSelling_Return result : CrossSellings_out) {
            assertNoError(result.getError());
        }
    }

    /**
     * insert a cross selling and check if the creation was successful
     */
    public void testInsert() {
        // insert a CrossSelling, a ProductComparison and an Accessory product
        TInsertCrossSelling_Input crossSelling = new TInsertCrossSelling_Input();
        crossSelling.setProduct(product);
        crossSelling.setTargetProduct(target_product);
        crossSelling.setType("CrossSelling");
        crossSelling.setPosition(new BigInteger("10"));

        TInsertCrossSelling_Input productComparison = new TInsertCrossSelling_Input();
        productComparison.setProduct(product);
        productComparison.setTargetProduct(target_product);
        productComparison.setType("ProductComparison");
        productComparison.setPosition(new BigInteger("10"));

        TInsertCrossSelling_Input accessory = new TInsertCrossSelling_Input();
        accessory.setProduct(product);
        accessory.setTargetProduct(target_product);
        accessory.setType("Accessory");
        accessory.setPosition(new BigInteger("10"));

        TInsertCrossSelling_Input[] CrossSellings = new TInsertCrossSelling_Input[] { crossSelling, productComparison, accessory, };

        TInsertCrossSelling_Return[] CrossSellings_out = crossSellingService.insert(CrossSellings);

        // test if creation was successful
        TInsertCrossSelling_Return CrossSelling_out = CrossSellings_out[0];
        assertEquals("insert result count", 3, CrossSellings_out.length);
        assertNoError(CrossSelling_out.getError());

        assertNull("insert: no error", CrossSelling_out.getError());
        assertTrue("assigned?", CrossSelling_out.getInserted());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("CrossSelling type", "CrossSelling", CrossSelling_out.getType());
    }

    /**
     * delete a cross selling and check if the deletion was successful
     */
    public void testDelete() {

        TDeleteCrossSelling_Input crossSelling = new TDeleteCrossSelling_Input();
        crossSelling.setProduct(product);
        crossSelling.setTargetProduct(target_product);
        crossSelling.setType("CrossSelling");

        TDeleteCrossSelling_Input productComparison = new TDeleteCrossSelling_Input();
        productComparison.setProduct(product);
        productComparison.setTargetProduct(target_product);
        productComparison.setType("ProductComparison");

        TDeleteCrossSelling_Input accessory = new TDeleteCrossSelling_Input();
        accessory.setProduct(product);
        accessory.setTargetProduct(target_product);
        accessory.setType("Accessory");

        TDeleteCrossSelling_Input[] CrossSellings = new TDeleteCrossSelling_Input[] { crossSelling, productComparison, accessory, };

        TDeleteCrossSelling_Return[] CrossSellings_out = crossSellingService.delete(CrossSellings);

        // test if deletion was successful
        assertEquals("delete result count", 3, CrossSellings_out.length);
        TDeleteCrossSelling_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertNull("delete: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertTrue("deleted?", CrossSelling_out.getDeleted());
    }

    /**
     * test exists method
     *
     * @param expected
     *            if false, test is successful if the CrossSelling does NOT
     *            exists
     */
    public void testExists(boolean expected) {

        // all cross selling types (Type=null)
        TExistsCrossSelling_Input CrossSelling_in = new TExistsCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct(target_product);
        TExistsCrossSelling_Input[] CrossSellings = new TExistsCrossSelling_Input[] { CrossSelling_in };

        TExistsCrossSelling_Return[] CrossSellings_out = crossSellingService.exists(CrossSellings);

        // test if exists check was successful
        assertEquals("exists result count (only CrossSelling)", 1, CrossSellings_out.length);
        TExistsCrossSelling_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());

        assertNull("exists: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("exists?", expected, CrossSelling_out.getExists());

        // only Accessories
        CrossSelling_in = new TExistsCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setTargetProduct(target_product);
        CrossSelling_in.setType("Accessory");
        CrossSellings = new TExistsCrossSelling_Input[] { CrossSelling_in };

        CrossSellings_out = crossSellingService.exists(CrossSellings);

        assertEquals("exists result count (only Accessories)", 1, CrossSellings_out.length);
        assertNoError(CrossSelling_out.getError());
        assertNull("exists: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("exists?", expected, CrossSelling_out.getExists());
    }

    /**
     * test get method
     */
    public void testGet() {
        TGetCrossSelling_Input CrossSelling_in = new TGetCrossSelling_Input();
        CrossSelling_in.setProduct(product);
        CrossSelling_in.setType("CrossSelling");
        TGetCrossSelling_Input[] CrossSellings = new TGetCrossSelling_Input[] { CrossSelling_in };

        TGetCrossSelling_Return[] CrossSellings_out = crossSellingService.get(CrossSellings);

        // test if exists check was successful
        assertEquals("get result count", 1, CrossSellings_out.length);
        TGetCrossSelling_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertNull("get: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product path", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("Position", new BigInteger("10"), CrossSelling_out.getPosition());
        assertEquals("Type", "CrossSelling", CrossSelling_out.getType());

        // Type: ProductComparison
        CrossSelling_in.setType("ProductComparison");
        CrossSellings_out = crossSellingService.get(CrossSellings);

        assertEquals("get result count", 1, CrossSellings_out.length);
        CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());

        assertNull("get: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product path", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("Position", new BigInteger("10"), CrossSelling_out.getPosition());
        assertEquals("Type", "ProductComparison", CrossSelling_out.getType());
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() {
        testInsert();
        testExists(true);
        testGet();
        testDelete();
        testExists(false);
    }
}
