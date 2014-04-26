package de.epages.ws.featurepack;

import de.epages.ws.featurepack.model.*;
import de.epages.ws.featurepack.stub.*;

public interface FeaturePackServiceClient extends Port_FeaturePack {

    /**
     * get information about a list of featurepacks
     */
    TGetInfo_Return[] getInfo(String[] featurePacks, String[] attributes, String[] languageCodes);

    /**
     * check if a list of featurepacks exist.
     */
    TExists_Return[] exists(String[] featurePacks);

    /**
     * delete a list of featurepacks
     */
    TDelete_Return[] delete(String[] featurePacks);

    /**
     * update a list of featurepacks
     */
    TUpdate_Return[] update(TUpdate_Input[] featurePacks);

    /**
     * create new featurepacks
     */
    TCreate_Return[] create(TCreate_Input[] featurePacks);

    /**
     * add shop types to the list of shop types the feature pack is
     * available for.
     */
    TAddShopType_Return[] addShopType(TAddShopType_Input[] featurePacks);

    /**
     * remove shop types from the list of shop types the feature pack
     * is available for.
     */
    TRemoveShopType_Return[] removeShopType(TRemoveShopType_Input[] featurePacks);

    /**
     * apply feature pack to a shop.
     */
    TApplyToShop_Return[] applyToShop(TApplyToShop_Input[] featurePacks);

    /**
     * update feature values and apply changes to all shops the feature
     * pack is applied for.
     */
    TApplyToAllShops_Return[] applyToAllShops(TApplyToAllShops_Input[] featurePacks);

    /**
     * remove feature pack from a shop.
     */
    TRemoveFromShop_Return[] removeFromShop(TRemoveFromShop_Input[] featurePacks);

}
