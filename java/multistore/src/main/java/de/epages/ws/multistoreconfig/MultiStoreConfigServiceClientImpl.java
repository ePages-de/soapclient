package de.epages.ws.multistoreconfig;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.multistoreconfig.stub.MultiStoreConfigServiceLocator;
import de.epages.ws.multistoreconfig.stub.Port_MultiStoreConfig;
import de.epages.ws.multistoreconfig.stub.TAssignSubShopToMasterShop;
import de.epages.ws.multistoreconfig.stub.TInfoMultiStoreConfig;
import de.epages.ws.multistoreconfig.stub.TShopRef;

public final class MultiStoreConfigServiceClientImpl implements MultiStoreConfigServiceClient {

    private static final MultiStoreConfigServiceLocator serviceLocator = new MultiStoreConfigServiceLocator();
    private final Port_MultiStoreConfig stub;

    public MultiStoreConfigServiceClientImpl(final WebServiceConfiguration config) {
        this(config, new MultiStoreConfigServiceStubFactoryImpl());
    }

    public MultiStoreConfigServiceClientImpl(WebServiceConfiguration config, MultiStoreConfigServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    public MultiStoreConfigServiceClientImpl(Port_MultiStoreConfig stub) {
        this.stub = stub;
    }

    @Override
    public void assignSubShopToMasterShop(TAssignSubShopToMasterShop assignSubShopToMasterShopData) {
        try {
            stub.assignSubShopToMasterShop(assignSubShopToMasterShopData);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TInfoMultiStoreConfig getInfo(TShopRef shopInfo) {
        try {
            return stub.getInfo(shopInfo);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public void unassignSubShopFromMasterShop(TShopRef shopRef) {
        try {
            stub.unassignSubShopFromMasterShop(shopRef);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
