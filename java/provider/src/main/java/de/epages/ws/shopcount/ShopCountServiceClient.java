package de.epages.ws.shopcount;

import de.epages.ws.shopcount.stub.*;

public interface ShopCountServiceClient extends Port_ShopCount {

    /**
     * Returns the number of shops of a provider, filtered by shop
     * type, database and flags.
     */
    int getCount(Type_GetCount_In filter);

    /**
     * Returns the number of shops of a provider from all databases.
     * Deleted shops and internal test shops are not included.
     */
    TShopCount[] getAllCounts();

}
