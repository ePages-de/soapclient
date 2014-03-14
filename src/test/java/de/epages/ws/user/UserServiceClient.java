package de.epages.ws.user;

import de.epages.ws.user.model.TCreate_Input;
import de.epages.ws.user.model.TCreate_Return;
import de.epages.ws.user.model.TDelete_Return;
import de.epages.ws.user.model.TExists_Return;
import de.epages.ws.user.model.TGetInfo_Return;
import de.epages.ws.user.model.TUpdate_Input;
import de.epages.ws.user.model.TUpdate_Return;
import de.epages.ws.user.stub.Port_User;

public interface UserServiceClient extends Port_User {

    /**
     * get information about a list of users
     */
    TGetInfo_Return[] getInfo(String[] users, String[] attributes);

    /**
     * check if a list of users exist.
     */
    TExists_Return[] exists(String[] users);

    /**
     * delete a list of users
     */
    TDelete_Return[] delete(String[] users);

    /**
     * update a list of users
     */
    TUpdate_Return[] update(TUpdate_Input[] users);

    /**
     * create new users
     */
    TCreate_Return[] create(TCreate_Input[] users);

}
