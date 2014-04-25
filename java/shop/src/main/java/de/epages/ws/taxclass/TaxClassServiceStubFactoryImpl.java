package de.epages.ws.taxclass;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.taxclass.stub.Bind_TaxClass_SOAPStub;
import de.epages.ws.taxclass.stub.Port_TaxClass;
import de.epages.ws.taxclass.stub.TaxClassService;

final class TaxClassServiceStubFactoryImpl implements TaxClassServiceStubFactory {

    @Override
    public Port_TaxClass create(WebServiceConfiguration config, TaxClassService serviceLocator) {

        try {
            Bind_TaxClass_SOAPStub stub = (Bind_TaxClass_SOAPStub) serviceLocator.getport_TaxClass(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
