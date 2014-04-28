/**
 * MultiStoreMasterServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.multistoremaster.stub;

public class MultiStoreMasterServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.multistoremaster.stub.MultiStoreMasterService {

/**
 * ePages MultiStoreMaster Service
 */

    public MultiStoreMasterServiceLocator() {
    }


    public MultiStoreMasterServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MultiStoreMasterServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_MultiStoreMaster
    private java.lang.String port_MultiStoreMaster_address = "http://localhost/epages/MultiStoreMaster.soap";

    public java.lang.String getport_MultiStoreMasterAddress() {
        return port_MultiStoreMaster_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_MultiStoreMasterWSDDServiceName = "port_MultiStoreMaster";

    public java.lang.String getport_MultiStoreMasterWSDDServiceName() {
        return port_MultiStoreMasterWSDDServiceName;
    }

    public void setport_MultiStoreMasterWSDDServiceName(java.lang.String name) {
        port_MultiStoreMasterWSDDServiceName = name;
    }

    public de.epages.ws.multistoremaster.stub.Port_MultiStoreMaster getport_MultiStoreMaster() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_MultiStoreMaster_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_MultiStoreMaster(endpoint);
    }

    public de.epages.ws.multistoremaster.stub.Port_MultiStoreMaster getport_MultiStoreMaster(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.multistoremaster.stub.Bind_MultiStoreMaster_SOAPStub _stub = new de.epages.ws.multistoremaster.stub.Bind_MultiStoreMaster_SOAPStub(portAddress, this);
            _stub.setPortName(getport_MultiStoreMasterWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_MultiStoreMasterEndpointAddress(java.lang.String address) {
        port_MultiStoreMaster_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.multistoremaster.stub.Port_MultiStoreMaster.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.multistoremaster.stub.Bind_MultiStoreMaster_SOAPStub _stub = new de.epages.ws.multistoremaster.stub.Bind_MultiStoreMaster_SOAPStub(new java.net.URL(port_MultiStoreMaster_address), this);
                _stub.setPortName(getport_MultiStoreMasterWSDDServiceName());
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
        if ("port_MultiStoreMaster".equals(inputPortName)) {
            return getport_MultiStoreMaster();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/MultiStoreMasterService/2013/06", "MultiStoreMasterService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/MultiStoreMasterService/2013/06", "port_MultiStoreMaster"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_MultiStoreMaster".equals(portName)) {
            setport_MultiStoreMasterEndpointAddress(address);
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
