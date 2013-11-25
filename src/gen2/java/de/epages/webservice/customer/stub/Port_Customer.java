/**
 * Port_Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.customer.stub;

public interface Port_Customer extends java.rmi.Remote {

    /**
     * get information about a list of customers
     */
    public de.epages.webservice.customer.model.TGetInfo_Return[] getInfo(java.lang.String[] customers, java.lang.String[] attributes) throws java.rmi.RemoteException;

    /**
     * check if a list of customers exist.
     */
    public de.epages.webservice.customer.model.TExists_Return[] exists(java.lang.String[] customers) throws java.rmi.RemoteException;

    /**
     * delete a list of customers
     */
    public de.epages.webservice.customer.model.TDelete_Return[] delete(java.lang.String[] customers) throws java.rmi.RemoteException;

    /**
     * update a list of customers
     */
    public de.epages.webservice.customer.model.TUpdate_Return[] update(de.epages.webservice.customer.model.TUpdate_Input[] customers) throws java.rmi.RemoteException;

    /**
     * create new customers
     */
    public de.epages.webservice.customer.model.TCreate_Return[] create(de.epages.webservice.customer.model.TCreate_Input[] customers) throws java.rmi.RemoteException;

    /**
     * find customers
     */
    public java.lang.String[] find(de.epages.webservice.customer.stub.TFind_Input searchParameters) throws java.rmi.RemoteException;
}
