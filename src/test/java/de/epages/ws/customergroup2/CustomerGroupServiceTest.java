package de.epages.ws.customergroup2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.customergroup2.model.TCreate_Input;
import de.epages.ws.customergroup2.model.TCreate_Return;
import de.epages.ws.customergroup2.model.TDelete_Return;
import de.epages.ws.customergroup2.model.TExists_Return;
import de.epages.ws.customergroup2.model.TGetList_Return;
import de.epages.ws.customergroup2.model.TUpdate_Input;
import de.epages.ws.customergroup2.model.TUpdate_Return;

/**
 * A JUnit TestSuite to test epages CustomerGroup WebServices.
 */
public class CustomerGroupServiceTest {
    private static final CustomerGroupServiceClientImpl customerGroupService = new CustomerGroupServiceClientImpl(
            new WebServiceTestConfiguration());

    private final TCreate_Input group_in = new TCreate_Input();
    private final TUpdate_Input group_up = new TUpdate_Input();

    private final String alias = "java_TestGroup-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        group_in.setAlias(alias);
        group_in.setName(new TLocalizedValue[] { new TLocalizedValue("de", "TestGruppe"), new TLocalizedValue("en", "test group"), });

        group_up.setAlias(alias);
        group_up.setName(new TLocalizedValue[] { new TLocalizedValue("de", "TestGruppe modifiziert"),
                new TLocalizedValue("en", "test group changed"), });

    }

    /**
     * Create a customer group and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Return[] customers_out = customerGroupService.create(new TCreate_Input[] { group_in });

        // test if creation was successful
        assertEquals("create result set", 1, customers_out.length);
        assertTrue("created?", customers_out[0].getCreated());
    }

    /**
     * Get a list of all customer groups
     */
    public void testGetList() throws RemoteException {
        TGetList_Return[] customerGroups = customerGroupService.getList();

        int count = customerGroups.length;
        assertEquals("number of customer groups", 2, count);
        assertTrue("first customer group", customerGroups[0].getAlias().equals("NewCustomer"));
        assertTrue("second customer group", customerGroups[1].getAlias().equals("RegularCustomer"));
    }

    /**
     * Update a customer group and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Return[] customers_out = customerGroupService.update(new TUpdate_Input[] { group_up });

        // test if update was successful
        assertEquals("create result set", 1, customers_out.length);
        assertTrue("updated?", customers_out[0].getUpdated());
    }

    /**
     * Delete a customer group and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] customers_out = customerGroupService.delete(new String[] { alias });

        // test if update was successful
        assertEquals("create result set", 1, customers_out.length);
        assertTrue("deleted?", customers_out[0].getDeleted());
    }

    /**
     * Test if a customer group exists or not
     *
     * @param expected
     *            if false the Test will be successful if the customer does NOT
     *            exist
     */
    public void testExists() {
        testExists(true);
    }

    public void testExists(boolean expected) {
        TExists_Return[] customers_out = customerGroupService.exists(new String[] { alias });

        // test if exists check was successful
        assertEquals("exists result set", 1, customers_out.length);
        assertEquals("exists?", new Boolean(expected), customers_out[0].getExists());
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() throws RemoteException {
        testGetList();
        testCreate();
        testExists();
        testUpdate();
        testDelete();
        testExists(false);
    }
}
