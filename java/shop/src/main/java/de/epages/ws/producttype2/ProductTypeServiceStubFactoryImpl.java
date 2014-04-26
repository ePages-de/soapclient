package de.epages.ws.producttype2;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.producttype2.stub.Bind_ProductType_SOAPStub;
import de.epages.ws.producttype2.stub.Port_ProductType;
import de.epages.ws.producttype2.stub.ProductTypeService;

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
