package de.epages.ws.shippingmethod2;

import de.epages.ws.shippingmethod2.model.TGetList_Return;
import de.epages.ws.shippingmethod2.stub.Port_ShippingMethod;

public interface ShippingMethodServiceClient extends Port_ShippingMethod {

    /**
     * get the list of shipping methods
     */
    TGetList_Return[] getList();

}
