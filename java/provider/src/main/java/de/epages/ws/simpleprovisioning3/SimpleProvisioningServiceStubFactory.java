package de.epages.ws.simpleprovisioning3;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.simpleprovisioning3.stub.*;

public interface SimpleProvisioningServiceStubFactory {
    Port_SimpleProvisioning create(WebServiceConfiguration config, SimpleProvisioningService service);
}
