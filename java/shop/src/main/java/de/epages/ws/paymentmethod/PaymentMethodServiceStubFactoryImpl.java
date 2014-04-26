package de.epages.ws.paymentmethod;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.paymentmethod.stub.Bind_PaymentMethod_SOAPStub;
import de.epages.ws.paymentmethod.stub.PaymentMethodService;
import de.epages.ws.paymentmethod.stub.Port_PaymentMethod;

final class PaymentMethodServiceStubFactoryImpl implements PaymentMethodServiceStubFactory {

    @Override
    public Port_PaymentMethod create(WebServiceConfiguration config, PaymentMethodService serviceLocator) {

        try {
            Bind_PaymentMethod_SOAPStub stub = (Bind_PaymentMethod_SOAPStub) serviceLocator
                    .getport_PaymentMethod(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
