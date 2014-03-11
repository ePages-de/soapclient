/**
 * PaymentMethodService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.paymentmethod.stub;

public interface PaymentMethodService extends javax.xml.rpc.Service {

/**
 * epages Payment Method Service
 */
    public java.lang.String getport_PaymentMethodAddress();

    public de.epages.ws.paymentmethod.stub.Port_PaymentMethod getport_PaymentMethod() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.paymentmethod.stub.Port_PaymentMethod getport_PaymentMethod(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
