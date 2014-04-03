package de.epages.ws.pricelistassignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.pricelistassignment.model.TGetQuantityDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TGetScalePrices_Return;
import de.epages.ws.pricelistassignment.model.TGetValueDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TPriceListQuantityDiscount;
import de.epages.ws.pricelistassignment.model.TPriceListScalePrice;
import de.epages.ws.pricelistassignment.model.TPriceListValueDiscount;
import de.epages.ws.pricelistassignment.model.TQuantityDiscount;
import de.epages.ws.pricelistassignment.model.TScalePrice;
import de.epages.ws.pricelistassignment.model.TSetQuantityDiscounts_Input;
import de.epages.ws.pricelistassignment.model.TSetQuantityDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TSetScalePrices_Input;
import de.epages.ws.pricelistassignment.model.TSetScalePrices_Return;
import de.epages.ws.pricelistassignment.model.TSetValueDiscounts_Input;
import de.epages.ws.pricelistassignment.model.TSetValueDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TValueDiscount;

public class PriceListAssignmentServiceTest {
    private static final PriceListAssignmentServiceClientImpl serviceClient = new PriceListAssignmentServiceClientImpl(
            new WebServiceTestConfiguration());

    private final String product = "/Shops/DemoShop/Products/ho_1112105010";
    private final String pricelist = "/Shops/DemoShop/PriceLists/RegularCustomer_EUR";

