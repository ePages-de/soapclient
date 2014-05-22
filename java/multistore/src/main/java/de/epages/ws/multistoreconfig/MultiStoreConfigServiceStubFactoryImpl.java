package de.epages.ws.multistoreconfig;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.multistoreconfig.stub.Bind_MultiStoreConfig_SOAPStub;
import de.epages.ws.multistoreconfig.stub.Port_MultiStoreConfig;
import de.epages.ws.multistoreconfig.stub.MultiStoreConfigService;

final class MultiStoreConfigServiceStubFactoryImpl implements MultiStoreConfigServiceStubFactory {

    @Override
    public Port_MultiStoreConfig create(WebServiceConfiguration config, MultiStoreConfigService service) {

        try {
            Bind_MultiStoreConfig_SOAPStub stub = (Bind_MultiStoreConfig_SOAPStub) service.getport_MultiStoreConfig(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
