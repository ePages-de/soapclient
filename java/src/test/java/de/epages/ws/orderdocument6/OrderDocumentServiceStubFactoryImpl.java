package de.epages.ws.orderdocument6;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.orderdocument6.stub.Bind_OrderDocument_SOAPStub;
import de.epages.ws.orderdocument6.stub.OrderDocumentService;
import de.epages.ws.orderdocument6.stub.Port_OrderDocument;

final class OrderDocumentServiceStubFactoryImpl implements OrderDocumentServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(OrderDocumentServiceStubFactoryImpl.class);

    @Override
    public Port_OrderDocument create(WebServiceConfiguration config, OrderDocumentService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_OrderDocument_SOAPStub stub = (Bind_OrderDocument_SOAPStub) serviceLocator
                    .getport_OrderDocument(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
