package de.epages.ws.customer4;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customer4.stub.CustomerService;
import de.epages.ws.customer4.stub.Port_Customer;

public interface CustomerServiceStubFactory {
    Port_Customer create(WebServiceConfiguration config, CustomerService service);
}
