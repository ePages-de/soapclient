/**
 * CustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public interface CustomerService extends javax.xml.rpc.Service {

/**
 * epages Customer Service
 */
    public java.lang.String getport_CustomerAddress();

    public Port_Customer_PortType getport_Customer() throws javax.xml.rpc.ServiceException;

    public Port_Customer_PortType getport_Customer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
