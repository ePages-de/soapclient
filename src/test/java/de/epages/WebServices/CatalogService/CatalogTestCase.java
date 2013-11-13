package de.epages.WebServices.CatalogService;

import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

import de.epages.WebServices.WebServiceTestConfiguration;
import de.epages.WebServices.CatalogService.Stub.TAttribute;
import de.epages.WebServices.CatalogService.Stub.TCreate_Input;
import de.epages.WebServices.CatalogService.Stub.TCreate_Return;
import de.epages.WebServices.CatalogService.Stub.TDelete_Return;
import de.epages.WebServices.CatalogService.Stub.TExists_Return;
import de.epages.WebServices.CatalogService.Stub.TGetInfo_Return;
import de.epages.WebServices.CatalogService.Stub.TLocalizedValue;
import de.epages.WebServices.CatalogService.Stub.TUpdate_Input;
import de.epages.WebServices.CatalogService.Stub.TUpdate_Return;

/**
 * A JUnit TestSuite to test epages Catalog WebServices.
 * <p/>
 * User: tmangner
 * Date: 08.12.2005
 * Time: 14:19:18
 */
public class CatalogTestCase {
    private static Logger log = Logger.getLogger(CatalogTestCase.class.getName());
    CatalogServiceClient serviceClient;
    TCreate_Input Catalog_in = new TCreate_Input();
    TUpdate_Input Catalog_update = new TUpdate_Input();

    String path = "/Shops/DemoShop/Categories";
    String alias = "java_test-1";
    String full = path + "/" + alias;

    SimpleDateFormat sdf_in  = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    SimpleDateFormat sdf_out = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new CatalogServiceClient(new WebServiceTestConfiguration());

        // create test Catalogs that can be used with the create and update methods
        Catalog_in.setAlias(alias);
        Catalog_in.setName(new TLocalizedValue[]{
                    new TLocalizedValue("de", "Test-Katalog"),
                    new TLocalizedValue("en", "test Catalog"),
                });
        Catalog_in.setIsVisible(true);
        Catalog_in.setParentCatalog(path);

        String dateStr = new String(sdf_in.format(new GregorianCalendar(2005,11,24,18,00).getTime()));
        TAttribute attr1 = new TAttribute();
        attr1.setName("Date");
        attr1.setType("DateTime");
        attr1.setValue(dateStr);
        Catalog_in.setAttributes(new TAttribute[]{attr1});

        Catalog_update.setPath(full);
        Catalog_update.setName(new TLocalizedValue[]{
                    new TLocalizedValue("de", "veränderter Test-Katalog"),
                    new TLocalizedValue("en", "updated test Catalog"),
                });

        dateStr = sdf_in.format(new GregorianCalendar(2005,11,25,18,00).getTime());
        TAttribute attr_update = new TAttribute();
        attr_update.setName("Date");
        attr_update.setType("DateTime");
        attr_update.setValue(dateStr);
        Catalog_update.setAttributes(new TAttribute[]{attr_update});
        
