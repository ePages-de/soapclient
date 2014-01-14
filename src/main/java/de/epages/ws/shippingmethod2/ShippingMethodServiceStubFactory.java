package de.epages.ws.shippingmethod2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shippingmethod2.stub.Port_ShippingMethod;
import de.epages.ws.shippingmethod2.stub.ShippingMethodService;

public interface ShippingMethodServiceStubFactory {

    Port_ShippingMethod create(WebServiceConfiguration config, ShippingMethodService service);

}
