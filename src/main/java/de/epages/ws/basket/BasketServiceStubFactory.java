package de.epages.ws.basket;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.basket.stub.BasketService;
import de.epages.ws.basket.stub.Port_Basket;

public interface BasketServiceStubFactory {
    Port_Basket create(WebServiceConfiguration config, BasketService service);
}
