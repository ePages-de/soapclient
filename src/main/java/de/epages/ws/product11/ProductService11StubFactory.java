package de.epages.ws.product11;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product11.stub.Port_Product;
import de.epages.ws.product11.stub.ProductService;

public interface ProductService11StubFactory {
    Port_Product create(WebServiceConfiguration config, ProductService service);
}
