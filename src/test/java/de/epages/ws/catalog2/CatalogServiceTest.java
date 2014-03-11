package de.epages.ws.catalog2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.catalog2.model.TCreate_Input;
import de.epages.ws.catalog2.model.TCreate_Return;
import de.epages.ws.catalog2.model.TDelete_Return;
import de.epages.ws.catalog2.model.TExists_Return;
import de.epages.ws.catalog2.model.TGetInfo_Return;
import de.epages.ws.catalog2.model.TSortProducts_Input;
import de.epages.ws.catalog2.model.TSortProducts_Return;
import de.epages.ws.catalog2.model.TUpdate_Input;
import de.epages.ws.catalog2.model.TUpdate_Return;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.common.model.TLocalizedValue;

public class CatalogServiceTest {
    private static final CatalogServiceClientImpl serviceClient = new CatalogServiceClientImpl(new WebServiceTestConfiguration());
    private final TCreate_Input Catalog_in = new TCreate_Input();
    private final TUpdate_Input Catalog_update = new TUpdate_Input();
    private final TSortProducts_Input Catalog_sort1 = new TSortProducts_Input();
    private final TSortProducts_Input Catalog_sort2 = new TSortProducts_Input();
    private final TSortProducts_Input Catalog_sort3 = new TSortProducts_Input();

    private final String path = "/Shops/DemoShop/Categories";
    private final String alias = "java_test-1";
    private final String full = path + "/" + alias;

    private final String sort3 = path + "/Tents";
    private final String sort2 = sort3 + "/FamilyTents";
    private final String sort1 = sort3 + "/IndividualTents";

    private final SimpleDateFormat sdf_in = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private final SimpleDateFormat sdf_out = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // create test Catalogs that can be used with the create and update
        // methods
        Catalog_in.setAlias(alias);
        Catalog_in.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Test-Katalog"), new TLocalizedValue("en", "test Catalog"), });
        Catalog_in.setIsVisible(true);
        Catalog_in.setParentCatalog(path);

        String dateStr = new String(sdf_in.format(new GregorianCalendar(2005, 11, 24, 18, 00).getTime()));
        TAttribute attr1 = new TAttribute();
        attr1.setName("Date");
        attr1.setType("DateTime");
        attr1.setValue(dateStr);
        Catalog_in.setAttributes(new TAttribute[] { attr1 });

        Catalog_update.setPath(full);
        Catalog_update.setName(new TLocalizedValue[] { new TLocalizedValue("de", "veränderter Test-Katalog"),
                new TLocalizedValue("en", "updated test Catalog"), });

        dateStr = sdf_in.format(new GregorianCalendar(2005, 11, 25, 18, 00).getTime());
        TAttribute attr_update = new TAttribute();
        attr_update.setName("Date");
        attr_update.setType("DateTime");
        attr_update.setValue(dateStr);
        Catalog_update.setAttributes(new TAttribute[] { attr_update });

        Catalog_sort1.setPath(sort1);

        Catalog_sort2.setPath(sort2);
        Catalog_sort2.setSort("byPriceDESC");

        Catalog_sort3.setPath(sort3);
        Catalog_sort3.setSort("byPriceASC");
        Catalog_sort3.setAllSub(true);

