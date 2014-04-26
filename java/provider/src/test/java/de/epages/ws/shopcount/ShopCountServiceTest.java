package de.epages.ws.shopcount;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.epages.ws.ProviderWebServiceTestConfiguration;
import de.epages.ws.shopcount.stub.TShopCount;
import de.epages.ws.shopcount.stub.Type_GetCount_In;

public class ShopCountServiceTest {

    private static final ShopCountServiceClient stub = new ShopCountServiceClientImpl(new ProviderWebServiceTestConfiguration());

    @Test
    public void testGetCount() {
        Type_GetCount_In GetCount_In = new Type_GetCount_In();

        // get the total number of shops
        GetCount_In.setIsDeleted(2);
        GetCount_In.setIsPreCreated(2);
        GetCount_In.setIsClosed(2);
        GetCount_In.setIsInternalTestShop(2);
        GetCount_In.setIsTrialShop(2);

        int totalCount = stub.getCount(GetCount_In);

        assertTrue("total Count is positive", totalCount > 0);

        // get the number of live shops
        GetCount_In.setIsDeleted(0);
        GetCount_In.setIsPreCreated(0);
        GetCount_In.setIsClosed(0);
        GetCount_In.setIsInternalTestShop(0);
        GetCount_In.setIsTrialShop(0);
        int liveCount = stub.getCount(GetCount_In);

        assertTrue("live Count is positive", totalCount > 0);
        assertTrue("live Count is less or equal total count", liveCount <= totalCount);
    }

    @Test
    public void testGetAllCounts() {
        TShopCount[] shopCounts = stub.getAllCounts();

        assertTrue("at least one counter available", shopCounts.length > 0);

        TShopCount shopCount = shopCounts[0];
        assertTrue("shop count is not negative", shopCount.getNotTrial_NotClosed() >= 0);

    }
}
