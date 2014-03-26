/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.customer4;

import de.epages.ws.customer4.model.TCreate_Input;
import de.epages.ws.customer4.model.TCreate_Return;
import de.epages.ws.customer4.model.TDelete_Return;
import de.epages.ws.customer4.model.TExists_Return;
import de.epages.ws.customer4.model.TGetInfo_Return;
import de.epages.ws.customer4.model.TUpdate_Input;
import de.epages.ws.customer4.model.TUpdate_Return;
import de.epages.ws.customer4.stub.Port_Customer;
import de.epages.ws.customer4.stub.TFind_Input;

public interface CustomerServiceClient extends Port_Customer {

    /**
     * get information about a list of customers
     */
    public TGetInfo_Return[] getInfo(String[] customers, String[] attributes, String[] addressAttributes);

    /**
     * check if a list of customers exist.
     */
    public TExists_Return[] exists(String[] customers);

    /**
     * delete a list of customers
     */
    public TDelete_Return[] delete(String[] customers);

    /**
     * update a list of customers
     */
    public TUpdate_Return[] update(TUpdate_Input[] customers);

    /**
     * create new customers
     */
    public TCreate_Return[] create(TCreate_Input[] customers);

    /**
     * find customers
     */
    public String[] find(TFind_Input searchParameters);

}
