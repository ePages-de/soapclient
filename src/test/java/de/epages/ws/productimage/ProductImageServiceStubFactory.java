package de.epages.ws.productimage;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productimage.stub.Port_ProductImage;
import de.epages.ws.productimage.stub.ProductImageService;

public interface ProductImageServiceStubFactory {
    Port_ProductImage create(WebServiceConfiguration config, ProductImageService service);
}
