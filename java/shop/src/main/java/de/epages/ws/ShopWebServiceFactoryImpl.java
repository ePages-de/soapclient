package de.epages.ws;

import de.epages.ws.assignment.AssignmentServiceClient;
import de.epages.ws.assignment.AssignmentServiceClientImpl;
import de.epages.ws.basket.BasketServiceClient;
import de.epages.ws.basket.BasketServiceClientImpl;
import de.epages.ws.catalog8.CatalogServiceClient;
import de.epages.ws.catalog8.CatalogServiceClientImpl;
import de.epages.ws.crossselling2.CrossSellingServiceClient;
import de.epages.ws.crossselling2.CrossSellingServiceClientImpl;
import de.epages.ws.customer5.CustomerServiceClient;
import de.epages.ws.customer5.CustomerServiceClientImpl;
import de.epages.ws.customergroup2.CustomerGroupServiceClient;
import de.epages.ws.customergroup2.CustomerGroupServiceClientImpl;
import de.epages.ws.order12.OrderServiceClient;
import de.epages.ws.order12.OrderServiceClientImpl;
import de.epages.ws.orderdocument7.OrderDocumentServiceClient;
import de.epages.ws.orderdocument7.OrderDocumentServiceClientImpl;
import de.epages.ws.pagecache.PageCacheServiceClient;
import de.epages.ws.pagecache.PageCacheServiceClientImpl;
import de.epages.ws.paymentmethod.PaymentMethodServiceClient;
import de.epages.ws.paymentmethod.PaymentMethodServiceClientImpl;
import de.epages.ws.pricelist2.PriceListServiceClient;
import de.epages.ws.pricelist2.PriceListServiceClientImpl;
import de.epages.ws.pricelistassignment.PriceListAssignmentServiceClient;
import de.epages.ws.pricelistassignment.PriceListAssignmentServiceClientImpl;
import de.epages.ws.product11.ProductServiceClient;
import de.epages.ws.product11.ProductServiceClientImpl;
import de.epages.ws.productbundle.ProductBundleServiceClient;
import de.epages.ws.productbundle.ProductBundleServiceClientImpl;
import de.epages.ws.producttype2.ProductTypeServiceClient;
import de.epages.ws.producttype2.ProductTypeServiceClientImpl;
import de.epages.ws.shippingmethod2.ShippingMethodServiceClient;
import de.epages.ws.shippingmethod2.ShippingMethodServiceClientImpl;
import de.epages.ws.update.UpdateServiceClient;
import de.epages.ws.update.UpdateServiceClientImpl;
import de.epages.ws.user6.UserServiceClient;
import de.epages.ws.user6.UserServiceClientImpl;

public class ShopWebServiceFactoryImpl implements ShopWebServiceFactory {

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
    public CrossSellingServiceClient createCrossSellingServiceClient(WebServiceConfiguration config) {
        return new CrossSellingServiceClientImpl(config);
    }

    @Override
    public CustomerServiceClient createCustomerServiceClient(WebServiceConfiguration config) {
        return new CustomerServiceClientImpl(config);
    }

    @Override
    public CustomerGroupServiceClient createCustomerGroupServiceClient(WebServiceConfiguration config) {
        return new CustomerGroupServiceClientImpl(config);
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
    public PageCacheServiceClient createPageCacheServiceClient(WebServiceConfiguration config) {
        return new PageCacheServiceClientImpl(config);
    }

    @Override
    public PaymentMethodServiceClient createPaymentMethodServiceClient(WebServiceConfiguration config) {
        return new PaymentMethodServiceClientImpl(config);
    }

    @Override
    public PriceListAssignmentServiceClient createPriceListAssignmentServiceClient(WebServiceConfiguration config) {
        return new PriceListAssignmentServiceClientImpl(config);

    }

    @Override
    public PriceListServiceClient createPriceListServiceClient(WebServiceConfiguration config) {
        return new PriceListServiceClientImpl(config);
    }

    @Override
    public ProductServiceClient createProductServiceClient(WebServiceConfiguration config) {
        return new ProductServiceClientImpl(config);
    }

    @Override
    public ProductBundleServiceClient createProductBundleServiceClient(WebServiceConfiguration config) {
        return new ProductBundleServiceClientImpl(config);
    }

    @Override
    public ProductTypeServiceClient createProductTypeServiceClient(WebServiceConfiguration config) {
        return new ProductTypeServiceClientImpl(config);
    }

    @Override
    public ShippingMethodServiceClient createShippingMethodServiceClient(WebServiceConfiguration config) {
        return new ShippingMethodServiceClientImpl(config);
    }

    @Override
    public UpdateServiceClient createUpdateServiceClient(WebServiceConfiguration config) {
        return new UpdateServiceClientImpl(config);
    }

    @Override
    public UserServiceClient createUserServiceClient(WebServiceConfiguration config) {
        return new UserServiceClientImpl(config);
    }

}
