package de.epages.ws.product5;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product5.stub.Port_Product;
import de.epages.ws.product5.stub.ProductService;

public interface ProductServiceStubFactory {
    Port_Product create(WebServiceConfiguration config, ProductService service);
}
