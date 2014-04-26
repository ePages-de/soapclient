/**
 * FeaturePackServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.featurepack.stub;

public class FeaturePackServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.featurepack.stub.FeaturePackService {

/**
 * epages featurepack Service
 */

    public FeaturePackServiceLocator() {
    }


    public FeaturePackServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FeaturePackServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_FeaturePack
    private java.lang.String port_FeaturePack_address = "http://localhost/epages/Site.soap";

    public java.lang.String getport_FeaturePackAddress() {
        return port_FeaturePack_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_FeaturePackWSDDServiceName = "port_FeaturePack";

    public java.lang.String getport_FeaturePackWSDDServiceName() {
        return port_FeaturePackWSDDServiceName;
    }

    public void setport_FeaturePackWSDDServiceName(java.lang.String name) {
        port_FeaturePackWSDDServiceName = name;
    }

    public de.epages.ws.featurepack.stub.Port_FeaturePack getport_FeaturePack() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_FeaturePack_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_FeaturePack(endpoint);
    }

    public de.epages.ws.featurepack.stub.Port_FeaturePack getport_FeaturePack(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.featurepack.stub.Bind_FeaturePack_SOAPStub _stub = new de.epages.ws.featurepack.stub.Bind_FeaturePack_SOAPStub(portAddress, this);
            _stub.setPortName(getport_FeaturePackWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_FeaturePackEndpointAddress(java.lang.String address) {
        port_FeaturePack_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.featurepack.stub.Port_FeaturePack.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.featurepack.stub.Bind_FeaturePack_SOAPStub _stub = new de.epages.ws.featurepack.stub.Bind_FeaturePack_SOAPStub(new java.net.URL(port_FeaturePack_address), this);
                _stub.setPortName(getport_FeaturePackWSDDServiceName());
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
        if ("port_FeaturePack".equals(inputPortName)) {
            return getport_FeaturePack();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackService/2005/03", "FeaturePackService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackService/2005/03", "port_FeaturePack"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_FeaturePack".equals(portName)) {
            setport_FeaturePackEndpointAddress(address);
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
