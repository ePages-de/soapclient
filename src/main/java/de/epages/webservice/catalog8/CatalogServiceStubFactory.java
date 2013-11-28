package de.epages.webservice.catalog8;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.catalog8.stub.CatalogService;
import de.epages.webservice.catalog8.stub.Port_Catalog;

public interface CatalogServiceStubFactory {
    Port_Catalog create(WebServiceConfiguration config, CatalogService service);
}
