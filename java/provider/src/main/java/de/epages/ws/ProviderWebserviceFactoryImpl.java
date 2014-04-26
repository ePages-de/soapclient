package de.epages.ws;

import de.epages.ws.featurepack.FeaturePackServiceClient;
import de.epages.ws.featurepack.FeaturePackServiceClientImpl;
import de.epages.ws.shopconfig6.ShopConfigServiceClient;
import de.epages.ws.shopconfig6.ShopConfigServiceClientImpl;
import de.epages.ws.shopcount.ShopCountServiceClient;
import de.epages.ws.shopcount.ShopCountServiceClientImpl;

public class ProviderWebserviceFactoryImpl implements ProviderWebserviceFactory {

    @Override
    public FeaturePackServiceClient createFeaturePackServiceClient(WebServiceConfiguration config) {
        return new FeaturePackServiceClientImpl(config);
    }

    @Override
    public ShopConfigServiceClient createShopConfigServiceClient(WebServiceConfiguration config) {
        return new ShopConfigServiceClientImpl(config);
    }

    @Override
    public ShopCountServiceClient createShopCountServiceClient(WebServiceConfiguration config) {
        return new ShopCountServiceClientImpl(config);
    }
}
