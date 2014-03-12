/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productattribute;

import de.epages.ws.productattribute.model.TGetInfoList_Return;
import de.epages.ws.productattribute.stub.Port_ProductAttribute;


public interface ProductAttributeServiceClient extends Port_ProductAttribute {

    /**
     * get the list of productattributes
     */
    TGetInfoList_Return[] getInfoList();
}
