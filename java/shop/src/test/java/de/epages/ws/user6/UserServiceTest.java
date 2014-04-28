package de.epages.ws.user6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.shop3.model.TAddressNamed;
import de.epages.ws.user6.model.TCreate_Input;
import de.epages.ws.user6.model.TCreate_Return;
import de.epages.ws.user6.model.TDelete_Return;
import de.epages.ws.user6.model.TExists_Return;
import de.epages.ws.user6.model.TGetInfo_Return;
import de.epages.ws.user6.model.TUpdate_Input;
import de.epages.ws.user6.model.TUpdate_Return;
import de.epages.ws.user6.stub.Type_Find_Input;

public class UserServiceTest {

    private static final UserServiceClientImpl userService = new UserServiceClientImpl(new WebServiceTestConfiguration());

    private TCreate_Input user_in = new TCreate_Input();
    private TUpdate_Input user_update = new TUpdate_Input();

    private String userpath = "/Shops/DemoShop/Users/";
    private String alias = "java_test-1";
    private String path = userpath + alias;
    private String email = "java_test-1@epages.de";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {

        // test data user_in
        user_in.setAlias(alias);
        user_in.setPassword("epages");
        user_in.setName("Klaus Klaussen");
        user_in.setEMail(email);
        TAddressNamed address1 = new TAddressNamed();
        address1.setAlias("Adresse1");
        address1.setEMail(email);
        address1.setFirstName("Klaus");
        address1.setLastName("Klaussen");
        address1.setStreet("Musterstraße 2");
        address1.setStreet2("Ortsteil Niederfingeln");
        address1.setCodePorte("13a");
        address1.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));
        TAddressNamed address2 = new TAddressNamed();
        address2.setAlias("zweite Adresse");
        address2.setEMail(email);
        address2.setFirstName("Klaus2");
        address2.setLastName("Klaussen2");
        address2.setStreet("Musterstraße 2b");
        address2.setStreet2("Ortsteil Niederfingeln");
        address2.setCodePorte("13b");
        TAddressNamed address3 = new TAddressNamed();
        address3.setAlias("Adresse Nummero III");
        address3.setEMail(email);
        address3.setFirstName("Klaus3");
        address3.setLastName("Klaussen3");
        address3.setStreet("Musterstraße 3");
        address3.setStreet2("Ortsteil Niederfingeln");
        user_in.setBillingAddress(address1);
        user_in.setShippingAddress(address1);
        user_in.setAdditionalAddresses(new TAddressNamed[] { address2, address3 });
        TAttribute custAttr = new TAttribute();
        custAttr.setName("ChallengePhrase");
        custAttr.setValue("my challenge phrase");
        user_in.setAttributes(new TAttribute[] { custAttr });

        // test data user_update
        user_update.setPath(path);
        TAddressNamed address4 = new TAddressNamed();
        address4.setFirstName("Hans");
        address4.setLastName("Hanssen");
        address4.setStreet("Musterstraße 2b");
        address4.setStreet2("Ortsteil Oberfingeln");
        address4.setCodePorte("13u");
        TAttribute addrAttr1 = new TAttribute();
        addrAttr1.setName("JobTitle");
        addrAttr1.setValue("best Job");
        TAttribute addrAttr2 = new TAttribute();
        addrAttr2.setName("Salutation");
        addrAttr2.setValue("Dr.");
        address4.setAttributes(new TAttribute[] { addrAttr1, addrAttr2 });
        user_update.setBillingAddress(address4);
        TAttribute custAttr2 = new TAttribute();
        custAttr2.setName("ChallengePhrase");
        custAttr2.setValue("my updated challenge phrase");
        user_update.setAttributes(new TAttribute[] { custAttr2 });

        // delete the test user if it exists
        TExists_Return[] ret = userService.exists(new String[] { path });
        if (ret[0].getExists()) {
            userService.delete(new String[] { path });
        }

    }

    /**
     * Create a user and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Return[] users_out = userService.create(new TCreate_Input[] { user_in });

        // test if creation was successful
        assertEquals("create result set", 1, users_out.length);
        assertTrue("created?", users_out[0].getCreated());
    }

    /**
     * Update a user and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Return[] users_out = userService.update(new TUpdate_Input[] { user_update });

        // test if update was successful
        assertEquals("create result set", 1, users_out.length);
        assertTrue("updated?", users_out[0].getUpdated());
    }

    /**
     * Delete a user and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] users_out = userService.delete(new String[] { path });

        // test if update was successful
        assertEquals("create result set", 1, users_out.length);
        assertTrue("deleted?", users_out[0].getDeleted());
    }

    /**
     * Retrieve information about an user. Check if the returned data are equal
     * to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        TGetInfo_Return[] users_out = userService.getInfo(new String[] { path }, new String[] { "ChallengePhrase" }, new String[] {
                "JobTitle", "Salutation" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, users_out.length);

        // define vars for easy access
        TGetInfo_Return user_out = users_out[0];
        TAttribute[] attr_out = user_out.getAttributes();
        TAttribute[] attr_in = user_in.getAttributes();
        TAddressNamed bill_out = user_out.getBillingAddress();
        TAddressNamed bill_in = user_in.getBillingAddress();
        // TAttribute[] addrAttr_out = bill_out.getAttributes();
        // TAttribute[] addrAttr_in = bill_in.getAttributes();

        if (isAlreadyUpdated) {
            attr_in = user_update.getAttributes();
            bill_in = user_update.getBillingAddress();
        }

        // check updated/created data
        assertEquals("ChallengePhrase", attr_in[0].getValue(), attr_out[0].getValue());
        assertEquals("FirstName", bill_in.getFirstName(), bill_out.getFirstName());
        assertEquals("LastName", bill_in.getLastName(), bill_out.getLastName());
        assertEquals("Street", bill_in.getStreet(), bill_out.getStreet());
        assertEquals("Street2", bill_in.getStreet2(), bill_out.getStreet2());
        assertEquals("CodePorte", bill_in.getCodePorte(), bill_out.getCodePorte());
    }

    /**
     * Test if a user exists or not
     *
     * @param expected
     *            if false the Test will be successful if the user does NOT
     *            exist
     */
    public void testExists() {
        testExists(true);
    }

    public void testExists(boolean expected) {
        TExists_Return[] users_out = userService.exists(new String[] { path });

        // test if exists check was successful
        assertEquals("exists result set", 1, users_out.length);
        assertEquals("exists?", expected, users_out[0].getExists());
    }


    /**
     * Test if a customer is found by Name
     */
    public void testFind() {
        Type_Find_Input input = new Type_Find_Input();
        input.setName("Klaus");
        String[] users_out = userService.find(input);

        // test if find was successful
        assertEquals("find result set", 1, users_out.length );
        assertEquals("found path", path, users_out[0] );
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
