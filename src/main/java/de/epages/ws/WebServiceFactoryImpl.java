package de.epages.ws;

import de.epages.ws.assignment.AssignmentServiceClient;
import de.epages.ws.assignment.AssignmentServiceClientImpl;
import de.epages.ws.basket.BasketServiceClient;
import de.epages.ws.basket.BasketServiceClientImpl;
import de.epages.ws.catalog8.CatalogServiceClient;
import de.epages.ws.catalog8.CatalogServiceClientImpl;
import de.epages.ws.crossselling2.CrossSellingServiceClientImpl;
import de.epages.ws.crossselling2.CrossSellingServiceClient;
import de.epages.ws.customer4.CustomerServiceClient;
import de.epages.ws.customer4.CustomerServiceClientImpl;
import de.epages.ws.order12.OrderServiceClient;
import de.epages.ws.order12.OrderServiceClientImpl;
import de.epages.ws.orderdocument7.OrderDocumentServiceClient;
import de.epages.ws.orderdocument7.OrderDocumentServiceClientImpl;
import de.epages.ws.product11.ProductServiceClient;
import de.epages.ws.product11.ProductServiceClientImpl;
import de.epages.ws.shippingmethod2.ShippingMethodServiceClient;
import de.epages.ws.shippingmethod2.ShippingMethodServiceClientImpl;

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
    public CustomerServiceClient createCustomerServiceClient(WebServiceConfiguration config) {
        return new CustomerServiceClientImpl(config);
    }

    @Override
    public OrderDocumentServiceClient createOrderDocumentServiceClient(WebServiceConfiguration config) {
        return new OrderDocumentServiceClientImpl(config);
    }

    @Override
    public OrderServiceClient createOrderServiceClient(WebServiceConfiguration config) {
        return new OrderServiceClientImpl(config);
    }

    @Override
    public ProductServiceClient createProductServiceClient(WebServiceConfiguration config) {
        return new ProductServiceClientImpl(config);
    }

    @Override
    public ShippingMethodServiceClient createShippingMethodServiceClient(WebServiceConfiguration config) {
        return new ShippingMethodServiceClientImpl(config);
    }

    @Override
    public CrossSellingServiceClient createCrossSellingServiceClient(WebServiceConfiguration config) {
        return new CrossSellingServiceClientImpl(config);
    }
}
