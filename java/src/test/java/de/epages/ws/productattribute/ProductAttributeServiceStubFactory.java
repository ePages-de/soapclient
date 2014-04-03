package de.epages.ws.productattribute;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productattribute.stub.Port_ProductAttribute;
import de.epages.ws.productattribute.stub.ProductAttributeService;

public interface ProductAttributeServiceStubFactory {
    Port_ProductAttribute create(WebServiceConfiguration config, ProductAttributeService service);
}
