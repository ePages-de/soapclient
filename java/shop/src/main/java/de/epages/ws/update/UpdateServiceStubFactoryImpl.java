package de.epages.ws.update;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.update.stub.Bind_Update_SOAPStub;
import de.epages.ws.update.stub.Port_Update;
import de.epages.ws.update.stub.UpdateService;

final class UpdateServiceStubFactoryImpl implements UpdateServiceStubFactory {

    @Override
    public Port_Update create(WebServiceConfiguration config, UpdateService serviceLocator) {

        try {
            Bind_Update_SOAPStub stub = (Bind_Update_SOAPStub) serviceLocator.getport_Update(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
