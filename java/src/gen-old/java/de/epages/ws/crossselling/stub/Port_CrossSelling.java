/**
 * Port_CrossSelling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.crossselling.stub;

public interface Port_CrossSelling extends java.rmi.Remote {

    /**
     * insert a cross selling (assign target product to product)
     */
    public de.epages.ws.crossselling.model.TInsertCrossSelling_Return[] insert(de.epages.ws.crossselling.model.TInsertCrossSelling_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * delete a cross selling (delete assignment of target product
     * to product)
     */
    public de.epages.ws.crossselling.model.TDeleteCrossSelling_Return[] delete(de.epages.ws.crossselling.model.TDeleteCrossSelling_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * check if exists a cross selling (if target product assigned
     * to product)
     */
    public de.epages.ws.crossselling.model.TExistsCrossSelling_Return[] exists(de.epages.ws.crossselling.model.TExistsCrossSelling_Input[] crossSellings) throws java.rmi.RemoteException;

    /**
     * get a cross selling (target products assigned to product)
     */
    public de.epages.ws.crossselling.model.TGetCrossSelling_Return[] get(de.epages.ws.crossselling.model.TGetCrossSelling_Input[] crossSellings) throws java.rmi.RemoteException;
}
