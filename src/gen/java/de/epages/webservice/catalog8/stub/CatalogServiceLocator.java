/**
 * CatalogServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.catalog8.stub;

public class CatalogServiceLocator extends org.apache.axis.client.Service implements de.epages.webservice.catalog8.stub.CatalogService {

/**
 * epages Catalog Service
 */

    public CatalogServiceLocator() {
    }


    public CatalogServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CatalogServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_Catalog
    private java.lang.String port_Catalog_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_CatalogAddress() {
        return port_Catalog_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_CatalogWSDDServiceName = "port_Catalog";

    public java.lang.String getport_CatalogWSDDServiceName() {
        return port_CatalogWSDDServiceName;
    }

    public void setport_CatalogWSDDServiceName(java.lang.String name) {
        port_CatalogWSDDServiceName = name;
    }

    public de.epages.webservice.catalog8.stub.Port_Catalog getport_Catalog() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_Catalog_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_Catalog(endpoint);
    }

    public de.epages.webservice.catalog8.stub.Port_Catalog getport_Catalog(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.webservice.catalog8.stub.Bind_Catalog_SOAPStub _stub = new de.epages.webservice.catalog8.stub.Bind_Catalog_SOAPStub(portAddress, this);
            _stub.setPortName(getport_CatalogWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_CatalogEndpointAddress(java.lang.String address) {
        port_Catalog_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.webservice.catalog8.stub.Port_Catalog.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.webservice.catalog8.stub.Bind_Catalog_SOAPStub _stub = new de.epages.webservice.catalog8.stub.Bind_Catalog_SOAPStub(new java.net.URL(port_Catalog_address), this);
                _stub.setPortName(getport_CatalogWSDDServiceName());
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
        if ("port_Catalog".equals(inputPortName)) {
            return getport_Catalog();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/CatalogService/2011/11", "CatalogService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/CatalogService/2011/11", "port_Catalog"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_Catalog".equals(portName)) {
            setport_CatalogEndpointAddress(address);
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
