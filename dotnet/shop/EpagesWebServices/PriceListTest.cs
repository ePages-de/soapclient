using System;
using EpagesWebServices.PriceListServiceRef;
using EpagesWebServices.CustomerGroupServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of PriceList web service
	/// </summary>
	[TestFixture]
	public class PriceListTest
	{
		PriceListServiceClient serviceClient;
		TCreate_Input PriceList_in = new TCreate_Input();
		TUpdate_Input PriceList_update = new TUpdate_Input();

		string alias = "dotnet_test-1";
		string path = "/Shops/DemoShop/PriceLists/";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
            // try to get customer groups at first, because they are different since patch 7
            string customerGroupsPath = "/Shops/DemoShop/Groups/";
            string[] customerGroups = new string[]{
    		    customerGroupsPath+"NewCustomer",
    		    customerGroupsPath+"RegularCustomer"
    	    };

            WebServiceConfiguration WSConfig = new WebServiceConfiguration();

            CustomerGroupService custService = new CustomerGroupService();
			custService.Credentials = new System.Net.NetworkCredential(WSConfig.WEBSERVICE_LOGIN, WSConfig.WEBSERVICE_PASSWORD);
            custService.PreAuthenticate = true;
            custService.Url = WSConfig.WEBSERVICE_URL;
            TGetList_Return[] retGroups = custService.getList();
            customerGroups[0] = customerGroupsPath + retGroups[0].Alias;
            customerGroups[1] = customerGroupsPath + retGroups[1].Alias;

            serviceClient = new PriceListServiceClient();
            
            // create test PriceLists that can be used with the create and update methods
			PriceList_in.Alias = alias;
			PriceList_in.CurrencyID = "EUR";
            PriceList_in.CustomerGroups = new string[] { customerGroups[0] };
			PriceList_in.Customers = new string[]{"/Shops/DemoShop/Customers/1001"};

			TLocalizedValue name_de = new TLocalizedValue();
			name_de.LanguageCode = "de";
			name_de.Value = "Meine Preisliste";
			TLocalizedValue name_en = new TLocalizedValue();
			name_en.LanguageCode = "en";
			name_en.Value = "my price list";
			PriceList_in.Name = new TLocalizedValue[]{name_de, name_en};

			PriceList_in.TaxModel = "gross";
            PriceList_in.ValidFrom = new DateTime(2005, 12, 1, 0, 0, 0, DateTimeKind.Local);
            PriceList_in.ValidTo = new DateTime(2005, 12, 31, 0, 0, 0, DateTimeKind.Local);

			TAttribute attr = new TAttribute();
			attr.Name = "CreationDate";
            attr.Type = "DateTime";
            attr.Value = "2006-01-01T00:00:00";
			PriceList_in.Attributes = new TAttribute[]{attr};

			PriceList_update.Path = path + alias;

			TLocalizedValue name_de_update = new TLocalizedValue();
			name_de_update.LanguageCode = "de";
			name_de_update.Value = "Meine geänderte Preisliste";
			TLocalizedValue name_en_update = new TLocalizedValue();
			name_en_update.LanguageCode = "en";
			name_en_update.Value = "my updated price list";
			PriceList_update.Name = new TLocalizedValue[]{name_de_update, name_en_update};

			// IMPORTANT!!!
			// .NET has the terrible behavior, to set all boolean and numeric value (incl. dates) that are not
			// defined to "false" resp. "0"
			// So if you update an object and do not set the "IsVisible" flag, it will set the object to
			// invisible!!!

            PriceList_update.ValidFrom = new DateTime(2005, 12, 1, 0, 0, 0, DateTimeKind.Local);
            PriceList_update.ValidTo = new DateTime(2005, 12, 31, 0, 0, 0, DateTimeKind.Local);

			TAttribute attr_update = new TAttribute();
			attr_update.Name = "CreationDate";
            attr_update.Type = "DateTime";
            attr_update.Value = "2006-01-01T11:11:11";
			PriceList_update.Attributes = new TAttribute[]{attr_update};
		}

		/// <summary>
		/// test getInfo() and check result against created resp. updated PriceList
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated PriceList</param>
		public void getInfo(bool alreadyUpdated)
		{
			string[] PriceListPaths = new string[]{path + alias};
			ArrayList PriceLists_out = serviceClient.getInfo(PriceListPaths, new string[]{"CreationDate"});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, PriceLists_out.Count, "get info result set");

			TGetInfo_Return PriceList_out = (TGetInfo_Return)PriceLists_out.ToArray()[0];
			Assert.AreEqual(alias, PriceList_out.Alias, "PriceList alias");
			Assert.AreEqual(2, PriceList_out.Name.Length, "Number of languages");

			Hashtable resultName = new Hashtable();
			resultName.Add(PriceList_out.Name[0].LanguageCode, PriceList_out.Name[0].Value);
			resultName.Add(PriceList_out.Name[1].LanguageCode, PriceList_out.Name[1].Value);

			if (alreadyUpdated) 
			{
				Assert.AreEqual(DateTime.Parse(PriceList_update.Attributes[0].Value), DateTime.Parse(PriceList_out.Attributes[0].Value), "CreationDate");

				Assert.AreEqual(PriceList_update.Name[0].Value, resultName[PriceList_update.Name[0].LanguageCode], "initial localized Name");
				Assert.AreEqual(PriceList_update.Name[1].Value, resultName[PriceList_update.Name[1].LanguageCode], "initial localized Name");
			} 
			else 
			{
				Assert.AreEqual(DateTime.Parse(PriceList_in.Attributes[0].Value), DateTime.Parse(PriceList_out.Attributes[0].Value), "CreationDate");

				Assert.AreEqual(PriceList_in.Name[0].Value, resultName[PriceList_in.Name[0].LanguageCode], "updated localized Name");
				Assert.AreEqual(PriceList_in.Name[1].Value, resultName[PriceList_in.Name[1].LanguageCode], "updated localized Name");
			}
			Assert.IsTrue(PriceList_out.CustomerGroups.Length == 1, "CustomerGroups result set");
			Assert.IsTrue(PriceList_out.Customers.Length == 1, "Customers result set");

			Assert.AreEqual(PriceList_in.CurrencyID,             PriceList_out.CurrencyID, "CurrencyID");
			Assert.AreEqual(PriceList_in.TaxModel,               PriceList_out.TaxModel, "TaxModel");
			Assert.AreEqual(PriceList_in.ValidFrom,              PriceList_out.ValidFrom, "ValidFrom");
			Assert.AreEqual(PriceList_in.ValidTo,                PriceList_out.ValidTo, "ValidTo");
		}

		/// <summary>
		/// test creation of a PriceList and check if method returns a true value
		/// </summary>
		public void create()
		{
			TCreate_Input[] PriceLists = new TCreate_Input[]{PriceList_in};

			ArrayList PriceLists_out = serviceClient.create(PriceLists);

			// test if creation was successful
			Assert.AreEqual(1, PriceLists_out.Count, "create result set");

			TCreate_Return PriceList_out = (TCreate_Return)PriceLists_out.ToArray()[0];
			Assert.AreEqual(alias, PriceList_out.Alias, "PriceList alias");
			Assert.AreEqual(true, PriceList_out.created, "created?");
		}
		
		/// <summary>
		/// test update of a PriceList and check if method returns a true value
		/// </summary>
		public void update()
		{
			TUpdate_Input[] PriceLists = new TUpdate_Input[]{PriceList_update};

			ArrayList PriceLists_out = serviceClient.update(PriceLists);

			// test if update was successful
			Assert.AreEqual(1, PriceLists_out.Count, "update result set");

			TUpdate_Return PriceList_out = (TUpdate_Return)PriceLists_out.ToArray()[0];
			Assert.AreEqual(path + alias, PriceList_out.Path, "PriceList path");
			Assert.AreEqual(true, PriceList_out.updated, "updated?");
		}
		
		/// <summary>
		/// this is not an actual test.
		/// delete may existing PriceList at the beginning of the test suite
		/// </summary>
		public void deleteIfExists()
		{
			string[] PriceListPaths = new string[]{path + alias};
			ArrayList PriceLists_exists_out = serviceClient.exists(PriceListPaths);
			TExists_Return PriceList_exists_out = (TExists_Return)PriceLists_exists_out.ToArray()[0];
			
			if (! PriceList_exists_out.exists) 
			{
				return;
			}

			serviceClient.delete(PriceListPaths);
		}

		/// <summary>
		/// test deletion of a PriceList and check if method returns a true value
		/// </summary>
		public void delete()
		{
			string[] PriceListPaths = new string[]{path + alias};
			ArrayList PriceLists_out = serviceClient.delete(PriceListPaths);

			// test if deletion was successful
			Assert.AreEqual(1, PriceLists_out.Count, "delete result set");

			TDelete_Return PriceList_out = (TDelete_Return)PriceLists_out.ToArray()[0];
			Assert.AreEqual(path + alias, PriceList_out.Path, "PriceList path");
			Assert.AreEqual(true, PriceList_out.deleted, "deleted?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the PriceList does NOT exists</param>
		public void exists(bool exists)
		{
			string[] PriceListPaths = new string[]{path + alias};
			ArrayList PriceLists_out = serviceClient.exists(PriceListPaths);

			// test if exists check was successful
			Assert.AreEqual(1, PriceLists_out.Count, "exists result set");

			TExists_Return PriceList_out = (TExists_Return)PriceLists_out.ToArray()[0];
			Assert.AreEqual(path + alias, PriceList_out.Path, "PriceList path");
			Assert.AreEqual(exists, PriceList_out.exists, "exists?");
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
