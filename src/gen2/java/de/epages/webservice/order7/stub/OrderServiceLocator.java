/**
 * OrderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.order7.stub;

public class OrderServiceLocator extends org.apache.axis.client.Service implements de.epages.webservice.order7.stub.OrderService {

/**
 * epages Order Service
 */

    public OrderServiceLocator() {
    }


    public OrderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_Order
    private java.lang.String port_Order_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_OrderAddress() {
        return port_Order_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_OrderWSDDServiceName = "port_Order";

    public java.lang.String getport_OrderWSDDServiceName() {
        return port_OrderWSDDServiceName;
    }

    public void setport_OrderWSDDServiceName(java.lang.String name) {
        port_OrderWSDDServiceName = name;
    }

    public de.epages.webservice.order7.stub.Port_Order getport_Order() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_Order_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_Order(endpoint);
    }

    public de.epages.webservice.order7.stub.Port_Order getport_Order(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.webservice.order7.stub.Bind_Order_SOAPStub _stub = new de.epages.webservice.order7.stub.Bind_Order_SOAPStub(portAddress, this);
            _stub.setPortName(getport_OrderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_OrderEndpointAddress(java.lang.String address) {
        port_Order_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.webservice.order7.stub.Port_Order.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.webservice.order7.stub.Bind_Order_SOAPStub _stub = new de.epages.webservice.order7.stub.Bind_Order_SOAPStub(new java.net.URL(port_Order_address), this);
                _stub.setPortName(getport_OrderWSDDServiceName());
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
        if ("port_Order".equals(inputPortName)) {
            return getport_Order();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/OrderService/2010/10", "OrderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderService/2010/10", "port_Order"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_Order".equals(portName)) {
            setport_OrderEndpointAddress(address);
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
