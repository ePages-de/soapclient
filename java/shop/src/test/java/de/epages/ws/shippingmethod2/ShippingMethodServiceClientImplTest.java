package de.epages.ws.shippingmethod2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.shippingmethod2.model.TGetList_Return;

public class ShippingMethodServiceClientImplTest {

    private ShippingMethodServiceClientImpl shippingMethodService;

    @Before
    public void setUp() {
        shippingMethodService = new ShippingMethodServiceClientImpl(new WebServiceTestConfiguration());
    }

    @Test
    public void testGetList() {
        TGetList_Return[] shippingMethods = shippingMethodService.getList();

        int count = shippingMethods.length;

        assertEquals( "number of shipping methods", 3, count );
        assertEquals( "first shipping method", "ShippingMethods/Post", shippingMethods[0].getPath() );
        assertEquals( "second shipping method", "ShippingMethods/Express", shippingMethods[1].getPath() );
        assertEquals( "third shipping method", "ShippingMethods/PickupByCustomer", shippingMethods[2].getPath() );
    }

}