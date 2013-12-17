package de.epages.ws.order12;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.order12.stub.Bind_Order_SOAPStub;
import de.epages.ws.order12.stub.OrderService;
import de.epages.ws.order12.stub.Port_Order;

final class OrderServiceStubFactoryImpl implements OrderServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(OrderServiceStubFactoryImpl.class);

    @Override
    public Port_Order create(WebServiceConfiguration config, OrderService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
            try {
                Bind_Order_SOAPStub stub = new Bind_Order_SOAPStub(config.getWebserviceURL(), service);
                stub.setUsername(config.getUsername());
                stub.setPassword(config.getPassword());
                return stub;
            } catch (AxisFault e) {
                throw new RuntimeException(e);
            }
    }
    
}
