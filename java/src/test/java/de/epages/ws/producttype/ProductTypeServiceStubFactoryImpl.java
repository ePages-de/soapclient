package de.epages.ws.producttype;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.producttype.stub.Bind_ProductType_SOAPStub;
import de.epages.ws.producttype.stub.Port_ProductType;
import de.epages.ws.producttype.stub.ProductTypeService;

final class ProductTypeServiceStubFactoryImpl implements ProductTypeServiceStubFactory {



    @Override
    public Port_ProductType create(WebServiceConfiguration config, ProductTypeService service) {
        
        try {
            Bind_ProductType_SOAPStub stub = (Bind_ProductType_SOAPStub) service.getport_ProductType(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
