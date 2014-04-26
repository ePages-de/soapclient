package de.epages.ws.shopconfig7;

import de.epages.ws.ProviderWebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.shopconfig7.stub.*;

import org.junit.*;

import static org.junit.Assert.*;

public class ShopConfigServiceTest {

    private static final ShopConfigServiceClient shopConfigService = new ShopConfigServiceClientImpl(
            new ProviderWebServiceTestConfiguration());

    private static String ALIAS = "java_test-1";
    private static String ALIAS2 = "java_test-2";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void init() {
        cleanUp();
    }

    @After
    public void cleanUp() {
        // delete the shop if it still/already exists
        TShopRef shopRef = new TShopRef();
        shopRef.setAlias(ALIAS);
        if (shopConfigService.exists(shopRef))
            shopConfigService.deleteShopRef(shopRef);

        shopRef.setAlias(ALIAS2);
        if (shopConfigService.exists(shopRef))
            shopConfigService.deleteShopRef(shopRef);
    }

    @Test
    public void shopInStoreDatabase() {
        // create a shop
        TCreateShop Shop_create = new TCreateShop();
        Shop_create.setAlias(ALIAS);
        Shop_create.setDatabase("Store");
        Shop_create.setImportFiles(null);
        Shop_create.setShopAlias(ALIAS);
        Shop_create.setShopType("ECom100");
        Shop_create.setDomainName("mydomain.com");
        Shop_create.setSecondaryDomains(new String[] { "herdomain.com", "hisdomain.com" });
        Shop_create.setHasSSLCertificate(true);
        Shop_create.setIsTrialShop(true);
        Shop_create.setIsInternalTestShop(false);
        Shop_create.setMerchantLogin("max");
        Shop_create.setMerchantPassword("123456");
        Shop_create.setMerchantEMail("max@nowhere.de");

        int ShopID = shopConfigService.create(Shop_create);

        assertTrue("shop created in Store database", ShopID > 0);

        // test if a shop reference exists
        TShopRef shopRef = new TShopRef();
        shopRef.setAlias(ALIAS);

        TInfoShop_Input shopInfo = new TInfoShop_Input();
        shopInfo.setAlias(ALIAS);

        boolean exists = shopConfigService.exists(shopRef);

        assertTrue("exists?", exists);

        // get information about a shop

        TInfoShop Shop_out = shopConfigService.getInfo(shopInfo);

        assertEquals("ShopType", Shop_create.getShopType(), Shop_out.getShopType());
        assertEquals("HasSSLCertificate", Shop_create.getHasSSLCertificate(), Shop_out.isHasSSLCertificate());
        assertEquals("IsTrialShop", Shop_create.getIsTrialShop(), Shop_out.isIsTrialShop());
        assertEquals("IsInternalTestShop", Shop_create.getIsInternalTestShop(), Shop_out.isIsInternalTestShop());
        assertEquals("DomainName", Shop_create.getDomainName(), Shop_out.getDomainName());
        assertEquals("SecondaryDomains", Shop_create.getSecondaryDomains(), Shop_out.getSecondaryDomains());
        assertEquals("Database", Shop_create.getDatabase(), Shop_out.getDatabase());
        assertEquals("MerchantLogin", Shop_create.getMerchantLogin(), Shop_out.getMerchantLogin());
        assertEquals("MerchantEMail", Shop_create.getMerchantEMail(), Shop_out.getMerchantEMail());

        // update the shop
        // - change shop type
        // - change flags HasSSLCertificate, IsTrialShop, IsInternalTestShop
        // - change domain
        TUpdateShop Shop_update = new TUpdateShop();
        Shop_update.setAlias(ALIAS);
        Shop_update.setDatabase("Store");
        Shop_update.setShopType("ECom1000");
        Shop_update.setHasSSLCertificate(false);
        Shop_update.setIsTrialShop(false);
        Shop_update.setIsInternalTestShop(true);
        Shop_update.setDomainName("yourdomain.com");
        Shop_update.setSecondaryDomains(new String[] { "ourdomain.com", "theirdomain.com" });
        Shop_update.setMarkedForDelete(true);
        Shop_update.setShopAlias(ALIAS2);

        // update some shop attributes
        TAttribute attribute = new TAttribute();
        attribute.setType("String");
        attribute.setName("AdditionalHtmlHead");
        attribute.setValue("<meta name=\"keywords\", content=\"webservice test\" />");
        Shop_update.setAttributes(new TAttribute[] { attribute });

        shopConfigService.update(Shop_update);

        // get information about the updated shop

        shopInfo.setAttributes(new String[] { "AdditionalHtmlHead" }); // optional
        Shop_out = shopConfigService.getInfo(shopInfo);

        assertEquals("updated ShopType", Shop_update.getShopType(), Shop_out.getShopType());
        assertEquals("updated HasSSLCertificate", Shop_update.getHasSSLCertificate(), Shop_out.isHasSSLCertificate());
        assertEquals("updated IsTrialShop", Shop_update.getIsTrialShop(), Shop_out.isIsTrialShop());
        assertEquals("updated IsInternalTestShop", Shop_update.getIsInternalTestShop(), Shop_out.isIsInternalTestShop());
        assertEquals("updated DomainName", Shop_update.getDomainName(), Shop_out.getDomainName());
        assertEquals("updated SecondaryDomains", Shop_update.getSecondaryDomains(), Shop_out.getSecondaryDomains());
        assertEquals("updated Database", Shop_create.getDatabase(), Shop_out.getDatabase());
        assertEquals("updated ShopAlias", ALIAS2, Shop_out.getObjectAlias());
        assertEquals("updated ShopObjectPath", "/Shops/".concat(ALIAS2), Shop_out.getObjectPath());
        assertNotNull("marked for delete on", Shop_out.getMarkedForDelOn());

        assertNotNull("updates Attributes exist", Shop_out.getAttributes());
        assertEquals("number of updates Attributes exist", 1, Shop_out.getAttributes().length);
        assertEquals("updated Attributes", Shop_update.getAttributes()[0].getValue(), Shop_out.getAttributes()[0].getValue());

        // rename shopref
        TInfoShop_Input shopInfo2 = new TInfoShop_Input();
        shopInfo2.setAlias(ALIAS);

        TUpdateShop Shop_update2 = new TUpdateShop();
        Shop_update2.setAlias(ALIAS);
        Shop_update2.setNewAlias(ALIAS2);

        shopConfigService.update(Shop_update2);

        // test if a shop reference exists
        TShopRef shopRef2 = new TShopRef();
        shopRef2.setAlias(ALIAS2);

        exists = shopConfigService.exists(shopRef2);

        assertTrue("exists?", exists);

        Shop_update2.setAlias(ALIAS2);
        Shop_update2.setNewAlias(ALIAS);

        shopConfigService.update(Shop_update2);

        exists = shopConfigService.exists(shopRef);

        assertTrue("exists?", exists);

        // get information about all shops
        // WARNING: this can be very slow if there are many shops

        TInfoShop[] Shops_out = shopConfigService.getAllInfo();

        assertTrue("getAllInfo result count", Shops_out.length > 0);

        // set secondary domain names

        String[] secondaryDomains = { "invaliddomain.com", "updateddomain.com" };
        shopConfigService.setSecondaryDomains(shopRef, secondaryDomains);
        Shop_out = shopConfigService.getInfo(shopInfo);
        assertEquals("set SecondaryDomains", secondaryDomains, Shop_out.getSecondaryDomains());

        // delete the shop data (leaves the shop history in PBO)

        shopConfigService.delete(shopRef);

        exists = shopConfigService.exists(shopRef);
        assertTrue("shop history still exists", exists);

        Shop_out = shopConfigService.getInfo(shopInfo);
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
        // create a new shop in the default database using default import file
        TCreateShop Shop_create = new TCreateShop();
        Shop_create.setAlias(ALIAS);
        Shop_create.setDatabase("Store");
        Shop_create.setImportFiles(null);
        Shop_create.setShopAlias(ALIAS);
        Shop_create.setWebServerScriptNamePart(ALIAS);
        Shop_create.setShopType("ECom100");
        Shop_create.setDomainName("mydomain.com");
        Shop_create.setHasSSLCertificate(false);
        Shop_create.setIsTrialShop(false);
        Shop_create.setIsInternalTestShop(false);

        int ShopID = shopConfigService.create(Shop_create);

        assertTrue("create in default database", ShopID > 0);

        // check in which database the shop was actually created
        TShopRef shopRef = new TShopRef();
        shopRef.setAlias(ALIAS);

        TInfoShop_Input shopInfo = new TInfoShop_Input();
        shopInfo.setAlias(ALIAS);

        TInfoShop Shop_out = shopConfigService.getInfo(shopInfo);

        assertNotNull("default database name", Shop_out.getDatabase());

        // delete the shop completely (including history)
        shopConfigService.deleteShopRef(shopRef);
    }
}
