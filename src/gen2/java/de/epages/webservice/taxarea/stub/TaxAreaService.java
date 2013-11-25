/**
 * TaxAreaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.taxarea.stub;

public interface TaxAreaService extends javax.xml.rpc.Service {

/**
 * epages Tax Area Service
 */
    public java.lang.String getport_TaxAreaAddress();

    public de.epages.webservice.taxarea.stub.Port_TaxArea getport_TaxArea() throws javax.xml.rpc.ServiceException;

    public de.epages.webservice.taxarea.stub.Port_TaxArea getport_TaxArea(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
