/**
 * OrderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.OrderService9.Stub;

public interface OrderService extends javax.xml.rpc.Service {

/**
 * epages Order Service
 */
    public java.lang.String getport_OrderAddress();

    public de.epages.WebServices.OrderService9.Stub.Port_Order_PortType getport_Order() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.OrderService9.Stub.Port_Order_PortType getport_Order(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
