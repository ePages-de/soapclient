package de.epages.ws.assignment;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.assignment.model.TAssignProductToCatalog_Input;
import de.epages.ws.assignment.model.TAssignProductToCatalog_Return;
import de.epages.ws.assignment.model.TGetCatalogsAssignedToProduct_Return;
import de.epages.ws.assignment.model.TGetProductsAssignedToCatalog_Return;
import de.epages.ws.assignment.model.TIsProductAssignedToCatalog_Input;
import de.epages.ws.assignment.model.TIsProductAssignedToCatalog_Return;
import de.epages.ws.assignment.model.TRemoveProductFromCatalog_Input;
import de.epages.ws.assignment.model.TRemoveProductFromCatalog_Return;
import de.epages.ws.assignment.stub.AssignmentServiceLocator;
import de.epages.ws.assignment.stub.Port_Assignment;

public final class AssignmentServiceClientImpl implements AssignmentServiceClient {
    private static final AssignmentServiceLocator serviceLocator = new AssignmentServiceLocator();
    private final Port_Assignment stub;

    public AssignmentServiceClientImpl(WebServiceConfiguration config) {
        this(config, new AssignmentServiceStubFactoryImpl());
    }

    public AssignmentServiceClientImpl(WebServiceConfiguration config, AssignmentServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    public TGetCatalogsAssignedToProduct_Return[] getCatalogsAssignedToProduct(String[] products) {
        try {
            return stub.getCatalogsAssignedToProduct(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    public TGetProductsAssignedToCatalog_Return[] getProductsAssignedToCatalog(String[] catalogs) {
        try {
            return stub.getProductsAssignedToCatalog(catalogs);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TAssignProductToCatalog_Return[] assignProductToCatalog(TAssignProductToCatalog_Input[] assignments) {
        try {
            return stub.assignProductToCatalog(assignments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TRemoveProductFromCatalog_Return[] removeProductFromCatalog(TRemoveProductFromCatalog_Input[] assignments) {
        try {
            return stub.removeProductFromCatalog(assignments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TIsProductAssignedToCatalog_Return[] isProductAssignedToCatalog(TIsProductAssignedToCatalog_Input[] assignments) {
        try {
            return stub.isProductAssignedToCatalog(assignments);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
