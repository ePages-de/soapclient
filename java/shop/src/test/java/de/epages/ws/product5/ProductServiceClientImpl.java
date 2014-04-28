package de.epages.ws.product5;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product5.model.TCreate_Input;
import de.epages.ws.product5.model.TCreate_Return;
import de.epages.ws.product5.model.TDelete_Return;
import de.epages.ws.product5.model.TExists_Return;
import de.epages.ws.product5.model.TGetInfo_Return;
import de.epages.ws.product5.model.TUpdate_Input;
import de.epages.ws.product5.model.TUpdate_Return;
import de.epages.ws.product5.stub.Port_Product;
import de.epages.ws.product5.stub.ProductServiceLocator;
import de.epages.ws.product5.stub.TFind_Input;

public final class ProductServiceClientImpl implements ProductServiceClient {
    private static final ProductServiceLocator serviceLocator = new ProductServiceLocator();
    private final Port_Product stub;

    public ProductServiceClientImpl(WebServiceConfiguration config) {
        this(config, new ProductServiceStubFactoryImpl());
    }

    public ProductServiceClientImpl(WebServiceConfiguration config, ProductServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] products) {
        try {
            return stub.create(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] products) {
        try {
            return stub.delete(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] products) {
        try {
            return stub.exists(products);
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
    @Override
    public TGetInfo_Return[] getInfo(String[] products, String[] attributes, String[] languageCodes) {
        try {
            return stub.getInfo(products, attributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] products) {
        try {
            return stub.update(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
