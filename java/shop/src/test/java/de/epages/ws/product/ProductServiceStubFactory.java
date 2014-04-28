package de.epages.ws.product;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product.stub.Port_Product;
import de.epages.ws.product.stub.ProductService;

public interface ProductServiceStubFactory {
    Port_Product create(WebServiceConfiguration config, ProductService service);
}
