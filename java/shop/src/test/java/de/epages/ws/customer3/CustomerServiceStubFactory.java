package de.epages.ws.customer3;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customer3.stub.CustomerService;
import de.epages.ws.customer3.stub.Port_Customer;

public interface CustomerServiceStubFactory {
    Port_Customer create(WebServiceConfiguration config, CustomerService service);
}
