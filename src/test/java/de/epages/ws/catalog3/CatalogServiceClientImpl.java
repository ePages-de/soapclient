package de.epages.ws.catalog3;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.catalog3.model.TCreate_Input;
import de.epages.ws.catalog3.model.TCreate_Return;
import de.epages.ws.catalog3.model.TDelete_Return;
import de.epages.ws.catalog3.model.TExists_Return;
import de.epages.ws.catalog3.model.TGetInfo_Return;
import de.epages.ws.catalog3.model.TSortProducts_Input;
import de.epages.ws.catalog3.model.TSortProducts_Return;
import de.epages.ws.catalog3.model.TUpdate_Input;
import de.epages.ws.catalog3.model.TUpdate_Return;
import de.epages.ws.catalog3.stub.CatalogServiceLocator;
import de.epages.ws.catalog3.stub.Port_Catalog;
import de.epages.ws.catalog3.stub.TGetRoot_Return;

public final class CatalogServiceClientImpl implements CatalogServiceClient {

    private static final CatalogServiceLocator serviceLocator = new CatalogServiceLocator();
    private final Port_Catalog stub;

    public CatalogServiceClientImpl(WebServiceConfiguration config) {
        this(config, new CatalogServiceStubFactoryImpl());
    }

    public CatalogServiceClientImpl(WebServiceConfiguration config, CatalogServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] catalogs, String[] attributes, String[] languageCodes) {
        try {
            return stub.getInfo(catalogs, attributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] catalogs) {
        try {
            return stub.exists(catalogs);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] catalogs) {
        try {
            return stub.delete(catalogs);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] catalogs) {
        try {
            return stub.update(catalogs);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] catalogs) {
        try {
            return stub.create(catalogs);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetRoot_Return getRoot() {
        try {
            return stub.getRoot();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TSortProducts_Return[] sortProducts(TSortProducts_Input[] catalogs) {
        try {
            return stub.sortProducts(catalogs);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
