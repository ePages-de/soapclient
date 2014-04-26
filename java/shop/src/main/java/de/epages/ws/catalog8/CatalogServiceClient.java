/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.catalog8;

import de.epages.ws.catalog8.model.TCreate_Input;
import de.epages.ws.catalog8.model.TCreate_Return;
import de.epages.ws.catalog8.model.TDelete_Return;
import de.epages.ws.catalog8.model.TExists_Return;
import de.epages.ws.catalog8.model.TGetInfo_Return;
import de.epages.ws.catalog8.model.TSortProducts_Input;
import de.epages.ws.catalog8.model.TSortProducts_Return;
import de.epages.ws.catalog8.model.TUpdate_Input;
import de.epages.ws.catalog8.model.TUpdate_Return;
import de.epages.ws.catalog8.model.TUpload_Input;
import de.epages.ws.catalog8.model.TUpload_Return;
import de.epages.ws.catalog8.stub.Port_Catalog;
import de.epages.ws.catalog8.stub.TGetRoot_Return;

public interface CatalogServiceClient extends Port_Catalog {

    /**
     * get information about a list of catalogs
     */
    TGetInfo_Return[] getInfo(String[] catalogs, String[] attributes, String[] languageCodes);

    /**
     * check if a list of catalogs exist.
     */
    TExists_Return[] exists(String[] catalogs);

    /**
     * delete a list of catalogs
     */
    TDelete_Return[] delete(String[] catalogs);

    /**
     * update a list of catalogs
     */
    TUpdate_Return[] update(TUpdate_Input[] catalogs);

    /**
     * create new catalogs
     */
    TCreate_Return[] create(TCreate_Input[] catalogs);

    /**
     * get root catalog
     */
    TGetRoot_Return getRoot();

    /**
     * sort products in each catalog of a list of catalogs
     */
    TSortProducts_Return[] sortProducts(TSortProducts_Input[] catalogs);

    /**
     * upload catalog related images.
     */
    TUpload_Return uploadImage(String TObjectPath, TUpload_Input imageData);

    /**
     * get all recursive categorie paths as simple flat list
     */
    String[] getCategories();
}
