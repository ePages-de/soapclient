using System;
using NUnit.Framework;
using EpagesProviderWebServices.ShopConfigService6Ref;
using EpagesProviderWebServices.SimpleProvisioningServiceRef;

namespace EpagesProviderWebServices
{
	/// <summary>
	/// A NUnit Test Class to test all methods of ShopConfig web service
	/// </summary>
	[TestFixture]
	public class SimpleProvisioningTest : WebServiceConfiguration
	{
		SimpleProvisioningService simpleProvisioningService;
		const string ALIAS = "dotnet_test-1";
        const string NEW_ALIAS = "dotnet_test-2";
        const string DATABASE = "Store"; // default database

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			Console.WriteLine("Init");

			// set up the web service object
			simpleProvisioningService = new SimpleProvisioningService();
			simpleProvisioningService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			simpleProvisioningService.PreAuthenticate = true;
			simpleProvisioningService.Url = WEBSERVICE_URL;

			CleanUp();
		}

		[TearDown]
		public void CleanUp()
		{
			Console.WriteLine("CleanUp");

			// delete the shop if it still/already exists
            deleteIfExists(ALIAS);
            deleteIfExists(NEW_ALIAS);
		}

        private void deleteIfExists(string alias)
        {
            ShopConfigService shopConfigService = new ShopConfigService();
            shopConfigService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
            shopConfigService.PreAuthenticate = true;
            shopConfigService.Url = WEBSERVICE_URL;

            EpagesProviderWebServices.ShopConfigService6Ref.TShopRef shopRef = new EpagesProviderWebServices.ShopConfigService6Ref.TShopRef();
            shopRef.Alias = ALIAS;
            if (shopConfigService.exists(shopRef))
            {
                shopConfigService.deleteShopRef(shopRef);
            }

            shopRef.Alias = NEW_ALIAS;
            if (shopConfigService.exists(shopRef))
            {
                shopConfigService.deleteShopRef(shopRef);
            }
        }

