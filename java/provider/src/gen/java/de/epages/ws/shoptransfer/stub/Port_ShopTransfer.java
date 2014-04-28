/**
 * Port_ShopTransfer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shoptransfer.stub;

public interface Port_ShopTransfer extends java.rmi.Remote {

    /**
     * start shop export
     */
    public java.lang.String startExport(java.lang.String shopAlias, java.lang.String exportPath) throws java.rmi.RemoteException;

    /**
     * start shop import
     */
    public java.lang.String startImport(java.lang.String shopAlias, java.lang.String importPath) throws java.rmi.RemoteException;

    /**
     * get Information about a running WebService Session
     */
    public de.epages.ws.shoptransfer.stub.TSessionInfo getStatus(java.lang.String sessionID) throws java.rmi.RemoteException;
}
