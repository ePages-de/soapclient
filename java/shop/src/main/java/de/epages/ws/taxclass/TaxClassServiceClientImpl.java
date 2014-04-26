package de.epages.ws.taxclass;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.taxclass.model.TGetList_Return;
import de.epages.ws.taxclass.stub.Port_TaxClass;
import de.epages.ws.taxclass.stub.TaxClassServiceLocator;

public final class TaxClassServiceClientImpl implements TaxClassServiceClient {

    private static final TaxClassServiceLocator serviceLocator = new TaxClassServiceLocator();

    private final Port_TaxClass stub;

    public TaxClassServiceClientImpl(WebServiceConfiguration config) {
        this(config, new TaxClassServiceStubFactoryImpl());
    }

    public TaxClassServiceClientImpl(WebServiceConfiguration config, TaxClassServiceStubFactory factory) {
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
