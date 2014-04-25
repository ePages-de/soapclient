package de.epages.ws.pricelist2;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pricelist2.stub.Bind_PriceList_SOAPStub;
import de.epages.ws.pricelist2.stub.Port_PriceList;
import de.epages.ws.pricelist2.stub.PriceListService;

final class PriceListServiceStubFactoryImpl implements PriceListServiceStubFactory {

    @Override
    public Port_PriceList create(WebServiceConfiguration config, PriceListService service) {

        try {
            Bind_PriceList_SOAPStub stub = (Bind_PriceList_SOAPStub) service.getport_PriceList(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
