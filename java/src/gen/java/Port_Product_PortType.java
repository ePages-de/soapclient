/**
 * Port_Product_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public interface Port_Product_PortType extends java.rmi.Remote {

    /**
     * get information about a list of products
     */
    public TGetInfo_Return[] getInfo(java.lang.String[] products, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of products exist.
     */
    public TExists_Return[] exists(java.lang.String[] products) throws java.rmi.RemoteException;

    /**
     * delete a list of products
     */
    public TDelete_Return[] delete(java.lang.String[] products) throws java.rmi.RemoteException;

    /**
     * update a list of products
     */
    public TUpdate_Return[] update(TUpdate_Input[] products) throws java.rmi.RemoteException;

    /**
     * create new products
     */
    public TCreate_Return[] create(TCreate_Input[] products) throws java.rmi.RemoteException;

    /**
     * find products
     */
    public java.lang.String[] find(TFind_Input searchParameters) throws java.rmi.RemoteException;
}
