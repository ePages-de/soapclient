package de.epages.ws.customer6;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customer6.stub.Bind_Customer_SOAPStub;
import de.epages.ws.customer6.stub.CustomerService;
import de.epages.ws.customer6.stub.Port_Customer;

final class CustomerServiceStubFactoryImpl implements CustomerServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(CustomerServiceStubFactoryImpl.class);

    @Override
    public Port_Customer create(WebServiceConfiguration config, CustomerService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_Customer_SOAPStub stub = (Bind_Customer_SOAPStub) service.getport_Customer(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
