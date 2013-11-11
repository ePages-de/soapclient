/**
 * Port_PriceListAssignment_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.PriceListAssignmentService.Stub;

public interface Port_PriceListAssignment_PortType extends java.rmi.Remote {

    /**
     * get information about a product's scale prices
     */
    public de.epages.WebServices.PriceListAssignmentService.Stub.TGetScalePrices_Return[] getScalePrices(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * update product's scale prices
     */
    public de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Return[] setScalePrices(de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Input[] products) throws java.rmi.RemoteException;

    /**
     * get information about a product's quantity discounts
     */
    public de.epages.WebServices.PriceListAssignmentService.Stub.TGetQuantityDiscounts_Return[] getQuantityDiscounts(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * update product's quantity discounts
     */
    public de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Return[] setQuantityDiscounts(de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Input[] products) throws java.rmi.RemoteException;

    /**
     * get information about a product's value discounts
     */
    public de.epages.WebServices.PriceListAssignmentService.Stub.TGetValueDiscounts_Return[] getValueDiscounts(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException;

    /**
     * update product's value discounts
     */
    public de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Return[] setValueDiscounts(de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Input[] products) throws java.rmi.RemoteException;
}
