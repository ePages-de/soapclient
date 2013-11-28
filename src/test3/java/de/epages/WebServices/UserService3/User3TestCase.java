package de.epages.WebServices.UserService3;

import de.epages.WebServices.UserService3.Stub.*;
import de.epages.WebServices.WebServiceTestConfiguration;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

/**
 * A JUnit TestSuite to test epages User WebServices.
 */
public class User3TestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(User3TestCase.class.getName());
    private Bind_User_SOAPStub userService;

    private TCreate_Input user_in 		= new TCreate_Input();
    private TUpdate_Input user_update 	= new TUpdate_Input();

    private String userpath = "/Shops/DemoShop/Users/";
    private String alias 	= "java_test-1";
    private String path		= userpath+alias;
    private String email    = "java_test-1@epages.de";

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {

        // init userService
        UserService serviceLocator = new UserServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_UserAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);
        userService = new Bind_User_SOAPStub(WEBSERVICE_URL, serviceLocator);
        userService.setUsername(WEBSERVICE_LOGIN);
        userService.setPassword(WEBSERVICE_PASSWORD);

        // test data user_in
        user_in.setAlias(alias);
        user_in.setPassword("epages");
        user_in.setName(	"Klaus Klaussen");
        user_in.setEMail(	email);
        TAddressNamed address1 = new TAddressNamed();
        	address1.setAlias(		"Adresse1" );
        	address1.setEMail(		email );
        	address1.setFirstName(	"Klaus" );
        	address1.setLastName(	"Klaussen" );
        	address1.setStreet(		"Musterstraße 2" );
        	address1.setStreet2(	"Ortsteil Niederfingeln" );
        	address1.setBirthday( new GregorianCalendar(1976,9,25,11,33) );
        TAddressNamed address2 = new TAddressNamed();
        	address2.setAlias(		"zweite Adresse" );
        	address2.setEMail(		email );
        	address2.setFirstName(	"Klaus2" );
        	address2.setLastName(	"Klaussen2" );
        	address2.setStreet(		"Musterstraße 2b" );
        	address2.setStreet2(	"Ortsteil Niederfingeln" );
        TAddressNamed address3 = new TAddressNamed();
        	address3.setAlias(		"Adresse Nummero III" );
        	address3.setEMail(		email );
        	address3.setFirstName(	"Klaus3" );
        	address3.setLastName(	"Klaussen3" );
        	address3.setStreet(		"Musterstraße 3" );
        	address3.setStreet2(	"Ortsteil Niederfingeln" );
        user_in.setBillingAddress(address1);
        user_in.setShippingAddress(address1);
        user_in.setAdditionalAddresses(new TAddressNamed[]{address2,address3});
        TAttribute custAttr = new TAttribute();
        	custAttr.setName(	"ChallengePhrase");
        	custAttr.setValue(	"my challenge phrase");
        user_in.setAttributes(new TAttribute[]{custAttr});

        // test data user_update
        user_update.setPath(path);
        TAddressNamed address4 = new TAddressNamed();
        	address4.setFirstName(	"Hans" );
        	address4.setLastName(	"Hanssen" );
        	address4.setStreet(		"Musterstraße 2b" );
        	address4.setStreet2(		"Ortsteil Oberfingeln" );
        	TAttribute addrAttr1 = new TAttribute();
    			addrAttr1.setName("JobTitle");
    			addrAttr1.setValue("best Job");
    		TAttribute addrAttr2 = new TAttribute();
    			addrAttr2.setName("Salutation");
    			addrAttr2.setValue("Dr.");
    		address4.setAttributes(new TAttribute[]{addrAttr1,addrAttr2});
        user_update.setBillingAddress(address4);
        	TAttribute custAttr2 = new TAttribute();
        		custAttr2.setName("ChallengePhrase");
        		custAttr2.setValue("my updated challenge phrase");
        user_update.setAttributes(new TAttribute[]{custAttr2});

        // delete the test user if it exists
        try {
        	TExists_Return[] ret = userService.exists(new String[]{path});
        	if( ret[0].getExists() ) {
                log.info("User3TestCase: delete user "+path+" before start testing");
        		userService.delete(new String[]{path});
        	}
        } catch (RemoteException e) {
        	e.printStackTrace();
        }

    }


    /**
     * Create a user and check if the creation was successful
     */
    public void testCreate() {
        log.info("User3TestCase: testCreate");
        try {
    		TCreate_Return[] users_out = userService.create(new TCreate_Input[]{user_in});

    		// test if creation was successful
            assertEquals("create result set", 1, users_out.length );
            assertTrue("created?", users_out[0].getCreated() );
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Update a user and check if the update was successful
     */
   public void testUpdate() {
        log.info("User3TestCase: testUpdate");
        try {
    		TUpdate_Return[] users_out = userService.update(new TUpdate_Input[]{user_update});

    		// test if update was successful
            assertEquals("create result set", 1, users_out.length );
            assertTrue("updated?", users_out[0].getUpdated() );
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

   /**
    * Delete a user and check if no error occured.
    */
   public void testDelete() {
       log.info("User3TestCase: testDelete");
       try {
    	   TDelete_Return[] users_out = userService.delete(new String[]{path});

    	   // test if update was successful
           assertEquals("create result set", 1, users_out.length );
           assertTrue("deleted?", users_out[0].getDeleted() );
       } catch (RemoteException e) {
           e.printStackTrace();
       }
   }

    /**
     * Retrieve information about an user. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo() { testGetInfo(""); }
    public void testGetInfo(String testUpdated) {
    	log.info("User3TestCase: testGetInfo("+testUpdated+")");
    	boolean isAlreadyUpdated = testUpdated.equalsIgnoreCase("updated");
        try {
            TGetInfo_Return[] users_out = userService.getInfo(
                new String[]{path},
                new String[]{"ChallengePhrase"},
                new String[]{"JobTitle","Salutation"}
            );

            // test if getinfo was successful and if all data are equal to input
            assertEquals("getinfo result set", 1, users_out.length );

            // define vars for easy access
            TGetInfo_Return user_out	= users_out[0];
            TAttribute[]  attr_out 	 		= user_out.getAttributes();
            TAttribute[]  attr_in 	 		= user_in.getAttributes();
            TAddressNamed bill_out 	 		= user_out.getBillingAddress();
            TAddressNamed bill_in 	 		= user_in.getBillingAddress();
            //TAttribute[]  addrAttr_out		= bill_out.getAttributes();
            //TAttribute[]  addrAttr_in		= bill_in.getAttributes();

            if (isAlreadyUpdated) {
                attr_in = user_update.getAttributes();
            	bill_in = user_update.getBillingAddress();
            }

            // check updated/created data
            assertEquals("ChallengePhrase", attr_in[0].getValue(), attr_out[0].getValue()  );
            assertEquals("FirstName", bill_in.getFirstName(), bill_out.getFirstName());
            assertEquals("LastName",  bill_in.getLastName() , bill_out.getLastName() );
            assertEquals("Street",	  bill_in.getStreet()   , bill_out.getStreet()   );
            assertEquals("Street2",	  bill_in.getStreet2()  , bill_out.getStreet2()  );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test if a user exists or not
     * @param expected if false the Test will be successful if the user does NOT exist
     */
    public void testExists() { testExists(true); }
    public void testExists(boolean expected) {
        log.info("User3TestCase: testExists("+(expected?"true":"false")+")");
        try {
        	TExists_Return[] users_out = userService.exists(new String[]{path});

        	// test if exists check was successful
            assertEquals("exists result set", 1, users_out.length );
            assertEquals("exists?", new Boolean(expected), users_out[0].getExists() );
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() throws RemoteException
    {
    	testCreate();
    	testExists();
    	testGetInfo();
    	testUpdate();
    	testGetInfo("updated");
    	testDelete();
    	testExists(false);
    }
}
