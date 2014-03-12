package de.epages.ws.customergroup2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customergroup2.stub.CustomerGroupService;
import de.epages.ws.customergroup2.stub.Port_CustomerGroup;

public interface CustomerGroupServiceStubFactory {
    Port_CustomerGroup create(WebServiceConfiguration config, CustomerGroupService service);
}
