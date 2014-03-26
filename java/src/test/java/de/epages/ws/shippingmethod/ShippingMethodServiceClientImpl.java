package de.epages.ws.shippingmethod;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shippingmethod.model.TGetList_Return;
import de.epages.ws.shippingmethod.stub.Port_ShippingMethod;
import de.epages.ws.shippingmethod.stub.ShippingMethodServiceLocator;

public final class ShippingMethodServiceClientImpl implements ShippingMethodServiceClient {

    private static final ShippingMethodServiceLocator serviceLocator = new ShippingMethodServiceLocator();

    private final Port_ShippingMethod stub;

    public ShippingMethodServiceClientImpl(WebServiceConfiguration config) {
        this(config, new ShippingMethodServiceStubFactoryImpl());
    }

    public ShippingMethodServiceClientImpl(WebServiceConfiguration config, ShippingMethodServiceStubFactory factory) {
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
