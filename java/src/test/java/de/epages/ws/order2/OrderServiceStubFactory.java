package de.epages.ws.order2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.order2.stub.OrderService;
import de.epages.ws.order2.stub.Port_Order;

public interface OrderServiceStubFactory {
    Port_Order create(WebServiceConfiguration config, OrderService service);
}
