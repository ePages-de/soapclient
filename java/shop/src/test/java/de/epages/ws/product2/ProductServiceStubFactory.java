package de.epages.ws.product2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product2.stub.Port_Product;
import de.epages.ws.product2.stub.ProductService;

public interface ProductServiceStubFactory {
    Port_Product create(WebServiceConfiguration config, ProductService service);
}
