package de.epages.ws.shippingmethod;

import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.epages.ws.ShopWebServiceTestConfiguration;
import de.epages.ws.shippingmethod.model.TGetList_Return;

public class ShippingMethodServiceTest {

    private static final ShippingMethodServiceClientImpl shippingMethodService = new ShippingMethodServiceClientImpl(
            new ShopWebServiceTestConfiguration());

    /**
     * Get a list of all shipping methods
     */
    @Test
    public void testGetList() {
        TGetList_Return[] ShippingMethods = shippingMethodService.getList();

        int count = ShippingMethods.length;

        assertEquals("number of shipping methods", 3, count);
        assertThat(ShippingMethods[0].getPath(), endsWith("ShippingMethods/Post"));
        assertThat(ShippingMethods[1].getPath(), endsWith("ShippingMethods/Express"));
        assertThat(ShippingMethods[2].getPath(), endsWith("ShippingMethods/PickupByCustomer"));
    }
}
