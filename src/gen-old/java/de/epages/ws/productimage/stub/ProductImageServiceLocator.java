/**
 * ProductImageServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productimage.stub;

public class ProductImageServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.productimage.stub.ProductImageService {

/**
 * epages Product Image Service
 */

    public ProductImageServiceLocator() {
    }


    public ProductImageServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductImageServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_ProductImage
    private java.lang.String port_ProductImage_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_ProductImageAddress() {
        return port_ProductImage_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_ProductImageWSDDServiceName = "port_ProductImage";

    public java.lang.String getport_ProductImageWSDDServiceName() {
        return port_ProductImageWSDDServiceName;
    }

    public void setport_ProductImageWSDDServiceName(java.lang.String name) {
        port_ProductImageWSDDServiceName = name;
    }

    public de.epages.ws.productimage.stub.Port_ProductImage getport_ProductImage() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_ProductImage_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_ProductImage(endpoint);
    }

    public de.epages.ws.productimage.stub.Port_ProductImage getport_ProductImage(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.productimage.stub.Bind_ProductImage_SOAPStub _stub = new de.epages.ws.productimage.stub.Bind_ProductImage_SOAPStub(portAddress, this);
            _stub.setPortName(getport_ProductImageWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_ProductImageEndpointAddress(java.lang.String address) {
        port_ProductImage_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.productimage.stub.Port_ProductImage.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.productimage.stub.Bind_ProductImage_SOAPStub _stub = new de.epages.ws.productimage.stub.Bind_ProductImage_SOAPStub(new java.net.URL(port_ProductImage_address), this);
                _stub.setPortName(getport_ProductImageWSDDServiceName());
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
        if ("port_ProductImage".equals(inputPortName)) {
            return getport_ProductImage();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/ProductImageService/2006/03", "ProductImageService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductImageService/2006/03", "port_ProductImage"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_ProductImage".equals(portName)) {
            setport_ProductImageEndpointAddress(address);
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
