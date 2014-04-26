package de.epages.ws.productattribute;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productattribute.model.TGetInfoList_Return;
import de.epages.ws.productattribute.stub.Port_ProductAttribute;
import de.epages.ws.productattribute.stub.ProductAttributeServiceLocator;

public final class ProductAttributeServiceClientImpl implements ProductAttributeServiceClient {

    private static final ProductAttributeServiceLocator serviceLocator = new ProductAttributeServiceLocator();
    private final Port_ProductAttribute stub;

    public ProductAttributeServiceClientImpl(WebServiceConfiguration config) {
        this(config, new ProductAttributeServiceStubFactoryImpl());
    }

    public ProductAttributeServiceClientImpl(WebServiceConfiguration config, ProductAttributeServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TGetInfoList_Return[] getInfoList() {
        try {
            return stub.getInfoList();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
