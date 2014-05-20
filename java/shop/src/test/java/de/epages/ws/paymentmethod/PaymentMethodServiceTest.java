package de.epages.ws.paymentmethod;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.paymentmothod.model.TGetList_Return;

public class PaymentMethodServiceTest {

    private static final PaymentMethodServiceClientImpl paymentMethodService = new PaymentMethodServiceClientImpl(
            new WebServiceTestConfiguration());

    /**
     * Get a list of all payment methods
     */
    @Test
    public void testGetList() {
        TGetList_Return[] PaymentMethods = paymentMethodService.getList();
        int count = PaymentMethods.length;
        assertTrue("found payment methods", count > 5);
        TGetList_Return firstPaymentMethod = PaymentMethods[0];
        assertEquals("first payment method", "PaymentMethods/CashInAdvance", firstPaymentMethod.getPath());
    }
}
