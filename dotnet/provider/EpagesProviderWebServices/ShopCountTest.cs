using System;
using EpagesProviderWebServices.ShopCountServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesProviderWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of ShopCount web service
	/// </summary>
	[TestFixture]
	public class ShopCountTest : WebServiceConfiguration
	{
		ShopCountService shopCountService;

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			shopCountService = new ShopCountService();
			shopCountService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			shopCountService.PreAuthenticate = true;
			shopCountService.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// Tests the web service method getCount()
		/// </summary>
		[Test]
		public void getCount()
		{
			type_GetCount_In GetCount_in = new type_GetCount_In();
			GetCount_in.IsClosed = 2;
			GetCount_in.IsDeleted = 2;
			GetCount_in.IsPreCreated = 2;
			GetCount_in.IsTrialShop = 2;
			GetCount_in.IsInternalTestShop = 2;
			int allShops = shopCountService.getCount(GetCount_in);
			Console.WriteLine("all shops: " + allShops);
			Assert.Greater(allShops, 0, "total shop count is greater 0");

			GetCount_in.IsClosed = 0;
			GetCount_in.IsDeleted = 0;
			GetCount_in.IsPreCreated = 0;
			GetCount_in.IsTrialShop = 0;
			GetCount_in.IsInternalTestShop = 0;
			int liveShops = shopCountService.getCount(GetCount_in);
			Console.WriteLine("live shops: " + liveShops);
			Assert.IsTrue(allShops >= liveShops, "total shop count is greater or equal live shops");
		}

		/// <summary>
		/// Tests the web service method getAllCounts()
		/// </summary>
		[Test]
		public void getAllCounts()
		{
			TShopCount[] shopCounts = shopCountService.getAllCounts();
			Console.WriteLine("number of counters: " + shopCounts.Length);
			Assert.Greater(shopCounts.Length, 0, "at least one counter available");
			
			TShopCount shopCount = shopCounts[0];
			Assert.IsTrue(shopCount.NotTrial_NotClosed >= 0, "shop count is not negative");
			Console.WriteLine("Database: " + shopCount.Database);
			Console.WriteLine("ShopType: " + shopCount.ShopType);
			Console.WriteLine("NotTrial_NotClosed: " + shopCount.NotTrial_NotClosed);
			Console.WriteLine("NotTrial_Closed: " + shopCount.NotTrial_Closed);
			Console.WriteLine("Trial_NotClosed: " + shopCount.Trial_NotClosed);
			Console.WriteLine("Trial_Closed: " + shopCount.Trial_Closed);
			Console.WriteLine("PreCreated: " + shopCount.PreCreated);
		}
	}
}
