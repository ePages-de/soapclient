/**
 * TaxClassService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.TaxClassService.Stub;

public interface TaxClassService extends javax.xml.rpc.Service {

/**
 * epages5 Tax Class Service
 */
    public java.lang.String getport_TaxClassAddress();

    public de.epages.WebServices.TaxClassService.Stub.Port_TaxClass_PortType getport_TaxClass() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.TaxClassService.Stub.Port_TaxClass_PortType getport_TaxClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
