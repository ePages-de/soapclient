/**
 * Port_FeaturePack.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.featurepack.stub;

public interface Port_FeaturePack extends java.rmi.Remote {

    /**
     * get information about a list of featurepacks
     */
    public de.epages.ws.featurepack.model.TGetInfo_Return[] getInfo(java.lang.String[] featurePacks, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of featurepacks exist.
     */
    public de.epages.ws.featurepack.model.TExists_Return[] exists(java.lang.String[] featurePacks) throws java.rmi.RemoteException;

    /**
     * delete a list of featurepacks
     */
    public de.epages.ws.featurepack.model.TDelete_Return[] delete(java.lang.String[] featurePacks) throws java.rmi.RemoteException;

    /**
     * update a list of featurepacks
     */
    public de.epages.ws.featurepack.model.TUpdate_Return[] update(de.epages.ws.featurepack.model.TUpdate_Input[] featurePacks) throws java.rmi.RemoteException;

    /**
     * create new featurepacks
     */
    public de.epages.ws.featurepack.model.TCreate_Return[] create(de.epages.ws.featurepack.model.TCreate_Input[] featurePacks) throws java.rmi.RemoteException;

    /**
     * add shop types to the list of shop types the feature pack is
     * available for.
     */
    public de.epages.ws.featurepack.model.TAddShopType_Return[] addShopType(de.epages.ws.featurepack.model.TAddShopType_Input[] featurePacks) throws java.rmi.RemoteException;

    /**
     * remove shop types from the list of shop types the feature pack
     * is available for.
     */
    public de.epages.ws.featurepack.model.TRemoveShopType_Return[] removeShopType(de.epages.ws.featurepack.model.TRemoveShopType_Input[] featurePacks) throws java.rmi.RemoteException;

    /**
     * apply feature pack to a shop.
     */
    public de.epages.ws.featurepack.model.TApplyToShop_Return[] applyToShop(de.epages.ws.featurepack.model.TApplyToShop_Input[] featurePacks) throws java.rmi.RemoteException;

    /**
     * update feature values and apply changes to all shops the feature
     * pack is applied for.
     */
    public de.epages.ws.featurepack.model.TApplyToAllShops_Return[] applyToAllShops(de.epages.ws.featurepack.model.TApplyToAllShops_Input[] featurePacks) throws java.rmi.RemoteException;

    /**
     * remove feature pack from a shop.
     */
    public de.epages.ws.featurepack.model.TRemoveFromShop_Return[] removeFromShop(de.epages.ws.featurepack.model.TRemoveFromShop_Input[] featurePacks) throws java.rmi.RemoteException;
}
