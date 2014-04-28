/**
 * Port_MultiStoreMaster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.multistoremaster.stub;

public interface Port_MultiStoreMaster extends java.rmi.Remote {

    /**
     * transfer basket to master
     */
    public java.lang.String buildShopUrl(java.lang.String masterShopAlias, de.epages.ws.multistoremaster.model.TBuildShopUrl_In buildShopUrl) throws java.rmi.RemoteException;
}
