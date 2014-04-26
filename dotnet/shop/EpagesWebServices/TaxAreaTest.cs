using System;
using EpagesWebServices.TaxAreaServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// NUnit Test for TaxAreaService
	/// </summary>
	[TestFixture]
	public class TaxAreaTest : WebServiceConfiguration
	{
		TaxAreaService taxAreaService;

		[SetUp]
		public void Init()
		{
			taxAreaService = new TaxAreaService();
			taxAreaService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			taxAreaService.PreAuthenticate = true;
			taxAreaService.Url = WEBSERVICE_URL;
		}
		
		[Test]
		public void getList()
		{
			TGetList_Return[] TaxArea_out = taxAreaService.getList();

			// test if transfer was successful
			Assert.AreEqual(2, TaxArea_out.Length, "getList result count");

            Hashtable results = new Hashtable();
            foreach (TGetList_Return result in TaxArea_out) results.Add(result.Path, result);
			
			Assert.IsTrue( results.ContainsKey("/TaxMatrixGermany/EU"), "tax area: EU");
            Assert.IsTrue( results.ContainsKey("/TaxMatrixGermany/\"non EU\""), "tax area: non EU");

        }
	}
}
