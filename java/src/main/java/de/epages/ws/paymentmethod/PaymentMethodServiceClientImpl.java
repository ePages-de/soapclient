package de.epages.ws.paymentmethod;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.paymentmethod.stub.PaymentMethodServiceLocator;
import de.epages.ws.paymentmethod.stub.Port_PaymentMethod;
import de.epages.ws.paymentmothod.model.TGetList_Return;

public final class PaymentMethodServiceClientImpl implements PaymentMethodServiceClient {

    private static final PaymentMethodServiceLocator serviceLocator = new PaymentMethodServiceLocator();

    private final Port_PaymentMethod stub;

    public PaymentMethodServiceClientImpl(WebServiceConfiguration config) {
        this(config, new PaymentMethodServiceStubFactoryImpl());
    }

    public PaymentMethodServiceClientImpl(WebServiceConfiguration config, PaymentMethodServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TGetList_Return[] getList() {
        try {
            return stub.getList();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
