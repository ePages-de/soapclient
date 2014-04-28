package de.epages.ws.simpleprovisioning2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.simpleprovisioning2.stub.*;

public interface SimpleProvisioningServiceStubFactory {
    Port_SimpleProvisioning create(WebServiceConfiguration config, SimpleProvisioningService service);
}
