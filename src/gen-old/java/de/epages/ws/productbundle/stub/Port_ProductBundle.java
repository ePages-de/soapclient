/**
 * Port_ProductBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productbundle.stub;

public interface Port_ProductBundle extends java.rmi.Remote {

    /**
     * assign a product to a product bundle
     */
    public de.epages.ws.productbundle.model.TCreate_Return[] create(de.epages.ws.productbundle.model.TCreate_Input[] productBundles) throws java.rmi.RemoteException;

    /**
     * unassign a product from a product bundle
     */
    public de.epages.ws.productbundle.model.TDelete_Return[] delete(de.epages.ws.productbundle.model.TDelete_Input[] productBundles) throws java.rmi.RemoteException;

    /**
     * check if a product is assigned to a product bundle
     */
    public de.epages.ws.productbundle.model.TExists_Return[] exists(de.epages.ws.productbundle.model.TExists_Input[] productBundles) throws java.rmi.RemoteException;

    /**
     * get bundled products assigned to a product bundle
     */
    public de.epages.ws.productbundle.model.TGetInfo_Return[] getInfo(java.lang.String[] products) throws java.rmi.RemoteException;
}
