package de.epages.ws;

import de.epages.ws.featurepack.FeaturePackServiceClient;
import de.epages.ws.shopconfig6.ShopConfigServiceClient;
import de.epages.ws.shopcount.ShopCountServiceClient;
import de.epages.ws.simpleprovisioning.SimpleProvisioningServiceClient;

public interface ProviderWebserviceFactory {

    FeaturePackServiceClient createFeaturePackServiceClient(WebServiceConfiguration config);

    SimpleProvisioningServiceClient createSimpleProvisioningServiceClient(WebServiceConfiguration config);

    ShopConfigServiceClient createShopConfigServiceClient(WebServiceConfiguration config);

    ShopCountServiceClient createShopCountServiceClient(WebServiceConfiguration config);
}
