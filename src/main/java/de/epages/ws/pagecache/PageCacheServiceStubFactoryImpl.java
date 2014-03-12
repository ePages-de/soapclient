package de.epages.ws.pagecache;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pagecache.stub.Bind_PageCache_SOAPStub;
import de.epages.ws.pagecache.stub.PageCacheService;
import de.epages.ws.pagecache.stub.Port_PageCache;

final class PageCacheServiceStubFactoryImpl implements PageCacheServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(PageCacheServiceStubFactoryImpl.class);

    @Override
    public Port_PageCache create(WebServiceConfiguration config, PageCacheService serviceLocator) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_PageCache_SOAPStub stub = (Bind_PageCache_SOAPStub) serviceLocator
                    .getport_PageCache(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
