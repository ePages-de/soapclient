package de.epages.ws.customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import junit.framework.TestSuite;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.customer.model.TCreate_Input;
import de.epages.ws.customer.model.TCreate_Return;
import de.epages.ws.customer.model.TDelete_Return;
import de.epages.ws.customer.model.TExists_Return;
import de.epages.ws.customer.model.TGetInfo_Return;
import de.epages.ws.customer.model.TUpdate_Input;
import de.epages.ws.customer.model.TUpdate_Return;
import de.epages.ws.customer.stub.TFind_Input;
import de.epages.ws.customergroup.CustomerGroupServiceClientImpl;
import de.epages.ws.customergroup.model.TGetList_Return;
import de.epages.ws.shop.model.TAddress;

public class CustomerServiceTest {
    private static final CustomerServiceClientImpl serviceClient = new CustomerServiceClientImpl(new WebServiceTestConfiguration());

    private static final CustomerGroupServiceClientImpl customerGroupService = new CustomerGroupServiceClientImpl(
            new WebServiceTestConfiguration());

    private final TCreate_Input customer_in = new TCreate_Input();
    private final TUpdate_Input customer_update = new TUpdate_Input();

    private final String path = "/Shops/DemoShop/Customers/";
    private final String alias = "java_test-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {

        /*
         * try to get customer groups at first, because they are different since
         * patch 7
         */
        String customerGroupsPath = "/Shops/DemoShop/Groups/";
        String[] customerGroups = new String[] { customerGroupsPath + "Neukunde", customerGroupsPath + "Stammkunde" };

        TGetList_Return[] retGroups = customerGroupService.getList();
        customerGroups[0] = customerGroupsPath + retGroups[0].getAlias();
        customerGroups[1] = customerGroupsPath + retGroups[1].getAlias();

        // create test customers that can be used with the create and update
        // methods
        customer_in.setAlias(alias);
        customer_in.setCustomerGroup(customerGroups[0]);
        customer_in.setTaxArea("/TaxMatrixGermany/EU");
        customer_in.setTaxModel("gross");
        customer_in.setCurrencyID("EUR");

