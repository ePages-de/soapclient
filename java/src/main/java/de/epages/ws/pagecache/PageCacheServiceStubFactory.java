package de.epages.ws.pagecache;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.pagecache.stub.PageCacheService;
import de.epages.ws.pagecache.stub.Port_PageCache;

public interface PageCacheServiceStubFactory {
    Port_PageCache create(WebServiceConfiguration config, PageCacheService service);
}
