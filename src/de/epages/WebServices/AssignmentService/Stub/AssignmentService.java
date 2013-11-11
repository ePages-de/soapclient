/**
 * AssignmentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.AssignmentService.Stub;

public interface AssignmentService extends javax.xml.rpc.Service {

/**
 * epages5 Catalog Assignment Service
 */
    public java.lang.String getport_AssignmentAddress();

    public de.epages.WebServices.AssignmentService.Stub.Port_Assignment_PortType getport_Assignment() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.AssignmentService.Stub.Port_Assignment_PortType getport_Assignment(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
