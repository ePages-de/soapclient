package de.epages.ws.crossselling2;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.crossselling2.stub.Bind_CrossSelling_SOAPStub;
import de.epages.ws.crossselling2.stub.CrossSellingService;
import de.epages.ws.crossselling2.stub.Port_CrossSelling;

final class CrossSellingServiceStubFactoryImpl implements CrossSellingServiceStubFactory {

    @Override
    public Port_CrossSelling create(WebServiceConfiguration config, CrossSellingService service) {

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
