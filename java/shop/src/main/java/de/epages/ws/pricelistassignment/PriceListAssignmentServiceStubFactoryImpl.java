package de.epages.ws.pricelistassignment;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pricelistassignment.stub.Bind_PriceListAssignment_SOAPStub;
import de.epages.ws.pricelistassignment.stub.Port_PriceListAssignment;
import de.epages.ws.pricelistassignment.stub.PriceListAssignmentService;

final class PriceListAssignmentServiceStubFactoryImpl implements PriceListAssignmentServiceStubFactory {

    @Override
    public Port_PriceListAssignment create(WebServiceConfiguration config, PriceListAssignmentService service) {

        try {
            Bind_PriceListAssignment_SOAPStub stub = (Bind_PriceListAssignment_SOAPStub) service.getport_PriceListAssignment(config
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
