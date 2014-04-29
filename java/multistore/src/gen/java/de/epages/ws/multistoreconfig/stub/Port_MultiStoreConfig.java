/**
 * Port_MultiStoreConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.multistoreconfig.stub;

public interface Port_MultiStoreConfig extends java.rmi.Remote {

    /**
     * creates a subshop to mastershop relation
     */
    public void assignSubShopToMasterShop(de.epages.ws.multistoreconfig.stub.TAssignSubShopToMasterShop assignSubShopToMasterShopData) throws java.rmi.RemoteException;

    /**
     * deletes a subshop to mastershop relation
     */
    public void unassignSubShopFromMasterShop(de.epages.ws.multistoreconfig.stub.TShopRef shopRef) throws java.rmi.RemoteException;

    /**
     * returns information about an existing mastershop including
     * a list of subshops
     */
    public de.epages.ws.multistoreconfig.stub.TInfoMultiStoreConfig getInfo(de.epages.ws.multistoreconfig.stub.TShopRef shopInfo) throws java.rmi.RemoteException;
}
