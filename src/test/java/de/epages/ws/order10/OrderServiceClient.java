package de.epages.ws.order10;

import de.epages.ws.order10.model.TCreate_Input;
import de.epages.ws.order10.model.TCreate_Return;
import de.epages.ws.order10.model.TDelete_Return;
import de.epages.ws.order10.model.TExists_Return;
import de.epages.ws.order10.model.TGetInfo_Return;
import de.epages.ws.order10.model.TUpdate_Input;
import de.epages.ws.order10.model.TUpdate_Return;
import de.epages.ws.order10.stub.Port_Order;
import de.epages.ws.order10.stub.TFind_Input;

public interface OrderServiceClient extends Port_Order {

    /**
     * get information about a list of orders
     */
    public TGetInfo_Return[] getInfo(String[] orders, String[] attributes, String[] addressAttributes, String[] lineItemAttributes, String[] languageCodes);

    /**
     * check if a list of orders exist.
     */
    public TExists_Return[] exists(String[] orders);

    /**
     * delete a list of orders
     */
    public TDelete_Return[] delete(String[] orders);

    /**
     * update a list of orders. This function also sends order
     *         status e-mails to customers if the e-mail events are enabled.
     */
    public TUpdate_Return[] update(TUpdate_Input[] orders);

    /**
     * create new orders. This function does not send order
     *         confirmation e-mails to the customers.
     */
    public TCreate_Return[] create(TCreate_Input[] orders);

    /**
     * find orders
     */
    public String[] find(TFind_Input searchParameters);
}
