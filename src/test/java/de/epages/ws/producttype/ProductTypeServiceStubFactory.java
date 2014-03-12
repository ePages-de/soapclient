package de.epages.ws.producttype;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.producttype.stub.Port_ProductType;
import de.epages.ws.producttype.stub.ProductTypeService;

public interface ProductTypeServiceStubFactory {
    Port_ProductType create(WebServiceConfiguration config, ProductTypeService service);
}
