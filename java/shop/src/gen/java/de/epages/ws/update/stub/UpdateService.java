/**
 * UpdateService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.update.stub;

public interface UpdateService extends javax.xml.rpc.Service {

/**
 * epages update service
 */
    public java.lang.String getport_UpdateAddress();

    public de.epages.ws.update.stub.Port_Update getport_Update() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.update.stub.Port_Update getport_Update(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
