package de.epages.ws.basket;


import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.basket.model.TCreate_Input;
import de.epages.ws.basket.model.TCreate_Return;
import de.epages.ws.basket.model.TDelete_Return;
import de.epages.ws.basket.model.TExists_Return;
import de.epages.ws.basket.model.TGetInfo_Return;
import de.epages.ws.basket.model.TLineItemContainerIn;
import de.epages.ws.basket.model.TProductLineItemIn;
import de.epages.ws.basket.model.TProductLineItemOut;
import de.epages.ws.basket.model.TUpdateLineItem_Input;
import de.epages.ws.basket.model.TUpdateLineItem_Return;
import de.epages.ws.basket.model.TUpdate_Input;
import de.epages.ws.basket.model.TUpdate_Return;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.form.model.TFormError;
import de.epages.ws.shop3.model.TAddressNamed;

/**
 * A JUnit TestSuite to test epages Basket WebServices.
 */
public class BasketServiceTest {

    private static final BasketServiceClientImpl basketService = new BasketServiceClientImpl(new WebServiceTestConfiguration());
    private TCreate_Input Basket_in;
    private TUpdate_Input Basket_up;
    private TAttribute BasketAttr_in;
    private TAttribute BasketAttr_up;
    private TAddressNamed Address_in;
    private TAddressNamed Address_up;

    private String BasketGuid;

    private String[] Baskets;
    private String[] BasketAttributes = new String[]{"IsAddressOK", "WebUrl", "PickupToken"};
    private String[] AddressAttributes = new String[]{"JobTitle" /*,"Salutation" */ };
    private String[] ItemAttributes = new String[]{"Name"};

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        Basket_in = new TCreate_Input();
        Basket_up = new TUpdate_Input();
        BasketAttr_in = new TAttribute("IsAddressOK","1",null,null);
        BasketAttr_up = new TAttribute("IsAddressOK","0",null,null);
        Address_in = new TAddressNamed();

        // init input address data
        Address_in.setEMail("java_test-1@epages.de");
        Address_in.setFirstName("Klaus");
        Address_in.setLastName("Klaussen");
        Address_in.setCity("Klausdorf");
        Address_in.setZipcode("08151");
        Address_in.setCountryID(BigInteger.valueOf(276));
        Address_in.setStreet("Musterstraße 2");
        Address_in.setStreet2("Ortsteil Niederfingeln");
        Address_in.setAttributes( new TAttribute[] {
                new TAttribute("JobTitle","best Job",null,null),
                new TAttribute("Salutation","Dr.",null,null),
        });

        Address_up = Address_in;
        // just update some fields
        Address_up.setFirstName("Hans");
        Address_up.setLastName("Hanssen");
        Address_up.setStreet("Musterstraße 2b");
        Address_up.setStreet2("Ortsteil Oberfingeln");

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
        Basket_up.setAttributes(new TAttribute[]{BasketAttr_up});

