package de.epages.ws.pricelist2;

import static de.epages.ws.common.AssertNoError.assertNoError;
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
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.customergroup.CustomerGroupServiceClientImpl;
import de.epages.ws.customergroup.model.TGetList_Return;
import de.epages.ws.pricelist2.model.TCreate_Input;
import de.epages.ws.pricelist2.model.TCreate_Return;
import de.epages.ws.pricelist2.model.TDelete_Return;
import de.epages.ws.pricelist2.model.TExists_Return;
import de.epages.ws.pricelist2.model.TGetInfo_Return;
import de.epages.ws.pricelist2.model.TUpdate_Input;
import de.epages.ws.pricelist2.model.TUpdate_Return;

public class PriceListServiceTest {
    private static final PriceListServiceClientImpl priceListService = new PriceListServiceClientImpl(new WebServiceTestConfiguration());
    private static final CustomerGroupServiceClientImpl customerGroupService = new CustomerGroupServiceClientImpl(
            new WebServiceTestConfiguration());
    private final TCreate_Input PriceList_in = new TCreate_Input();
    private final TUpdate_Input PriceList_update = new TUpdate_Input();

    private final String path = "/Shops/DemoShop/PriceLists/";
    private final String alias = "java_test-1";

    private final SimpleDateFormat sdf_in = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private final SimpleDateFormat sdf_out = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        /* get customer groups at first */
        String customerGroupsPath = "/Shops/DemoShop/Groups/";
        String[] customerGroups = new String[] { customerGroupsPath + "Neukunde", customerGroupsPath + "Stammkunde" };
        TGetList_Return[] retGroups = customerGroupService.getList();

        char qw = '\"';
        customerGroups[0] = customerGroupsPath + qw + retGroups[0].getAlias() + qw;
        customerGroups[1] = customerGroupsPath + qw + retGroups[1].getAlias() + qw;

