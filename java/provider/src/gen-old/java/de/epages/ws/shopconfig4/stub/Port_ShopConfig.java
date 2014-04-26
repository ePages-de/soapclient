/**
 * Port_ShopConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shopconfig4.stub;

public interface Port_ShopConfig extends java.rmi.Remote {

    /**
     * creates a new shop with a given shop type and imports default
     * data
     */
    public int create(de.epages.ws.shopconfig4.stub.TCreateShop createShopData) throws java.rmi.RemoteException;

    /**
     * deletes a shop from the store database
     */
    public void delete(de.epages.ws.shopconfig4.stub.TShopRef shopRef) throws java.rmi.RemoteException;

    /**
     * returns true if the shop alias exists for the provider
     */
    public boolean exists(de.epages.ws.shopconfig4.stub.TShopRef shopRef) throws java.rmi.RemoteException;

    /**
     * updates an existing shop in the site and store database
     */
    public void update(de.epages.ws.shopconfig4.stub.TUpdateShop shopData) throws java.rmi.RemoteException;

    /**
     * returns information about an existing shop from the site database
     */
    public de.epages.ws.shopconfig4.stub.TInfoShop getInfo(de.epages.ws.shopconfig4.stub.TInfoShop_Input shopInfo) throws java.rmi.RemoteException;

    /**
     * returns information about all existing shops from the site
     * database
     */
    public de.epages.ws.shopconfig4.stub.TInfoShop[] getAllInfo() throws java.rmi.RemoteException;

    /**
     * deletes a shop reference from the site database
     */
    public void deleteShopRef(de.epages.ws.shopconfig4.stub.TShopRef shopRef) throws java.rmi.RemoteException;
}
