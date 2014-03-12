/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.customergroup;

import de.epages.ws.customergroup.model.TGetList_Return;
import de.epages.ws.customergroup.stub.Port_CustomerGroup;

public interface CustomerGroupServiceClient extends Port_CustomerGroup {

    /**
     * get the list of customergroups
     */
    public TGetList_Return[] getList();


}
