package de.epages.ws;

import de.epages.ws.featurepack.FeaturePackServiceClient;
import de.epages.ws.shopconfig6.ShopConfigServiceClient;
import de.epages.ws.shopcount.ShopCountServiceClient;

public interface ProviderWebserviceFactory {

    FeaturePackServiceClient createFeaturePackServiceClient(WebServiceConfiguration config);

    ShopConfigServiceClient createShopConfigServiceClient(WebServiceConfiguration config);

    ShopCountServiceClient createShopCountServiceClient(WebServiceConfiguration config);
}
