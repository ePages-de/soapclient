package de.epages.WebServices.CatalogService3;

import de.epages.WebServices.CatalogService3.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;

import org.junit.*;
import static org.junit.Assert.*;

import java.text.*;
import java.util.*;
import java.util.logging.Logger;
import java.rmi.RemoteException;

import java.net.MalformedURLException;

/**
 * A JUnit TestSuite to test epages Catalog WebServices.
 */
public class Catalog3TestCase extends WebServiceConfiguration {
    private static Logger log = Logger.getLogger(Catalog3TestCase.class.getName());

    private Bind_Catalog_SOAPStub catalogService;

    TCreate_Input Catalog_in = new TCreate_Input();
    TUpdate_Input Catalog_up = new TUpdate_Input();
    TSortProducts_Input Catalog_sort1 = new TSortProducts_Input();
    TSortProducts_Input Catalog_sort2 = new TSortProducts_Input();
    TSortProducts_Input Catalog_sort3 = new TSortProducts_Input();

    String path = "/Shops/DemoShop/Categories";
    String alias = "java_test-1";
    String full = path + "/" + alias;
    
    String sort3 = path + "/Tents";
    String sort2 = sort3 + "/FamilyTents";
    String sort1 = sort3 + "/IndividualTents";

    SimpleDateFormat sdf_in  = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    SimpleDateFormat sdf_out = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        log.info("Catalog3TestCase: setUp");

