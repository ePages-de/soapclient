using System;
using System.IO;
using EpagesWebServices.CustomerGroupService2Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of Product web service
	/// </summary>
	[TestFixture]
	public class CustomerGroup2Test : WebServiceConfiguration
	{
		CustomerGroupService customerGroupService;

        TCreate_Input group_in = new TCreate_Input();
        TUpdate_Input group_up = new TUpdate_Input();

        string alias = "dotnet-testGroup-1";
        //string path = "/Shops/DemoShop/Groups";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			customerGroupService = new CustomerGroupService();
			customerGroupService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			customerGroupService.PreAuthenticate = true;
			customerGroupService.Url = WEBSERVICE_URL;

            group_in.Alias = alias;
            TLocalizedValue name_de = new TLocalizedValue();
                name_de.LanguageCode = "de";
                name_de.Value = "TestGruppe";
            TLocalizedValue name_en = new TLocalizedValue();
                name_en.LanguageCode = "en";
                name_en.Value = "TestGroup";

            group_up.Alias = alias;
            TLocalizedValue name2_de = new TLocalizedValue();
                name_de.LanguageCode = "de";
                name_de.Value = "TestGruppe modifiziert";
            TLocalizedValue name2_en = new TLocalizedValue();
                name_en.LanguageCode = "en";
                name_en.Value = "TestGroup changed";

        }

		public void getList()
		{
			TGetList_Return[] CGroups_out = customerGroupService.getList();

			// test if transfer was successful
			Assert.AreEqual(2, CGroups_out.Length, "getList result count");

			TGetList_Return CGroup_out1 = CGroups_out[0];
            if (CGroup_out1.Error == null)
			{
                Console.WriteLine("successfully transfered CustomerGroup: " + CGroup_out1.Alias);
                Assert.AreEqual("NewCustomer", CGroup_out1.Alias, "test Param 1 NewCustomer");
			}
			else
			{
                Console.WriteLine("an error occured (Epages Error):\n" + CGroup_out1.Error.Message);
                Assert.IsNotNull(CGroup_out1.Error, "getList: no error");
			}

            TGetList_Return CGroup_out2 = CGroups_out[1];
            if (CGroup_out2.Error == null)
			{
                Console.WriteLine("successfully transfered CustomerGroup: " + CGroup_out2.Alias);
                Assert.AreEqual("RegularCustomer", CGroup_out2.Alias, "test Param 2 RegularCustomer");
			}
			else
			{
                Console.WriteLine("an error occured (Epages Error):\n" + CGroup_out2.Error.Message);
                Assert.IsNotNull(CGroup_out2.Error, "getList: no error");
			}
		}

        /// <summary>
        /// test creation of a customer group and check if method returns a true value
        /// </summary>
        public void testCreate()
        {
            TCreate_Input[] groups = new TCreate_Input[] { group_in };

            TCreate_Return[] groups_out = customerGroupService.create(groups);

            // test if creation was successful
            Assert.AreEqual(1, groups_out.Length, "create result set");

            TCreate_Return group_out = groups_out[0];
            Assert.AreEqual(alias, group_out.Alias, "customer alias");
            Assert.AreEqual(true, group_out.created, "created?");
        }

        /// <summary>
        /// test update of a customer group and check if method returns a true value
        /// </summary>
        public void testUpdate()
        {
            TUpdate_Input[] groups = new TUpdate_Input[] { group_up };

            TUpdate_Return[] groups_out = customerGroupService.update(groups);

            // test if creation was successful
            Assert.AreEqual(1, groups_out.Length, "update result set");

            TUpdate_Return group_out = groups_out[0];
            Assert.AreEqual(alias, group_out.Alias, "customer alias");
            Assert.AreEqual(true, group_out.updated, "updated?");
        }

        /// <summary>
        /// test delete of a customer group and check if method returns a true value
        /// </summary>
        public void testDelete()
        {
            TDelete_Return[] groups_out = customerGroupService.delete(new string[]{alias});

            // test if creation was successful
            Assert.AreEqual(1, groups_out.Length, "delete result set");

            TDelete_Return group_out = groups_out[0];
            Assert.AreEqual(alias, group_out.Alias, "customer alias");
            Assert.AreEqual(true, group_out.deleted, "deleted?");
        }

        /// <summary>
        /// test exists method
        /// </summary>
        /// <param name="exists">if false, test is successful if the customer does NOT exists</param>
        public void testExists(bool exists)
        {
            TExists_Return[] groups_out = customerGroupService.exists(new string[]{alias});

            // test if exists check was successful
            Assert.AreEqual(1, groups_out.Length, "exists result set");

            TExists_Return group_out = groups_out[0];
            Assert.AreEqual(alias, group_out.Alias, "group alias");
            Assert.AreEqual(exists, group_out.exists, "exists?");
        }

        /// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests()
		{
			getList();
            testCreate();
            testExists(true);
            testUpdate();
            testDelete();
            testExists(false);
		}
	}
}
