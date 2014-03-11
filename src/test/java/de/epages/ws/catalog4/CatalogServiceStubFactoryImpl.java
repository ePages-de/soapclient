package de.epages.ws.catalog4;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.catalog4.stub.Bind_Catalog_SOAPStub;
import de.epages.ws.catalog4.stub.CatalogService;
import de.epages.ws.catalog4.stub.Port_Catalog;

final class CatalogServiceStubFactoryImpl implements CatalogServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(CatalogServiceStubFactoryImpl.class);

    @Override
    public Port_Catalog create(WebServiceConfiguration config, CatalogService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_Catalog_SOAPStub stub = (Bind_Catalog_SOAPStub) service.getport_Catalog(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
