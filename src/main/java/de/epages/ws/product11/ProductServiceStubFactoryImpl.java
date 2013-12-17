package de.epages.ws.product11;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product11.stub.Bind_Product_SOAPStub;
import de.epages.ws.product11.stub.Port_Product;
import de.epages.ws.product11.stub.ProductService;

final class ProductServiceStubFactoryImpl implements ProductServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(ProductServiceStubFactoryImpl.class);

    @Override
    public Port_Product create(WebServiceConfiguration config, ProductService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_Product_SOAPStub stub = new Bind_Product_SOAPStub(config.getWebserviceURL(), serviceLocator);
            stub.setUsername(config.getUsername());
            stub.setPassword(config.getPassword());
            return stub;
        } catch (AxisFault e) {
            throw new RuntimeException(e);
        }
    }

}
