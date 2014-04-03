package de.epages.ws.productbundle;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productbundle.stub.Port_ProductBundle;
import de.epages.ws.productbundle.stub.ProductBundleService;

public interface ProductBundleServiceStubFactory {
    Port_ProductBundle create(WebServiceConfiguration config, ProductBundleService service);
}
