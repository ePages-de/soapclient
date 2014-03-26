package de.epages.ws.productimage;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productimage.model.TDelete_Return;
import de.epages.ws.productimage.model.TScaleParams;
import de.epages.ws.productimage.model.TUploadScale_Input;
import de.epages.ws.productimage.model.TUploadScale_Return;
import de.epages.ws.productimage.model.TUpload_Input;
import de.epages.ws.productimage.model.TUpload_Return;
import de.epages.ws.productimage.stub.Port_ProductImage;
import de.epages.ws.productimage.stub.ProductImageServiceLocator;

public final class ProductImageServiceClientImpl implements ProductImageServiceClient {

    private static final ProductImageServiceLocator serviceLocator = new ProductImageServiceLocator();
    private final Port_ProductImage stub;

    public ProductImageServiceClientImpl(WebServiceConfiguration config) {
        this(config, new ProductImageServiceStubFactoryImpl());
    }

    public ProductImageServiceClientImpl(WebServiceConfiguration config, ProductImageServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TDelete_Return[] delete(String TObjectPath, String[] TListOfFileNames) {
        try {
            return stub.delete(TObjectPath, TListOfFileNames);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public boolean exists(String TObjectPath, String TFileName) {
        try {
            return stub.exists(TObjectPath, TFileName);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpload_Return[] upload(String TObjectPath, TUpload_Input imageData) {
        try {
            return stub.upload(TObjectPath, imageData);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUploadScale_Return[] uploadscale(String TObjectPath, TUploadScale_Input imageData, TScaleParams scaleParams) {
        try {
            return stub.uploadscale(TObjectPath, imageData, scaleParams);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
