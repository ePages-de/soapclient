package de.epages.WebServices.BasketService;

import java.rmi.RemoteException;

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

    public BasketServiceClient(WebServiceConfiguration config, BasketServiceStubFactory factory) {
        stub = factory.create(config, service);
    }

    public BasketServiceClient(final WebServiceConfiguration config) {
        this(config, new BasketServiceStubFactoryImpl());
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
        for (int i = 0; i < info.length; i++) {
            TGetInfo_Return element = info[i];
            if (element.getError() != null) {
                throw new RemoteException(element.getError().getMessage());
            }
        }
        return info;
    }

    public TExists_Return[] exists(String[] baskets) throws RemoteException {
        TExists_Return[] exists = stub.exists(baskets);
        for (int i = 0; i < exists.length; i++) {
            TExists_Return element = exists[i];
            if (element.getError() != null) {
                throw new RemoteException(element.getError().getMessage());
            }
        }
        return exists;
    }

    public TDelete_Return[] delete(String[] baskets) throws RemoteException {
        TDelete_Return[] delete = stub.delete(baskets);

        for (int i = 0; i < delete.length; i++) {
            TDelete_Return element = delete[i];
            if (element.getError() != null) {
                throw new RemoteException(element.getError().getMessage());
            }
        }
        return delete;
    }

    public TUpdate_Return[] update(TUpdate_Input[] baskets) throws RemoteException {
        TUpdate_Return[] update = stub.update(baskets);

        for (int i = 0; i < update.length; i++) {
            TUpdate_Return element = update[i];
            if (element.getError() != null) {
                throw new RemoteException(element.getError().getMessage());
            }
        }
        return update;
    }

    public TCreate_Return[] create(TCreate_Input[] baskets) throws RemoteException {
        TCreate_Return[] create = stub.create(baskets);

        for (int i = 0; i < create.length; i++) {
            TCreate_Return element = create[i];
            if (element.getError() != null) {
                throw new RemoteException(element.getError().getMessage());
            }
        }
        return create;
    }

}
