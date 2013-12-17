package de.epages.ws.customer4;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customer4.model.TCreate_Input;
import de.epages.ws.customer4.model.TCreate_Return;
import de.epages.ws.customer4.model.TDelete_Return;
import de.epages.ws.customer4.model.TExists_Return;
import de.epages.ws.customer4.model.TGetInfo_Return;
import de.epages.ws.customer4.model.TUpdate_Input;
import de.epages.ws.customer4.model.TUpdate_Return;
import de.epages.ws.customer4.stub.CustomerServiceLocator;
import de.epages.ws.customer4.stub.Port_Customer;
import de.epages.ws.customer4.stub.TFind_Input;

public final class CustomerServiceClientImpl implements CustomerServiceClient {

    private static final CustomerServiceLocator serviceLocator = new CustomerServiceLocator();
    private final Port_Customer stub;

    public CustomerServiceClientImpl(WebServiceConfiguration config) {
        this(config, new CustomerServiceStubFactoryImpl());
    }

    public CustomerServiceClientImpl(WebServiceConfiguration config, CustomerServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] customers, String[] attributes, String[] addressAttributes) {
        try {
            return stub.getInfo(customers, attributes, addressAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] customers) {
        try {
            return stub.exists(customers);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] customers) {
        try {
            return stub.delete(customers);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] customers) {
        try {
            return stub.update(customers);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] customers) {
        try {
            return stub.create(customers);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public String[] find(TFind_Input searchParameters) {
        try {
            return stub.find(searchParameters);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
