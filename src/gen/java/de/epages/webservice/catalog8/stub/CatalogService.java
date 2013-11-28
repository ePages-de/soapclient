/**
 * CatalogService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.catalog8.stub;

public interface CatalogService extends javax.xml.rpc.Service {

/**
 * epages Catalog Service
 */
    public java.lang.String getport_CatalogAddress();

    public de.epages.webservice.catalog8.stub.Port_Catalog getport_Catalog() throws javax.xml.rpc.ServiceException;

    public de.epages.webservice.catalog8.stub.Port_Catalog getport_Catalog(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
