package de.epages.ws.crossselling2;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigInteger;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.ShopWebServiceTestConfiguration;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.crossselling2.model.TCreate_Input;
import de.epages.ws.crossselling2.model.TCreate_Return;
import de.epages.ws.crossselling2.model.TDelete_Input;
import de.epages.ws.crossselling2.model.TDelete_Return;
import de.epages.ws.crossselling2.model.TExists_Input;
import de.epages.ws.crossselling2.model.TExists_Return;
import de.epages.ws.crossselling2.model.TGetInfo_Input;
import de.epages.ws.crossselling2.model.TGetInfo_Return;
import de.epages.ws.crossselling2.model.TUpdate_Input;
import de.epages.ws.crossselling2.model.TUpdate_Return;

public class CrossSellingServiceTest {
    private static final CrossSellingServiceClientImpl crossSellingService = new CrossSellingServiceClientImpl(
            new ShopWebServiceTestConfiguration());

    private final String product = "Products/de_3203104010"; // Deuter Kangaroo
    private final String target_product = "Products/de_3206199010"; // Deuter
                                                                    // Schmusebär
    private final String target_product2 = "Products/de_3201212002"; // Deuter
                                                                     // Hydro
                                                                     // 2.0
    private final String target_product3 = "Products/eg_1000111010"; // Eureka
                                                                     // El
                                                                     // Capitan
                                                                     // IV

