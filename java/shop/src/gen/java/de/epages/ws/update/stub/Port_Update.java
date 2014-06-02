/**
 * Port_Update.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.update.stub;

public interface Port_Update extends java.rmi.Remote {

    /**
     * find deleted objects
     */
    public de.epages.ws.update.stub.TFindDeletes_Return[] findDeletes(java.util.Calendar deletedAfter, java.lang.String _class) throws java.rmi.RemoteException;

    /**
     * find deleted objects
     */
    public de.epages.ws.update.stub.TFindUpdates_Return findUpdates(java.util.Calendar updatedAfter, java.lang.String _class, java.lang.String profile) throws java.rmi.RemoteException;
}
