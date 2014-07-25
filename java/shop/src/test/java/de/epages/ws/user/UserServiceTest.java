package de.epages.ws.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.ShopWebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.shop.model.TAddress;
import de.epages.ws.user.model.TCreate_Input;
import de.epages.ws.user.model.TCreate_Return;
import de.epages.ws.user.model.TDelete_Return;
import de.epages.ws.user.model.TExists_Return;
import de.epages.ws.user.model.TGetInfo_Return;
import de.epages.ws.user.model.TUpdate_Input;
import de.epages.ws.user.model.TUpdate_Return;

public class UserServiceTest {

    private static final UserServiceClientImpl serviceClient = new UserServiceClientImpl(new ShopWebServiceTestConfiguration());

    private final TCreate_Input user_in = new TCreate_Input();
    private final TUpdate_Input user_update = new TUpdate_Input();

    private final String path = "Users/";
    private final String alias = "java_test-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // create test users that can be used with the create and update methods
        user_in.setAlias(alias);
        user_in.setPassword("epages");
        user_in.setEMail("java_test-1@epages.de");
        user_in.setName("Klaus Klaussen");

        TAddress bill = new TAddress();
        bill.setFirstName("Klaus");
        bill.setLastName("Klaussen");
        bill.setStreet("Musterstraße 2");
        bill.setEMail("java_test-1@epages.de");
        bill.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));
        user_in.setBillingAddress(bill);
        user_in.setShippingAddress(bill);

        TAttribute attr1 = new TAttribute();
        attr1.setName("ChallengePhrase");
        attr1.setValue("my challenge phrase");
        user_in.setAttributes(new TAttribute[] { attr1 });

        user_update.setPath(path + alias);
        user_update.setName("Hans Hanssen");

        TAddress bill_update = new TAddress();
        bill_update.setFirstName("Hans");
        bill_update.setLastName("Hanssen");
        bill_update.setStreet("Musterstraße 2b");
        user_update.setBillingAddress(bill_update);

        TAttribute attr_update = new TAttribute();
        attr_update.setName("ChallengePhrase");
        attr_update.setValue("my updated challenge phrase");
        user_update.setAttributes(new TAttribute[] { attr_update });

        // delete the test user if exists
        TExists_Return[] Users_exists_out = serviceClient.exists(new String[] { path + alias });
        if (Users_exists_out[0].getExists()) {
            serviceClient.delete(new String[] { path + alias });
        }
    }

    /**
     * Create a User and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Input[] Users_create_in = { user_in };
        TCreate_Return[] Users_create_out = serviceClient.create(Users_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, Users_create_out.length);
        assertEquals("created?", true, Users_create_out[0].getCreated());
    }

    /**
     * Update a User and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Input[] Users_update_in = { user_update };
        TUpdate_Return[] Users_update_out = serviceClient.update(Users_update_in);

        // test if update was successful
        assertEquals("update result set", 1, Users_update_out.length);
        assertEquals("updated?", true, Users_update_out[0].getUpdated());
    }

    /**
     * Retrieve information about an User. Check if the returned data are equal
     * to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        TGetInfo_Return[] Users_info_out = serviceClient.getInfo(new String[] { path + alias }, new String[] { "ChallengePhrase" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Users_info_out.length);

        TGetInfo_Return User_info_out = Users_info_out[0];

        assertEquals("alias", alias, User_info_out.getAlias());

        if (isAlreadyUpdated) {
            assertEquals("Name", user_update.getName(), User_info_out.getName());
            assertEquals("FirstName", user_update.getBillingAddress().getFirstName(), User_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", user_update.getBillingAddress().getLastName(), User_info_out.getBillingAddress().getLastName());
            assertEquals("Street", user_update.getBillingAddress().getStreet(), User_info_out.getBillingAddress().getStreet());
            assertEquals("ChallengePhrase", user_update.getAttributes()[0].getValue(), User_info_out.getAttributes()[0].getValue());
        } else {
            assertEquals("Name", user_in.getName(), User_info_out.getName());
            assertEquals("FirstName", user_in.getBillingAddress().getFirstName(), User_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", user_in.getBillingAddress().getLastName(), User_info_out.getBillingAddress().getLastName());
            assertEquals("Street", user_in.getBillingAddress().getStreet(), User_info_out.getBillingAddress().getStreet());
            assertEquals("ChallengePhrase", user_in.getAttributes()[0].getValue(), User_info_out.getAttributes()[0].getValue());
        }
        assertEquals("EMail", user_in.getEMail(), User_info_out.getEMail());

        // sent and returned password are not the same ... returned password is
        // already crypted
        assertNotSame("Password", user_in.getPassword(), User_info_out.getPassword());
    }

    /**
     * Delete a User and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] Users_delete_out = serviceClient.delete(new String[] { path + alias });

        // test if deletion was successful
        assertEquals("delete result set", 1, Users_delete_out.length);
        assertEquals("deleted?", true, Users_delete_out[0].getDeleted());
    }

    /**
     * Test if a User exists or not
     *
     * @param expected
     *            if false the Test will be successful if the User does NOT
     *            exist
     */
    public void testExists(boolean expected) {
        TExists_Return[] Users_exists_out = serviceClient.exists(new String[] { path + alias });

        // test if exists check was successful
        assertEquals("exists result set", 1, Users_exists_out.length);
        assertEquals("exists?", expected, Users_exists_out[0].getExists());
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>create a User</li>
     * <li>test if this User exists afterwards</li>
     * <li>retrieve info about this User, and check if the data equals to the
     * input data of create</li>
     * <li>updates the User</li>
     * <li>again retrieve data, and check if the data are equal to the update
     * input data</li>
     * <li>delete the User</li>
     * <li>check if the User still exists</li>
     * </ol>
     */
    @Test
    public void testAll() {
        testCreate();
        testExists(true);
        testGetInfo(false);
        testUpdate();
        testGetInfo(true);
        testDelete();
        testExists(false);
    }
}
