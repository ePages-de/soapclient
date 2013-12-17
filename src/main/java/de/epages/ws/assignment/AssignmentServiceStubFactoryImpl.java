package de.epages.ws.assignment;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.assignment.stub.AssignmentService;
import de.epages.ws.assignment.stub.Bind_Assignment_SOAPStub;
import de.epages.ws.assignment.stub.Port_Assignment;

final class AssignmentServiceStubFactoryImpl implements AssignmentServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(AssignmentServiceStubFactoryImpl.class);

    @Override
    public Port_Assignment create(WebServiceConfiguration config, AssignmentService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_Assignment_SOAPStub stub = new Bind_Assignment_SOAPStub(config.getWebserviceURL(), service);
            stub.setUsername(config.getUsername());
            stub.setPassword(config.getPassword());
            return stub;
        } catch (AxisFault e) {
            throw new RuntimeException(e);
        }
    }

}