        // delete the test catalog if it exists
        List<TExists_Return> Catalogs_exists_out;
        try {           
            Catalogs_exists_out = serviceClient.existsCatalog(new String[]{full});
            if( Catalogs_exists_out.get(0).getExists() ) {
                serviceClient.deleteCatalog(new String[]{full});
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a Catalog and check if the creation was successful
     */
    public void testCreate() {
        List<TCreate_Input> Catalogs_create_in = new ArrayList<>();
        Catalogs_create_in.add(Catalog_in);

        List<TCreate_Return> Catalogs_create_out = new ArrayList<>();

        try {
            Catalogs_create_out = serviceClient.createCatalog(Catalogs_create_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        assertEquals("create result set", 1, Catalogs_create_out.size());
        assertEquals("created?", new Boolean(true), Catalogs_create_out.get(0).getCreated());
    }

    /**
     * Update a Catalog and check if the update was successful
     */
    public void testUpdate() {
        List<TUpdate_Input> Catalogs_update_in = new ArrayList<>();
        Catalogs_update_in.add(Catalog_update);

        List<TUpdate_Return> Catalogs_update_out = new ArrayList<>();

        try {
            Catalogs_update_out = serviceClient.updateCatalog(Catalogs_update_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if update was successful
        assertEquals("update result set", 1, Catalogs_update_out.size());
        assertEquals("updated?", new Boolean(true), Catalogs_update_out.get(0).getUpdated());
    }

    /**
     * Retrieve information about an Catalog. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        List<TGetInfo_Return> Catalogs_info_out = new ArrayList<>();
        try {
            Catalogs_info_out = serviceClient.getCatalogInfo(
                new String[]{full},
                new String[]{"Date"},
                new String[]{"de", "en"}
            );
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getInfo result set", 1, Catalogs_info_out.size());

        TGetInfo_Return Catalog_info_out = Catalogs_info_out.get(0);

        assertEquals("catalog alias", alias, Catalog_info_out.getAlias());
        assertEquals("Number of languages", 2, Catalog_info_out.getName().length );
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put(Catalog_info_out.getName()[0].getLanguageCode(), Catalog_info_out.getName()[0].getValue());
        hash.put(Catalog_info_out.getName()[1].getLanguageCode(), Catalog_info_out.getName()[1].getValue());

        if (isAlreadyUpdated) {

        	try {
        		Date date_in  = sdf_in.parse(Catalog_update.getAttributes()[0].getValue());
        		Date date_out = sdf_out.parse(Catalog_info_out.getAttributes()[0].getValue());
                assertEquals("Date", date_in, date_out);
        	} catch (ParseException e) {
                e.printStackTrace();
        	}
            
            assertEquals("updated localized Name", Catalog_update.getName()[0].getValue(), hash.get(Catalog_update.getName()[0].getLanguageCode()));
            assertEquals("updated localized Name", Catalog_update.getName()[1].getValue(), hash.get(Catalog_update.getName()[1].getLanguageCode()));
        }
        else {
        	
        	try {
        		Date date_in  = sdf_in.parse(Catalog_in.getAttributes()[0].getValue());
        		Date date_out = sdf_out.parse(Catalog_info_out.getAttributes()[0].getValue());
                assertEquals("Date", date_in, date_out);
        	} catch (ParseException e) {
                e.printStackTrace();
        	}
            
            assertEquals("initial localized Name", Catalog_in.getName()[0].getValue(), hash.get(Catalog_update.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", Catalog_in.getName()[1].getValue(), hash.get(Catalog_update.getName()[1].getLanguageCode()));
        }

        assertEquals("ParentCatalog", Catalog_in.getParentCatalog(), Catalog_info_out.getParentCatalog());
        assertEquals("IsVisible", Catalog_in.getIsVisible(), Catalog_info_out.getIsVisible());
    }

    /**
     * Delete a Catalog and check if no error occured.
     */
    public void testDelete() {
        List<TDelete_Return> Catalogs_delete_out = new ArrayList<>();
        try {
            Catalogs_delete_out = serviceClient.deleteCatalog(new String[]{full});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if deletion was successful
        assertEquals("delete result set", 1, Catalogs_delete_out.size());

        TDelete_Return Catalog_delete_out = Catalogs_delete_out.get(0);

        assertEquals("deleted?", new Boolean(true), Catalog_delete_out.getDeleted());
    }

    /**
     * Test if a Catalog exists or not
     *
     * @param expected if false the Test will be successful if the Catalog does NOT exist
     */
    public void testExists(boolean expected) {
        List<TExists_Return> Catalogs_exists_out = new ArrayList<>();
        try {
            Catalogs_exists_out = serviceClient.existsCatalog(new String[]{full});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if exists check was successful
        assertEquals("exists result set", 1, Catalogs_exists_out.size());

        TExists_Return Catalog_exists_out = Catalogs_exists_out.get(0);

        assertEquals("exists?", new Boolean(expected), Catalog_exists_out.getExists());
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>create a Catalog</li>
     * <li>test if this Catalog exists afterwards</li>
     * <li>retrieve info about this Catalog, and check if the data equals to the input data of create</li>
     * <li>updates the Catalog</li>
     * <li>again retrieve data, and check if the data are equal to the update input data</li>
     * <li>delete the Catalog</li>
     * <li>check if the Catalog still exists</li>
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
