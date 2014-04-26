package de.epages.ws.taxarea;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.taxarea.stub.Bind_TaxArea_SOAPStub;
import de.epages.ws.taxarea.stub.Port_TaxArea;
import de.epages.ws.taxarea.stub.TaxAreaService;

final class TaxAreaServiceStubFactoryImpl implements TaxAreaServiceStubFactory {

    @Override
    public Port_TaxArea create(WebServiceConfiguration config, TaxAreaService serviceLocator) {

        try {
            Bind_TaxArea_SOAPStub stub = (Bind_TaxArea_SOAPStub) serviceLocator.getport_TaxArea(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
