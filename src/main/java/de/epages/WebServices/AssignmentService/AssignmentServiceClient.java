package de.epages.WebServices.AssignmentService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.AssignmentService.Stub.AssignmentService;
import de.epages.WebServices.AssignmentService.Stub.AssignmentServiceLocator;
import de.epages.WebServices.AssignmentService.Stub.Bind_Assignment_SOAPStub;
import de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Input;
import de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return;
import de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return;
import de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return;
import de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Input;
import de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return;
import de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Input;
import de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return;

public class AssignmentServiceClient {
    private AssignmentService service;
    private Bind_Assignment_SOAPStub stub;
    private static Logger log = Logger.getLogger(AssignmentServiceClient.class.getName());

    /**
     * Class constructor
     */
    public AssignmentServiceClient(WebServiceConfiguration config) {
        service = new AssignmentServiceLocator();
        log.info("address specified by wsdl: " + service.getport_AssignmentAddress());
        log.info("using web service Url: " + config.getWebserviceURL());

        try {
            stub = new Bind_Assignment_SOAPStub(config.getWebserviceURL(), service);

            // setting user-path and password of the shop
            stub.setUsername(config.getUsername());
            stub.setPassword(config.getPassword());
        }
        catch (Exception e) {
            log.severe( e.toString() );
        }
    }

    /**
     * Gets a list of Catalogs assigned to a Product.
     * If there is an error with a single Assignment, then this Assignment will be skipped and
     * it will be not part of there result list.
     *
     * @param productPaths  list of productPaths
     * @return              list of TGetCatalogsAssignedToProduct_Return
     * @throws              RemoteException
     * @see                 TGetCatalogsAssignedToProduct_Return
     */
    public List<TGetCatalogsAssignedToProduct_Return> getCatalogsAssignedToProduct(String[] productPaths) throws RemoteException {
        log.info("getCatalogsAssignedToProduct called");
        TGetCatalogsAssignedToProduct_Return[] Assignments = stub.getCatalogsAssignedToProduct(productPaths);
        List<TGetCatalogsAssignedToProduct_Return> result = new ArrayList<TGetCatalogsAssignedToProduct_Return>();

        for (int i = 0; i < Assignments.length; i++) {
            TGetCatalogsAssignedToProduct_Return Assignment = Assignments[i];

            if (Assignment.getError() == null) {
                log.info("successfully retrieved Assignments to Product: " + Assignment.getProduct());
                result.add(Assignment);
            } else {
                log.severe("an error occured (Epages Error):\n" + Assignment.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Gets a list of Products assigned to a Catalog.
     * If there is an error with a single Assignment, then this Assignment will be skipped and
     * it will be not part of there result list.
     *
     * @param catalogPaths  list of catalogPaths
     * @return              list of TGetProductsAssignedToCatalog_Return
     * @throws              RemoteException
     * @see                 TGetProductsAssignedToCatalog_Return
     */
    public List<TGetProductsAssignedToCatalog_Return> getProductsAssignedToCatalog(String[] catalogPaths) throws RemoteException {
        log.info("getProductsAssignedToCatalog called");
        TGetProductsAssignedToCatalog_Return[] Assignments = stub.getProductsAssignedToCatalog(catalogPaths);
        List<TGetProductsAssignedToCatalog_Return> result = new ArrayList<TGetProductsAssignedToCatalog_Return>();

        for (int i = 0; i < Assignments.length; i++) {
            TGetProductsAssignedToCatalog_Return Assignment = Assignments[i];

            if (Assignment.getError() == null) {
                log.info("successfully retrieved Assignments to Catalog: " + Assignment.getCatalog());
                result.add(Assignment);
            } else {
                log.severe("an error occured (Epages Error):\n" + Assignment.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Assignes a product to a catalog
     * If there is an error with a single Assignment, then this Assignment will be skipped and
     * it will be not part of there result list.
     *
     * @param assignments list of TAssignProductToCatalog_Input
     * @return          list of TAssignProductToCatalog_Return
     * @throws          RemoteException
     * @see             TAssignProductToCatalog_Input
     * @see             TAssignProductToCatalog_Return
     */
    public List<TAssignProductToCatalog_Return> assignProductToCatalog(List<TAssignProductToCatalog_Input> assignments) throws RemoteException {
        log.info("assignProductToCatalog called");
        TAssignProductToCatalog_Input[] input = new TAssignProductToCatalog_Input[assignments.size()];
        for (int i = 0; i < assignments.size(); i++) {
            input[i] =  assignments.get(i);
        }

        TAssignProductToCatalog_Return[] results = stub.assignProductToCatalog(input);
        List<TAssignProductToCatalog_Return> resultList = new ArrayList<TAssignProductToCatalog_Return>();

        for (int i = 0; i < results.length; i++) {
            TAssignProductToCatalog_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created Assignment: " + result.getCatalog() + "/" + result.getProduct());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Removes an assignment of a Product and a Catalog.
     * If there is an error with a single Assignment, then this Assignment will be skipped and
     * it will be not part of there result list.
     *
     * @param assignments     list of assignments
     * @return          list of TRemoveProductFromCatalog_Return
     * @throws          RemoteException
     * @see             TRemoveProductFromCatalog_Return
     */
    public List<TRemoveProductFromCatalog_Return> removeProductFromCatalog(List<TRemoveProductFromCatalog_Input> assignments) throws RemoteException {
        log.info("removeProductFromCatalog called");
        TRemoveProductFromCatalog_Input[] input = new TRemoveProductFromCatalog_Input[assignments.size()];
        for (int i = 0; i < assignments.size(); i++) {
            input[i] =  assignments.get(i);
        }

        TRemoveProductFromCatalog_Return[] results = stub.removeProductFromCatalog(input);
        List<TRemoveProductFromCatalog_Return> resultList = new ArrayList<TRemoveProductFromCatalog_Return>();

        for (int i = 0; i < results.length; i++) {
            TRemoveProductFromCatalog_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted Assignment: " + result.getCatalog() + "/" + result.getProduct());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Checkes if a product is assigned to a catalog.
     * If there is an error with a single Assignment, then this Assignment will be skipped and
     * it will be not part of there result list.
     *
     * @param assignments list of Assignments
     * @return          list of TIsProductAssignedToCatalog_Return
     * @throws          RemoteException
     * @see             TIsProductAssignedToCatalog_Return
     */
    public List<TIsProductAssignedToCatalog_Return> isProductAssignedToCatalog(List<TIsProductAssignedToCatalog_Input> assignments) throws RemoteException {
        log.info("existsAssignment called");
        TIsProductAssignedToCatalog_Input[] input = new TIsProductAssignedToCatalog_Input[assignments.size()];
        for (int i = 0; i < assignments.size(); i++) {
            input[i] =  assignments.get(i);
        }

        TIsProductAssignedToCatalog_Return[] results = stub.isProductAssignedToCatalog(input);
        List<TIsProductAssignedToCatalog_Return> resultList = new ArrayList<TIsProductAssignedToCatalog_Return>();

        for (int i = 0; i < results.length; i++) {
            TIsProductAssignedToCatalog_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check Assignment existance: " + result.getCatalog() + "/" + result.getProduct());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }
}
