package de.epages.ws.catalog;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.catalog.stub.CatalogService;
import de.epages.ws.catalog.stub.Port_Catalog;

public interface CatalogServiceStubFactory {
    Port_Catalog create(WebServiceConfiguration config, CatalogService service);
}
