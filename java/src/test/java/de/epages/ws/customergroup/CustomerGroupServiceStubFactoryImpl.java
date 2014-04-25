package de.epages.ws.customergroup;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customergroup.stub.Bind_CustomerGroup_SOAPStub;
import de.epages.ws.customergroup.stub.CustomerGroupService;
import de.epages.ws.customergroup.stub.Port_CustomerGroup;

final class CustomerGroupServiceStubFactoryImpl implements CustomerGroupServiceStubFactory {



    @Override
    public Port_CustomerGroup create(WebServiceConfiguration config, CustomerGroupService service) {
        
        try {
            Bind_CustomerGroup_SOAPStub stub = (Bind_CustomerGroup_SOAPStub) service.getport_CustomerGroup(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
