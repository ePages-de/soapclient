package de.epages.WebServices.BasketService;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.BasketService.Stub.BasketService;
import de.epages.WebServices.BasketService.Stub.Bind_Basket_SOAPStub;

class BasketServiceStubFactoryImpl implements BasketServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(BasketServiceStubFactoryImpl.class);

    @Override
    public Bind_Basket_SOAPStub create(WebServiceConfiguration config, BasketServiceClient service) {
        log.info("address specified by wsdl: " + service.getport_BasketAddress());
        log.info("using web service Url: " + config.getWebserviceURL());
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
