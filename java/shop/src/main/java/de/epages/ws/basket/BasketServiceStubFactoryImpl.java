package de.epages.ws.basket;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.basket.stub.BasketService;
import de.epages.ws.basket.stub.Bind_Basket_SOAPStub;
import de.epages.ws.basket.stub.Port_Basket;

final class BasketServiceStubFactoryImpl implements BasketServiceStubFactory {

    @Override
    public Port_Basket create(WebServiceConfiguration config, BasketService service) {

        try {
            Bind_Basket_SOAPStub stub = (Bind_Basket_SOAPStub) service.getport_Basket(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
