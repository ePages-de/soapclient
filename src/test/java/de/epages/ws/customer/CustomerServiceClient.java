package de.epages.ws.customer;

import de.epages.ws.customer.model.TCreate_Input;
import de.epages.ws.customer.model.TCreate_Return;
import de.epages.ws.customer.model.TDelete_Return;
import de.epages.ws.customer.model.TExists_Return;
import de.epages.ws.customer.model.TGetInfo_Return;
import de.epages.ws.customer.model.TUpdate_Input;
import de.epages.ws.customer.model.TUpdate_Return;
import de.epages.ws.customer.stub.Port_Customer;
import de.epages.ws.customer.stub.TFind_Input;

public interface CustomerServiceClient extends Port_Customer {

    /**
     * get information about a list of customers
     */
    public TGetInfo_Return[] getInfo(String[] customers, String[] attributes);

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
