package de.epages.ws.order;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.order.stub.OrderService;
import de.epages.ws.order.stub.Port_Order;

public interface OrderServiceStubFactory {
    Port_Order create(WebServiceConfiguration config, OrderService service);
}
