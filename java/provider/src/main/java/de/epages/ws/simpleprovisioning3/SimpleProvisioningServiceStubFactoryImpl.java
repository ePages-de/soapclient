package de.epages.ws.simpleprovisioning3;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.simpleprovisioning3.stub.Port_SimpleProvisioning;
import de.epages.ws.simpleprovisioning3.stub.SimpleProvisioningService;
import de.epages.ws.simpleprovisioning3.stub.Bind_SimpleProvisioning_SOAPStub;

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
