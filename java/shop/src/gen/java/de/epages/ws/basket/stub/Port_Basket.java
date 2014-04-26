/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.basket.stub;

public interface Port_Basket extends java.rmi.Remote {

    /**
     * get information about a list of baskets
     */
    public de.epages.ws.basket.model.TGetInfo_Return[] getInfo(java.lang.String[] baskets, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] lineItemAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of baskets exist.
     */
    public de.epages.ws.basket.model.TExists_Return[] exists(java.lang.String[] baskets) throws java.rmi.RemoteException;

    /**
     * delete a list of baskets
     */
    public de.epages.ws.basket.model.TDelete_Return[] delete(java.lang.String[] baskets) throws java.rmi.RemoteException;

    /**
     * delete line items of a baskets
     */
    public de.epages.ws.basket.model.TDeleteLineItem_Return[] deleteLineItem(java.lang.String TBasketPath, java.lang.String[] lineItems) throws java.rmi.RemoteException;

    /**
     * update a list of baskets
     */
    public de.epages.ws.basket.model.TUpdate_Return[] update(de.epages.ws.basket.model.TUpdate_Input[] baskets) throws java.rmi.RemoteException;

    /**
     * update line items of a baskets
     */
    public de.epages.ws.basket.model.TUpdateLineItem_Return[] updateLineItem(java.lang.String TBasketPath, de.epages.ws.basket.model.TUpdateLineItem_Input[] lineItems) throws java.rmi.RemoteException;

    /**
     * create new baskets
     */
    public de.epages.ws.basket.model.TCreate_Return[] create(de.epages.ws.basket.model.TCreate_Input[] baskets) throws java.rmi.RemoteException;

    /**
     * add products tp baskets
     */
    public de.epages.ws.basket.model.TAddProductLineItem_Return[] addProductLineItem(java.lang.String TBasketPath, de.epages.ws.basket.model.TAddProductLineItem_Input[] lineItems) throws java.rmi.RemoteException;
}
