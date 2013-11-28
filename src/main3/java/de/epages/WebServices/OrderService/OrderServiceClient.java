package de.epages.WebServices.OrderService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.OrderService.Stub.Bind_Order_SOAPStub;
import de.epages.WebServices.OrderService.Stub.OrderService;
import de.epages.WebServices.OrderService.Stub.OrderServiceLocator;
import de.epages.WebServices.OrderService.Stub.TCreate_Input;
import de.epages.WebServices.OrderService.Stub.TCreate_Return;
import de.epages.WebServices.OrderService.Stub.TDelete_Return;
import de.epages.WebServices.OrderService.Stub.TExists_Return;
import de.epages.WebServices.OrderService.Stub.TFind_Input;
import de.epages.WebServices.OrderService.Stub.TGetInfo_Return;
import de.epages.WebServices.OrderService.Stub.TUpdate_Input;
import de.epages.WebServices.OrderService.Stub.TUpdate_Return;

public class OrderServiceClient {
    private OrderService service;
    private Bind_Order_SOAPStub stub;
    private static Logger log = Logger.getLogger(OrderServiceClient.class.getName());

    /**
     * Class constructor
     */
    public OrderServiceClient(WebServiceConfiguration config) {
        service = new OrderServiceLocator();
        log.info("address specified by wsdl: " + service.getport_OrderAddress());
        log.info("using web service Url: " + config.getWebserviceURL());

        try {
            stub = new Bind_Order_SOAPStub(config.getWebserviceURL(), service);

            // setting user-path and password of the shop
            stub.setUsername(config.getUsername());
            stub.setPassword(config.getPassword());
        }
        catch (Exception e) {
            log.severe( e.toString() );
        }
    }

    public List<TGetInfo_Return> getOrderInfo(String[] paths) throws RemoteException {
        return getOrderInfo(paths, new String[]{});
    }

    public List<TGetInfo_Return> getOrderInfo(String[] paths, String[] attributes) throws RemoteException {
        return getOrderInfo(paths, attributes, new String[]{});
    }

    /**
     * Gets information about a list of Orders.
     * If there is an error with a single Order, then this Order will be skipped and
     * it will be not part of there result list.
     *
     * @param paths         list of Order paths
     * @param attributes    list of attribute names
     * @param languages     list of language codes
     * @return              list of TGetInfo_Return
     * @throws              RemoteException
     * @see                 TGetInfo_Return
     */
    public List<TGetInfo_Return> getOrderInfo(String[] paths, String[] attributes, String[] languages) throws RemoteException {
        log.info("getOrderInfo called");
        TGetInfo_Return[] Orders = stub.getInfo(paths, attributes, languages);
        List result = new ArrayList<>();

        for (int i = 0; i < Orders.length; i++) {
            TGetInfo_Return Order = Orders[i];

            if (Order.getError() == null) {
                log.info("successfully retrieved Order: " + Order.getAlias());
                result.add(Order);
            } else {
                log.severe("an error occured (Epages Error):\n" + Order.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Creates a list of Orders with the given data.
     * If there is an error with a single Order, then this Order will be skipped and
     * it will be not part of there result list.
     *
     * @param Orders list of TCreate_Input
     * @return          list of TCreate_Return
     * @throws          RemoteException
     * @see             TCreate_Input
     * @see             TCreate_Return
     */
    public List<TCreate_Return> createOrder(List<TCreate_Input> Orders) throws RemoteException {
        log.info("createOrder called");
        TCreate_Input[] input = new TCreate_Input[Orders.size()];
        for (int i = 0; i < Orders.size(); i++) {
            input[i] =  Orders.get(i);
        }

        TCreate_Return[] results = stub.create(input);
        List<TCreate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TCreate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created Order: " + result.getAlias());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Updates a list of Orders with the given data.
     * If there is an error with a single Order, then this Order will be skipped and
     * it will be not part of there result list.
     *
     * @param Orders list of TUpdate_Input
     * @return          list of TUpdate_Return
     * @throws          RemoteException
     * @see             TUpdate_Input
     * @see             TUpdate_Return
     */
    public List<TUpdate_Return> updateOrder(List<TUpdate_Input> Orders) throws RemoteException {
        log.info("updateOrder called");
        TUpdate_Input[] input = new TUpdate_Input[Orders.size()];
        for (int i = 0; i < Orders.size(); i++) {
            input[i] =  Orders.get(i);
        }

        TUpdate_Return[] results = stub.update(input);
        List<TUpdate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TUpdate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully updated Order: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Deletes a list of Orders.
     * If there is an error with a single Order, then this Order will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of Order paths
     * @return          list of TDelete_Return
     * @throws          RemoteException
     * @see             TDelete_Return
     */
    public List<TDelete_Return> deleteOrder(String[] paths) throws RemoteException {
        log.info("deleteOrder called");

        TDelete_Return[] results = stub.delete(paths);
        List<TDelete_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TDelete_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted Order: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Checkes if a list of Orders exists.
     * If there is an error with a single Order, then this Order will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of Order paths
     * @return          list of TExists_Return
     * @throws          RemoteException
     * @see             TExists_Return
     */
    public List<TExists_Return> existsOrder(String[] paths) throws RemoteException {
        log.info("existsOrder called");

        TExists_Return[] results = stub.exists(paths);
        List<TExists_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TExists_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check Order existance: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Searches for Orders by given search parameters.
     *
     * @param parameters    list of TFind_Input
     * @return              List of Order paths
     * @throws              RemoteException
     * @see                 TFind_Input
     */
    public String[] findOrders(TFind_Input parameters) throws RemoteException {
        log.info("findOrder called");

        String[] results = stub.find(parameters);

        log.info("result count: " + results.length);

        return results;
    }
}
