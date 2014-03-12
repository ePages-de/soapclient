/**
 * Port_Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.customer3.stub;

public interface Port_Customer extends java.rmi.Remote {

    /**
     * get information about a list of customers
     */
    public de.epages.ws.customer3.model.TGetInfo_Return[] getInfo(java.lang.String[] customers, java.lang.String[] attributes, java.lang.String[] addressAttributes) throws java.rmi.RemoteException;

    /**
     * check if a list of customers exist.
     */
    public de.epages.ws.customer3.model.TExists_Return[] exists(java.lang.String[] customers) throws java.rmi.RemoteException;

    /**
     * delete a list of customers
     */
    public de.epages.ws.customer3.model.TDelete_Return[] delete(java.lang.String[] customers) throws java.rmi.RemoteException;

    /**
     * update a list of customers
     */
    public de.epages.ws.customer3.model.TUpdate_Return[] update(de.epages.ws.customer3.model.TUpdate_Input[] customers) throws java.rmi.RemoteException;

    /**
     * create new customers
     */
    public de.epages.ws.customer3.model.TCreate_Return[] create(de.epages.ws.customer3.model.TCreate_Input[] customers) throws java.rmi.RemoteException;

    /**
     * find customers
     */
    public java.lang.String[] find(de.epages.ws.customer3.stub.TFind_Input searchParameters) throws java.rmi.RemoteException;
}
