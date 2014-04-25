package de.epages.ws;

import de.epages.ws.featurepack.FeaturePackServiceClient;
import de.epages.ws.featurepack.FeaturePackServiceClientImpl;

public class ProviderWebserviceFactoryImpl implements ProviderWebserviceFactory {

    @Override
    public FeaturePackServiceClient createFeaturePackServiceClient(WebServiceConfiguration config) {
        return new FeaturePackServiceClientImpl(config);
    }
}