        // delete the test catalog if it exists
        TExists_Return[] Catalogs_exists_out = serviceClient.exists(new String[] { full });
        if (Catalogs_exists_out[0].getExists()) {
            serviceClient.delete(new String[] { full });
        }
    }

    /**
     * Create a Catalog and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Input[] Catalogs_create_in = { Catalog_in };
        TCreate_Return[] Catalogs_create_out = serviceClient.create(Catalogs_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, Catalogs_create_out.length);
        assertTrue("created?", Catalogs_create_out[0].getCreated());
    }

    /**
     * Update a Catalog and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Input[] Catalogs_update_in = { Catalog_update };

        TUpdate_Return[] Catalogs_update_out = serviceClient.update(Catalogs_update_in);

        // test if update was successful
        assertEquals("update result set", 1, Catalogs_update_out.length);
        assertTrue("updated?", Catalogs_update_out[0].getUpdated());
    }

    /**
     * Retrieve information about an Catalog. Check if the returned data are
     * equal to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     * @throws ParseException
     */
    public void testGetInfo(boolean isAlreadyUpdated) throws ParseException {
        TGetInfo_Return[] Catalogs_info_out = serviceClient.getInfo(new String[] { full }, new String[] { "Date" }, new String[] { "de",
                "en" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getInfo result set", 1, Catalogs_info_out.length);

        TGetInfo_Return Catalog_info_out = Catalogs_info_out[0];

        assertEquals("catalog alias", alias, Catalog_info_out.getAlias());
        assertEquals("Number of languages", 2, Catalog_info_out.getName().length);
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put(Catalog_info_out.getName()[0].getLanguageCode(), Catalog_info_out.getName()[0].getValue());
        hash.put(Catalog_info_out.getName()[1].getLanguageCode(), Catalog_info_out.getName()[1].getValue());

        if (isAlreadyUpdated) {

            Date date_in = sdf_in.parse(Catalog_update.getAttributes()[0].getValue());
            Date date_out = sdf_out.parse(Catalog_info_out.getAttributes()[0].getValue());
            assertEquals("Date", date_in, date_out);

            assertEquals("updated localized Name", Catalog_update.getName()[0].getValue(),
                    hash.get(Catalog_update.getName()[0].getLanguageCode()));
            assertEquals("updated localized Name", Catalog_update.getName()[1].getValue(),
                    hash.get(Catalog_update.getName()[1].getLanguageCode()));
        } else {

            Date date_in = sdf_in.parse(Catalog_in.getAttributes()[0].getValue());
            Date date_out = sdf_out.parse(Catalog_info_out.getAttributes()[0].getValue());
            assertEquals("Date", date_in, date_out);

            assertEquals("initial localized Name", Catalog_in.getName()[0].getValue(),
                    hash.get(Catalog_update.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", Catalog_in.getName()[1].getValue(),
                    hash.get(Catalog_update.getName()[1].getLanguageCode()));
        }

        assertEquals("ParentCatalog", Catalog_in.getParentCatalog(), Catalog_info_out.getParentCatalog());
        assertEquals("IsVisible", Catalog_in.getIsVisible(), Catalog_info_out.getIsVisible());
    }

    /**
     * Delete a Catalog and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] Catalogs_delete_out = serviceClient.delete(new String[] { full });

        // test if deletion was successful
        assertEquals("delete result set", 1, Catalogs_delete_out.length);

        TDelete_Return Catalog_delete_out = Catalogs_delete_out[0];

        assertTrue("deleted?", Catalog_delete_out.getDeleted());
    }

    /**
     * Test if a Catalog exists or not
     *
     * @param expected
     *            if false the Test will be successful if the Catalog does NOT
     *            exist
     */
    public void testExists(boolean expected) {
        TExists_Return[] Catalogs_exists_out = serviceClient.exists(new String[] { full });

        // test if exists check was successful
        assertEquals("exists result set", 1, Catalogs_exists_out.length);

        TExists_Return Catalog_exists_out = Catalogs_exists_out[0];

        assertEquals("exists?", expected, Catalog_exists_out.getExists());
    }

    /**
     * Sort products of a Catalog and check if the sorting was successful
     */
    public void testSort(int casenumber) {
        TSortProducts_Input[] Catalogs_sort_in = null;
        if (casenumber == 1) {
            Catalogs_sort_in = new TSortProducts_Input[] { Catalog_sort1 };
        } else if (casenumber == 2) {
            Catalogs_sort_in = new TSortProducts_Input[] { Catalog_sort2 };
        } else {
            Catalogs_sort_in = new TSortProducts_Input[] { Catalog_sort3 };
        }

        TSortProducts_Return[] Catalogs_sort_out = serviceClient.sortProducts(Catalogs_sort_in);

        // test if update was successful
        assertEquals("sort result set", 1, Catalogs_sort_out.length);
        assertTrue("sorted?", Catalogs_sort_out[0].getSorted());
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>create a Catalog</li>
     * <li>test if this Catalog exists afterwards</li>
     * <li>retrieve info about this Catalog, and check if the data equals to the
     * input data of create</li>
     * <li>updates the Catalog</li>
     * <li>again retrieve data, and check if the data are equal to the update
     * input data</li>
     * <li>delete the Catalog</li>
     * <li>check if the Catalog still exists</li>
     * <li>sort products of two differnt categories and sort it back recursively
     * </li>
     * </ol>
     *
     * @throws ParseException
     */
    @Test
    public void testAll() throws ParseException {
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
