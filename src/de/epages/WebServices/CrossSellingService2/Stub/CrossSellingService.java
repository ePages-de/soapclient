/**
 * CrossSellingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CrossSellingService2.Stub;

public interface CrossSellingService extends javax.xml.rpc.Service {

/**
 * epages5 Cross Selling Service
 */
    public java.lang.String getport_CrossSellingAddress();

    public de.epages.WebServices.CrossSellingService2.Stub.Port_CrossSelling_PortType getport_CrossSelling() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.CrossSellingService2.Stub.Port_CrossSelling_PortType getport_CrossSelling(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
