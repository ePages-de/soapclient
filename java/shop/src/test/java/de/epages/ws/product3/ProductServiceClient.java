package de.epages.ws.product3;

import de.epages.ws.product3.model.TCreate_Input;
import de.epages.ws.product3.model.TCreate_Return;
import de.epages.ws.product3.model.TDelete_Return;
import de.epages.ws.product3.model.TExists_Return;
import de.epages.ws.product3.model.TGetInfo_Return;
import de.epages.ws.product3.model.TUpdate_Input;
import de.epages.ws.product3.model.TUpdate_Return;
import de.epages.ws.product3.stub.Port_Product;
import de.epages.ws.product3.stub.TFind_Input;

public interface ProductServiceClient extends Port_Product {

    /**
     * get information about a list of products
     */
    TGetInfo_Return[] getInfo(String[] products, String[] attributes, String[] languageCodes);

    /**
     * check if a list of products exist.
     */
    TExists_Return[] exists(String[] products);

    /**
     * delete a list of products
     */
    TDelete_Return[] delete(String[] products);

    /**
     * update a list of products
     */
    TUpdate_Return[] update(TUpdate_Input[] products);

    /**
     * create new products
     */
    TCreate_Return[] create(TCreate_Input[] products);

    /**
     * find products
     */
    String[] find(TFind_Input searchParameters);

}