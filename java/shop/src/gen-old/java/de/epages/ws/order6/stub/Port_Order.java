/**
 * Port_Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.order6.stub;

public interface Port_Order extends java.rmi.Remote {

    /**
     * get information about a list of orders
     */
    public de.epages.ws.order6.model.TGetInfo_Return[] getInfo(java.lang.String[] orders, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] lineItemAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of orders exist.
     */
    public de.epages.ws.order6.model.TExists_Return[] exists(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * delete a list of orders
     */
    public de.epages.ws.order6.model.TDelete_Return[] delete(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * update a list of orders. This function also sends order
     *         status e-mails to customers if the e-mail events are enabled.
     */
    public de.epages.ws.order6.model.TUpdate_Return[] update(de.epages.ws.order6.model.TUpdate_Input[] orders) throws java.rmi.RemoteException;

    /**
     * create new orders. This function does not send order
     *         confirmation e-mails to the customers.
     */
    public de.epages.ws.order6.model.TCreate_Return[] create(de.epages.ws.order6.model.TCreate_Input[] orders) throws java.rmi.RemoteException;

    /**
     * find orders
     */
    public java.lang.String[] find(de.epages.ws.order6.stub.TFind_Input searchParameters) throws java.rmi.RemoteException;
}
