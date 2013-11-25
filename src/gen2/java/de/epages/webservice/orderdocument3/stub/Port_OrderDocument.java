/**
 * Port_OrderDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.orderdocument3.stub;

public interface Port_OrderDocument extends java.rmi.Remote {

    /**
     * get information about a list of order documents
     */
    public de.epages.webservice.orderdocument3.model.TGetInfo_Return[] getInfo(java.lang.String[] orderDocuments, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of order documents exist.
     */
    public de.epages.webservice.orderdocument3.model.TExists_Return[] exists(java.lang.String[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * delete a list of order documents
     */
    public de.epages.webservice.orderdocument3.model.TDelete_Return[] delete(java.lang.String[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * create new order documents
     */
    public de.epages.webservice.orderdocument3.model.TCreate_Return[] create(de.epages.webservice.orderdocument3.model.TCreate_Input[] orderDocuments) throws java.rmi.RemoteException;

    /**
     * get invoices of an order
     */
    public de.epages.webservice.orderdocument3.model.TGetInvoices_Return[] getInvoices(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * get packing slips of an order
     */
    public de.epages.webservice.orderdocument3.model.TGetPackingSlips_Return[] getPackingSlips(java.lang.String[] orders) throws java.rmi.RemoteException;

    /**
     * get credit notes of an order
     */
    public de.epages.webservice.orderdocument3.model.TGetCreditNotes_Return[] getCreditNotes(java.lang.String[] orders) throws java.rmi.RemoteException;
}
