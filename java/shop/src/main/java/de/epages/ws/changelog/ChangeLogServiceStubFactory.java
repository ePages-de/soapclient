package de.epages.ws.changelog;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.changelog.stub.ChangeLogService;
import de.epages.ws.changelog.stub.Port_ChangeLog;

public interface ChangeLogServiceStubFactory {

    Port_ChangeLog create(WebServiceConfiguration config, ChangeLogService service);

}
