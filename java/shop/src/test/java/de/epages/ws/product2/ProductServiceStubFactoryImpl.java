package de.epages.ws.product2;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product2.stub.Bind_Product_SOAPStub;
import de.epages.ws.product2.stub.Port_Product;
import de.epages.ws.product2.stub.ProductService;

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