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
        }

        /// <summary>
        /// test suite with all tests in correct order
        /// </summary>
        [Test]
        public void runAllTests()
        {


            //#get last sync time and number of created products
            TFindCreatedObjects_Return createdData = serviceClient.findCreatedObjects(new DateTime(2013, 4, 14, 3, 44, 55), "Product");
            DateTime LastSync = createdData.LatestCreate;
            int LastSyncNumber = createdData.CreatedObjects.Length;
            string output = String.Format("{0} products created initial", LastSyncNumber);
            Assert.GreaterOrEqual(LastSyncNumber, 0, output );
            Console.WriteLine(output);

            //#get created products again only since last sync
            createdData = serviceClient.findCreatedObjects(LastSync, "Product");
            int LastCreateNumber = createdData.CreatedObjects.Length;
            output = String.Format("{0} products created since {1}", LastCreateNumber, LastSync);
            Assert.GreaterOrEqual(LastSyncNumber, 0, output);
            Console.WriteLine(output);
            //#check if nothing of the test products in the result
            foreach (string path in productPaths)
                Assert.AreEqual(null, Array.Find(createdData.CreatedObjects, x => x.Path.EndsWith(path)));

            //#get products since last sync which updated Content,StockLevel
            TFindUpdatedObjects_Return updatedData = serviceClient.findUpdatedObjects(LastSync, "Product", "Content");
            int LastUpdateNumber = updatedData.UpdatedObjects.Length;
            output = String.Format("{0} products updated since {1}", LastUpdateNumber, LastSync);
            Assert.GreaterOrEqual(LastUpdateNumber, 0, output);
            Console.WriteLine(output);
            //#check if nothing of the test products in the result
            foreach (string path in productPaths)
                Assert.AreEqual(null, Array.Find(updatedData.UpdatedObjects, x => x.Path.EndsWith(path)));

            updatedData = serviceClient.findUpdatedObjects(LastSync, "Product", "StockLevel");
            int LastStockNumber = updatedData.UpdatedObjects.Length;
            output = String.Format("{0} products updated stock since {1}", LastUpdateNumber, LastSync);
            Assert.GreaterOrEqual(LastUpdateNumber, 0, output);
            Console.WriteLine(output);
            //#check if nothing of the test products in the result
            foreach (string path in productPaths)
                Assert.AreEqual(null, Array.Find(updatedData.UpdatedObjects, x => x.Path.EndsWith(path)));



            //#create some test products
            ArrayList products = createTestProducts(productAliases);
            Console.WriteLine("test products created");


            //#get last sync time and number of created products
            createdData = serviceClient.findCreatedObjects(LastSync, "Product");
            int NowCreateNumber = createdData.CreatedObjects.Length;
            output = String.Format("now {0} (3 more then {1}) products created since {2}",
                NowCreateNumber, LastCreateNumber, LastSync);
            Assert.AreEqual(NowCreateNumber, LastCreateNumber+3, output);
            Console.WriteLine(output);
            //#check if all test products in the result
            foreach (string path in productPaths)
                Assert.AreNotEqual(null, Array.Find(createdData.CreatedObjects, x => x.Path.EndsWith(path)));


            Thread.Sleep(2000);

            //#update content, and get new sync time
            updateContent();
            //#get products since last sync which updated Content,StockLevel
            updatedData = serviceClient.findUpdatedObjects(LastSync, "Product", "Content");
            DateTime NewSync = updatedData.LatestUpdate;
            LastSyncNumber = updatedData.UpdatedObjects.Length;
            output = String.Format("have {0} products updated since {1}", LastSyncNumber, LastSync);
            Assert.GreaterOrEqual(LastSyncNumber, 0, output);
            Console.WriteLine(output);
            updatedData = serviceClient.findUpdatedObjects(NewSync, "Product", "Content");
            LastSyncNumber = updatedData.UpdatedObjects.Length;
            output = String.Format("have {0} products updated since {1}", LastSyncNumber, NewSync);
            Assert.AreEqual(LastSyncNumber, 1, output);
            Console.WriteLine(output);

            //#update stock
            updateStockLevels(2);
            updatedData = serviceClient.findUpdatedObjects(NewSync, "Product", "StockLevel");
            LastSyncNumber = updatedData.UpdatedObjects.Length;
            output = String.Format("have {0} products updated stock since {1}", LastSyncNumber, NewSync);
            Assert.AreEqual(LastSyncNumber, 3, output);
            Console.WriteLine(output);



            
            //#remove
            deleteTestProducts();

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
