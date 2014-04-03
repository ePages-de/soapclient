package de.epages.ws.user3;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.user3.stub.Port_User;
import de.epages.ws.user3.stub.UserService;

public interface UserServiceStubFactory {

    Port_User create(WebServiceConfiguration config, UserService service);

}
