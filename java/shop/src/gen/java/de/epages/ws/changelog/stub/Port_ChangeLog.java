/**
 * Port_ChangeLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public interface Port_ChangeLog extends java.rmi.Remote {

    /**
     * find new created objects
     */
    public de.epages.ws.changelog.stub.TFindCreates_Return findCreates(java.util.Calendar createdAfter, java.lang.String _class) throws java.rmi.RemoteException;

    /**
     * find deleted objects
     */
    public de.epages.ws.changelog.stub.TFindDeletes_Return findDeletes(java.util.Calendar deletedAfter, java.lang.String _class) throws java.rmi.RemoteException;

    /**
     * find updated objects
     */
    public de.epages.ws.changelog.stub.TFindUpdates_Return findUpdates(java.util.Calendar updatedAfter, java.lang.String _class, java.lang.String profile) throws java.rmi.RemoteException;

    /**
     * find created, deleted and updated objects (updated object may
     * includes created)
     */
    public de.epages.ws.changelog.stub.TFindChanges_Return findChanges(java.util.Calendar changedAfter, java.lang.String _class, java.lang.String profile) throws java.rmi.RemoteException;
}
