package de.epages.ws.shopconfig5;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shopconfig5.stub.ShopConfigService;
import de.epages.ws.shopconfig5.stub.Bind_ShopConfig_SOAPStub;
import de.epages.ws.shopconfig5.stub.Port_ShopConfig;

final class ShopConfigServiceStubFactoryImpl implements ShopConfigServiceStubFactory {

    @Override
    public Port_ShopConfig create(WebServiceConfiguration config, ShopConfigService service) {

        try {
            Bind_ShopConfig_SOAPStub stub = (Bind_ShopConfig_SOAPStub) service.getport_ShopConfig(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
