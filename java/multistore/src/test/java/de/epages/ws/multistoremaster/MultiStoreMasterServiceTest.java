package de.epages.ws.multistoremaster;

import static org.junit.Assert.assertNotNull;

import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;

import de.epages.ws.EnableMultiStoreTestsRule;
import de.epages.ws.MultiStoreMasterTestConfiguration;
import de.epages.ws.multistoremaster.model.TBuildShopUrl_In;

public class MultiStoreMasterServiceTest {

    @ClassRule
    public static final EnableMultiStoreTestsRule checkMultistore = EnableMultiStoreTestsRule.INSTANCE;

    @Test
    @Ignore("not finished: need to get a BasketGUID.")
    public void testBuildShopUrl() {
        final MultiStoreMasterServiceClient service = new MultiStoreMasterServiceClientImpl(
                new MultiStoreMasterTestConfiguration());
        TBuildShopUrl_In buildShopUrl = new TBuildShopUrl_In("MultiStore", "ABC");
        String shopUrl = service.buildShopUrl("MasterShop", buildShopUrl);
        assertNotNull(shopUrl);
    }
}
