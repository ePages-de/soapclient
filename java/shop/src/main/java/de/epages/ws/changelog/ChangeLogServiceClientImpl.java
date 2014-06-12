package de.epages.ws.changelog;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.changelog.stub.ChangeLogServiceLocator;
import de.epages.ws.changelog.stub.Port_ChangeLog;
import de.epages.ws.changelog.stub.TFindCreatedObjects_Return;
import de.epages.ws.changelog.stub.TFindDeletedObjects_Return;
import de.epages.ws.changelog.stub.TFindUpdatedObjects_Return;

public final class ChangeLogServiceClientImpl implements ChangeLogServiceClient {

    private static final ChangeLogServiceLocator serviceLocator = new ChangeLogServiceLocator();

    private final Port_ChangeLog stub;

    public ChangeLogServiceClientImpl(WebServiceConfiguration config) {
        this(config, new ChangeLogServiceStubFactoryImpl());
    }

    public ChangeLogServiceClientImpl(WebServiceConfiguration config, ChangeLogServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TFindCreatedObjects_Return findCreatedObjects(Calendar createdSince, String _class) {
        try {
            return stub.findCreatedObjects(createdSince, _class);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TFindDeletedObjects_Return findDeletedObjects(Calendar deletedSince, String _class) {
        try {
            return stub.findDeletedObjects(deletedSince, _class);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TFindUpdatedObjects_Return findUpdatedObjects(Calendar updatedSince, String _class, String profile) {
        try {
            return stub.findUpdatedObjects(updatedSince, _class, profile);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