		[Test]
		public void TestSuite() 
		{
            Console.WriteLine("Test TestSuite");

			// create a shop
            EpagesProviderWebServices.SimpleProvisioningServiceRef.TCreateShop Shop_create = new EpagesProviderWebServices.SimpleProvisioningServiceRef.TCreateShop();
			Shop_create.Alias = ALIAS;
			Shop_create.ShopType = "ECom100";
            Shop_create.IsClosedSpecified = true;
            Shop_create.IsClosed = false;
            Shop_create.IsTrialShopSpecified = true;
            Shop_create.IsTrialShop = true;
            Shop_create.IsInternalTestShopSpecified = false;
            Shop_create.IsInternalTestShop = false;
            Shop_create.DomainName = "mydomain.com";
            Shop_create.HasSSLCertificateSpecified = true;
            Shop_create.HasSSLCertificate = false;
            Shop_create.MerchantLogin = "max";
            Shop_create.MerchantPassword = "123456";
            Shop_create.MerchantEMail = "max@nowhere.de";

			Console.WriteLine("simpleProvisioningService.create");
			simpleProvisioningService.create(Shop_create);

			// test if a shop exists
            EpagesProviderWebServices.SimpleProvisioningServiceRef.TShopRef shopRef = new EpagesProviderWebServices.SimpleProvisioningServiceRef.TShopRef();
			shopRef.Alias = ALIAS;

			Console.WriteLine("simpleProvisioningService.exists");
			bool exists = simpleProvisioningService.exists(shopRef);
			
			Assert.IsTrue(exists, "exists?");

			// get information about a shop
            Console.WriteLine("simpleProvisioningService.getInfo");
            EpagesProviderWebServices.SimpleProvisioningServiceRef.TInfoShop Shop_out = simpleProvisioningService.getInfo(shopRef);

            Assert.AreEqual(Shop_create.Alias, Shop_out.Alias, "Alias");
            Assert.AreEqual(Shop_create.ShopType, Shop_out.ShopType, "ShopType");
            Assert.AreEqual(DATABASE, Shop_out.Database, "Database");
            Assert.AreEqual(Shop_create.DomainName, Shop_out.DomainName, "DomainName");
            Assert.AreEqual(Shop_create.HasSSLCertificate, Shop_out.HasSSLCertificate, "HasSSLCertificate");
            Assert.IsFalse(Shop_out.IsDeleted, "IsDeleted");
            Assert.AreEqual(Shop_create.IsTrialShop, Shop_out.IsTrialShop, "IsTrialShop");
            Assert.AreEqual(Shop_create.IsInternalTestShop, Shop_out.IsInternalTestShop, "IsInternalTestShop");
            Assert.AreEqual(Shop_create.MerchantLogin, Shop_out.MerchantLogin, "MerchantLogin");
            Assert.AreEqual(Shop_create.MerchantEMail, Shop_out.MerchantEMail, "MerchantEMail");
            Assert.AreEqual(Shop_out.LastMerchantLoginDate, new DateTime(1,1,1), "LastMerchantLoginDate");
            Assert.IsFalse(Shop_out.IsMarkedForDel, "IsMarkedForDel");
            Assert.AreEqual("http://" + Shop_create.DomainName + "/epages/" + ALIAS + ".sf", Shop_out.StorefrontURL, "StorefrontURL");
            Assert.IsTrue(Shop_out.BackofficeURL.EndsWith("://" + Shop_create.DomainName + "/epages/" + ALIAS + ".admin"), "BackofficeURL");
            
            // update the shop
            EpagesProviderWebServices.SimpleProvisioningServiceRef.TUpdateShop Shop_update = new EpagesProviderWebServices.SimpleProvisioningServiceRef.TUpdateShop();
			Shop_update.Alias = ALIAS;
            Shop_update.ShopType = "ECom1000";
            Shop_update.IsClosed = true;
            Shop_update.IsClosedSpecified = true;
            Shop_update.IsTrialShopSpecified = true;
            Shop_update.IsTrialShop = false;
            Shop_update.IsInternalTestShopSpecified = true;
            Shop_update.IsInternalTestShop = true;
            Shop_update.DomainName = "yourdomain.com";
            Shop_update.MerchantLogin = "gabi";
            Shop_update.MerchantPassword = "654321";
            Shop_update.MerchantEMail = "gabi@nowhere.de";

			Console.WriteLine("simpleProvisioningService.update");
			simpleProvisioningService.update(Shop_update);

			Console.WriteLine("simpleProvisioningService.getInfo");
            Shop_out = simpleProvisioningService.getInfo(shopRef);

			Assert.AreEqual(Shop_update.ShopType, Shop_out.ShopType, "updated ShopType");
			Assert.AreEqual(Shop_update.IsTrialShop, Shop_out.IsTrialShop, "updated IsTrialShop");
			Assert.AreEqual(Shop_update.IsInternalTestShop, Shop_out.IsInternalTestShop, "updated IsInternalTestShop");
			Assert.AreEqual(Shop_update.DomainName, Shop_out.DomainName, "updated DomainName");
            Assert.AreEqual(DATABASE, Shop_out.Database, "updated Database");
            Assert.AreEqual(Shop_update.MerchantLogin, Shop_out.MerchantLogin, "updated MerchantLogin");
            Assert.AreEqual(Shop_update.MerchantEMail, Shop_out.MerchantEMail, "updated MerchantEMail");
            Assert.IsFalse(Shop_out.IsMarkedForDel);
            Assert.AreEqual("http://" + Shop_update.DomainName + "/epages/" + ALIAS + ".sf", Shop_out.StorefrontURL, "updated StorefrontURL");

            // rename
            EpagesProviderWebServices.SimpleProvisioningServiceRef.TRename_Input Shop_rename = new EpagesProviderWebServices.SimpleProvisioningServiceRef.TRename_Input();
            Shop_rename.Alias = ALIAS;
            Shop_rename.NewAlias = NEW_ALIAS;

            Console.WriteLine("simpleProvisioningService.rename");
            simpleProvisioningService.rename(Shop_rename);

            EpagesProviderWebServices.SimpleProvisioningServiceRef.TShopRef shopRefNew = new EpagesProviderWebServices.SimpleProvisioningServiceRef.TShopRef();
            shopRefNew.Alias = NEW_ALIAS;

            Console.WriteLine("simpleProvisioningService.exists");
            exists = simpleProvisioningService.exists(shopRef);
            Assert.IsFalse(exists, "old alias no longer exists");

            Console.WriteLine("simpleProvisioningService.exists");
            exists = simpleProvisioningService.exists(shopRefNew);
            Assert.IsTrue(exists, "new alias exists");

            Console.WriteLine("simpleProvisioningService.getInfo");
            Shop_out = simpleProvisioningService.getInfo(shopRefNew);

            Assert.AreEqual(NEW_ALIAS, Shop_out.Alias, "renamed ShopRefAlias");
            Assert.AreEqual("http://" + Shop_update.DomainName + "/epages/" + NEW_ALIAS + ".sf", Shop_out.StorefrontURL, "renamed StorefrontURL");

			// mark the shop for deletion
            Console.WriteLine("simpleProvisioningService.markForDeletion");
			simpleProvisioningService.markForDeletion(shopRefNew);

			Console.WriteLine("simpleProvisioningService.exists");
            exists = simpleProvisioningService.exists(shopRefNew);
			Assert.IsTrue(exists, "shop still exists");

			Console.WriteLine("simpleProvisioningService.getInfo");
            Shop_out = simpleProvisioningService.getInfo(shopRefNew);
            Assert.IsTrue(Shop_out.IsClosed, "deleted IsClosed");
            Assert.IsFalse(Shop_out.IsDeleted, "deleted IsDeleted");
            Assert.IsTrue(Shop_out.IsMarkedForDel, "deleted IsMarkedForDel");

            deleteIfExists(NEW_ALIAS);
        }

