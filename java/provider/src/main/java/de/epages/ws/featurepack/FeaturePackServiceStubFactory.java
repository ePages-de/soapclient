package de.epages.ws.featurepack;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.featurepack.stub.*;

public interface FeaturePackServiceStubFactory {
    Port_FeaturePack create(WebServiceConfiguration config, FeaturePackService service);
}
