package de.epages.ws.orderdocument3;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.orderdocument3.stub.OrderDocumentService;
import de.epages.ws.orderdocument3.stub.Port_OrderDocument;

public interface OrderDocumentServiceStubFactory {
    Port_OrderDocument create(WebServiceConfiguration config, OrderDocumentService service);
}
