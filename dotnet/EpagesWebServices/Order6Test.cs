using System;
using EpagesWebServices.OrderService6Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of Order web service
	/// </summary>
	[TestFixture]
	public class Order6Test : WebServiceConfiguration
	{
		OrderService orderService;

        TCreate_Input Order_in = new TCreate_Input();
        TUpdate_Input Order_up = new TUpdate_Input();

        const string alias = "dotnet_test-6";
		const string customer   = "/Shops/DemoShop/Customers/1001"; // mmustermann
		const string path       = customer + "/Orders/" + alias;

        String[] Orders = new String[] { path };
        String[] OrderAttributes = new String[] { "Comment" };
        String[] AddressAttributes = new String[] { "JobTitle" /*,"Salutation" */ };
        String[] LineItemAttributes = new String[] { "Alias" /*,"TransID" */ };

        /// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
            // initialize orderService
            orderService = new OrderService();
            orderService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
            orderService.PreAuthenticate = true;
            orderService.Url = WEBSERVICE_URL;

            // initialize addresses
            TAddressNamed Address_in = new TAddressNamed();
            Address_in.EMail = "dotnet_test-3@epages.de";
            Address_in.FirstName = "Klaus";
            Address_in.LastName = "Klaussen";
            Address_in.Street = "Musterstraﬂe 2";
            Address_in.Street2 = "Ortsteil Niederfingeln";
            TAttribute jobTitle= new TAttribute(); jobTitle.Name="JobTitle"; jobTitle.Value="best Job";
            TAttribute salutation = new TAttribute(); salutation.Name="Salutation"; salutation.Value="Dr.";
            Address_in.Attributes = new TAttribute[]{jobTitle,salutation};

            TAddressNamed Address_up = new TAddressNamed();
            Address_up.FirstName = "Hans";
            Address_up.LastName = "Hanssen";
            Address_up.Street = "Musterstraﬂe 2b";
            Address_up.Street2 = "Ortsteil Oberfingeln";

            //initialize order input data
            Order_in.Alias = alias;
            Order_in.Customer = customer;
            Order_in.BillingAddress = Address_in;
            Order_in.CreationDate = new DateTime(2006, 1, 1, 12, 0, 0, DateTimeKind.Local);
            Order_in.ViewedOn = new DateTime(2006, 1, 1, 23, 59, 0, DateTimeKind.Local);
            Order_in.ViewedOnSpecified = true;

            TAttribute OrderAttr_in = new TAttribute();
            OrderAttr_in.Name = "Comment";
            OrderAttr_in.Value="my order comment";
            Order_in.Attributes = new TAttribute[] { OrderAttr_in };

            TProductLineItemIn Product_in = new TProductLineItemIn();
            Product_in.Product = "/Shops/DemoShop/Products/ho_1112105010";
            Product_in.Quantity = 10;

            TLineItemContainerIn lineItemContainer = new TLineItemContainerIn();
            lineItemContainer.CurrencyID = "EUR";
            lineItemContainer.PaymentMethod = "/Shops/DemoShop/PaymentMethods/Invoice";
            lineItemContainer.ShippingMethod = "/Shops/DemoShop/ShippingMethods/Express";
            lineItemContainer.TaxArea = "/TaxMatrixGermany/EU";
            lineItemContainer.TaxModel = "gross";
            lineItemContainer.ProductLineItems = new TProductLineItemIn[]{Product_in};
            Order_in.LineItemContainer = lineItemContainer;

            //initialize order update data
            Order_up.Path = path;
            Order_up.BillingAddress = Address_up;
            Order_up.InProcessOn = new DateTime(2006, 1, 2, 0, 0, 0, DateTimeKind.Local);
            Order_up.InProcessOnSpecified = true;

            TAttribute OrderAttr_up = new TAttribute();
            OrderAttr_up.Name = "Comment";
            OrderAttr_up.Value = "my updated order comment";
            Order_up.Attributes = new TAttribute[] { OrderAttr_up };

        }

        /// <summary>
        /// test getInfo() and check result against created resp. updated Order
        /// </summary>
        /// <param name="alreadyUpdated">check result against created or updated Order</param>
        public void getInfo(bool alreadyUpdated)
        {
            TGetInfo_Return[] Orders_out = orderService.getInfo(Orders, OrderAttributes, AddressAttributes, LineItemAttributes, null);

            TGetInfo_Return Order = Orders_out[0];
            Assert.AreEqual(alias, Order.Alias, "Order alias");

            if (alreadyUpdated)
            {
                Assert.AreEqual(Order.BillingAddress.FirstName, Order_up.BillingAddress.FirstName, "FirstName");
                Assert.AreEqual(Order.BillingAddress.LastName, Order_up.BillingAddress.LastName, "LastName");
                Assert.AreEqual(Order.BillingAddress.Street, Order_up.BillingAddress.Street, "Street");
                Assert.AreEqual(Order.BillingAddress.Street2, Order_up.BillingAddress.Street2, "Street2");
                Assert.AreEqual(Order.Attributes[0].Value, Order_up.Attributes[0].Value, "Comment");
                Assert.AreEqual(Order.InProcessOn, Order_up.InProcessOn, "InProcessOn");
            }
            else
            {
                Assert.AreEqual(Order.BillingAddress.FirstName, Order_in.BillingAddress.FirstName, "FirstName");
                Assert.AreEqual(Order.BillingAddress.LastName, Order_in.BillingAddress.LastName, "LastName");
                Assert.AreEqual(Order.BillingAddress.Street, Order_in.BillingAddress.Street, "Street");
                Assert.AreEqual(Order.BillingAddress.Street2, Order_in.BillingAddress.Street2, "Street2");
                Assert.AreEqual(Order.Attributes[0].Value, Order_in.Attributes[0].Value, "Comment");
                Assert.AreEqual(Order.ViewedOn, Order_in.ViewedOn, "ViewedOn");
            }
            Assert.AreEqual(Order.CreationDate, Order_in.CreationDate, "CreationDate");
            Assert.AreEqual(Order.BillingAddress.EMail, Order_in.BillingAddress.EMail, "EMail");

        }

        /// <summary>
        /// test creation of a Order and check if method returns a true value
        /// </summary>
        public void create()
        {
            TCreate_Return[] Orders_out = orderService.create(new TCreate_Input[] { Order_in });
            Assert.AreEqual(1, Orders_out.GetLength(0), "create result set");
            Assert.AreEqual(alias, Orders_out[0].Alias, "Order alias");
            Assert.IsTrue(Orders_out[0].created, "created?");
        }

        /// <summary>
        /// test update of a Order and check if method returns a true value
        /// </summary>
        public void update()
        {
            TUpdate_Return[] Orders_out = orderService.update(new TUpdate_Input[] { Order_up });
            Assert.AreEqual(1, Orders_out.GetLength(0), "update result set");
            Assert.AreEqual(path, Orders_out[0].Path, "Order path");
            Assert.IsTrue(Orders_out[0].updated, "updated?");
        }

        /// <summary>
        /// this is not an actual test.
        /// delete may existing Order at the beginning of the test suite
        /// </summary>
        public void deleteIfExists()
        {
            TExists_Return[] Orders_out = orderService.exists(Orders);

            if (Orders_out[0].exists)
            {
                Console.WriteLine("order exist. deleting it.");
                delete();
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
            TDelete_Return[] Orders_out = orderService.delete(Orders);
            Assert.AreEqual(1, Orders_out.GetLength(0), "delete result set");
            Assert.AreEqual(path, Orders_out[0].Path, "order path");
            Assert.IsTrue(Orders_out[0].deleted, "deleted?");
        }

        /// <summary>
        /// test exists method
        /// </summary>
        /// <param name="exists">if false, test is successful if the Order does NOT exists</param>
        public void exists(bool exists)
        {
            TExists_Return[] Orders_out = orderService.exists(Orders);
            Assert.AreEqual(1, Orders_out.GetLength(0), "exists result set");
            Assert.AreEqual(path, Orders_out[0].Path, "order path");
            Assert.AreEqual(exists, Orders_out[0].exists, "exists?");
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
            string[] OrderPaths = orderService.find(parameters);

            // test if find was successful
            Assert.AreEqual(1, OrderPaths.Length, "find result set");
            Assert.AreEqual(path, OrderPaths[0], "Order path");
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
