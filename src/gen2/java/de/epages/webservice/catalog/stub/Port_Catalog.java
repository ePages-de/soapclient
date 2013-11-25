/**
 * Port_Catalog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.catalog.stub;

public interface Port_Catalog extends java.rmi.Remote {

    /**
     * get information about a list of catalogs
     */
    public de.epages.webservice.catalog.model.TGetInfo_Return[] getInfo(java.lang.String[] catalogs, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of catalogs exist.
     */
    public de.epages.webservice.catalog.model.TExists_Return[] exists(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * delete a list of catalogs
     */
    public de.epages.webservice.catalog.model.TDelete_Return[] delete(java.lang.String[] catalogs) throws java.rmi.RemoteException;

    /**
     * update a list of catalogs
     */
    public de.epages.webservice.catalog.model.TUpdate_Return[] update(de.epages.webservice.catalog.model.TUpdate_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * create new catalogs
     */
    public de.epages.webservice.catalog.model.TCreate_Return[] create(de.epages.webservice.catalog.model.TCreate_Input[] catalogs) throws java.rmi.RemoteException;

    /**
     * get root catalog
     */
    public de.epages.webservice.catalog.stub.TGetRoot_Return getRoot() throws java.rmi.RemoteException;
}
