package de.epages.ws.order6;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.order6.stub.OrderService;
import de.epages.ws.order6.stub.Port_Order;

public interface OrderServiceStubFactory {
    Port_Order create(WebServiceConfiguration config, OrderService service);
}
