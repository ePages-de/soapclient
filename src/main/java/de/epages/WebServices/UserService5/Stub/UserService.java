/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.UserService5.Stub;

public interface UserService extends javax.xml.rpc.Service {

/**
 * epages User Service
 */
    public java.lang.String getport_UserAddress();

    public de.epages.WebServices.UserService5.Stub.Port_User_PortType getport_User() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.UserService5.Stub.Port_User_PortType getport_User(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
