package de.epages.ws.simpleprovisioning;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.simpleprovisioning.stub.SimpleProvisioningService;
import de.epages.ws.simpleprovisioning.stub.Bind_SimpleProvisioning_SOAPStub;
import de.epages.ws.simpleprovisioning.stub.Port_SimpleProvisioning;

final class SimpleProvisioningServiceStubFactoryImpl implements SimpleProvisioningServiceStubFactory {

    @Override
    public Port_SimpleProvisioning create(WebServiceConfiguration config, SimpleProvisioningService service) {

        try {
            Bind_SimpleProvisioning_SOAPStub stub = (Bind_SimpleProvisioning_SOAPStub) service.getport_SimpleProvisioning(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
