/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.user2.stub;

public interface UserService extends javax.xml.rpc.Service {

/**
 * epages User Service
 */
    public java.lang.String getport_UserAddress();

    public de.epages.ws.user2.stub.Port_User getport_User() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.user2.stub.Port_User getport_User(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
