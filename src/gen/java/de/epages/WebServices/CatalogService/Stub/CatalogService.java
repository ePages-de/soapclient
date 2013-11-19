/**
 * CatalogService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CatalogService.Stub;

public interface CatalogService extends javax.xml.rpc.Service {

/**
 * epages5 Catalog Service
 */
    public java.lang.String getport_CatalogAddress();

    public de.epages.WebServices.CatalogService.Stub.Port_Catalog_PortType getport_Catalog() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.CatalogService.Stub.Port_Catalog_PortType getport_Catalog(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
