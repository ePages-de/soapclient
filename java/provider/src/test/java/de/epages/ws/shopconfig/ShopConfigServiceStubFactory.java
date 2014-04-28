package de.epages.ws.shopconfig;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shopconfig.stub.*;

public interface ShopConfigServiceStubFactory {
    Port_ShopConfig create(WebServiceConfiguration config, ShopConfigService service);
}
