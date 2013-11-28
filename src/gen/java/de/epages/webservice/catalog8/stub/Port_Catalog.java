/**
 * Port_Catalog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.catalog8.stub;

public interface Port_Catalog extends java.rmi.Remote {

    /**
     * get information about a list of catalogs
     */
    public de.epages.webservice.catalog8.model.TGetInfo_Return[] getInfo(java.lang.String[] catalogs, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of catalogs exist.
     */
    public de.epages.webservice.catalog8.model.TExists_Return[] exists(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * delete a list of catalogs
     */
    public de.epages.webservice.catalog8.model.TDelete_Return[] delete(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * update a list of catalogs
     */
    public de.epages.webservice.catalog8.model.TUpdate_Return[] update(de.epages.webservice.catalog8.model.TUpdate_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * create new catalogs
     */
    public de.epages.webservice.catalog8.model.TCreate_Return[] create(de.epages.webservice.catalog8.model.TCreate_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * get root catalog
     */
    public de.epages.webservice.catalog8.stub.TGetRoot_Return getRoot() throws java.rmi.RemoteException;

    /**
     * sort products in each catalog of a list of catalogs
     */
    public de.epages.webservice.catalog8.model.TSortProducts_Return[] sortProducts(de.epages.webservice.catalog8.model.TSortProducts_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * upload catalog related images.
     */
    public de.epages.webservice.catalog8.model.TUpload_Return uploadImage(java.lang.String TObjectPath, de.epages.webservice.catalog8.model.TUpload_Input imageData) throws java.rmi.RemoteException;

    /**
     * get all recursive categorie paths as simple flat list
     */
    public java.lang.String[] getCategories() throws java.rmi.RemoteException;
}
