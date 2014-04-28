package de.epages.ws.shippingmethod;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shippingmethod.stub.Port_ShippingMethod;
import de.epages.ws.shippingmethod.stub.ShippingMethodService;

public interface ShippingMethodServiceStubFactory {

    Port_ShippingMethod create(WebServiceConfiguration config, ShippingMethodService service);

}
