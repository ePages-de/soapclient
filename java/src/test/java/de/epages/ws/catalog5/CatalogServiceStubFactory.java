package de.epages.ws.catalog5;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.catalog5.stub.CatalogService;
import de.epages.ws.catalog5.stub.Port_Catalog;

public interface CatalogServiceStubFactory {
    Port_Catalog create(WebServiceConfiguration config, CatalogService service);
}
