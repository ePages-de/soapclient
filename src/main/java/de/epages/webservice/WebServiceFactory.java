package de.epages.webservice;

import de.epages.webservice.assignment.AssignmentServiceClient;
import de.epages.webservice.basket.BasketServiceClient;
import de.epages.webservice.catalog8.CatalogServiceClient;
import de.epages.webservice.product11.ProductServiceClient;

/**
 * Interface to the latest implementations of the epages6 webservices.
 */
public interface WebServiceFactory {

    AssignmentServiceClient createAssignmentServiceClient(WebServiceConfiguration config);

    BasketServiceClient createBasketServiceClient(WebServiceConfiguration config);

    CatalogServiceClient createCatalogServiceClient(WebServiceConfiguration config);

    ProductServiceClient createProductServiceClient(WebServiceConfiguration config);

}
