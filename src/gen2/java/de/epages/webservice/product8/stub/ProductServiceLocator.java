/**
 * ProductServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.product8.stub;

public class ProductServiceLocator extends org.apache.axis.client.Service implements de.epages.webservice.product8.stub.ProductService {

/**
 * epages Product Service
 */

    public ProductServiceLocator() {
    }


    public ProductServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_Product
    private java.lang.String port_Product_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_ProductAddress() {
        return port_Product_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_ProductWSDDServiceName = "port_Product";

    public java.lang.String getport_ProductWSDDServiceName() {
        return port_ProductWSDDServiceName;
    }

    public void setport_ProductWSDDServiceName(java.lang.String name) {
        port_ProductWSDDServiceName = name;
    }

    public de.epages.webservice.product8.stub.Port_Product getport_Product() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_Product_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_Product(endpoint);
    }

    public de.epages.webservice.product8.stub.Port_Product getport_Product(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.webservice.product8.stub.Bind_Product_SOAPStub _stub = new de.epages.webservice.product8.stub.Bind_Product_SOAPStub(portAddress, this);
            _stub.setPortName(getport_ProductWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_ProductEndpointAddress(java.lang.String address) {
        port_Product_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.webservice.product8.stub.Port_Product.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.webservice.product8.stub.Bind_Product_SOAPStub _stub = new de.epages.webservice.product8.stub.Bind_Product_SOAPStub(new java.net.URL(port_Product_address), this);
                _stub.setPortName(getport_ProductWSDDServiceName());
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
        if ("port_Product".equals(inputPortName)) {
            return getport_Product();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2011/03", "ProductService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2011/03", "port_Product"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_Product".equals(portName)) {
            setport_ProductEndpointAddress(address);
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
