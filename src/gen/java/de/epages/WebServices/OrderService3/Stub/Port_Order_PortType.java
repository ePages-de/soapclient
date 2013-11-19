/**
 * Port_Order_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.OrderService3.Stub;

public interface Port_Order_PortType extends java.rmi.Remote {

    /**
     * get information about a list of orders
     */
    public de.epages.WebServices.OrderService3.Stub.TGetInfo_Return[] getInfo(java.lang.String[] orders, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of orders exist.
     */
    public de.epages.WebServices.OrderService3.Stub.TExists_Return[] exists(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * delete a list of orders
     */
    public de.epages.WebServices.OrderService3.Stub.TDelete_Return[] delete(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * update a list of orders. This function also sends order
     *         status e-mails to customers if the e-mail events are enabled.
     */
    public de.epages.WebServices.OrderService3.Stub.TUpdate_Return[] update(de.epages.WebServices.OrderService3.Stub.TUpdate_Input[] orders) throws java.rmi.RemoteException;

    /**
     * create new orders. This function does not send order
     *         confirmation e-mails to the customers.
     */
    public de.epages.WebServices.OrderService3.Stub.TCreate_Return[] create(de.epages.WebServices.OrderService3.Stub.TCreate_Input[] orders) throws java.rmi.RemoteException;

    /**
     * find orders
     */
    public java.lang.String[] find(de.epages.WebServices.OrderService3.Stub.TFind_Input searchParameters) throws java.rmi.RemoteException;
}
