/**
 * BasketServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.basket.stub;

public class BasketServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.basket.stub.BasketService {

/**
 * epages Basket Service
 */

    public BasketServiceLocator() {
    }


    public BasketServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BasketServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_Basket
    private java.lang.String port_Basket_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_BasketAddress() {
        return port_Basket_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_BasketWSDDServiceName = "port_Basket";

    public java.lang.String getport_BasketWSDDServiceName() {
        return port_BasketWSDDServiceName;
    }

    public void setport_BasketWSDDServiceName(java.lang.String name) {
        port_BasketWSDDServiceName = name;
    }

    public de.epages.ws.basket.stub.Port_Basket getport_Basket() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_Basket_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_Basket(endpoint);
    }

    public de.epages.ws.basket.stub.Port_Basket getport_Basket(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.basket.stub.Bind_Basket_SOAPStub _stub = new de.epages.ws.basket.stub.Bind_Basket_SOAPStub(portAddress, this);
            _stub.setPortName(getport_BasketWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_BasketEndpointAddress(java.lang.String address) {
        port_Basket_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.basket.stub.Port_Basket.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.basket.stub.Bind_Basket_SOAPStub _stub = new de.epages.ws.basket.stub.Bind_Basket_SOAPStub(new java.net.URL(port_Basket_address), this);
                _stub.setPortName(getport_BasketWSDDServiceName());
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
        if ("port_Basket".equals(inputPortName)) {
            return getport_Basket();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "BasketService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "port_Basket"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_Basket".equals(portName)) {
            setport_BasketEndpointAddress(address);
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
