package de.epages.ws.producttype;

import de.epages.ws.producttype.model.TCreatePreDefAttribute_Input;
import de.epages.ws.producttype.model.TCreateProductAttribute_Input;
import de.epages.ws.producttype.model.TCreate_Input;
import de.epages.ws.producttype.model.TCreate_Return;
import de.epages.ws.producttype.model.TDelete_Return;
import de.epages.ws.producttype.model.TExists_Return;
import de.epages.ws.producttype.model.TGetInfo_Return;
import de.epages.ws.producttype.model.TUpdatePreDefAttribute_Input;
import de.epages.ws.producttype.model.TUpdateProductAttribute_Input;
import de.epages.ws.producttype.model.TUpdate_Input;
import de.epages.ws.producttype.model.TUpdate_Return;
import de.epages.ws.producttype.stub.Port_ProductType;
import de.epages.ws.producttype.stub.Type_createPreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_createProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_deletePreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_deleteProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_existsPreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_existsProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_getAllPreDefAttributesInfo_Out;
import de.epages.ws.producttype.stub.Type_getAllProductAttributesInfo_Out;
import de.epages.ws.producttype.stub.Type_getPreDefAttributeInfo_Out;
import de.epages.ws.producttype.stub.Type_getProductAttributeInfo_Out;
import de.epages.ws.producttype.stub.Type_updatePreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_updateProductAttribute_Out;


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
    TUpdate_Return[] update(TUpdate_Input[] productTypes);

    /**
     * create new product types
     */
    TCreate_Return[] create(TCreate_Input[] productTypes);

    /**
     * get information about a list of product attributes
     */
    Type_getProductAttributeInfo_Out getProductAttributeInfo(String productType, String[] productAttributes, String[] languageCodes);

    /**
     * get information about all product attibutes of a product type
     */
    Type_getAllProductAttributesInfo_Out getAllProductAttributesInfo(String productType, String[] languageCodes);

    /**
     * check if a list of product attributes exist
     */
    Type_existsProductAttribute_Out existsProductAttribute(String productType, String[] productAttributes);

    /**
     * delete a list of product attributes
     */
    Type_deleteProductAttribute_Out deleteProductAttribute(String productType, String[] productAttributes);

    /**
     * update a list of product attributes
     */
    Type_updateProductAttribute_Out updateProductAttribute(String productType, TUpdateProductAttribute_Input[] productAttributes);

    /**
     * create a list of product attributes
     */
    Type_createProductAttribute_Out createProductAttribute(String productType, TCreateProductAttribute_Input[] productAttributes);

    /**
     * get information about a list of predefined attributes
     */
    Type_getPreDefAttributeInfo_Out getPreDefAttributeInfo(String productAttribute, String[] preDefAttributes, String[] languageCodes);

    /**
     * get information about all predefined attibutes of a product
     * attribute
     */
    Type_getAllPreDefAttributesInfo_Out getAllPreDefAttributesInfo(String productAttribute, String[] languageCodes);

    /**
     * check if a list of predefined attributes exist
     */
    Type_existsPreDefAttribute_Out existsPreDefAttribute(String productAttribute, String[] preDefAttributes);

    /**
     * delete a list of predefined attributes
     */
    Type_deletePreDefAttribute_Out deletePreDefAttribute(String productAttribute, String[] preDefAttributes);

    /**
     * update a list of predefined attributes
     */
    Type_updatePreDefAttribute_Out updatePreDefAttribute(String productAttribute, TUpdatePreDefAttribute_Input[] preDefAttributes);

    /**
     * create a list of predefined attributes
     */
    Type_createPreDefAttribute_Out createPreDefAttribute(String productAttribute, TCreatePreDefAttribute_Input[] preDefAttributes);
}
