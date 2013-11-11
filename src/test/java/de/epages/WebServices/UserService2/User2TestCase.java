package de.epages.WebServices.UserService2;

import de.epages.WebServices.WebServiceTestConfiguration;
import de.epages.WebServices.UserService2.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages User WebServices.
 */
public class User2TestCase {
    private static Logger log = Logger.getLogger(User2TestCase.class.getName());
    UserService2Client serviceClient;
    TCreate_Input user_in = new TCreate_Input();
    TUpdate_Input user_update = new TUpdate_Input();

    String path = "/Shops/DemoShop/Users/";
    String alias = "java_test-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new UserService2Client(new WebServiceTestConfiguration());

        // create test users that can be used with the create and update methods
        user_in.setAlias(alias);
        user_in.setPassword("epages");
        user_in.setEMail("java_test-1@epages.de");
        user_in.setName("Klaus Klaussen");

        TAddressNamed bill = new TAddressNamed();
        bill.setAlias("bill");
        bill.setFirstName("Klaus");
        bill.setLastName("Klaussen2");
        bill.setStreet("Musterstraße 2");
        bill.setCity("Ortsteil Niederfingeln");
        bill.setEMail("java_test-1@epages.de");
        bill.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));
        user_in.setBillingAddress(bill);

        TAddressNamed ship = new TAddressNamed();
        ship.setAlias("ship");
        ship.setFirstName("Klaus");
        ship.setLastName("Klaussen3");
        ship.setStreet("Musterstraße 3");
        ship.setCity("Ortsteil Niederfingeln");
        ship.setEMail("java_test-1@epages.de");
        ship.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));
        user_in.setShippingAddress(ship);

        TAddressNamed ship1 = new TAddressNamed();
        ship1.setAlias("ship1");
        ship1.setFirstName("Klaus");
        ship1.setLastName("Klaussen4");
        ship1.setStreet("Musterstraße 4");
        ship1.setCity("Ortsteil Niederfingeln");
        ship1.setEMail("java_test-1@epages.de");
        ship1.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));

        TAddressNamed ship2 = new TAddressNamed();
        //--- test without alias
        ship2.setFirstName("Klaus");
        ship2.setLastName("Klaussen5");
        ship2.setStreet("Musterstraße 5");
        ship2.setCity("Ortsteil Niederfingeln");
        ship2.setEMail("java_test-1@epages.de");
        ship2.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));

		TAddressNamed[] addresses = new TAddressNamed[]{
				ship1,
				ship2,
		};
		user_in.setAdditionalAddresses(addresses);

        
        TAttribute attr1 = new TAttribute();
        attr1.setName("ChallengePhrase");
        attr1.setValue("my challenge phrase");
        user_in.setAttributes(new TAttribute[]{attr1});

        user_update.setPath(path + alias);
        user_update.setName("Hans Hanssen");

        TAddressNamed bill_update = new TAddressNamed();
        bill_update.setFirstName("Hans");
        bill_update.setLastName("Hanssen");
        bill_update.setStreet("Musterstraße 2b");
        bill_update.setCity("Ortsteil Oberfingeln");
        user_update.setBillingAddress(bill_update);

        TAddressNamed ship1_update = new TAddressNamed();
        ship1_update.setAlias("ship1");
        ship1_update.setFirstName("Klaus");
        ship1_update.setLastName("Klaussen44");
        ship1_update.setStreet("Musterstraße 44");
        ship1_update.setCity("Ortsteil Niederfingeln");
        ship1_update.setEMail("java_test-1@epages.de");
        ship1_update.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));

        TAddressNamed ship3_update = new TAddressNamed();
        ship3_update.setAlias("ship3");
        ship3_update.setFirstName("Klaus");
        ship3_update.setLastName("Klaussen55");
        ship3_update.setStreet("Musterstraße 55");
        ship3_update.setCity("Ortsteil Niederfingeln");
        ship3_update.setEMail("java_test-1@epages.de");
        ship3_update.setBirthday(new GregorianCalendar(1976, 9, 25, 11, 33));

		TAddressNamed[] addresses_update = new TAddressNamed[]{
				ship1_update,
				ship3_update,
		};
		user_update.setAdditionalAddresses(addresses_update);

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

		HashMap<String, TAddressNamed> outAddresses = new HashMap<String, TAddressNamed>();
		for ( TAddressNamed address : User_info_out.getAdditionalAddresses() ) {
			outAddresses.put(address.getStreet(),address);
		}

		if (isAlreadyUpdated) {
            assertEquals("Name", user_update.getName(), User_info_out.getName());
            assertEquals("FirstName", user_update.getBillingAddress().getFirstName(), User_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", user_update.getBillingAddress().getLastName(), User_info_out.getBillingAddress().getLastName());
            assertEquals("Street", user_update.getBillingAddress().getStreet(), User_info_out.getBillingAddress().getStreet());
            assertEquals("Street2", user_update.getBillingAddress().getStreet2(), User_info_out.getBillingAddress().getStreet2());
            assertEquals("ChallengePhrase", user_update.getAttributes()[0].getValue(), User_info_out.getAttributes()[0].getValue());
            for ( TAddressNamed upAddress : user_update.getAdditionalAddresses() ) {
            	TAddressNamed outAddress = outAddresses.get(upAddress.getStreet());
            	if ( upAddress.getAlias()!=null && upAddress.getAlias()!="" ) {
            		assertEquals("Additional Addresses Alias", upAddress.getAlias(), outAddress.getAlias());
            	}
        		assertEquals("Additional Addresses LastName", upAddress.getLastName(), outAddress.getLastName());
            }
        } else {
            assertEquals("Name", user_in.getName(), User_info_out.getName());
            assertEquals("FirstName", user_in.getBillingAddress().getFirstName(), User_info_out.getBillingAddress().getFirstName());
            assertEquals("LastName", user_in.getBillingAddress().getLastName(), User_info_out.getBillingAddress().getLastName());
            assertEquals("Street", user_in.getBillingAddress().getStreet(), User_info_out.getBillingAddress().getStreet());
            assertEquals("Street2", user_in.getBillingAddress().getStreet2(), User_info_out.getBillingAddress().getStreet2());
            assertEquals("ChallengePhrase", user_in.getAttributes()[0].getValue(), User_info_out.getAttributes()[0].getValue());
            assertEquals("AdditionalAddresses", user_in.getAdditionalAddresses().length, User_info_out.getAdditionalAddresses().length );
            for ( TAddressNamed inAddress : user_in.getAdditionalAddresses() ) {
            	TAddressNamed outAddress = outAddresses.get(inAddress.getStreet());
            	if ( inAddress.getAlias()!=null && inAddress.getAlias()!="" ) {
            		assertEquals("Additional Addresses Alias", inAddress.getAlias(), outAddress.getAlias());
            	}
        		assertEquals("Additional Addresses LastName", inAddress.getLastName(), outAddress.getLastName());
            }
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
     * Creates a TestSuite that will do:
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
