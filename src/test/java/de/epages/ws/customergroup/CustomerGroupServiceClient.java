package de.epages.ws.customergroup;

import de.epages.ws.customergroup.model.TGetList_Return;
import de.epages.ws.customergroup.stub.Port_CustomerGroup;

public interface CustomerGroupServiceClient extends Port_CustomerGroup {

    /**
     * get the list of customergroups
     */
    public TGetList_Return[] getList();


}
