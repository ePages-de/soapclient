package de.epages.ws.catalog6;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.catalog6.stub.CatalogService;
import de.epages.ws.catalog6.stub.Port_Catalog;

public interface CatalogServiceStubFactory {
    Port_Catalog create(WebServiceConfiguration config, CatalogService service);
}
