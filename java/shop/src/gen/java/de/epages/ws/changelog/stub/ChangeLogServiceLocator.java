/**
 * ChangeLogServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public class ChangeLogServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.changelog.stub.ChangeLogService {

/**
 * epages update service
 */

    public ChangeLogServiceLocator() {
    }


    public ChangeLogServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChangeLogServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_ChangeLog
    private java.lang.String port_ChangeLog_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_ChangeLogAddress() {
        return port_ChangeLog_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_ChangeLogWSDDServiceName = "port_ChangeLog";

    public java.lang.String getport_ChangeLogWSDDServiceName() {
        return port_ChangeLogWSDDServiceName;
    }

    public void setport_ChangeLogWSDDServiceName(java.lang.String name) {
        port_ChangeLogWSDDServiceName = name;
    }

    public de.epages.ws.changelog.stub.Port_ChangeLog getport_ChangeLog() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_ChangeLog_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_ChangeLog(endpoint);
    }

    public de.epages.ws.changelog.stub.Port_ChangeLog getport_ChangeLog(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.changelog.stub.Bind_ChangeLog_SOAPStub _stub = new de.epages.ws.changelog.stub.Bind_ChangeLog_SOAPStub(portAddress, this);
            _stub.setPortName(getport_ChangeLogWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_ChangeLogEndpointAddress(java.lang.String address) {
        port_ChangeLog_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.changelog.stub.Port_ChangeLog.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.changelog.stub.Bind_ChangeLog_SOAPStub _stub = new de.epages.ws.changelog.stub.Bind_ChangeLog_SOAPStub(new java.net.URL(port_ChangeLog_address), this);
                _stub.setPortName(getport_ChangeLogWSDDServiceName());
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
        if ("port_ChangeLog".equals(inputPortName)) {
            return getport_ChangeLog();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "ChangeLogService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "port_ChangeLog"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_ChangeLog".equals(portName)) {
            setport_ChangeLogEndpointAddress(address);
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