		[Test]
		public void Defaults()
		{
			Console.WriteLine("Test Defaults");

            // create a new shop with a minimum amount of data
            EpagesProviderWebServices.SimpleProvisioningServiceRef.TCreateShop Shop_create = new EpagesProviderWebServices.SimpleProvisioningServiceRef.TCreateShop();
            Shop_create.Alias = ALIAS;
			Shop_create.ShopType = "ECom100";
			
			Console.WriteLine("simpleProvisioningService.create");
			simpleProvisioningService.create( Shop_create );
			

            EpagesProviderWebServices.SimpleProvisioningServiceRef.TShopRef shopRef = new EpagesProviderWebServices.SimpleProvisioningServiceRef.TShopRef();
            shopRef.Alias = ALIAS;

			Console.WriteLine("simpleProvisioningService.getInfo");
            EpagesProviderWebServices.SimpleProvisioningServiceRef.TInfoShop Shop_out = simpleProvisioningService.getInfo(shopRef);

            Assert.AreEqual(Shop_create.ShopType, Shop_out.ShopType, "default ShopType");
            Assert.AreEqual(DATABASE, Shop_out.Database, "default Database");
            Assert.IsNull(Shop_out.DomainName, "default DomainName");
            Assert.IsFalse(Shop_out.HasSSLCertificate, "default HasSSLCertificate");
            Assert.IsFalse(Shop_out.IsDeleted, "default IsDeleted");
            Assert.IsFalse(Shop_out.IsTrialShop, "default IsTrialShop");
            Assert.IsFalse(Shop_out.IsInternalTestShop, "default IsInternalTestShop");
            Assert.AreEqual("admin", Shop_out.MerchantLogin, "default MerchantLogin");
            Assert.IsNull(Shop_out.MerchantEMail, "Mdefault erchantEMail");
            Assert.AreEqual(Shop_out.LastMerchantLoginDate, new DateTime(1, 1, 1), "default LastMerchantLoginDate");
            Assert.IsFalse(Shop_out.IsMarkedForDel, "Idefault sMarkedForDel");
            Assert.IsTrue(Shop_out.StorefrontURL.EndsWith("/epages/" + ALIAS + ".sf"), "default StorefrontURL");

            deleteIfExists(ALIAS);
		}
	}
}
