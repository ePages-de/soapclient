/**
 * AssignmentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.assignment.stub;

public interface AssignmentService extends javax.xml.rpc.Service {

/**
 * epages Catalog Assignment Service
 */
    public java.lang.String getport_AssignmentAddress();

    public de.epages.ws.assignment.stub.Port_Assignment getport_Assignment() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.assignment.stub.Port_Assignment getport_Assignment(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
