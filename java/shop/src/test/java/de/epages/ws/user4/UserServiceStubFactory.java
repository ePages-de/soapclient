package de.epages.ws.user4;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.user4.stub.Port_User;
import de.epages.ws.user4.stub.UserService;

public interface UserServiceStubFactory {

    Port_User create(WebServiceConfiguration config, UserService service);

}
