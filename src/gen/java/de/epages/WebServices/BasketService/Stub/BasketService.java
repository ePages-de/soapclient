/**
 * BasketService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.BasketService.Stub;

public interface BasketService extends javax.xml.rpc.Service {

/**
 * epages Order Service
 */
    public java.lang.String getport_BasketAddress();

    public de.epages.WebServices.BasketService.Stub.Port_Basket_PortType getport_Basket() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.BasketService.Stub.Port_Basket_PortType getport_Basket(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
