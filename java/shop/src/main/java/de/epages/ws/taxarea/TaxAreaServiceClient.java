package de.epages.ws.taxarea;

import de.epages.ws.taxarea.model.TGetList_Return;
import de.epages.ws.taxarea.stub.Port_TaxArea;

public interface TaxAreaServiceClient extends Port_TaxArea {

    /**
     * get the list of tax areas
     */
    @Override
    TGetList_Return[] getList();

}
