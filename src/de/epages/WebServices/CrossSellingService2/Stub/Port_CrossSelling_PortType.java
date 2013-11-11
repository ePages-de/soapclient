/**
 * Port_CrossSelling_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CrossSellingService2.Stub;

public interface Port_CrossSelling_PortType extends java.rmi.Remote {

    /**
     * insert a cross selling (assign target product to product)
     */
    public de.epages.WebServices.CrossSellingService2.Stub.TCreate_Return[] create(de.epages.WebServices.CrossSellingService2.Stub.TCreate_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * update a cross selling
     */
    public de.epages.WebServices.CrossSellingService2.Stub.TUpdate_Return[] update(de.epages.WebServices.CrossSellingService2.Stub.TUpdate_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * delete a cross selling (delete assignment of target product
     * to product)
     */
    public de.epages.WebServices.CrossSellingService2.Stub.TDelete_Return[] delete(de.epages.WebServices.CrossSellingService2.Stub.TDelete_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * check if exists a cross selling (if target product assigned
     * to product)
     */
    public de.epages.WebServices.CrossSellingService2.Stub.TExists_Return[] exists(de.epages.WebServices.CrossSellingService2.Stub.TExists_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * get a cross selling (target products assigned to product)
     */
    public de.epages.WebServices.CrossSellingService2.Stub.TGetInfo_Return[] getInfo(de.epages.WebServices.CrossSellingService2.Stub.TGetInfo_Input[] crossSellings) throws java.rmi.RemoteException;
}
