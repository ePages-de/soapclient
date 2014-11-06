/**
 * SimpleProvisioningServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public class SimpleProvisioningServiceLocator extends org.apache.axis.client.Service implements SimpleProvisioningService {

/**
 * ePages Consulting Provisioning Service
 */

    public SimpleProvisioningServiceLocator() {
    }


    public SimpleProvisioningServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SimpleProvisioningServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_SimpleProvisioning
    private java.lang.String port_SimpleProvisioning_address = "http://localhost/epages/Site.soap";

    public java.lang.String getport_SimpleProvisioningAddress() {
        return port_SimpleProvisioning_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_SimpleProvisioningWSDDServiceName = "port_SimpleProvisioning";

    public java.lang.String getport_SimpleProvisioningWSDDServiceName() {
        return port_SimpleProvisioningWSDDServiceName;
    }

    public void setport_SimpleProvisioningWSDDServiceName(java.lang.String name) {
        port_SimpleProvisioningWSDDServiceName = name;
    }

    public Port_SimpleProvisioning_PortType getport_SimpleProvisioning() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_SimpleProvisioning_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_SimpleProvisioning(endpoint);
    }

    public Port_SimpleProvisioning_PortType getport_SimpleProvisioning(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Bind_SimpleProvisioning_SOAPStub _stub = new Bind_SimpleProvisioning_SOAPStub(portAddress, this);
            _stub.setPortName(getport_SimpleProvisioningWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_SimpleProvisioningEndpointAddress(java.lang.String address) {
        port_SimpleProvisioning_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Port_SimpleProvisioning_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                Bind_SimpleProvisioning_SOAPStub _stub = new Bind_SimpleProvisioning_SOAPStub(new java.net.URL(port_SimpleProvisioning_address), this);
                _stub.setPortName(getport_SimpleProvisioningWSDDServiceName());
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
        if ("port_SimpleProvisioning".equals(inputPortName)) {
            return getport_SimpleProvisioning();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/SimpleProvisioningService/2014/11", "SimpleProvisioningService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/SimpleProvisioningService/2014/11", "port_SimpleProvisioning"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_SimpleProvisioning".equals(portName)) {
            setport_SimpleProvisioningEndpointAddress(address);
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
