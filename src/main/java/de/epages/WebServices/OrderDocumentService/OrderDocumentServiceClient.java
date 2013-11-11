package de.epages.WebServices.OrderDocumentService;

import de.epages.WebServices.OrderDocumentService.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;

import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.rmi.RemoteException;

public class OrderDocumentServiceClient extends WebServiceConfiguration  {
    private OrderDocumentService service;
    private Bind_OrderDocument_SOAPStub stub;
    private static Logger log = Logger.getLogger(OrderDocumentServiceClient.class.getName());

    /**
     * Class constructor
     */
    public OrderDocumentServiceClient() {
        service = new OrderDocumentServiceLocator();
        log.info("address specified by wsdl: " + service.getport_OrderDocumentAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
            stub = new Bind_OrderDocument_SOAPStub(new java.net.URL(WEBSERVICE_URL), service);

            // setting user-path and password of the shop
            stub.setUsername(WEBSERVICE_LOGIN);
            stub.setPassword(WEBSERVICE_PASSWORD);
        }
        catch (Exception e) {
            log.severe( e.toString() );
        }
    }

    public List<TGetInfo_Return> getOrderDocumentInfo(String[] paths) throws RemoteException {
        return getOrderDocumentInfo(paths, new String[]{});
    }

    public List<TGetInfo_Return> getOrderDocumentInfo(String[] paths, String[] attributes) throws RemoteException {
        return getOrderDocumentInfo(paths, attributes, new String[]{});
    }

    /**
     * Gets information about a list of OrderDocuments.
     * If there is an error with a single OrderDocument, then this OrderDocument will be skipped and
     * it will be not part of there result list.
     *
     * @param paths         list of OrderDocument paths
     * @param attributes    list of attribute names
     * @param languages     list of language codes
     * @return              list of TGetInfo_Return
     * @throws              RemoteException
     * @see                 TGetInfo_Return
     */
    public List<TGetInfo_Return> getOrderDocumentInfo(String[] paths, String[] attributes, String[] languages) throws RemoteException {
        log.info("getOrderDocumentInfo called");
        TGetInfo_Return[] OrderDocuments = stub.getInfo(paths, attributes, languages);
        List result = new ArrayList();

        for (int i = 0; i < OrderDocuments.length; i++) {
            TGetInfo_Return OrderDocument = OrderDocuments[i];

            if (OrderDocument.getError() == null) {
                log.info("successfully retrieved OrderDocument: " + OrderDocument.getAlias());
                result.add(OrderDocument);
            } else {
                log.severe("an error occured (Epages Error):\n" + OrderDocument.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Gets Invoices of an Order
     * If there is an error with a single OrderDocument, then this OrderDocument will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of order paths
     * @return          list of TGetInvoices_Return
     * @throws RemoteException
     * @see TGetInvoices_Return
     */
    public List<TGetInvoices_Return> getInvoices(String[] paths) throws RemoteException {
        log.info("getInvoices called");
        TGetInvoices_Return[] OrderDocuments = stub.getInvoices(paths);
        List result = new ArrayList();

        for (int i = 0; i < OrderDocuments.length; i++) {
            TGetInvoices_Return OrderDocument = OrderDocuments[i];

            if (OrderDocument.getError() == null) {
                log.info("successfully retrieved Invoices for Order: " + OrderDocument.getOrder());
                result.add(OrderDocument);
            } else {
                log.severe("an error occured (Epages Error):\n" + OrderDocument.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Gets PackingSlips of an Order
     * If there is an error with a single OrderDocument, then this OrderDocument will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of order paths
     * @return          list of TGetPackingSlips_Return
     * @throws RemoteException
     * @see TGetPackingSlips_Return
     */
    public List<TGetPackingSlips_Return> getPackingSlips(String[] paths) throws RemoteException {
        log.info("getInvoices called");
        TGetPackingSlips_Return[] OrderDocuments = stub.getPackingSlips(paths);
        List result = new ArrayList();

        for (int i = 0; i < OrderDocuments.length; i++) {
            TGetPackingSlips_Return OrderDocument = OrderDocuments[i];

            if (OrderDocument.getError() == null) {
                log.info("successfully retrieved PackingSlips for Order: " + OrderDocument.getOrder());
                result.add(OrderDocument);
            } else {
                log.severe("an error occured (Epages Error):\n" + OrderDocument.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Gets CreditNotes of an Order
     * If there is an error with a single OrderDocument, then this OrderDocument will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of order paths
     * @return          list of TGetCreditNotes_Return
     * @throws RemoteException
     * @see TGetCreditNotes_Return
     */
    public List<TGetCreditNotes_Return> getCreditNotes(String[] paths) throws RemoteException {
        log.info("getInvoices called");
        TGetCreditNotes_Return[] OrderDocuments = stub.getCreditNotes(paths);
        List result = new ArrayList();

        for (int i = 0; i < OrderDocuments.length; i++) {
            TGetCreditNotes_Return OrderDocument = OrderDocuments[i];

            if (OrderDocument.getError() == null) {
                log.info("successfully retrieved PackingSlips for Order: " + OrderDocument.getOrder());
                result.add(OrderDocument);
            } else {
                log.severe("an error occured (Epages Error):\n" + OrderDocument.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Creates a list of OrderDocuments with the given data.
     * If there is an error with a single OrderDocument, then this OrderDocument will be skipped and
     * it will be not part of there result list.
     *
     * @param OrderDocuments list of TCreate_Input
     * @return          list of TCreate_Return
     * @throws          RemoteException
     * @see             TCreate_Input
     * @see             TCreate_Return
     */
    public List<TCreate_Return> createOrderDocument(List<TCreate_Input> OrderDocuments) throws RemoteException {
        log.info("createOrderDocument called");
        TCreate_Input[] input = new TCreate_Input[OrderDocuments.size()];
        for (int i = 0; i < OrderDocuments.size(); i++) {
            input[i] =  OrderDocuments.get(i);
        }

        TCreate_Return[] results = stub.create(input);
        List<TCreate_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TCreate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created OrderDocument: " + result.getAlias());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Deletes a list of OrderDocuments.
     * If there is an error with a single OrderDocument, then this OrderDocument will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of OrderDocument paths
     * @return          list of TDelete_Return
     * @throws          RemoteException
     * @see             TDelete_Return
     */
    public List<TDelete_Return> deleteOrderDocument(String[] paths) throws RemoteException {
        log.info("deleteOrderDocument called");

        TDelete_Return[] results = stub.delete(paths);
        List<TDelete_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TDelete_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted OrderDocument: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Checkes if a list of OrderDocuments exists.
     * If there is an error with a single OrderDocument, then this OrderDocument will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of OrderDocument paths
     * @return          list of TExists_Return
     * @throws          RemoteException
     * @see             TExists_Return
     */
    public List<TExists_Return> existsOrderDocument(String[] paths) throws RemoteException {
        log.info("existsOrderDocument called");

        TExists_Return[] results = stub.exists(paths);
        List<TExists_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TExists_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check OrderDocument existance: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }
}