    private TQuantityDiscount[] quantityDiscounts;
    private TValueDiscount[] valueDiscounts;
    private TScalePrice[] scalePrices;

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // create test PriceListAssignments that can be used with the create and
        // update methods
        quantityDiscounts = new TQuantityDiscount[] { new TQuantityDiscount(100, 10), new TQuantityDiscount(200, 20), };
        valueDiscounts = new TValueDiscount[] { new TValueDiscount(100, 10), new TValueDiscount(200, 20), };
        scalePrices = new TScalePrice[] { new TScalePrice(10, 100), new TScalePrice(20, 200), };

    }

    /**
     * set up a QuantityDiscount
     */
    public void testSetQuantityDiscount() {
        TSetQuantityDiscounts_Input[] PriceListAssignments_in = { new TSetQuantityDiscounts_Input(product, pricelist, quantityDiscounts) };
        TSetQuantityDiscounts_Return[] PriceListAssignments_out = serviceClient.setQuantityDiscounts(PriceListAssignments_in);

        // test if creation was successful
        Assert.assertEquals("create result set", 1, PriceListAssignments_out.length);
        Assert.assertEquals("created?", true, PriceListAssignments_out[0].getUpdated());
    }

    /**
     * Get info for a QuantityDiscount
     */
    public void testGetQuantityDiscount() {

        TGetQuantityDiscounts_Return[] PriceListAssignments_out = serviceClient.getQuantityDiscounts(new String[] { product },
                new String[] { pricelist });

        Assert.assertEquals("product result set", 1, PriceListAssignments_out.length);
        Assert.assertEquals("product path", product, PriceListAssignments_out[0].getProduct());

        TPriceListQuantityDiscount[] priceLists = PriceListAssignments_out[0].getPriceLists();
        Assert.assertEquals("pricelist result set", 1, priceLists.length);
        Assert.assertEquals("pricelist path", pricelist, priceLists[0].getPriceList());

        Assert.assertEquals("quantityDiscounts Quantity", quantityDiscounts[0].getQuantity(),
                priceLists[0].getQuantityDiscounts()[0].getQuantity(), 0.0f);
        Assert.assertEquals("quantityDiscounts Discount", quantityDiscounts[0].getDiscount(),
                priceLists[0].getQuantityDiscounts()[0].getDiscount(), 0.0f);
        Assert.assertEquals("quantityDiscounts Quantity", quantityDiscounts[1].getQuantity(),
                priceLists[0].getQuantityDiscounts()[1].getQuantity(), 0.0f);
        Assert.assertEquals("quantityDiscounts Discount", quantityDiscounts[1].getDiscount(),
                priceLists[0].getQuantityDiscounts()[1].getDiscount(), 0.0f);
    }

    /**
     * set up a ValueDiscount
     */
    public void testSetValueDiscounts() {

        TSetValueDiscounts_Input[] PriceListAssignments_in = { new TSetValueDiscounts_Input(product, pricelist, valueDiscounts) };
        TSetValueDiscounts_Return[] PriceListAssignments_out = serviceClient.setValueDiscounts(PriceListAssignments_in);

        // test if creation was successful
        Assert.assertEquals("create result set", 1, PriceListAssignments_out.length);
        Assert.assertEquals("created?", true, PriceListAssignments_out[0].getUpdated());
    }

    /**
     * Get info for a ValueDiscount
     */
    public void testGetValueDiscount() {

        TGetValueDiscounts_Return[] PriceListAssignments_out = serviceClient.getValueDiscounts(new String[] { product }, new String[] { pricelist });

        Assert.assertEquals("product result set", 1, PriceListAssignments_out.length);
        Assert.assertEquals("product path", product, PriceListAssignments_out[0].getProduct());

        TPriceListValueDiscount[] priceLists = PriceListAssignments_out[0].getPriceLists();
        Assert.assertEquals("pricelist result set", 1, priceLists.length);
        Assert.assertEquals("pricelist path", pricelist, priceLists[0].getPriceList());

        Assert.assertEquals("valueDiscounts Value", valueDiscounts[0].getValue(), priceLists[0].getValueDiscounts()[0].getValue(), 0.0f);
        Assert.assertEquals("valueDiscounts Discount", valueDiscounts[0].getDiscount(), priceLists[0].getValueDiscounts()[0].getDiscount(), 0.0f);
        Assert.assertEquals("valueDiscounts Value", valueDiscounts[1].getValue(), priceLists[0].getValueDiscounts()[1].getValue(), 0.0f);
        Assert.assertEquals("valueDiscounts Discount", valueDiscounts[1].getDiscount(), priceLists[0].getValueDiscounts()[1].getDiscount(), 0.0f);
    }

    /**
     * set up a ValueDiscount
     */
    public void testSetScalePrices() {

        TSetScalePrices_Input[] PriceListAssignments_in = { new TSetScalePrices_Input(product, pricelist, scalePrices) };
        TSetScalePrices_Return[] PriceListAssignments_out = serviceClient.setScalePrices(PriceListAssignments_in);

        // test if creation was successful
        Assert.assertEquals("create result set", 1, PriceListAssignments_out.length);
        Assert.assertEquals("created?", true, PriceListAssignments_out[0].getUpdated());
    }

    /**
     * Get info for a ValueDiscount
     */
    public void testGetScalePrices() {

        TGetScalePrices_Return[] PriceListAssignments_out = serviceClient.getScalePrices(new String[] { product }, new String[] { pricelist });

        Assert.assertEquals("product result set", 1, PriceListAssignments_out.length);
        Assert.assertEquals("product path", product, PriceListAssignments_out[0].getProduct());

        TPriceListScalePrice[] priceLists = PriceListAssignments_out[0].getPriceLists();
        Assert.assertEquals("pricelist result set", 1, priceLists.length);
        Assert.assertEquals("pricelist path", pricelist, priceLists[0].getPriceList());

        Assert.assertEquals("scalePrices Quantity", scalePrices[0].getQuantity(), priceLists[0].getScalePrices()[0].getQuantity(), 0.0f);
        Assert.assertEquals("scalePrices Price", scalePrices[0].getPrice(), priceLists[0].getScalePrices()[0].getPrice(), 0.0f);
        Assert.assertEquals("scalePrices Quantity", scalePrices[1].getQuantity(), priceLists[0].getScalePrices()[1].getQuantity(), 0.0f);
        Assert.assertEquals("scalePrices price", scalePrices[1].getPrice(), priceLists[0].getScalePrices()[1].getPrice(), 0.0f);
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>creates a quantity discount</li>
     * <li>verifies the quantity discount</li>
     * <li>creates a value discount</li>
     * <li>verifies the value discount</li>
     * <li>creates a scale price</li>
     * <li>verifies a scale price</li>
     * </ol>
     */
    @Test
    public void testAll() {
        testSetQuantityDiscount();
        testGetQuantityDiscount();
        testSetValueDiscounts();
        testGetValueDiscount();
        testSetScalePrices();
        testGetScalePrices();
    }
}
