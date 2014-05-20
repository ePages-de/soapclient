package de.epages.ws.customer2;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.customer2.model.TCreate_Input;
import de.epages.ws.customer2.model.TCreate_Return;
import de.epages.ws.customer2.model.TDelete_Return;
import de.epages.ws.customer2.model.TExists_Return;
import de.epages.ws.customer2.model.TGetInfo_Return;
import de.epages.ws.customer2.model.TUpdate_Input;
import de.epages.ws.customer2.model.TUpdate_Return;
import de.epages.ws.customer2.stub.TFind_Input;
import de.epages.ws.shop2.model.TAddress;

/**
 * A JUnit TestSuite to test epages Customer WebServices.
 */
public class CustomerServiceTest {
    private static final CustomerServiceClientImpl customerService = new CustomerServiceClientImpl(new WebServiceTestConfiguration());

    private TCreate_Input customer_in = new TCreate_Input();
    private TUpdate_Input customer_update = new TUpdate_Input();

    private String custpath = "Customers/";
    private String alias = "java_test-1";
    private String path = custpath + alias;
    private String email = "java_test-1@epages.de";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // test data customer_in
        customer_in.setAlias(alias);
        customer_in.setCustomerGroup("Groups/NewCustomer");
        customer_in.setTaxArea("/TaxMatrixGermany/EU");
        customer_in.setTaxModel("gross");
        customer_in.setCurrencyID("EUR");
        TAddress billingAddress = new TAddress();
        billingAddress.setEMail(email);
        billingAddress.setFirstName("Klaus");
        billingAddress.setLastName("Klaussen");
        billingAddress.setStreet("Musterstraße 2");
        billingAddress.setStreet2("Ortsteil Niederfingeln");
        billingAddress.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));
        customer_in.setBillingAddress(billingAddress);
        TAttribute custAttr = new TAttribute();
        custAttr.setName("Comment");
        custAttr.setValue("my customer comment");
        customer_in.setAttributes(new TAttribute[] { custAttr });

        // test data customer_update
        customer_update.setPath(path);
        TAddress billingAddress2 = new TAddress();
        billingAddress2.setFirstName("Hans");
        billingAddress2.setLastName("Hanssen");
        billingAddress2.setStreet("Musterstraße 2b");
        billingAddress2.setStreet2("Ortsteil Oberfingeln");
        customer_update.setBillingAddress(billingAddress2);
        TAttribute custAttr2 = new TAttribute();
        custAttr2.setName("Comment");
        custAttr2.setValue("my updated customer comment");
        customer_update.setAttributes(new TAttribute[] { custAttr2 });

        // delete the test customer if it exists
        TExists_Return[] ret = customerService.exists(new String[] { path });
        if (ret[0].getExists()) {
            customerService.delete(new String[] { path });
        }
    }

    /**
     * Create a customer and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Return[] customers_out = customerService.create(new TCreate_Input[] { customer_in });

        // test if creation was successful
        assertEquals("create result set", 1, customers_out.length);
        TCreate_Return customer_out = customers_out[0];
        assertNoError(customer_out.getError());
    }

    /**
     * Update a customer and check if the update was successful
     */
    public void testUpdate() {

        TUpdate_Return[] customers_out = customerService.update(new TUpdate_Input[] { customer_update });

        // test if update was successful
        assertEquals("create result set", 1, customers_out.length);
        assertTrue("updated?", customers_out[0].getUpdated());
    }

    /**
     * Delete a customer and check if no error occured.
     */
    public void testDelete() {

        TDelete_Return[] customers_out = customerService.delete(new String[] { path });

        // test if update was successful
        assertEquals("create result set", 1, customers_out.length);
        assertTrue("deleted?", customers_out[0].getDeleted());
    }

    /**
     * Retrieve information about an customer2. Check if the returned data are
     * equal to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     */
    public void testGetInfo(String testUpdated) {
        boolean isAlreadyUpdated = testUpdated.equalsIgnoreCase("updated");

        TGetInfo_Return[] customers_out = customerService.getInfo(new String[] { path }, new String[] { "Comment" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, customers_out.length);

        // define vars for easy access
        TGetInfo_Return customer_out = customers_out[0];
        TAttribute[] attr_out = customer_out.getAttributes();
        TAttribute[] attr_in = customer_in.getAttributes();
        TAddress bill_out = customer_out.getBillingAddress();
        TAddress bill_in = customer_in.getBillingAddress();

        // check general data
        assertEquals("Alias", alias, customer_out.getAlias());
        assertEquals("CustomerGroup", customer_in.getCustomerGroup(), customer_out.getCustomerGroup());
        assertEquals("TaxArea", customer_in.getTaxArea(), customer_out.getTaxArea());
        assertEquals("TaxModel", customer_in.getTaxModel(), customer_out.getTaxModel());
        // customer attribute CurrencyID is obsolete
        // assertEquals("CurrencyID", customer_in.getCurrencyID() ,
        // customer_out.getCurrencyID() );

        // check if data created and not changed
        assertEquals("Birthday", bill_in.getBirthday().getTime(), bill_out.getBirthday().getTime());

        if (isAlreadyUpdated) {
            attr_in = customer_update.getAttributes();
            bill_in = customer_update.getBillingAddress();
        }

        // check updated/created data
        assertEquals("Comment", attr_in[0].getValue(), attr_out[0].getValue());
        assertEquals("FirstName", bill_in.getFirstName(), bill_out.getFirstName());
        assertEquals("LastName", bill_in.getLastName(), bill_out.getLastName());
        assertEquals("Street", bill_in.getStreet(), bill_out.getStreet());
        assertEquals("Street2", bill_in.getStreet2(), bill_out.getStreet2());
    }

    /**
     * Test if a customer exists or not
     *
     * @param expected
     *            if false the Test will be successful if the customer does NOT
     *            exist
     */
    public void testExists(boolean expected) {
        TExists_Return[] customers_out = customerService.exists(new String[] { path });

        // test if exists check was successful
        assertEquals("exists result set", 1, customers_out.length);
        assertEquals("exists?", expected, customers_out[0].getExists());
    }

    /**
     * Test if a customer is found by EMail
     */
    public void testFind() {
        TFind_Input find_in = new TFind_Input();
        find_in.setEMail(email);
        String[] customers_out = customerService.find(find_in);

        // test if find was successful
        assertEquals("find result set", 1, customers_out.length);
        assertEquals("found path", path, customers_out[0]);
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() {
        testCreate();
        testExists(true);
        testFind();
        testGetInfo("");
        testUpdate();
        testGetInfo("updated");
        testDelete();
        testExists(false);
    }
}
