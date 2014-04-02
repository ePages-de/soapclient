package de.epages.ws.user5;

import de.epages.ws.user5.model.TCreate_Return;
import de.epages.ws.user5.model.TDelete_Return;
import de.epages.ws.user5.model.TExists_Return;
import de.epages.ws.user5.model.TGetInfo_Return;
import de.epages.ws.user5.model.TSendPassword_Return;
import de.epages.ws.user5.model.TUpdate_Return;
import de.epages.ws.user5.stub.Port_User;
import de.epages.ws.user5.stub.Type_Find_Input;

public interface UserServiceClient extends Port_User {

    /**
     * get information about a list of users
     */
    TGetInfo_Return[] getInfo(String[] users, String[] attributes, String[] addressAttributes);

    /**
     * check if a list of users exist.
     */
    TExists_Return[] exists(String[] users);

    /**
     * send user a link to enter a new password.
     */
    TSendPassword_Return[] sendPassword(String[] users);

    /**
     * delete a list of users
     */
    TDelete_Return[] delete(String[] users);

    /**
     * update a list of users
     */
    TUpdate_Return[] update(de.epages.ws.user5.model.TUpdate_Input[] users);

    /**
     * create new users
     */
    TCreate_Return[] create(de.epages.ws.user5.model.TCreate_Input[] users);

    /**
     * find customers
     */
    String[] find(Type_Find_Input searchParameters);
}
