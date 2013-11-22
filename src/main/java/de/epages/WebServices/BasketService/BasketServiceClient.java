package de.epages.WebServices.BasketService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import de.epages.WebServices.ErrorHandler;
import de.epages.WebServices.ThrowingErrorHandler;
import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.BasketService.Stub.BasketService;
import de.epages.WebServices.BasketService.Stub.BasketServiceLocator;
import de.epages.WebServices.BasketService.Stub.Bind_Basket_SOAPStub;
import de.epages.WebServices.BasketService.Stub.Port_Basket_PortType;
import de.epages.WebServices.BasketService.Stub.TCreate_Input;
import de.epages.WebServices.BasketService.Stub.TCreate_Return;
import de.epages.WebServices.BasketService.Stub.TDelete_Return;
import de.epages.WebServices.BasketService.Stub.TExists_Return;
import de.epages.WebServices.BasketService.Stub.TGetInfo_Return;
import de.epages.WebServices.BasketService.Stub.TUpdate_Input;
import de.epages.WebServices.BasketService.Stub.TUpdate_Return;

public class BasketServiceClient implements Port_Basket_PortType {

    private static final BasketService service = new BasketServiceLocator();
    private final Bind_Basket_SOAPStub stub;
    private final ErrorHandler errorHandler;

    public BasketServiceClient(final WebServiceConfiguration config) {
        this(config, new ThrowingErrorHandler());
    }

    public BasketServiceClient(WebServiceConfiguration config, ErrorHandler errorHandler) {
        this(config, errorHandler, new BasketServiceStubFactoryImpl());
    }

    public BasketServiceClient(WebServiceConfiguration config, ErrorHandler errorHandler, BasketServiceStubFactory factory) {
        this.stub = factory.create(config, service);
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

}
