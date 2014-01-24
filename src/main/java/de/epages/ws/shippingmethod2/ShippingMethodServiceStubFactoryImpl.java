package de.epages.ws.shippingmethod2;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shippingmethod2.stub.Bind_ShippingMethod_SOAPStub;
import de.epages.ws.shippingmethod2.stub.Port_ShippingMethod;
import de.epages.ws.shippingmethod2.stub.ShippingMethodService;


final class ShippingMethodServiceStubFactoryImpl implements ShippingMethodServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(ShippingMethodServiceStubFactoryImpl.class);

    @Override
    public Port_ShippingMethod create(WebServiceConfiguration config, ShippingMethodService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_ShippingMethod_SOAPStub stub = new Bind_ShippingMethod_SOAPStub(config.getWebserviceURL(), serviceLocator);
            return StubConfigurator.configure(stub, config);
        } catch (AxisFault e) {
            throw new RuntimeException(e);
        }
    }

}
