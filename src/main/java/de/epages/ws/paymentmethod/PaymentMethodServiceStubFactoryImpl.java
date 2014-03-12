package de.epages.ws.paymentmethod;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.paymentmethod.stub.Bind_PaymentMethod_SOAPStub;
import de.epages.ws.paymentmethod.stub.Port_PaymentMethod;
import de.epages.ws.paymentmethod.stub.PaymentMethodService;

final class PaymentMethodServiceStubFactoryImpl implements PaymentMethodServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(PaymentMethodServiceStubFactoryImpl.class);

    @Override
    public Port_PaymentMethod create(WebServiceConfiguration config, PaymentMethodService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_PaymentMethod_SOAPStub stub = (Bind_PaymentMethod_SOAPStub) serviceLocator.getport_PaymentMethod(config
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
