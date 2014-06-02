package de.epages.ws.update;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.update.stub.Port_Update;
import de.epages.ws.update.stub.UpdateService;

public interface UpdateServiceStubFactory {

    Port_Update create(WebServiceConfiguration config, UpdateService service);

}
