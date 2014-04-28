using System;
using EpagesWebServices.OrderService2Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of Order web service
	/// </summary>
	[TestFixture]
	public class Order2Test
	{
		OrderService2Client serviceClient;
		TCreate_Input Order_in = new TCreate_Input();
		TUpdate_Input Order_update = new TUpdate_Input();

		string alias = "dotnet_test-1";
		string path = "/Shops/DemoShop/Customers/1001/Orders/";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new OrderService2Client();
			
			// create test Orders that can be used with the create and update methods
			Order_in.Alias              = alias;
            Order_in.CreationDate = new DateTime(2006, 1, 1, 12, 0, 0, DateTimeKind.Local);
			Order_in.Customer           = "Customers/1001";
            Order_in.ViewedOn = new DateTime(2006, 1, 1, 23, 59, 0, DateTimeKind.Local);
            Order_in.ViewedOnSpecified  = true;

			TProductLineItemIn productLineItem      = new TProductLineItemIn();
			    productLineItem.Product             = "Products/ho_1112105010";
			    productLineItem.Quantity            = 10;
                productLineItem.QuantitySpecified   = true;
            TLineItemContainerIn lineItemContainer  = new TLineItemContainerIn();
			    lineItemContainer.CurrencyID        = "EUR";
			    lineItemContainer.PaymentMethod     = "PaymentMethods/Invoice";
			    lineItemContainer.ShippingMethod    = "ShippingMethods/Express";
			    lineItemContainer.TaxArea           = "/TaxMatrixGermany/EU";
			    lineItemContainer.TaxModel          = "gross";
			    lineItemContainer.ProductLineItems  = new TProductLineItemIn[]{productLineItem};
			Order_in.LineItemContainer              = lineItemContainer;

			TAddress bill                   = new TAddress();
			    bill.FirstName              = "Klaus";
			    bill.LastName               = "Klaussen";
			    bill.Street                 = "Musterstraﬂe 2";
			    bill.Street2                = "Ortsteil Niederfingeln";
			    bill.EMail                  = "dotnet-test@epages.de";
                bill.Birthday = new DateTime(1976, 9, 25, 11, 33, 0, DateTimeKind.Local);
                bill.BirthdaySpecified      = true;
                bill.VerifiedOn = new DateTime(2005, 1, 1, 0, 0, 0, DateTimeKind.Local);
                bill.VerifiedOnSpecified    = true;
            Order_in.BillingAddress         = bill;

			TAttribute attr     = new TAttribute();
			    attr.Name       = "Comment";
			    attr.Value      = "my Order comment";
			Order_in.Attributes = new TAttribute[]{attr};


            Order_update.Path                   = path + alias;
            Order_update.CreationDate = new DateTime(2006, 1, 1, 2, 2, 2, DateTimeKind.Local);
            Order_update.CreationDateSpecified  = true;
            Order_update.ViewedOn = new DateTime(2006, 1, 2, 0, 0, 0, DateTimeKind.Local);
            Order_update.ViewedOnSpecified      = true;

			TAddress bill_update                = new TAddress();
			    bill_update.FirstName           = "Hans";
			    bill_update.LastName            = "Hanssen";
			    bill_update.Street              = "Musterstraﬂe 2b";
			    bill_update.Street2             = "Ortsteil Oberfingeln";
                bill_update.Birthday = new DateTime(1976, 9, 25, 11, 33, 0, DateTimeKind.Local);
                bill_update.BirthdaySpecified   = true;
                bill_update.VerifiedOn = new DateTime(2005, 1, 1, 0, 0, 0, DateTimeKind.Local);
                bill_update.VerifiedOnSpecified = true;
            Order_update.BillingAddress         = bill_update;

			TAttribute attr_update  = new TAttribute();
			    attr_update.Name    = "Comment";
			    attr_update.Value   = "my updated Order comment";
			Order_update.Attributes = new TAttribute[]{attr_update};
		}

		/// <summary>
		/// test getInfo() and check result against created resp. updated Order
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated Order</param>
		public void getInfo(bool alreadyUpdated)
		{
			string[] OrderPaths = new string[]{path + alias};
			ArrayList Orders_out = serviceClient.getInfo(OrderPaths, new string[]{"Comment"});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, Orders_out.Count, "get info result set");

			TGetInfo_Return Order_out = (TGetInfo_Return)Orders_out.ToArray()[0];
			Assert.AreEqual(alias, Order_out.Alias, "Order alias");

			if (alreadyUpdated) 
			{
				Assert.AreEqual(Order_update.BillingAddress.FirstName, Order_out.BillingAddress.FirstName, "FirstName");
				Assert.AreEqual(Order_update.BillingAddress.LastName,  Order_out.BillingAddress.LastName, "LastName");
				Assert.AreEqual(Order_update.BillingAddress.Street,    Order_out.BillingAddress.Street, "Street");
				Assert.AreEqual(Order_update.BillingAddress.Street2,   Order_out.BillingAddress.Street2, "Street2");
				Assert.AreEqual(Order_update.Attributes[0].Value,      Order_out.Attributes[0].Value, "Comment");

				Assert.AreEqual(Order_update.CreationDate,             Order_out.CreationDate, "CreationDate");
				Assert.AreEqual(Order_update.ViewedOn,                 Order_out.ViewedOn, "ViewedOn");
			} 
			else 
			{
				Assert.AreEqual(Order_in.BillingAddress.FirstName,     Order_out.BillingAddress.FirstName, "FirstName");
				Assert.AreEqual(Order_in.BillingAddress.LastName,      Order_out.BillingAddress.LastName, "LastName");
				Assert.AreEqual(Order_in.BillingAddress.Street,        Order_out.BillingAddress.Street, "Street");
				Assert.AreEqual(Order_in.BillingAddress.Street2,       Order_out.BillingAddress.Street2, "Street2");
				Assert.AreEqual(Order_in.Attributes[0].Value,          Order_out.Attributes[0].Value, "Comment");

				Assert.AreEqual(Order_in.CreationDate,                 Order_out.CreationDate, "CreationDate");
				Assert.AreEqual(Order_in.ViewedOn,                     Order_out.ViewedOn, "ViewedOn");
			}
			Assert.AreEqual(Order_in.BillingAddress.VerifiedOn,        Order_out.BillingAddress.VerifiedOn, "VerifiedOn");
			Assert.AreEqual(Order_in.BillingAddress.Birthday,          Order_out.BillingAddress.Birthday, "Birthday");
			Assert.AreEqual(Order_in.BillingAddress.EMail,             Order_out.BillingAddress.EMail, "EMail");

		}

		/// <summary>
		/// test creation of a Order and check if method returns a true value
		/// </summary>
		public void create()
		{
			TCreate_Input[] Orders = new TCreate_Input[]{Order_in};

			ArrayList Orders_out = serviceClient.create(Orders);

			// test if creation was successful
			Assert.AreEqual(1, Orders_out.Count, "create result set");

			TCreate_Return Order_out = (TCreate_Return)Orders_out.ToArray()[0];
			Assert.AreEqual(alias, Order_out.Alias, "Order alias");
			Assert.AreEqual(true, Order_out.created, "created?");
		}
		
		/// <summary>
		/// test update of a Order and check if method returns a true value
		/// </summary>
		public void update()
		{
			TUpdate_Input[] Orders = new TUpdate_Input[]{Order_update};

			ArrayList Orders_out = serviceClient.update(Orders);

			// test if update was successful
			Assert.AreEqual(1, Orders_out.Count, "update result set");

			TUpdate_Return Order_out = (TUpdate_Return)Orders_out.ToArray()[0];
			Assert.AreEqual(path + alias, Order_out.Path, "Order path");
			Assert.AreEqual(true, Order_out.updated, "updated?");
		}
		
		/// <summary>
		/// this is not an actual test.
		/// delete may existing Order at the beginning of the test suite
		/// </summary>
		public void deleteIfExists()
		{
			string[] OrderPaths = new string[]{path + alias};
			ArrayList Orders_exists_out = serviceClient.exists(OrderPaths);
			TExists_Return Order_exists_out = (TExists_Return)Orders_exists_out.ToArray()[0];
			
			if (Order_exists_out.exists) 
			{
				Console.WriteLine("order exist. deleting it.");
				serviceClient.delete(OrderPaths);
			}
			else
			{
				Console.WriteLine("order does not exist");
			}
		}

		/// <summary>
		/// test deletion of a Order and check if method returns a true value
		/// </summary>
		public void delete()
		{
			string[] OrderPaths = new string[]{path + alias};
			ArrayList Orders_out = serviceClient.delete(OrderPaths);

			// test if deletion was successful
			Assert.AreEqual(1, Orders_out.Count, "delete result set");

			TDelete_Return Order_out = (TDelete_Return)Orders_out.ToArray()[0];
			Assert.AreEqual(path + alias, Order_out.Path, "Order path");
			Assert.AreEqual(true, Order_out.deleted, "deleted?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the Order does NOT exists</param>
		public void exists(bool exists)
		{
			string[] OrderPaths = new string[]{path + alias};
			ArrayList Orders_out = serviceClient.exists(OrderPaths);

			// test if exists check was successful
			Assert.AreEqual(1, Orders_out.Count, "exists result set");

			TExists_Return Order_out = (TExists_Return)Orders_out.ToArray()[0];
			Assert.AreEqual(path + alias, Order_out.Path, "Order path");
			Assert.AreEqual(exists, Order_out.exists, "exists?");
		}

		/// <summary>
		/// test find method. search for specific email and expect the previously created Order
		/// </summary>
		public void find()
		{
			TFind_Input parameters = new TFind_Input();
			parameters.Alias = Order_in.Alias;
            parameters.DateFrom = new DateTime(2006, 1, 1, 0, 0, 0, DateTimeKind.Local);
            parameters.DateTo = new DateTime(2006, 1, 3, 0, 0, 0, DateTimeKind.Local);
			string[] OrderPaths = serviceClient.find(parameters);

			// test if find was successful
			Assert.AreEqual(1, OrderPaths.Length, "find result set");
			Assert.AreEqual(path + alias, OrderPaths[0], "Order path");
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