        // create test PriceLists that can be used with the create and update
        // methods
        PriceList_in.setAlias(alias);
        PriceList_in.setCurrencyID("EUR");
        PriceList_in.setCustomerGroups(new String[] { customerGroups[1] });
        PriceList_in.setCustomers(new String[] { "/Shops/DemoShop/Customers/1001" });
        PriceList_in.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Meine Preisliste"),
                new TLocalizedValue("en", "my price list") });
        PriceList_in.setValidFrom(new GregorianCalendar(2007, 12, 1));
        PriceList_in.setValidTo(new GregorianCalendar(2007, 12, 31));

        String dateStr = new String(sdf_in.format(new GregorianCalendar(2006, 1, 1, 0, 00).getTime()));
        TAttribute attr1 = new TAttribute();
        attr1.setName("CreationDate");
        attr1.setType("DateTime");
        attr1.setValue(dateStr);
        PriceList_in.setAttributes(new TAttribute[] { attr1 });

        PriceList_update.setPath(path + alias);
        PriceList_update.setName(new TLocalizedValue[] { new TLocalizedValue("de", "Meine geänderte Preisliste"),
                new TLocalizedValue("en", "my updated price list") });

        dateStr = new String(sdf_in.format(new GregorianCalendar(2006, 1, 1, 11, 11).getTime()));
        TAttribute attr_update = new TAttribute();
        attr_update.setName("CreationDate");
        attr_update.setType("DateTime");
        attr_update.setValue(dateStr);
        PriceList_update.setAttributes(new TAttribute[] { attr_update });
        PriceList_update.setCustomerGroups(new String[] { customerGroups[1] });
        PriceList_update.setCustomers(new String[] { "/Shops/DemoShop/Customers/1001" });

        // delete the test price list if it exists
        TExists_Return[] PriceLists_exists_out = priceListService.exists(new String[] { path + alias });
        if (PriceLists_exists_out[0].getExists()) {
            priceListService.delete(new String[] { path + alias });
        }
    }

    /**
     * Create a PriceList and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Input[] PriceLists_create_in = new TCreate_Input[] { PriceList_in };
        TCreate_Return[] PriceLists_create_out = priceListService.create(PriceLists_create_in);

        // test if creation was successful
        assertEquals("create result set", 1, PriceLists_create_out.length);

        TCreate_Return PriceList_create_out = PriceLists_create_out[0];
        assertNoError(PriceList_create_out.getError());
        assertEquals("created?", true, PriceList_create_out.getCreated());
    }

    /**
     * Update a PriceList and check if the update was successful
     */
    public void testUpdate() {
        TUpdate_Input[] PriceLists_update_in = new TUpdate_Input[] { PriceList_update };
        TUpdate_Return[] PriceLists_update_out = priceListService.update(PriceLists_update_in);
        // test if update was successful
        assertEquals("update result set", 1, PriceLists_update_out.length);

        TUpdate_Return PriceList_update_out = PriceLists_update_out[0];
        assertNoError(PriceList_update_out.getError());
        assertEquals("updated?", true, PriceList_update_out.getUpdated());
    }

    /**
     * Retrieve information about an PriceList. Check if the returned data are
     * equal to the data of create or update call
     *
     * @param isAlreadyUpdated
     *            if true check against update data, else against create data
     * @throws ParseException
     */
    public void testGetInfo(boolean isAlreadyUpdated) throws ParseException {
        TGetInfo_Return[] PriceLists_info_out = priceListService.getInfo(new String[] { path + alias }, new String[] { "CreationDate" },
                null // all languages
                );

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getinfo result set", 1, PriceLists_info_out.length);

        TGetInfo_Return PriceList_info_out = PriceLists_info_out[0];
        assertNoError(PriceList_info_out.getError());
        assertEquals("alias", alias, PriceList_info_out.getAlias());
        assertEquals("Number of languages", 2, PriceList_info_out.getName().length);
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put(PriceList_info_out.getName()[0].getLanguageCode(), PriceList_info_out.getName()[0].getValue());
        hash.put(PriceList_info_out.getName()[1].getLanguageCode(), PriceList_info_out.getName()[1].getValue());

        if (isAlreadyUpdated) {
            Date date_in = sdf_in.parse(PriceList_update.getAttributes()[0].getValue());
            Date date_out = sdf_out.parse(PriceList_info_out.getAttributes()[0].getValue());
            assertEquals("CreationDate", date_in, date_out);

            assertEquals("updated localized Name", PriceList_update.getName()[0].getValue(),
                    hash.get(PriceList_update.getName()[0].getLanguageCode()));
            assertEquals("updated localized Name", PriceList_update.getName()[1].getValue(),
                    hash.get(PriceList_update.getName()[1].getLanguageCode()));
        } else {

            Date date_in = sdf_in.parse(PriceList_in.getAttributes()[0].getValue());
            Date date_out = sdf_out.parse(PriceList_info_out.getAttributes()[0].getValue());
            assertEquals("CreationDate", date_in, date_out);

            assertEquals("initial localized Name", PriceList_in.getName()[0].getValue(),
                    hash.get(PriceList_update.getName()[0].getLanguageCode()));
            assertEquals("initial localized Name", PriceList_in.getName()[1].getValue(),
                    hash.get(PriceList_update.getName()[1].getLanguageCode()));
        }

        assertTrue("CustomerGroups result set", PriceList_info_out.getCustomerGroups().length == 1);
        assertTrue("Customers result set", PriceList_info_out.getCustomers().length == 1);

        assertEquals("ValidFrom", PriceList_in.getValidFrom().getTime(), PriceList_info_out.getValidFrom().getTime());
        assertEquals("ValidTo", PriceList_in.getValidTo().getTime(), PriceList_info_out.getValidTo().getTime());

        assertEquals("CurrencyID", PriceList_in.getCurrencyID(), PriceList_info_out.getCurrencyID());
    }

    /**
     * Delete a PriceList and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] PriceLists_delete_out = priceListService.delete(new String[] { path + alias });

        // test if deletion was successful
        assertEquals("delete result set", 1, PriceLists_delete_out.length);

        TDelete_Return PriceList_delete_out = PriceLists_delete_out[0];

        assertNoError(PriceList_delete_out.getError());

        assertEquals("deleted?", true, PriceList_delete_out.getDeleted());
    }

    /**
     * Test if a PriceList exists or not
     *
     * @param expected
     *            if false the Test will be successful if the PriceList does NOT
     *            exist
     */
    public void testExists(boolean expected) {
        TExists_Return[] PriceLists_exists_out = priceListService.exists(new String[] { path + alias });

        // test if exists check was successful
        assertEquals("exists result set", 1, PriceLists_exists_out.length);

        TExists_Return PriceList_exists_out = PriceLists_exists_out[0];

        assertNoError(PriceList_exists_out.getError());

        assertEquals("exists?", expected, PriceList_exists_out.getExists());
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>create a PriceList</li>
     * <li>test if this PriceList exists afterwards</li>
     * <li>retrieve info about this PriceList, and check if the data equals to
     * the input data of create</li>
     * <li>updates the PriceList</li>
     * <li>again retrieve data, and check if the data are equal to the update
     * input data</li>
     * <li>delete the PriceList</li>
     * <li>check if the PriceList still exists</li>
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
    }
}
