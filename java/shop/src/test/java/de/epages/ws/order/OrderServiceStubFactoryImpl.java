package de.epages.ws.order;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.order.stub.Bind_Order_SOAPStub;
import de.epages.ws.order.stub.OrderService;
import de.epages.ws.order.stub.Port_Order;

final class OrderServiceStubFactoryImpl implements OrderServiceStubFactory {



    @Override
    public Port_Order create(WebServiceConfiguration config, OrderService service) {
        
        try {
            Bind_Order_SOAPStub stub = (Bind_Order_SOAPStub) service.getport_Order(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
