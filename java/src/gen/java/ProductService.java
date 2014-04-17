/**
 * ProductService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public interface ProductService extends javax.xml.rpc.Service {

/**
 * epages Product Service
 */
    public java.lang.String getport_ProductAddress();

    public Port_Product_PortType getport_Product() throws javax.xml.rpc.ServiceException;

    public Port_Product_PortType getport_Product(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
