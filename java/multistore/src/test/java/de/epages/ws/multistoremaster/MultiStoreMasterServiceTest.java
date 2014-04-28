package de.epages.ws.multistoremaster;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.epages.ws.EnableMultiStoreTest;
import de.epages.ws.MultiStoreMasterWebServiceTestConfiguration;
import de.epages.ws.multistoremaster.model.TBuildShopUrl_In;

public class MultiStoreMasterServiceTest {

    @Before
    public void checkMultiStore() {
        assumeTrue("checking SystemProperty runMSTests", EnableMultiStoreTest.checkMSTestsProperty());
    }

    @Test
    @Ignore
    public void testBuildShopUrl() {
        final MultiStoreMasterServiceClient service = new MultiStoreMasterServiceClientImpl(
                new MultiStoreMasterWebServiceTestConfiguration());
        TBuildShopUrl_In buildShopUrl = new TBuildShopUrl_In("MultiStore", "ABC");
        String shopUrl = service.buildShopUrl("MasterShop", buildShopUrl);
        assertNotNull(shopUrl);
    }
}
