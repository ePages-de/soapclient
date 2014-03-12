package de.epages.ws.paymentmethod;

import de.epages.ws.paymentmethod.stub.Port_PaymentMethod;
import de.epages.ws.paymentmothod.model.TGetList_Return;

public interface PaymentMethodServiceClient extends Port_PaymentMethod {

    /**
     * get the list of payment methods
     */
    TGetList_Return[] getList();

}
