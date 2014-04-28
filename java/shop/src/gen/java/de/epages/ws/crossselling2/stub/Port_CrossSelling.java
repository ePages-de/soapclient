/**
 * Port_CrossSelling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.crossselling2.stub;

public interface Port_CrossSelling extends java.rmi.Remote {

    /**
     * insert a cross selling (assign target product to product)
     */
    public de.epages.ws.crossselling2.model.TCreate_Return[] create(de.epages.ws.crossselling2.model.TCreate_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * update a cross selling
     */
    public de.epages.ws.crossselling2.model.TUpdate_Return[] update(de.epages.ws.crossselling2.model.TUpdate_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * delete a cross selling (delete assignment of target product
     * to product)
     */
    public de.epages.ws.crossselling2.model.TDelete_Return[] delete(de.epages.ws.crossselling2.model.TDelete_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * check if exists a cross selling (if target product assigned
     * to product)
     */
    public de.epages.ws.crossselling2.model.TExists_Return[] exists(de.epages.ws.crossselling2.model.TExists_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * get a cross selling (target products assigned to product)
     */
    public de.epages.ws.crossselling2.model.TGetInfo_Return[] getInfo(de.epages.ws.crossselling2.model.TGetInfo_Input[] crossSellings) throws java.rmi.RemoteException;
}
