/**
 * Port_Appointment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.appointment.stub;

public interface Port_Appointment extends java.rmi.Remote {

    /**
     * get information about a list of appointments
     */
    public de.epages.ws.appointment.model.TGetInfo_Return[] getInfo(java.lang.String[] appointments, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of appointments exist.
     */
    public de.epages.ws.appointment.model.TExists_Return[] exists(java.lang.String[] appointments) throws java.rmi.RemoteException;

    /**
     * delete a list of appointments
     */
    public de.epages.ws.appointment.model.TDelete_Return[] delete(java.lang.String[] appointments) throws java.rmi.RemoteException;

    /**
     * update a list of appointments
     */
    public de.epages.ws.appointment.model.TUpdate_Return[] update(de.epages.ws.appointment.model.TUpdate_Input[] appointments) throws java.rmi.RemoteException;

    /**
     * create new appointments
     */
    public de.epages.ws.appointment.model.TCreate_Return[] create(de.epages.ws.appointment.model.TCreate_Input[] appointments) throws java.rmi.RemoteException;
}
