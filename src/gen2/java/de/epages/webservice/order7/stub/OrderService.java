/**
 * OrderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.order7.stub;

public interface OrderService extends javax.xml.rpc.Service {

/**
 * epages Order Service
 */
    public java.lang.String getport_OrderAddress();

    public de.epages.webservice.order7.stub.Port_Order getport_Order() throws javax.xml.rpc.ServiceException;

    public de.epages.webservice.order7.stub.Port_Order getport_Order(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
