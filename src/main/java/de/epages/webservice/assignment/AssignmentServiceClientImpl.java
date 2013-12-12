package de.epages.webservice.assignment;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.assignment.model.TAssignProductToCatalog_Input;
import de.epages.webservice.assignment.model.TAssignProductToCatalog_Return;
import de.epages.webservice.assignment.model.TGetCatalogsAssignedToProduct_Return;
import de.epages.webservice.assignment.model.TGetProductsAssignedToCatalog_Return;
import de.epages.webservice.assignment.model.TIsProductAssignedToCatalog_Input;
import de.epages.webservice.assignment.model.TIsProductAssignedToCatalog_Return;
import de.epages.webservice.assignment.model.TRemoveProductFromCatalog_Input;
import de.epages.webservice.assignment.model.TRemoveProductFromCatalog_Return;
import de.epages.webservice.assignment.stub.AssignmentServiceLocator;
import de.epages.webservice.assignment.stub.Port_Assignment;

public final class AssignmentServiceClientImpl implements AssignmentServiceClient {
    private static final AssignmentServiceLocator serviceLocator = new AssignmentServiceLocator();
    private final Port_Assignment stub;

    public AssignmentServiceClientImpl(WebServiceConfiguration config) {
        this(config, new AssignmentServiceStubFactoryImpl());
    }

    public AssignmentServiceClientImpl(WebServiceConfiguration config, AssignmentServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    /**
     * Gets a list of Catalogs assigned to a Product. If there is an error with
     * a single Assignment, then this Assignment will be skipped and it will be
     * not part of there result list.
     * 
     * @param productPaths
     *            list of productPaths
     * @return list of TGetCatalogsAssignedToProduct_Return
     * @throws RemoteException
     * @see TGetCatalogsAssignedToProduct_Return
     */
    public TGetCatalogsAssignedToProduct_Return[] getCatalogsAssignedToProduct(String[] products) {
        try {
            return stub.getCatalogsAssignedToProduct(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Gets a list of Products assigned to a Catalog. If there is an error with
     * a single Assignment, then this Assignment will be skipped and it will be
     * not part of there result list.
     * 
     * @param catalogPaths
     *            list of catalogPaths
     * @return list of TGetProductsAssignedToCatalog_Return
     * @throws RemoteException
     * @see TGetProductsAssignedToCatalog_Return
     */
    public TGetProductsAssignedToCatalog_Return[] getProductsAssignedToCatalog(String[] catalogs) {
        try {
            return stub.getProductsAssignedToCatalog(catalogs);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Assignes a product to a catalog If there is an error with a single
     * Assignment, then this Assignment will be skipped and it will be not part
     * of there result list.
     * 
     * @param assignments
     *            list of TAssignProductToCatalog_Input
     * @return list of TAssignProductToCatalog_Return
     * @throws RemoteException
     * @see TAssignProductToCatalog_Input
     * @see TAssignProductToCatalog_Return
     */
    @Override
    public TAssignProductToCatalog_Return[] assignProductToCatalog(TAssignProductToCatalog_Input[] assignments) {
        try {
            return stub.assignProductToCatalog(assignments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Removes an assignment of a Product and a Catalog. If there is an error
     * with a single Assignment, then this Assignment will be skipped and it
     * will be not part of there result list.
     * 
     * @param assignments
     *            list of assignments
     * @return list of TRemoveProductFromCatalog_Return
     * @throws RemoteException
     * @see TRemoveProductFromCatalog_Return
     */
    @Override
    public TRemoveProductFromCatalog_Return[] removeProductFromCatalog(TRemoveProductFromCatalog_Input[] assignments) {
        try {
            return stub.removeProductFromCatalog(assignments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Checks if a product is assigned to a catalog. If there is an error with a
     * single Assignment, then this Assignment will be skipped and it will be
     * not part of there result list.
     * 
     * @param assignments
     *            list of Assignments
     * @return list of TIsProductAssignedToCatalog_Return
     * @throws RemoteException
     * @see TIsProductAssignedToCatalog_Return
     */
    @Override
    public TIsProductAssignedToCatalog_Return[] isProductAssignedToCatalog(TIsProductAssignedToCatalog_Input[] assignments) {
        try {
            return stub.isProductAssignedToCatalog(assignments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
