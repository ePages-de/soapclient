/**
 * Port_SimpleProvisioning.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.simpleprovisioning2.stub;

public interface Port_SimpleProvisioning extends java.rmi.Remote {

    /**
     * creates a new shop with a given shop type and imports default
     * data
     */
    public void create(de.epages.ws.simpleprovisioning2.stub.TCreateShop createShopData) throws java.rmi.RemoteException;

    /**
     * marks a shop for deletion
     */
    public void markForDeletion(de.epages.ws.simpleprovisioning2.stub.TShopRef shopRef) throws java.rmi.RemoteException;

    /**
     * returns true if the shop alias exists for the provider
     */
    public boolean exists(de.epages.ws.simpleprovisioning2.stub.TShopRef shopRef) throws java.rmi.RemoteException;

    /**
     * updates an existing shop in the site and store database
     */
    public void update(de.epages.ws.simpleprovisioning2.stub.TUpdateShop shopData) throws java.rmi.RemoteException;

    /**
     * returns information about an existing shop from the site database
     */
    public de.epages.ws.simpleprovisioning2.stub.TInfoShop getInfo(de.epages.ws.simpleprovisioning2.stub.TShopRef shopRef) throws java.rmi.RemoteException;

    /**
     * change the alias of an existing shop
     */
    public void rename(de.epages.ws.simpleprovisioning2.stub.TRename_Input shopInfo) throws java.rmi.RemoteException;
}
