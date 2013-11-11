/**
 * ProductService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductService3.Stub;

public interface ProductService extends javax.xml.rpc.Service {

/**
 * epages5 Product Service
 */
    public java.lang.String getport_ProductAddress();

    public de.epages.WebServices.ProductService3.Stub.Port_Product_PortType getport_Product() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.ProductService3.Stub.Port_Product_PortType getport_Product(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
