using System;
using NUnit.Framework;
using EpagesProviderWebServices.ShopConfigService3Ref;

namespace EpagesProviderWebServices
{
	/// <summary>
	/// A NUnit Test Class to test all methods of ShopConfig web service
	/// </summary>
	[TestFixture]
	public class ShopConfig3Test : WebServiceConfiguration
	{
		ShopConfigService shopConfigService;
		const string ALIAS = "dotnet_test-1";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			Console.WriteLine("Init");

			// set up the web service object
			shopConfigService = new ShopConfigService();
			shopConfigService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			shopConfigService.PreAuthenticate = true;
			shopConfigService.Url = WEBSERVICE_URL;

			CleanUp();
		}

		[TearDown]
		public void CleanUp()
		{
			Console.WriteLine("CleanUp");

			// delete the shop if it still/already exists
			TShopRef shopRef = new TShopRef();
			shopRef.Alias = ALIAS;
			
			if( shopConfigService.exists(shopRef) )
				shopConfigService.deleteShopRef(shopRef);
		}

		/// <summary>
		/// creates a shop in the databse "Store"
		/// </summary>
		[Test]
		public void shopInStoreDatabase() 
		{
			Console.WriteLine("Test shopInStoreDatabase");

			// create a shop
			TCreateShop Shop_create = new TCreateShop();
			Shop_create.Alias = ALIAS;
			Shop_create.Database = "Store";
			Shop_create.ImportFiles = new String[0];
			Shop_create.ShopAlias = ALIAS;
			Shop_create.ShopType = "ECom100";
			Shop_create.DomainName = "mydomain.com";
            Shop_create.HasSSLCertificateSpecified = true;
            Shop_create.HasSSLCertificate = true;
            Shop_create.IsTrialShopSpecified = true;
            Shop_create.IsTrialShop = true;
            Shop_create.IsInternalTestShopSpecified = false;
            Shop_create.IsInternalTestShop = false;
			
			Console.WriteLine("shopConfigService.create");
			int ShopID = shopConfigService.create(Shop_create);

			Assert.Greater(ShopID, 0, "shop created in Store database");

			// test if a shop reference exists
			TShopRef shopRef = new TShopRef();
			shopRef.Alias = ALIAS;

			Console.WriteLine("shopConfigService.exists");
			bool exists = shopConfigService.exists(shopRef);
			
			Assert.IsTrue(exists, "exists?");

			// get information about a shop
			Console.WriteLine("shopConfigService.getInfo");
			TInfoShop Shop_out = shopConfigService.getInfo(shopRef);
			
			Assert.AreEqual(Shop_create.ShopType, Shop_out.ShopType, "ShopType");
			Assert.AreEqual(Shop_create.HasSSLCertificate, Shop_out.HasSSLCertificate, "HasSSLCertificate");
			Assert.AreEqual(Shop_create.IsTrialShop, Shop_out.IsTrialShop, "IsTrialShop");
			Assert.AreEqual(Shop_create.IsInternalTestShop, Shop_out.IsInternalTestShop, "IsInternalTestShop");
			Assert.AreEqual(Shop_create.DomainName, Shop_out.DomainName, "DomainName");
			Assert.AreEqual(Shop_create.Database, Shop_out.Database, "Database");

			// update the shop
			// - change shop type
			// - change flags HasSSLCertificate, IsTrialShop, IsInternalTestShop 
			// - change domain
			TUpdateShop Shop_update = new TUpdateShop();
			Shop_update.Alias = ALIAS;
			Shop_update.Database = "Store";
			Shop_update.ShopType = "ECom1000";
            Shop_update.HasSSLCertificateSpecified = true;
            Shop_update.HasSSLCertificate = false;
            Shop_update.IsTrialShopSpecified = true;
            Shop_update.IsTrialShop = false;
            Shop_update.IsInternalTestShopSpecified = true;
            Shop_update.IsInternalTestShop = true;
            Shop_update.DomainName = "yourdomain.com";
			
			Console.WriteLine("shopConfigService.update");
			shopConfigService.update(Shop_update);

			// get information about the updated shop
			Console.WriteLine("shopConfigService.getInfo");
			Shop_out = shopConfigService.getInfo(shopRef);

			Assert.AreEqual(Shop_update.ShopType, Shop_out.ShopType, "updated ShopType");
			Assert.AreEqual(Shop_update.HasSSLCertificate, Shop_out.HasSSLCertificate, "updated HasSSLCertificate");
			Assert.AreEqual(Shop_update.IsTrialShop, Shop_out.IsTrialShop, "updated IsTrialShop");
			Assert.AreEqual(Shop_update.IsInternalTestShop, Shop_out.IsInternalTestShop, "updated IsInternalTestShop");
			Assert.AreEqual(Shop_update.DomainName, Shop_out.DomainName, "updated DomainName");
			Assert.AreEqual(Shop_create.Database, Shop_out.Database, "updated Database");

			// get information about all shops
			// WARNING: this can be very slow if there are many shops
			Console.WriteLine("shopConfigService.getAllInfo");
			TInfoShop[] Shops_out = shopConfigService.getAllInfo();

			Assert.Greater(Shops_out.Length, 0, "getAllInfo result count");

			// delete the shop data (leaves the shop history in PBO)
			Console.WriteLine("shopConfigService.delete");
			shopConfigService.delete(shopRef);

			Console.WriteLine("shopConfigService.exists");
			exists = shopConfigService.exists(shopRef);
			Assert.IsTrue(exists, "shop history still exists");

			Console.WriteLine("shopConfigService.getInfo");
			Shop_out = shopConfigService.getInfo(shopRef);
			Assert.IsTrue(Shop_out.IsDeleted, "flag IsDeleted was set");
			// Assert.IsNull(Shop_out.Database, "data was removed from store database");

			// delete the shop completely (including history)
			Console.WriteLine("shopConfigService.deleteShopRef");
			shopConfigService.deleteShopRef(shopRef);

			// check that the shop is really deleted
			Console.WriteLine("shopConfigService.exists");
			exists = shopConfigService.exists(shopRef);
			Assert.IsFalse(exists, "shop is deleted completely");
		}

