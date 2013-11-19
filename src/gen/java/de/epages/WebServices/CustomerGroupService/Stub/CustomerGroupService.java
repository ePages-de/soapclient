/**
 * CustomerGroupService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CustomerGroupService.Stub;

public interface CustomerGroupService extends javax.xml.rpc.Service {

/**
 * epages5 Customer Group Service
 */
    public java.lang.String getport_CustomerGroupAddress();

    public de.epages.WebServices.CustomerGroupService.Stub.Port_CustomerGroup_PortType getport_CustomerGroup() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.CustomerGroupService.Stub.Port_CustomerGroup_PortType getport_CustomerGroup(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
