package de.epages.webservice.product;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.product.stub11.Bind_Product_SOAPStub;
import de.epages.webservice.product.stub11.ProductService;

class ProductService11StubFactoryImpl implements ProductService11StubFactory {

    private static final Logger log = LoggerFactory.getLogger(ProductService11StubFactoryImpl.class);

    @Override
    public Bind_Product_SOAPStub create(WebServiceConfiguration config, ProductService serviceLocator) {
        log.info("address specified by wsdl: " + serviceLocator.getport_ProductAddress());
        log.info("using web service Url: " + config.getWebserviceURL());
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
