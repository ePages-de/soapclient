package de.epages.ws.customergroup2;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customergroup2.model.TCreate_Input;
import de.epages.ws.customergroup2.model.TCreate_Return;
import de.epages.ws.customergroup2.model.TDelete_Return;
import de.epages.ws.customergroup2.model.TExists_Return;
import de.epages.ws.customergroup2.model.TGetList_Return;
import de.epages.ws.customergroup2.model.TUpdate_Input;
import de.epages.ws.customergroup2.model.TUpdate_Return;
import de.epages.ws.customergroup2.stub.CustomerGroupServiceLocator;
import de.epages.ws.customergroup2.stub.Port_CustomerGroup;

public final class CustomerGroupServiceClientImpl implements CustomerGroupServiceClient {

    private static final CustomerGroupServiceLocator serviceLocator = new CustomerGroupServiceLocator();
    private final Port_CustomerGroup stub;

    public CustomerGroupServiceClientImpl(WebServiceConfiguration config) {
        this(config, new CustomerGroupServiceStubFactoryImpl());
    }

    public CustomerGroupServiceClientImpl(WebServiceConfiguration config, CustomerGroupServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] groups) {
        try {
            return stub.create(groups);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] groups) {
        try {
            return stub.delete(groups);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] groups) {
        try {
            return stub.exists(groups);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetList_Return[] getList() {
        try {
            return stub.getList();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] groups) {
        try {
            return stub.update(groups);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
