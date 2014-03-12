package de.epages.ws.customergroup;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customergroup.model.TGetList_Return;
import de.epages.ws.customergroup.stub.CustomerGroupServiceLocator;
import de.epages.ws.customergroup.stub.Port_CustomerGroup;

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
    public TGetList_Return[] getList() {
        try {
            return stub.getList();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
