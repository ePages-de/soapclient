/**
 * CustomerGroupService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.customergroup.stub;

public interface CustomerGroupService extends javax.xml.rpc.Service {

/**
 * epages Customer Group Service
 */
    public java.lang.String getport_CustomerGroupAddress();

    public de.epages.webservice.customergroup.stub.Port_CustomerGroup getport_CustomerGroup() throws javax.xml.rpc.ServiceException;

    public de.epages.webservice.customergroup.stub.Port_CustomerGroup getport_CustomerGroup(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
