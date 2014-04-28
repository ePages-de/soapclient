package de.epages.ws.simpleprovisioning2;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.simpleprovisioning2.stub.SimpleProvisioningServiceLocator;
import de.epages.ws.simpleprovisioning2.stub.Port_SimpleProvisioning;
import de.epages.ws.simpleprovisioning2.stub.TCreateShop;
import de.epages.ws.simpleprovisioning2.stub.TInfoShop;
import de.epages.ws.simpleprovisioning2.stub.TRename_Input;
import de.epages.ws.simpleprovisioning2.stub.TShopRef;
import de.epages.ws.simpleprovisioning2.stub.TUpdateShop;

public final class SimpleProvisioningServiceClientImpl implements SimpleProvisioningServiceClient {

    private static final SimpleProvisioningServiceLocator serviceLocator = new SimpleProvisioningServiceLocator();
    private final Port_SimpleProvisioning stub;

    public SimpleProvisioningServiceClientImpl(final WebServiceConfiguration config) {
        this(config, new SimpleProvisioningServiceStubFactoryImpl());
    }

    public SimpleProvisioningServiceClientImpl(WebServiceConfiguration config, SimpleProvisioningServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    public SimpleProvisioningServiceClientImpl(Port_SimpleProvisioning stub) {
        this.stub = stub;
    }

    @Override
    public void create(TCreateShop createShopData) {
        try {
            stub.create(createShopData);
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
    public TInfoShop getInfo(TShopRef shopRef) {
        try {
            return stub.getInfo(shopRef);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public void markForDeletion(TShopRef shopRef) {
        try {
            stub.markForDeletion(shopRef);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public void rename(TRename_Input shopInfo) {
        try {
            stub.rename(shopInfo);
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
