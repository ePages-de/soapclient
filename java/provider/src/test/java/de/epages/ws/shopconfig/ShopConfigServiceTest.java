package de.epages.ws.shopconfig;

import de.epages.ws.ProviderWebServiceTestConfiguration;
import de.epages.ws.shopconfig.stub.*;

import org.junit.*;

import static org.junit.Assert.*;

public class ShopConfigServiceTest {

    private static final ShopConfigServiceClient shopConfigService = new ShopConfigServiceClientImpl(
            new ProviderWebServiceTestConfiguration());

    private static String ALIAS = "java_test-1";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void init() {
        // set up the web service object
        cleanUp();
    }

    @After
    public void cleanUp() {
        // delete the shop if it still/already exists
        TShopRef shopRef = new TShopRef();
        shopRef.setAlias(ALIAS);

        if (shopConfigService.exists(shopRef)) {
            shopConfigService.deleteShopRef(shopRef);
        }
    }

    @Test
    public void shopInStoreDatabase() {
        // create a shop
        TCreateShop Shop_create = new TCreateShop();
        Shop_create.setAlias(ALIAS);
        Shop_create.setDatabase("Store");
        Shop_create.setImportFiles(new String[0]);
        Shop_create.setShopAlias(ALIAS);
        Shop_create.setShopType("ECom100");
        Shop_create.setDomainName("mydomain.com");

        int ShopID = shopConfigService.create(Shop_create);

        assertTrue("shop created in Store database", ShopID > 0);

        // test if a shop reference exists
        TShopRef shopRef = new TShopRef();
        shopRef.setAlias(ALIAS);

        boolean exists = shopConfigService.exists(shopRef);

        assertTrue("exists?", exists);

        // get information about a shop
        TInfoShop Shop_out = shopConfigService.getInfo(shopRef);

        assertEquals("ShopType", Shop_create.getShopType(), Shop_out.getShopType());
        assertEquals("DomainName", Shop_create.getDomainName(), Shop_out.getDomainName());
        assertEquals("Database", Shop_create.getDatabase(), Shop_out.getDatabase());

        // update the shop
        // - change shop type
        // - change flags HasSSLCertificate, IsTrialShop, IsInternalTestShop
        // - change domain
        TUpdateShop Shop_update = new TUpdateShop();
        Shop_update.setAlias(ALIAS);
        Shop_update.setDatabase("Store");
        Shop_update.setShopType("ECom1000");
        Shop_update.setDomainName("yourdomain.com");

        shopConfigService.update(Shop_update);

        // get information about the updated shop
        Shop_out = shopConfigService.getInfo(shopRef);

        assertEquals("updated ShopType", Shop_update.getShopType(), Shop_out.getShopType());
        assertEquals("updated DomainName", Shop_update.getDomainName(), Shop_out.getDomainName());
        assertEquals("updated Database", Shop_create.getDatabase(), Shop_out.getDatabase());

        // get information about all shops
        // WARNING: this can be very slow if there are many shops
        TInfoShop[] Shops_out = shopConfigService.getAllInfo();

        assertTrue("getAllInfo result count", Shops_out.length > 0);

        // delete the shop data (leaves the shop history in PBO)
        shopConfigService.delete(shopRef);

        exists = shopConfigService.exists(shopRef);
        assertTrue("shop history still exists", exists);

        Shop_out = shopConfigService.getInfo(shopRef);
        assertTrue("flag IsDeleted was set", Shop_out.isIsDeleted());
        // Assert.IsNull(Shop_out.Database,
        // "data was removed from store database");

        // delete the shop completely (including history)
        shopConfigService.deleteShopRef(shopRef);

        // check that the shop is really deleted
        exists = shopConfigService.exists(shopRef);
        assertFalse("shop is deleted completely", exists);
    }

    @Test
    public void shopInDefaultDatabase() {
        // create a new shop in the default database using default import
        // file
        TCreateShop Shop_create = new TCreateShop();
        Shop_create.setAlias(ALIAS);
        Shop_create.setDatabase("Store");
        Shop_create.setImportFiles(new String[0]);
        Shop_create.setShopAlias(ALIAS);
        Shop_create.setShopType("ECom100");
        Shop_create.setDomainName("mydomain.com");

        int ShopID = shopConfigService.create(Shop_create);

        assertTrue("create in default database", ShopID > 0);

        // check in which database the shop was actually created
        TShopRef shopRef = new TShopRef();
        shopRef.setAlias(ALIAS);

        TInfoShop Shop_out = shopConfigService.getInfo(shopRef);

        assertNotNull("default database name", Shop_out.getDatabase());

        // delete the shop completely (including history)
        shopConfigService.deleteShopRef(shopRef);
    }
}
