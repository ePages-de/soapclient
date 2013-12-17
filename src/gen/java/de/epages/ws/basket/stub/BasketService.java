/**
 * BasketService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.basket.stub;

public interface BasketService extends javax.xml.rpc.Service {

/**
 * epages Basket Service
 */
    public java.lang.String getport_BasketAddress();

    public de.epages.ws.basket.stub.Port_Basket getport_Basket() throws javax.xml.rpc.ServiceException;

    public de.epages.ws.basket.stub.Port_Basket getport_Basket(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
