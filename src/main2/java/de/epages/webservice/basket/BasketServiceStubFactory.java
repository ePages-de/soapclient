package de.epages.webservice.basket;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.basket.stub.BasketService;
import de.epages.webservice.basket.stub.Bind_Basket_SOAPStub;

public interface BasketServiceStubFactory {
    Bind_Basket_SOAPStub create(WebServiceConfiguration config, BasketService service);
}
