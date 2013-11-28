package de.epages.webservice.basket;

public interface BasketServiceClient extends java.rmi.Remote {

    /**
     * get information about a list of baskets
     */
    public de.epages.webservice.basket.model.TGetInfo_Return[] getInfo(java.lang.String[] baskets, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] lineItemAttributes, java.lang.String[] languageCodes);

    /**
     * check if a list of baskets exist.
     */
    public de.epages.webservice.basket.model.TExists_Return[] exists(java.lang.String[] baskets);

    /**
     * delete a list of baskets
     */
    public de.epages.webservice.basket.model.TDelete_Return[] delete(java.lang.String[] baskets);

    /**
     * delete line items of a baskets
     */
    public de.epages.webservice.basket.model.TDeleteLineItem_Return[] deleteLineItem(java.lang.String TBasketPath, java.lang.String[] lineItems);

    /**
     * update a list of baskets
     */
    public de.epages.webservice.basket.model.TUpdate_Return[] update(de.epages.webservice.basket.model.TUpdate_Input[] baskets);

    /**
     * update line items of a baskets
     */
    public de.epages.webservice.basket.model.TUpdateLineItem_Return[] updateLineItem(java.lang.String TBasketPath, de.epages.webservice.basket.model.TUpdateLineItem_Input[] lineItems);

    /**
     * create new baskets
     */
    public de.epages.webservice.basket.model.TCreate_Return[] create(de.epages.webservice.basket.model.TCreate_Input[] baskets);

    /**
     * add products tp baskets
     */
    public de.epages.webservice.basket.model.TAddProductLineItem_Return[] addProductLineItem(java.lang.String TBasketPath, de.epages.webservice.basket.model.TAddProductLineItem_Input[] lineItems);

}
