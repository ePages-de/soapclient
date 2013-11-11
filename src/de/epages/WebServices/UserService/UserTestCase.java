package de.epages.WebServices.UserService;

import de.epages.WebServices.UserService.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages User WebServices.
 *
 * User: tmangner
 * Date: 08.12.2005
 * Time: 14:19:18
 */
public class UserTestCase {
    private static Logger log = Logger.getLogger(UserTestCase.class.getName());
    UserServiceClient serviceClient;
    TCreate_Input user_in = new TCreate_Input();
    TUpdate_Input user_update = new TUpdate_Input();

    String path = "/Shops/DemoShop/Users/";
    String alias = "java_test-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new UserServiceClient();

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
        user_in.setAttributes(new TAttribute[]{attr1});

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
        user_update.setAttributes(new TAttribute[]{attr_update});
    
        // delete the test user if exists
        try {
        	List<TExists_Return> Users_exists_out = serviceClient.existsUser(new String[]{path + alias});
        	if( Users_exists_out.get(0).getExists() ) {
        		serviceClient.deleteUser(new String[]{path + alias});
        	}
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
}

    /**
     * Create a User and check if the creation was successful
     */
    public void testCreate() {
        List<TCreate_Input> Users_create_in = new ArrayList();
        Users_create_in.add(user_in);

        List<TCreate_Return> Users_create_out = new ArrayList();

        try {
            Users_create_out = serviceClient.createUser(Users_create_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        assertEquals("create result set", 1, Users_create_out.size());
        assertEquals("created?", new Boolean(true), Users_create_out.get(0).getCreated());
    }

    /**
     * Update a User and check if the update was successful
     */
    public void testUpdate() {
        List<TUpdate_Input> Users_update_in = new ArrayList();
        Users_update_in.add(user_update);

        List<TUpdate_Return> Users_update_out = new ArrayList();

        try {
            Users_update_out = serviceClient.updateUser(Users_update_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if update was successful
        assertEquals("update result set", 1, Users_update_out.size());
        assertEquals("updated?", new Boolean(true), Users_update_out.get(0).getUpdated());
    }

    /**
     * Retrieve information about an User. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        List<TGetInfo_Return> Users_info_out = new ArrayList();
        try {
            Users_info_out = serviceClient.getUserInfo(
                new String[]{path + alias},
                new String[]{"ChallengePhrase"}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, Users_info_out.size());

        TGetInfo_Return User_info_out = Users_info_out.get(0);

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

        // sent and returned password are not the same ... returned password is already crypted
        assertNotSame("Password", user_in.getPassword(), User_info_out.getPassword());
    }

    /**
     * Delete a User and check if no error occured.
     */
    public void testDelete() {
        List<TDelete_Return> Users_delete_out = new ArrayList();
        try {
            Users_delete_out = serviceClient.deleteUser(new String[]{path + alias});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if deletion was successful
        assertEquals("delete result set", 1, Users_delete_out.size());
        assertEquals("deleted?", new Boolean(true), Users_delete_out.get(0).getDeleted());
    }

    /**
         * Test if a User exists or not
         *
         * @param expected if false the Test will be successful if the User does NOT exist
         */
    public void testExists(boolean expected) {
        List<TExists_Return> Users_exists_out = new ArrayList();
        try {
            Users_exists_out = serviceClient.existsUser(new String[]{path + alias});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if exists check was successful
        assertEquals("exists result set", 1, Users_exists_out.size());
        assertEquals("exists?", new Boolean(expected), Users_exists_out.get(0).getExists());
    }

    /**
     * Runs all tests:
     * <ol>
     *   <li>create a User</li>
     *   <li>test if this User exists afterwards</li>
     *   <li>retrieve info about this User, and check if the data equals to the input data of create</li>
     *   <li>updates the User</li>
     *   <li>again retrieve data, and check if the data are equal to the update input data</li>
     *   <li>delete the User</li>
     *   <li>check if the User still exists</li>
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
