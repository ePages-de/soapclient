package de.epages.WebServices.ProductService11;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.WebServices.ErrorHandler;
import de.epages.WebServices.ThrowingErrorHandler;
import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.ProductService11.Stub.Bind_Product_SOAPStub;
import de.epages.WebServices.ProductService11.Stub.Port_Product_PortType;
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

public class ProductService11Client implements Port_Product_PortType {
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

    @Deprecated
    public List<TGetInfo_Return> getProductInfo(String[] paths) throws RemoteException {
        return getProductInfo(paths, new String[]{});
    }

    @Deprecated
    public List<TGetInfo_Return> getProductInfo(String[] paths, String[] attributes) throws RemoteException {
        return getProductInfo(paths, attributes, new String[]{});
    }
    /**
     * Gets information about a list of Products.
     * If there is an error with a single Product, then this Product will be skipped and
     * it will be not part of there result list.
     *
     * @param paths         list of Product paths
     * @param attributes    list of additional attributes
     * @return              list of TGetInfo_Return
     * @throws              RemoteException
     * @see                 TGetInfo_Return
     */
    @Deprecated
    public List<TGetInfo_Return> getProductInfo(String[] paths, String[] attributes, String[] languages) throws RemoteException {
        TGetInfo_Return[] products = stub.getInfo(paths, attributes, languages);
        List<TGetInfo_Return> result = new ArrayList<>(products.length);

        for (int i = 0; i < products.length; i++) {
            TGetInfo_Return product = products[i];

            if (product.getError() == null) {
                log.info("successfully retrieved product: " + product.getPath());
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
    @Deprecated
    public List<TCreate_Return> createProduct(List<TCreate_Input> Products) throws RemoteException {
        TCreate_Input[] input = new TCreate_Input[Products.size()];
        for (int i = 0; i < Products.size(); i++) {
            input[i] =  Products.get(i);
        }

        TCreate_Return[] results = stub.create(input);
        List<TCreate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TCreate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created product: " + result.getPath());
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
    @Deprecated
    public List<TUpdate_Return> updateProduct(List<TUpdate_Input> Products) throws RemoteException {
        TUpdate_Input[] input = new TUpdate_Input[Products.size()];
        for (int i = 0; i < Products.size(); i++) {
            input[i] =  Products.get(i);
        }

        TUpdate_Return[] results = stub.update(input);
        List<TUpdate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TUpdate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully updated product: " + result.getPath());
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
    @Deprecated
    public List<TDelete_Return> deleteProduct(String[] paths) throws RemoteException {
        TDelete_Return[] results = stub.delete(paths);
        List<TDelete_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TDelete_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted product: " + result.getPath());
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
    @Deprecated
    public List<TExists_Return> existsProduct(String[] paths) throws RemoteException {
        TExists_Return[] results = stub.exists(paths);
        List<TExists_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TExists_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check product existance: " + result.getPath());
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
    @Deprecated
    public String[] findProducts(TFind_Input parameters) throws RemoteException {
        return stub.find(parameters);
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] products, String[] attributes, String[] languageCodes) throws RemoteException {
        List<TGetInfo_Return> productInfo = getProductInfo(products, attributes, languageCodes);
        return productInfo.toArray(new TGetInfo_Return[productInfo.size()]);
    }

    @Override
    public TExists_Return[] exists(String[] products) throws RemoteException {
        List<TExists_Return> existsProduct = existsProduct(products);
        return existsProduct.toArray(new TExists_Return[existsProduct.size()]);
    }

    @Override
    public TDelete_Return[] delete(String[] products) throws RemoteException {
        List<TDelete_Return> deleteProduct = deleteProduct(products);
        return deleteProduct.toArray(new TDelete_Return[deleteProduct.size()]);
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] products) throws RemoteException {
        List<TUpdate_Return> existsProduct = updateProduct(Arrays.asList(products));
        return existsProduct.toArray(new TUpdate_Return[existsProduct.size()]);
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] products) throws RemoteException {
        List<TCreate_Return> existsProduct = createProduct(Arrays.asList(products));
        return existsProduct.toArray(new TCreate_Return[existsProduct.size()]);
    }

    @Override
    public String[] find(TFind_Input searchParameters) throws RemoteException {
        return findProducts(searchParameters);
    }
}
