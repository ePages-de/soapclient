package de.epages.ws.customer;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.customer.stub.Bind_Customer_SOAPStub;
import de.epages.ws.customer.stub.CustomerService;
import de.epages.ws.customer.stub.Port_Customer;

final class CustomerServiceStubFactoryImpl implements CustomerServiceStubFactory {



    @Override
    public Port_Customer create(WebServiceConfiguration config, CustomerService service) {
        
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
