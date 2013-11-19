/**
 * Port_PriceList_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.PriceListService2.Stub;

public interface Port_PriceList_PortType extends java.rmi.Remote {

    /**
     * get information about a list of pricelists
     */
    public de.epages.WebServices.PriceListService2.Stub.TGetInfo_Return[] getInfo(java.lang.String[] priceLists, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of pricelists exist.
     */
    public de.epages.WebServices.PriceListService2.Stub.TExists_Return[] exists(java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * delete a list of pricelists
     */
    public de.epages.WebServices.PriceListService2.Stub.TDelete_Return[] delete(java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * update a list of pricelists
     */
    public de.epages.WebServices.PriceListService2.Stub.TUpdate_Return[] update(de.epages.WebServices.PriceListService2.Stub.TUpdate_Input[] priceLists) throws java.rmi.RemoteException;

    /**
     * create new pricelists
     */
    public de.epages.WebServices.PriceListService2.Stub.TCreate_Return[] create(de.epages.WebServices.PriceListService2.Stub.TCreate_Input[] priceLists) throws java.rmi.RemoteException;
}
