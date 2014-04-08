using System;
using EpagesWebServices.OrderDocumentService6Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of OrderDocument web service
	/// </summary>
	[TestFixture]
	public class OrderDocument6Test
	{
		OrderDocumentService6Client serviceClient;

		TCreate_Input invoice_in = new TCreate_Input();
		TCreate_Input packingslip_in = new TCreate_Input();
		TCreate_Input creditnote_in = new TCreate_Input();

		string order = "/Shops/DemoShop/Customers/1001/Orders/1002";

		string invoice_path = "/Shops/DemoShop/Customers/1001/Orders/1002/Invoices/";
		string invoice_alias = "myinvoice";
		string packingslip_path = "/Shops/DemoShop/Customers/1001/Orders/1002/PackingSlips/";
		string packingslip_alias = "mypackingslip";
		string creditnote_path = "/Shops/DemoShop/Customers/1001/Orders/1002/CreditNotes/";
		string creditnote_alias = "mycreditnote";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new OrderDocumentService6Client();

			// create test OrderDocuments that can be used with the create and update methods
			invoice_in.Order = order;
			invoice_in.Class = "/Classes/Invoice";
			invoice_in.Alias = invoice_alias;
			invoice_in.Issued = false;

			packingslip_in.Order = order;
			packingslip_in.Class = "/Classes/PackingSlip";
			packingslip_in.Alias = packingslip_alias;
			packingslip_in.Issued = false;

			creditnote_in.Order = order;
			creditnote_in.Class = "/Classes/CreditNote";
			creditnote_in.Alias = creditnote_alias;
			creditnote_in.Issued = false;
		}

		/// <summary>
		/// test getInfo() and check result against created OrderDocuments
		/// </summary>
		public void getInfo()
		{
			string[] OrderDocumentPaths = new string[]{
														  invoice_path + invoice_alias,
														  packingslip_path + packingslip_alias,
														  creditnote_path + creditnote_alias
			};
			ArrayList OrderDocuments_out = serviceClient.getInfo(OrderDocumentPaths);

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(3, OrderDocuments_out.Count, "get info result set");

			TGetInfo_Return invoice_out = (TGetInfo_Return)OrderDocuments_out.ToArray()[0];
			Assert.AreEqual(order, invoice_out.Order, "order path");
			Assert.AreEqual(invoice_in.Alias, invoice_out.Alias, "invoice alias");
			Assert.AreEqual(invoice_in.Class, invoice_out.Class, "invoice class");

			TGetInfo_Return packingslip_out = (TGetInfo_Return)OrderDocuments_out.ToArray()[1];
			Assert.AreEqual(order, packingslip_out.Order, "order path");
			Assert.AreEqual(packingslip_in.Alias, packingslip_out.Alias, "packingslip alias");
			Assert.AreEqual(packingslip_in.Class, packingslip_out.Class, "packingslip class");

			TGetInfo_Return creditnote_out = (TGetInfo_Return)OrderDocuments_out.ToArray()[2];
			Assert.AreEqual(order, creditnote_out.Order, "order path");
			Assert.AreEqual(creditnote_in.Alias, creditnote_out.Alias, "creditnote alias");
			Assert.AreEqual(creditnote_in.Class, creditnote_out.Class, "creditnote class");
		}

		/// <summary>
		/// test getInvoices() and check result against created OrderDocuments
		/// </summary>
		public void getInvoices()
		{
			string[] OrderPaths = new string[]{order};
			ArrayList OrderDocuments_out = serviceClient.getInvoices(OrderPaths);

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, OrderDocuments_out.Count, "get info result set");

			TGetInvoices_Return invoice_out = (TGetInvoices_Return)OrderDocuments_out.ToArray()[0];
			Assert.AreEqual(order, invoice_out.Order, "order path");
			Assert.AreEqual(1, invoice_out.Invoices.Length, "invoices result set");
			Assert.AreEqual(invoice_path+invoice_alias, invoice_out.Invoices[0], "invoice path");

		}

		/// <summary>
		/// test getPackingSlips() and check result against created OrderDocuments
		/// </summary>
		public void getPackingSlips()
		{
			string[] OrderPaths = new string[]{order};
			ArrayList OrderDocuments_out = serviceClient.getPackingSlips(OrderPaths);

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, OrderDocuments_out.Count, "get info result set");

			TGetPackingSlips_Return PackingSlip_out = (TGetPackingSlips_Return)OrderDocuments_out.ToArray()[0];
			Assert.AreEqual(order, PackingSlip_out.Order, "order path");
			Assert.AreEqual(1, PackingSlip_out.PackingSlips.Length, "PackingSlips result set");
			Assert.AreEqual(packingslip_path+packingslip_alias, PackingSlip_out.PackingSlips[0], "PackingSlip path");

		}

		/// <summary>
		/// test getCreditNotes() and check result against created OrderDocuments
		/// </summary>
		public void getCreditNotes()
		{
			string[] OrderPaths = new string[]{order};
			ArrayList OrderDocuments_out = serviceClient.getCreditNotes(OrderPaths);

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, OrderDocuments_out.Count, "get info result set");

			TGetCreditNotes_Return CreditNote_out = (TGetCreditNotes_Return)OrderDocuments_out.ToArray()[0];
			Assert.AreEqual(order, CreditNote_out.Order, "order path");
			Assert.AreEqual(1, CreditNote_out.CreditNotes.Length, "CreditNotes result set");
			Assert.AreEqual(creditnote_path+creditnote_alias, CreditNote_out.CreditNotes[0], "CreditNote path");

		}

		/// <summary>
		/// test creation of a OrderDocument and check if method returns a true value
		/// </summary>
		public void create()
		{
			TCreate_Input[] OrderDocuments = new TCreate_Input[]{
																	invoice_in,
																	packingslip_in,
																	creditnote_in
																};

			ArrayList OrderDocuments_out = serviceClient.create(OrderDocuments);

			// test if creation was successful
			Assert.AreEqual(3, OrderDocuments_out.Count, "create result set");

			TCreate_Return invoice_out = (TCreate_Return)OrderDocuments_out.ToArray()[0];
			Assert.AreEqual(order, invoice_out.Order, "Order path");
			Assert.AreEqual(true, invoice_out.created, "invoice created?");

			TCreate_Return packingslip_out = (TCreate_Return)OrderDocuments_out.ToArray()[1];
			Assert.AreEqual(order, packingslip_out.Order, "Order path");
			Assert.AreEqual(true, packingslip_out.created, "packingslip created?");

			TCreate_Return creditnote_out = (TCreate_Return)OrderDocuments_out.ToArray()[2];
			Assert.AreEqual(order, creditnote_out.Order, "Order path");
			Assert.AreEqual(true, creditnote_out.created, "creditnote created?");
		}

		/// <summary>
		/// this is not an actual test.
		/// delete may existing OrderDocument at the beginning of the test suite
		/// </summary>
		public void deleteIfExists()
		{
			string[] OrderDocumentPaths = new string[]{
														  invoice_path + invoice_alias,
														  packingslip_path + packingslip_alias,
														  creditnote_path + creditnote_alias
													  };
			ArrayList OrderDocuments_exists_out = serviceClient.exists(OrderDocumentPaths);

			TExists_Return invoice_out = (TExists_Return)OrderDocuments_exists_out.ToArray()[0];
			if (invoice_out.exists)
			{
				serviceClient.delete(new string[]{invoice_path + invoice_alias});
			}

			TExists_Return packingslip_out = (TExists_Return)OrderDocuments_exists_out.ToArray()[0];
			if (packingslip_out.exists)
			{
				serviceClient.delete(new string[]{packingslip_path + packingslip_alias});
			}

			TExists_Return creditnote_out = (TExists_Return)OrderDocuments_exists_out.ToArray()[0];
			if (creditnote_out.exists)
			{
				serviceClient.delete(new string[]{creditnote_path + creditnote_alias});
			}
		}

		/// <summary>
		/// test deletion of a OrderDocument and check if method returns a true value
		/// </summary>
		public void delete()
		{
			string[] OrderDocumentPaths = new string[]{
														  invoice_path + invoice_alias,
														  packingslip_path + packingslip_alias,
														  creditnote_path + creditnote_alias
													  };
			ArrayList OrderDocuments_out = serviceClient.delete(OrderDocumentPaths);

			// test if deletion was successful
			Assert.AreEqual(3, OrderDocuments_out.Count, "delete result set");

			TDelete_Return invoice_out = (TDelete_Return)OrderDocuments_out.ToArray()[0];
			Assert.AreEqual(true, invoice_out.deleted, "invoice created?");

			TDelete_Return packingslip_out = (TDelete_Return)OrderDocuments_out.ToArray()[1];
			Assert.AreEqual(true, packingslip_out.deleted, "packingslip created?");

			TDelete_Return creditnote_out = (TDelete_Return)OrderDocuments_out.ToArray()[2];
			Assert.AreEqual(true, creditnote_out.deleted, "creditnote created?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the OrderDocument does NOT exists</param>
		public void exists(bool expected)
		{
			string[] OrderDocumentPaths = new string[]{
														  invoice_path + invoice_alias,
														  packingslip_path + packingslip_alias,
														  creditnote_path + creditnote_alias
													  };
			ArrayList OrderDocuments_out = serviceClient.exists(OrderDocumentPaths);

			// test if exists check was successful
			Assert.AreEqual(3, OrderDocuments_out.Count, "exists result set");

			TExists_Return invoice_out = (TExists_Return)OrderDocuments_out.ToArray()[0];
			Assert.AreEqual(expected, invoice_out.exists, "invoice created?");

			TExists_Return packingslip_out = (TExists_Return)OrderDocuments_out.ToArray()[1];
			Assert.AreEqual(expected, packingslip_out.exists, "packingslip created?");

			TExists_Return creditnote_out = (TExists_Return)OrderDocuments_out.ToArray()[2];
			Assert.AreEqual(expected, creditnote_out.exists, "creditnote created?");
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
     		getInfo();
			delete();
			exists(false);
		}
	}
}
