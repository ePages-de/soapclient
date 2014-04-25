/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelist2;

import de.epages.ws.pricelist2.model.TCreate_Return;
import de.epages.ws.pricelist2.model.TDelete_Return;
import de.epages.ws.pricelist2.model.TExists_Return;
import de.epages.ws.pricelist2.model.TGetInfo_Return;
import de.epages.ws.pricelist2.model.TUpdate_Return;
import de.epages.ws.pricelist2.stub.Port_PriceList;

public interface PriceListServiceClient extends Port_PriceList {

    /**
     * get information about a list of pricelists
     */
    TGetInfo_Return[] getInfo(String[] priceLists, String[] attributes, String[] languageCodes);

    /**
     * check if a list of pricelists exist.
     */
    TExists_Return[] exists(String[] priceLists);

    /**
     * delete a list of pricelists
     */
    TDelete_Return[] delete(String[] priceLists);

    /**
     * update a list of pricelists
     */
    TUpdate_Return[] update(de.epages.ws.pricelist2.model.TUpdate_Input[] priceLists);

    /**
     * create new pricelists
     */
    TCreate_Return[] create(de.epages.ws.pricelist2.model.TCreate_Input[] priceLists);

}
