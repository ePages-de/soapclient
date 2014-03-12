package de.epages.ws.crossselling2;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.crossselling2.stub.CrossSellingService;
import de.epages.ws.crossselling2.stub.Port_CrossSelling;

public interface CrossSellingServiceStubFactory {
    Port_CrossSelling create(WebServiceConfiguration config, CrossSellingService service);
}
