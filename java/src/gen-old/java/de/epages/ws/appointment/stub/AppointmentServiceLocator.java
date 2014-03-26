/**
 * AppointmentServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.appointment.stub;

public class AppointmentServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.appointment.stub.AppointmentService {

/**
 * epages Appointment Service
 */

    public AppointmentServiceLocator() {
    }


    public AppointmentServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AppointmentServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_Appointment
    private java.lang.String port_Appointment_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_AppointmentAddress() {
        return port_Appointment_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_AppointmentWSDDServiceName = "port_Appointment";

    public java.lang.String getport_AppointmentWSDDServiceName() {
        return port_AppointmentWSDDServiceName;
    }

    public void setport_AppointmentWSDDServiceName(java.lang.String name) {
        port_AppointmentWSDDServiceName = name;
    }

    public de.epages.ws.appointment.stub.Port_Appointment getport_Appointment() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_Appointment_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_Appointment(endpoint);
    }

    public de.epages.ws.appointment.stub.Port_Appointment getport_Appointment(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.appointment.stub.Bind_Appointment_SOAPStub _stub = new de.epages.ws.appointment.stub.Bind_Appointment_SOAPStub(portAddress, this);
            _stub.setPortName(getport_AppointmentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_AppointmentEndpointAddress(java.lang.String address) {
        port_Appointment_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.appointment.stub.Port_Appointment.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.appointment.stub.Bind_Appointment_SOAPStub _stub = new de.epages.ws.appointment.stub.Bind_Appointment_SOAPStub(new java.net.URL(port_Appointment_address), this);
                _stub.setPortName(getport_AppointmentWSDDServiceName());
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
        if ("port_Appointment".equals(inputPortName)) {
            return getport_Appointment();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/AppointmentService/2009/06", "AppointmentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/AppointmentService/2009/06", "port_Appointment"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_Appointment".equals(portName)) {
            setport_AppointmentEndpointAddress(address);
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
