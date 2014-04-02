package de.epages.ws.user6;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.user6.stub.Port_User;
import de.epages.ws.user6.stub.UserService;

public interface UserServiceStubFactory {

    Port_User create(WebServiceConfiguration config, UserService service);

}
