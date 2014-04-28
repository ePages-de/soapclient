using System;
using System.IO;
using EpagesWebServices.CustomerGroupServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of Product web service
	/// </summary>
	[TestFixture]
	public class CustomerGroupTest : WebServiceConfiguration
	{
		CustomerGroupService customerGroupService;

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
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests() 
		{
			getList();
		}
	}
}
