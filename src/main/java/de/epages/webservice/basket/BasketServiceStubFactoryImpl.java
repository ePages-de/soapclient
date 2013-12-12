package de.epages.webservice.basket;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.basket.stub.BasketService;
import de.epages.webservice.basket.stub.Bind_Basket_SOAPStub;
import de.epages.webservice.basket.stub.Port_Basket;

final class BasketServiceStubFactoryImpl implements BasketServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(BasketServiceStubFactoryImpl.class);

    @Override
    public Port_Basket create(WebServiceConfiguration config, BasketService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_Basket_SOAPStub stub = new Bind_Basket_SOAPStub(config.getWebserviceURL(), service);
            stub.setUsername(config.getUsername());
            stub.setPassword(config.getPassword());
            return stub;
        } catch (AxisFault e) {
            throw new RuntimeException(e);
        }
    }

}
