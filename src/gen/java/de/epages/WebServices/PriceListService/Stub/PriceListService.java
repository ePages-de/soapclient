/**
 * PriceListService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.PriceListService.Stub;

public interface PriceListService extends javax.xml.rpc.Service {

/**
 * epages5 PriceList Service
 */
    public java.lang.String getport_PriceListAddress();

    public de.epages.WebServices.PriceListService.Stub.Port_PriceList_PortType getport_PriceList() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.PriceListService.Stub.Port_PriceList_PortType getport_PriceList(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
