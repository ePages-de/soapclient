/**
 * OrderDocumentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.orderdocument4.stub;

public interface OrderDocumentService extends javax.xml.rpc.Service {

/**
 * epages Order Document Service
 */
    public java.lang.String getport_OrderDocumentAddress();

    public de.epages.ws.orderdocument4.stub.Port_OrderDocument getport_OrderDocument() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.orderdocument4.stub.Port_OrderDocument getport_OrderDocument(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
