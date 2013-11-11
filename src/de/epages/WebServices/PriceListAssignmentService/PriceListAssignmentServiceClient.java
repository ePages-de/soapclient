package de.epages.WebServices.PriceListAssignmentService;

import de.epages.WebServices.PriceListAssignmentService.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;

import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.rmi.RemoteException;

public class PriceListAssignmentServiceClient extends WebServiceConfiguration  {
    private PriceListAssignmentService service;
    private Bind_PriceListAssignment_SOAPStub stub;
    private static Logger log = Logger.getLogger(PriceListAssignmentServiceClient.class.getName());

    /**
     * Class constructor
     */
    public PriceListAssignmentServiceClient() {
        service = new PriceListAssignmentServiceLocator();
        log.info("address specified by wsdl: " + service.getport_PriceListAssignmentAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
            stub = new Bind_PriceListAssignment_SOAPStub(new java.net.URL(WEBSERVICE_URL), service);

            // setting user-path and password of the shop
            stub.setUsername(WEBSERVICE_LOGIN);
            stub.setPassword(WEBSERVICE_PASSWORD);
        }
        catch (Exception e) {
            log.severe( e.toString() );
        }
    }

    /**
     * Gets QuantityDiscounts for a PriceList / Product combination.
     * If there is an error with a single PriceListAssignment, then this PriceListAssignment will be skipped and
     * it will be not part of there result list.
     *
     * @param productPaths      list of Products
     * @param pricelistPaths    list of PriceLists
     * @return              list of TGetQuantityDiscounts_Return
     * @throws              RemoteException
     * @see                 TGetQuantityDiscounts_Return
     */
    public List<TGetQuantityDiscounts_Return> getQuantityDiscounts(String[] productPaths, String[] pricelistPaths) throws RemoteException {
        log.info("getQuantityDiscounts called");
        TGetQuantityDiscounts_Return[] PriceListAssignments = stub.getQuantityDiscounts(productPaths, pricelistPaths);
        List result = new ArrayList();

        for (int i = 0; i < PriceListAssignments.length; i++) {
            TGetQuantityDiscounts_Return PriceListAssignment = PriceListAssignments[i];

            if (PriceListAssignment.getError() == null) {
                log.info("successfully retrieved QuantityDiscounts for Product: " + PriceListAssignment.getProduct());
                result.add(PriceListAssignment);
            } else {
                log.severe("an error occured (Epages Error):\n" + PriceListAssignment.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Creates QuantityDiscounts for specified Products and PriceLists.
     * If there is an error with a single PriceListAssignment, then this PriceListAssignment will be skipped and
     * it will be not part of there result list.
     *
     * @param           PriceListAssignments list of TSetQuantityDiscounts_Input
     * @return          list of TSetQuantityDiscounts_Return
     * @throws          RemoteException
     * @see             TSetQuantityDiscounts_Input
     * @see             TSetQuantityDiscounts_Return
     */
    public List<TSetQuantityDiscounts_Return> setQuantityDiscounts(List<TSetQuantityDiscounts_Input> PriceListAssignments) throws RemoteException {
        log.info("createPriceListAssignment called");
        TSetQuantityDiscounts_Input[] input = new TSetQuantityDiscounts_Input[PriceListAssignments.size()];
        for (int i = 0; i < PriceListAssignments.size(); i++) {
            input[i] =  PriceListAssignments.get(i);
        }

        TSetQuantityDiscounts_Return[] results = stub.setQuantityDiscounts(input);
        List<TSetQuantityDiscounts_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TSetQuantityDiscounts_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created QuantityDiscounts: " + result.getProduct() + "/" + result.getPriceList());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Gets ValueDiscounts for a PriceList / Product combination.
     * If there is an error with a single PriceListAssignment, then this PriceListAssignment will be skipped and
     * it will be not part of there result list.
     *
     * @param productPaths      list of Products
     * @param pricelistPaths    list of PriceLists
     * @return              list of TGetQuantityDiscounts_Return
     * @throws              RemoteException
     * @see                 TGetValueDiscounts_Return
     */
    public List<TGetValueDiscounts_Return> getValueDiscounts(String[] productPaths, String[] pricelistPaths) throws RemoteException {
        log.info("getQuantityDiscounts called");
        TGetValueDiscounts_Return[] PriceListAssignments = stub.getValueDiscounts(productPaths, pricelistPaths);
        List result = new ArrayList();

        for (int i = 0; i < PriceListAssignments.length; i++) {
            TGetValueDiscounts_Return PriceListAssignment = PriceListAssignments[i];

            if (PriceListAssignment.getError() == null) {
                log.info("successfully retrieved ValueDiscounts for Product: " + PriceListAssignment.getProduct());
                result.add(PriceListAssignment);
            } else {
                log.severe("an error occured (Epages Error):\n" + PriceListAssignment.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Creates ValueDiscounts for specified Products and PriceLists.
     * If there is an error with a single PriceListAssignment, then this PriceListAssignment will be skipped and
     * it will be not part of there result list.
     *
     * @param           PriceListAssignments list of TSetValueDiscounts_Input
     * @return          list of TSetValueDiscounts_Return
     * @throws          RemoteException
     * @see             TSetValueDiscounts_Input
     * @see             TSetValueDiscounts_Return
     */
    public List<TSetValueDiscounts_Return> setValueDiscounts(List<TSetValueDiscounts_Input> PriceListAssignments) throws RemoteException {
        log.info("createPriceListAssignment called");
        TSetValueDiscounts_Input[] input = new TSetValueDiscounts_Input[PriceListAssignments.size()];
        for (int i = 0; i < PriceListAssignments.size(); i++) {
            input[i] =  PriceListAssignments.get(i);
        }

        TSetValueDiscounts_Return[] results = stub.setValueDiscounts(input);
        List<TSetValueDiscounts_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TSetValueDiscounts_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created ValueDiscounts: " + result.getProduct() + "/" + result.getPriceList());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Gets ValueDiscounts for a PriceList / Product combination.
     * If there is an error with a single PriceListAssignment, then this PriceListAssignment will be skipped and
     * it will be not part of there result list.
     *
     * @param productPaths      list of Products
     * @param pricelistPaths    list of PriceLists
     * @return              list of TGetQuantityDiscounts_Return
     * @throws              RemoteException
     * @see                 TGetValueDiscounts_Return
     */
    public List<TGetScalePrices_Return> getScalePrices(String[] productPaths, String[] pricelistPaths) throws RemoteException {
        log.info("getQuantityDiscounts called");
        TGetScalePrices_Return[] PriceListAssignments = stub.getScalePrices(productPaths, pricelistPaths);
        List result = new ArrayList();

        for (int i = 0; i < PriceListAssignments.length; i++) {
            TGetScalePrices_Return PriceListAssignment = PriceListAssignments[i];

            if (PriceListAssignment.getError() == null) {
                log.info("successfully retrieved ScalePrices for Product: " + PriceListAssignment.getProduct());
                result.add(PriceListAssignment);
            } else {
                log.severe("an error occured (Epages Error):\n" + PriceListAssignment.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Creates ValueDiscounts for specified Products and PriceLists.
     * If there is an error with a single PriceListAssignment, then this PriceListAssignment will be skipped and
     * it will be not part of there result list.
     *
     * @param           PriceListAssignments list of TSetValueDiscounts_Input
     * @return          list of TSetValueDiscounts_Return
     * @throws          RemoteException
     * @see             TSetValueDiscounts_Input
     * @see             TSetValueDiscounts_Return
     */
    public List<TSetScalePrices_Return> setScalePrices(List<TSetScalePrices_Input> PriceListAssignments) throws RemoteException {
        log.info("createPriceListAssignment called");
        TSetScalePrices_Input[] input = new TSetScalePrices_Input[PriceListAssignments.size()];
        for (int i = 0; i < PriceListAssignments.size(); i++) {
            input[i] =  PriceListAssignments.get(i);
        }

        TSetScalePrices_Return[] results = stub.setScalePrices(input);
        List<TSetScalePrices_Return> resultList = new ArrayList();

        for (int i = 0; i < results.length; i++) {
            TSetScalePrices_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created ScalePrices: " + result.getProduct() + "/" + result.getPriceList());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }
}
