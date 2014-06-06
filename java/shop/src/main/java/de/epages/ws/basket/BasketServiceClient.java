package de.epages.ws.basket;

import de.epages.ws.basket.model.TAddProductLineItem_Input;
import de.epages.ws.basket.model.TAddProductLineItem_Return;
import de.epages.ws.basket.model.TCreate_Input;
import de.epages.ws.basket.model.TCreate_Return;
import de.epages.ws.basket.model.TDeleteLineItem_Return;
import de.epages.ws.basket.model.TDelete_Return;
import de.epages.ws.basket.model.TExists_Return;
import de.epages.ws.basket.model.TGetInfo_Return;
import de.epages.ws.basket.model.TUpdateLineItem_Input;
import de.epages.ws.basket.model.TUpdateLineItem_Return;
import de.epages.ws.basket.model.TUpdate_Input;
import de.epages.ws.basket.model.TUpdate_Return;
import de.epages.ws.basket.stub.Port_Basket;

public interface BasketServiceClient extends Port_Basket {

    /**
     * get information about a list of baskets
     */
    TGetInfo_Return[] getInfo(String[] baskets);

    /**
     * get information about a list of baskets
     */
    TGetInfo_Return[] getInfo(String[] baskets, String[] attributes);

    /**
     * get information about a list of baskets
     */
    @Override
    TGetInfo_Return[] getInfo(String[] baskets, String[] attributes, String[] addressAttributes, String[] lineItemAttributes,
            String[] languageCodes);

    /**
     * check if a list of baskets exist.
     */
    @Override
    TExists_Return[] exists(String[] baskets);

    /**
     * delete a list of baskets
     */
    @Override
    TDelete_Return[] delete(String[] baskets);

    /**
     * delete line items of a baskets
     */
    @Override
    TDeleteLineItem_Return[] deleteLineItem(String TBasketPath, String[] lineItems);

    /**
     * update a list of baskets
     */
    @Override
    TUpdate_Return[] update(TUpdate_Input[] baskets);

    /**
     * update line items of a baskets
     */
    @Override
    TUpdateLineItem_Return[] updateLineItem(String TBasketPath, TUpdateLineItem_Input[] lineItems);

    /**
     * create new baskets
     */
    @Override
    TCreate_Return[] create(TCreate_Input[] baskets);

    /**
     * add products tp baskets
     */
    @Override
    TAddProductLineItem_Return[] addProductLineItem(String TBasketPath, TAddProductLineItem_Input[] lineItems);

}
