package de.epages.ws;

import de.epages.ws.assignment.AssignmentServiceClient;
import de.epages.ws.assignment.AssignmentServiceClientImpl;
import de.epages.ws.basket.BasketServiceClient;
import de.epages.ws.basket.BasketServiceClientImpl;
import de.epages.ws.catalog8.CatalogServiceClient;
import de.epages.ws.catalog8.CatalogServiceClientImpl;
import de.epages.ws.customer4.CustomerServiceClient;
import de.epages.ws.customer4.CustomerServiceClientImpl;
import de.epages.ws.order9.OrderServiceClient;
import de.epages.ws.order9.OrderServiceClientImpl;
import de.epages.ws.product11.ProductServiceClient;
import de.epages.ws.product11.ProductServiceClientImpl;

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

    @Override
    public CustomerServiceClient createCustomerServiceClient(WebServiceConfiguration config) {
        return new CustomerServiceClientImpl(config);
    }

    @Override
    public OrderServiceClient createOrderServiceClient(WebServiceConfiguration config) {
        return new OrderServiceClientImpl(config);
    }

}
