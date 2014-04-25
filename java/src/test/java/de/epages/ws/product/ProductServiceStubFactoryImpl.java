package de.epages.ws.product;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product.stub.Bind_Product_SOAPStub;
import de.epages.ws.product.stub.Port_Product;
import de.epages.ws.product.stub.ProductService;

final class ProductServiceStubFactoryImpl implements ProductServiceStubFactory {



    @Override
    public Port_Product create(WebServiceConfiguration config, ProductService serviceLocator) {
        
        try {
            Bind_Product_SOAPStub stub = (Bind_Product_SOAPStub) serviceLocator.getport_Product(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}