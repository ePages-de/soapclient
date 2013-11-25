package de.epages.webservice.product;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.product.stub11.Bind_Product_SOAPStub;
import de.epages.webservice.product.stub11.ProductService;

public interface ProductService11StubFactory {
    Bind_Product_SOAPStub create(WebServiceConfiguration config, ProductService service);
}
