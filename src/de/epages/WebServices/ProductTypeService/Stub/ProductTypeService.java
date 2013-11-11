/**
 * ProductTypeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductTypeService.Stub;

public interface ProductTypeService extends javax.xml.rpc.Service {

/**
 * epages5 Product Type Service
 */
    public java.lang.String getport_ProductTypeAddress();

    public de.epages.WebServices.ProductTypeService.Stub.Port_ProductType_PortType getport_ProductType() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.ProductTypeService.Stub.Port_ProductType_PortType getport_ProductType(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
