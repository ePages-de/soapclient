package de.epages.webservice.product11;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.product11.stub.Port_Product;
import de.epages.webservice.product11.stub.ProductService;

public interface ProductService11StubFactory {
    Port_Product create(WebServiceConfiguration config, ProductService service);
}
