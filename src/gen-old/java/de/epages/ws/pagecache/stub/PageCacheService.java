/**
 * PageCacheService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pagecache.stub;

public interface PageCacheService extends javax.xml.rpc.Service {

/**
 * epages page cache service
 */
    public java.lang.String getport_PageCacheAddress();

    public de.epages.ws.pagecache.stub.Port_PageCache getport_PageCache() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.pagecache.stub.Port_PageCache getport_PageCache(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
