/**
 * Port_User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.user2.stub;

public interface Port_User extends java.rmi.Remote {

    /**
     * get information about a list of users
     */
    public de.epages.ws.user2.model.TGetInfo_Return[] getInfo(java.lang.String[] users, java.lang.String[] attributes) throws java.rmi.RemoteException;

    /**
     * check if a list of users exist.
     */
    public de.epages.ws.user2.model.TExists_Return[] exists(java.lang.String[] users) throws java.rmi.RemoteException;

    /**
     * delete a list of users
     */
    public de.epages.ws.user2.model.TDelete_Return[] delete(java.lang.String[] users) throws java.rmi.RemoteException;

    /**
     * update a list of users
     */
    public de.epages.ws.user2.model.TUpdate_Return[] update(de.epages.ws.user2.model.TUpdate_Input[] users) throws java.rmi.RemoteException;

    /**
     * create new users
     */
    public de.epages.ws.user2.model.TCreate_Return[] create(de.epages.ws.user2.model.TCreate_Input[] users) throws java.rmi.RemoteException;
}
