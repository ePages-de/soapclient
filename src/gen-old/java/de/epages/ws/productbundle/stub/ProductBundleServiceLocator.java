/**
 * ProductBundleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productbundle.stub;

public class ProductBundleServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.productbundle.stub.ProductBundleService {

/**
 * epages Product Bundle Service
 */

    public ProductBundleServiceLocator() {
    }


    public ProductBundleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductBundleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_ProductBundle
    private java.lang.String port_ProductBundle_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_ProductBundleAddress() {
        return port_ProductBundle_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_ProductBundleWSDDServiceName = "port_ProductBundle";

    public java.lang.String getport_ProductBundleWSDDServiceName() {
        return port_ProductBundleWSDDServiceName;
    }

    public void setport_ProductBundleWSDDServiceName(java.lang.String name) {
        port_ProductBundleWSDDServiceName = name;
    }

    public de.epages.ws.productbundle.stub.Port_ProductBundle getport_ProductBundle() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_ProductBundle_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_ProductBundle(endpoint);
    }

    public de.epages.ws.productbundle.stub.Port_ProductBundle getport_ProductBundle(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.productbundle.stub.Bind_ProductBundle_SOAPStub _stub = new de.epages.ws.productbundle.stub.Bind_ProductBundle_SOAPStub(portAddress, this);
            _stub.setPortName(getport_ProductBundleWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_ProductBundleEndpointAddress(java.lang.String address) {
        port_ProductBundle_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.productbundle.stub.Port_ProductBundle.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.productbundle.stub.Bind_ProductBundle_SOAPStub _stub = new de.epages.ws.productbundle.stub.Bind_ProductBundle_SOAPStub(new java.net.URL(port_ProductBundle_address), this);
                _stub.setPortName(getport_ProductBundleWSDDServiceName());
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
        if ("port_ProductBundle".equals(inputPortName)) {
            return getport_ProductBundle();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "ProductBundleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleService/2007/07", "port_ProductBundle"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_ProductBundle".equals(portName)) {
            setport_ProductBundleEndpointAddress(address);
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
