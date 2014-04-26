package de.epages.ws.pricelist;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pricelist.model.TCreate_Input;
import de.epages.ws.pricelist.model.TCreate_Return;
import de.epages.ws.pricelist.model.TDelete_Return;
import de.epages.ws.pricelist.model.TExists_Return;
import de.epages.ws.pricelist.model.TGetInfo_Return;
import de.epages.ws.pricelist.model.TUpdate_Input;
import de.epages.ws.pricelist.model.TUpdate_Return;
import de.epages.ws.pricelist.stub.Port_PriceList;
import de.epages.ws.pricelist.stub.PriceListServiceLocator;

public final class PriceListServiceClientImpl implements PriceListServiceClient {

    private static final PriceListServiceLocator serviceLocator = new PriceListServiceLocator();
    private final Port_PriceList stub;

    public PriceListServiceClientImpl(WebServiceConfiguration config) {
        this(config, new PriceListServiceStubFactoryImpl());
    }

    public PriceListServiceClientImpl(WebServiceConfiguration config, PriceListServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] priceLists) {
        try {
            return stub.create(priceLists);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] priceLists) {
        try {
            return stub.delete(priceLists);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] priceLists) {
        try {
            return stub.exists(priceLists);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] priceLists, String[] attributes, String[] languageCodes) {
        try {
            return stub.getInfo(priceLists, attributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] priceLists) {
        try {
            return stub.update(priceLists);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
