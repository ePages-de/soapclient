package de.epages.webservice;

import de.epages.webservice.assignment.AssignmentServiceClient;
import de.epages.webservice.assignment.AssignmentServiceClientImpl;
import de.epages.webservice.basket.BasketServiceClient;
import de.epages.webservice.basket.BasketServiceClientImpl;
import de.epages.webservice.catalog8.CatalogServiceClient;
import de.epages.webservice.catalog8.CatalogServiceClientImpl;
import de.epages.webservice.product11.ProductServiceClient;
import de.epages.webservice.product11.ProductServiceClientImpl;

public class WebServiceFactoryImpl implements WebServiceFactory {

    @Override
    public AssignmentServiceClient createAssignmentServiceClient(WebServiceConfiguration config) {
        return new AssignmentServiceClientImpl(config);
    }

    @Override
    public BasketServiceClient createBasketServiceClient(WebServiceConfiguration config) {
        return new BasketServiceClientImpl(config);
    }

    @Override
    public CatalogServiceClient createCatalogServiceClient(WebServiceConfiguration config) {
        return new CatalogServiceClientImpl(config);
    }

    @Override
    public ProductServiceClient createProductServiceClient(WebServiceConfiguration config) {
        return new ProductServiceClientImpl(config);
    }

}
