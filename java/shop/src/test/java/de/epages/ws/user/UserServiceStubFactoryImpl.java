package de.epages.ws.user;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.user.stub.Bind_User_SOAPStub;
import de.epages.ws.user.stub.Port_User;
import de.epages.ws.user.stub.UserService;

final class UserServiceStubFactoryImpl implements UserServiceStubFactory {



    @Override
    public Port_User create(WebServiceConfiguration config, UserService serviceLocator) {
        
        try {
            Bind_User_SOAPStub stub = (Bind_User_SOAPStub) serviceLocator.getport_User(config
                    .getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
