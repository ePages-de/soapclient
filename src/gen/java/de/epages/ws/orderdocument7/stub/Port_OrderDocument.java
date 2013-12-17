/**
 * Port_OrderDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.orderdocument7.stub;

public interface Port_OrderDocument extends java.rmi.Remote {

    /**
     * get information about a list of order documents
     */
    public de.epages.ws.orderdocument7.model.TGetInfo_Return[] getInfo(java.lang.String[] orderDocuments, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] lineItemAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of order documents exist.
     */
    public de.epages.ws.orderdocument7.model.TExists_Return[] exists(java.lang.String[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * delete a list of order documents
     */
    public de.epages.ws.orderdocument7.model.TDelete_Return[] delete(java.lang.String[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * create new order documents
     */
    public de.epages.ws.orderdocument7.model.TCreate_Return[] create(de.epages.ws.orderdocument7.model.TCreate_Input[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * update order documents
     */
    public de.epages.ws.orderdocument7.model.TUpdate_Return[] update(de.epages.ws.orderdocument7.model.TUpdate_Input[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * get invoices of an order
     */
    public de.epages.ws.orderdocument7.model.TGetInvoices_Return[] getInvoices(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * get packing slips of an order
     */
    public de.epages.ws.orderdocument7.model.TGetPackingSlips_Return[] getPackingSlips(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * get credit notes of an order
     */
    public de.epages.ws.orderdocument7.model.TGetCreditNotes_Return[] getCreditNotes(java.lang.String[] orders) throws java.rmi.RemoteException;
}
