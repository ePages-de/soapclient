using System;
using EpagesWebServices.TaxClassServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// NUnit test for TaxClassService
	/// </summary>
	[TestFixture]
	public class TaxClassTest : WebServiceConfiguration
	{
		TaxClassService taxClassService;

		[SetUp]
		public void Init()
		{
			taxClassService = new TaxClassService();
			taxClassService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			taxClassService.PreAuthenticate = true;
			taxClassService.Url = WEBSERVICE_URL;
		}
		
		[Test]
		public void getList()
		{
			TGetList_Return[] TaxClass_out = taxClassService.getList();

			// test if transfer was successful
			Assert.AreEqual(3, TaxClass_out.GetLength(0), "getList result count");

            Hashtable results = new Hashtable();
            foreach (TGetList_Return result in TaxClass_out) results.Add(result.Path, result);

            Assert.IsTrue(results.ContainsKey("/TaxMatrixGermany/normal"), "tax class: normal");
            Assert.IsTrue(results.ContainsKey("/TaxMatrixGermany/reduced"), "tax class: reduced");
            Assert.IsTrue(results.ContainsKey("/TaxMatrixGermany/none"), "tax class: none");

		}
	}
}
