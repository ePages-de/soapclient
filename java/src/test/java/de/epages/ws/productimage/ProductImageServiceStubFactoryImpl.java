package de.epages.ws.productimage;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productimage.stub.Bind_ProductImage_SOAPStub;
import de.epages.ws.productimage.stub.Port_ProductImage;
import de.epages.ws.productimage.stub.ProductImageService;

final class ProductImageServiceStubFactoryImpl implements ProductImageServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(ProductImageServiceStubFactoryImpl.class);

    @Override
    public Port_ProductImage create(WebServiceConfiguration config, ProductImageService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
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
