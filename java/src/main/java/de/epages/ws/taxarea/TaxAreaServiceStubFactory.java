package de.epages.ws.taxarea;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.taxarea.stub.Port_TaxArea;
import de.epages.ws.taxarea.stub.TaxAreaService;

public interface TaxAreaServiceStubFactory {

    Port_TaxArea create(WebServiceConfiguration config, TaxAreaService service);

}
