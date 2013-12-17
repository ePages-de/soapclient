package de.epages.ws.assignment;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.assignment.stub.AssignmentService;
import de.epages.ws.assignment.stub.Port_Assignment;

public interface AssignmentServiceStubFactory {
    Port_Assignment create(WebServiceConfiguration config, AssignmentService service);
}