        // delete the test order if it exists
        TExists_Return[] Baskets_exists_out= basketService.exists(new String[]{BasketGuid});
        if( Baskets_exists_out[0].getExists() ) {
            TDelete_Return[] Baskets_delete_out = basketService.delete(new String[]{BasketGuid});
            assertNoError(Baskets_delete_out[0].getError());
        }
    }

    /**
     * Create a Basket and check if the creation was successful
     */
    public void testCreate() {
        TCreate_Return[] Baskets_create_out = basketService.create(new TCreate_Input[]{Basket_in});
        assertNoError(Baskets_create_out[0].getError());

        assertNull("No FormErrors", Baskets_create_out[0].getFormErrors());
        assertEquals("created?", new Boolean(true), Baskets_create_out[0].getCreated());
        assertNotNull("GUID not null",Baskets_create_out[0].getGUID());
        BasketGuid = Baskets_create_out[0].getGUID();
    }

    /**
     * Create a Basket without passing optional fields, and check if the creation was successful
     */
    public void testCreateWithDefaults() {
        TCreate_Input basket_in = new TCreate_Input();
        TCreate_Return[] Baskets_create_out = basketService.create(new TCreate_Input[]{basket_in});
        assertNoError(Baskets_create_out[0].getError());
        assertNull("No FormErrors", Baskets_create_out[0].getFormErrors());
        assertEquals("created?", new Boolean(true), Baskets_create_out[0].getCreated());
        assertNotNull("GUID not null",Baskets_create_out[0].getGUID());
    }

    /**
     * Update a Basket and check if the update was successful
     */
    public void testUpdate() {
        Basket_up.setGUID(BasketGuid);
        TUpdate_Return[] Baskets_update_out = basketService.update(new TUpdate_Input[]{Basket_up});
        assertNoError(Baskets_update_out[0].getError());
        assertNull("No FormErrors", Baskets_update_out[0].getFormErrors());
        assertTrue("updated?", Baskets_update_out[0].getUpdated());
    }

    /**
     * Update a Basket with a billing address and check if the update was successful
     */
    public void testUpdateWithFormError() {
        Basket_up.setGUID(BasketGuid);
        TUpdate_Return[] Baskets_update_out = basketService.update(new TUpdate_Input[]{Basket_up});
        Baskets_update_out[0].setFormErrors(new TFormError[] { new TFormError() });
        assertEquals("updateWithFormError resultset", Baskets_update_out[0].getFormErrors().length, 1);
    }

    /**
     * Retrieve information about an Order. Check if the returned data are equal to
     * the data of create or update call
     *
     * @param isAlreadyUpdated if true check against update data, else against create data
     */
    public void testGetInfo(boolean isAlreadyUpdated) {
        Baskets = new String[]{BasketGuid};
        TGetInfo_Return[] Baskets_info_out = basketService.getInfo(Baskets, BasketAttributes, AddressAttributes, ItemAttributes, null);
        assertEquals("exists result set",1, Baskets_info_out.length);

        TGetInfo_Return Basket_info_out = Baskets_info_out[0];
        assertNoError(Basket_info_out.getError());
        assertNotNull(Basket_info_out.getAlias());

        TAddressNamed Address_out = Basket_info_out.getBillingAddress();
        assertEquals("EMail",           Address_in.getEMail()                               , Address_out.getEMail());
        TProductLineItemOut productLineItem = Basket_info_out.getLineItemContainer().getProductLineItems()[0];

        if (isAlreadyUpdated) {
            // check updated order data
            assertEquals("IsAcceptCreditCheckOK",     Basket_up.getAttributes()[0].getValue()             , Basket_info_out.getAttributes()[0].getValue());

            // check updated address
            assertEquals("FirstName",   Address_up.getFirstName()                           , Address_out.getFirstName());
            assertEquals("LastName",    Address_up.getLastName()                            , Address_out.getLastName());
            assertEquals("Street",      Address_up.getStreet()                              , Address_out.getStreet());
            assertEquals("Street2",     Address_up.getStreet2()                             , Address_out.getStreet2());
            assertEquals("Quantity", 20f, productLineItem.getQuantity(), 0.0);
        } else {
            // check order data created without update
            assertEquals("IsAcceptCreditCheckOK",     Basket_in.getAttributes()[0].getValue()             , Basket_info_out.getAttributes()[0].getValue());

            // check created address
            assertEquals("FirstName",   Address_in.getFirstName(), Address_out.getFirstName());
            assertEquals("LastName",    Address_in.getLastName()                            , Address_out.getLastName());
            assertEquals("Street",      Address_in.getStreet()                              , Address_out.getStreet());
            assertEquals("Street2",     Address_in.getStreet2()                             , Address_out.getStreet2());
            assertEquals("Quantity", 10f, productLineItem.getQuantity(), 0.0);
        }

        assertEquals("TaxArea",         Basket_in.getLineItemContainer().getTaxArea()       , Basket_info_out.getLineItemContainer().getTaxArea());
        assertEquals("TaxModel",        Basket_in.getLineItemContainer().getTaxModel()      , Basket_info_out.getLineItemContainer().getTaxModel());
        assertEquals("CurrencyID",      Basket_in.getLineItemContainer().getCurrencyID()    , Basket_info_out.getLineItemContainer().getCurrencyID());
        // "IsAddressOK", "WebUrl", "PickupToken"
        assertNotNull("IsAddressOK", Basket_info_out.getAttributes()[0].getValue());
        assertNotNull("WebUrl", Basket_info_out.getAttributes()[1].getValue());
        assertNotNull("PickupToken", Basket_info_out.getAttributes()[2].getValue());

        assertNotNull("Alias", productLineItem.getAlias());
        assertNotNull("Name", productLineItem.getName());
        assertNotNull("Product", productLineItem.getProduct());
        assertNotNull("TaxClass", productLineItem.getTaxClass());
        assertTrue("BasePrice", productLineItem.getBasePrice() > 0);
        assertTrue("LineItemPrice", productLineItem.getLineItemPrice() > 0);
        assertEquals("SKU", "ho_1112105010", productLineItem.getSKU());
    }

    public void testUpdateLineItem() {
        TGetInfo_Return[] Baskets_info_out = basketService.getInfo(Baskets, BasketAttributes, AddressAttributes, ItemAttributes, null);
        assertNoError(Baskets_info_out[0].getError());
        String lineitemAlias = Baskets_info_out[0].getLineItemContainer().getProductLineItems()[0].getAlias();
        TUpdateLineItem_Input lineItem = new TUpdateLineItem_Input(lineitemAlias, 20f);
        TUpdateLineItem_Return[] updateLineItem = basketService.updateLineItem(BasketGuid, new TUpdateLineItem_Input[] {lineItem});
        assertEquals("updateLineItem resultset", updateLineItem.length, 1);
        assertNoError(updateLineItem[0].getError());
        assertTrue("updated?", updateLineItem[0].getUpdated());
    }

    /**
     * Delete a Basket and check if no error occured.
     */
    public void testDelete() {
        TDelete_Return[] Basket_delete_out = basketService.delete(new String[]{BasketGuid});
        assertNoError(Basket_delete_out[0].getError());
    }

    /**
     * test exists method
     * @param expected  if false, test is successful if the Order does NOT exists
     */
    public void testExists(boolean expected) {
        TExists_Return[] Baskets_exists_out = basketService.exists(new String[]{BasketGuid});
        assertNoError(Baskets_exists_out[0].getError());
        assertEquals("exists?", expected, Baskets_exists_out[0].getExists());
    }

    /**
     * runs all tests
     */
    @Test
    @Ignore
    public void testAll() throws RemoteException
    {
        testCreate();
        testCreateWithDefaults();
        testExists(true);
        testGetInfo(false);
        testUpdate();
        testUpdateWithFormError();
        testUpdateLineItem();
        testGetInfo(true);
        testDelete();
        testExists(false);
    }
}
