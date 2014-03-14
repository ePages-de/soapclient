package de.epages.ws.productbundle;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productbundle.model.TCreate_Input;
import de.epages.ws.productbundle.model.TCreate_Return;
import de.epages.ws.productbundle.model.TDelete_Input;
import de.epages.ws.productbundle.model.TDelete_Return;
import de.epages.ws.productbundle.model.TExists_Input;
import de.epages.ws.productbundle.model.TExists_Return;
import de.epages.ws.productbundle.model.TGetInfo_Return;
import de.epages.ws.productbundle.stub.Port_ProductBundle;
import de.epages.ws.productbundle.stub.ProductBundleServiceLocator;

public final class ProductBundleServiceClientImpl implements ProductBundleServiceClient {

    private static final ProductBundleServiceLocator serviceLocator = new ProductBundleServiceLocator();
    private final Port_ProductBundle stub;

    public ProductBundleServiceClientImpl(WebServiceConfiguration config) {
        this(config, new ProductBundleServiceStubFactoryImpl());
    }

    public ProductBundleServiceClientImpl(WebServiceConfiguration config, ProductBundleServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] productBundles) {
        try {
            return stub.create(productBundles);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(TDelete_Input[] productBundles) {
        try {
            return stub.delete(productBundles);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(TExists_Input[] productBundles) {
        try {
            return stub.exists(productBundles);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] products) {
        try {
            return stub.getInfo(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
