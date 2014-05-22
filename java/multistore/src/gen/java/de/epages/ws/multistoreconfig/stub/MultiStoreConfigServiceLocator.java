/**
 * MultiStoreConfigServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.multistoreconfig.stub;

public class MultiStoreConfigServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.multistoreconfig.stub.MultiStoreConfigService {

/**
 * ePages MultiStoreConfig Service
 */

    public MultiStoreConfigServiceLocator() {
    }


    public MultiStoreConfigServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MultiStoreConfigServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_MultiStoreConfig
    private java.lang.String port_MultiStoreConfig_address = "http://localhost/epages/Site.soap";

    public java.lang.String getport_MultiStoreConfigAddress() {
        return port_MultiStoreConfig_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_MultiStoreConfigWSDDServiceName = "port_MultiStoreConfig";

    public java.lang.String getport_MultiStoreConfigWSDDServiceName() {
        return port_MultiStoreConfigWSDDServiceName;
    }

    public void setport_MultiStoreConfigWSDDServiceName(java.lang.String name) {
        port_MultiStoreConfigWSDDServiceName = name;
    }

    public de.epages.ws.multistoreconfig.stub.Port_MultiStoreConfig getport_MultiStoreConfig() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_MultiStoreConfig_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_MultiStoreConfig(endpoint);
    }

    public de.epages.ws.multistoreconfig.stub.Port_MultiStoreConfig getport_MultiStoreConfig(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.multistoreconfig.stub.Bind_MultiStoreConfig_SOAPStub _stub = new de.epages.ws.multistoreconfig.stub.Bind_MultiStoreConfig_SOAPStub(portAddress, this);
            _stub.setPortName(getport_MultiStoreConfigWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_MultiStoreConfigEndpointAddress(java.lang.String address) {
        port_MultiStoreConfig_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.multistoreconfig.stub.Port_MultiStoreConfig.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.multistoreconfig.stub.Bind_MultiStoreConfig_SOAPStub _stub = new de.epages.ws.multistoreconfig.stub.Bind_MultiStoreConfig_SOAPStub(new java.net.URL(port_MultiStoreConfig_address), this);
                _stub.setPortName(getport_MultiStoreConfigWSDDServiceName());
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
        if ("port_MultiStoreConfig".equals(inputPortName)) {
            return getport_MultiStoreConfig();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/MultiStoreConfigService/2011/08", "MultiStoreConfigService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/MultiStoreConfigService/2011/08", "port_MultiStoreConfig"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_MultiStoreConfig".equals(portName)) {
            setport_MultiStoreConfigEndpointAddress(address);
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
