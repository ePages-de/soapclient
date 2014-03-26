package de.epages.ws.orderdocument6;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.orderdocument6.model.TCreate_Input;
import de.epages.ws.orderdocument6.model.TCreate_Return;
import de.epages.ws.orderdocument6.model.TDelete_Return;
import de.epages.ws.orderdocument6.model.TExists_Return;
import de.epages.ws.orderdocument6.model.TGetCreditNotes_Return;
import de.epages.ws.orderdocument6.model.TGetInfo_Return;
import de.epages.ws.orderdocument6.model.TGetInvoices_Return;
import de.epages.ws.orderdocument6.model.TGetPackingSlips_Return;
import de.epages.ws.orderdocument6.stub.OrderDocumentServiceLocator;
import de.epages.ws.orderdocument6.stub.Port_OrderDocument;

public final class OrderDocumentServiceClientImpl implements OrderDocumentServiceClient {
    private static final OrderDocumentServiceLocator serviceLocator = new OrderDocumentServiceLocator();
    private final Port_OrderDocument stub;

    public OrderDocumentServiceClientImpl(WebServiceConfiguration config) {
        this(config, new OrderDocumentServiceStubFactoryImpl());
    }

    public OrderDocumentServiceClientImpl(WebServiceConfiguration config, OrderDocumentServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] orderDocuments) {
        return getInfo(orderDocuments, new String[] {});
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] orderDocuments, String[] attributes) {
        return getInfo(orderDocuments, attributes, new String[] {});
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] orderDocuments, String[] attributes, String[] addressAttributes) {
        return getInfo(orderDocuments, attributes, addressAttributes, new String[] {});
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] orderDocuments, String[] attributes, String[] addressAttributes, String[] lineAttributes) {
        return getInfo(orderDocuments, attributes, addressAttributes, lineAttributes, new String[] {});
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] orderDocuments, String[] attributes, String[] addressAttributes, String[] lineAttributes,
            String[] languageCodes) {
        try {
            return stub.getInfo(orderDocuments, attributes, addressAttributes, lineAttributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] orderDocuments) {
        try {
            return stub.exists(orderDocuments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] orderDocuments) {
        try {
            return stub.delete(orderDocuments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] orderDocuments) {
        try {
            return stub.create(orderDocuments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetInvoices_Return[] getInvoices(String[] orders) {
        try {
            return stub.getInvoices(orders);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetPackingSlips_Return[] getPackingSlips(String[] orders) {
        try {
            return stub.getPackingSlips(orders);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetCreditNotes_Return[] getCreditNotes(String[] orders) {
        try {
            return stub.getCreditNotes(orders);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
