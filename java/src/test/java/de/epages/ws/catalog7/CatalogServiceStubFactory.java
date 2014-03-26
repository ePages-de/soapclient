package de.epages.ws.catalog7;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.catalog7.stub.CatalogService;
import de.epages.ws.catalog7.stub.Port_Catalog;

public interface CatalogServiceStubFactory {
    Port_Catalog create(WebServiceConfiguration config, CatalogService service);
}
