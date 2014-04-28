package de.epages.ws.pagecache;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pagecache.stub.Bind_PageCache_SOAPStub;
import de.epages.ws.pagecache.stub.PageCacheService;
import de.epages.ws.pagecache.stub.Port_PageCache;

final class PageCacheServiceStubFactoryImpl implements PageCacheServiceStubFactory {

    @Override
    public Port_PageCache create(WebServiceConfiguration config, PageCacheService serviceLocator) {

        try {
            Bind_PageCache_SOAPStub stub = (Bind_PageCache_SOAPStub) serviceLocator.getport_PageCache(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
