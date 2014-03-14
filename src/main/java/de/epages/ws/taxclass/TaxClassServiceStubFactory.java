package de.epages.ws.taxclass;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.taxclass.stub.Port_TaxClass;
import de.epages.ws.taxclass.stub.TaxClassService;

public interface TaxClassServiceStubFactory {

    Port_TaxClass create(WebServiceConfiguration config, TaxClassService service);

}
