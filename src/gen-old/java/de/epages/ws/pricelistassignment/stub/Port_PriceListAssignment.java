/**
 * Port_PriceListAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelistassignment.stub;

public interface Port_PriceListAssignment extends java.rmi.Remote {

    /**
     * get information about a product's scale prices
     */
    public de.epages.ws.pricelistassignment.model.TGetScalePrices_Return[] getScalePrices(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * update product's scale prices
     */
    public de.epages.ws.pricelistassignment.model.TSetScalePrices_Return[] setScalePrices(de.epages.ws.pricelistassignment.model.TSetScalePrices_Input[] products) throws java.rmi.RemoteException;

    /**
     * get information about a product's quantity discounts
     */
    public de.epages.ws.pricelistassignment.model.TGetQuantityDiscounts_Return[] getQuantityDiscounts(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * update product's quantity discounts
     */
    public de.epages.ws.pricelistassignment.model.TSetQuantityDiscounts_Return[] setQuantityDiscounts(de.epages.ws.pricelistassignment.model.TSetQuantityDiscounts_Input[] products) throws java.rmi.RemoteException;

    /**
     * get information about a product's value discounts
     */
    public de.epages.ws.pricelistassignment.model.TGetValueDiscounts_Return[] getValueDiscounts(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * update product's value discounts
     */
    public de.epages.ws.pricelistassignment.model.TSetValueDiscounts_Return[] setValueDiscounts(de.epages.ws.pricelistassignment.model.TSetValueDiscounts_Input[] products) throws java.rmi.RemoteException;
}
