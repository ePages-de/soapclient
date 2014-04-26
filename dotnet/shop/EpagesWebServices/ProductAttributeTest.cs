using System;
using System.IO;
using EpagesWebServices.ProductAttributeServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// NUnit test for ProductAttributeService
	/// </summary>
	[TestFixture]
	public class ProductAttributeTest : WebServiceConfiguration
	{
		ProductAttributeService productAttributeService;

		/// <summary>
		/// initialize test suite
		/// </summary>
		[SetUp]
		public void Init()
		{
			productAttributeService = new ProductAttributeService();
			productAttributeService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			productAttributeService.PreAuthenticate = true;
			productAttributeService.Url = WEBSERVICE_URL;
		}
		
		/// <summary>
		/// test the getInfoList() method
		/// </summary>
		[Test]
		public void getInfoList()
		{
			TGetInfoList_Return[] allAttributes = productAttributeService.getInfoList();

			// test if transfer was successful
			Assert.Greater(allAttributes.Length, 10, "number of attributes > 10");

			// test if the attribute "Color" exists in product type "Jacket"
			bool existsAttribute = false;
			foreach( TGetInfoList_Return attributeInfo in allAttributes )
			{
				if( attributeInfo.Alias == "Color" && attributeInfo.ProductType == "Jacket" )
				{
					existsAttribute = true;
					Assert.IsTrue( attributeInfo.IsVariationAttribute, "attribute 'Color' is a variation attribute" );
				}
			}

			Assert.IsTrue( existsAttribute, "attribute 'Color' exists in class 'Jacket'" );
		}
	}
}
