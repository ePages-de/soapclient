/**
 * Port_ShopCount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shopcount.stub;

public interface Port_ShopCount extends java.rmi.Remote {

    /**
     * Returns the number of shops of a provider, filtered by shop
     * type, database and flags.
     */
    public int getCount(de.epages.ws.shopcount.stub.Type_GetCount_In filter) throws java.rmi.RemoteException;

    /**
     * Returns the number of shops of a provider from all databases.
     * Deleted shops and internal test shops are not included.
     */
    public de.epages.ws.shopcount.stub.TShopCount[] getAllCounts() throws java.rmi.RemoteException;
}
