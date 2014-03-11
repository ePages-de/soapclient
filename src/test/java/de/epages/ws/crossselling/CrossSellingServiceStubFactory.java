package de.epages.ws.crossselling;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.crossselling.stub.CrossSellingService;
import de.epages.ws.crossselling.stub.Port_CrossSelling;

public interface CrossSellingServiceStubFactory {
    Port_CrossSelling create(WebServiceConfiguration config, CrossSellingService service);
}
