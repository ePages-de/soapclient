package de.epages.ws.shippingmethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.shippingmethod.model.TGetList_Return;

public class ShippingMethodServiceTest {

    private static final ShippingMethodServiceClientImpl shippingMethodService = new ShippingMethodServiceClientImpl(
            new WebServiceTestConfiguration());

    /**
     * Get a list of all shipping methods
     */
    @Test
    public void testGetList() {
        TGetList_Return[] ShippingMethods = shippingMethodService.getList();

        int count = ShippingMethods.length;

        assertEquals("number of shipping methods", 3, count);
        assertEquals("first shipping method", "/Shops/DemoShop/ShippingMethods/Post", ShippingMethods[0].getPath());
        assertEquals("second shipping method", "/Shops/DemoShop/ShippingMethods/Express", ShippingMethods[1].getPath());
        assertEquals("third shipping method", "/Shops/DemoShop/ShippingMethods/PickupByCustomer", ShippingMethods[2].getPath());
    }
}
