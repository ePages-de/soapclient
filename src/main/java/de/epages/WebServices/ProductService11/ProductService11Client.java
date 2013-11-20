package de.epages.WebServices.ProductService11;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.WebServices.ErrorHandler;
import de.epages.WebServices.ThrowingErrorHandler;
import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.ProductService11.Stub.Bind_Product_SOAPStub;
import de.epages.WebServices.ProductService11.Stub.ProductService;
import de.epages.WebServices.ProductService11.Stub.ProductServiceLocator;
import de.epages.WebServices.ProductService11.Stub.TCreate_Input;
import de.epages.WebServices.ProductService11.Stub.TCreate_Return;
import de.epages.WebServices.ProductService11.Stub.TDelete_Return;
import de.epages.WebServices.ProductService11.Stub.TExists_Return;
import de.epages.WebServices.ProductService11.Stub.TFind_Input;
import de.epages.WebServices.ProductService11.Stub.TGetInfo_Return;
import de.epages.WebServices.ProductService11.Stub.TUpdate_Input;
import de.epages.WebServices.ProductService11.Stub.TUpdate_Return;

public class ProductService11Client {
    private final ProductService service = new ProductServiceLocator();
    private final Bind_Product_SOAPStub stub;
    private final ErrorHandler errorHandler;

    private static final Logger log = LoggerFactory.getLogger(ProductService11Client.class);

    public ProductService11Client(final WebServiceConfiguration config) {
        this(config, new ThrowingErrorHandler());
    }

    public ProductService11Client(WebServiceConfiguration config, ErrorHandler errorHandler) {
        this(config, errorHandler, new ProductService11StubFactoryImpl());
    }

    public ProductService11Client(WebServiceConfiguration config, ErrorHandler errorHandler, ProductService11StubFactory factory) {
        this.stub = factory.create(config, service);
        this.errorHandler = errorHandler;
    }

    public List<TGetInfo_Return> getProductInfo(String[] paths) throws RemoteException {
        return getProductInfo(paths, new String[]{});
    }

    public List<TGetInfo_Return> getProductInfo(String[] paths, String[] attributes) throws RemoteException {
        return getProductInfo(paths, attributes, new String[]{});
    }
    /**
     * Gets information about a list of Products.
     * If there is an error with a single Product, then this Product will be skipped and
     * it will be not part of there result list.
     *
     * @param paths         list of Product paths
     * @param attributes    list of Product paths
     * @return              list of TGetInfo_Return
     * @throws              RemoteException
     * @see                 TGetInfo_Return
     */
    public List<TGetInfo_Return> getProductInfo(String[] paths, String[] attributes, String[] languages) throws RemoteException {
        log.info("getProductInfo called");
        TGetInfo_Return[] products = stub.getInfo(paths, attributes, languages);
        List<TGetInfo_Return> result = new ArrayList<>(products.length);

        for (int i = 0; i < products.length; i++) {
            TGetInfo_Return product = products[i];

            if (product.getError() == null) {
                log.info("successfully retrieved Product: " + product.getAlias());
                result.add(product);
            } else {
                errorHandler.handle(product, product.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Creates a list of Products with the given data.
     * If there is an error with a single Product, then this Product will be skipped and
     * it will be not part of there result list.
     *
     * @param Products list of TCreate_Input
     * @return          list of TCreate_Return
     * @throws          RemoteException
     * @see             TCreate_Input
     * @see             TCreate_Return
     */
    public List<TCreate_Return> createProduct(List<TCreate_Input> Products) throws RemoteException {
        log.info("createProduct called");
        TCreate_Input[] input = new TCreate_Input[Products.size()];
        for (int i = 0; i < Products.size(); i++) {
            input[i] =  Products.get(i);
        }

        TCreate_Return[] results = stub.create(input);
        List<TCreate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TCreate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created Product: " + result.getAlias());
                resultList.add(result);
            } else {
                errorHandler.handle(result, result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Updates a list of Products with the given data.
     * If there is an error with a single Product, then this Product will be skipped and
     * it will be not part of there result list.
     *
     * @param Products list of TUpdate_Input
     * @return          list of TUpdate_Return
     * @throws          RemoteException
     * @see             TUpdate_Input
     * @see             TUpdate_Return
     */
    public List<TUpdate_Return> updateProduct(List<TUpdate_Input> Products) throws RemoteException {
        log.info("updateProduct called");
        TUpdate_Input[] input = new TUpdate_Input[Products.size()];
        for (int i = 0; i < Products.size(); i++) {
            input[i] =  Products.get(i);
        }

        TUpdate_Return[] results = stub.update(input);
        List<TUpdate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TUpdate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully updated Product: " + result.getPath());
                resultList.add(result);
            } else {
                errorHandler.handle(result, result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Deletes a list of Products.
     * If there is an error with a single Product, then this Product will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of Product paths
     * @return          list of TDelete_Return
     * @throws          RemoteException
     * @see             TDelete_Return
     */
    public List<TDelete_Return> deleteProduct(String[] paths) throws RemoteException {
        log.info("deleteProduct called");

        TDelete_Return[] results = stub.delete(paths);
        List<TDelete_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TDelete_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted Product: " + result.getPath());
                resultList.add(result);
            } else {
                errorHandler.handle(result, result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Checkes if a list of Products exists.
     * If there is an error with a single Product, then this Product will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of Product paths
     * @return          list of TExists_Return
     * @throws          RemoteException
     * @see             TExists_Return
     */
    public List<TExists_Return> existsProduct(String[] paths) throws RemoteException {
        log.info("existsProduct called");

        TExists_Return[] results = stub.exists(paths);
        List<TExists_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TExists_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check Product existance: " + result.getPath());
                resultList.add(result);
            } else {
                errorHandler.handle(result, result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Searches for Products by given search parameters.
     *
     * @param parameters    list of TFind_Input
     * @return              List of Product paths
     * @throws              RemoteException
     * @see                 TFind_Input
     */
    public String[] findProducts(TFind_Input parameters) throws RemoteException {
        log.info("findProduct called");
        String[] results = stub.find(parameters);
        log.info("result count: " + results.length);
        return results;
    }
}