        TAddress bill = new TAddress();
        bill.setFirstName("Klaus");
        bill.setLastName("Klaussen");
        bill.setStreet("Musterstraße 2");
        bill.setEMail("java_test-1@epages.de");
        bill.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));
        customer_in.setBillingAddress(bill);

        TAttribute attr1 = new TAttribute();
        attr1.setName("Comment");
        attr1.setValue("my customer comment");
        customer_in.setAttributes(new TAttribute[] { attr1 });

        customer_update.setPath(path + alias);

        TAddress bill_update = new TAddress();
        bill_update.setFirstName("Hans");
        bill_update.setLastName("Hanssen");
        bill_update.setStreet("Musterstraße 2b");
        bill_update.setBirthday(new GregorianCalendar(1976, 9, 25, 12, 00));
        customer_update.setBillingAddress(bill_update);

        TAttribute attr_update = new TAttribute();
        attr_update.setName("Comment");
        attr_update.setValue("my updated customer comment");
        customer_update.setAttributes(new TAttribute[] { attr_update });

        // delete the test customer if it exists
        TExists_Return[] Customers_exists_out = serviceClient.exists(new String[] { path + alias });
        if (Customers_exists_out[0].getExists()) {
            serviceClient.delete(new String[] { path + alias });
        }
    }

    /**
     * Create a customer and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Input[] customers_create_in = { customer_in };

        TCreate_Return[] customers_create_out = serviceClient.create(customers_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, customers_create_out.length);
        assertTrue("created?", customers_create_out[0].getCreated());
    }

    /**
     * Update a customer and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Input[] customers_update_in =  { customer_update };
        TUpdate_Return[] customers_update_out = serviceClient.update(customers_update_in);

        // test if update was successful
        assertEquals("update result set", 1, customers_update_out.length);
        assertTrue("updated?", customers_update_out[0].getUpdated());
    }

    /**
     * Retrieve information about an customer. Check if the returned data are
     * equal to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        TGetInfo_Return[] customers_info_out = serviceClient.getInfo(new String[] { path + alias }, new String[] { "Comment" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, customers_info_out.length);

        TGetInfo_Return customer_info_out = customers_info_out[0];

        assertEquals("alias", alias, customer_info_out.getAlias());

        if (isAlreadyUpdated) {
            assertEquals("FirstName", customer_update.getBillingAddress().getFirstName(), customer_info_out.getBillingAddress()
                    .getFirstName());
            assertEquals("LastName", customer_update.getBillingAddress().getLastName(), customer_info_out.getBillingAddress().getLastName());
            assertEquals("Street", customer_update.getBillingAddress().getStreet(), customer_info_out.getBillingAddress().getStreet());
            assertEquals("Birthday", customer_update.getBillingAddress().getBirthday().getTime(), customer_info_out.getBillingAddress()
                    .getBirthday().getTime());

            assertEquals("Comment", customer_update.getAttributes()[0].getValue(), customer_info_out.getAttributes()[0].getValue());
        } else {
            assertEquals("FirstName", customer_in.getBillingAddress().getFirstName(), customer_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", customer_in.getBillingAddress().getLastName(), customer_info_out.getBillingAddress().getLastName());
            assertEquals("Street", customer_in.getBillingAddress().getStreet(), customer_info_out.getBillingAddress().getStreet());
            assertEquals("Birthday", customer_in.getBillingAddress().getBirthday().getTime(), customer_info_out.getBillingAddress()
                    .getBirthday().getTime());

            assertEquals("Comment", customer_in.getAttributes()[0].getValue(), customer_info_out.getAttributes()[0].getValue());
        }

        assertEquals("CustomerGroup", customer_in.getCustomerGroup(), customer_info_out.getCustomerGroup());
        assertEquals("TaxArea", customer_in.getTaxArea(), customer_info_out.getTaxArea());
        assertEquals("TaxModel", customer_in.getTaxModel(), customer_info_out.getTaxModel());

        // attribute CurrencyID is obsolete
        // assertEquals("CurrencyID", customer_in.getCurrencyID() ,
        // customer_info_out.getCurrencyID() );
    }

    /**
     * Delete a customer and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] customers_delete_out = serviceClient.delete(new String[] { path + alias });

        // test if deletion was successful
        assertEquals("delete result set", 1, customers_delete_out.length);
        assertTrue("deleted?", customers_delete_out[0].getDeleted());
    }

    /**
     * Test if a customer exists or not
     *
     * @param expected
     *            if false the Test will be successful if the customer does NOT
     *            exist
     */
    public void testExists(boolean expected) {
        TExists_Return[] customers_exists_out = serviceClient.exists(new String[] { path + alias });

        // test if exists check was successful
        assertEquals("exists result set", 1, customers_exists_out.length);
        assertEquals("exists?", expected, customers_exists_out[0].getExists());
    }

    /**
     * Test if a customer is found by EMail
     */
    public void testFind() {
        TFind_Input parameters = new TFind_Input();
        parameters.setEMail(customer_in.getBillingAddress().getEMail());

        String[] customers_find_out = new String[] {};
        customers_find_out = serviceClient.find(parameters);

        // test if find was successful
        assertEquals("find result set", 1, customers_find_out.length);
        assertEquals("found path", path + alias, customers_find_out[0]);
    }

    /**
     * Creates a TestSuite that will do:
     * <ol>
     * <li>create a customer</li>
     * <li>test if this customer exists afterwards</li>
     * <li>test if customer is found by search</li>
     * <li>retrieve info about this customer, and check if the data equals to
     * the input data of create</li>
     * <li>updates the customer</li>
     * <li>again retrieve data, and check if the data are equal to the update
     * input data</li>
     * <li>delete the customer</li>
     * <li>check if the customer still exists</li>
     * </ol>
     *
     * @return a suite that can be run
     * @see TestSuite
     */
    @Test
    public void testAll() {
        testCreate();
        testExists(true);
        testFind();
        testGetInfo(false);
        testUpdate();
        testGetInfo(true);
        testDelete();
        testExists(false);
    }
}
