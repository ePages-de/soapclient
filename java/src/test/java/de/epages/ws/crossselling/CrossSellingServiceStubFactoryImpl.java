package de.epages.ws.crossselling;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.crossselling.stub.Bind_CrossSelling_SOAPStub;
import de.epages.ws.crossselling.stub.CrossSellingService;
import de.epages.ws.crossselling.stub.Port_CrossSelling;

final class CrossSellingServiceStubFactoryImpl implements CrossSellingServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(CrossSellingServiceStubFactoryImpl.class);

    @Override
    public Port_CrossSelling create(WebServiceConfiguration config, CrossSellingService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_CrossSelling_SOAPStub stub = (Bind_CrossSelling_SOAPStub) service.getport_CrossSelling(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
