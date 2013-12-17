package de.epages.ws.catalog8;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.catalog8.stub.Bind_Catalog_SOAPStub;
import de.epages.ws.catalog8.stub.CatalogService;
import de.epages.ws.catalog8.stub.Port_Catalog;

final class CatalogServiceStubFactoryImpl implements CatalogServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(CatalogServiceStubFactoryImpl.class);

    @Override
    public Port_Catalog create(WebServiceConfiguration config, CatalogService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
            try {
                Bind_Catalog_SOAPStub stub = new Bind_Catalog_SOAPStub(config.getWebserviceURL(), service);
                stub.setUsername(config.getUsername());
                stub.setPassword(config.getPassword());
                return stub;
            } catch (AxisFault e) {
                throw new RuntimeException(e);
            }
    }
    
}
