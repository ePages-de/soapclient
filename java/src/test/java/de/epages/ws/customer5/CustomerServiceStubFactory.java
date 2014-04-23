package de.epages.ws.customer5;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customer5.stub.CustomerService;
import de.epages.ws.customer5.stub.Port_Customer;

public interface CustomerServiceStubFactory {
    Port_Customer create(WebServiceConfiguration config, CustomerService service);
}
