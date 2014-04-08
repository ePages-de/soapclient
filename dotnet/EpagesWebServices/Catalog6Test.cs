using System;
using EpagesWebServices.CatalogService6Ref;
using NUnit.Framework;
using System.Collections;
using System.Collections.Specialized;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of Catalog web service
	/// </summary>
	[TestFixture]
	public class Catalog6Test : WebServiceConfiguration
	{
		CatalogService catalogService;

		TCreate_Input Catalog_in = new TCreate_Input();
		TUpdate_Input Catalog_up = new TUpdate_Input();
		TUpdate_Input Catalog_move = new TUpdate_Input();
		TUpdate_Input Catalog_move_back = new TUpdate_Input();
        TSortProducts_Input Catalog_sort1 = new TSortProducts_Input();
        TSortProducts_Input Catalog_sort2 = new TSortProducts_Input();
        TSortProducts_Input Catalog_sort3 = new TSortProducts_Input();

		string alias = "dotnet_test-1";
		string path = "/Shops/DemoShop/Categories";
		string full, sort1, sort2, sort3;

        /// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			Console.WriteLine("Catalog3Test: Init");

            catalogService = new CatalogService();
            catalogService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
            catalogService.PreAuthenticate = true;
            catalogService.Url = WEBSERVICE_URL;

            // init paths
            sort3 = path + "/Tents";
            sort2 = sort3 + "/FamilyTents";
            sort1 = sort3 + "/IndividualTents";
            full = path + "/" + alias;

            // init test Catalogs that can be used with the create methods
            Catalog_in.Alias = alias;

            TLocalizedValue Catalog_in_Name_de = new TLocalizedValue();
            Catalog_in_Name_de.LanguageCode = "de";
            Catalog_in_Name_de.Value = "Test-Katalog";
            TLocalizedValue Catalog_in_Name_en = new TLocalizedValue();
            Catalog_in_Name_en.LanguageCode = "en";
            Catalog_in_Name_en.Value = "test Catalog";
            Catalog_in.Name = (new TLocalizedValue[] { Catalog_in_Name_de, Catalog_in_Name_en });

            Catalog_in.IsVisible = true;
            Catalog_in.IsVisibleSpecified = true;
            Catalog_in.ParentCatalog = path;

            TAttribute attr = new TAttribute();
            attr.Name = "Date";
            attr.Type = "DateTime";
            attr.Value = "2005-12-24T10:00:00";
            Catalog_in.Attributes = new TAttribute[] { attr };

            TAttribute layout1 = new TAttribute();
            layout1.Name = "Content-Order";
            layout1.Value = "Base_Products_Pages";
            TAttribute layout2 = new TAttribute();
            layout2.Name = "Content-Pages";
            layout2.Value = "Pages_SingleColumn";
            Catalog_in.TemplateTypes = new TAttribute[] { layout1, layout2 };


            // init test Catalogs that can be used with the create methods
            Catalog_up.Path = full;

            TLocalizedValue Catalog_up_Name_de = new TLocalizedValue();
            Catalog_up_Name_de.LanguageCode = "de";
            Catalog_up_Name_de.Value = "anderer Test-Katalog";
            TLocalizedValue Catalog_up_Name_en = new TLocalizedValue();
            Catalog_up_Name_en.LanguageCode = "en";
            Catalog_up_Name_en.Value = "updated test Catalog";
            Catalog_up.Name = (new TLocalizedValue[] { Catalog_up_Name_de, Catalog_up_Name_en });

            Catalog_up.IsVisible = false;
            Catalog_up.IsVisibleSpecified = true;

            TAttribute attr_up = new TAttribute();
            attr_up.Name = "Date";
            attr_up.Type = "DateTime";
            attr_up.Value = "2005-12-24T18:00:00";
            Catalog_up.Attributes = new TAttribute[] { attr_up };

            TAttribute layout3 = new TAttribute();
            layout3.Name = "Content-Order";
            layout3.Value = "Pages_Products_Base";
            TAttribute layout4 = new TAttribute();
            layout4.Name = "Content-Pages";
            layout4.Value = "Pages_TwoColumns";
            Catalog_up.TemplateTypes = new TAttribute[] { layout3, layout4 };

            Catalog_move.Path = full;
            Catalog_move.MoveToParentCatalog = "Categories/Tents";

            Catalog_move_back.Path = "Categories/Tents/" + alias;
            Catalog_move_back.MoveToParentCatalog = "Categories";


            // init parameters for sort methods
            Catalog_sort1.Path = sort1;
            Catalog_sort2.Path = sort2;
            Catalog_sort2.sort = "byPriceDESC";
            Catalog_sort3.Path = sort3;
            Catalog_sort3.sort = "byPriceASC";
            Catalog_sort3.allSub = true;

            // delete test catalog if exists
            TExists_Return[] Catalogs_out = catalogService.exists(new string[] { full });
            if (Catalogs_out[0].exists) catalogService.delete(new string[] { full });

        }

        /**
          * Create a Catalog and check if the creation was successful
          */
        public void testCreate()
        {
            TCreate_Input[] Catalogs_in = new TCreate_Input[] { Catalog_in };
            TCreate_Return[] Catalogs_out = catalogService.create(Catalogs_in);

            // test if creation was successful
            Assert.AreEqual(1, Catalogs_out.GetLength(0), "create result set");
            Assert.IsTrue(Catalogs_out[0].created, "created?");
        }

        /**
         * Update a Catalog and check if the update was successful
         */
        public void testUpdate()
        {
            TUpdate_Input[] Catalogs_up = new TUpdate_Input[] { Catalog_up };
            TUpdate_Return[] Catalogs_out = catalogService.update(Catalogs_up);

            // test if creation was successful
            Assert.AreEqual(1, Catalogs_out.GetLength(0), "create update set");
            Assert.IsTrue(Catalogs_out[0].updated, "updated?");
        }

        /**
          * Retrieve information about an Catalog. Check if the returned data are equal to
          * the data of create or update call
          *
          * @param isAlreadyUpdated if true check against update data, else against create data
          */
        public void testGetInfo(bool isAlreadyUpdated)
        {
            TGetInfo_Return[] Catalogs_out = catalogService.getInfo(
                new String[] { full },
                new String[] { "Date" },
                new String[] { "de", "en" }
            );

            // test if getinfo was successful and if all data are equal to input
            Assert.AreEqual(1, Catalogs_out.GetLength(0), "getInfo result set");
            Assert.AreEqual(alias, Catalogs_out[0].Alias,"catalog alias");
            Assert.AreEqual(2, Catalogs_out[0].Name.GetLength(0), "Number of languages");
            StringDictionary resultName = new StringDictionary();
            resultName.Add(Catalogs_out[0].Name[0].LanguageCode, Catalogs_out[0].Name[0].Value);
            resultName.Add(Catalogs_out[0].Name[1].LanguageCode, Catalogs_out[0].Name[1].Value);

            if (isAlreadyUpdated)
            {
                Assert.AreEqual(Catalog_up.Attributes[0].Name, Catalogs_out[0].Attributes[0].Name, "attribute name: Date");
                Assert.AreEqual(DateTime.Parse(Catalog_up.Attributes[0].Value), DateTime.Parse(Catalogs_out[0].Attributes[0].Value), "attribute value: Date");
                Assert.AreEqual(Catalog_up.IsVisible, Catalogs_out[0].IsVisible, "IsVisible");

                Assert.AreEqual(Catalog_up.Name[0].Value, resultName[Catalog_up.Name[0].LanguageCode], "updated localized Name");
                Assert.AreEqual(Catalog_up.Name[1].Value, resultName[Catalog_up.Name[1].LanguageCode], "updated localized Name");
            }
            else
            {
                Assert.AreEqual(Catalog_in.Attributes[0].Name, Catalogs_out[0].Attributes[0].Name, "attribute name: Date");
                Assert.AreEqual(DateTime.Parse(Catalog_in.Attributes[0].Value), DateTime.Parse(Catalogs_out[0].Attributes[0].Value), "attribute value: Date");
                Assert.AreEqual(Catalog_in.IsVisible, Catalogs_out[0].IsVisible, "IsVisible");

                Assert.AreEqual(Catalog_in.Name[0].Value, resultName[Catalog_in.Name[0].LanguageCode], "initial localized Name");
                Assert.AreEqual(Catalog_in.Name[1].Value, resultName[Catalog_in.Name[1].LanguageCode], "initial localized Name");
            }

            Assert.AreEqual(Catalog_in.ParentCatalog, Catalogs_out[0].ParentCatalog, "ParentCatalog");

        }

        /**
          * Delete a Catalog and check if no error occured.
          */
        public void testDelete()
        {
            TDelete_Return[] Catalogs_out = catalogService.delete(new string[] { full });

            // test if creation was successful
            Assert.AreEqual(1, Catalogs_out.GetLength(0), "delete result set");
            Assert.IsTrue(Catalogs_out[0].deleted, "deleted?");
        }

        /**
         * Test if a Catalog exists or not
         *
         * @param expected if false the Test will be successful if the Catalog does NOT exist
         */
        public void testExists(bool expected)
        {
            TExists_Return[] Catalogs_out = catalogService.exists(new string[] { full });

            // test if creation was successful
            Assert.AreEqual(1, Catalogs_out.GetLength(0), "delete result set");
            Assert.AreEqual(expected, Catalogs_out[0].exists, "exists?");
        }

        /**
          * Sort products of a Catalog and check if the sorting was successful
          */
        public void testSort(int casenumber)
        {
            TSortProducts_Input[] Catalogs_in;
            if (casenumber == 1)
            {
                Catalogs_in = new TSortProducts_Input[] { Catalog_sort1 };
            }
            else if (casenumber == 2)
            {
                Catalogs_in = new TSortProducts_Input[] { Catalog_sort2 };
            }
            else
            {
                Catalogs_in = new TSortProducts_Input[] { Catalog_sort3 };
            };

            TSortProducts_Return[] Catalogs_out = catalogService.sortProducts(Catalogs_in);

            // test if update was successful
            Assert.AreEqual(1, Catalogs_out.GetLength(0), "sort result set");
            Assert.IsTrue(Catalogs_out[0].sorted, "sorted?");
        }

        /**
         * Move a Catalog and check if the update was successful
         */
        public void testMove( TUpdate_Input MoveCatalog)
        {
            TUpdate_Return[] Catalogs_out = catalogService.update(new TUpdate_Input[]{MoveCatalog});

            // test if creation was successful
            Assert.AreEqual(1, Catalogs_out.GetLength(0), "move ok");
            Assert.IsTrue(Catalogs_out[0].updated, "updated?");
        }

        /**
         * Get all categories recursively
         */
        public void testGetCategories()
        {
            string[] Catalogs_out = catalogService.getCategories();
            Assert.AreEqual(13, Catalogs_out.GetLength(0), "count categories");
        }

        /// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests()
		{
            testGetCategories();
            testCreate();
            testExists(true);
            testGetInfo(false);
            testUpdate();
            testGetInfo(true);
            testMove(Catalog_move);
            testMove(Catalog_move_back);
            testDelete();
            testExists(false);
            testSort(1);
            testSort(2);
            testSort(3);
		}
	}
}
