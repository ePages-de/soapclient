package de.epages.webservice.catalog8;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.webservice.WebServiceConfiguration;
import de.epages.webservice.catalog8.stub.Bind_Catalog_SOAPStub;
import de.epages.webservice.catalog8.stub.CatalogService;
import de.epages.webservice.catalog8.stub.Port_Catalog;

class CatalogServiceStubFactoryImpl implements CatalogServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(CatalogServiceStubFactoryImpl.class);

    @Override
    public Port_Catalog create(WebServiceConfiguration config, CatalogService service) {
        log.info("address specified by wsdl: " + service.getport_CatalogAddress());
        log.info("using web service Url: " + config.getWebserviceURL());
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
