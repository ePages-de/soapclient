/**
 * AssignmentServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.assignment.stub;

public class AssignmentServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.assignment.stub.AssignmentService {

/**
 * epages Catalog Assignment Service
 */

    public AssignmentServiceLocator() {
    }


    public AssignmentServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AssignmentServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_Assignment
    private java.lang.String port_Assignment_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_AssignmentAddress() {
        return port_Assignment_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_AssignmentWSDDServiceName = "port_Assignment";

    public java.lang.String getport_AssignmentWSDDServiceName() {
        return port_AssignmentWSDDServiceName;
    }

    public void setport_AssignmentWSDDServiceName(java.lang.String name) {
        port_AssignmentWSDDServiceName = name;
    }

    public de.epages.ws.assignment.stub.Port_Assignment getport_Assignment() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_Assignment_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_Assignment(endpoint);
    }

    public de.epages.ws.assignment.stub.Port_Assignment getport_Assignment(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.assignment.stub.Bind_Assignment_SOAPStub _stub = new de.epages.ws.assignment.stub.Bind_Assignment_SOAPStub(portAddress, this);
            _stub.setPortName(getport_AssignmentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_AssignmentEndpointAddress(java.lang.String address) {
        port_Assignment_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.assignment.stub.Port_Assignment.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.assignment.stub.Bind_Assignment_SOAPStub _stub = new de.epages.ws.assignment.stub.Bind_Assignment_SOAPStub(new java.net.URL(port_Assignment_address), this);
                _stub.setPortName(getport_AssignmentWSDDServiceName());
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
        if ("port_Assignment".equals(inputPortName)) {
            return getport_Assignment();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "AssignmentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "port_Assignment"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_Assignment".equals(portName)) {
            setport_AssignmentEndpointAddress(address);
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
