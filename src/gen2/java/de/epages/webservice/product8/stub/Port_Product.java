/**
 * Port_Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.product8.stub;

public interface Port_Product extends java.rmi.Remote {

    /**
     * get information about a list of products
     */
    public de.epages.webservice.product8.model.TGetInfo_Return[] getInfo(java.lang.String[] products, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of products exist.
     */
    public de.epages.webservice.product8.model.TExists_Return[] exists(java.lang.String[] products) throws java.rmi.RemoteException;

    /**
     * delete a list of products
     */
    public de.epages.webservice.product8.model.TDelete_Return[] delete(java.lang.String[] products) throws java.rmi.RemoteException;

    /**
     * update a list of products
     */
    public de.epages.webservice.product8.model.TUpdate_Return[] update(de.epages.webservice.product8.model.TUpdate_Input[] products) throws java.rmi.RemoteException;

    /**
     * create new products
     */
    public de.epages.webservice.product8.model.TCreate_Return[] create(de.epages.webservice.product8.model.TCreate_Input[] products) throws java.rmi.RemoteException;

    /**
     * find products
     */
    public java.lang.String[] find(de.epages.webservice.product8.stub.TFind_Input searchParameters) throws java.rmi.RemoteException;
}
