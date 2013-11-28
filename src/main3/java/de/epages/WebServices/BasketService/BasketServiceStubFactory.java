package de.epages.WebServices.BasketService;

import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.BasketService.Stub.BasketService;
import de.epages.WebServices.BasketService.Stub.Bind_Basket_SOAPStub;

public interface BasketServiceStubFactory {
    Bind_Basket_SOAPStub create(WebServiceConfiguration config, BasketServiceClient service);
}