    private final TLocalizedValue[] Comment1 = new TLocalizedValue[] { new TLocalizedValue("de", "java CrossSellingService Test"),
            new TLocalizedValue("en", "java CrossSellingService test"), };
    private final TLocalizedValue[] Comment2 = new TLocalizedValue[] {
            new TLocalizedValue("de", "java CrossSellingService Test Aktualisierung"),
            new TLocalizedValue("en", "java CrossSellingService test update"), };
    private final TLocalizedValue[] Comment3 = new TLocalizedValue[] { new TLocalizedValue("de", ""),
            new TLocalizedValue("en", "java CrossSellingService test delete comment (de)"), };

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // remove all assigned cross selling products
        TDelete_Input CrossSelling_in = new TDelete_Input(product, "*", "*");
        TDelete_Input[] CrossSellings = new TDelete_Input[] { CrossSelling_in };
        TDelete_Return[] CrossSellings_out = crossSellingService.delete(CrossSellings);
        for (TDelete_Return result : CrossSellings_out) {
            assertNoError(result.getError());
        }
    }

    /**
     * insert a cross selling and check if the creation was successful
     */
    public void testCreate() {
        // insert a CrossSelling, a ProductComparison and an Accessory product
        TCreate_Input crossSelling = new TCreate_Input(product, target_product, "CrossSelling", new BigInteger("10"), Comment1);
        TCreate_Input productComparison = new TCreate_Input(product, target_product2, "ProductComparison", new BigInteger("10"), null);
        TCreate_Input accessory = new TCreate_Input(product, target_product3, "Accessory", new BigInteger("10"), null);
        TCreate_Input accessory2 = new TCreate_Input(product, target_product, "Accessory", new BigInteger("20"), null);
        TCreate_Input[] CrossSellings = new TCreate_Input[] { crossSelling, productComparison, accessory, accessory2, };
        TCreate_Return[] CrossSellings_out = crossSellingService.create(CrossSellings);

        // test if creation was successful
        assertEquals("create result count", 4, CrossSellings_out.length);

        // check results
        for (TCreate_Return CrossSelling_out : CrossSellings_out) {
            assertNoError(CrossSelling_out.getError());
            assertTrue("created?", CrossSelling_out.isCreated());
            assertEquals("Product path", product, CrossSelling_out.getProduct());
            if (CrossSelling_out.getType().equals("CrossSelling")) {
                assertEquals("CrossSelling TargetProduct", target_product, CrossSelling_out.getTargetProduct());
            } else if (CrossSelling_out.getType().equals("ProductComparison")) {
                assertEquals("CrossSelling TargetProduct", target_product2, CrossSelling_out.getTargetProduct());
            } else if (CrossSelling_out.getType().equals("Accessory")) {
                assertTrue("CrossSelling TargetProduct: " + CrossSelling_out.getTargetProduct(), CrossSelling_out.getTargetProduct()
                        .equals(target_product3) || CrossSelling_out.getTargetProduct().equals(target_product));
            } else {
                fail("unknown cross selling type:\n" + CrossSelling_out.getType());
            }
        }

    }

    /**
     * update a cross selling and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Input crossSelling = new TUpdate_Input(product, target_product, "CrossSelling", new BigInteger("20"), Comment2);
        TUpdate_Input[] CrossSellings = new TUpdate_Input[] { crossSelling };
        TUpdate_Return[] CrossSellings_out = crossSellingService.update(CrossSellings);

        // test if update was successful
        assertEquals("update result count", 1, CrossSellings_out.length);
        TUpdate_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertTrue("updated?", CrossSelling_out.isUpdated());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("CrossSelling type", "CrossSelling", CrossSelling_out.getType());
    }

    /**
     * update a cross selling with an empty comment
     */
    public void testUpdate2() {
        TUpdate_Input crossSelling = new TUpdate_Input(product, target_product, "CrossSelling", new BigInteger("20"), Comment3);
        TUpdate_Input[] CrossSellings = new TUpdate_Input[] { crossSelling };
        TUpdate_Return[] CrossSellings_out = crossSellingService.update(CrossSellings);

        // test if update was successful
        assertEquals("update result count", 1, CrossSellings_out.length);
        TUpdate_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertTrue("updated?", CrossSelling_out.isUpdated());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("CrossSelling type", "CrossSelling", CrossSelling_out.getType());
    }

    /**
     * delete a cross selling and check if the deletion was successful
     */
    public void testDelete() {
        TDelete_Input crossSelling = new TDelete_Input(product, target_product, "CrossSelling");
        TDelete_Input productComparison = new TDelete_Input(product, target_product2, "ProductComparison");
        TDelete_Input accessory = new TDelete_Input(product, target_product3, "Accessory");
        TDelete_Input accessory2 = new TDelete_Input(product, target_product, "Accessory");
        TDelete_Input[] CrossSellings = new TDelete_Input[] { crossSelling, productComparison, accessory, accessory2, };
        TDelete_Return[] CrossSellings_out = crossSellingService.delete(CrossSellings);

        // test if deletion was successful
        assertEquals("delete result count", 4, CrossSellings_out.length);
        TDelete_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertNoError("delete: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertTrue("deleted?", CrossSelling_out.isDeleted());
    }

    /**
     * test exists method
     *
     * @param expected
     *            if false, test is successful if the CrossSelling does NOT
     *            exists
     */
    public void testExists(boolean expected) {
        // only CrossSelling type
        TExists_Input CrossSelling_in = new TExists_Input(product, target_product, "CrossSelling");
        TExists_Input[] CrossSellings = new TExists_Input[] { CrossSelling_in };
        TExists_Return[] CrossSellings_out = crossSellingService.exists(CrossSellings);
        assertEquals("exists result count (only CrossSelling)", 1, CrossSellings_out.length);
        TExists_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());

        // test if exists check was successful
        assertNoError("exists: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("exists?", expected, CrossSelling_out.isExists());

        // only Accessories
        CrossSelling_in.setType("Accessory");
        CrossSellings_out = crossSellingService.exists(CrossSellings);
        assertEquals("exists result count (only Accessories)", 1, CrossSellings_out.length);
        assertNoError(CrossSelling_out.getError());

        // test if exists check was successful
        assertNoError("exists: no error", CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("exists?", expected, CrossSelling_out.isExists());
    }

    /**
     * test getInfo method
     */
    public void testGetInfo() {

        TGetInfo_Input CrossSelling_in = new TGetInfo_Input(product, "CrossSelling");
        TGetInfo_Input[] CrossSellings = new TGetInfo_Input[] { CrossSelling_in };
        TGetInfo_Return[] CrossSellings_out = crossSellingService.getInfo(CrossSellings);

        // test if get call was successful
        assertEquals("getInfo result count", 1, CrossSellings_out.length);
        TGetInfo_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product path", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("Position", new BigInteger("10"), CrossSelling_out.getPosition());
        assertEquals("Type", "CrossSelling", CrossSelling_out.getType());

        // compare Comment_out with Comment1
        TLocalizedValue[] Comment_out = CrossSelling_out.getComment();
        assertEquals("Comment number of languages", Comment1.length, Comment_out.length);
        HashMap<String, String> hComment = new HashMap<String, String>();
        for (int i = 0; i < Comment_out.length; i++)
            hComment.put(Comment_out[i].getLanguageCode(), Comment_out[i].getValue());
        for (int i = 0; i < Comment1.length; i++) {
            assertEquals("inital Comment " + Comment1[i].getLanguageCode(), Comment1[i].getValue(),
                    hComment.get(Comment1[i].getLanguageCode()));
        }

        // Type: ProductComparison
        CrossSelling_in.setType("ProductComparison");
        CrossSellings_out = crossSellingService.getInfo(CrossSellings);

        // test if get call was successful
        assertEquals("getInfo result count", 1, CrossSellings_out.length);
        CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Target product path", target_product2, CrossSelling_out.getTargetProduct());
        assertEquals("Position", new BigInteger("10"), CrossSelling_out.getPosition());
        assertEquals("Type", "ProductComparison", CrossSelling_out.getType());
    }

    /**
     * test getInfo method after update
     */
    public void testGetInfo2() {
        TGetInfo_Input CrossSelling_in = new TGetInfo_Input(product, "CrossSelling");
        TGetInfo_Input[] CrossSellings = new TGetInfo_Input[] { CrossSelling_in };
        TGetInfo_Return[] CrossSellings_out = crossSellingService.getInfo(CrossSellings);

        // test if get call was successful
        assertEquals("getInfo result count", 1, CrossSellings_out.length);
        TGetInfo_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Type", "CrossSelling", CrossSelling_out.getType());
        assertEquals("Target product path", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("Position", new BigInteger("20"), CrossSelling_out.getPosition());

        // compare Comment_out with Comment2
        TLocalizedValue[] Comment_out = CrossSelling_out.getComment();
        assertEquals("Comment number of languages", Comment2.length, Comment_out.length);
        HashMap<String, String> hComment = new HashMap<String, String>();
        for (int i = 0; i < Comment_out.length; i++)
            hComment.put(Comment_out[i].getLanguageCode(), Comment_out[i].getValue());
        for (int i = 0; i < Comment2.length; i++) {
            assertEquals("updated Comment " + Comment2[i].getLanguageCode(), Comment2[i].getValue(),
                    hComment.get(Comment2[i].getLanguageCode()));
        }
    }

    /**
     * test getInfo method after update with an empty comment
     */
    public void testGetInfo3() {
        TGetInfo_Input CrossSelling_in = new TGetInfo_Input(product, "CrossSelling");
        TGetInfo_Input[] CrossSellings = new TGetInfo_Input[] { CrossSelling_in };
        TGetInfo_Return[] CrossSellings_out = crossSellingService.getInfo(CrossSellings);

        // test if get call was successful
        assertEquals("getInfo result count", 1, CrossSellings_out.length);
        TGetInfo_Return CrossSelling_out = CrossSellings_out[0];
        assertNoError(CrossSelling_out.getError());
        assertEquals("Product path", product, CrossSelling_out.getProduct());
        assertEquals("Type", "CrossSelling", CrossSelling_out.getType());
        assertEquals("Target product path", target_product, CrossSelling_out.getTargetProduct());
        assertEquals("Position", new BigInteger("20"), CrossSelling_out.getPosition());

        // check if Comment_out empty for language "de"
        TLocalizedValue[] Comment_out = CrossSelling_out.getComment();
        HashMap<String, String> hComment = new HashMap<String, String>();
        for (int i = 0; i < Comment_out.length; i++)
            hComment.put(Comment_out[i].getLanguageCode(), Comment_out[i].getValue());
        assertNull("empty Comment ", hComment.get("de"));
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() {
        testCreate();
        testExists(true);
        testGetInfo();
        testUpdate();
        testGetInfo2();
        testUpdate2();
        testGetInfo3();
        testDelete();
        testExists(false);
    }
}
