/**
 * Port_Basket_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.BasketService.Stub;

public interface Port_Basket_PortType extends java.rmi.Remote {

    /**
     * get information about a list of baskets
     */
    public de.epages.WebServices.BasketService.Stub.TGetInfo_Return[] getInfo(java.lang.String[] baskets, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] lineItemAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of baskets exist.
     */
    public de.epages.WebServices.BasketService.Stub.TExists_Return[] exists(java.lang.String[] baskets) throws java.rmi.RemoteException;

    /**
     * delete a list of baskets
     */
    public de.epages.WebServices.BasketService.Stub.TDelete_Return[] delete(java.lang.String[] baskets) throws java.rmi.RemoteException;

    /**
     * update a list of baskets
     */
    public de.epages.WebServices.BasketService.Stub.TUpdate_Return[] update(de.epages.WebServices.BasketService.Stub.TUpdate_Input[] baskets) throws java.rmi.RemoteException;

    /**
     * create new baskets
     */
    public de.epages.WebServices.BasketService.Stub.TCreate_Return[] create(de.epages.WebServices.BasketService.Stub.TCreate_Input[] baskets) throws java.rmi.RemoteException;

    /**
     * update a single lineitem of baskets
     */
    public de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Return[] updateLineItem(java.lang.String TBasketPath, de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Input[] lineItems) throws java.rmi.RemoteException;
}
