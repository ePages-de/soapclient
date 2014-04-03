package de.epages.ws.customer;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customer.stub.CustomerService;
import de.epages.ws.customer.stub.Port_Customer;

public interface CustomerServiceStubFactory {
    Port_Customer create(WebServiceConfiguration config, CustomerService service);
}
