package de.epages.ws.pagecache;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pagecache.stub.PageCacheServiceLocator;
import de.epages.ws.pagecache.stub.Port_PageCache;

public final class PageCacheServiceClientImpl implements PageCacheServiceClient {
    private static final PageCacheServiceLocator serviceLocator = new PageCacheServiceLocator();
    private final Port_PageCache stub;

    public PageCacheServiceClientImpl(WebServiceConfiguration config) {
        this(config, new PageCacheServiceStubFactoryImpl());
    }

    public PageCacheServiceClientImpl(WebServiceConfiguration config, PageCacheServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public void clear() {
        try {
            stub.clear();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
