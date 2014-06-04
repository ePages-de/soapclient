package de.epages.ws.update;

import static de.epages.ws.update.Assert.assertAfterOrSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.customer5.CustomerServiceClient;
import de.epages.ws.customer5.CustomerServiceClientImpl;
import de.epages.ws.customer5.model.TCreate_Input;
import de.epages.ws.customer5.model.TCreate_Return;
import de.epages.ws.customer5.model.TDelete_Return;
import de.epages.ws.customer5.model.TExists_Return;
import de.epages.ws.customer5.model.TUpdate_Input;
import de.epages.ws.customer5.model.TUpdate_Return;
import de.epages.ws.shop3.model.TAddressNamed;
import de.epages.ws.update.stub.TFindDeletes_Return;
import de.epages.ws.update.stub.TFindUpdates_Return;

public class UpdateCustomerServiceTest {

    private static final String CUSTOMER_ALIAS = "javatest-sync-customer";

    private static final WebServiceConfiguration config = new WebServiceTestConfiguration();

    private static final CustomerServiceClient customerService = new CustomerServiceClientImpl(config);

    private static final UpdateServiceClient updateService = new UpdateServiceClientImpl(config);

    private static final GregorianCalendar LAST_YEAR = DateTime.now().minusYears(1).toGregorianCalendar();

    @Before
    public void before() {
        createCustomer(CUSTOMER_ALIAS);
    }

    @After
    public void tearDown() {
        deleteCustomer(CUSTOMER_ALIAS);
    }

    @Test
    public void testFindDeletes() throws InterruptedException {
        Calendar latestDelete = updateService.findDeletes(LAST_YEAR, "Customer").getLatestDelete();
        TFindDeletes_Return deleteSet = updateService.findDeletes(latestDelete, "Customer");
        int existingDeletes = deleteSet.getDeletes().length;

        deleteCustomer(CUSTOMER_ALIAS);

        deleteSet = updateService.findDeletes(latestDelete, "Customer");

        assertEquals(existingDeletes + 1, deleteSet.getDeletes().length);
        assertAfterOrSame(latestDelete, deleteSet.getLatestDelete());
        assertEquals("Customers/" + CUSTOMER_ALIAS, deleteSet.getDeletes()[0].getPath());
    }

    @Test
    public void testFindCustomerAddressUpdates() throws InterruptedException {
        Calendar latestUpdate = updateService.findUpdates(LAST_YEAR, "Customer", "Address").getLatestUpdate();

        TFindUpdates_Return updateSet = updateService.findUpdates(latestUpdate, "Customer", "Address");
        int existingUpdates = updateSet.getUpdates().length;

        Thread.sleep(1000);
        updateCustomerAddress(CUSTOMER_ALIAS);

        updateSet = updateService.findUpdates(latestUpdate, "Customer", "Address");
        assertEquals(existingUpdates + 1, updateSet.getUpdates().length);
        assertAfterOrSame(latestUpdate, updateSet.getLatestUpdate());
        assertTrue("Actual: " + updateSet.getUpdates()[0].getPath(),
                updateSet.getUpdates()[0].getPath().endsWith("Customers/" + CUSTOMER_ALIAS));
    }

    private void createCustomer(String alias) {
        TCreate_Input customer_in = new TCreate_Input();
        customer_in.setAlias(alias);
        customer_in.setCustomerGroup("Groups/NewCustomer");
        customer_in.setTaxArea("/TaxMatrixGermany/EU");
        customer_in.setTaxModel("gross");
        customer_in.setCurrencyID("EUR");
        TAddressNamed billingAddress = new TAddressNamed();
        billingAddress.setFirstName("Klaus");
        billingAddress.setStreet("Musterstraße 2");
        customer_in.setBillingAddress(billingAddress);
        customer_in.setAttributes(new TAttribute[] {});
        TCreate_Return[] created = customerService.create(new TCreate_Input[] { customer_in });
        assertTrue(created[0].getCreated());
    }

    private void updateCustomerAddress(String alias) {
        TUpdate_Input customer_update = new TUpdate_Input();
        customer_update.setPath("Customers/" + alias);
        TAddressNamed billingAddress = new TAddressNamed();
        billingAddress.setFirstName("Hans");
        billingAddress.setStreet("OtherStreet 2b");
        billingAddress.setCodePorte("12345");
        customer_update.setBillingAddress(billingAddress);
        TUpdate_Return[] updated = customerService.update(new TUpdate_Input[] { customer_update });
        assertTrue(updated[0].getUpdated());
    }

    private void deleteCustomer(String alias) {
        if (!exists(alias)) {
            return;
        }
        TDelete_Return[] delete = customerService.delete(new String[] { "Customers/" + alias });
        assertTrue(delete[0].getDeleted());
    }

    private boolean exists(String alias) {
        TExists_Return[] customers_out = customerService.exists(new String[] { "Customers/" + alias });
        return customers_out[0].getExists();
    }

}
