package de.epages.WebServices.PriceListService;

import de.epages.WebServices.WebServiceTestConfiguration;
import de.epages.WebServices.CustomerGroupService.Stub.*;
import de.epages.WebServices.PriceListService.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.text.*;
import java.util.*;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

/**
 * A JUnit TestSuite to test epages PriceList WebServices.
 */
public class PriceListTestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(PriceListTestCase.class.getName());
    
    private Bind_PriceList_SOAPStub priceListService;
    
    TCreate_Input PriceList_in = new TCreate_Input();
    TUpdate_Input PriceList_update = new TUpdate_Input();

    String path = "/Shops/DemoShop/PriceLists/";
    String alias = "java_test-1";

    SimpleDateFormat sdf_in  = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    SimpleDateFormat sdf_out = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        PriceListService serviceLocator = new PriceListServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_PriceListAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

       	priceListService = new Bind_PriceList_SOAPStub(WEBSERVICE_URL, serviceLocator);

        // setting user-path and password of the shop
        priceListService.setUsername(WEBSERVICE_LOGIN);
        priceListService.setPassword(WEBSERVICE_PASSWORD);

    	/* get customer groups at first */
    	String customerGroupsPath = "/Shops/DemoShop/Groups/";
    	String[] customerGroups = new String[]{
        		customerGroupsPath+"Neukunde",
        		customerGroupsPath+"Stammkunde"
        	};
    	Bind_CustomerGroup_SOAPStub customerGroupService = new Bind_CustomerGroup_SOAPStub(
    			WEBSERVICE_URL,
    			new CustomerGroupServiceLocator());
        customerGroupService.setUsername(WEBSERVICE_LOGIN);
        customerGroupService.setPassword(WEBSERVICE_PASSWORD);

        log.info("customerGroupService.getList called");
    	TGetList_Return[] retGroups = customerGroupService.getList();

    	char qw = '\"'; 
    	customerGroups[0] = customerGroupsPath+qw+retGroups[0].getAlias()+qw;
    	customerGroups[1] = customerGroupsPath+qw+retGroups[1].getAlias()+qw;
        log.info("customer group[0]: " + customerGroups[0]);
        log.info("customer group[1]: " + customerGroups[1]);

        // create test PriceLists that can be used with the create and update methods
        PriceList_in.setAlias(alias);
        PriceList_in.setCurrencyID("EUR");
        PriceList_in.setCustomerGroups(new String[]{customerGroups[1]});
        PriceList_in.setCustomers(new String[]{"/Shops/DemoShop/Customers/1001"});
        PriceList_in.setName(new TLocalizedValue[]{
                    new TLocalizedValue("de", "Meine Preisliste"),
                    new TLocalizedValue("en", "my price list")
                });
        PriceList_in.setValidFrom(new GregorianCalendar(2007, 12, 1));
        PriceList_in.setValidTo(new GregorianCalendar(2007, 12, 31));

        String dateStr = new String(sdf_in.format(new GregorianCalendar(2006,1,1,0,00).getTime()));
        TAttribute attr1 = new TAttribute();
        attr1.setName("CreationDate");
        attr1.setType("DateTime");
        attr1.setValue(dateStr);
        PriceList_in.setAttributes(new TAttribute[]{attr1});

        PriceList_update.setPath(path + alias);
        PriceList_update.setName(new TLocalizedValue[]{
                    new TLocalizedValue("de", "Meine geänderte Preisliste"),
                    new TLocalizedValue("en", "my updated price list")
                });

        dateStr = new String(sdf_in.format(new GregorianCalendar(2006,1,1,11,11).getTime()));
        TAttribute attr_update = new TAttribute();
        attr_update.setName("CreationDate");
        attr_update.setType("DateTime");
        attr_update.setValue(dateStr);
        PriceList_update.setAttributes(new TAttribute[]{attr_update});
        
        // delete the test price list if it exists
    	TExists_Return[] PriceLists_exists_out = priceListService.exists(new String[]{path + alias});
        if( PriceLists_exists_out[0].getExists() ) {
        	priceListService.delete(new String[]{path + alias});
        }
    }

    /**
     * Create a PriceList and check if the creation was successful
     */
    public void testCreate() throws RemoteException {
        TCreate_Input[] PriceLists_create_in = new TCreate_Input[]{ PriceList_in };
        log.info("priceListService.create called");
    	TCreate_Return[] PriceLists_create_out = priceListService.create(PriceLists_create_in);

    	// test if creation was successful
        assertEquals("create result set", 1, PriceLists_create_out.length);
        
        TCreate_Return PriceList_create_out = PriceLists_create_out[0];
        
        if (PriceList_create_out.getError() == null) {
            log.info("successfully created PriceList: " + PriceList_create_out.getAlias());
        } else {
            log.severe("an error occured (Epages Error):\n" + PriceList_create_out.getError().getMessage());
        }
        
        assertEquals("created?", new Boolean(true), PriceList_create_out.getCreated());
    }

    /**
     * Update a PriceList and check if the update was successful
     */
    public void testUpdate() throws RemoteException {
        TUpdate_Input[] PriceLists_update_in = new TUpdate_Input[]{ PriceList_update };
        log.info("priceListService.update called");
    	TUpdate_Return[] PriceLists_update_out = priceListService.update(PriceLists_update_in);

    	// test if update was successful
        assertEquals("update result set", 1, PriceLists_update_out.length);

        TUpdate_Return PriceList_update_out = PriceLists_update_out[0];

        if (PriceList_update_out.getError() == null) {
            log.info("successfully updated PriceList: " + PriceList_update_out.getPath());
        } else {
            log.severe("an error occured (Epages Error):\n" + PriceList_update_out.getError().getMessage());
        }
        
        assertEquals("updated?", new Boolean(true), PriceList_update_out.getUpdated());
    }

    /**
     * Retrieve information about an PriceList. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) throws RemoteException {
        log.info("priceListService.getInfo called");
        TGetInfo_Return[] PriceLists_info_out = priceListService.getInfo(
            new String[]{path + alias},
            new String[]{"CreationDate"},
            null // all languages
        );

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, PriceLists_info_out.length);

        TGetInfo_Return PriceList_info_out = PriceLists_info_out[0];
        if (PriceList_info_out.getError() == null) {
            log.info("successfully retrieved PriceList: " + PriceList_info_out.getAlias());
        } else {
            log.severe("an error occured (Epages Error):\n" + PriceList_info_out.getError().getMessage());
        }
        
        assertEquals("alias", alias, PriceList_info_out.getAlias());
        assertEquals("Number of languages", 2, PriceList_info_out.getName().length );
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put(PriceList_info_out.getName()[0].getLanguageCode(), PriceList_info_out.getName()[0].getValue());
        hash.put(PriceList_info_out.getName()[1].getLanguageCode(), PriceList_info_out.getName()[1].getValue());
        
        if (isAlreadyUpdated) {
        	
        	try {
        		Date date_in  = sdf_in.parse(PriceList_update.getAttributes()[0].getValue());
        		Date date_out = sdf_out.parse(PriceList_info_out.getAttributes()[0].getValue());
                assertEquals("CreationDate", date_in, date_out);
        	} catch (ParseException e) {
                e.printStackTrace();
        	}
            
            assertEquals("updated localized Name", PriceList_update.getName()[0].getValue(), hash.get(PriceList_update.getName()[0].getLanguageCode()));
            assertEquals("updated localized Name", PriceList_update.getName()[1].getValue(), hash.get(PriceList_update.getName()[1].getLanguageCode()));
        }
        else {
        	
        	try {
        		Date date_in  = sdf_in.parse(PriceList_in.getAttributes()[0].getValue());
        		Date date_out = sdf_out.parse(PriceList_info_out.getAttributes()[0].getValue());
                assertEquals("CreationDate", date_in, date_out);
        	} catch (ParseException e) {
                e.printStackTrace();
        	}
            
            assertEquals("initial localized Name", PriceList_in.getName()[0].getValue(), hash.get(PriceList_update.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", PriceList_in.getName()[1].getValue(), hash.get(PriceList_update.getName()[1].getLanguageCode()));
        }

        assertTrue("CustomerGroups result set", PriceList_info_out.getCustomerGroups().length == 1 );
        assertTrue("Customers result set", PriceList_info_out.getCustomers().length == 1 );

        assertEquals("ValidFrom", PriceList_in.getValidFrom().getTime(), PriceList_info_out.getValidFrom().getTime());
        assertEquals("ValidTo", PriceList_in.getValidTo().getTime(), PriceList_info_out.getValidTo().getTime());

        assertEquals("CurrencyID", PriceList_in.getCurrencyID(), PriceList_info_out.getCurrencyID());
    }

    /**
     * Delete a PriceList and check if no error occured.
     */
    public void testDelete() throws RemoteException {
        log.info("priceListService.delete called");
        TDelete_Return[] PriceLists_delete_out = priceListService.delete(new String[]{path + alias});

        // test if deletion was successful
        assertEquals("delete result set", 1, PriceLists_delete_out.length);

        TDelete_Return PriceList_delete_out = PriceLists_delete_out[0];
        
        if (PriceList_delete_out.getError() == null) {
            log.info("successfully deleted PriceList: " + PriceList_delete_out.getPath());
        } else {
            log.severe("an error occured (Epages Error):\n" + PriceList_delete_out.getError().getMessage());
        }

        assertEquals("deleted?", new Boolean(true), PriceList_delete_out.getDeleted());
    }

    /**
     * Test if a PriceList exists or not
     *
     * @param expected if false the Test will be successful if the PriceList does NOT exist
     */
    public void testExists(boolean expected) throws RemoteException {
        log.info("priceListService.exists called");
        TExists_Return[] PriceLists_exists_out = priceListService.exists(new String[]{path + alias});

        // test if exists check was successful
        assertEquals("exists result set", 1, PriceLists_exists_out.length);
        
        TExists_Return PriceList_exists_out = PriceLists_exists_out[0];
        
        if (PriceList_exists_out.getError() == null) {
            log.info("successfully check PriceList existance: " + PriceList_exists_out.getPath());
        } else {
            log.severe("an error occured (Epages Error):\n" + PriceList_exists_out.getError().getMessage());
        }
    
        assertEquals("exists?", new Boolean(expected), PriceList_exists_out.getExists());
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>create a PriceList</li>
     * <li>test if this PriceList exists afterwards</li>
     * <li>retrieve info about this PriceList, and check if the data equals to the input data of create</li>
     * <li>updates the PriceList</li>
     * <li>again retrieve data, and check if the data are equal to the update input data</li>
     * <li>delete the PriceList</li>
     * <li>check if the PriceList still exists</li>
     * </ol>
     */
    @Test
    public void testAll() throws RemoteException {
        testCreate();
        testExists(true);
        testGetInfo(false);
        testUpdate();
        testGetInfo(true);
        testDelete();
        testExists(false);
    }
}
