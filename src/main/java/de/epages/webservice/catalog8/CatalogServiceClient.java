/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.catalog8;

import de.epages.webservice.catalog8.model.TCreate_Input;
import de.epages.webservice.catalog8.model.TCreate_Return;
import de.epages.webservice.catalog8.model.TDelete_Return;
import de.epages.webservice.catalog8.model.TExists_Return;
import de.epages.webservice.catalog8.model.TGetInfo_Return;
import de.epages.webservice.catalog8.model.TSortProducts_Input;
import de.epages.webservice.catalog8.model.TSortProducts_Return;
import de.epages.webservice.catalog8.model.TUpdate_Input;
import de.epages.webservice.catalog8.model.TUpdate_Return;
import de.epages.webservice.catalog8.model.TUpload_Input;
import de.epages.webservice.catalog8.model.TUpload_Return;
import de.epages.webservice.catalog8.stub.Port_Catalog;
import de.epages.webservice.catalog8.stub.TGetRoot_Return;

public interface CatalogServiceClient extends Port_Catalog {

    /**
     * get information about a list of catalogs
     */
    public TGetInfo_Return[] getInfo(java.lang.String[] catalogs, java.lang.String[] attributes, java.lang.String[] languageCodes);

    /**
     * check if a list of catalogs exist.
     */
    public TExists_Return[] exists(java.lang.String[] catalogs);

    /**
     * delete a list of catalogs
     */
    public TDelete_Return[] delete(java.lang.String[] catalogs);

    /**
     * update a list of catalogs
     */
    public TUpdate_Return[] update(TUpdate_Input[] catalogs);

    /**
     * create new catalogs
     */
    public TCreate_Return[] create(TCreate_Input[] catalogs);

    /**
     * get root catalog
     */
    public TGetRoot_Return getRoot();

    /**
     * sort products in each catalog of a list of catalogs
     */
    public TSortProducts_Return[] sortProducts(TSortProducts_Input[] catalogs);

    /**
     * upload catalog related images.
     */
    public TUpload_Return uploadImage(java.lang.String TObjectPath, TUpload_Input imageData);

    /**
     * get all recursive categorie paths as simple flat list
     */
    public java.lang.String[] getCategories();
}
