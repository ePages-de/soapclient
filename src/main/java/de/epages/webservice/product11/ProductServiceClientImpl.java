package de.epages.webservice.product11;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.product11.model.TCreate_Input;
import de.epages.webservice.product11.model.TCreate_Return;
import de.epages.webservice.product11.model.TDelete_Return;
import de.epages.webservice.product11.model.TExists_Return;
import de.epages.webservice.product11.model.TGetInfo_Return;
import de.epages.webservice.product11.model.TUpdate_Input;
import de.epages.webservice.product11.model.TUpdate_Return;
import de.epages.webservice.product11.stub.Port_Product;
import de.epages.webservice.product11.stub.ProductServiceLocator;
import de.epages.webservice.product11.stub.TFind_Input;

public final class ProductServiceClientImpl implements ProductServiceClient {
    private final ProductServiceLocator serviceLocator = new ProductServiceLocator();
    private final Port_Product stub;

    public ProductServiceClientImpl(WebServiceConfiguration config) {
        this(config, new ProductService11StubFactoryImpl());
    }

    public ProductServiceClientImpl(WebServiceConfiguration config, ProductService11StubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    /**
     * Gets information about a list of Products. If there is an error with a
     * single Product, then this Product will be skipped and it will be not part
     * of there result list.
     * 
     * @param paths
     *            list of Product paths
     * @return list of TGetInfo_Return
     * @throws RemoteException
     * @see TGetInfo_Return
     */
    @Override
    public TGetInfo_Return[] getInfo(String[] products) {
        return getInfo(products, new String[] {});
    }

    /**
     * Gets information about a list of Products. If there is an error with a
     * single Product, then this Product will be skipped and it will be not part
     * of there result list.
     * 
     * @param paths
     *            list of Product paths
     * @param attributes
     *            list of additional attributes
     * @return list of TGetInfo_Return
     * @throws RemoteException
     * @see TGetInfo_Return
     */
    @Override
    public TGetInfo_Return[] getInfo(String[] products, String[] attributes) {
        return getInfo(products, attributes, new String[] {});
    }

    /**
     * Gets information about a list of Products. If there is an error with a
     * single Product, then this Product will be skipped and it will be not part
     * of there result list.
     * 
     * @param paths
     *            list of Product paths
     * @param attributes
     *            list of additional attributes
     * @param languageCodes
     *            list of language codes
     * @return list of TGetInfo_Return
     * @throws RemoteException
     * @see TGetInfo_Return
     */
    @Override
    public TGetInfo_Return[] getInfo(String[] products, String[] attributes, String[] languageCodes) {
        try {
            return stub.getInfo(products, attributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Creates a list of Products with the given data. If there is an error with
     * a single Product, then this Product will be skipped and it will be not
     * part of there result list.
     * 
     * @param Products
     *            list of TCreate_Input
     * @return list of TCreate_Return
     * @throws RemoteException
     * @see TCreate_Input
     * @see TCreate_Return
     */
    @Override
    public TCreate_Return[] create(TCreate_Input[] products) {
        try {
            return stub.create(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Updates a list of Products with the given data. If there is an error with
     * a single Product, then this Product will be skipped and it will be not
     * part of there result list.
     * 
     * @param Products
     *            list of TUpdate_Input
     * @return list of TUpdate_Return
     * @throws RemoteException
     * @see TUpdate_Input
     * @see TUpdate_Return
     */
    @Override
    public TUpdate_Return[] update(TUpdate_Input[] products) {
        try {
            return stub.update(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Deletes a list of Products. If there is an error with a single Product,
     * then this Product will be skipped and it will be not part of there result
     * list.
     * 
     * @param paths
     *            list of Product paths
     * @return list of TDelete_Return
     * @throws RemoteException
     * @see TDelete_Return
     */
    @Override
    public TDelete_Return[] delete(String[] products) {
        try {
            return stub.delete(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Checks if a list of Products exists. If there is an error with a single
     * Product, then this Product will be skipped and it will be not part of
     * there result list.
     * 
     * @param paths
     *            list of Product paths
     * @return list of TExists_Return
     * @throws RemoteException
     * @see TExists_Return
     */
    @Override
    public TExists_Return[] exists(String[] products) {
        try {
            return stub.exists(products);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * Searches for Products by given search parameters.
     * 
     * @param parameters
     *            list of TFind_Input
     * @return List of Product paths
     * @throws RemoteException
     * @see TFind_Input
     */
    @Override
    public String[] find(TFind_Input searchParameters) {
        try {
            return stub.find(searchParameters);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
