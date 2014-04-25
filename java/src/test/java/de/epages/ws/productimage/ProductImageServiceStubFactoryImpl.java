package de.epages.ws.productimage;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productimage.stub.Bind_ProductImage_SOAPStub;
import de.epages.ws.productimage.stub.Port_ProductImage;
import de.epages.ws.productimage.stub.ProductImageService;

final class ProductImageServiceStubFactoryImpl implements ProductImageServiceStubFactory {



    @Override
    public Port_ProductImage create(WebServiceConfiguration config, ProductImageService service) {
        
        try {
            Bind_ProductImage_SOAPStub stub = (Bind_ProductImage_SOAPStub) service.getport_ProductImage(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
