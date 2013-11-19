package de.epages.WebServices.BasketService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

import de.epages.WebServices.WebServiceTestConfiguration;
import de.epages.WebServices.BasketService.Stub.TAddressNamed;
import de.epages.WebServices.BasketService.Stub.TAttribute;
import de.epages.WebServices.BasketService.Stub.TCreate_Input;
import de.epages.WebServices.BasketService.Stub.TCreate_Return;
import de.epages.WebServices.BasketService.Stub.TDelete_Return;
import de.epages.WebServices.BasketService.Stub.TExists_Return;
import de.epages.WebServices.BasketService.Stub.TGetInfo_Return;
import de.epages.WebServices.BasketService.Stub.TLineItemContainerIn;
import de.epages.WebServices.BasketService.Stub.TProductLineItemIn;
import de.epages.WebServices.BasketService.Stub.TUpdate_Input;
import de.epages.WebServices.BasketService.Stub.TUpdate_Return;
/* import java.math.BigInteger; */

/**
 * A JUnit TestSuite to test epages Basket WebServices.
 */
public class BasketServiceTestCase {
    private static Logger log = Logger.getLogger(BasketServiceTestCase.class.getName());

    private BasketServiceClient basketService;
    TCreate_Input Basket_in = new TCreate_Input();
    TUpdate_Input Basket_up = new TUpdate_Input();
    TAttribute BasketAttr_in = new TAttribute("IsAddressOK","1",null,null);
    TAttribute BasketAttr_up = new TAttribute("IsAddressOK","0",null,null);
    TAddressNamed Address_in = new TAddressNamed();
    TAddressNamed Address_up = new TAddressNamed();

    String Alias = "java_test-1";
    String Customer = "/Shops/DemoShop/Customers/1001"; /* mmustermann */
    String BasketPath;

    String[] Baskets;
    String[] BasketAttributes = new String[]{"IsAddressOK"};
    String[] AddressAttributes = new String[]{"JobTitle" /*,"Salutation" */ };
    String[] ItemAttributes = new String[]{"Name"};

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        log.info("BasketTestCase: setUp");

        basketService = new BasketServiceClient(new WebServiceTestConfiguration());

        // init input address data
        Address_in.setEMail("java_test-1@epages.de");
        Address_in.setFirstName("Klaus");
        Address_in.setLastName("Klaussen");
        Address_in.setStreet("Musterstraße 2");
        Address_in.setStreet2("Ortsteil Niederfingeln");
        Address_in.setAttributes( new TAttribute[] {
                new TAttribute("JobTitle","best Job",null,null),
                new TAttribute("Salutation","Dr.",null,null),
        });

        Address_up.setFirstName("Hans");
        Address_up.setLastName("Hanssen");
        Address_up.setStreet("Musterstraße 2b");
        Address_up.setStreet2("Ortsteil Oberfingeln");

        // init order input data
        Basket_in.setCustomer(Customer);
        Basket_in.setBillingAddress(Address_in);

        Basket_in.setAttributes(new TAttribute[]{BasketAttr_in});
        TLineItemContainerIn lineItemContainer = new TLineItemContainerIn();
        lineItemContainer.setCurrencyID("EUR");
        lineItemContainer.setPaymentMethod("/Shops/DemoShop/PaymentMethods/Invoice");
        lineItemContainer.setShippingMethod("/Shops/DemoShop/ShippingMethods/Express");
        lineItemContainer.setTaxArea("/TaxMatrixGermany/EU");
        lineItemContainer.setTaxModel("gross");
        lineItemContainer.setProductLineItems(new TProductLineItemIn[]{
                new TProductLineItemIn("/Shops/DemoShop/Products/ho_1112105010", (float)10),
                //new TProductLineItemIn("/Shops/DemoShop/Products/de_3203104010", (float)10),
        });
        Basket_in.setLineItemContainer(lineItemContainer);

        // init order update data
        Basket_up.setBillingAddress(Address_up);
        Basket_up.setCreationDate(new GregorianCalendar(2008, 0, 1, 11, 11));
        Basket_up.setAttributes(new TAttribute[]{BasketAttr_up});

