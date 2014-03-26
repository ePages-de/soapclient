package de.epages.ws.orderdocument;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.orderdocument.stub.OrderDocumentService;
import de.epages.ws.orderdocument.stub.Port_OrderDocument;

public interface OrderDocumentServiceStubFactory {
    Port_OrderDocument create(WebServiceConfiguration config, OrderDocumentService service);
}
