package de.epages.ws.multistoremaster;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.multistoremaster.stub.Bind_MultiStoreMaster_SOAPStub;
import de.epages.ws.multistoremaster.stub.Port_MultiStoreMaster;
import de.epages.ws.multistoremaster.stub.MultiStoreMasterService;

final class MultiStoreMasterServiceStubFactoryImpl implements MultiStoreMasterServiceStubFactory {

    @Override
    public Port_MultiStoreMaster create(WebServiceConfiguration config, MultiStoreMasterService service) {

        try {
            Bind_MultiStoreMaster_SOAPStub stub = (Bind_MultiStoreMaster_SOAPStub) service.getport_MultiStoreMaster(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
