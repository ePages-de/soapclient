/**
 * SimpleProvisioningService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.simpleprovisioning3.stub;

public interface SimpleProvisioningService extends javax.xml.rpc.Service {

/**
 * ePages Consulting Provisioning Service
 */
    public java.lang.String getport_SimpleProvisioningAddress();

    public Port_SimpleProvisioning_PortType getport_SimpleProvisioning() throws javax.xml.rpc.ServiceException;

    public Port_SimpleProvisioning_PortType getport_SimpleProvisioning(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
