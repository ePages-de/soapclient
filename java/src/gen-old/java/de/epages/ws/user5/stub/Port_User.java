/**
 * Port_User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.user5.stub;

public interface Port_User extends java.rmi.Remote {

    /**
     * get information about a list of users
     */
    public de.epages.ws.user5.model.TGetInfo_Return[] getInfo(java.lang.String[] users, java.lang.String[] attributes, java.lang.String[] addressAttributes) throws java.rmi.RemoteException;

    /**
     * check if a list of users exist.
     */
    public de.epages.ws.user5.model.TExists_Return[] exists(java.lang.String[] users) throws java.rmi.RemoteException;

    /**
     * send user a link to enter a new password.
     */
    public de.epages.ws.user5.model.TSendPassword_Return[] sendPassword(java.lang.String[] users) throws java.rmi.RemoteException;

    /**
     * delete a list of users
     */
    public de.epages.ws.user5.model.TDelete_Return[] delete(java.lang.String[] users) throws java.rmi.RemoteException;

    /**
     * update a list of users
     */
    public de.epages.ws.user5.model.TUpdate_Return[] update(de.epages.ws.user5.model.TUpdate_Input[] users) throws java.rmi.RemoteException;

    /**
     * create new users
     */
    public de.epages.ws.user5.model.TCreate_Return[] create(de.epages.ws.user5.model.TCreate_Input[] users) throws java.rmi.RemoteException;

    /**
     * find customers
     */
    public java.lang.String[] find(de.epages.ws.user5.stub.Type_Find_Input searchParameters) throws java.rmi.RemoteException;
}
