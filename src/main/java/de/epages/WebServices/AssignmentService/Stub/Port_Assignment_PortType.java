/**
 * Port_Assignment_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.AssignmentService.Stub;

public interface Port_Assignment_PortType extends java.rmi.Remote {

    /**
     * assign products to catalogs
     */
    public de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return[] assignProductToCatalog(de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Input[] assignments) throws java.rmi.RemoteException;

    /**
     * unassign a product from a catalog
     */
    public de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return[] removeProductFromCatalog(de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Input[] assignments) throws java.rmi.RemoteException;

    /**
     * check if a product is assigned to a catalog
     */
    public de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return[] isProductAssignedToCatalog(de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Input[] assignments) throws java.rmi.RemoteException;

    /**
     * get products assigned to a catalog
     */
    public de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return[] getProductsAssignedToCatalog(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * get catalogs the product is assigned to
     */
    public de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return[] getCatalogsAssignedToProduct(java.lang.String[] products) throws java.rmi.RemoteException;
}
