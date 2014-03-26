package de.epages.ws.pagecache;

import de.epages.ws.pagecache.stub.Port_PageCache;

public interface PageCacheServiceClient extends Port_PageCache {

    /**
     * deletes all cached pages of the shop
     */
    void clear();

}
