using System;
using EpagesWebServices.CrossSellingServiceRef;
using NUnit.Framework;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of CrossSelling web service
	/// </summary>
	[TestFixture]
	public class CrossSellingTest : WebServiceConfiguration
	{
		CrossSellingService crossSellingService;
		
		string product			= "Products/de_3203104010";
		string target_product	= "Products/de_3206199010";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			Console.WriteLine("CrossSellingTest: Init");

			crossSellingService = new CrossSellingService();
			crossSellingService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			crossSellingService.PreAuthenticate = true;
			crossSellingService.Url = WEBSERVICE_URL;

			// remove all assigned cross selling products
			TDeleteCrossSelling_Input CrossSelling_in = new TDeleteCrossSelling_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.TargetProduct = "*";
			CrossSelling_in.Type = "CrossSelling";
			TDeleteCrossSelling_Input[] CrossSellings = new TDeleteCrossSelling_Input[]{CrossSelling_in};
			TDeleteCrossSelling_Return[] CrossSellings_out = crossSellingService.delete( CrossSellings );
			
			Console.WriteLine("delete all CrossSelling: " + CrossSellings_out.GetLength(0));
			foreach( TDeleteCrossSelling_Return result in CrossSellings_out )
			{
				if( result.Error != null )
					Console.Error.WriteLine("delete CrossSelling failed:" + result.Error.Message);
				else
					Console.WriteLine("deleted CrossSelling: " + result.TargetProduct + " : " + result.deleted );
			}

			CrossSelling_in = new TDeleteCrossSelling_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.TargetProduct = "*";
			CrossSelling_in.Type = "Accessory";
			CrossSellings = new TDeleteCrossSelling_Input[]{CrossSelling_in};
			CrossSellings_out = crossSellingService.delete( CrossSellings );

			Console.WriteLine("delete all Accessory: " + CrossSellings_out.GetLength(0));
			foreach( TDeleteCrossSelling_Return result in CrossSellings_out )
			{
				if( result.Error != null )
					Console.Error.WriteLine("delete failed:" + result.Error.Message);
				else
					Console.WriteLine("deleted Accessory: " + result.TargetProduct + " : " + result.deleted );
			}

			CrossSelling_in = new TDeleteCrossSelling_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.TargetProduct = "*";
			CrossSelling_in.Type = "ProductComparison";
			CrossSellings = new TDeleteCrossSelling_Input[]{CrossSelling_in};
			CrossSellings_out = crossSellingService.delete( CrossSellings );

			Console.WriteLine("delete all ProductComparison: " + CrossSellings_out.GetLength(0));
			foreach( TDeleteCrossSelling_Return result in CrossSellings_out )
			{
				if( result.Error != null )
					Console.Error.WriteLine("delete ProductComparison failed:" + result.Error.Message);
				else
					Console.WriteLine("deleted ProductComparison: " + result.TargetProduct + " : " + result.deleted );
			}
		}

		/// <summary>
		/// insert a cross selling and check if the creation was successful
		/// </summary>
		public void testInsert()
		{
			Console.WriteLine("CrossSellingTest: testInsert");
			
			// insert a CrossSelling, a ProductComparison and an Accessory product
			TInsertCrossSelling_Input crossSelling = new TInsertCrossSelling_Input();
			crossSelling.Product	= product;
			crossSelling.TargetProduct = target_product;
			crossSelling.Type = "CrossSelling";
			crossSelling.Position = "10";
			
			TInsertCrossSelling_Input productComparison = new TInsertCrossSelling_Input();
			productComparison.Product	= product;
			productComparison.TargetProduct = target_product;
			productComparison.Type = "ProductComparison";
			productComparison.Position = "10";
			
			TInsertCrossSelling_Input accessory = new TInsertCrossSelling_Input();
			accessory.Product	= product;
			accessory.TargetProduct = target_product;
			accessory.Type = "Accessory";
			accessory.Position = "10";
			
			TInsertCrossSelling_Input[] CrossSellings = new TInsertCrossSelling_Input[]{
				crossSelling,
				productComparison,
				accessory,
			};

			TInsertCrossSelling_Return[] CrossSellings_out = crossSellingService.insert(CrossSellings);

			// test if creation was successful
			Assert.AreEqual(3, CrossSellings_out.GetLength(0), "insert result count");
			TInsertCrossSelling_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "insert: no error");
			Assert.IsTrue(CrossSelling_out.inserted, "assigned?");
			Assert.AreEqual(product, CrossSelling_out.Product, "Product path");
			Assert.AreEqual("CrossSelling", CrossSelling_out.Type, "CrossSelling type");
		}

		/// <summary>
		/// delete a cross selling and check if the deletion was successful
		/// </summary>
		public void testDelete()
		{
			Console.WriteLine("CrossSellingTest: testDelete");

			TDeleteCrossSelling_Input crossSelling = new TDeleteCrossSelling_Input();
			crossSelling.Product	= product;
			crossSelling.TargetProduct = target_product;
			crossSelling.Type = "CrossSelling";
			
			TDeleteCrossSelling_Input productComparison = new TDeleteCrossSelling_Input();
			productComparison.Product	= product;
			productComparison.TargetProduct = target_product;
			productComparison.Type = "ProductComparison";
			
			TDeleteCrossSelling_Input accessory = new TDeleteCrossSelling_Input();
			accessory.Product	= product;
			accessory.TargetProduct = target_product;
			accessory.Type = "Accessory";
			
			TDeleteCrossSelling_Input[] CrossSellings = new TDeleteCrossSelling_Input[]{
				crossSelling,
				productComparison,
				accessory,
			};

			TDeleteCrossSelling_Return[] CrossSellings_out = crossSellingService.delete(CrossSellings);

			// test if deletion was successful
			Assert.AreEqual(3, CrossSellings_out.GetLength(0), "delete result count");

			TDeleteCrossSelling_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "delete: no error");
			Assert.AreEqual(product,	CrossSelling_out.Product, "Product path");
			Assert.IsTrue(CrossSelling_out.deleted, "deleted?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the CrossSelling does NOT exists</param>
		public void testExists(bool expected)
		{
			Console.WriteLine("CrossSellingTest: testExists");

			// all cross selling types (Type=null)
			TExistsCrossSelling_Input CrossSelling_in = new TExistsCrossSelling_Input();
			CrossSelling_in.Product			= product;
			CrossSelling_in.TargetProduct	= target_product;
			TExistsCrossSelling_Input[] CrossSellings = new TExistsCrossSelling_Input[]{CrossSelling_in};

			TExistsCrossSelling_Return[] CrossSellings_out = crossSellingService.exists(CrossSellings);

			// test if exists check was successful
			Assert.AreEqual(1, CrossSellings_out.GetLength(0), "exists result count (only CrossSelling)");

			TExistsCrossSelling_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "exists: no error");
			Assert.AreEqual(product, CrossSelling_out.Product,	"Product path");
			Assert.AreEqual(target_product,	CrossSelling_out.TargetProduct,	"Target product");
			Assert.AreEqual(expected, CrossSelling_out.exists, "exists?");

			// only Accessories
			CrossSelling_in = new TExistsCrossSelling_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.TargetProduct = target_product;
			CrossSelling_in.Type = "Accessory";
			CrossSellings = new TExistsCrossSelling_Input[]{CrossSelling_in};

			CrossSellings_out = crossSellingService.exists(CrossSellings);
			
			Assert.AreEqual(1, CrossSellings_out.GetLength(0), "exists result count (only Accessories)");
			Assert.IsNull(CrossSelling_out.Error, "exists: no error");
			Assert.AreEqual(product, CrossSelling_out.Product,	"Product path");
			Assert.AreEqual(target_product,	CrossSelling_out.TargetProduct,	"Target product");
			Assert.AreEqual(expected, CrossSelling_out.exists, "exists?");
		}

		/// <summary>
		/// test get method
		/// </summary>
		public void testGet()
		{
			Console.WriteLine("CrossSellingTest: testGet");

			TGetCrossSelling_Input CrossSelling_in = new TGetCrossSelling_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.Type  = "CrossSelling";
			TGetCrossSelling_Input[] CrossSellings = new TGetCrossSelling_Input[]{CrossSelling_in};

			TGetCrossSelling_Return[] CrossSellings_out = crossSellingService.get(CrossSellings);

			// test if exists check was successful
			Assert.AreEqual(1, CrossSellings_out.GetLength(0), "get result count");

			TGetCrossSelling_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "exists: no error");
			Assert.AreEqual(product, CrossSelling_out.Product, "Product path");
			Assert.AreEqual(target_product,	CrossSelling_out.TargetProduct,	"Target product path");
//			Assert.AreEqual("10", CrossSelling_out.Position, "Position");
			Assert.AreEqual("CrossSelling", CrossSelling_out.Type, "Type");
		}

		/// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests() 
		{
			testInsert();
			testExists(true);
			testGet();
			testDelete();
			testExists(false);
		}
	}
}
