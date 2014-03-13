package de.epages.ws.product;

import de.epages.ws.product.stub.Port_Product;
import de.epages.ws.product.model.*;

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
    public String[] find(de.epages.ws.product.stub.TFind_Input searchParameters);
}
