package de.epages.ws.shippingmethod;

import de.epages.ws.shippingmethod.model.TGetList_Return;
import de.epages.ws.shippingmethod.stub.Port_ShippingMethod;

public interface ShippingMethodServiceClient extends Port_ShippingMethod {

    /**
     * get the list of shipping methods
     */
    TGetList_Return[] getList();

}
