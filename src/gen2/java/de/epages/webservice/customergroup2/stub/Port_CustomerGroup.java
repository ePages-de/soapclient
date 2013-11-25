/**
 * Port_CustomerGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.customergroup2.stub;

public interface Port_CustomerGroup extends java.rmi.Remote {

    /**
     * get the list of customergroups
     */
    public de.epages.webservice.customergroup2.model.TGetList_Return[] getList() throws java.rmi.RemoteException;

    /**
     * check if a list of groups exist.
     */
    public de.epages.webservice.customergroup2.model.TExists_Return[] exists(java.lang.String[] groups) throws java.rmi.RemoteException;

    /**
     * create a list of customer groups.
     */
    public de.epages.webservice.customergroup2.model.TCreate_Return[] create(de.epages.webservice.customergroup2.model.TCreate_Input[] groups) throws java.rmi.RemoteException;

    /**
     * update a list of customer groups.
     */
    public de.epages.webservice.customergroup2.model.TUpdate_Return[] update(de.epages.webservice.customergroup2.model.TUpdate_Input[] groups) throws java.rmi.RemoteException;

    /**
     * delete a list of customer groups.
     */
    public de.epages.webservice.customergroup2.model.TDelete_Return[] delete(java.lang.String[] groups) throws java.rmi.RemoteException;
}
