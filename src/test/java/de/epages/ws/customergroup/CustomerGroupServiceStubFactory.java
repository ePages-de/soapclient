package de.epages.ws.customergroup;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customergroup.stub.CustomerGroupService;
import de.epages.ws.customergroup.stub.Port_CustomerGroup;

public interface CustomerGroupServiceStubFactory {
    Port_CustomerGroup create(WebServiceConfiguration config, CustomerGroupService service);
}
