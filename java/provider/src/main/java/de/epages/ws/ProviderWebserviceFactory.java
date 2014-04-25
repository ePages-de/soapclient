package de.epages.ws;

import de.epages.ws.featurepack.FeaturePackServiceClient;

public interface ProviderWebserviceFactory {

    FeaturePackServiceClient createFeaturePackServiceClient(WebServiceConfiguration config);
}
