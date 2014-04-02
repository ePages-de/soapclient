package de.epages.ws.user5;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.user5.stub.Bind_User_SOAPStub;
import de.epages.ws.user5.stub.Port_User;
import de.epages.ws.user5.stub.UserService;

final class UserServiceStubFactoryImpl implements UserServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(UserServiceStubFactoryImpl.class);

    @Override
    public Port_User create(WebServiceConfiguration config, UserService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
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
