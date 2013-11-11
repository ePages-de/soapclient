/**
 * Port_Customer_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CustomerService4.Stub;

public interface Port_Customer_PortType extends java.rmi.Remote {

    /**
     * get information about a list of customers
     */
    public de.epages.WebServices.CustomerService4.Stub.TGetInfo_Return[] getInfo(java.lang.String[] customers, java.lang.String[] attributes, java.lang.String[] addressAttributes) throws java.rmi.RemoteException;

    /**
     * check if a list of customers exist.
     */
    public de.epages.WebServices.CustomerService4.Stub.TExists_Return[] exists(java.lang.String[] customers) throws java.rmi.RemoteException;

    /**
     * delete a list of customers
     */
    public de.epages.WebServices.CustomerService4.Stub.TDelete_Return[] delete(java.lang.String[] customers) throws java.rmi.RemoteException;

    /**
     * update a list of customers
     */
    public de.epages.WebServices.CustomerService4.Stub.TUpdate_Return[] update(de.epages.WebServices.CustomerService4.Stub.TUpdate_Input[] customers) throws java.rmi.RemoteException;

    /**
     * create new customers
     */
    public de.epages.WebServices.CustomerService4.Stub.TCreate_Return[] create(de.epages.WebServices.CustomerService4.Stub.TCreate_Input[] customers) throws java.rmi.RemoteException;

    /**
     * find customers
     */
    public java.lang.String[] find(de.epages.WebServices.CustomerService4.Stub.TFind_Input searchParameters) throws java.rmi.RemoteException;
}
