package de.epages.ws.pricelist2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pricelist2.stub.Port_PriceList;
import de.epages.ws.pricelist2.stub.PriceListService;

public interface PriceListServiceStubFactory {
    Port_PriceList create(WebServiceConfiguration config, PriceListService service);
}
