package de.epages.ws.customergroup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.customergroup.model.TGetList_Return;

public class CustomerGroupServiceTest {
    private static final CustomerGroupServiceClientImpl customerGroupService = new CustomerGroupServiceClientImpl(new WebServiceTestConfiguration());

    /**
     * Get a list of all customer groups
     */
    @Test
    public void testGetList() {
    	TGetList_Return[] customerGroups = customerGroupService.getList();

        int count = customerGroups.length;

        assertEquals( "number of customer groups", 2, count );
        assertTrue( "first customer group", customerGroups[0].getAlias().equals("NewCustomer") );
        assertTrue( "second customer group", customerGroups[1].getAlias().equals("RegularCustomer") );
    }
}
