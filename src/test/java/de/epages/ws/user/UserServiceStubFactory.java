package de.epages.ws.user;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.user.stub.Port_User;
import de.epages.ws.user.stub.UserService;

public interface UserServiceStubFactory {

    Port_User create(WebServiceConfiguration config, UserService service);

}
