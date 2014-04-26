using System;
using EpagesWebServices.CatalogServiceRef;
using NUnit.Framework;
using System.Collections;
using System.Collections.Specialized;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of Catalog web service
	/// </summary>
	[TestFixture]
	public class CatalogTest
	{
		CatalogServiceClient serviceClient;
		TCreate_Input Catalog_in = new TCreate_Input();
		TUpdate_Input Catalog_update = new TUpdate_Input();

		string alias = "dotnet_test-1";
		string path = "/Shops/DemoShop/Categories";
		string full;

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new CatalogServiceClient();
			full = path + "/" + alias;
			
			// create test Catalogs that can be used with the create and update methods
			Catalog_in.Alias = alias;
			
			Catalog_in.IsVisible = true;
            Catalog_in.IsVisibleSpecified = true;
			Catalog_in.ParentCatalog = path;
			
			TLocalizedValue name_de = new TLocalizedValue();
			name_de.LanguageCode = "de";
			name_de.Value = "Mein Katalogname";
			TLocalizedValue name_en = new TLocalizedValue();
			name_en.LanguageCode = "en";
			name_en.Value = "My Catalog Name";
			Catalog_in.Name = new TLocalizedValue[]{name_de, name_en};

            TAttribute attr = new TAttribute();
			attr.Name = "Date";
            attr.Type = "DateTime";
            attr.Value = "2005-12-24T10:00:00";
            Catalog_in.Attributes = new TAttribute[] { attr };

			Catalog_update.Path = full;

			// IMPORTANT!!!
			// .NET has the terrible behavior, to set all boolean and numeric value that are not
			// defined to "false" resp. "0"
			// So if you update an object and do not set the "IsVisible" flag, it will set the object to
			// invisible!!!
			Catalog_update.IsVisible = true;
            Catalog_update.IsVisibleSpecified = true;

			TLocalizedValue name_de_updated = new TLocalizedValue();
			name_de_updated.LanguageCode = "de";
			name_de_updated.Value = "Mein geänderter Katalogname";
			TLocalizedValue name_en_updated = new TLocalizedValue();
			name_en_updated.LanguageCode = "en";
			name_en_updated.Value = "My updated Catalog Name";
			Catalog_update.Name = new TLocalizedValue[]{name_de_updated, name_en_updated};

            TAttribute attr_update = new TAttribute();
			attr_update.Name = "Date";
            attr_update.Type = "DateTime";
            attr_update.Value = "2005-12-24T18:00:00";
            Catalog_update.Attributes = new TAttribute[] { attr_update };
		}

		/// <summary>
		/// test getInfo() and check result against created resp. updated Catalog
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated Catalog</param>
		public void getInfo(bool alreadyUpdated)
		{
			string[] CatalogPaths = new string[]{full};
			ArrayList Catalogs_out = serviceClient.getInfo(CatalogPaths, new string[]{"Date"});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, Catalogs_out.Count, "get info result set");

			TGetInfo_Return Catalog_out = (TGetInfo_Return)Catalogs_out.ToArray()[0];
			Assert.AreEqual(alias, Catalog_out.Alias, "Catalog alias");
			Assert.AreEqual(2, Catalog_out.Name.Length, "Number of languages");

            StringDictionary resultName = new StringDictionary();
			resultName.Add(Catalog_out.Name[0].LanguageCode, Catalog_out.Name[0].Value);
			resultName.Add(Catalog_out.Name[1].LanguageCode, Catalog_out.Name[1].Value);

			if (alreadyUpdated) 
			{
				Assert.AreEqual(Catalog_update.Attributes[0].Name,  Catalog_out.Attributes[0].Name,  "attribute name: Date");
				Assert.AreEqual(DateTime.Parse(Catalog_update.Attributes[0].Value), DateTime.Parse(Catalog_out.Attributes[0].Value), "attribute value: Date");
				Assert.AreEqual(Catalog_update.IsVisible, Catalog_out.IsVisible, "IsVisible");

				Assert.AreEqual(Catalog_update.Name[0].Value, resultName[Catalog_update.Name[0].LanguageCode], "initial localized Name");
				Assert.AreEqual(Catalog_update.Name[1].Value, resultName[Catalog_update.Name[1].LanguageCode], "initial localized Name");
			} 
			else 
			{
				Assert.AreEqual(Catalog_in.Attributes[0].Name,  Catalog_out.Attributes[0].Name,  "attribute name: Date");
                Assert.AreEqual(DateTime.Parse(Catalog_in.Attributes[0].Value), DateTime.Parse(Catalog_out.Attributes[0].Value), "attribute value: Date");
                Assert.AreEqual(Catalog_in.IsVisible, Catalog_out.IsVisible, "IsVisible");

				Assert.AreEqual(Catalog_in.Name[0].Value, resultName[Catalog_in.Name[0].LanguageCode], "updated localized Name");
				Assert.AreEqual(Catalog_in.Name[1].Value, resultName[Catalog_in.Name[1].LanguageCode], "updated localized Name");
			}
		}

		/// <summary>
		/// test creation of a Catalog and check if method returns a true value
		/// </summary>
		public void create()
		{
			TCreate_Input[] Catalogs = new TCreate_Input[]{Catalog_in};

			ArrayList Catalogs_out = serviceClient.create(Catalogs);

			// test if creation was successful
			Assert.AreEqual(1, Catalogs_out.Count, "create result set");

			TCreate_Return Catalog_out = (TCreate_Return)Catalogs_out.ToArray()[0];
			Assert.AreEqual(alias, Catalog_out.Alias, "Catalog alias");
			Assert.AreEqual(true, Catalog_out.created, "created?");
		}
		
		/// <summary>
		/// test update of a Catalog and check if method returns a true value
		/// </summary>
		public void update()
		{
			TUpdate_Input[] Catalogs = new TUpdate_Input[]{Catalog_update};

			ArrayList Catalogs_out = serviceClient.update(Catalogs);

			// test if update was successful
			Assert.AreEqual(1, Catalogs_out.Count, "update result set");

			TUpdate_Return Catalog_out = (TUpdate_Return)Catalogs_out.ToArray()[0];
			Assert.AreEqual(full, Catalog_out.Path, "Catalog path");
			Assert.AreEqual(true, Catalog_out.updated, "updated?");
		}
		
		/// <summary>
		/// this is not an actual test.
		/// delete may existing Catalog at the beginning of the test suite
		/// </summary>
		public void deleteIfExists()
		{
			string[] CatalogPaths = new string[]{full};
			ArrayList Catalogs_exists_out = serviceClient.exists(CatalogPaths);
			TExists_Return Catalog_exists_out = (TExists_Return)Catalogs_exists_out.ToArray()[0];
			
			if (! Catalog_exists_out.exists) 
			{
				return;
			}

			serviceClient.delete(CatalogPaths);
		}

		/// <summary>
		/// test deletion of a Catalog and check if method returns a true value
		/// </summary>
		public void delete()
		{
			string[] CatalogPaths = new string[]{full};
			ArrayList Catalogs_out = serviceClient.delete(CatalogPaths);

			// test if deletion was successful
			Assert.AreEqual(1, Catalogs_out.Count, "delete result set");

			TDelete_Return Catalog_out = (TDelete_Return)Catalogs_out.ToArray()[0];
			Assert.AreEqual(full, Catalog_out.Path, "Catalog path");
			Assert.AreEqual(true, Catalog_out.deleted, "deleted?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the Catalog does NOT exists</param>
		public void exists(bool exists)
		{
			string[] CatalogPaths = new string[]{full};
			ArrayList Catalogs_out = serviceClient.exists(CatalogPaths);

			// test if exists check was successful
			Assert.AreEqual(1, Catalogs_out.Count, "exists result set");

			TExists_Return Catalog_out = (TExists_Return)Catalogs_out.ToArray()[0];
			Assert.AreEqual(full, Catalog_out.Path, "Catalog path");
			Assert.AreEqual(exists, Catalog_out.exists, "exists?");
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
			getInfo(false);
			update();
			getInfo(true);
			delete();	
			exists(false);
		}
	}
}
