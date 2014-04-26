package de.epages.ws.basket;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.basket.model.TAddProductLineItem_Input;
import de.epages.ws.basket.model.TAddProductLineItem_Return;
import de.epages.ws.basket.model.TCreate_Input;
import de.epages.ws.basket.model.TCreate_Return;
import de.epages.ws.basket.model.TDeleteLineItem_Return;
import de.epages.ws.basket.model.TDelete_Return;
import de.epages.ws.basket.model.TExists_Return;
import de.epages.ws.basket.model.TGetInfo_Return;
import de.epages.ws.basket.model.TUpdateLineItem_Input;
import de.epages.ws.basket.model.TUpdateLineItem_Return;
import de.epages.ws.basket.model.TUpdate_Input;
import de.epages.ws.basket.model.TUpdate_Return;
import de.epages.ws.basket.stub.BasketServiceLocator;
import de.epages.ws.basket.stub.Port_Basket;

public final class BasketServiceClientImpl implements BasketServiceClient {

    private static final BasketServiceLocator serviceLocator = new BasketServiceLocator();
    private final Port_Basket stub;

    public BasketServiceClientImpl(final WebServiceConfiguration config) {
        this(config, new BasketServiceStubFactoryImpl());
    }

    public BasketServiceClientImpl(WebServiceConfiguration config, BasketServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    public BasketServiceClientImpl(Port_Basket stub) {
        this.stub = stub;
    }

    public TGetInfo_Return[] getInfo(String[] baskets) {
        return this.getInfo(baskets, new String[] {}, new String[] {}, new String[] {}, new String[] {});
    }

    public TGetInfo_Return[] getInfo(String[] baskets, String[] attributes) {
        return this.getInfo(baskets, attributes, new String[] {}, new String[] {}, new String[] {});
    }

    public TGetInfo_Return[] getInfo(String[] baskets, String[] attributes, String[] addressAttributes, String[] lineItemAttributes,
            String[] languageCodes) {
        try {
            return stub.getInfo(baskets, attributes, addressAttributes, lineItemAttributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    public TExists_Return[] exists(String[] baskets) {
        try {
            return stub.exists(baskets);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    public TDelete_Return[] delete(String[] baskets) {
        try {
            return stub.delete(baskets);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    public TDeleteLineItem_Return[] deleteLineItem(String TBasketPath, String[] lineItems) {
        try {
            return stub.deleteLineItem(TBasketPath, lineItems);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    public TUpdate_Return[] update(TUpdate_Input[] baskets) {
        try {
            return stub.update(baskets);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    public TUpdateLineItem_Return[] updateLineItem(String TBasketPath, TUpdateLineItem_Input[] lineItems) {
        try {
            return stub.updateLineItem(TBasketPath, lineItems);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    public TCreate_Return[] create(TCreate_Input[] baskets) {
        try {
            return stub.create(baskets);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    public TAddProductLineItem_Return[] addProductLineItem(String TBasketPath, TAddProductLineItem_Input[] lineItems) {
        try {
            return stub.addProductLineItem(TBasketPath, lineItems);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
