/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.customergroup2;

import de.epages.ws.customergroup2.model.TCreate_Input;
import de.epages.ws.customergroup2.model.TCreate_Return;
import de.epages.ws.customergroup2.model.TDelete_Return;
import de.epages.ws.customergroup2.model.TExists_Return;
import de.epages.ws.customergroup2.model.TGetList_Return;
import de.epages.ws.customergroup2.model.TUpdate_Input;
import de.epages.ws.customergroup2.model.TUpdate_Return;
import de.epages.ws.customergroup2.stub.Port_CustomerGroup;

public interface CustomerGroupServiceClient extends Port_CustomerGroup {

    /**
     * get the list of customergroups
     */
    public TGetList_Return[] getList();

    /**
     * check if a list of groups exist.
     */
    public TExists_Return[] exists(java.lang.String[] groups);

    /**
     * create a list of customer groups.
     */
    public TCreate_Return[] create(TCreate_Input[] groups);

    /**
     * update a list of customer groups.
     */
    public TUpdate_Return[] update(TUpdate_Input[] groups);

    /**
     * delete a list of customer groups.
     */
    public TDelete_Return[] delete(java.lang.String[] groups);

}
