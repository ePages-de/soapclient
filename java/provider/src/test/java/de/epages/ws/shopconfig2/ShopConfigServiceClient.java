package de.epages.ws.shopconfig2;

import de.epages.ws.shopconfig2.stub.*;

public interface ShopConfigServiceClient extends Port_ShopConfig {

    /**
     * creates a new shop with a given shop type and imports default
     * data
     */
    int create(TCreateShop createShopData);

    /**
     * deletes a shop from the store database
     */
    void delete(TShopRef shopRef);

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
    TInfoShop getInfo(TShopRef updateShopData);

    /**
     * returns information about all existing shops from the site
     * database
     */
    TInfoShop[] getAllInfo();

    /**
     * deletes a shop reference from the site database
     */
    void deleteShopRef(TShopRef shopRef);


}
