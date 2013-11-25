package de.epages.webservice.basket;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import de.epages.webservice.ErrorHandler;
import de.epages.webservice.ThrowingErrorHandler;
import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.basket.model.TAddProductLineItem_Input;
import de.epages.webservice.basket.model.TAddProductLineItem_Return;
import de.epages.webservice.basket.model.TCreate_Input;
import de.epages.webservice.basket.model.TCreate_Return;
import de.epages.webservice.basket.model.TDeleteLineItem_Return;
import de.epages.webservice.basket.model.TDelete_Return;
import de.epages.webservice.basket.model.TExists_Return;
import de.epages.webservice.basket.model.TGetInfo_Return;
import de.epages.webservice.basket.model.TUpdateLineItem_Input;
import de.epages.webservice.basket.model.TUpdateLineItem_Return;
import de.epages.webservice.basket.model.TUpdate_Input;
import de.epages.webservice.basket.model.TUpdate_Return;
import de.epages.webservice.basket.stub.BasketServiceLocator;
import de.epages.webservice.basket.stub.Bind_Basket_SOAPStub;

public class BasketServiceImpl implements BasketService {

    private static final BasketServiceLocator serviceLocator = new BasketServiceLocator();
    private final Bind_Basket_SOAPStub stub;
    private final ErrorHandler errorHandler;

    public BasketServiceImpl(final WebServiceConfiguration config) {
        this(config, new ThrowingErrorHandler());
    }

    public BasketServiceImpl(WebServiceConfiguration config, ErrorHandler errorHandler) {
        this(config, errorHandler, new BasketServiceStubFactoryImpl());
    }

    public BasketServiceImpl(WebServiceConfiguration config, ErrorHandler errorHandler, BasketServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
        this.errorHandler = errorHandler;
    }

    public TGetInfo_Return[] getInfo(String[] baskets) throws RemoteException {
        return getInfo(baskets, new String[] {});
    }

    public TGetInfo_Return[] getInfo(String[] baskets, String[] attributes) throws RemoteException {
        return getInfo(baskets, attributes, new String[] {});
    }

    public TGetInfo_Return[] getInfo(String[] baskets, String[] attributes, String[] addressAttributes) throws RemoteException {
        return getInfo(baskets, attributes, addressAttributes, new String[] {});
    }

    public TGetInfo_Return[] getInfo(String[] baskets, String[] attributes, String[] addressAttributes, String[] lineItemAttributes)
            throws RemoteException {
        return getInfo(baskets, attributes, addressAttributes, lineItemAttributes, new String[] {});
    }

    public TGetInfo_Return[] getInfo(String[] baskets, String[] attributes, String[] addressAttributes, String[] lineItemAttributes,
            String[] languageCodes) throws RemoteException {
        TGetInfo_Return[] info = stub.getInfo(baskets, attributes, addressAttributes, lineItemAttributes, languageCodes);
        List<TGetInfo_Return> resultList = new ArrayList<>(info.length);
        for (int i = 0; i < info.length; i++) {
            TGetInfo_Return element = info[i];
            if (element.getError() != null) {
                errorHandler.handle(element, element.getError().getMessage());
            } else {
                resultList.add(element);
            }
        }
        return resultList.toArray(new TGetInfo_Return[resultList.size()]);
    }

    public TExists_Return[] exists(String[] baskets) throws RemoteException {
        TExists_Return[] exists = stub.exists(baskets);
        List<TExists_Return> resultList = new ArrayList<>(exists.length);
        for (int i = 0; i < exists.length; i++) {
            TExists_Return element = exists[i];
            if (element.getError() != null) {
                errorHandler.handle(element, element.getError().getMessage());
            } else {
                resultList.add(element);
            }
        }
        return resultList.toArray(new TExists_Return[resultList.size()]);
    }

    public TDelete_Return[] delete(String[] baskets) throws RemoteException {
        TDelete_Return[] delete = stub.delete(baskets);
        List<TDelete_Return> resultList = new ArrayList<>(delete.length);

        for (int i = 0; i < delete.length; i++) {
            TDelete_Return element = delete[i];
            if (element.getError() != null) {
                errorHandler.handle(element, element.getError().getMessage());
            } else {
                resultList.add(element);
            }
        }
        return resultList.toArray(new TDelete_Return[resultList.size()]);
    }

    public TUpdate_Return[] update(TUpdate_Input[] baskets) throws RemoteException {
        TUpdate_Return[] update = stub.update(baskets);
        List<TUpdate_Return> resultList = new ArrayList<>(update.length);

        for (int i = 0; i < update.length; i++) {
            TUpdate_Return element = update[i];
            if (element.getError() != null) {
                errorHandler.handle(element, element.getError().getMessage());
            } else {
                resultList.add(element);
            }
        }
        return resultList.toArray(new TUpdate_Return[resultList.size()]);
    }

    public TCreate_Return[] create(TCreate_Input[] baskets) throws RemoteException {
        TCreate_Return[] create = stub.create(baskets);
        List<TCreate_Return> resultList = new ArrayList<>(create.length);

        for (int i = 0; i < create.length; i++) {
            TCreate_Return element = create[i];
            if (element.getError() != null) {
                errorHandler.handle(element, element.getError().getMessage());
            } else {
                resultList.add(element);
            }
        }
        return resultList.toArray(new TCreate_Return[resultList.size()]);
    }

    @Override
    public TUpdateLineItem_Return[] updateLineItem(String TBasketPath, TUpdateLineItem_Input[] lineItems) throws RemoteException {
        TUpdateLineItem_Return[] update = stub.updateLineItem(TBasketPath, lineItems);
        List<TUpdateLineItem_Return> resultList = new ArrayList<>(update.length);

        for (int i = 0; i < update.length; i++) {
            TUpdateLineItem_Return element = update[i];
            if (element.getError() != null) {
                errorHandler.handle(element, element.getError().getMessage());
            } else {
                resultList.add(element);
            }
        }
        return resultList.toArray(new TUpdateLineItem_Return[resultList.size()]);
    }

    @Override
    public TDeleteLineItem_Return[] deleteLineItem(String TBasketPath, String[] lineItems) throws RemoteException {
        TDeleteLineItem_Return[] delete = stub.deleteLineItem(TBasketPath, lineItems);
        List<TDeleteLineItem_Return> resultList = new ArrayList<>(delete.length);

        for (int i = 0; i < delete.length; i++) {
            TDeleteLineItem_Return element = delete[i];
            if (element.getError() != null) {
                errorHandler.handle(element, element.getError().getMessage());
            } else {
                resultList.add(element);
            }
        }
        return resultList.toArray(new TDeleteLineItem_Return[resultList.size()]);
    }

    @Override
    public TAddProductLineItem_Return[] addProductLineItem(String TBasketPath, TAddProductLineItem_Input[] lineItems)
            throws RemoteException {
        TAddProductLineItem_Return[] add = stub.addProductLineItem(TBasketPath, lineItems);
        List<TAddProductLineItem_Return> resultList = new ArrayList<>(add.length);

        for (int i = 0; i < add.length; i++) {
            TAddProductLineItem_Return element = add[i];
            if (element.getError() != null) {
                errorHandler.handle(element, element.getError().getMessage());
            } else {
                resultList.add(element);
            }
        }
        return resultList.toArray(new TAddProductLineItem_Return[resultList.size()]);
    }

}
