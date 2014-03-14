package de.epages.ws.order;

import de.epages.ws.order.model.TCreate_Input;
import de.epages.ws.order.model.TCreate_Return;
import de.epages.ws.order.model.TDelete_Return;
import de.epages.ws.order.model.TExists_Return;
import de.epages.ws.order.model.TGetInfo_Return;
import de.epages.ws.order.model.TUpdate_Input;
import de.epages.ws.order.model.TUpdate_Return;
import de.epages.ws.order.stub.Port_Order;
import de.epages.ws.order.stub.TFind_Input;

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
    TGetInfo_Return[] getInfo(String[] orders, String[] attributes, String[] languageCodes);

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
    String[] find(TFind_Input searchParameters);

}
