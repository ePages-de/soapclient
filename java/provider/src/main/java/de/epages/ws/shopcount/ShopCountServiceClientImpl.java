package de.epages.ws.shopcount;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shopcount.stub.Port_ShopCount;
import de.epages.ws.shopcount.stub.ShopCountServiceLocator;
import de.epages.ws.shopcount.stub.TShopCount;
import de.epages.ws.shopcount.stub.Type_GetCount_In;

public final class ShopCountServiceClientImpl implements ShopCountServiceClient {

    private static final ShopCountServiceLocator serviceLocator = new ShopCountServiceLocator();
    private final Port_ShopCount stub;

    public ShopCountServiceClientImpl(final WebServiceConfiguration config) {
        this(config, new ShopCountServiceStubFactoryImpl());
    }

    public ShopCountServiceClientImpl(WebServiceConfiguration config, ShopCountServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    public ShopCountServiceClientImpl(Port_ShopCount stub) {
        this.stub = stub;
    }

    @Override
    public TShopCount[] getAllCounts() {
        try {
            return stub.getAllCounts();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public int getCount(Type_GetCount_In filter) {
        try {
            return stub.getCount(filter);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
