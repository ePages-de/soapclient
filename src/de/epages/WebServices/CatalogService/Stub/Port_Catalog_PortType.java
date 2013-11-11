/**
 * Port_Catalog_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CatalogService.Stub;

public interface Port_Catalog_PortType extends java.rmi.Remote {

    /**
     * get information about a list of catalogs
     */
    public de.epages.WebServices.CatalogService.Stub.TGetInfo_Return[] getInfo(java.lang.String[] catalogs, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of catalogs exist.
     */
    public de.epages.WebServices.CatalogService.Stub.TExists_Return[] exists(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * delete a list of catalogs
     */
    public de.epages.WebServices.CatalogService.Stub.TDelete_Return[] delete(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * update a list of catalogs
     */
    public de.epages.WebServices.CatalogService.Stub.TUpdate_Return[] update(de.epages.WebServices.CatalogService.Stub.TUpdate_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * create new catalogs
     */
    public de.epages.WebServices.CatalogService.Stub.TCreate_Return[] create(de.epages.WebServices.CatalogService.Stub.TCreate_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * get root catalog
     */
    public de.epages.WebServices.CatalogService.Stub.TGetRoot_Return getRoot() throws java.rmi.RemoteException;
}
