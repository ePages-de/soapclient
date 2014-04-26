package de.epages.ws.user5;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.user5.stub.Port_User;
import de.epages.ws.user5.stub.UserService;

public interface UserServiceStubFactory {

    Port_User create(WebServiceConfiguration config, UserService service);

}
