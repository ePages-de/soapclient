/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.customer2;

import de.epages.ws.customer2.model.TCreate_Input;
import de.epages.ws.customer2.model.TCreate_Return;
import de.epages.ws.customer2.model.TDelete_Return;
import de.epages.ws.customer2.model.TExists_Return;
import de.epages.ws.customer2.model.TGetInfo_Return;
import de.epages.ws.customer2.model.TUpdate_Input;
import de.epages.ws.customer2.model.TUpdate_Return;
import de.epages.ws.customer2.stub.Port_Customer;

public interface CustomerServiceClient extends Port_Customer {

    /**
     * get information about a list of customers
     */
    TGetInfo_Return[] getInfo(String[] customers, String[] attributes);

    /**
     * check if a list of customers exist.
     */
    TExists_Return[] exists(String[] customers);

    /**
     * delete a list of customers
     */
    TDelete_Return[] delete(String[] customers);

    /**
     * update a list of customers
     */
    TUpdate_Return[] update(TUpdate_Input[] customers);

    /**
     * create new customers
     */
    TCreate_Return[] create(TCreate_Input[] customers);

    /**
     * find customers
     */
    String[] find(de.epages.ws.customer2.stub.TFind_Input searchParameters);

}
