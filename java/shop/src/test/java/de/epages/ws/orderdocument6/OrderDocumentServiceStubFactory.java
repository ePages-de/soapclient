package de.epages.ws.orderdocument6;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.orderdocument6.stub.OrderDocumentService;
import de.epages.ws.orderdocument6.stub.Port_OrderDocument;

public interface OrderDocumentServiceStubFactory {
    Port_OrderDocument create(WebServiceConfiguration config, OrderDocumentService service);
}
