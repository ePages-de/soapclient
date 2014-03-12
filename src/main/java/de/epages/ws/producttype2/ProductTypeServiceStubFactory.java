package de.epages.ws.producttype2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.producttype2.stub.Port_ProductType;
import de.epages.ws.producttype2.stub.ProductTypeService;

public interface ProductTypeServiceStubFactory {
    Port_ProductType create(WebServiceConfiguration config, ProductTypeService service);
}
