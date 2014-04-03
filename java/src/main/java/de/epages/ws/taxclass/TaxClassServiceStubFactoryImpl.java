package de.epages.ws.taxclass;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.taxclass.stub.Bind_TaxClass_SOAPStub;
import de.epages.ws.taxclass.stub.Port_TaxClass;
import de.epages.ws.taxclass.stub.TaxClassService;

final class TaxClassServiceStubFactoryImpl implements TaxClassServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(TaxClassServiceStubFactoryImpl.class);

    @Override
    public Port_TaxClass create(WebServiceConfiguration config, TaxClassService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_TaxClass_SOAPStub stub = (Bind_TaxClass_SOAPStub) serviceLocator.getport_TaxClass(config
                    .getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
