/**
 * Port_ChangeLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public interface Port_ChangeLog extends java.rmi.Remote {

    /**
     * find newly created objects
     */
    public de.epages.ws.changelog.stub.TFindCreatedObjects_Return findCreatedObjects(java.util.Calendar createdSince, java.lang.String _class) throws java.rmi.RemoteException;

    /**
     * find deleted objects
     */
    public de.epages.ws.changelog.stub.TFindDeletedObject_Return findDeletedObjects(java.util.Calendar deletedSince, java.lang.String _class) throws java.rmi.RemoteException;

    /**
     * find updated objects (includes created objects if data set
     * related to profile)
     */
    public de.epages.ws.changelog.stub.TFindUpdatedObjects_Return findUpdatedObjects(java.util.Calendar updatedSince, java.lang.String _class, java.lang.String profile) throws java.rmi.RemoteException;
}
