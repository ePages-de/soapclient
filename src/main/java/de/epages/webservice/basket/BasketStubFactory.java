package de.epages.webservice.basket;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.basket.stub.BasketService;
import de.epages.webservice.basket.stub.Port_Basket;

public interface BasketStubFactory {
    Port_Basket create(WebServiceConfiguration config, BasketService service);
}
