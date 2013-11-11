/**
 * Port_ProductBundle_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductBundleService.Stub;

public interface Port_ProductBundle_PortType extends java.rmi.Remote {

    /**
     * assign a product to a product bundle
     */
    public de.epages.WebServices.ProductBundleService.Stub.TCreate_Return[] create(de.epages.WebServices.ProductBundleService.Stub.TCreate_Input[] productBundles) throws java.rmi.RemoteException;

    /**
     * unassign a product from a product bundle
     */
    public de.epages.WebServices.ProductBundleService.Stub.TDelete_Return[] delete(de.epages.WebServices.ProductBundleService.Stub.TDelete_Input[] productBundles) throws java.rmi.RemoteException;

    /**
     * check if a product is assigned to a product bundle
     */
    public de.epages.WebServices.ProductBundleService.Stub.TExists_Return[] exists(de.epages.WebServices.ProductBundleService.Stub.TExists_Input[] productBundles) throws java.rmi.RemoteException;

    /**
     * get bundled products assigned to a product bundle
     */
    public de.epages.WebServices.ProductBundleService.Stub.TGetInfo_Return[] getInfo(java.lang.String[] products) throws java.rmi.RemoteException;
}
