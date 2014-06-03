package de.epages.ws.update;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.update.stub.Port_Update;
import de.epages.ws.update.stub.TFindDeletes_Return;
import de.epages.ws.update.stub.TFindUpdates_Return;
import de.epages.ws.update.stub.UpdateServiceLocator;

public final class UpdateServiceClientImpl implements UpdateServiceClient {

    private static final UpdateServiceLocator serviceLocator = new UpdateServiceLocator();

    private final Port_Update stub;

    public UpdateServiceClientImpl(WebServiceConfiguration config) {
        this(config, new UpdateServiceStubFactoryImpl());
    }

    public UpdateServiceClientImpl(WebServiceConfiguration config, UpdateServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TFindDeletes_Return findDeletes(Calendar deletedAfter, String _class) {
        try {
            return stub.findDeletes(deletedAfter, _class);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TFindUpdates_Return findUpdates(Calendar updatedAfter, String _class, String profile) {
        try {
            return stub.findUpdates(updatedAfter, _class, profile);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
