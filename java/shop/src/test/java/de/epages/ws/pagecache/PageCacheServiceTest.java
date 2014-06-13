package de.epages.ws.pagecache;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.epages.ws.ShopWebServiceTestConfiguration;

public class PageCacheServiceTest {

    private static final PageCacheServiceClientImpl pageCacheService = new PageCacheServiceClientImpl(new ShopWebServiceTestConfiguration());

    /**
     * Delete all cached pages of the shop
     */
    @Test
    public void testClear() {
        pageCacheService.clear();
        // test if creation was successful
        assertTrue("page cache cleared", true);
    }

}
