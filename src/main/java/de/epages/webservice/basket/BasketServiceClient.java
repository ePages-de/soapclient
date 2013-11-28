package de.epages.webservice.basket;

import de.epages.webservice.basket.model.TAddProductLineItem_Input;
import de.epages.webservice.basket.model.TAddProductLineItem_Return;
import de.epages.webservice.basket.model.TCreate_Input;
import de.epages.webservice.basket.model.TCreate_Return;
import de.epages.webservice.basket.model.TDeleteLineItem_Return;
import de.epages.webservice.basket.model.TDelete_Return;
import de.epages.webservice.basket.model.TExists_Return;
import de.epages.webservice.basket.model.TGetInfo_Return;
import de.epages.webservice.basket.model.TUpdateLineItem_Input;
import de.epages.webservice.basket.model.TUpdateLineItem_Return;
import de.epages.webservice.basket.model.TUpdate_Input;
import de.epages.webservice.basket.model.TUpdate_Return;
import de.epages.webservice.basket.stub.Port_Basket;

public interface BasketServiceClient extends Port_Basket {

    /**
     * get information about a list of baskets
     */
    public TGetInfo_Return[] getInfo(String[] baskets, String[] attributes, String[] addressAttributes, String[] lineItemAttributes, String[] languageCodes);

    /**
     * check if a list of baskets exist.
     */
    public TExists_Return[] exists(String[] baskets);

    /**
     * delete a list of baskets
     */
    public TDelete_Return[] delete(String[] baskets);

    /**
     * delete line items of a baskets
     */
    public TDeleteLineItem_Return[] deleteLineItem(String TBasketPath, String[] lineItems);

    /**
     * update a list of baskets
     */
    public TUpdate_Return[] update(TUpdate_Input[] baskets);

    /**
     * update line items of a baskets
     */
    public TUpdateLineItem_Return[] updateLineItem(String TBasketPath, TUpdateLineItem_Input[] lineItems);

    /**
     * create new baskets
     */
    public TCreate_Return[] create(TCreate_Input[] baskets);

    /**
     * add products tp baskets
     */
    public TAddProductLineItem_Return[] addProductLineItem(String TBasketPath, TAddProductLineItem_Input[] lineItems);

}
