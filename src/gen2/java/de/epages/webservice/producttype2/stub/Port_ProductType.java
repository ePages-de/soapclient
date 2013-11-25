/**
 * Port_ProductType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.producttype2.stub;

public interface Port_ProductType extends java.rmi.Remote {

    /**
     * get the base product type
     */
    public java.lang.String getBaseProductType() throws java.rmi.RemoteException;

    /**
     * get information about a list of product types
     */
    public de.epages.webservice.producttype2.model.TGetInfo_Return[] getInfo(java.lang.String[] productTypes, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all product types
     */
    public de.epages.webservice.producttype2.model.TGetInfo_Return[] getAllInfo(java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of product types exist
     */
    public de.epages.webservice.producttype2.model.TExists_Return[] exists(java.lang.String[] productTypes) throws java.rmi.RemoteException;

    /**
     * delete a list of product types
     */
    public de.epages.webservice.producttype2.model.TDelete_Return[] delete(java.lang.String[] productTypes) throws java.rmi.RemoteException;

    /**
     * update a list of product types
     */
    public de.epages.webservice.producttype2.model.TUpdate_Return[] update(de.epages.webservice.producttype2.model.TUpdate_Input[] productTypes) throws java.rmi.RemoteException;

    /**
     * create new product types
     */
    public de.epages.webservice.producttype2.model.TCreate_Return[] create(de.epages.webservice.producttype2.model.TCreate_Input[] productTypes) throws java.rmi.RemoteException;

    /**
     * get information about a list of product attributes
     */
    public de.epages.webservice.producttype2.model.TGetProductAttributeInfo_Return[] getProductAttributeInfo(java.lang.String productType, java.lang.String[] productAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all product attibutes of a product type
     */
    public de.epages.webservice.producttype2.model.TGetProductAttributeInfo_Return[] getAllProductAttributesInfo(java.lang.String productType, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of product attributes exist
     */
    public de.epages.webservice.producttype2.model.TExistsProductAttribute_Return[] existsProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException;

    /**
     * delete a list of product attributes
     */
    public de.epages.webservice.producttype2.model.TDeleteProductAttribute_Return[] deleteProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException;

    /**
     * update a list of product attributes
     */
    public de.epages.webservice.producttype2.model.TUpdateProductAttribute_Return[] updateProductAttribute(java.lang.String productType, de.epages.webservice.producttype2.model.TUpdateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException;

    /**
     * create a list of product attributes
     */
    public de.epages.webservice.producttype2.model.TCreateProductAttribute_Return[] createProductAttribute(java.lang.String productType, de.epages.webservice.producttype2.model.TCreateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException;

    /**
     * get information about a list of predefined attributes
     */
    public de.epages.webservice.producttype2.model.TGetPreDefAttributeInfo_Return[] getPreDefAttributeInfo(java.lang.String productAttribute, java.lang.String[] preDefAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all predefined attibutes of a product
     * attribute
     */
    public de.epages.webservice.producttype2.model.TGetPreDefAttributeInfo_Return[] getAllPreDefAttributesInfo(java.lang.String productAttribute, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of predefined attributes exist
     */
    public de.epages.webservice.producttype2.model.TExistsPreDefAttribute_Return[] existsPreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * delete a list of predefined attributes
     */
    public de.epages.webservice.producttype2.model.TDeletePreDefAttribute_Return[] deletePreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * update a list of predefined attributes
     */
    public de.epages.webservice.producttype2.model.TUpdatePreDefAttribute_Return[] updatePreDefAttribute(java.lang.String productAttribute, de.epages.webservice.producttype2.model.TUpdatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * create a list of predefined attributes
     */
    public de.epages.webservice.producttype2.model.TCreatePreDefAttribute_Return[] createPreDefAttribute(java.lang.String productAttribute, de.epages.webservice.producttype2.model.TCreatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException;
}
