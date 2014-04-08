using System;
using EpagesWebServices.CustomerServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of customer web service
	/// </summary>
	[TestFixture]
	public class CustomerTest
	{
		CustomerServiceClient serviceClient;
		TCreate_Input customer_in = new TCreate_Input();
		TUpdate_Input customer_update = new TUpdate_Input();

		string alias = "dotnet_test-1";
		string path = "/Shops/DemoShop/Customers/";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new CustomerServiceClient();
			
			// create test customers that can be used with the create and update methods
			customer_in.Alias               = alias;
			TAddress bill                   = new TAddress();
			    bill.FirstName              = "Klaus";
			    bill.LastName               = "Klaussen";
			    bill.Street                 = "Musterstraﬂe 2";
			    bill.EMail                  = "dotnet-test@epages.de";
                bill.Birthday = new DateTime(1976, 9, 25, 11, 33, 0, DateTimeKind.Local);
                bill.BirthdaySpecified      = true;
                bill.VerifiedOn             = new DateTime(2005, 1, 1);
                bill.VerifiedOnSpecified    = true;
			customer_in.BillingAddress      = bill;

			TAttribute attr                 = new TAttribute();
			    attr.Name                   = "Comment";
			    attr.Value                  = "my customer comment";
			customer_in.Attributes          = new TAttribute[]{attr};
            customer_in.IsDoOrderAllowed    = true;
            customer_in.IsDoOrderAllowedSpecified = true;


			customer_update.Path            = path + alias;
			TAddress bill_update            = new TAddress();
			    bill_update.FirstName       = "Hans";
			    bill_update.LastName        = "Hanssen";
			    bill_update.Street          = "Musterstraﬂe 2b";
                bill_update.Birthday = new DateTime(1976, 9, 25, 11, 33, 0, DateTimeKind.Local); 
                bill_update.BirthdaySpecified = true;
                bill_update.VerifiedOn      = new DateTime(2005, 1, 1); 
                bill_update.VerifiedOnSpecified = true;
			customer_update.BillingAddress = bill_update;

			TAttribute attr_update          = new TAttribute();
			    attr_update.Name            = "Comment";
			    attr_update.Value           = "my updated customer comment";
			customer_update.Attributes      = new TAttribute[]{attr_update};
            customer_update.IsDoOrderAllowed = true; customer_update.IsDoOrderAllowedSpecified = true;

        }

		/// <summary>
		/// test getInfo() and check result against created resp. updated customer
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated customer</param>
		public void getInfo(bool alreadyUpdated)
		{
			string[] customerPaths = new string[]{path + alias};
			ArrayList customers_out = serviceClient.getInfo(customerPaths, new string[]{"Comment"});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, customers_out.Count, "get info result set");

			TGetInfo_Return customer_out = (TGetInfo_Return)customers_out.ToArray()[0];
			Assert.AreEqual(alias, customer_out.Alias, "customer alias");

			if (alreadyUpdated) 
			{
				Assert.AreEqual(customer_update.BillingAddress.FirstName, customer_out.BillingAddress.FirstName, "FirstName");
				Assert.AreEqual(customer_update.BillingAddress.LastName,  customer_out.BillingAddress.LastName, "LastName");
				Assert.AreEqual(customer_update.BillingAddress.Street,    customer_out.BillingAddress.Street, "Street");
				Assert.AreEqual(customer_update.Attributes[0].Value,      customer_out.Attributes[0].Value, "Comment");

				Assert.AreEqual(customer_update.IsDoOrderAllowed,         customer_out.IsDoOrderAllowed, "IsDoOrderAllowed");
			} 
			else 
			{
				Assert.AreEqual(customer_in.BillingAddress.FirstName,     customer_out.BillingAddress.FirstName, "FirstName");
				Assert.AreEqual(customer_in.BillingAddress.LastName,      customer_out.BillingAddress.LastName, "LastName");
				Assert.AreEqual(customer_in.BillingAddress.Street,        customer_out.BillingAddress.Street, "Street");
				Assert.AreEqual(customer_in.Attributes[0].Value,          customer_out.Attributes[0].Value, "Comment");

				Assert.AreEqual(customer_in.IsDoOrderAllowed,             customer_out.IsDoOrderAllowed, "IsDoOrderAllowed");
			}
			Assert.AreEqual(customer_in.BillingAddress.VerifiedOn,        customer_out.BillingAddress.VerifiedOn, "VerifiedOn");
			Assert.AreEqual(customer_in.BillingAddress.Birthday,          customer_out.BillingAddress.Birthday, "Birthday");
			Assert.AreEqual(customer_in.BillingAddress.EMail,             customer_out.BillingAddress.EMail, "EMail");

		}

		/// <summary>
		/// test creation of a customer and check if method returns a true value
		/// </summary>
		public void create()
		{
			TCreate_Input[] customers = new TCreate_Input[]{customer_in};

			ArrayList customers_out = serviceClient.create(customers);

			// test if creation was successful
			Assert.AreEqual(1, customers_out.Count, "create result set");

			TCreate_Return customer_out = (TCreate_Return)customers_out.ToArray()[0];
			Assert.AreEqual(alias, customer_out.Alias, "customer alias");
			Assert.AreEqual(true, customer_out.created, "created?");
		}
		
		/// <summary>
		/// test update of a customer and check if method returns a true value
		/// </summary>
		public void update()
		{
			TUpdate_Input[] customers = new TUpdate_Input[]{customer_update};

			ArrayList customers_out = serviceClient.update(customers);

			// test if update was successful
			Assert.AreEqual(1, customers_out.Count, "update result set");

			TUpdate_Return customer_out = (TUpdate_Return)customers_out.ToArray()[0];
			Assert.AreEqual(path + alias, customer_out.Path, "customer path");
			Assert.AreEqual(true, customer_out.updated, "updated?");
		}
		
		/// <summary>
		/// this is not an actual test.
		/// delete may existing customer at the beginning of the test suite
		/// </summary>
		public void deleteIfExists()
		{
			string[] customerPaths = new string[]{path + alias};
			ArrayList customers_exists_out = serviceClient.exists(customerPaths);
			TExists_Return customer_exists_out = (TExists_Return)customers_exists_out.ToArray()[0];
			
			if (! customer_exists_out.exists) {
				return;
			}

			serviceClient.delete(customerPaths);
		}

		/// <summary>
		/// test deletion of a customer and check if method returns a true value
		/// </summary>
		public void delete()
		{
			string[] customerPaths = new string[]{path + alias};
			ArrayList customers_out = serviceClient.delete(customerPaths);

			// test if deletion was successful
			Assert.AreEqual(1, customers_out.Count, "delete result set");

			TDelete_Return customer_out = (TDelete_Return)customers_out.ToArray()[0];
			Assert.AreEqual(path + alias, customer_out.Path, "customer path");
			Assert.AreEqual(true, customer_out.deleted, "deleted?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the customer does NOT exists</param>
		public void exists(bool exists)
		{
			string[] customerPaths = new string[]{path + alias};
			ArrayList customers_out = serviceClient.exists(customerPaths);

			// test if exists check was successful
			Assert.AreEqual(1, customers_out.Count, "exists result set");

			TExists_Return customer_out = (TExists_Return)customers_out.ToArray()[0];
			Assert.AreEqual(path + alias, customer_out.Path, "customer path");
			Assert.AreEqual(exists, customer_out.exists, "exists?");
		}

		/// <summary>
		/// test find method. search for specific email and expect the previously created customer
		/// </summary>
		public void find()
		{
			TFind_Input parameters = new TFind_Input();
			parameters.EMail = customer_in.BillingAddress.EMail;
			string[] customerPaths = serviceClient.find(parameters);

			// test if find was successful
			Assert.AreEqual(1, customerPaths.Length, "find result set");
			Assert.AreEqual(path + alias, customerPaths[0], "customer path");
		}

		/// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests() 
		{
			deleteIfExists();
			create();
			exists(true);
			find();
			getInfo(false);
			update();
			getInfo(true);
			delete();	
			exists(false);
		}
	}
}
