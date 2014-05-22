package de.epages.ws.multistoreconfig;

import de.epages.ws.multistoreconfig.stub.*;

public interface MultiStoreConfigServiceClient extends Port_MultiStoreConfig {

    /**
     * creates a subshop to mastershop relation
     */
    void assignSubShopToMasterShop(TAssignSubShopToMasterShop assignSubShopToMasterShopData);

    /**
     * deletes a subshop to mastershop relation
     */
    void unassignSubShopFromMasterShop(TShopRef shopRef);

    /**
     * returns information about an existing mastershop including
     * a list of subshops
     */
    TInfoMultiStoreConfig getInfo(TShopRef shopInfo);


}
