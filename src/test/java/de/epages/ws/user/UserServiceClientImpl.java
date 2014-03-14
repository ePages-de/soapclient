package de.epages.ws.user;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.user.model.TCreate_Input;
import de.epages.ws.user.model.TCreate_Return;
import de.epages.ws.user.model.TDelete_Return;
import de.epages.ws.user.model.TExists_Return;
import de.epages.ws.user.model.TGetInfo_Return;
import de.epages.ws.user.model.TUpdate_Input;
import de.epages.ws.user.model.TUpdate_Return;
import de.epages.ws.user.stub.Port_User;
import de.epages.ws.user.stub.UserServiceLocator;

public final class UserServiceClientImpl implements UserServiceClient {

    private static final UserServiceLocator serviceLocator = new UserServiceLocator();

    private final Port_User stub;

    public UserServiceClientImpl(WebServiceConfiguration config) {
        this(config, new UserServiceStubFactoryImpl());
    }

    public UserServiceClientImpl(WebServiceConfiguration config, UserServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] users) {
        try {
            return stub.create(users);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] users) {
        try {
            return stub.delete(users);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] users) {
        try {
            return stub.exists(users);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] users, String[] attributes) {
        try {
            return stub.getInfo(users, attributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] users) {
        try {
            return stub.update(users);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
