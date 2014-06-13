package de.epages.ws.shippingmethod2;

import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.ShopWebServiceTestConfiguration;
import de.epages.ws.shippingmethod2.model.TGetList_Return;

public class ShippingMethodServiceClientImplTest {

    private ShippingMethodServiceClientImpl shippingMethodService;

    @Before
    public void setUp() {
        shippingMethodService = new ShippingMethodServiceClientImpl(new ShopWebServiceTestConfiguration());
    }

    @Test
    public void testGetList() {
        TGetList_Return[] shippingMethods = shippingMethodService.getList();

        int count = shippingMethods.length;

        assertEquals("number of shipping methods", 3, count);
        assertThat(shippingMethods[0].getPath(), endsWith("ShippingMethods/Post"));
        assertThat(shippingMethods[1].getPath(), endsWith("ShippingMethods/Express"));
        assertThat(shippingMethods[2].getPath(), endsWith("ShippingMethods/PickupByCustomer"));
    }

}