package de.epages.ws.orderdocument5;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.orderdocument5.stub.Bind_OrderDocument_SOAPStub;
import de.epages.ws.orderdocument5.stub.OrderDocumentService;
import de.epages.ws.orderdocument5.stub.Port_OrderDocument;

final class OrderDocumentServiceStubFactoryImpl implements OrderDocumentServiceStubFactory {



    @Override
    public Port_OrderDocument create(WebServiceConfiguration config, OrderDocumentService serviceLocator) {
        
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
