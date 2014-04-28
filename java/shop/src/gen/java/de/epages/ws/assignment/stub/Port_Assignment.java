/**
 * Port_Assignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.assignment.stub;

public interface Port_Assignment extends java.rmi.Remote {

    /**
     * assign products to catalogs
     */
    public de.epages.ws.assignment.model.TAssignProductToCatalog_Return[] assignProductToCatalog(de.epages.ws.assignment.model.TAssignProductToCatalog_Input[] assignments) throws java.rmi.RemoteException;

    /**
     * unassign a product from a catalog
     */
    public de.epages.ws.assignment.model.TRemoveProductFromCatalog_Return[] removeProductFromCatalog(de.epages.ws.assignment.model.TRemoveProductFromCatalog_Input[] assignments) throws java.rmi.RemoteException;

    /**
     * check if a product is assigned to a catalog
     */
    public de.epages.ws.assignment.model.TIsProductAssignedToCatalog_Return[] isProductAssignedToCatalog(de.epages.ws.assignment.model.TIsProductAssignedToCatalog_Input[] assignments) throws java.rmi.RemoteException;

    /**
     * get products assigned to a catalog
     */
    public de.epages.ws.assignment.model.TGetProductsAssignedToCatalog_Return[] getProductsAssignedToCatalog(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * get catalogs the product is assigned to
     */
    public de.epages.ws.assignment.model.TGetCatalogsAssignedToProduct_Return[] getCatalogsAssignedToProduct(java.lang.String[] products) throws java.rmi.RemoteException;
}
