package de.epages.ws.user6;

import de.epages.ws.user6.model.TCreate_Return;
import de.epages.ws.user6.model.TDelete_Return;
import de.epages.ws.user6.model.TExists_Return;
import de.epages.ws.user6.model.TGetInfo_Return;
import de.epages.ws.user6.model.TSendPassword_Return;
import de.epages.ws.user6.model.TUpdate_Return;
import de.epages.ws.user6.stub.Port_User;
import de.epages.ws.user6.stub.Type_Find_Input;

public interface UserServiceClient extends Port_User {

    /**
     * get information about a list of users
     */
    @Override
    TGetInfo_Return[] getInfo(String[] users, String[] attributes, String[] addressAttributes);

    /**
     * check if a list of users exist.
     */
    @Override
    TExists_Return[] exists(String[] users);

    /**
     * send user a link to enter a new password.
     */
    @Override
    TSendPassword_Return[] sendPassword(String[] users);

    /**
     * delete a list of users
     */
    @Override
    TDelete_Return[] delete(String[] users);

    /**
     * update a list of users
     */
    @Override
    TUpdate_Return[] update(de.epages.ws.user6.model.TUpdate_Input[] users);

    /**
     * create new users
     */
    @Override
    TCreate_Return[] create(de.epages.ws.user6.model.TCreate_Input[] users);

    /**
     * find customers
     */
    @Override
    String[] find(Type_Find_Input searchParameters);
}
