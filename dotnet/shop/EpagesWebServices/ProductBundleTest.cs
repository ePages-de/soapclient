using System;
using EpagesWebServices.ProductBundleServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of CrossSelling web service
	/// </summary>
	[TestFixture]
	public class ProductBundleTest : WebServiceConfiguration
	{
		ProductBundleService productBundleService;

		string product			= "Products/cg_0100504001"; //Campingaz Twister 270
		string bundled_product	= "Products/de_3206199010"; //Deuter Teddy Bear
		string bundled_product2	= "Products/eg_1000111010"; //Eureka El Capitan IVr

		/// <summary>
		/// Initial
		/// </summary>
        [SetUp]
        public void Init()
        {
            Console.WriteLine("ProductBundleTest: Init");

            productBundleService = new ProductBundleService();
            productBundleService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
            productBundleService.PreAuthenticate = true;
            productBundleService.Url = WEBSERVICE_URL;
        }

		/// <summary>
		/// create a product bundle and check if the creation was successful
		/// </summary>
		public void testCreate()
		{
			Console.WriteLine("ProductBundleTest: testCreate");

            TBundledProduct bundledProduct = new TBundledProduct();
            bundledProduct.Path = bundled_product;
            bundledProduct.Position = "10";
            bundledProduct.Quantity = 3;
            TBundledProduct bundledProduct2 = new TBundledProduct();
            bundledProduct2.Path = bundled_product2;
            bundledProduct2.Position = "20";
            bundledProduct2.Quantity = 1;
            TBundledProduct[] bundledProducts = new TBundledProduct[] { bundledProduct, bundledProduct2 };

            TCreate_Input productBundle = new TCreate_Input();
            productBundle.Product = product;
            productBundle.BundledProducts = bundledProducts;

			TCreate_Input[] productBundles = new TCreate_Input[]{productBundle};
			TCreate_Return[] productBundles_out = productBundleService.create(productBundles);

			// test if creation was successful
			Assert.AreEqual(1, productBundles_out.GetLength(0), "create result count");
			TCreate_Return	productBundle_out = productBundles_out[0];
			Assert.IsNull(productBundle_out.Error, "create: no error");
			Assert.IsTrue(productBundle_out.created, "created?");
			Assert.AreEqual(product, productBundle_out.Product, "Product path");
		}

		/// <summary>
		/// delete bundles from a product bundle and check if the deletion was successful
		/// </summary>
		public void testDelete()
		{
			Console.WriteLine("ProductBundleTest: testDelete");

            TBundledProductPath bundledProductPath = new TBundledProductPath();
            bundledProductPath.Path = bundled_product2;
            TBundledProductPath[] bundledProductPaths = new TBundledProductPath[] { bundledProductPath };

			TDelete_Input productBundle = new TDelete_Input();
			productBundle.Product	= product;
            productBundle.BundledProductPaths = bundledProductPaths;

			TDelete_Input[] productBundles = new TDelete_Input[]{productBundle};
			TDelete_Return[] productBundles_out = productBundleService.delete(productBundles);

			// test if deletion was successful
			Assert.AreEqual(1, productBundles_out.GetLength(0), "delete result count");
			TDelete_Return	productBundle_out = productBundles_out[0];
			Assert.IsNull(productBundle_out.Error, "delete: no error");
			Assert.AreEqual(product,	productBundle_out.Product, "Product path");
			Assert.IsTrue(productBundle_out.deleted, "deleted?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the CrossSelling does NOT exists</param>
		public void testExists(bool expected)
		{
			Console.WriteLine("ProductBundleTest: testExists");

			TExists_Input productBundle = new TExists_Input();
			productBundle.Product			= product;
            productBundle.BundledProduct = bundled_product2;

			TExists_Input[] productBundles = new TExists_Input[]{productBundle};
			TExists_Return[] productBundles_out = productBundleService.exists(productBundles);

			// test if exists check was successful
			Assert.AreEqual(1, productBundles_out.GetLength(0), "exists result count");
			TExists_Return	productBundle_out = productBundles_out[0];
			Assert.IsNull(productBundle_out.Error, "exists: no error");
			Assert.AreEqual(product, productBundle_out.Product,	"Product path");
			Assert.AreEqual(expected, productBundle_out.exists, "exists?");
		}

		/// <summary>
		/// test getInfo method
		/// </summary>
		public void testGetInfo()
		{
			Console.WriteLine("ProductBundleTest: testGetInfo");

			string[] productBundles = new string[]{product};
			TGetInfo_Return[] productBundles_out = productBundleService.getInfo(productBundles);

			// test if getInfo was successful
			Assert.AreEqual(1, productBundles_out.GetLength(0), "get result count");
			TGetInfo_Return	productBundle_out = productBundles_out[0];
			Assert.IsNull(productBundle_out.Error, "getInfo: no error");
			Assert.AreEqual(product, productBundle_out.Product, "Product path");
		}

		/// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests()
		{
			testCreate();
			testExists(true);
			testGetInfo();
			testDelete();
			testExists(true);
		}
	}
}
