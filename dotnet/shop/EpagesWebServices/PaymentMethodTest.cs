using System;
using EpagesWebServices.PaymentMethodServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// NUnit Test for PaymentMethod
	/// </summary>
	[TestFixture]
	public class PaymentMethodTest : WebServiceConfiguration
	{
        PaymentMethodService paymentMethodService;

		[SetUp]
		public void Init()
		{
            paymentMethodService = new PaymentMethodService();
			paymentMethodService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			paymentMethodService.PreAuthenticate = true;
			paymentMethodService.Url = WEBSERVICE_URL;
		}

		[Test]
		public void getList()
		{
			int minMethodCount = 5;
            TGetList_Return[] PaymentMethod_out = paymentMethodService.getList();

			// test if transfer was successful
			Assert.LessOrEqual(minMethodCount, PaymentMethod_out.GetLength(0), "getList result count");
		}
	}
}

