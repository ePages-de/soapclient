/**
 * Port_CustomerGroup_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CustomerGroupService2.Stub;

public interface Port_CustomerGroup_PortType extends java.rmi.Remote {

    /**
     * get the list of customergroups
     */
    public de.epages.WebServices.CustomerGroupService2.Stub.TGetList_Return[] getList() throws java.rmi.RemoteException;

    /**
     * check if a list of groups exist.
     */
    public de.epages.WebServices.CustomerGroupService2.Stub.TExists_Return[] exists(java.lang.String[] groups) throws java.rmi.RemoteException;

    /**
     * create a list of customer groups.
     */
    public de.epages.WebServices.CustomerGroupService2.Stub.TCreate_Return[] create(de.epages.WebServices.CustomerGroupService2.Stub.TCreate_Input[] groups) throws java.rmi.RemoteException;

    /**
     * update a list of customer groups.
     */
    public de.epages.WebServices.CustomerGroupService2.Stub.TUpdate_Return[] update(de.epages.WebServices.CustomerGroupService2.Stub.TUpdate_Input[] groups) throws java.rmi.RemoteException;

    /**
     * delete a list of customer groups.
     */
    public de.epages.WebServices.CustomerGroupService2.Stub.TDelete_Return[] delete(java.lang.String[] groups) throws java.rmi.RemoteException;
}
