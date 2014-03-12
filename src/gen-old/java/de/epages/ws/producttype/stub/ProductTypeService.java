/**
 * ProductTypeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.producttype.stub;

public interface ProductTypeService extends javax.xml.rpc.Service {

/**
 * epages Product Type Service
 */
    public java.lang.String getport_ProductTypeAddress();

    public de.epages.ws.producttype.stub.Port_ProductType getport_ProductType() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.producttype.stub.Port_ProductType getport_ProductType(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
