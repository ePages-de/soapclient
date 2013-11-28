package de.epages.webservice.assignment;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.assignment.stub.AssignmentService;
import de.epages.webservice.assignment.stub.Port_Assignment;

public interface AssignmentServiceStubFactory {
    Port_Assignment create(WebServiceConfiguration config, AssignmentService service);
}
