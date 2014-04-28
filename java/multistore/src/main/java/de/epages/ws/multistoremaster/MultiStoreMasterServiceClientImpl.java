package de.epages.ws.multistoremaster;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.multistoremaster.model.TBuildShopUrl_In;
import de.epages.ws.multistoremaster.stub.MultiStoreMasterServiceLocator;
import de.epages.ws.multistoremaster.stub.Port_MultiStoreMaster;

public final class MultiStoreMasterServiceClientImpl implements MultiStoreMasterServiceClient {

    private static final MultiStoreMasterServiceLocator serviceLocator = new MultiStoreMasterServiceLocator();
    private final Port_MultiStoreMaster stub;

    public MultiStoreMasterServiceClientImpl(final WebServiceConfiguration config) {
        this(config, new MultiStoreMasterServiceStubFactoryImpl());
    }

    public MultiStoreMasterServiceClientImpl(WebServiceConfiguration config, MultiStoreMasterServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    public MultiStoreMasterServiceClientImpl(Port_MultiStoreMaster stub) {
        this.stub = stub;
    }

    @Override
    public String buildShopUrl(String masterShopAlias, TBuildShopUrl_In buildShopUrl) {
        try {
            return stub.buildShopUrl(masterShopAlias, buildShopUrl);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
