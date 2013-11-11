/**
 * PageCacheService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.PageCacheService.Stub;

public interface PageCacheService extends javax.xml.rpc.Service {

/**
 * epages5 page cache service
 */
    public java.lang.String getport_PageCacheAddress();

    public de.epages.WebServices.PageCacheService.Stub.Port_PageCache_PortType getport_PageCache() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.PageCacheService.Stub.Port_PageCache_PortType getport_PageCache(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
