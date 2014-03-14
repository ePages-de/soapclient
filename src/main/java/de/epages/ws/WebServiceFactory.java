package de.epages.ws;

import de.epages.ws.assignment.AssignmentServiceClient;
import de.epages.ws.basket.BasketServiceClient;
import de.epages.ws.catalog8.CatalogServiceClient;
import de.epages.ws.crossselling2.CrossSellingServiceClient;
import de.epages.ws.customer4.CustomerServiceClient;
import de.epages.ws.customergroup2.CustomerGroupServiceClient;
import de.epages.ws.order12.OrderServiceClient;
import de.epages.ws.orderdocument7.OrderDocumentServiceClient;
import de.epages.ws.pagecache.PageCacheServiceClient;
import de.epages.ws.paymentmethod.PaymentMethodServiceClient;
import de.epages.ws.pricelist2.PriceListServiceClient;
import de.epages.ws.pricelistassignment.PriceListAssignmentServiceClient;
import de.epages.ws.product11.ProductServiceClient;
import de.epages.ws.productbundle.ProductBundleServiceClient;
import de.epages.ws.producttype2.ProductTypeServiceClient;
import de.epages.ws.shippingmethod2.ShippingMethodServiceClient;

/**
 * Interface to the latest implementations of the epages6 webservices.
 */
public interface WebServiceFactory {

    AssignmentServiceClient createAssignmentServiceClient(WebServiceConfiguration config);

    BasketServiceClient createBasketServiceClient(WebServiceConfiguration config);

    CatalogServiceClient createCatalogServiceClient(WebServiceConfiguration config);

    CrossSellingServiceClient createCrossSellingServiceClient(WebServiceConfiguration config);

    CustomerServiceClient createCustomerServiceClient(WebServiceConfiguration config);

    CustomerGroupServiceClient createCustomerGroupServiceClient(WebServiceConfiguration config);

    OrderDocumentServiceClient createOrderDocumentServiceClient(WebServiceConfiguration config);

    OrderServiceClient createOrderServiceClient(WebServiceConfiguration config);

    PageCacheServiceClient createPageCacheServiceClient(WebServiceConfiguration config);

    PaymentMethodServiceClient createPaymentMethodServiceClient(WebServiceConfiguration config);

    PriceListAssignmentServiceClient createPriceListAssignmentServiceClient(WebServiceConfiguration config);

    PriceListServiceClient createPriceListServiceClient(WebServiceConfiguration config);

    ProductServiceClient createProductServiceClient(WebServiceConfiguration config);

    ProductBundleServiceClient createProductBundleServiceClient(WebServiceConfiguration config);

    ProductTypeServiceClient createProductTypeServiceClient(WebServiceConfiguration config);

    ShippingMethodServiceClient createShippingMethodServiceClient(WebServiceConfiguration config);

}
