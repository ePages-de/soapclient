package de.epages.ws.paymentmethod;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.paymentmethod.stub.PaymentMethodService;
import de.epages.ws.paymentmethod.stub.Port_PaymentMethod;

public interface PaymentMethodServiceStubFactory {

    Port_PaymentMethod create(WebServiceConfiguration config, PaymentMethodService service);

}
