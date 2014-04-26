package de.epages.ws.shopconfig5;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shopconfig5.stub.ShopConfigServiceLocator;
import de.epages.ws.shopconfig5.stub.Port_ShopConfig;
import de.epages.ws.shopconfig5.stub.TCreateShop;
import de.epages.ws.shopconfig5.stub.TInfoShop;
import de.epages.ws.shopconfig5.stub.TInfoShop_Input;
import de.epages.ws.shopconfig5.stub.TShopRef;
import de.epages.ws.shopconfig5.stub.TUpdateShop;

public final class ShopConfigServiceClientImpl implements ShopConfigServiceClient {

    private static final ShopConfigServiceLocator serviceLocator = new ShopConfigServiceLocator();
    private final Port_ShopConfig stub;

    public ShopConfigServiceClientImpl(final WebServiceConfiguration config) {
        this(config, new ShopConfigServiceStubFactoryImpl());
    }

    public ShopConfigServiceClientImpl(WebServiceConfiguration config, ShopConfigServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    public ShopConfigServiceClientImpl(Port_ShopConfig stub) {
        this.stub = stub;
    }

    @Override
    public int create(TCreateShop createShopData) {
        try {
            return stub.create(createShopData);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public void delete(TShopRef shopRef) {
        try {
            stub.delete(shopRef);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public void deleteShopRef(TShopRef shopRef) {
        try {
            stub.deleteShopRef(shopRef);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public boolean exists(TShopRef shopRef) {
        try {
            return stub.exists(shopRef);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TInfoShop[] getAllInfo() {
        try {
            return stub.getAllInfo();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TInfoShop getInfo(TInfoShop_Input shopInfo) {
        try {
            return stub.getInfo(shopInfo);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public void update(TUpdateShop shopData) {
        try {
            stub.update(shopData);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
