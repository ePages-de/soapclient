package de.epages.ws.pricelistassignment;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pricelistassignment.stub.Port_PriceListAssignment;
import de.epages.ws.pricelistassignment.stub.PriceListAssignmentService;

public interface PriceListAssignmentServiceStubFactory {
    Port_PriceListAssignment create(WebServiceConfiguration config, PriceListAssignmentService service);
}
