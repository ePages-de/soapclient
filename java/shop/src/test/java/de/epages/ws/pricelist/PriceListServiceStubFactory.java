package de.epages.ws.pricelist;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pricelist.stub.Port_PriceList;
import de.epages.ws.pricelist.stub.PriceListService;

public interface PriceListServiceStubFactory {
    Port_PriceList create(WebServiceConfiguration config, PriceListService service);
}
