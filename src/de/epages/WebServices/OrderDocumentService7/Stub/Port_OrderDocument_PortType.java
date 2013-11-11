/**
 * Port_OrderDocument_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.OrderDocumentService7.Stub;

public interface Port_OrderDocument_PortType extends java.rmi.Remote {

    /**
     * get information about a list of order documents
     */
    public de.epages.WebServices.OrderDocumentService7.Stub.TGetInfo_Return[] getInfo(java.lang.String[] orderDocuments, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] lineItemAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of order documents exist.
     */
    public de.epages.WebServices.OrderDocumentService7.Stub.TExists_Return[] exists(java.lang.String[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * delete a list of order documents
     */
    public de.epages.WebServices.OrderDocumentService7.Stub.TDelete_Return[] delete(java.lang.String[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * create new order documents
     */
    public de.epages.WebServices.OrderDocumentService7.Stub.TCreate_Return[] create(de.epages.WebServices.OrderDocumentService7.Stub.TCreate_Input[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * update order documents
     */
    public de.epages.WebServices.OrderDocumentService7.Stub.TUpdate_Return[] update(de.epages.WebServices.OrderDocumentService7.Stub.TUpdate_Input[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * get invoices of an order
     */
    public de.epages.WebServices.OrderDocumentService7.Stub.TGetInvoices_Return[] getInvoices(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * get packing slips of an order
     */
    public de.epages.WebServices.OrderDocumentService7.Stub.TGetPackingSlips_Return[] getPackingSlips(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * get credit notes of an order
     */
    public de.epages.WebServices.OrderDocumentService7.Stub.TGetCreditNotes_Return[] getCreditNotes(java.lang.String[] orders) throws java.rmi.RemoteException;
}
