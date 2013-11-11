package de.epages.WebServices.CustomerService;

import de.epages.WebServices.CustomerService.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;

import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.rmi.RemoteException;

public class CustomerServiceClient extends WebServiceConfiguration  {
    private CustomerService service;
    private Bind_Customer_SOAPStub stub;
    private static Logger log = Logger.getLogger(CustomerServiceClient.class.getName());

    /**
     * Class constructor
     */
    public CustomerServiceClient() {
        service = new CustomerServiceLocator();
        log.info("address specified by wsdl: " + service.getport_CustomerAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
            stub = new Bind_Customer_SOAPStub(new java.net.URL(WEBSERVICE_URL), service);

            // setting user-path and password of the shop
            stub.setUsername(WEBSERVICE_LOGIN);
            stub.setPassword(WEBSERVICE_PASSWORD);
        }
        catch (Exception e) {
            log.severe( e.toString() );
        }
    }

    /**
     * Gets information about a list of customers.
     * If there is an error with a single customer, then this customer will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of customer paths
     * @return          list of TGetInfo_Return
     * @throws          RemoteException
     * @see             TGetInfo_Return
     * @see             #getCustomerInfo(String[] paths, String[] attributes)
     */
    public List<TGetInfo_Return> getCustomerInfo(String[] paths) throws RemoteException {
        return getCustomerInfo(paths, new String[]{});
    }

    /**
     * Gets information about a list of customers.
     * If there is an error with a single customer, then this customer will be skipped and
     * it will be not part of there result list.
     *
     * @param paths         list of customer paths
     * @param attributes    list of customer paths
     * @return              list of TGetInfo_Return
     * @throws              RemoteException
     * @see                 TGetInfo_Return
     */
    public List<TGetInfo_Return> getCustomerInfo(String[] paths, String[] attributes) throws RemoteException {
        log.info("getCustomerInfo called");
        TGetInfo_Return[] customers = stub.getInfo(paths, attributes);
        List result = new ArrayList();

        for (int i = 0; i < customers.length; i++) {
            TGetInfo_Return customer = customers[i];

            if (customer.getError() == null) {
                log.info("successfully retrieved customer: " + customer.getAlias());
                result.add(customer);
            } else {
                log.severe("an error occured (Epages Error):\n" + customer.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Creates a list of customers with the given data.
     * If there is an error with a single customer, then this customer will be skipped and
     * it will be not part of there result list.
     *
     * @param customers list of TCreate_Input
     * @return          list of TCreate_Return
     * @throws          RemoteException
     * @see             TCreate_Input
     * @see             TCreate_Return
     */
    public List<TCreate_Return> createCustomer(List<TCreate_Input> customers) throws RemoteException {
        log.info("createCustomer called");
        TCreate_Input[] input = new TCreate_Input[customers.size()];
        for (int i = 0; i < customers.size(); i++) {
            input[i] =  customers.get(i);
        }

        TCreate_Return[] results = stub.create(input);
        List<TCreate_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TCreate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created customer: " + result.getAlias());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Updates a list of customers with the given data.
     * If there is an error with a single customer, then this customer will be skipped and
     * it will be not part of there result list.
     *
     * @param customers list of TUpdate_Input
     * @return          list of TUpdate_Return
     * @throws          RemoteException
     * @see             TUpdate_Input
     * @see             TUpdate_Return
     */
    public List<TUpdate_Return> updateCustomer(List<TUpdate_Input> customers) throws RemoteException {
        log.info("updateCustomer called");
        TUpdate_Input[] input = new TUpdate_Input[customers.size()];
        for (int i = 0; i < customers.size(); i++) {
            input[i] =  customers.get(i);
        }

        TUpdate_Return[] results = stub.update(input);
        List<TUpdate_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TUpdate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully updated customer: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Deletes a list of customers.
     * If there is an error with a single customer, then this customer will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of customer paths
     * @return          list of TDelete_Return
     * @throws          RemoteException
     * @see             TDelete_Return
     */
    public List<TDelete_Return> deleteCustomer(String[] paths) throws RemoteException {
        log.info("deleteCustomer called");

        TDelete_Return[] results = stub.delete(paths);
        List<TDelete_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TDelete_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted customer: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Checkes if a list of customers exists.
     * If there is an error with a single customer, then this customer will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of customer paths
     * @return          list of TExists_Return
     * @throws          RemoteException
     * @see             TExists_Return
     */
    public List<TExists_Return> existsCustomer(String[] paths) throws RemoteException {
        log.info("existsCustomer called");

        TExists_Return[] results = stub.exists(paths);
        List<TExists_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TExists_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check customer existance: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Searches for customers by given search parameters.
     *
     * @param parameters    list of TFind_Input
     * @return              List of customer paths
     * @throws              RemoteException
     * @see                 TFind_Input
     */
    public String[] findCustomers(TFind_Input parameters) throws RemoteException {
        log.info("findCustomer called");

        String[] results = stub.find(parameters);

        log.info("result count: " + results.length);

        return results;
    }
}