        // log and bind web service
        CatalogService serviceLocator = new CatalogServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_CatalogAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);
        catalogService = new Bind_Catalog_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);
        catalogService.setUsername(WEBSERVICE_LOGIN);
        catalogService.setPassword(WEBSERVICE_PASSWORD);

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

        TAttribute layout1 = new TAttribute();
        layout1.setName("Content-Order");
        layout1.setValue("Base_Products_Pages");
        TAttribute layout2 = new TAttribute();
        layout2.setName("Content-Pages");
        layout2.setValue("Pages_SingleColumn");
        Catalog_in.setTemplateTypes(new TAttribute[]{layout1,layout2});


        Catalog_up.setPath(full);
        Catalog_up.setName(new TLocalizedValue[]{
                    new TLocalizedValue("de", "veränderter Test-Katalog"),
                    new TLocalizedValue("en", "updated test Catalog"),
                });

        dateStr = sdf_in.format(new GregorianCalendar(2005,11,25,18,00).getTime());
        TAttribute attr_update = new TAttribute();
        attr_update.setName("Date");
        attr_update.setType("DateTime");
        attr_update.setValue(dateStr);
        Catalog_up.setAttributes(new TAttribute[]{attr_update});

        TAttribute layout3 = new TAttribute();
        layout3.setName("Content-Order");
        layout3.setValue("Pages_Products_Base");
        TAttribute layout4 = new TAttribute();
        layout4.setName("Content-Pages");
        layout4.setValue("Pages_TwoColumns");
        Catalog_up.setTemplateTypes(new TAttribute[]{layout3,layout4});
        
        
        Catalog_sort1.setPath(sort1);
        Catalog_sort2.setPath(sort2);
        Catalog_sort2.setSort("byPriceDESC");
        Catalog_sort3.setPath(sort3);
        Catalog_sort3.setSort("byPriceASC");
        Catalog_sort3.setAllSub(true);
        
        // delete the test catalog if it exists
        try {
            TExists_Return[] Catalogs_exists_out = catalogService.exists(new String[]{full});
            if( Catalogs_exists_out[0].getExists() ) {
            	catalogService.delete(new String[]{full});
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
    	try {
        	TCreate_Input[] Catalogs_in = new TCreate_Input[]{Catalog_in};
        	TCreate_Return[] Catalogs_out = catalogService.create(Catalogs_in);

        	// test if creation was successful
            assertEquals("create result set", 1, Catalogs_out.length );
            assertEquals("created?", new Boolean(true), Catalogs_out[0].getCreated());
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Update a Catalog and check if the update was successful
     */
    public void testUpdate() {
        try {
        	TUpdate_Input[] Catalogs_up = new TUpdate_Input[]{Catalog_up};
        	TUpdate_Return[] Catalogs_out = catalogService.update(Catalogs_up);

            // test if update was successful
            assertEquals("update result set", 1, Catalogs_out.length);
            assertTrue("updated?", Catalogs_out[0].getUpdated());
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieve information about an Catalog. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        try {
            TGetInfo_Return[] Catalogs_out = catalogService.getInfo(
                new String[]{full},
                new String[]{"Date"},
                new String[]{"de", "en"}
            );

            // test if getinfo was successful and if all data are equal to input
            assertEquals("getInfo result set", 1, Catalogs_out.length);
            assertEquals("catalog alias", alias, Catalogs_out[0].getAlias());
            assertEquals("Number of languages", 2, Catalogs_out[0].getName().length );
            HashMap<String, String> hash = new HashMap<String, String>();
            hash.put(Catalogs_out[0].getName()[0].getLanguageCode(), Catalogs_out[0].getName()[0].getValue());
            hash.put(Catalogs_out[0].getName()[1].getLanguageCode(), Catalogs_out[0].getName()[1].getValue());

            if (isAlreadyUpdated) {

            	try {
            		Date date_in  = sdf_in.parse(Catalog_up.getAttributes()[0].getValue());
            		Date date_out = sdf_out.parse(Catalogs_out[0].getAttributes()[0].getValue());
                    assertEquals("Date", date_in, date_out);
            	} catch (ParseException e) {
                    e.printStackTrace();
            	}

                assertEquals("updated localized Name", Catalog_up.getName()[0].getValue(), hash.get(Catalog_up.getName()[0].getLanguageCode()));
                assertEquals("updated localized Name", Catalog_up.getName()[1].getValue(), hash.get(Catalog_up.getName()[1].getLanguageCode()));
            }
            else {

            	try {
            		Date date_in  = sdf_in.parse(Catalog_in.getAttributes()[0].getValue());
            		Date date_out = sdf_out.parse(Catalogs_out[0].getAttributes()[0].getValue());
                    assertEquals("Date", date_in, date_out);
            	} catch (ParseException e) {
                    e.printStackTrace();
            	}

                assertEquals("initial localized Name", Catalog_in.getName()[0].getValue(), hash.get(Catalog_up.getName()[0].getLanguageCode()));
                assertEquals("initial localized Name", Catalog_in.getName()[1].getValue(), hash.get(Catalog_up.getName()[1].getLanguageCode()));
            }

            assertEquals("ParentCatalog", Catalog_in.getParentCatalog(), Catalogs_out[0].getParentCatalog());
            assertEquals("IsVisible", Catalog_in.getIsVisible(), Catalogs_out[0].getIsVisible());

        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete a Catalog and check if no error occured.
     */
    public void testDelete() {
        try {
        	TDelete_Return[] Catalogs_out = catalogService.delete( new String[]{full});

            // test if update was successful
            assertEquals("update result set", 1, Catalogs_out.length);
            assertTrue("deleted?", Catalogs_out[0].getDeleted());
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test if a Catalog exists or not
     *
     * @param expected if false the Test will be successful if the Catalog does NOT exist
     */
    public void testExists(boolean expected) {
        try {
        	TExists_Return[] Catalogs_out = catalogService.exists( new String[]{full});

            // test if update was successful
            assertEquals("update result set", 1, Catalogs_out.length);
            assertEquals("exists?", new Boolean(expected), Catalogs_out[0].getExists());
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sort products of a Catalog and check if the sorting was successful
     */
    public void testSort(int casenumber ) {
        try {
        	TSortProducts_Input[] Catalogs_in;
            if (casenumber==1) {
            	Catalogs_in = new TSortProducts_Input[]{Catalog_sort1};
            } else if (casenumber==2) {
            	Catalogs_in = new TSortProducts_Input[]{Catalog_sort2};
            } else  {
            	Catalogs_in = new TSortProducts_Input[]{Catalog_sort3};
            };

        	TSortProducts_Return[] Catalogs_out = catalogService.sortProducts(Catalogs_in);

            // test if update was successful
            assertEquals("sort result set", 1, Catalogs_out.length);
            assertTrue("sorted?", Catalogs_out[0].getSorted());
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
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
     * <li>sort products of two differnt categories and sort it back recursively</li>
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
        testSort(1);
        testSort(2);
        testSort(3);
    }
}
