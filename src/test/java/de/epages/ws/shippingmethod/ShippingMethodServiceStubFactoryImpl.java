package de.epages.ws.shippingmethod;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shippingmethod.stub.Bind_ShippingMethod_SOAPStub;
import de.epages.ws.shippingmethod.stub.Port_ShippingMethod;
import de.epages.ws.shippingmethod.stub.ShippingMethodService;

final class ShippingMethodServiceStubFactoryImpl implements ShippingMethodServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(ShippingMethodServiceStubFactoryImpl.class);

    @Override
    public Port_ShippingMethod create(WebServiceConfiguration config, ShippingMethodService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
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
