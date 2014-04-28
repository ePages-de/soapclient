/**
 * ShippingMethodServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shippingmethod.stub;

public class ShippingMethodServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.shippingmethod.stub.ShippingMethodService {

/**
 * epages Shipping Method Service
 */

    public ShippingMethodServiceLocator() {
    }


    public ShippingMethodServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShippingMethodServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_ShippingMethod
    private java.lang.String port_ShippingMethod_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_ShippingMethodAddress() {
        return port_ShippingMethod_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_ShippingMethodWSDDServiceName = "port_ShippingMethod";

    public java.lang.String getport_ShippingMethodWSDDServiceName() {
        return port_ShippingMethodWSDDServiceName;
    }

    public void setport_ShippingMethodWSDDServiceName(java.lang.String name) {
        port_ShippingMethodWSDDServiceName = name;
    }

    public de.epages.ws.shippingmethod.stub.Port_ShippingMethod getport_ShippingMethod() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_ShippingMethod_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_ShippingMethod(endpoint);
    }

    public de.epages.ws.shippingmethod.stub.Port_ShippingMethod getport_ShippingMethod(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.shippingmethod.stub.Bind_ShippingMethod_SOAPStub _stub = new de.epages.ws.shippingmethod.stub.Bind_ShippingMethod_SOAPStub(portAddress, this);
            _stub.setPortName(getport_ShippingMethodWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_ShippingMethodEndpointAddress(java.lang.String address) {
        port_ShippingMethod_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.shippingmethod.stub.Port_ShippingMethod.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.shippingmethod.stub.Bind_ShippingMethod_SOAPStub _stub = new de.epages.ws.shippingmethod.stub.Bind_ShippingMethod_SOAPStub(new java.net.URL(port_ShippingMethod_address), this);
                _stub.setPortName(getport_ShippingMethodWSDDServiceName());
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
        if ("port_ShippingMethod".equals(inputPortName)) {
            return getport_ShippingMethod();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/ShippingMethodService/2008/03", "ShippingMethodService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/ShippingMethodService/2008/03", "port_ShippingMethod"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_ShippingMethod".equals(portName)) {
            setport_ShippingMethodEndpointAddress(address);
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
