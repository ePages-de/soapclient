package de.epages.ws.customer4;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.customer4.model.TCreate_Input;
import de.epages.ws.customer4.model.TCreate_Return;
import de.epages.ws.customer4.model.TDelete_Return;
import de.epages.ws.customer4.model.TExists_Return;
import de.epages.ws.customer4.model.TGetInfo_Return;
import de.epages.ws.customer4.model.TUpdate_Input;
import de.epages.ws.customer4.model.TUpdate_Return;
import de.epages.ws.customer4.stub.TFind_Input;
import de.epages.ws.shop3.model.TAddressNamed;

/**
 * A JUnit TestSuite to test epages Customer WebServices.
 */
public class CustomerServiceTest {

    private static final CustomerServiceClient customerService = new CustomerServiceClientImpl(new WebServiceTestConfiguration());

    private TCreate_Input customer_in = new TCreate_Input();
    private TUpdate_Input customer_update = new TUpdate_Input();

    private String custpath = "/Shops/DemoShop/Customers/";
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
        customer_in.setCustomerGroup("/Shops/DemoShop/Groups/NewCustomer");
        customer_in.setTaxArea("/TaxMatrixGermany/EU");
        customer_in.setTaxModel("gross");
        customer_in.setCurrencyID("EUR");
        TAddressNamed billingAddress = new TAddressNamed();
        billingAddress.setEMail(email);
        billingAddress.setFirstName("Klaus");
        billingAddress.setLastName("Klaussen");
        billingAddress.setStreet("Musterstraße 2");
        billingAddress.setStreet2("Ortsteil Niederfingeln");
        billingAddress.setCodePorte("123456");
        billingAddress.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));
        TAttribute addrAttr1 = new TAttribute();
        addrAttr1.setName("JobTitle");
        addrAttr1.setValue("best Job");
        TAttribute addrAttr2 = new TAttribute();
        addrAttr2.setName("Salutation");
        addrAttr2.setValue("Dr.");
        billingAddress.setAttributes(new TAttribute[] { addrAttr1, addrAttr2 });
        customer_in.setBillingAddress(billingAddress);
        TAttribute custAttr = new TAttribute();
        custAttr.setName("Comment");
        custAttr.setValue("my customer comment");
        customer_in.setAttributes(new TAttribute[] { custAttr });

        // test data customer_update
        customer_update.setPath(path);
        TAddressNamed billingAddress2 = new TAddressNamed();
        billingAddress2.setFirstName("Hans");
        billingAddress2.setLastName("Hanssen");
        billingAddress2.setStreet("Musterstraße 2b");
        billingAddress2.setStreet2("Ortsteil Oberfingeln");
        billingAddress2.setCodePorte("654321");
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
        assertTrue("created?", customers_out[0].getCreated());
        assertNoError(customers_out[0].getError());
    }

    /**
     * Update a customer and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Return[] customers_out = customerService.update(new TUpdate_Input[] { customer_update });

        // test if update was successful
        assertEquals("create result set", 1, customers_out.length);
        assertTrue("updated?", customers_out[0].getUpdated());
        assertNoError(customers_out[0].getError());
    }

    /**
     * Delete a customer and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] customers_out = customerService.delete(new String[] { path });

        // test if update was successful
        assertEquals("create result set", 1, customers_out.length);
        assertTrue("deleted?", customers_out[0].getDeleted());
        assertNoError(customers_out[0].getError());
    }

    /**
     * Retrieve information about an customer. Check if the returned data are
     * equal to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        TGetInfo_Return[] customers_out = customerService.getInfo(new String[] { path }, new String[] { "Comment" }, new String[] {
                "JobTitle", "Salutation" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, customers_out.length);

        // define vars for easy access
        TGetInfo_Return customer_out = customers_out[0];
        assertNoError(customers_out[0].getError());
        TAttribute[] attr_out = customer_out.getAttributes();
        TAttribute[] attr_in = customer_in.getAttributes();
        TAddressNamed bill_out = customer_out.getBillingAddress();
        TAddressNamed bill_in = customer_in.getBillingAddress();
        TAttribute[] addrAttr_out = bill_out.getAttributes();
        TAttribute[] addrAttr_in = bill_in.getAttributes();

        // check general data
        assertEquals("Alias", alias, customer_out.getAlias());
        assertEquals("CustomerGroup", customer_in.getCustomerGroup(), customer_out.getCustomerGroup());
        assertEquals("TaxArea", customer_in.getTaxArea(), customer_out.getTaxArea());
        assertEquals("TaxModel", customer_in.getTaxModel(), customer_out.getTaxModel());

        // attribute CurrencyID is obsolete
        // assertEquals("CurrencyID", customer_in.getCurrencyID() ,
        // customer_out.getCurrencyID() );

        // check if data created and not changed
        assertEquals("Birthday", bill_in.getBirthday().getTime(), bill_out.getBirthday().getTime());
        assertEquals("JobTitle", addrAttr_in[0].getValue(), addrAttr_out[0].getValue());
        assertEquals("Salutation", addrAttr_in[1].getValue(), addrAttr_out[1].getValue());

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
        assertEquals("CodePorte", bill_in.getCodePorte(), bill_out.getCodePorte());
    }

    /**
     * Test if a customer exists or not
     *
     * @param expected
     *            if false the Test will be successful if the customer does NOT
     *            exist
     */
    public void testExists() {
        testExists(true);
    }

    public void testExists(boolean expected) {
        TExists_Return[] customers_out = customerService.exists(new String[] { path });

        // test if exists check was successful
        assertEquals("exists result set", 1, customers_out.length);
        assertEquals("exists?", expected, customers_out[0].getExists());
        assertNoError(customers_out[0].getError());
    }

    /**
     * Test if a customer is found by EMail
     */
    public void testFind() {
        TFind_Input input = new TFind_Input();
        input.setEMail(email);
        String[] customers_out = customerService.find(input);

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
        testExists();
        testFind();
        testGetInfo(false);
        testUpdate();
        testGetInfo(true);
        testDelete();
        testExists(false);
    }
}
