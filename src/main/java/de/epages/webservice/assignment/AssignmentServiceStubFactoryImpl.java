package de.epages.webservice.assignment;

import org.apache.axis.AxisFault;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.assignment.stub.AssignmentService;
import de.epages.webservice.assignment.stub.Bind_Assignment_SOAPStub;
import de.epages.webservice.assignment.stub.Port_Assignment;

class AssignmentServiceStubFactoryImpl implements AssignmentServiceStubFactory {

    @Override
    public Port_Assignment create(WebServiceConfiguration config, AssignmentService service) {
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
