using System;
using EpagesWebServices.AssignmentServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of Assignment web service
	/// </summary>
	[TestFixture]
	public class AssignmentTest
	{
		AssignmentServiceClient serviceClient;
		
		string catalog = "/Shops/DemoShop/Categories/Jackets";
		string product = "/Shops/DemoShop/Products/ho_1112105010";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new AssignmentServiceClient();
			
			// create test Assignments that can be used with the create and update methods
			
		}

		/// <summary>
		/// check if Catalog is assigned to Product
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated Assignment</param>
		public void getCatalogsAssignedToProduct()
		{
			ArrayList Assignments_out = serviceClient.getCatalogsAssignedToProduct(new string[]{product});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, Assignments_out.Count, "getCatalogsAssignedToProduct result set");

			TGetCatalogsAssignedToProduct_Return Assignment_out = (TGetCatalogsAssignedToProduct_Return)Assignments_out.ToArray()[0];
			Assert.AreEqual(product, Assignment_out.Product, "Assignment product");

			Assert.IsTrue(Assignment_out.Catalogs.Length > 0, "assigned Catalogs result set");

			bool found = false;
			for (int i = 0; i < Assignment_out.Catalogs.Length; i++) 
			{
				TAssignedCatalog tAssignedCatalog = Assignment_out.Catalogs[i];
				if (tAssignedCatalog.Path.Equals(catalog)) 
				{
					found = true;
				}
			}
			Assert.IsTrue(found, "assigned Catalog");
		}

		/// <summary>
		/// check if Product is assigned to Catalog
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated Assignment</param>
		public void getProductsAssignedToCatalog()
		{
			ArrayList Assignments_out = serviceClient.getProductsAssignedToCatalog(new string[]{catalog});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, Assignments_out.Count, "getProductsAssignedToCatalog result set");

			TGetProductsAssignedToCatalog_Return Assignment_out = (TGetProductsAssignedToCatalog_Return)Assignments_out.ToArray()[0];
			Assert.AreEqual(catalog, Assignment_out.Catalog, "Assignment catalog");

			Assert.IsTrue(Assignment_out.Products.Length > 0, "assigned Products result set");

			bool found = false;
			for (int i = 0; i < Assignment_out.Products.Length; i++) 
			{
				TAssignedProduct tAssignedProduct = Assignment_out.Products[i];
				if (tAssignedProduct.Path.Equals(product)) 
				{
					found = true;
				}
			}
			Assert.IsTrue(found, "assigned Product");
		}

		/// <summary>
		/// assign a Product to a Catalog
		/// </summary>
		public void assignProductToCatalog()
		{
			TAssignProductToCatalog_Input Assignment_in = new TAssignProductToCatalog_Input();
			Assignment_in.Catalog = catalog;
			Assignment_in.Product = product;

			TAssignProductToCatalog_Input[] Assignments = new TAssignProductToCatalog_Input[]{Assignment_in};

			ArrayList Assignments_out = serviceClient.assignProductToCatalog(Assignments);

			// test if creation was successful
			Assert.AreEqual(1, Assignments_out.Count, "create result set");

			TAssignProductToCatalog_Return Assignment_out = (TAssignProductToCatalog_Return)Assignments_out.ToArray()[0];
			Assert.AreEqual(product, Assignment_out.Product, "Product path");
			Assert.AreEqual(true, Assignment_out.assigned, "assigned?");
		}

		/// <summary>
		/// remove assignment of Catalog and Product
		/// </summary>
		public void removeProductFromCatalog()
		{
			TRemoveProductFromCatalog_Input Assignment = new TRemoveProductFromCatalog_Input();
			Assignment.Catalog = catalog;
			Assignment.Product = product;
			TRemoveProductFromCatalog_Input[] Assignments = new TRemoveProductFromCatalog_Input[]{Assignment};
			
			ArrayList Assignments_out = serviceClient.removeProductFromCatalog(Assignments);

			// test if deletion was successful
			Assert.AreEqual(1, Assignments_out.Count, "removeProductFromCatalog result set");

			TRemoveProductFromCatalog_Return Assignment_out = (TRemoveProductFromCatalog_Return)Assignments_out.ToArray()[0];
			Assert.AreEqual(product, Assignment_out.Product, "Product path");
			Assert.AreEqual(true, Assignment_out.removed, "removed?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the Assignment does NOT exists</param>
		public void isProductAssignedToCatalog(bool expected)
		{
			TIsProductAssignedToCatalog_Input Assignment = new TIsProductAssignedToCatalog_Input();
			Assignment.Catalog = catalog;
			Assignment.Product = product;
			TIsProductAssignedToCatalog_Input[] Assignments = new TIsProductAssignedToCatalog_Input[]{Assignment};
			ArrayList Assignments_out = serviceClient.isProductAssignedToCatalog(Assignments);

			// test if exists check was successful
			Assert.AreEqual(1, Assignments_out.Count, "isProductAssignedToCatalog result set");

			TIsProductAssignedToCatalog_Return Assignment_out = (TIsProductAssignedToCatalog_Return)Assignments_out.ToArray()[0];
			Assert.AreEqual(product, Assignment_out.Product, "Product path");
			Assert.AreEqual(expected, Assignment_out.assigned, "assigned?");
		}

		/// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests() 
		{
			assignProductToCatalog();
			isProductAssignedToCatalog(true);
			getCatalogsAssignedToProduct();
			getProductsAssignedToCatalog();
			removeProductFromCatalog();	
			isProductAssignedToCatalog(false);
		}
	}
}
