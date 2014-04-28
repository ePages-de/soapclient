using System;
using EpagesWebServices.ShippingMethodServiceRef;
using NUnit.Framework;

namespace EpagesWebServices
{

	/// <summary>
	/// NUnit Test for ShippingMethod
	/// </summary>
	[TestFixture]
	public class ShippingMethodTest : WebServiceConfiguration
	{
        ShippingMethodService shippingMethodService;

		[SetUp]
		public void Init()
		{
            shippingMethodService = new ShippingMethodService();
			shippingMethodService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			shippingMethodService.PreAuthenticate = true;
			shippingMethodService.Url = WEBSERVICE_URL;
		}
		
		[Test]
		public void getList()
		{
			TGetList_Return[] ShippingMethod_out = shippingMethodService.getList();

			// test if transfer was successful
			Assert.AreEqual(3, ShippingMethod_out.GetLength(0), "getList result count");
			
			TGetList_Return shippingMethod0 = ShippingMethod_out[0];
			Assert.AreEqual( shippingMethod0.Path, "/Shops/DemoShop/ShippingMethods/Post", "shipping method: Post" );

			TGetList_Return shippingMethod1 = ShippingMethod_out[1];
			Assert.AreEqual( shippingMethod1.Path, "/Shops/DemoShop/ShippingMethods/Express", "shipping method: Express" );


			TGetList_Return shippingMethod2 = ShippingMethod_out[2];
			Assert.AreEqual( shippingMethod2.Path, "/Shops/DemoShop/ShippingMethods/PickupByCustomer", "shipping method: PickupByCustomer" );



		}
	}
}

