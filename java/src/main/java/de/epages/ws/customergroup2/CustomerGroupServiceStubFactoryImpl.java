package de.epages.ws.customergroup2;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customergroup2.stub.Bind_CustomerGroup_SOAPStub;
import de.epages.ws.customergroup2.stub.CustomerGroupService;
import de.epages.ws.customergroup2.stub.Port_CustomerGroup;

final class CustomerGroupServiceStubFactoryImpl implements CustomerGroupServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(CustomerGroupServiceStubFactoryImpl.class);

    @Override
    public Port_CustomerGroup create(WebServiceConfiguration config, CustomerGroupService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
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
