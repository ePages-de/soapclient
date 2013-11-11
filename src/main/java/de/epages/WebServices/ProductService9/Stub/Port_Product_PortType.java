/**
 * Port_Product_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductService9.Stub;

public interface Port_Product_PortType extends java.rmi.Remote {

    /**
     * get information about a list of products
     */
    public de.epages.WebServices.ProductService9.Stub.TGetInfo_Return[] getInfo(java.lang.String[] products, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of products exist.
     */
    public de.epages.WebServices.ProductService9.Stub.TExists_Return[] exists(java.lang.String[] products) throws java.rmi.RemoteException;

    /**
     * delete a list of products
     */
    public de.epages.WebServices.ProductService9.Stub.TDelete_Return[] delete(java.lang.String[] products) throws java.rmi.RemoteException;

    /**
     * update a list of products
     */
    public de.epages.WebServices.ProductService9.Stub.TUpdate_Return[] update(de.epages.WebServices.ProductService9.Stub.TUpdate_Input[] products) throws java.rmi.RemoteException;

    /**
     * create new products
     */
    public de.epages.WebServices.ProductService9.Stub.TCreate_Return[] create(de.epages.WebServices.ProductService9.Stub.TCreate_Input[] products) throws java.rmi.RemoteException;

    /**
     * find products
     */
    public java.lang.String[] find(de.epages.WebServices.ProductService9.Stub.TFind_Input searchParameters) throws java.rmi.RemoteException;
}
