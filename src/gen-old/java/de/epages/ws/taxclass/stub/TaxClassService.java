/**
 * TaxClassService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.taxclass.stub;

public interface TaxClassService extends javax.xml.rpc.Service {

/**
 * epages Tax Class Service
 */
    public java.lang.String getport_TaxClassAddress();

    public de.epages.ws.taxclass.stub.Port_TaxClass getport_TaxClass() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.taxclass.stub.Port_TaxClass getport_TaxClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
