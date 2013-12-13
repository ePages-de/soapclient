package de.epages.ws.product11;

import de.epages.ws.product11.model.TCreateInput;
import de.epages.ws.product11.model.TCreateReturn;
import de.epages.ws.product11.model.TDeleteReturn;
import de.epages.ws.product11.model.TExistsReturn;
import de.epages.ws.product11.model.TGetInfoReturn;
import de.epages.ws.product11.model.TUpdateInput;
import de.epages.ws.product11.model.TUpdateReturn;
import de.epages.ws.product11.stub.TFindInput;

public interface ProductServiceClient {

    /**
     * get information about a list of products
     */
    TGetInfoReturn[] getInfo(String[] products);

    /**
     * get information about a list of products
     */
    TGetInfoReturn[] getInfo(String[] products, String[] attributes);

    /**
     * get information about a list of products
     */
    TGetInfoReturn[] getInfo(String[] products, String[] attributes, String[] languageCodes);

    /**
     * check if a list of products exist.
     */
    TExistsReturn[] exists(String[] products);

    /**
     * delete a list of products
     */
    TDeleteReturn[] delete(String[] products);

    /**
     * update a list of products
     */
    TUpdateReturn[] update(TUpdateInput[] products);

    /**
     * create new products
     */
    TCreateReturn[] create(TCreateInput[] products);

    /**
     * find products
     */
    String[] find(TFindInput searchParameters);

}
