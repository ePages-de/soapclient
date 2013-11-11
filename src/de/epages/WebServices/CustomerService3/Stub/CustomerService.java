/**
 * CustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CustomerService3.Stub;

public interface CustomerService extends javax.xml.rpc.Service {

/**
 * epages5 Customer Service
 */
    public java.lang.String getport_CustomerAddress();

    public de.epages.WebServices.CustomerService3.Stub.Port_Customer_PortType getport_Customer() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.CustomerService3.Stub.Port_Customer_PortType getport_Customer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