		/// <summary>
		/// creates a shop in the default database (Database=null)
		/// </summary>
		[Test]
		public void shopInDefaultDatabase()
		{
			Console.WriteLine("Test shopInDefaultDatabase");

			// create a new shop in the default database using default import file
			TCreateShop Shop_create = new TCreateShop();
			Shop_create.Alias = ALIAS;
			Shop_create.Database = "Store";
			Shop_create.ImportFiles = null;
			Shop_create.ShopAlias = ALIAS;
			Shop_create.WebServerScriptNamePart = ALIAS;
			Shop_create.ShopType = "ECom100";
			Shop_create.DomainName = "mydomain.com";
            Shop_create.HasSSLCertificateSpecified = true;
            Shop_create.HasSSLCertificate = false;
            Shop_create.IsTrialShopSpecified = true;
            Shop_create.IsTrialShop = false;
            Shop_create.IsInternalTestShopSpecified = true;
            Shop_create.IsInternalTestShop = false;
			
			Console.WriteLine("shopConfigService.create");
			int ShopID = shopConfigService.create( Shop_create );
			
			Assert.Greater( ShopID, 0, "create in default database" );

			// check in which database the shop was actually created
			TShopRef shopRef = new TShopRef();
			shopRef.Alias = ALIAS;

			Console.WriteLine("shopConfigService.getInfo");
			TInfoShop Shop_out = shopConfigService.getInfo(shopRef);

			Assert.IsNotNull( Shop_out.Database, "default database name" );

			// delete the shop completely (including history)
			Console.WriteLine("shopConfigService.deleteShopRef");
			shopConfigService.deleteShopRef(shopRef);
		}
	}
}
