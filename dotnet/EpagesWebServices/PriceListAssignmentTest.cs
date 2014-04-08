using System;
using EpagesWebServices.PriceListAssignmentServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of PriceListAssignment web service
	/// </summary>
	[TestFixture]
	public class PriceListAssignmentTest
	{
		PriceListAssignmentServiceClient serviceClient;
		
		TQuantityDiscount[] quantityDiscounts;
		TValueDiscount[] valueDiscounts;
		TScalePrice[] scalePrices;

		string product = "/Shops/DemoShop/Products/ho_1112105010";
		string pricelist = "/Shops/DemoShop/PriceLists/RegularCustomer_EUR";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new PriceListAssignmentServiceClient();
			
			// create test PriceListAssignments that can be used with the create and update methods
			TQuantityDiscount quantityDiscount1 = new TQuantityDiscount();
			quantityDiscount1.Quantity = 100;
			quantityDiscount1.Discount = 10;
			TQuantityDiscount quantityDiscount2 = new TQuantityDiscount();
			quantityDiscount2.Quantity = 200;
			quantityDiscount2.Discount = 20;
			quantityDiscounts = new TQuantityDiscount[]{quantityDiscount1, quantityDiscount2};

			TValueDiscount valueDiscount1 = new TValueDiscount();
			valueDiscount1.Value = 100;
			valueDiscount1.Discount = 10;
			TValueDiscount valueDiscount2 = new TValueDiscount();
			valueDiscount2.Value = 200;
			valueDiscount2.Discount = 20;
			valueDiscounts = new TValueDiscount[]{valueDiscount1, valueDiscount2};

			TScalePrice scalePrice1 = new TScalePrice();
			scalePrice1.Quantity = 10;
			scalePrice1.Price = 100;
			TScalePrice scalePrice2 = new TScalePrice();
			scalePrice2.Quantity = 20;
			scalePrice2.Price = 200;
			scalePrices = new TScalePrice[]{scalePrice1, scalePrice2};
		}

		/// <summary>
		/// test getQuantityDiscounts() and check result against created PriceListAssignment
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated PriceListAssignment</param>
		public void getQuantityDiscounts()
		{
			ArrayList PriceListAssignments_out = serviceClient.getQuantityDiscounts(new string[]{product}, new string[]{pricelist});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, PriceListAssignments_out.Count, "get info result set");

			TGetQuantityDiscounts_Return PriceListAssignment_out = (TGetQuantityDiscounts_Return)PriceListAssignments_out.ToArray()[0];
			Assert.AreEqual(product, PriceListAssignment_out.Product, "product path");

			Assert.AreEqual(1, PriceListAssignment_out.PriceLists.Length, "PriceLists result set");
			TPriceListQuantityDiscount mypricelist = PriceListAssignment_out.PriceLists[0];
			Assert.AreEqual(pricelist, mypricelist.PriceList, "PriceLists path");

			Assert.AreEqual(quantityDiscounts[0].Quantity, mypricelist.QuantityDiscounts[0].Quantity, "quantityDiscount Quantity");
			Assert.AreEqual(quantityDiscounts[0].Discount, mypricelist.QuantityDiscounts[0].Discount, "quantityDiscount Discount");
			Assert.AreEqual(quantityDiscounts[1].Quantity, mypricelist.QuantityDiscounts[1].Quantity, "quantityDiscount Quantity");
			Assert.AreEqual(quantityDiscounts[1].Discount, mypricelist.QuantityDiscounts[1].Discount, "quantityDiscount Discount");

		}

		/// <summary>
		/// test setQuantityDiscounts for a Product and a PriceList and check if method returns a true value
		/// </summary>
		public void setQuantityDiscounts()
		{
			TSetQuantityDiscounts_Input quantityDiscountInput = new TSetQuantityDiscounts_Input();
			quantityDiscountInput.Product = product;
			quantityDiscountInput.PriceList = pricelist;
			quantityDiscountInput.QuantityDiscounts = quantityDiscounts;

			TSetQuantityDiscounts_Input[] PriceListAssignments = new TSetQuantityDiscounts_Input[]{quantityDiscountInput};

			ArrayList PriceListAssignments_out = serviceClient.setQuantityDiscounts(PriceListAssignments);

			// test if creation was successful
			Assert.AreEqual(1, PriceListAssignments_out.Count, "create result set");

			TSetQuantityDiscounts_Return PriceListAssignment_out = (TSetQuantityDiscounts_Return)PriceListAssignments_out.ToArray()[0];
			Assert.AreEqual(product, PriceListAssignment_out.Product, "product path");
			Assert.AreEqual(true, PriceListAssignment_out.updated, "updated?");
		}

		/// <summary>
		/// test getValueDiscounts() and check result against created PriceListAssignment
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated PriceListAssignment</param>
		public void getValueDiscounts()
		{
			ArrayList PriceListAssignments_out = serviceClient.getValueDiscounts(new string[]{product}, new string[]{pricelist});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, PriceListAssignments_out.Count, "get info result set");

			TGetValueDiscounts_Return PriceListAssignment_out = (TGetValueDiscounts_Return)PriceListAssignments_out.ToArray()[0];
			Assert.AreEqual(product, PriceListAssignment_out.Product, "product path");

			Assert.AreEqual(1, PriceListAssignment_out.PriceLists.Length, "PriceLists result set");
			TPriceListValueDiscount mypricelist = PriceListAssignment_out.PriceLists[0];
			Assert.AreEqual(pricelist, mypricelist.PriceList, "PriceLists path");

			Assert.AreEqual(valueDiscounts[0].Value, mypricelist.ValueDiscounts[0].Value, "ValueDiscount Value");
			Assert.AreEqual(valueDiscounts[0].Discount, mypricelist.ValueDiscounts[0].Discount, "ValueDiscount Discount");
			Assert.AreEqual(valueDiscounts[1].Value, mypricelist.ValueDiscounts[1].Value, "ValueDiscount Value");
			Assert.AreEqual(valueDiscounts[1].Discount, mypricelist.ValueDiscounts[1].Discount, "ValueDiscount Discount");

		}

		/// <summary>
		/// test setValueDiscounts for a Product and a PriceList and check if method returns a true value
		/// </summary>
		public void setValueDiscounts()
		{
			TSetValueDiscounts_Input valueDiscountInput = new TSetValueDiscounts_Input();
			valueDiscountInput.Product = product;
			valueDiscountInput.PriceList = pricelist;
			valueDiscountInput.ValueDiscounts = valueDiscounts;

			TSetValueDiscounts_Input[] PriceListAssignments = new TSetValueDiscounts_Input[]{valueDiscountInput};

			ArrayList PriceListAssignments_out = serviceClient.setValueDiscounts(PriceListAssignments);

			// test if creation was successful
			Assert.AreEqual(1, PriceListAssignments_out.Count, "create result set");

			TSetValueDiscounts_Return PriceListAssignment_out = (TSetValueDiscounts_Return)PriceListAssignments_out.ToArray()[0];
			Assert.AreEqual(product, PriceListAssignment_out.Product, "product path");
			Assert.AreEqual(true, PriceListAssignment_out.updated, "updated?");
		}

		/// <summary>
		/// test getScalePrices() and check result against created PriceListAssignment
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated PriceListAssignment</param>
		public void getScalePrices()
		{
			ArrayList PriceListAssignments_out = serviceClient.getScalePrices(new string[]{product}, new string[]{pricelist});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, PriceListAssignments_out.Count, "get info result set");

			TGetScalePrices_Return PriceListAssignment_out = (TGetScalePrices_Return)PriceListAssignments_out.ToArray()[0];
			Assert.AreEqual(product, PriceListAssignment_out.Product, "product path");

			Assert.AreEqual(1, PriceListAssignment_out.PriceLists.Length, "PriceLists result set");
			TPriceListScalePrice mypricelist = PriceListAssignment_out.PriceLists[0];
			Assert.AreEqual(pricelist, mypricelist.PriceList, "PriceLists path");

			Assert.AreEqual(scalePrices[0].Quantity, mypricelist.ScalePrices[0].Quantity, "ScalePrices Quantity");
			Assert.AreEqual(scalePrices[0].Price,    mypricelist.ScalePrices[0].Price, "ScalePrices Price");
			Assert.AreEqual(scalePrices[1].Quantity, mypricelist.ScalePrices[1].Quantity, "ScalePrices Quantity");
			Assert.AreEqual(scalePrices[1].Price,    mypricelist.ScalePrices[1].Price, "ScalePrices Price");

		}

		/// <summary>
		/// test setScalePrices for a Product and a PriceList and check if method returns a true value
		/// </summary>
		public void setScalePrices()
		{
			TSetScalePrices_Input scalePriceInput = new TSetScalePrices_Input();
			scalePriceInput.Product = product;
			scalePriceInput.PriceList = pricelist;
			scalePriceInput.ScalePrices = scalePrices;

			TSetScalePrices_Input[] PriceListAssignments = new TSetScalePrices_Input[]{scalePriceInput};

			ArrayList PriceListAssignments_out = serviceClient.setScalePrices(PriceListAssignments);

			// test if creation was successful
			Assert.AreEqual(1, PriceListAssignments_out.Count, "create result set");

			TSetScalePrices_Return PriceListAssignment_out = (TSetScalePrices_Return)PriceListAssignments_out.ToArray()[0];
			Assert.AreEqual(product, PriceListAssignment_out.Product, "product path");
			Assert.AreEqual(true, PriceListAssignment_out.updated, "updated?");
		}

		/// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests() 
		{
			setQuantityDiscounts();
			getQuantityDiscounts();
			setValueDiscounts();
			getValueDiscounts();
			setScalePrices();
			getScalePrices();
		}
	}
}
