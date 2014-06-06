using System;
using System.Threading;
using NUnit.Framework;
using EpagesWebServices.ProductService9Ref;
using EpagesWebServices.ChangeLogServiceRef;
using System.Collections;
using System.Collections.Generic;

namespace EpagesWebServices
{
    /// <summary>
    /// A NUnit Test Class to test ChangeLogService
    /// </summary>
    [TestFixture]
    public class ChangeLogTest
    {
        ChangeLogServiceClient serviceClient;
        ProductService9Client productServiceClient;
        string[] productAliases = new string[] { "DotNetAlias-01", "DotNetAlias-02", "DotNetAlias-03" };
        string[] productPaths;

	    /// <summary>
	    /// Initial
	    /// </summary>
        [SetUp]
        public void Init()
        {
            List<string> pathList = new List<string>();
            foreach (string alias in productAliases)
                pathList.Add("Products/" + alias);
            productPaths = pathList.ToArray();

			serviceClient = new ChangeLogServiceClient(new WebServiceConfiguration());
            productServiceClient = new ProductService9Client();
            deleteTestProducts();
            Thread.Sleep(2000);
        }

        /// <summary>
        /// test suite with all tests in correct order
        /// </summary>
        [Test]
        public void runAllTests()
        {
            ArrayList products = createTestProducts(productAliases);
            TFindUpdates_Return updates = testCreatedProducts();
            DateTime dt = updates.LatestUpdate;

            updateStockLevels(2);
            testStockLevels(dt, 2);

            updateContent();
            testContent(dt);

            deleteTestProducts();
        }

        private TFindUpdates_Return testCreatedProducts()
        {
            TFindUpdates_Return updateData = serviceClient.findUpdates(new DateTime(2013, 4, 14, 3, 44, 55), "Product", "Content");
            TFindUpdates[] updates = updateData.Updates;

            // the newly created products should be in the updated set
            foreach (string path in productPaths)
                Assert.AreNotEqual(null, Array.Find(updates, x => x.Path.EndsWith(path)));

            // there must be no updates since creation
            foreach (string profile in new string[] { "Content", "StockLevel", "ListPrice" })
                testNoUpdates(profile, updateData.LatestUpdate);
            testNoDeletes(updateData.LatestUpdate);

            return updateData;
        }

        private TFindUpdates_Return testNoUpdates(string profile, DateTime since)
        {
            TFindUpdates_Return updateData = serviceClient.findUpdates(since, "Product", profile);
            TFindUpdates[] updates = updateData.Updates;
            Assert.AreEqual(null, updates);

            return updateData;
        }

        private TFindDeletes_Return testNoDeletes(DateTime since)
        {
            TFindDeletes_Return deleteData = serviceClient.findDeletes(since, "Product");
            TFindDeletes[] deletes = deleteData.Deletes;
            Assert.AreEqual(null, deletes);

            return deleteData;
        }

        private TFindUpdates_Return testStockLevels(DateTime since, int level)
        {
            TFindUpdates_Return updateData = serviceClient.findUpdates(since, "Product", "StockLevel");
            TFindUpdates[] updates = updateData.Updates;
            foreach (string path in productPaths)
            {
                object product = Array.Find(updates, x => x.Path.EndsWith(path));
                Assert.AreNotEqual(null, product);
            }

            ArrayList infoData = productServiceClient.getInfo(productPaths);
            Assert.AreEqual(productPaths.Length, infoData.Count);
            foreach (object product in infoData)
            {
                Assert.AreEqual(level, ((TGetInfo_Return)product).StockLevel);
            }
            foreach (string profile in new string[] { "Content", "ListPrice" })
                testNoUpdates(profile, since);
            return updateData;
        }

        private ArrayList createTestProducts(string[] aliases)
        {
            List<TCreate_Input> products = new List<TCreate_Input>();
            foreach (string alias in aliases)
            {
		        TCreate_Input product = new TCreate_Input();

                product.Alias = alias;
                product.StockLevel = 1;

                TLocalizedValue name = new TLocalizedValue();
                name.LanguageCode = "de";
                name.Value = "DotNotTestProduct " + alias;
                product.Name = new TLocalizedValue[]{name};
                
			    TProductPrice price = new TProductPrice();
			    price.Price = (float)123;
			    price.CurrencyID = "EUR";
			    price.TaxModel = "gross";
			    product.ProductPrices = new TProductPrice[]{price};

                products.Add(product);
            }

            return productServiceClient.create(products.ToArray());
        }

        private ArrayList deleteTestProducts()
        {
            return productServiceClient.delete(productPaths);
        }

        private ArrayList updateContent()
        {
            List<TUpdate_Input> updates = new List<TUpdate_Input>();
            TUpdate_Input update = new TUpdate_Input();
            update.Path = productPaths[0];

            TLocalizedValue name = new TLocalizedValue();
            name.LanguageCode = "de";
            name.Value = "Updated DotNetTestProduct " + productPaths[0];
            update.Name = new TLocalizedValue[] { name };
                
            updates.Add(update);

            return productServiceClient.update(updates.ToArray());
        }

        private TFindUpdates_Return testContent(DateTime since)
        {
            TFindUpdates_Return updateData = serviceClient.findUpdates(since, "Product", "Content");
            TFindUpdates[] updates = updateData.Updates;
            object productUpdate = Array.Find(updates, x => x.Path.EndsWith(productPaths[0]));
            Assert.AreNotEqual(null, productUpdate);
            Assert.AreEqual(1, updates.Length);

            ArrayList infoData = productServiceClient.getInfo(new string[]{productPaths[0]});
            Assert.AreEqual(1, infoData.Count);
            foreach (TLocalizedValue name in ((TGetInfo_Return)infoData[0]).Name)
            {
                if (name.LanguageCode == "de")
                {
                    Assert.AreEqual(name.Value, "Updated DotNetTestProduct " + productPaths[0]);
                }
            }

            return updateData;
        }

        private ArrayList updateStockLevels(int newVal)
        {
            List<TUpdate_Input> updates = new List<TUpdate_Input>();
            foreach(string path in productPaths)
            {
                TUpdate_Input update = new TUpdate_Input();
                update.Path = path;
                update.StockLevel = newVal;
                update.StockLevelSpecified = true;
                updates.Add(update);
            }

            return productServiceClient.update(updates.ToArray());
        }
    }
}
