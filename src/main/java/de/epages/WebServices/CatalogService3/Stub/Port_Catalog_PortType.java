/**
 * Port_Catalog_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CatalogService3.Stub;

public interface Port_Catalog_PortType extends java.rmi.Remote {

    /**
     * get information about a list of catalogs
     */
    public de.epages.WebServices.CatalogService3.Stub.TGetInfo_Return[] getInfo(java.lang.String[] catalogs, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of catalogs exist.
     */
    public de.epages.WebServices.CatalogService3.Stub.TExists_Return[] exists(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * delete a list of catalogs
     */
    public de.epages.WebServices.CatalogService3.Stub.TDelete_Return[] delete(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * update a list of catalogs
     */
    public de.epages.WebServices.CatalogService3.Stub.TUpdate_Return[] update(de.epages.WebServices.CatalogService3.Stub.TUpdate_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * create new catalogs
     */
    public de.epages.WebServices.CatalogService3.Stub.TCreate_Return[] create(de.epages.WebServices.CatalogService3.Stub.TCreate_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * get root catalog
     */
    public de.epages.WebServices.CatalogService3.Stub.TGetRoot_Return getRoot() throws java.rmi.RemoteException;

    /**
     * sort products in each catalog of a list of catalogs
     */
    public de.epages.WebServices.CatalogService3.Stub.TSortProducts_Return[] sortProducts(de.epages.WebServices.CatalogService3.Stub.TSortProducts_Input[] catalogs) throws java.rmi.RemoteException;
}
