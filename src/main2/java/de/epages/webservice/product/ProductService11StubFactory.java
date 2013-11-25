package de.epages.webservice.product;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.product11.stub.Bind_Product_SOAPStub;
import de.epages.webservice.product11.stub.ProductService;

public interface ProductService11StubFactory {
    Bind_Product_SOAPStub create(WebServiceConfiguration config, ProductService service);
}
