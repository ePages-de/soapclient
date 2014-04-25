package de.epages.ws.shippingmethod;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shippingmethod.stub.Bind_ShippingMethod_SOAPStub;
import de.epages.ws.shippingmethod.stub.Port_ShippingMethod;
import de.epages.ws.shippingmethod.stub.ShippingMethodService;

final class ShippingMethodServiceStubFactoryImpl implements ShippingMethodServiceStubFactory {



    @Override
    public Port_ShippingMethod create(WebServiceConfiguration config, ShippingMethodService serviceLocator) {
        
        try {
            Bind_ShippingMethod_SOAPStub stub = (Bind_ShippingMethod_SOAPStub) serviceLocator.getport_ShippingMethod(config
                    .getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
