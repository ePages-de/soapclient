/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelistassignment;

import de.epages.ws.pricelistassignment.model.TGetQuantityDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TGetScalePrices_Return;
import de.epages.ws.pricelistassignment.model.TGetValueDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TSetQuantityDiscounts_Input;
import de.epages.ws.pricelistassignment.model.TSetQuantityDiscounts_Return;
import de.epages.ws.pricelistassignment.model.TSetScalePrices_Input;
import de.epages.ws.pricelistassignment.model.TSetScalePrices_Return;
import de.epages.ws.pricelistassignment.model.TSetValueDiscounts_Input;
import de.epages.ws.pricelistassignment.model.TSetValueDiscounts_Return;
import de.epages.ws.pricelistassignment.stub.Port_PriceListAssignment;


public interface PriceListAssignmentServiceClient extends Port_PriceListAssignment {

    /**
     * get information about a product's scale prices
     */
    TGetScalePrices_Return[] getScalePrices(String[] products, String[] priceLists);

    /**
     * update product's scale prices
     */
    TSetScalePrices_Return[] setScalePrices(TSetScalePrices_Input[] products);

    /**
     * get information about a product's quantity discounts
     */
    TGetQuantityDiscounts_Return[] getQuantityDiscounts(String[] products, String[] priceLists);

    /**
     * update product's quantity discounts
     */
    TSetQuantityDiscounts_Return[] setQuantityDiscounts(TSetQuantityDiscounts_Input[] products);

    /**
     * get information about a product's value discounts
     */
    TGetValueDiscounts_Return[] getValueDiscounts(String[] products, String[] priceLists);

    /**
     * update product's value discounts
     */
    TSetValueDiscounts_Return[] setValueDiscounts(TSetValueDiscounts_Input[] products);


}
