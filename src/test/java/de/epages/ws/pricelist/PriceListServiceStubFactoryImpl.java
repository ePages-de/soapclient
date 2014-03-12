package de.epages.ws.pricelist;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pricelist.stub.Bind_PriceList_SOAPStub;
import de.epages.ws.pricelist.stub.Port_PriceList;
import de.epages.ws.pricelist.stub.PriceListService;

final class PriceListServiceStubFactoryImpl implements PriceListServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(PriceListServiceStubFactoryImpl.class);

    @Override
    public Port_PriceList create(WebServiceConfiguration config, PriceListService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
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
