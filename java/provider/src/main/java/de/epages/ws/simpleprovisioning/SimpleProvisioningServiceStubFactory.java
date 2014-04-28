package de.epages.ws.simpleprovisioning;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.simpleprovisioning.stub.*;

public interface SimpleProvisioningServiceStubFactory {
    Port_SimpleProvisioning create(WebServiceConfiguration config, SimpleProvisioningService service);
}
