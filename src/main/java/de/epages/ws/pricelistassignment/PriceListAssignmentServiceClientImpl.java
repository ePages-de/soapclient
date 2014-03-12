package de.epages.ws.pricelistassignment;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pricelistassignment.model.TGetQuantityDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TGetScalePrices_Return;
import de.epages.ws.pricelistassignment.model.TGetValueDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TSetQuantityDiscounts_Input;
import de.epages.ws.pricelistassignment.model.TSetQuantityDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TSetScalePrices_Input;
import de.epages.ws.pricelistassignment.model.TSetScalePrices_Return;
import de.epages.ws.pricelistassignment.model.TSetValueDiscounts_Input;
import de.epages.ws.pricelistassignment.model.TSetValueDiscounts_Return;
import de.epages.ws.pricelistassignment.stub.Port_PriceListAssignment;
import de.epages.ws.pricelistassignment.stub.PriceListAssignmentServiceLocator;

public final class PriceListAssignmentServiceClientImpl implements PriceListAssignmentServiceClient {

    private static final PriceListAssignmentServiceLocator serviceLocator = new PriceListAssignmentServiceLocator();
    private final Port_PriceListAssignment stub;

    public PriceListAssignmentServiceClientImpl(WebServiceConfiguration config) {
        this(config, new PriceListAssignmentServiceStubFactoryImpl());
    }

    public PriceListAssignmentServiceClientImpl(WebServiceConfiguration config, PriceListAssignmentServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TGetQuantityDiscounts_Return[] getQuantityDiscounts(String[] products, String[] priceLists) {
        try {
            return stub.getQuantityDiscounts(products, priceLists);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetScalePrices_Return[] getScalePrices(String[] products, String[] priceLists) {
        try {
            return stub.getScalePrices(products, priceLists);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetValueDiscounts_Return[] getValueDiscounts(String[] products, String[] priceLists) {
        try {
            return stub.getValueDiscounts(products, priceLists);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TSetQuantityDiscounts_Return[] setQuantityDiscounts(TSetQuantityDiscounts_Input[] products) {
        try {
            return stub.setQuantityDiscounts(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TSetScalePrices_Return[] setScalePrices(TSetScalePrices_Input[] products) {
        try {
            return stub.setScalePrices(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TSetValueDiscounts_Return[] setValueDiscounts(TSetValueDiscounts_Input[] products) {
        try {
            return stub.setValueDiscounts(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
