/**
 * CrossSellingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.crossselling2.stub;

public interface CrossSellingService extends javax.xml.rpc.Service {

/**
 * epages Cross Selling Service
 */
    public java.lang.String getport_CrossSellingAddress();

    public de.epages.ws.crossselling2.stub.Port_CrossSelling getport_CrossSelling() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.crossselling2.stub.Port_CrossSelling getport_CrossSelling(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
