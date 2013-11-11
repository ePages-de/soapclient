/**
 * UserServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.UserService4.Stub;

public class UserServiceLocator extends org.apache.axis.client.Service implements de.epages.WebServices.UserService4.Stub.UserService {

/**
 * epages User Service
 */

    public UserServiceLocator() {
    }


    public UserServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_User
    private java.lang.String port_User_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_UserAddress() {
        return port_User_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_UserWSDDServiceName = "port_User";

    public java.lang.String getport_UserWSDDServiceName() {
        return port_UserWSDDServiceName;
    }

    public void setport_UserWSDDServiceName(java.lang.String name) {
        port_UserWSDDServiceName = name;
    }

    public de.epages.WebServices.UserService4.Stub.Port_User_PortType getport_User() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_User_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_User(endpoint);
    }

    public de.epages.WebServices.UserService4.Stub.Port_User_PortType getport_User(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.WebServices.UserService4.Stub.Bind_User_SOAPStub _stub = new de.epages.WebServices.UserService4.Stub.Bind_User_SOAPStub(portAddress, this);
            _stub.setPortName(getport_UserWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_UserEndpointAddress(java.lang.String address) {
        port_User_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.WebServices.UserService4.Stub.Port_User_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.WebServices.UserService4.Stub.Bind_User_SOAPStub _stub = new de.epages.WebServices.UserService4.Stub.Bind_User_SOAPStub(new java.net.URL(port_User_address), this);
                _stub.setPortName(getport_UserWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("port_User".equals(inputPortName)) {
            return getport_User();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/UserService/2011/01", "UserService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/UserService/2011/01", "port_User"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_User".equals(portName)) {
            setport_UserEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
