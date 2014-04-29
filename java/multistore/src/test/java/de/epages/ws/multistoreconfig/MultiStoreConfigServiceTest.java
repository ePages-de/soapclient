package de.epages.ws.multistoreconfig;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import de.epages.ws.EnableMultiStoreTestsRule;
import de.epages.ws.ProviderWebServiceTestConfiguration;
import de.epages.ws.multistoreconfig.MultiStoreConfigServiceClient;
import de.epages.ws.multistoreconfig.MultiStoreConfigServiceClientImpl;
import de.epages.ws.multistoreconfig.stub.TInfoMultiStoreConfig;
import de.epages.ws.multistoreconfig.stub.TShopRef;
import de.epages.ws.shopconfig6.ShopConfigServiceClient;
import de.epages.ws.shopconfig6.ShopConfigServiceClientImpl;
import de.epages.ws.shopconfig6.stub.TCreateShop;

@FixMethodOrder(value=MethodSorters.NAME_ASCENDING)
public class MultiStoreConfigServiceTest {

    @ClassRule
    public static final EnableMultiStoreTestsRule checkMultistore = EnableMultiStoreTestsRule.INSTANCE;

    private static final String MASTER_SHOP_ALIAS = "MasterShop_WSTest";

    private static final MultiStoreConfigServiceClient service = new MultiStoreConfigServiceClientImpl(new ProviderWebServiceTestConfiguration());

    private static final ShopConfigServiceClient shopConfig = new ShopConfigServiceClientImpl(new ProviderWebServiceTestConfiguration());

    @BeforeClass
    public static void createMaster() {
        if(!shopExists(MASTER_SHOP_ALIAS)) {
            TCreateShop createShopData = new TCreateShop();
            createShopData.setAlias(MASTER_SHOP_ALIAS);
            createShopData.setShopAlias(MASTER_SHOP_ALIAS);
            createShopData.setShopType("Demo");
            createShopData.setDatabase("Master");
            shopConfig.create(createShopData);
        }
    }

    @AfterClass
    public static void deleteMaster() {
        if(shopExists(MASTER_SHOP_ALIAS)) {
            de.epages.ws.shopconfig6.stub.TShopRef dropShopData = new de.epages.ws.shopconfig6.stub.TShopRef();
            dropShopData.setAlias(MASTER_SHOP_ALIAS);
            shopConfig.delete(dropShopData);
        }
    }

    private static boolean shopExists(String alias) {
        de.epages.ws.shopconfig6.stub.TShopRef shopRef = new de.epages.ws.shopconfig6.stub.TShopRef();
        shopRef.setAlias(alias);
        return shopConfig.exists(shopRef);
    }

    @Test
    public void testGetInfo() {
        TShopRef shopInfo = new TShopRef(MASTER_SHOP_ALIAS);
        TInfoMultiStoreConfig result = service.getInfo(shopInfo);
        assertEquals(MASTER_SHOP_ALIAS, result.getAlias());
        assertArrayEquals(new String[] {}, result.getSubShops());
    }
}
