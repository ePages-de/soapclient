package de.epages.ws.orderdocument7;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.orderdocument7.stub.OrderDocumentService;
import de.epages.ws.orderdocument7.stub.Port_OrderDocument;

public interface OrderDocumentServiceStubFactory {
    Port_OrderDocument create(WebServiceConfiguration config, OrderDocumentService service);
}
