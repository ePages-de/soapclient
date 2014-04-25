package de.epages.ws.order2;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.order2.model.TCreate_Input;
import de.epages.ws.order2.model.TCreate_Return;
import de.epages.ws.order2.model.TDelete_Return;
import de.epages.ws.order2.model.TExists_Return;
import de.epages.ws.order2.model.TGetInfo_Return;
import de.epages.ws.order2.model.TUpdate_Input;
import de.epages.ws.order2.model.TUpdate_Return;
import de.epages.ws.order2.stub.OrderServiceLocator;
import de.epages.ws.order2.stub.Port_Order;
import de.epages.ws.order2.stub.TFind_Input;

public final class OrderServiceClientImpl implements OrderServiceClient {

    private static final OrderServiceLocator serviceLocator = new OrderServiceLocator();
    private final Port_Order stub;

    public OrderServiceClientImpl(WebServiceConfiguration config) {
        this(config, new OrderServiceStubFactoryImpl());
    }

    public OrderServiceClientImpl(WebServiceConfiguration config, OrderServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] orders) {
        return getInfo(orders, new String[] {});
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] orders, String[] attributes) {
        return getInfo(orders, attributes, new String[] {});
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] orders, String[] attributes, String[] languageCodes) {
        try {
            return stub.getInfo(orders, attributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] orders) {
        try {
            return stub.exists(orders);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] orders) {
        try {
            return stub.delete(orders);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] orders) {
        try {
            return stub.update(orders);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] orders) {
        try {
            return stub.create(orders);
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
