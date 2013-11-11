/**
 * Port_ProductType_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductTypeService.Stub;

public interface Port_ProductType_PortType extends java.rmi.Remote {

    /**
     * get the base product type
     */
    public java.lang.String getBaseProductType() throws java.rmi.RemoteException;

    /**
     * get information about a list of product types
     */
    public de.epages.WebServices.ProductTypeService.Stub.TGetInfo_Return[] getInfo(java.lang.String[] productTypes, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all product types
     */
    public de.epages.WebServices.ProductTypeService.Stub.TGetInfo_Return[] getAllInfo(java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of product types exist
     */
    public de.epages.WebServices.ProductTypeService.Stub.TExists_Return[] exists(java.lang.String[] productTypes) throws java.rmi.RemoteException;

    /**
     * delete a list of product types
     */
    public de.epages.WebServices.ProductTypeService.Stub.TDelete_Return[] delete(java.lang.String[] productTypes) throws java.rmi.RemoteException;

    /**
     * update a list of product types
     */
    public de.epages.WebServices.ProductTypeService.Stub.TUpdate_Return[] update(de.epages.WebServices.ProductTypeService.Stub.TUpdate_Input[] productTypes) throws java.rmi.RemoteException;

    /**
     * create new product types
     */
    public de.epages.WebServices.ProductTypeService.Stub.TCreate_Return[] create(de.epages.WebServices.ProductTypeService.Stub.TCreate_Input[] productTypes) throws java.rmi.RemoteException;

    /**
     * get information about a list of product attributes
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_getProductAttributeInfo_Out getProductAttributeInfo(java.lang.String productType, java.lang.String[] productAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all product attibutes of a product type
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_getAllProductAttributesInfo_Out getAllProductAttributesInfo(java.lang.String productType, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of product attributes exist
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_existsProductAttribute_Out existsProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException;

    /**
     * delete a list of product attributes
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_deleteProductAttribute_Out deleteProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException;

    /**
     * update a list of product attributes
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_updateProductAttribute_Out updateProductAttribute(java.lang.String productType, de.epages.WebServices.ProductTypeService.Stub.TUpdateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException;

    /**
     * create a list of product attributes
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_createProductAttribute_Out createProductAttribute(java.lang.String productType, de.epages.WebServices.ProductTypeService.Stub.TCreateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException;

    /**
     * get information about a list of predefined attributes
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_getPreDefAttributeInfo_Out getPreDefAttributeInfo(java.lang.String productAttribute, java.lang.String[] preDefAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all predefined attibutes of a product
     * attribute
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_getAllPreDefAttributesInfo_Out getAllPreDefAttributesInfo(java.lang.String productAttribute, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of predefined attributes exist
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_existsPreDefAttribute_Out existsPreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * delete a list of predefined attributes
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_deletePreDefAttribute_Out deletePreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * update a list of predefined attributes
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_updatePreDefAttribute_Out updatePreDefAttribute(java.lang.String productAttribute, de.epages.WebServices.ProductTypeService.Stub.TUpdatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * create a list of predefined attributes
     */
    public de.epages.WebServices.ProductTypeService.Stub.Type_createPreDefAttribute_Out createPreDefAttribute(java.lang.String productAttribute, de.epages.WebServices.ProductTypeService.Stub.TCreatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException;
}
