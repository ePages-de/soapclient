package de.epages.ws.multistoremaster;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.multistoremaster.stub.*;

public interface MultiStoreMasterServiceStubFactory {
    Port_MultiStoreMaster create(WebServiceConfiguration config, MultiStoreMasterService service);
}
