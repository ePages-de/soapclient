/**
 * Port_PriceList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelist2.stub;

public interface Port_PriceList extends java.rmi.Remote {

    /**
     * get information about a list of pricelists
     */
    public de.epages.ws.pricelist2.model.TGetInfo_Return[] getInfo(java.lang.String[] priceLists, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of pricelists exist.
     */
    public de.epages.ws.pricelist2.model.TExists_Return[] exists(java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * delete a list of pricelists
     */
    public de.epages.ws.pricelist2.model.TDelete_Return[] delete(java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * update a list of pricelists
     */
    public de.epages.ws.pricelist2.model.TUpdate_Return[] update(de.epages.ws.pricelist2.model.TUpdate_Input[] priceLists) throws java.rmi.RemoteException;

    /**
     * create new pricelists
     */
    public de.epages.ws.pricelist2.model.TCreate_Return[] create(de.epages.ws.pricelist2.model.TCreate_Input[] priceLists) throws java.rmi.RemoteException;
}
