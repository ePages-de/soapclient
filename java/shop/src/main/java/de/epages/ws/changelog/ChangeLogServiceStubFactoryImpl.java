package de.epages.ws.changelog;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.changelog.stub.Bind_ChangeLog_SOAPStub;
import de.epages.ws.changelog.stub.ChangeLogService;
import de.epages.ws.changelog.stub.Port_ChangeLog;

final class ChangeLogServiceStubFactoryImpl implements ChangeLogServiceStubFactory {

    @Override
    public Port_ChangeLog create(WebServiceConfiguration config, ChangeLogService serviceLocator) {

        try {
            Bind_ChangeLog_SOAPStub stub = (Bind_ChangeLog_SOAPStub) serviceLocator.getport_ChangeLog(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
