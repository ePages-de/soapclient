using System;
using EpagesWebServices.ProductService6Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of Product web service
	/// </summary>
	[TestFixture]
	public class Product6Test
	{
		ProductService6Client serviceClient;
		TCreate_Input Product_in        = new TCreate_Input();
		TUpdate_Input Product_update    = new TUpdate_Input();
        TCreate_Input Product_down      = new TCreate_Input();

		string alias    = "dotnet_test-1";
		string path     = "/Shops/DemoShop/Products/";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new ProductService6Client();

			// create test Products that can be used with the create and update methods
			Product_in.Alias            = alias;
            TLocalizedValue name_de = new TLocalizedValue();
            name_de.LanguageCode = "de";
            name_de.Value = "Test-Hauptprodukt";
            TLocalizedValue name_en = new TLocalizedValue();
            name_en.LanguageCode = "en";
            name_en.Value = "test master product";
            Product_in.Name = new TLocalizedValue[] { name_de, name_en };

            TLocalizedValue longdesc_de = new TLocalizedValue();
                longdesc_de.LanguageCode = "de";
                longdesc_de.Value = "Test-Hauptprodukt lange Beschreibung";
            TLocalizedValue longdesc_en = new TLocalizedValue();
                longdesc_en.LanguageCode = "en";
                longdesc_en.Value = "test master product long description";
            Product_in.LongDescription = new TLocalizedValue[] { longdesc_de, longdesc_en };

            TLocalizedValue title_de = new TLocalizedValue();
                title_de.LanguageCode = "de";
                title_de.Value = "Seitentitel";
            TLocalizedValue title_en = new TLocalizedValue();
                title_en.LanguageCode = "en";
                title_en.Value = "page title";
            Product_in.Title = new TLocalizedValue[] { title_de, title_en };

            Product_in.Class = "/Shops/DemoShop/ProductTypes/Shoe";
            Product_in.TaxClass         = "/TaxMatrixGermany/normal";
            Product_in.IsVisible        = true;         Product_in.IsVisibleSpecified       = true;
            Product_in.IsNew            = true;         Product_in.IsNewSpecified           = true;
			Product_in.PriceQuantity    = (float)1;     Product_in.PriceQuantitySpecified   = true;
            Product_in.MinOrder         = (float)1;     Product_in.MinOrderSpecified        = true;
			Product_in.IntervalOrder    = (float)1;     Product_in.IntervalOrderSpecified   = true;
            Product_in.OrderUnit        = "/Units/piece";

            Product_in.Weight           = (float)240;   Product_in.WeightSpecified          = true;
            Product_in.WeightUnit       = "/Units/gram";

            Product_in.RefAmount        = (float)1;     Product_in.RefAmountSpecified       = true;
            Product_in.RefContentAmount = (float)0.240; Product_in.RefContentAmountSpecified = true;
            Product_in.RefUnit          = "Units/gram/kilogram";

            Product_in.StockLevel       = (float)140;   Product_in.StockLevelSpecified      = true;
            Product_in.StockLevelAlert  = (float)100;   Product_in.StockLevelAlertSpecified = true;

            Product_in.DeliveryPeriod = "asap";

            Product_in.AvailabilityDate = new DateTime(2005, 12, 24, 10, 0, 0);

			TProductPrice price         = new TProductPrice();
			    price.Price             = (float)123;
			    price.CurrencyID        = "EUR";
			    price.TaxModel          = "gross";
			Product_in.ProductPrices    = new TProductPrice[]{ price };

            TProductPrice manufacturer_price = new TProductPrice();
                manufacturer_price.Price = (float)150;
                manufacturer_price.CurrencyID = "EUR";
                manufacturer_price.TaxModel = "gross";
            Product_in.ManufacturerPrices = new TProductPrice[] { manufacturer_price };

            TProductPrice deposit_price = new TProductPrice();
                deposit_price.Price = (float)5;
                deposit_price.CurrencyID = "EUR";
                deposit_price.TaxModel = "gross";
            Product_in.DepositPrices = new TProductPrice[] { deposit_price };

            TProductPrice prepay_price = new TProductPrice();
                prepay_price.Price = (float)10;
                prepay_price.CurrencyID = "EUR";
                prepay_price.TaxModel = "gross";
            Product_in.PrepaymentPrices = new TProductPrice[] { prepay_price };

            Product_update.Path = path + alias;
			TLocalizedValue name_de_update  = new TLocalizedValue();
			    name_de_update.LanguageCode = "de";
			    name_de_update.Value        = "verändertes Test-Hauptprodukt";
			TLocalizedValue name_en_update  = new TLocalizedValue();
			    name_en_update.LanguageCode = "en";
			    name_en_update.Value        = "updated test master product";
			Product_update.Name             = new TLocalizedValue[]{name_de_update, name_en_update};

            TLocalizedValue longdesc_de_update = new TLocalizedValue();
                longdesc_de_update.LanguageCode = "de";
                longdesc_de_update.Value = "Test-Hauptprodukt lange Beschreibung modifiziert";
            TLocalizedValue longdesc_en_update = new TLocalizedValue();
                longdesc_en_update.LanguageCode = "en";
                longdesc_en_update.Value = "test master product long description updated";
            Product_update.LongDescription = new TLocalizedValue[] { longdesc_de_update, longdesc_en_update };

            TLocalizedValue title_de_update = new TLocalizedValue();
                title_de_update.LanguageCode = "de";
                title_de_update.Value = "Seitentitel modifiziert";
            TLocalizedValue title_en_update = new TLocalizedValue();
                title_en_update.LanguageCode = "en";
                title_en_update.Value = "page title modified";
            Product_update.Title = new TLocalizedValue[] { title_de_update, title_en_update };

            Product_update.IsVisible = true; Product_update.IsVisibleSpecified = true;
            Product_update.IsNew            = true;         Product_update.IsNewSpecified               = true;
            Product_update.PriceQuantity    = (float)1;     Product_update.PriceQuantitySpecified       = true;
            Product_update.MinOrder         = (float)1;     Product_update.MinOrderSpecified            = true;
            Product_update.IntervalOrder    = (float)1;     Product_update.IntervalOrderSpecified       = true;

            Product_update.Weight           = (float)240;   Product_update.WeightSpecified              = true;
            Product_update.RefAmount        = (float)1;     Product_update.RefAmountSpecified           = true;
            Product_update.RefContentAmount = (float)0.240; Product_update.RefContentAmountSpecified    = true;

            Product_update.StockLevel       = (float)140;   Product_update.StockLevelSpecified          = true;
            Product_update.StockLevelAlert  = (float)100;   Product_update.StockLevelAlertSpecified     = true;

            Product_update.DeliveryPeriod = "as soon as possible";

            TProductPrice price_update = new TProductPrice();
			    price_update.Price          = (float)123.50;
			    price_update.CurrencyID     = "EUR";
			    price_update.TaxModel       = "gross";
			Product_update.ProductPrices    = new TProductPrice[]{price_update};

            TProductPrice manufacturer_price_update = new TProductPrice();
                manufacturer_price_update.Price = (float)150.50;
                manufacturer_price_update.CurrencyID = "EUR";
                manufacturer_price_update.TaxModel = "gross";
            Product_update.ManufacturerPrices = new TProductPrice[] { manufacturer_price_update };

            TProductPrice deposit_price_update = new TProductPrice();
                deposit_price_update.Price = (float)5.50;
                deposit_price_update.CurrencyID = "EUR";
                deposit_price_update.TaxModel = "gross";
            Product_update.DepositPrices = new TProductPrice[] { deposit_price_update };

            TProductPrice prepay_price_update = new TProductPrice();
                prepay_price_update.Price = (float)10.50;
                prepay_price_update.CurrencyID = "EUR";
                prepay_price_update.TaxModel = "gross";
            Product_update.PrepaymentPrices = new TProductPrice[] { prepay_price_update };



            // create test Products that can be used as download product
            Product_down.Alias = alias;
            TLocalizedValue name_de_down = new TLocalizedValue();
            name_de_down.LanguageCode = "de";
            name_de_down.Value = "Test-Downloadprodukt";
            TLocalizedValue name_en_down = new TLocalizedValue();
            name_en_down.LanguageCode = "en";
            name_en_down.Value = "test master product";
            Product_down.Name = new TLocalizedValue[] { name_de, name_en };

            Product_down.Class = "/Shops/DemoShop/ProductTypes/Shoe";
            Product_down.TaxClass = "/TaxMatrixGermany/normal";
            Product_down.IsAvailable = true; Product_in.IsAvailableSpecified = true;
            Product_down.IsDownloadProduct = true;
            Product_down.MaxDownloadTime = "5";
            Product_down.MaxDownloadCount = "3";

            TDownload download = new TDownload();
            download.IsExternal = true;
            download.FileName = "http://www.epages.com/de/download/de-epages6-SEO.pdf";
            download.Position = "10";
            Product_down.DownloadProductMaps = new TDownload[] { download };

		}

		/// <summary>
		/// test getInfo() and check result against created resp. updated Product
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated Product</param>
		public void getInfo(bool alreadyUpdated)
		{
			string[] ProductPaths = new string[]{path + alias};
			ArrayList Products_out = serviceClient.getInfo(ProductPaths, new string[]{"AvailabilityDate"});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, Products_out.Count, "get info result set");

			TGetInfo_Return Product_out = (TGetInfo_Return)Products_out.ToArray()[0];
			Assert.AreEqual(alias, Product_out.Alias, "product alias");
			Assert.AreEqual(2, Product_out.Name.Length, "Number of languages");

            Hashtable resultName = new Hashtable();
            resultName.Add(Product_out.Name[0].LanguageCode, Product_out.Name[0].Value);
            resultName.Add(Product_out.Name[1].LanguageCode, Product_out.Name[1].Value);

            Hashtable resultLongDesc = new Hashtable();
            resultLongDesc.Add(Product_out.LongDescription[0].LanguageCode, Product_out.LongDescription[0].Value);
            resultLongDesc.Add(Product_out.LongDescription[1].LanguageCode, Product_out.LongDescription[1].Value);

            Hashtable resultTitle = new Hashtable();
            resultTitle.Add(Product_out.Title[0].LanguageCode, Product_out.Title[0].Value);
            resultTitle.Add(Product_out.Title[1].LanguageCode, Product_out.Title[1].Value);

            Hashtable resultPrice = new Hashtable();
            resultPrice.Add(Product_out.ProductPrices[0].CurrencyID, Product_out.ProductPrices[0].Price);
            resultPrice.Add(Product_out.ProductPrices[1].CurrencyID, Product_out.ProductPrices[1].Price);

            Hashtable resultManuPrice = new Hashtable();
            resultManuPrice.Add(Product_out.ManufacturerPrices[0].CurrencyID, Product_out.ManufacturerPrices[0].Price);

            Hashtable resultDepoPrice = new Hashtable();
            resultDepoPrice.Add(Product_out.DepositPrices[0].CurrencyID, Product_out.DepositPrices[0].Price);

            Hashtable resultPrePrice = new Hashtable();
            resultPrePrice.Add(Product_out.PrepaymentPrices[0].CurrencyID, Product_out.PrepaymentPrices[0].Price);

            if (alreadyUpdated)
			{
                Assert.AreEqual(Product_update.Name[0].Value, resultName[Product_update.Name[0].LanguageCode], "updated localized Name");
                Assert.AreEqual(Product_update.Name[1].Value, resultName[Product_update.Name[1].LanguageCode], "updated localized Name");
                Assert.AreEqual(Product_update.LongDescription[0].Value, resultLongDesc[Product_update.LongDescription[0].LanguageCode], "updated localized long description");
                Assert.AreEqual(Product_update.LongDescription[1].Value, resultLongDesc[Product_update.LongDescription[1].LanguageCode], "updated localized long description");
                Assert.AreEqual(Product_update.Title[0].Value, resultTitle[Product_update.Title[0].LanguageCode], "updated localized title");
                Assert.AreEqual(Product_update.Title[1].Value, resultTitle[Product_update.Title[1].LanguageCode], "updated localized title");

                Assert.AreEqual(Product_update.ProductPrices[0].Price, resultPrice[Product_update.ProductPrices[0].CurrencyID], "ProductPrices Price");
                Assert.AreEqual(Product_update.ManufacturerPrices[0].Price, resultManuPrice[Product_update.ManufacturerPrices[0].CurrencyID], "Manufacturer Price");
                Assert.AreEqual(Product_update.DepositPrices[0].Price, resultDepoPrice[Product_update.DepositPrices[0].CurrencyID], "Deposit Price");
                Assert.AreEqual(Product_update.PrepaymentPrices[0].Price, resultPrePrice[Product_update.PrepaymentPrices[0].CurrencyID], "PrePayment Price");

				Assert.AreEqual(Product_update.IsVisible,			 Product_out.IsVisible,"IsVisible");
				Assert.AreEqual(Product_update.IsNew,				 Product_out.IsNew,"IsNew");
				Assert.AreEqual(Product_update.RefContentAmount,	 Product_out.RefContentAmount, "RefContentAmount");

                Assert.AreEqual(Product_update.DeliveryPeriod,       Product_out.DeliveryPeriod, "delivery period");
            }
			else
			{
                Assert.AreEqual(Product_in.Name[0].Value, resultName[Product_in.Name[0].LanguageCode], "initial localized Name");
                Assert.AreEqual(Product_in.Name[1].Value, resultName[Product_in.Name[1].LanguageCode], "initial localized Name");
                Assert.AreEqual(Product_in.LongDescription[0].Value, resultLongDesc[Product_in.LongDescription[0].LanguageCode], "initial localized long description");
                Assert.AreEqual(Product_in.LongDescription[1].Value, resultLongDesc[Product_in.LongDescription[1].LanguageCode], "initial localized long description");
                Assert.AreEqual(Product_in.Title[0].Value, resultTitle[Product_in.Title[0].LanguageCode], "initial localized title");
                Assert.AreEqual(Product_in.Title[1].Value, resultTitle[Product_in.Title[1].LanguageCode], "initial localized title");

                Assert.AreEqual(Product_in.ProductPrices[0].Price, resultPrice[Product_in.ProductPrices[0].CurrencyID], "ProductPrices Price");
                Assert.AreEqual(Product_in.ManufacturerPrices[0].Price, resultManuPrice[Product_in.ManufacturerPrices[0].CurrencyID], "Manufacturer Price");
                Assert.AreEqual(Product_in.DepositPrices[0].Price, resultDepoPrice[Product_in.DepositPrices[0].CurrencyID], "Deposit Price");
                Assert.AreEqual(Product_in.PrepaymentPrices[0].Price, resultPrePrice[Product_in.PrepaymentPrices[0].CurrencyID], "PrePayment Price");

				Assert.AreEqual(Product_in.IsVisible,			Product_out.IsVisible,"IsVisible");
				Assert.AreEqual(Product_in.IsNew,				Product_out.IsNew,"IsNew");
				Assert.AreEqual(Product_in.RefContentAmount,	Product_out.RefContentAmount, "RefContentAmount");

                Assert.AreEqual(Product_in.DeliveryPeriod,      Product_out.DeliveryPeriod, "delivery period");
            }

			Assert.AreEqual(Product_in.TaxClass,			Product_out.TaxClass,"TaxClass");
			Assert.AreEqual(Product_in.OrderUnit,			Product_out.OrderUnit,"OrderUnit");
		}

		/// <summary>
		/// test creation of a Product and check if method returns a true value
		/// </summary>
		public void create()
		{
			TCreate_Input[] Products = new TCreate_Input[]{Product_in};

			ArrayList Products_out = serviceClient.create(Products);

			// test if creation was successful
			Assert.AreEqual(1, Products_out.Count, "create result set");

			TCreate_Return Product_out = (TCreate_Return)Products_out.ToArray()[0];
			Assert.AreEqual(alias, Product_out.Alias, "product alias");
			Assert.AreEqual(true, Product_out.created, "created?");
		}

		/// <summary>
		/// test update of a Product and check if method returns a true value
		/// </summary>
		public void update()
		{
			TUpdate_Input[] Products = new TUpdate_Input[]{Product_update};

			ArrayList Products_out = serviceClient.update(Products);

			// test if update was successful
			Assert.AreEqual(1, Products_out.Count, "udpated result set");

			TUpdate_Return Product_out = (TUpdate_Return)Products_out.ToArray()[0];
			Assert.AreEqual(path + alias, Product_out.Path, "product path");
			Assert.AreEqual(true, Product_out.updated, "updated?");
		}

		/// <summary>
		/// this is not an actual test.
		/// delete may existing Product at the beginning of the test suite
		/// </summary>
		public void deleteIfExists()
		{
			string[] ProductPaths = new string[]{path + alias};
			ArrayList Products_exists_out = serviceClient.exists(ProductPaths);
			TExists_Return Product_exists_out = (TExists_Return)Products_exists_out.ToArray()[0];

			if (! Product_exists_out.exists)
			{
				return;
			}

			serviceClient.delete(ProductPaths);
		}

		/// <summary>
		/// test deletion of a Product and check if method returns a true value
		/// </summary>
		public void delete()
		{
			string[] ProductPaths = new string[]{path + alias};
			ArrayList Products_out = serviceClient.delete(ProductPaths);

			// test if deletion was successful
			Assert.AreEqual(1, Products_out.Count, "delete result set");

			TDelete_Return Product_out = (TDelete_Return)Products_out.ToArray()[0];
			Assert.AreEqual(path + alias, Product_out.Path, "product path");
			Assert.AreEqual(true, Product_out.deleted, "deleted?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the Product does NOT exists</param>
		public void exists(bool exists)
		{
			string[] ProductPaths = new string[]{path + alias};
			ArrayList Products_out = serviceClient.exists(ProductPaths);

			// test if exists check was successful
			Assert.AreEqual(1, Products_out.Count, "exists result set");

			TExists_Return Product_out = (TExists_Return)Products_out.ToArray()[0];
			Assert.AreEqual(path + alias, Product_out.Path, "product path");
			Assert.AreEqual(exists, Product_out.exists, "exists?");
		}

		/// <summary>
		/// test find method. search for specific email and expect the previously created Product
		/// </summary>
		public void find()
		{
			TFind_Input parameters = new TFind_Input();
			parameters.Alias = Product_in.Alias;
			string[] ProductPaths = serviceClient.find(parameters);

			// test if find was successful
			Assert.AreEqual(1, ProductPaths.Length, "find result set");
			Assert.AreEqual(path + alias, ProductPaths[0], "product path");
		}

        /// <summary>
        /// test creation of a download Product and check if method returns a true value
        /// </summary>
        public void createDownload()
        {
            TCreate_Input[] Products = new TCreate_Input[] { Product_down };

            ArrayList Products_out = serviceClient.create(Products);

            // test if creation was successful
            Assert.AreEqual(1, Products_out.Count, "create result set");

            TCreate_Return Product_out = (TCreate_Return)Products_out.ToArray()[0];
            Assert.AreEqual(alias, Product_out.Alias, "product alias");
            Assert.AreEqual(true, Product_out.created, "created?");
        }


        /// <summary>
        /// test getInfoDownload() is a created download product
        /// </summary>
        public void getInfoDownload()
        {
            string[] ProductPaths = new string[] { path + alias };
            ArrayList Products_out = serviceClient.getInfo(ProductPaths, new string[] {});

            // test if getinfo was successful and if all data are equal to input
            Assert.AreEqual(1, Products_out.Count, "get info result set");

            TGetInfo_Return Product_out = (TGetInfo_Return)Products_out.ToArray()[0];
            Assert.AreEqual(alias, Product_out.Alias, "product alias");

            Assert.AreEqual(Product_down.IsDownloadProduct, Product_out.IsDownloadProduct, "IsDownloadProduct");
            Assert.AreEqual(Product_down.MaxDownloadTime, Product_out.MaxDownloadTime, "MaxDownloadTime");
            Assert.AreEqual(Product_down.MaxDownloadCount, Product_out.MaxDownloadCount, "MaxDownloadCount");

            TDownload download_out = Product_out.DownloadProductMaps[0];
            TDownload download_ref = Product_out.DownloadProductMaps[0];
            Assert.AreEqual(download_ref.Position, download_out.Position, "Position");
            Assert.AreEqual(download_ref.TargetUrl, download_out.TargetUrl, "TargetUrl");

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

            createDownload();
            exists(true);
            getInfoDownload();
            delete();
        }
	}
}
