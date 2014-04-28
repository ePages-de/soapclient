package de.epages.ws.orderdocument7;

import de.epages.ws.orderdocument7.model.TCreate_Input;
import de.epages.ws.orderdocument7.model.TCreate_Return;
import de.epages.ws.orderdocument7.model.TDelete_Return;
import de.epages.ws.orderdocument7.model.TExists_Return;
import de.epages.ws.orderdocument7.model.TGetCreditNotes_Return;
import de.epages.ws.orderdocument7.model.TGetInfo_Return;
import de.epages.ws.orderdocument7.model.TGetInvoices_Return;
import de.epages.ws.orderdocument7.model.TGetPackingSlips_Return;
import de.epages.ws.orderdocument7.model.TUpdate_Input;
import de.epages.ws.orderdocument7.model.TUpdate_Return;
import de.epages.ws.orderdocument7.stub.Port_OrderDocument;

public interface OrderDocumentServiceClient extends Port_OrderDocument {

    /**
     * get information about a list of order documents
     */
    public TGetInfo_Return[] getInfo(String[] orderDocuments, String[] attributes, String[] addressAttributes, String[] lineItemAttributes,
            String[] languageCodes);

    /**
     * check if a list of order documents exist.
     */
    public TExists_Return[] exists(String[] orderDocuments);

    /**
     * delete a list of order documents
     */
    public TDelete_Return[] delete(String[] orderDocuments);

    /**
     * create new order documents
     */
    public TCreate_Return[] create(TCreate_Input[] orderDocuments);

    /**
     * update order documents
     */
    public TUpdate_Return[] update(TUpdate_Input[] orderDocuments);

    /**
     * get invoices of an order
     */
    public TGetInvoices_Return[] getInvoices(String[] orders);

    /**
     * get packing slips of an order
     */
    public TGetPackingSlips_Return[] getPackingSlips(String[] orders);

    /**
     * get credit notes of an order
     */
    public TGetCreditNotes_Return[] getCreditNotes(String[] orders);

}
