package de.epages.ws.customer3;

import de.epages.ws.customer3.model.TCreate_Input;
import de.epages.ws.customer3.model.TCreate_Return;
import de.epages.ws.customer3.model.TDelete_Return;
import de.epages.ws.customer3.model.TExists_Return;
import de.epages.ws.customer3.model.TGetInfo_Return;
import de.epages.ws.customer3.model.TUpdate_Input;
import de.epages.ws.customer3.model.TUpdate_Return;
import de.epages.ws.customer3.stub.Port_Customer;

public interface CustomerServiceClient extends Port_Customer {

    /**
     * get information about a list of customers
     */
    TGetInfo_Return[] getInfo(String[] customers, String[] attributes, String[] addressAttributes) ;

    /**
     * check if a list of customers exist.
     */
    TExists_Return[] exists(String[] customers) ;

    /**
     * delete a list of customers
     */
    TDelete_Return[] delete(String[] customers) ;

    /**
     * update a list of customers
     */
    TUpdate_Return[] update(TUpdate_Input[] customers) ;

    /**
     * create new customers
     */
    TCreate_Return[] create(TCreate_Input[] customers) ;

    /**
     * find customers
     */
    String[] find(de.epages.ws.customer3.stub.TFind_Input searchParameters) ;

}
