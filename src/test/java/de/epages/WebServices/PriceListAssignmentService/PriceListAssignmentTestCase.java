package de.epages.WebServices.PriceListAssignmentService;

import de.epages.WebServices.WebServiceTestConfiguration;
import de.epages.WebServices.PriceListAssignmentService.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages PriceListAssignment WebServices.
 * <p/>
 * User: tmangner
 * Date: 08.12.2005
 * Time: 14:19:18
 */
public class PriceListAssignmentTestCase {
    private static Logger log = Logger.getLogger(PriceListAssignmentTestCase.class.getName());
    PriceListAssignmentServiceClient serviceClient;

    String product = "/Shops/DemoShop/Products/ho_1112105010";
    String pricelist = "/Shops/DemoShop/PriceLists/RegularCustomer_EUR";

    TQuantityDiscount[] quantityDiscounts;
    TValueDiscount[] valueDiscounts;
    TScalePrice[] scalePrices;

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new PriceListAssignmentServiceClient(new WebServiceTestConfiguration());

        // create test PriceListAssignments that can be used with the create and update methods
        quantityDiscounts = new TQuantityDiscount[]{
                new TQuantityDiscount(100, 10),
                new TQuantityDiscount(200, 20),
            };
        valueDiscounts = new TValueDiscount[]{
                new TValueDiscount(100, 10),
                new TValueDiscount(200, 20),
            };
        scalePrices = new TScalePrice[]{
                new TScalePrice(10, 100),
                new TScalePrice(20, 200),
            };

    }

    /**
     * set up a QuantityDiscount
     */
    public void testSetQuantityDiscount() {

        TSetQuantityDiscounts_Input PriceListAssignment_in = new TSetQuantityDiscounts_Input(product, pricelist, quantityDiscounts);

        List<TSetQuantityDiscounts_Input> PriceListAssignments_in = new ArrayList();
        PriceListAssignments_in.add(PriceListAssignment_in);


        List<TSetQuantityDiscounts_Return> PriceListAssignments_out = new ArrayList();

        try {
            PriceListAssignments_out = serviceClient.setQuantityDiscounts(PriceListAssignments_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        Assert.assertEquals("create result set", 1, PriceListAssignments_out.size());
        Assert.assertEquals("created?", new Boolean(true), PriceListAssignments_out.get(0).getUpdated());
    }

    /**
     * Get info for a QuantityDiscount
     */
    public void testGetQuantityDiscount() {

        List<TGetQuantityDiscounts_Return> PriceListAssignments_out = new ArrayList();

        try {
            PriceListAssignments_out = serviceClient.getQuantityDiscounts(
                new String[]{product}, new String[]{pricelist}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("product result set", 1, PriceListAssignments_out.size());
        Assert.assertEquals("product path", product, PriceListAssignments_out.get(0).getProduct());

        TPriceListQuantityDiscount[] priceLists = PriceListAssignments_out.get(0).getPriceLists();
        Assert.assertEquals("pricelist result set", 1, priceLists.length);
        Assert.assertEquals("pricelist path", pricelist, priceLists[0].getPriceList());

        Assert.assertEquals("quantityDiscounts Quantity", quantityDiscounts[0].getQuantity(), priceLists[0].getQuantityDiscounts()[0].getQuantity(), 0.001);
        Assert.assertEquals("quantityDiscounts Discount", quantityDiscounts[0].getDiscount(), priceLists[0].getQuantityDiscounts()[0].getDiscount(), 0.001);
        Assert.assertEquals("quantityDiscounts Quantity", quantityDiscounts[1].getQuantity(), priceLists[0].getQuantityDiscounts()[1].getQuantity(), 0.001);
        Assert.assertEquals("quantityDiscounts Discount", quantityDiscounts[1].getDiscount(), priceLists[0].getQuantityDiscounts()[1].getDiscount(), 0.001);
    }

    /**
     * set up a ValueDiscount
     */
    public void testSetValueDiscounts() {

        TSetValueDiscounts_Input PriceListAssignment_in = new TSetValueDiscounts_Input(product, pricelist, valueDiscounts);

        List<TSetValueDiscounts_Input> PriceListAssignments_in = new ArrayList();
        PriceListAssignments_in.add(PriceListAssignment_in);


        List<TSetValueDiscounts_Return> PriceListAssignments_out = new ArrayList();

        try {
            PriceListAssignments_out = serviceClient.setValueDiscounts(PriceListAssignments_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        Assert.assertEquals("create result set", 1, PriceListAssignments_out.size());
        Assert.assertEquals("created?", new Boolean(true), PriceListAssignments_out.get(0).getUpdated());
    }

    /**
     * Get info for a ValueDiscount
     */
    public void testGetValueDiscount() {

        List<TGetValueDiscounts_Return> PriceListAssignments_out = new ArrayList();

        try {
            PriceListAssignments_out = serviceClient.getValueDiscounts(
                new String[]{product}, new String[]{pricelist}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("product result set", 1, PriceListAssignments_out.size());
        Assert.assertEquals("product path", product, PriceListAssignments_out.get(0).getProduct());

        TPriceListValueDiscount[] priceLists = PriceListAssignments_out.get(0).getPriceLists();
        Assert.assertEquals("pricelist result set", 1, priceLists.length);
        Assert.assertEquals("pricelist path", pricelist, priceLists[0].getPriceList());

        Assert.assertEquals("valueDiscounts Value", valueDiscounts[0].getValue(), priceLists[0].getValueDiscounts()[0].getValue(), 0.001);
        Assert.assertEquals("valueDiscounts Discount", valueDiscounts[0].getDiscount(), priceLists[0].getValueDiscounts()[0].getDiscount(), 0.001);
        Assert.assertEquals("valueDiscounts Value", valueDiscounts[1].getValue(), priceLists[0].getValueDiscounts()[1].getValue(), 0.001);
        Assert.assertEquals("valueDiscounts Discount", valueDiscounts[1].getDiscount(), priceLists[0].getValueDiscounts()[1].getDiscount(), 0.001);
    }

    /**
     * set up a ValueDiscount
     */
    public void testSetScalePrices() {

        TSetScalePrices_Input PriceListAssignment_in = new TSetScalePrices_Input(product, pricelist, scalePrices);

        List<TSetScalePrices_Input> PriceListAssignments_in = new ArrayList();
        PriceListAssignments_in.add(PriceListAssignment_in);


        List<TSetScalePrices_Return> PriceListAssignments_out = new ArrayList();

        try {
            PriceListAssignments_out = serviceClient.setScalePrices(PriceListAssignments_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        Assert.assertEquals("create result set", 1, PriceListAssignments_out.size());
        Assert.assertEquals("created?", new Boolean(true), PriceListAssignments_out.get(0).getUpdated());
    }

    /**
     * Get info for a ValueDiscount
     */
    public void testGetScalePrices() {

        List<TGetScalePrices_Return> PriceListAssignments_out = new ArrayList();

        try {
            PriceListAssignments_out = serviceClient.getScalePrices(
                new String[]{product}, new String[]{pricelist}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("product result set", 1, PriceListAssignments_out.size());
        Assert.assertEquals("product path", product, PriceListAssignments_out.get(0).getProduct());

        TPriceListScalePrice[] priceLists = PriceListAssignments_out.get(0).getPriceLists();
        Assert.assertEquals("pricelist result set", 1, priceLists.length);
        Assert.assertEquals("pricelist path", pricelist, priceLists[0].getPriceList());

        Assert.assertEquals("scalePrices Quantity", scalePrices[0].getQuantity(), priceLists[0].getScalePrices()[0].getQuantity(), 0.001);
        Assert.assertEquals("scalePrices Price", scalePrices[0].getPrice(), priceLists[0].getScalePrices()[0].getPrice(), 0.001);
        Assert.assertEquals("scalePrices Quantity", scalePrices[1].getQuantity(), priceLists[0].getScalePrices()[1].getQuantity(), 0.001);
        Assert.assertEquals("scalePrices price", scalePrices[1].getPrice(), priceLists[0].getScalePrices()[1].getPrice(), 0.001);
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
