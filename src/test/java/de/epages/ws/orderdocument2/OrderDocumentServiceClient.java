package de.epages.ws.orderdocument2;

import de.epages.ws.orderdocument2.model.TCreate_Input;
import de.epages.ws.orderdocument2.model.TCreate_Return;
import de.epages.ws.orderdocument2.model.TDelete_Return;
import de.epages.ws.orderdocument2.model.TExists_Return;
import de.epages.ws.orderdocument2.model.TGetCreditNotes_Return;
import de.epages.ws.orderdocument2.model.TGetInfo_Return;
import de.epages.ws.orderdocument2.model.TGetInvoices_Return;
import de.epages.ws.orderdocument2.model.TGetPackingSlips_Return;
import de.epages.ws.orderdocument2.stub.Port_OrderDocument;

public interface OrderDocumentServiceClient extends Port_OrderDocument {

    /**
     * get information about a list of order documents
     */
    TGetInfo_Return[] getInfo(String[] orderDocuments);

    /**
     * get information about a list of order documents
     */
    TGetInfo_Return[] getInfo(String[] orderDocuments, String[] attributes);

    /**
     * get information about a list of order documents
     */
    TGetInfo_Return[] getInfo(String[] orderDocuments, String[] attributes, String[] languageCodes);

    /**
     * check if a list of order documents exist.
     */
    TExists_Return[] exists(String[] orderDocuments);

    /**
     * delete a list of order documents
     */
    TDelete_Return[] delete(String[] orderDocuments);

    /**
     * create new order documents
     */
    TCreate_Return[] create(TCreate_Input[] orderDocuments);

    /**
     * get invoices of an order
     */
    TGetInvoices_Return[] getInvoices(String[] orders);

    /**
     * get packing slips of an order
     */
    TGetPackingSlips_Return[] getPackingSlips(String[] orders);

    /**
     * get credit notes of an order
     */
    TGetCreditNotes_Return[] getCreditNotes(String[] orders);

}
