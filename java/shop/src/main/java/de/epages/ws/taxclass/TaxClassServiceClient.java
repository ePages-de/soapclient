package de.epages.ws.taxclass;

import de.epages.ws.taxclass.model.TGetList_Return;
import de.epages.ws.taxclass.stub.Port_TaxClass;

public interface TaxClassServiceClient extends Port_TaxClass {

    /**
     * get the list of taxclasses
     */
    TGetList_Return[] getList();
}
