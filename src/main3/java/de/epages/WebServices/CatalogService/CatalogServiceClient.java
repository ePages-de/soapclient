package de.epages.WebServices.CatalogService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.CatalogService.Stub.Bind_Catalog_SOAPStub;
import de.epages.WebServices.CatalogService.Stub.CatalogService;
import de.epages.WebServices.CatalogService.Stub.CatalogServiceLocator;
import de.epages.WebServices.CatalogService.Stub.TCreate_Input;
import de.epages.WebServices.CatalogService.Stub.TCreate_Return;
import de.epages.WebServices.CatalogService.Stub.TDelete_Return;
import de.epages.WebServices.CatalogService.Stub.TExists_Return;
import de.epages.WebServices.CatalogService.Stub.TGetInfo_Return;
import de.epages.WebServices.CatalogService.Stub.TGetRoot_Return;
import de.epages.WebServices.CatalogService.Stub.TUpdate_Input;
import de.epages.WebServices.CatalogService.Stub.TUpdate_Return;

public class CatalogServiceClient {
    private CatalogService service;
    private Bind_Catalog_SOAPStub stub;
    private static Logger log = Logger.getLogger(CatalogServiceClient.class.getName());

    /**
     * Class constructor
     */
    public CatalogServiceClient(WebServiceConfiguration config) {
        service = new CatalogServiceLocator();
        log.info("address specified by wsdl: " + service.getport_CatalogAddress());
        log.info("using web service Url: " + config.getWebserviceURL());

        try {
            stub = new Bind_Catalog_SOAPStub(config.getWebserviceURL(), service);

            // setting user-path and password of the shop
            stub.setUsername(config.getUsername());
            stub.setPassword(config.getPassword());
        }
        catch (Exception e) {
            log.severe( e.toString() );
        }
    }

    public List<TGetInfo_Return> getCatalogInfo(String[] paths) throws RemoteException {
        return getCatalogInfo(paths, new String[]{});
    }

    public List<TGetInfo_Return> getCatalogInfo(String[] paths, String[] attributes) throws RemoteException {
        return getCatalogInfo(paths, attributes, new String[]{});
    }
    /**
     * Gets information about a list of Catalogs.
     * If there is an error with a single Catalog, then this Catalog will be skipped and
     * it will be not part of there result list.
     *
     * @param paths         list of Catalog paths
     * @param attributes    list of Catalog paths
     * @return              list of TGetInfo_Return
     * @throws              RemoteException
     * @see                 TGetInfo_Return
     */
    public List<TGetInfo_Return> getCatalogInfo(String[] paths, String[] attributes, String[] languages) throws RemoteException {
        log.info("getCatalogInfo called");
        TGetInfo_Return[] Catalogs = stub.getInfo(paths, attributes, languages);
        List result = new ArrayList<>();

        for (int i = 0; i < Catalogs.length; i++) {
            TGetInfo_Return Catalog = Catalogs[i];

            if (Catalog.getError() == null) {
                log.info("successfully retrieved Catalog: " + Catalog.getAlias());
                result.add(Catalog);
            } else {
                log.severe("an error occured (Epages Error):\n" + Catalog.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * get path of root catalog
     * @return path of root catalog
     * @throws RemoteException
     */
    public String getRoot() throws RemoteException {
        log.info("getRoot called");
        TGetRoot_Return Catalog = stub.getRoot();

        if (Catalog.getError() == null) {
            log.info("successfully retrieved RootCatalog: " + Catalog.getPath());

            return Catalog.getPath();
        } else {
            log.severe("an error occured (Epages Error):\n" + Catalog.getError().getMessage());
        }

        return null;
    }

    /**
     * Creates a list of Catalogs with the given data.
     * If there is an error with a single Catalog, then this Catalog will be skipped and
     * it will be not part of there result list.
     *
     * @param Catalogs list of TCreate_Input
     * @return          list of TCreate_Return
     * @throws          RemoteException
     * @see             TCreate_Input
     * @see             TCreate_Return
     */
    public List<TCreate_Return> createCatalog(List<TCreate_Input> Catalogs) throws RemoteException {
        log.info("createCatalog called");
        TCreate_Input[] input = new TCreate_Input[Catalogs.size()];
        for (int i = 0; i < Catalogs.size(); i++) {
            input[i] =  Catalogs.get(i);
        }

        TCreate_Return[] results = stub.create(input);
        List<TCreate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TCreate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created Catalog: " + result.getAlias());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Updates a list of Catalogs with the given data.
     * If there is an error with a single Catalog, then this Catalog will be skipped and
     * it will be not part of there result list.
     *
     * @param Catalogs list of TUpdate_Input
     * @return          list of TUpdate_Return
     * @throws          RemoteException
     * @see             TUpdate_Input
     * @see             TUpdate_Return
     */
    public List<TUpdate_Return> updateCatalog(List<TUpdate_Input> Catalogs) throws RemoteException {
        log.info("updateCatalog called");
        TUpdate_Input[] input = new TUpdate_Input[Catalogs.size()];
        for (int i = 0; i < Catalogs.size(); i++) {
            input[i] =  Catalogs.get(i);
        }

        TUpdate_Return[] results = stub.update(input);
        List<TUpdate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TUpdate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully updated Catalog: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Deletes a list of Catalogs.
     * If there is an error with a single Catalog, then this Catalog will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of Catalog paths
     * @return          list of TDelete_Return
     * @throws          RemoteException
     * @see             TDelete_Return
     */
    public List<TDelete_Return> deleteCatalog(String[] paths) throws RemoteException {
        log.info("deleteCatalog called");

        TDelete_Return[] results = stub.delete(paths);
        List<TDelete_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TDelete_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted Catalog: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Checkes if a list of Catalogs exists.
     * If there is an error with a single Catalog, then this Catalog will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of Catalog paths
     * @return          list of TExists_Return
     * @throws          RemoteException
     * @see             TExists_Return
     */
    public List<TExists_Return> existsCatalog(String[] paths) throws RemoteException {
        log.info("existsCatalog called");

        TExists_Return[] results = stub.exists(paths);
        List<TExists_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TExists_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check Catalog existance: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }
}
