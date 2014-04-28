using System;
using EpagesWebServices.CrossSellingService2Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of CrossSelling web service
	/// </summary>
	[TestFixture]
	public class CrossSelling2Test : WebServiceConfiguration
	{
		CrossSellingService crossSellingService;

		string product			= "Products/de_3203104010"; //Deuter Kangaroo
		string target_product	= "Products/de_3206199010"; //Deuter Teddy Bear

		TLocalizedValue[] Comment1;
		TLocalizedValue[] Comment2;


		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			Console.WriteLine("CrossSellingTest: Init");

			TLocalizedValue comment1_de = new TLocalizedValue();
			comment1_de.LanguageCode = "de";
			comment1_de.Value = ".net CrossSellingService Test";
			TLocalizedValue comment1_en = new TLocalizedValue();
			comment1_en.LanguageCode = "en";
			comment1_en.Value = ".net CrossSellingService Test";
			Comment1  = new TLocalizedValue[]{ comment1_de, comment1_en };

			TLocalizedValue comment2_de = new TLocalizedValue();
			comment2_de.LanguageCode = "de";
			comment2_de.Value = ".net CrossSellingService Test Aktualisierung";
			TLocalizedValue comment2_en = new TLocalizedValue();
			comment2_en.LanguageCode = "en";
			comment2_en.Value = ".net CrossSellingService test update";
			Comment2  = new TLocalizedValue[]{ comment2_de, comment2_en };

			crossSellingService = new CrossSellingService();
			crossSellingService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			crossSellingService.PreAuthenticate = true;
			crossSellingService.Url = WEBSERVICE_URL;

			// remove all assigned cross selling products
			TDelete_Input CrossSelling_in = new TDelete_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.TargetProduct = "*";
			CrossSelling_in.Type = "CrossSelling";
			TDelete_Input[] CrossSellings = new TDelete_Input[]{CrossSelling_in};
			TDelete_Return[] CrossSellings_out = crossSellingService.delete( CrossSellings );

			Console.WriteLine("delete all CrossSelling: " + CrossSellings_out.GetLength(0));
			foreach( TDelete_Return result in CrossSellings_out )
			{
				if( result.Error != null )
					Console.Error.WriteLine("delete CrossSelling failed:" + result.Error.Message);
				else
					Console.WriteLine("deleted CrossSelling: " + result.TargetProduct + " : " + result.deleted );
			}

			CrossSelling_in = new TDelete_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.TargetProduct = "*";
			CrossSelling_in.Type = "Accessory";
			CrossSellings = new TDelete_Input[]{CrossSelling_in};
			CrossSellings_out = crossSellingService.delete( CrossSellings );

			Console.WriteLine("delete all Accessory: " + CrossSellings_out.GetLength(0));
			foreach( TDelete_Return result in CrossSellings_out )
			{
				if( result.Error != null )
					Console.Error.WriteLine("delete failed:" + result.Error.Message);
				else
					Console.WriteLine("deleted Accessory: " + result.TargetProduct + " : " + result.deleted );
			}

			CrossSelling_in = new TDelete_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.TargetProduct = "*";
			CrossSelling_in.Type = "ProductComparison";
			CrossSellings = new TDelete_Input[]{CrossSelling_in};
			CrossSellings_out = crossSellingService.delete( CrossSellings );

			Console.WriteLine("delete all ProductComparison: " + CrossSellings_out.GetLength(0));
			foreach( TDelete_Return result in CrossSellings_out )
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
			TCreate_Input crossSelling = new TCreate_Input();
			crossSelling.Product	= product;
			crossSelling.TargetProduct = target_product;
			crossSelling.Type = "CrossSelling";
			crossSelling.Position = "10";
			crossSelling.Comment = Comment1;

			TCreate_Input productComparison = new TCreate_Input();
			productComparison.Product	= product;
			productComparison.TargetProduct = target_product;
			productComparison.Type = "ProductComparison";
			productComparison.Position = "10";

			TCreate_Input accessory = new TCreate_Input();
			accessory.Product	= product;
			accessory.TargetProduct = target_product;
			accessory.Type = "Accessory";
			accessory.Position = "10";

			TCreate_Input[] CrossSellings = new TCreate_Input[]{
				crossSelling,
				productComparison,
				accessory,
			};

			TCreate_Return[] CrossSellings_out = crossSellingService.create(CrossSellings);

			// test if creation was successful
			Assert.AreEqual(3, CrossSellings_out.GetLength(0), "insert result count");
			TCreate_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "insert: no error");
			Assert.IsTrue(CrossSelling_out.created, "assigned?");
			Assert.AreEqual(product, CrossSelling_out.Product, "Product path");
			Assert.AreEqual("CrossSelling", CrossSelling_out.Type, "CrossSelling type");
		}

		/// <summary>
		/// update a cross selling and check if the update was successful
		/// </summary>
		public void testUpdate()
		{
			Console.WriteLine("CrossSellingTest: testUpdate");

			// update a CrossSelling
			TUpdate_Input crossSelling = new TUpdate_Input();
			crossSelling.Product		= product;
			crossSelling.TargetProduct	= target_product;
			crossSelling.Type			= "CrossSelling";
			crossSelling.Position		= "20";
			crossSelling.Comment		= Comment2;
			TUpdate_Input[]  CrossSellings = new TUpdate_Input[]{crossSelling};
			TUpdate_Return[] CrossSellings_out = crossSellingService.update(CrossSellings);

			// test if update was successful
			Assert.AreEqual(1, CrossSellings_out.GetLength(0), "insert result count");
			TUpdate_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "insert: no error");
			Assert.IsTrue(CrossSelling_out.updated, "updated?");
			Assert.AreEqual(product, CrossSelling_out.Product, "Product path");
			Assert.AreEqual("CrossSelling", CrossSelling_out.Type, "CrossSelling type");
		}

		/// <summary>
		/// delete a cross selling and check if the deletion was successful
		/// </summary>
		public void testDelete()
		{
			Console.WriteLine("CrossSellingTest: testDelete");

			TDelete_Input crossSelling = new TDelete_Input();
			crossSelling.Product	= product;
			crossSelling.TargetProduct = target_product;
			crossSelling.Type = "CrossSelling";

			TDelete_Input productComparison = new TDelete_Input();
			productComparison.Product	= product;
			productComparison.TargetProduct = target_product;
			productComparison.Type = "ProductComparison";

			TDelete_Input accessory = new TDelete_Input();
			accessory.Product	= product;
			accessory.TargetProduct = target_product;
			accessory.Type = "Accessory";

			TDelete_Input[] CrossSellings = new TDelete_Input[]{
				crossSelling,
				productComparison,
				accessory,
			};

			TDelete_Return[] CrossSellings_out = crossSellingService.delete(CrossSellings);

			// test if deletion was successful
			Assert.AreEqual(3, CrossSellings_out.GetLength(0), "delete result count");

			TDelete_Return	CrossSelling_out = CrossSellings_out[0];
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

			// all cross selling types
			TExists_Input CrossSelling_in = new TExists_Input();
			CrossSelling_in.Product			= product;
			CrossSelling_in.TargetProduct	= target_product;
			CrossSelling_in.Type	= "CrossSelling";
			TExists_Input[] CrossSellings = new TExists_Input[]{CrossSelling_in};

			TExists_Return[] CrossSellings_out = crossSellingService.exists(CrossSellings);

			// test if exists check was successful
			Assert.AreEqual(1, CrossSellings_out.GetLength(0), "exists result count (only CrossSelling)");

			TExists_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "exists: no error");
			Assert.AreEqual(product, CrossSelling_out.Product,	"Product path");
			Assert.AreEqual(target_product,	CrossSelling_out.TargetProduct,	"Target product");
			Assert.AreEqual(expected, CrossSelling_out.exists, "exists?");

			// only Accessories
			CrossSelling_in = new TExists_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.TargetProduct = target_product;
			CrossSelling_in.Type = "Accessory";
			CrossSellings = new TExists_Input[]{CrossSelling_in};

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

			TGetInfo_Input CrossSelling_in = new TGetInfo_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.Type  = "CrossSelling";
			TGetInfo_Input[] CrossSellings = new TGetInfo_Input[]{CrossSelling_in};

			TGetInfo_Return[] CrossSellings_out = crossSellingService.getInfo(CrossSellings);

			// test if exists check was successful
			Assert.AreEqual(1, CrossSellings_out.GetLength(0), "get result count");

			TGetInfo_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "exists: no error");
			Assert.AreEqual(product, CrossSelling_out.Product, "Product path");
			Assert.AreEqual(target_product,	CrossSelling_out.TargetProduct,	"Target product path");
			Assert.AreEqual("10", CrossSelling_out.Position, "Position");
			Assert.AreEqual("CrossSelling", CrossSelling_out.Type, "Type");

			Assert.AreEqual(2, CrossSelling_out.Comment.Length, "Number of languages in Comment");
			Hashtable resultComment = new Hashtable();
			resultComment.Add(CrossSelling_out.Comment[0].LanguageCode, CrossSelling_out.Comment[0].Value);
			resultComment.Add(CrossSelling_out.Comment[1].LanguageCode, CrossSelling_out.Comment[1].Value);

			Assert.AreEqual(Comment1[0].Value, resultComment[Comment1[0].LanguageCode], "initial localized Comment "+Comment1[0].LanguageCode);
			Assert.AreEqual(Comment1[1].Value, resultComment[Comment1[1].LanguageCode], "initial localized Comment "+Comment1[1].LanguageCode);
		}

		/// <summary>
		/// test get method after update
		/// </summary>
		public void testGet2()
		{
			Console.WriteLine("CrossSellingTest: testGet after update");

			TGetInfo_Input CrossSelling_in = new TGetInfo_Input();
			CrossSelling_in.Product	= product;
			CrossSelling_in.Type  = "CrossSelling";
			TGetInfo_Input[] CrossSellings = new TGetInfo_Input[]{CrossSelling_in};

			TGetInfo_Return[] CrossSellings_out = crossSellingService.getInfo(CrossSellings);

			// test if exists check was successful
			Assert.AreEqual(1, CrossSellings_out.GetLength(0), "get result count");

			TGetInfo_Return	CrossSelling_out = CrossSellings_out[0];
			Assert.IsNull(CrossSelling_out.Error, "exists: no error");
			Assert.AreEqual(product, CrossSelling_out.Product, "Product path");
			Assert.AreEqual(target_product,	CrossSelling_out.TargetProduct,	"Target product path");
			Assert.AreEqual("20", CrossSelling_out.Position, "Position");
			Assert.AreEqual("CrossSelling", CrossSelling_out.Type, "Type");

			Assert.AreEqual(2, CrossSelling_out.Comment.Length, "Number of languages in Comment");
			Hashtable resultComment = new Hashtable();
			resultComment.Add(CrossSelling_out.Comment[0].LanguageCode, CrossSelling_out.Comment[0].Value);
			resultComment.Add(CrossSelling_out.Comment[1].LanguageCode, CrossSelling_out.Comment[1].Value);

			Assert.AreEqual(Comment2[0].Value, resultComment[Comment1[0].LanguageCode], "initial localized Comment "+Comment1[0].LanguageCode);
			Assert.AreEqual(Comment2[1].Value, resultComment[Comment1[1].LanguageCode], "initial localized Comment "+Comment1[1].LanguageCode);
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
			testUpdate();
			testGet2();
			testDelete();
			testExists(false);
		}
	}
}
