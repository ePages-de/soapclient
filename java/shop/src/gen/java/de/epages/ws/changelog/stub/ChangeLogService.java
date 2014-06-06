/**
 * ChangeLogService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public interface ChangeLogService extends javax.xml.rpc.Service {

/**
 * epages update service
 */
    public java.lang.String getport_ChangeLogAddress();

    public de.epages.ws.changelog.stub.Port_ChangeLog getport_ChangeLog() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.changelog.stub.Port_ChangeLog getport_ChangeLog(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
