package de.epages.ws.shopcount;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.shopcount.stub.ShopCountService;
import de.epages.ws.shopcount.stub.Bind_ShopCount_SOAPStub;
import de.epages.ws.shopcount.stub.Port_ShopCount;

final class ShopCountServiceStubFactoryImpl implements ShopCountServiceStubFactory {

    @Override
    public Port_ShopCount create(WebServiceConfiguration config, ShopCountService service) {

        try {
            Bind_ShopCount_SOAPStub stub = (Bind_ShopCount_SOAPStub) service.getport_ShopCount(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
