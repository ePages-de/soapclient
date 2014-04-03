package de.epages.ws.user4;

import de.epages.ws.user4.model.TCreate_Input;
import de.epages.ws.user4.model.TCreate_Return;
import de.epages.ws.user4.model.TDelete_Return;
import de.epages.ws.user4.model.TExists_Return;
import de.epages.ws.user4.model.TGetInfo_Return;
import de.epages.ws.user4.model.TUpdate_Input;
import de.epages.ws.user4.model.TUpdate_Return;
import de.epages.ws.user4.stub.Port_User;

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