        // delete the test order if it exists
        try {
            TExists_Return[] Baskets_exists_out= basketService.exists(new String[]{BasketPath});
            if( Baskets_exists_out[0].getExists() ) {
                TDelete_Return[] Baskets_delete_out = basketService.delete(new String[]{BasketPath});
                assertEquals("delete result set", 1, Baskets_delete_out.length);
            }
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a Order and check if the creation was successful
     */
    public void testCreate() throws RemoteException {
        log.info("BasketServiceTestCase: testCreate");
        TCreate_Return[] Baskets_create_out = basketService.create(new TCreate_Input[]{Basket_in});
        assertEquals("create result set", 1, Baskets_create_out.length);
        assertEquals("created?", new Boolean(true), Baskets_create_out[0].getCreated());
        assertNotNull("Path not null",Baskets_create_out[0].getPath());
        BasketPath = Baskets_create_out[0].getPath();
    }

    /**
     * Update a Order and check if the update was successful
     */
    public void testUpdate() throws RemoteException {
        log.info("BasketServiceTestCase: testUpdate");
        Basket_up.setPath(BasketPath);
        TUpdate_Return[] Baskets_update_out = basketService.update(new TUpdate_Input[]{Basket_up});
        assertEquals("update result set", 1, Baskets_update_out.length);
        assertEquals("updated?", new Boolean(true), Baskets_update_out[0].getUpdated());
    }

    /**
     * Retrieve information about an Order. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) throws RemoteException {
        log.info("BasketServiceTestCase: testGetInfo");
        Baskets = new String[]{BasketPath};
        TGetInfo_Return[] Baskets_info_out = basketService.getInfo(Baskets, BasketAttributes, AddressAttributes, ItemAttributes, null);
        assertEquals("exists result set",1, Baskets_info_out.length);

        TGetInfo_Return Basket_info_out = Baskets_info_out[0];
        assertEquals("Customer",        Basket_in.getCustomer()                             , Basket_info_out.getCustomer());

        TAddressNamed Address_out = Basket_info_out.getBillingAddress();
        assertEquals("EMail",           Address_in.getEMail()                               , Address_out.getEMail());


        if (isAlreadyUpdated) {
            // check updated order data
            assertEquals("IsAcceptCreditCheckOK",     Basket_up.getAttributes()[0].getValue()             , Basket_info_out.getAttributes()[0].getValue());

            // check updated address
            assertEquals("FirstName",   Address_up.getFirstName()                           , Address_out.getFirstName());
            assertEquals("LastName",    Address_up.getLastName()                            , Address_out.getLastName());
            assertEquals("Street",      Address_up.getStreet()                              , Address_out.getStreet());
            assertEquals("Street2",     Address_up.getStreet2()                             , Address_out.getStreet2());
        } else {
            // check order data created without update
            assertEquals("IsAcceptCreditCheckOK",     Basket_in.getAttributes()[0].getValue()             , Basket_info_out.getAttributes()[0].getValue());

            // check created address
            assertEquals("FirstName", Address_in.getFirstName(), Address_out.getFirstName());
            assertEquals("LastName",    Address_in.getLastName()                            , Address_out.getLastName());
            assertEquals("Street",      Address_in.getStreet()                              , Address_out.getStreet());
            assertEquals("Street2",     Address_in.getStreet2()                             , Address_out.getStreet2());
        }

        assertEquals("TaxArea",         Basket_in.getLineItemContainer().getTaxArea()       , Basket_info_out.getLineItemContainer().getTaxArea());
        assertEquals("TaxModel",        Basket_in.getLineItemContainer().getTaxModel()      , Basket_info_out.getLineItemContainer().getTaxModel());
        assertEquals("CurrencyID",      Basket_in.getLineItemContainer().getCurrencyID()    , Basket_info_out.getLineItemContainer().getCurrencyID());
    }

    /**
     * Delete a Order and check if no error occured.
     */
    public void testDelete() throws RemoteException {
        log.info("BasketServiceTestCase: testDelete");
        TDelete_Return[] Basket_delete_out = basketService.delete(new String[]{BasketPath});
        assertEquals("delete result set", 1, Basket_delete_out.length);
    }

    /**
     * test exists method
     * @param expected  if false, test is successful if the Order does NOT exists
     */
    public void testExists(boolean expected) throws RemoteException {
        log.info("BasketServiceTestCase: testExists");
        TExists_Return[] Baskets_exists_out = basketService.exists(new String[]{BasketPath});
        assertEquals("exists result set", 1, Baskets_exists_out.length);
        assertEquals("exists?", new Boolean(expected), Baskets_exists_out[0].getExists());
    }

    /**
     * runs all tests
     */
    @Test
    public void testAll() throws RemoteException
    {
        testCreate();
        testExists(true);
        testGetInfo(false);
        testUpdate();
        testGetInfo(true);
        testDelete();
        testExists(false);
    }
}
