package de.epages.ws.customer4;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customer4.stub.Bind_Customer_SOAPStub;
import de.epages.ws.customer4.stub.CustomerService;
import de.epages.ws.customer4.stub.Port_Customer;

final class CustomerServiceStubFactoryImpl implements CustomerServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(CustomerServiceStubFactoryImpl.class);

    @Override
    public Port_Customer create(WebServiceConfiguration config, CustomerService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
            try {
                Bind_Customer_SOAPStub stub = new Bind_Customer_SOAPStub(config.getWebserviceURL(), service);
                stub.setUsername(config.getUsername());
                stub.setPassword(config.getPassword());
                return stub;
            } catch (AxisFault e) {
                throw new RuntimeException(e);
            }
    }
    
}
