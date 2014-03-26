package de.epages.ws.taxarea;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.taxarea.model.TGetList_Return;
import de.epages.ws.taxarea.stub.Port_TaxArea;
import de.epages.ws.taxarea.stub.TaxAreaServiceLocator;

public final class TaxAreaServiceClientImpl implements TaxAreaServiceClient {

    private static final TaxAreaServiceLocator serviceLocator = new TaxAreaServiceLocator();

    private final Port_TaxArea stub;

    public TaxAreaServiceClientImpl(WebServiceConfiguration config) {
        this(config, new TaxAreaServiceStubFactoryImpl());
    }

    public TaxAreaServiceClientImpl(WebServiceConfiguration config, TaxAreaServiceStubFactory factory) {
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
