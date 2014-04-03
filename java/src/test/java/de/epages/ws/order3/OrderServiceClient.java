package de.epages.ws.order3;

import de.epages.ws.order3.model.TCreate_Input;
import de.epages.ws.order3.model.TCreate_Return;
import de.epages.ws.order3.model.TDelete_Return;
import de.epages.ws.order3.model.TExists_Return;
import de.epages.ws.order3.model.TGetInfo_Return;
import de.epages.ws.order3.model.TUpdate_Input;
import de.epages.ws.order3.model.TUpdate_Return;
import de.epages.ws.order3.stub.Port_Order;

public interface OrderServiceClient extends Port_Order {

    /**
     * get information about a list of orders
     */
    TGetInfo_Return[] getInfo(String[] orders);

    /**
     * get information about a list of orders
     */
    TGetInfo_Return[] getInfo(String[] orders, String[] attributes);

    /**
     * get information about a list of orders
     */
    TGetInfo_Return[] getInfo(String[] orders, String[] attributes, java.lang.String[] addressAttributes);

    /**
     * get information about a list of orders
     */
    TGetInfo_Return[] getInfo(java.lang.String[] orders, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] languageCodes);

    /**
     * check if a list of orders exist.
     */
    TExists_Return[] exists(String[] orders);

    /**
     * delete a list of orders
     */
    TDelete_Return[] delete(String[] orders);

    /**
     * update a list of orders. This function also sends order
     *         status e-mails to customers if the e-mail events are enabled.
     */
    TUpdate_Return[] update(TUpdate_Input[] orders);

    /**
     * create new orders. This function does not send order
     *         confirmation e-mails to the customers.
     */
    TCreate_Return[] create(TCreate_Input[] orders);

    /**
     * find orders
     */
    String[] find(de.epages.ws.order3.stub.TFind_Input searchParameters);

}
