package de.epages.ws;

import de.epages.ws.featurepack.FeaturePackServiceClient;
import de.epages.ws.featurepack.FeaturePackServiceClientImpl;
import de.epages.ws.shopconfig6.ShopConfigServiceClient;
import de.epages.ws.shopconfig6.ShopConfigServiceClientImpl;
import de.epages.ws.shopcount.ShopCountServiceClient;
import de.epages.ws.shopcount.ShopCountServiceClientImpl;
import de.epages.ws.simpleprovisioning.SimpleProvisioningServiceClient;
import de.epages.ws.simpleprovisioning.SimpleProvisioningServiceClientImpl;

public class ProviderWebserviceFactoryImpl implements ProviderWebserviceFactory {

    @Override
    public FeaturePackServiceClient createFeaturePackServiceClient(WebServiceConfiguration config) {
        return new FeaturePackServiceClientImpl(config);
    }

    @Override
    public SimpleProvisioningServiceClient createSimpleProvisioningServiceClient(WebServiceConfiguration config) {
        return new SimpleProvisioningServiceClientImpl(config);
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
