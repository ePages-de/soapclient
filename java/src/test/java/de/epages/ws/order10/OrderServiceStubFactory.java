package de.epages.ws.order10;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.order10.stub.OrderService;
import de.epages.ws.order10.stub.Port_Order;

public interface OrderServiceStubFactory {
    Port_Order create(WebServiceConfiguration config, OrderService service);
}
