package de.epages.ws.shippingmethod;

import de.epages.ws.shippingmethod2.stub.*;

public interface ShippingMethodServiceClient extends Port_ShippingMethod {

    /**
     * get the list of shipping methods
     */
    public de.epages.ws.shippingmethod2.model.TGetList_Return[] getList();

}
