package de.epages.ws.simpleprovisioning2;

import de.epages.ws.simpleprovisioning2.stub.*;

public interface SimpleProvisioningServiceClient extends Port_SimpleProvisioning {

    /**
     * creates a new shop with a given shop type and imports default
     * data
     */
    void create(TCreateShop createShopData);

    /**
     * marks a shop for deletion
     */
    void markForDeletion(TShopRef shopRef);

    /**
     * returns true if the shop alias exists for the provider
     */
    boolean exists(TShopRef shopRef);

    /**
     * updates an existing shop in the site and store database
     */
    void update(TUpdateShop shopData);

    /**
     * returns information about an existing shop from the site database
     */
    TInfoShop getInfo(TShopRef shopRef);

    /**
     * change the alias of an existing shop
     */
    void rename(TRename_Input shopInfo);

}
