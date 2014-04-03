/**
 * Port_ProductType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.producttype.stub;

public interface Port_ProductType extends java.rmi.Remote {

    /**
     * get the base product type
     */
    public java.lang.String getBaseProductType() throws java.rmi.RemoteException;

    /**
     * get information about a list of product types
     */
    public de.epages.ws.producttype.model.TGetInfo_Return[] getInfo(java.lang.String[] productTypes, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all product types
     */
    public de.epages.ws.producttype.model.TGetInfo_Return[] getAllInfo(java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of product types exist
     */
    public de.epages.ws.producttype.model.TExists_Return[] exists(java.lang.String[] productTypes) throws java.rmi.RemoteException;

    /**
     * delete a list of product types
     */
    public de.epages.ws.producttype.model.TDelete_Return[] delete(java.lang.String[] productTypes) throws java.rmi.RemoteException;

    /**
     * update a list of product types
     */
    public de.epages.ws.producttype.model.TUpdate_Return[] update(de.epages.ws.producttype.model.TUpdate_Input[] productTypes) throws java.rmi.RemoteException;

    /**
     * create new product types
     */
    public de.epages.ws.producttype.model.TCreate_Return[] create(de.epages.ws.producttype.model.TCreate_Input[] productTypes) throws java.rmi.RemoteException;

    /**
     * get information about a list of product attributes
     */
    public de.epages.ws.producttype.stub.Type_getProductAttributeInfo_Out getProductAttributeInfo(java.lang.String productType, java.lang.String[] productAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all product attibutes of a product type
     */
    public de.epages.ws.producttype.stub.Type_getAllProductAttributesInfo_Out getAllProductAttributesInfo(java.lang.String productType, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of product attributes exist
     */
    public de.epages.ws.producttype.stub.Type_existsProductAttribute_Out existsProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException;

    /**
     * delete a list of product attributes
     */
    public de.epages.ws.producttype.stub.Type_deleteProductAttribute_Out deleteProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException;

    /**
     * update a list of product attributes
     */
    public de.epages.ws.producttype.stub.Type_updateProductAttribute_Out updateProductAttribute(java.lang.String productType, de.epages.ws.producttype.model.TUpdateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException;

    /**
     * create a list of product attributes
     */
    public de.epages.ws.producttype.stub.Type_createProductAttribute_Out createProductAttribute(java.lang.String productType, de.epages.ws.producttype.model.TCreateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException;

    /**
     * get information about a list of predefined attributes
     */
    public de.epages.ws.producttype.stub.Type_getPreDefAttributeInfo_Out getPreDefAttributeInfo(java.lang.String productAttribute, java.lang.String[] preDefAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all predefined attibutes of a product
     * attribute
     */
    public de.epages.ws.producttype.stub.Type_getAllPreDefAttributesInfo_Out getAllPreDefAttributesInfo(java.lang.String productAttribute, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of predefined attributes exist
     */
    public de.epages.ws.producttype.stub.Type_existsPreDefAttribute_Out existsPreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * delete a list of predefined attributes
     */
    public de.epages.ws.producttype.stub.Type_deletePreDefAttribute_Out deletePreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * update a list of predefined attributes
     */
    public de.epages.ws.producttype.stub.Type_updatePreDefAttribute_Out updatePreDefAttribute(java.lang.String productAttribute, de.epages.ws.producttype.model.TUpdatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * create a list of predefined attributes
     */
    public de.epages.ws.producttype.stub.Type_createPreDefAttribute_Out createPreDefAttribute(java.lang.String productAttribute, de.epages.ws.producttype.model.TCreatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException;
}
