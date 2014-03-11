/**
 * AppointmentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.appointment.stub;

public interface AppointmentService extends javax.xml.rpc.Service {

/**
 * epages Appointment Service
 */
    public java.lang.String getport_AppointmentAddress();

    public de.epages.ws.appointment.stub.Port_Appointment getport_Appointment() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.appointment.stub.Port_Appointment getport_Appointment(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
