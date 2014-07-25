package de.epages.ws.catalog3;

import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.ShopWebServiceTestConfiguration;
import de.epages.ws.catalog3.model.TCreate_Input;
import de.epages.ws.catalog3.model.TCreate_Return;
import de.epages.ws.catalog3.model.TDelete_Return;
import de.epages.ws.catalog3.model.TExists_Return;
import de.epages.ws.catalog3.model.TGetInfo_Return;
import de.epages.ws.catalog3.model.TSortProducts_Input;
import de.epages.ws.catalog3.model.TSortProducts_Return;
import de.epages.ws.catalog3.model.TUpdate_Input;
import de.epages.ws.catalog3.model.TUpdate_Return;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.common.model.TLocalizedValue;

public class CatalogServiceTest {

    private final CatalogServiceClientImpl catalogService = new CatalogServiceClientImpl(new ShopWebServiceTestConfiguration());

    private final TCreate_Input Catalog_in = new TCreate_Input();
    private final TUpdate_Input Catalog_up = new TUpdate_Input();
    private final TSortProducts_Input Catalog_sort1 = new TSortProducts_Input();
    private final TSortProducts_Input Catalog_sort2 = new TSortProducts_Input();
    private final TSortProducts_Input Catalog_sort3 = new TSortProducts_Input();

    private final String path = "Categories";
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

        TAttribute layout1 = new TAttribute();
        layout1.setName("Content-Order");
        layout1.setValue("Base_Products_Pages");
        TAttribute layout2 = new TAttribute();
        layout2.setName("Content-Pages");
        layout2.setValue("Pages_SingleColumn");
        Catalog_in.setTemplateTypes(new TAttribute[] { layout1, layout2 });

        Catalog_up.setPath(full);
        Catalog_up.setName(new TLocalizedValue[] { new TLocalizedValue("de", "veränderter Test-Katalog"),
                new TLocalizedValue("en", "updated test Catalog"), });

        dateStr = sdf_in.format(new GregorianCalendar(2005, 11, 25, 18, 00).getTime());
        TAttribute attr_update = new TAttribute();
        attr_update.setName("Date");
        attr_update.setType("DateTime");
        attr_update.setValue(dateStr);
        Catalog_up.setAttributes(new TAttribute[] { attr_update });

        TAttribute layout3 = new TAttribute();
        layout3.setName("Content-Order");
        layout3.setValue("Pages_Products_Base");
        TAttribute layout4 = new TAttribute();
        layout4.setName("Content-Pages");
        layout4.setValue("Pages_TwoColumns");
        Catalog_up.setTemplateTypes(new TAttribute[] { layout3, layout4 });

        Catalog_sort1.setPath(sort1);
        Catalog_sort2.setPath(sort2);
        Catalog_sort2.setSort("byPriceDESC");
        Catalog_sort3.setPath(sort3);
        Catalog_sort3.setSort("byPriceASC");
        Catalog_sort3.setAllSub(true);

        // delete the test catalog if it exists
        TExists_Return[] Catalogs_exists_out = catalogService.exists(new String[] { full });
        if (Catalogs_exists_out[0].getExists()) {
            catalogService.delete(new String[] { full });
        }
    }

    /**
     * Create a Catalog and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Input[] Catalogs_in = new TCreate_Input[] { Catalog_in };
        TCreate_Return[] Catalogs_out = catalogService.create(Catalogs_in);

        // test if creation was successful
        assertEquals("create result set", 1, Catalogs_out.length);
        assertTrue("created?", Catalogs_out[0].getCreated());
    }

    /**
     * Update a Catalog and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Input[] Catalogs_up = new TUpdate_Input[] { Catalog_up };
        TUpdate_Return[] Catalogs_out = catalogService.update(Catalogs_up);

        // test if update was successful
        assertEquals("update result set", 1, Catalogs_out.length);
        assertTrue("updated?", Catalogs_out[0].getUpdated());
    }

    /**
     * Retrieve information about an Catalog. Check if the returned data are
     * equal to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        TGetInfo_Return[] Catalogs_out = catalogService
                .getInfo(new String[] { full }, new String[] { "Date" }, new String[] { "de", "en" });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getInfo result set", 1, Catalogs_out.length);
        assertEquals("catalog alias", alias, Catalogs_out[0].getAlias());
        assertEquals("Number of languages", 2, Catalogs_out[0].getName().length);
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put(Catalogs_out[0].getName()[0].getLanguageCode(), Catalogs_out[0].getName()[0].getValue());
        hash.put(Catalogs_out[0].getName()[1].getLanguageCode(), Catalogs_out[0].getName()[1].getValue());

        if (isAlreadyUpdated) {

            try {
                Date date_in = sdf_in.parse(Catalog_up.getAttributes()[0].getValue());
                Date date_out = sdf_out.parse(Catalogs_out[0].getAttributes()[0].getValue());
                assertEquals("Date", date_in, date_out);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            assertEquals("updated localized Name", Catalog_up.getName()[0].getValue(), hash.get(Catalog_up.getName()[0].getLanguageCode()));
            assertEquals("updated localized Name", Catalog_up.getName()[1].getValue(), hash.get(Catalog_up.getName()[1].getLanguageCode()));
        } else {

            try {
                Date date_in = sdf_in.parse(Catalog_in.getAttributes()[0].getValue());
                Date date_out = sdf_out.parse(Catalogs_out[0].getAttributes()[0].getValue());
                assertEquals("Date", date_in, date_out);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            assertEquals("initial localized Name", Catalog_in.getName()[0].getValue(), hash.get(Catalog_up.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", Catalog_in.getName()[1].getValue(), hash.get(Catalog_up.getName()[1].getLanguageCode()));
        }

        assertThat(Catalogs_out[0].getParentCatalog(), endsWith(Catalog_in.getParentCatalog()));
        assertEquals("IsVisible", Catalog_in.getIsVisible(), Catalogs_out[0].getIsVisible());
    }

    /**
     * Delete a Catalog and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] Catalogs_out = catalogService.delete(new String[] { full });

        // test if update was successful
        assertEquals("update result set", 1, Catalogs_out.length);
        assertTrue("deleted?", Catalogs_out[0].getDeleted());
    }

    /**
     * Test if a Catalog exists or not
     *
     * @param expected
     *            if false the Test will be successful if the Catalog does NOT
     *            exist
     */
    public void testExists(boolean expected) {
        TExists_Return[] Catalogs_out = catalogService.exists(new String[] { full });

        // test if update was successful
        assertEquals("update result set", 1, Catalogs_out.length);
        assertEquals("exists?", expected, Catalogs_out[0].getExists());
    }

    /**
     * Sort products of a Catalog and check if the sorting was successful
     */
    public void testSort(int casenumber) {
        TSortProducts_Input[] Catalogs_in;
        if (casenumber == 1) {
            Catalogs_in = new TSortProducts_Input[] { Catalog_sort1 };
        } else if (casenumber == 2) {
            Catalogs_in = new TSortProducts_Input[] { Catalog_sort2 };
        } else {
            Catalogs_in = new TSortProducts_Input[] { Catalog_sort3 };
        }
        ;

        TSortProducts_Return[] Catalogs_out = catalogService.sortProducts(Catalogs_in);

        // test if update was successful
        assertEquals("sort result set", 1, Catalogs_out.length);
        assertTrue("sorted?", Catalogs_out[0].getSorted());
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
