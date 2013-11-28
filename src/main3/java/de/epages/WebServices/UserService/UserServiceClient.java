package de.epages.WebServices.UserService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.UserService.Stub.Bind_User_SOAPStub;
import de.epages.WebServices.UserService.Stub.TCreate_Input;
import de.epages.WebServices.UserService.Stub.TCreate_Return;
import de.epages.WebServices.UserService.Stub.TDelete_Return;
import de.epages.WebServices.UserService.Stub.TExists_Return;
import de.epages.WebServices.UserService.Stub.TGetInfo_Return;
import de.epages.WebServices.UserService.Stub.TUpdate_Input;
import de.epages.WebServices.UserService.Stub.TUpdate_Return;
import de.epages.WebServices.UserService.Stub.UserService;
import de.epages.WebServices.UserService.Stub.UserServiceLocator;

public class UserServiceClient {
    private UserService service;
    private Bind_User_SOAPStub stub;
    private static Logger log = Logger.getLogger(UserServiceClient.class.getName());

    /**
     * Class constructor
     */
    public UserServiceClient(WebServiceConfiguration config) {
        service = new UserServiceLocator();
        log.info("address specified by wsdl: " + service.getport_UserAddress());
        log.info("using web service Url: " + config.getWebserviceURL());

        try {
            stub = new Bind_User_SOAPStub(config.getWebserviceURL(), service);

            // setting user-path and password of the shop
            stub.setUsername(config.getUsername());
            stub.setPassword(config.getPassword());
        }
        catch (Exception e) {
            log.severe( e.toString() );
        }
    }

    /**
     * Gets information about a list of Users.
     * If there is an error with a single User, then this User will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of User paths
     * @return          list of TGetInfo_Return
     * @throws          RemoteException
     * @see             TGetInfo_Return
     * @see             #getUserInfo(String[] paths, String[] attributes)
     */
    public List<TGetInfo_Return> getUserInfo(String[] paths) throws RemoteException {
        return getUserInfo(paths, new String[]{});
    }

    /**
     * Gets information about a list of Users.
     * If there is an error with a single User, then this User will be skipped and
     * it will be not part of there result list.
     *
     * @param paths         list of User paths
     * @param attributes    list of User paths
     * @return              list of TGetInfo_Return
     * @throws              RemoteException
     * @see                 TGetInfo_Return
     */
    public List<TGetInfo_Return> getUserInfo(String[] paths, String[] attributes) throws RemoteException {
        log.info("getUserInfo called");
        TGetInfo_Return[] Users = stub.getInfo(paths, attributes);
        List result = new ArrayList<>();

        for (int i = 0; i < Users.length; i++) {
            TGetInfo_Return User = Users[i];

            if (User.getError() == null) {
                log.info("successfully retrieved User: " + User.getAlias());
                result.add(User);
            } else {
                log.severe("an error occured (Epages Error):\n" + User.getError().getMessage());
            }
        }
        return result;
    }

    /**
     * Creates a list of Users with the given data.
     * If there is an error with a single User, then this User will be skipped and
     * it will be not part of there result list.
     *
     * @param Users list of TCreate_Input
     * @return          list of TCreate_Return
     * @throws          RemoteException
     * @see             TCreate_Input
     * @see             TCreate_Return
     */
    public List<TCreate_Return> createUser(List<TCreate_Input> Users) throws RemoteException {
        log.info("createUser called");
        TCreate_Input[] input = new TCreate_Input[Users.size()];
        for (int i = 0; i < Users.size(); i++) {
            input[i] =  Users.get(i);
        }

        TCreate_Return[] results = stub.create(input);
        List<TCreate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TCreate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created User: " + result.getAlias());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Updates a list of Users with the given data.
     * If there is an error with a single User, then this User will be skipped and
     * it will be not part of there result list.
     *
     * @param Users list of TUpdate_Input
     * @return          list of TUpdate_Return
     * @throws          RemoteException
     * @see             TUpdate_Input
     * @see             TUpdate_Return
     */
    public List<TUpdate_Return> updateUser(List<TUpdate_Input> Users) throws RemoteException {
        log.info("updateUser called");
        TUpdate_Input[] input = new TUpdate_Input[Users.size()];
        for (int i = 0; i < Users.size(); i++) {
            input[i] =  Users.get(i);
        }

        TUpdate_Return[] results = stub.update(input);
        List<TUpdate_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TUpdate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully updated User: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Deletes a list of Users.
     * If there is an error with a single User, then this User will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of User paths
     * @return          list of TDelete_Return
     * @throws          RemoteException
     * @see             TDelete_Return
     */
    public List<TDelete_Return> deleteUser(String[] paths) throws RemoteException {
        log.info("deleteUser called");

        TDelete_Return[] results = stub.delete(paths);
        List<TDelete_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TDelete_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted User: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }

    /**
     * Checkes if a list of Users exists.
     * If there is an error with a single User, then this User will be skipped and
     * it will be not part of there result list.
     *
     * @param paths     list of User paths
     * @return          list of TExists_Return
     * @throws          RemoteException
     * @see             TExists_Return
     */
    public List<TExists_Return> existsUser(String[] paths) throws RemoteException {
        log.info("existsUser called");

        TExists_Return[] results = stub.exists(paths);
        List<TExists_Return> resultList = new ArrayList<>();

        for (int i = 0; i < results.length; i++) {
            TExists_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check User existance: " + result.getPath());
                resultList.add(result);
            } else {
                log.severe("an error occured (Epages Error):\n" + result.getError().getMessage());
            }
        }

        return resultList;
    }
}
