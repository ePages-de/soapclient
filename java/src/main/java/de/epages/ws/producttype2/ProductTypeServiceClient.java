/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.producttype2;

import de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return;
import de.epages.ws.producttype2.model.TCreateProductAttribute_Return;
import de.epages.ws.producttype2.model.TCreate_Return;
import de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return;
import de.epages.ws.producttype2.model.TDeleteProductAttribute_Return;
import de.epages.ws.producttype2.model.TDelete_Return;
import de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return;
import de.epages.ws.producttype2.model.TExistsProductAttribute_Return;
import de.epages.ws.producttype2.model.TExists_Return;
import de.epages.ws.producttype2.model.TGetInfo_Return;
import de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return;
import de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return;
import de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return;
import de.epages.ws.producttype2.model.TUpdateProductAttribute_Return;
import de.epages.ws.producttype2.model.TUpdate_Return;
import de.epages.ws.producttype2.stub.Port_ProductType;

public interface ProductTypeServiceClient extends Port_ProductType {

    /**
     * get the base product type
     */
    String getBaseProductType();

    /**
     * get information about a list of product types
     */
    TGetInfo_Return[] getInfo(String[] productTypes, String[] attributes, String[] languageCodes);

    /**
     * get information about all product types
     */
    TGetInfo_Return[] getAllInfo(String[] attributes, String[] languageCodes);

    /**
     * check if a list of product types exist
     */
    TExists_Return[] exists(String[] productTypes);

    /**
     * delete a list of product types
     */
    TDelete_Return[] delete(String[] productTypes);

    /**
     * update a list of product types
     */
    TUpdate_Return[] update(de.epages.ws.producttype2.model.TUpdate_Input[] productTypes);

    /**
     * create new product types
     */
    TCreate_Return[] create(de.epages.ws.producttype2.model.TCreate_Input[] productTypes);

    /**
     * get information about a list of product attributes
     */
    TGetProductAttributeInfo_Return[] getProductAttributeInfo(String productType, String[] productAttributes, String[] languageCodes);

    /**
     * get information about all product attibutes of a product type
     */
    TGetProductAttributeInfo_Return[] getAllProductAttributesInfo(String productType, String[] languageCodes);

    /**
     * check if a list of product attributes exist
     */
    TExistsProductAttribute_Return[] existsProductAttribute(String productType, String[] productAttributes);

    /**
     * delete a list of product attributes
     */
    TDeleteProductAttribute_Return[] deleteProductAttribute(String productType, String[] productAttributes);

    /**
     * update a list of product attributes
     */
    TUpdateProductAttribute_Return[] updateProductAttribute(String productType, de.epages.ws.producttype2.model.TUpdateProductAttribute_Input[] productAttributes);

    /**
     * create a list of product attributes
     */
    TCreateProductAttribute_Return[] createProductAttribute(String productType, de.epages.ws.producttype2.model.TCreateProductAttribute_Input[] productAttributes);

    /**
     * get information about a list of predefined attributes
     */
    TGetPreDefAttributeInfo_Return[] getPreDefAttributeInfo(String productAttribute, String[] preDefAttributes, String[] languageCodes);

    /**
     * get information about all predefined attibutes of a product
     * attribute
     */
    TGetPreDefAttributeInfo_Return[] getAllPreDefAttributesInfo(String productAttribute, String[] languageCodes);

    /**
     * check if a list of predefined attributes exist
     */
    TExistsPreDefAttribute_Return[] existsPreDefAttribute(String productAttribute, String[] preDefAttributes);

    /**
     * delete a list of predefined attributes
     */
    TDeletePreDefAttribute_Return[] deletePreDefAttribute(String productAttribute, String[] preDefAttributes);

    /**
     * update a list of predefined attributes
     */
    TUpdatePreDefAttribute_Return[] updatePreDefAttribute(String productAttribute, de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Input[] preDefAttributes);

    /**
     * create a list of predefined attributes
     */
    TCreatePreDefAttribute_Return[] createPreDefAttribute(String productAttribute, de.epages.ws.producttype2.model.TCreatePreDefAttribute_Input[] preDefAttributes);

}
