package de.epages.ws.changelog;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.changelog.stub.Port_ChangeLog;
import de.epages.ws.changelog.stub.TFindChanges_Return;
import de.epages.ws.changelog.stub.TFindCreates_Return;
import de.epages.ws.changelog.stub.TFindDeletes_Return;
import de.epages.ws.changelog.stub.TFindUpdates_Return;
import de.epages.ws.changelog.stub.ChangeLogServiceLocator;

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
    public TFindCreates_Return findCreates(Calendar createdAfter, String _class) {
        try {
            return stub.findCreates(createdAfter, _class);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
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

    @Override
    public TFindChanges_Return findChanges(Calendar changedAfter, String _class, String profile) {
        try {
            return stub.findChanges(changedAfter, _class, profile);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
