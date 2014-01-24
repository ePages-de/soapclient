package de.epages.ws.orderdocument7;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.orderdocument7.stub.Bind_OrderDocument_SOAPStub;
import de.epages.ws.orderdocument7.stub.OrderDocumentService;
import de.epages.ws.orderdocument7.stub.Port_OrderDocument;

final class OrderDocumentServiceStubFactoryImpl implements OrderDocumentServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(OrderDocumentServiceStubFactoryImpl.class);

    @Override
    public Port_OrderDocument create(WebServiceConfiguration config, OrderDocumentService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_OrderDocument_SOAPStub stub = new Bind_OrderDocument_SOAPStub(config.getWebserviceURL(), serviceLocator);
            return StubConfigurator.configure(stub, config);
        } catch (AxisFault e) {
            throw new RuntimeException(e);
        }
    }

}
