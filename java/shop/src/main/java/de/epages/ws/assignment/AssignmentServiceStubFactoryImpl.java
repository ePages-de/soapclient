package de.epages.ws.assignment;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.assignment.stub.AssignmentService;
import de.epages.ws.assignment.stub.Bind_Assignment_SOAPStub;
import de.epages.ws.assignment.stub.Port_Assignment;

final class AssignmentServiceStubFactoryImpl implements AssignmentServiceStubFactory {

    @Override
    public Port_Assignment create(WebServiceConfiguration config, AssignmentService serviceLocator) {

        try {
            Bind_Assignment_SOAPStub stub = (Bind_Assignment_SOAPStub) serviceLocator.getport_Assignment(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
