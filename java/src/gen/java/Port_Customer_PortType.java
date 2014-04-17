/**
 * Port_Customer_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public interface Port_Customer_PortType extends java.rmi.Remote {

    /**
     * get information about a list of customers
     */
    public TGetInfo_Return[] getInfo(java.lang.String[] customers, java.lang.String[] attributes, java.lang.String[] addressAttributes) throws java.rmi.RemoteException;

    /**
     * check if a list of customers exist.
     */
    public TExists_Return[] exists(java.lang.String[] customers) throws java.rmi.RemoteException;

    /**
     * delete a list of customers
     */
    public TDelete_Return[] delete(java.lang.String[] customers) throws java.rmi.RemoteException;

    /**
     * update a list of customers
     */
    public TUpdate_Return[] update(TUpdate_Input[] customers) throws java.rmi.RemoteException;

    /**
     * create new customers
     */
    public TCreate_Return[] create(TCreate_Input[] customers) throws java.rmi.RemoteException;

    /**
     * find customers
     */
    public java.lang.String[] find(TFind_Input searchParameters) throws java.rmi.RemoteException;
}
