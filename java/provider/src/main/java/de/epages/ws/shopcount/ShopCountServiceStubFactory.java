package de.epages.ws.shopcount;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shopcount.stub.*;

public interface ShopCountServiceStubFactory {
    Port_ShopCount create(WebServiceConfiguration config, ShopCountService service);
}
