package de.epages.ws.product10;

import de.epages.ws.product10.stub.*;
import de.epages.ws.product10.model.*;

public interface ProductServiceClient extends Port_Product {

    /**
     * get information about a list of products
     */
    public TGetInfo_Return[] getInfo(String[] products, String[] attributes, String[] languageCodes);

    /**
     * check if a list of products exist.
     */
    public TExists_Return[] exists(String[] products);

    /**
     * delete a list of products
     */
    public TDelete_Return[] delete(String[] products);

    /**
     * update a list of products
     */
    public TUpdate_Return[] update(TUpdate_Input[] products);

    /**
     * create new products
     */
    public TCreate_Return[] create(TCreate_Input[] products);

    /**
     * find products
     */
    public String[] find(TFind_Input searchParameters);

}