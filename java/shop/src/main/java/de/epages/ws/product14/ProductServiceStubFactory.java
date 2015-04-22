package de.epages.ws.product14;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product14.stub.Port_Product_PortType;
import de.epages.ws.product14.stub.ProductService;

public interface ProductServiceStubFactory {
    Port_Product_PortType create(WebServiceConfiguration config, ProductService service);
}
