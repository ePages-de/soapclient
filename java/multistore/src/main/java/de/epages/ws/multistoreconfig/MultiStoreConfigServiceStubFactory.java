package de.epages.ws.multistoreconfig;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.multistoreconfig.stub.*;

public interface MultiStoreConfigServiceStubFactory {
    Port_MultiStoreConfig create(WebServiceConfiguration config, MultiStoreConfigService service);
}
