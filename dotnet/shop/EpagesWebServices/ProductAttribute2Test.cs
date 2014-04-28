using System;
using System.IO;
using EpagesWebServices.ProductAttributeService2Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// NUnit test for ProductAttribute2Service
	/// </summary>
	[TestFixture]
	public class ProductAttribute2Test : WebServiceConfiguration
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
			Assert.Greater( allAttributes.Length, 10, "number of attributes > 10" );

			// test attributes "Size" and Color in product type "Jacket"
			foreach ( TGetInfoList_Return attributeInfo in allAttributes )
			{
				// check product type Jacket
				if ( attributeInfo.ProductTypeAlias == "Jacket" )
				{
					// check attribute Size
					if ( attributeInfo.Alias == "Size" )
					{
						Assert.IsTrue( true, "attribute 'Size' of Type 'Jacket' exists" );
						TPreDefAttribute[] preDefAttributes = attributeInfo.PreDefAttributes;
						Assert.Greater( preDefAttributes.GetLength(0), 0, "attribute 'Size' of Type 'Jacket' has predefined attributes" );
						for ( int i=0; i<preDefAttributes.GetLength(0); i++ )
						{
							if ( preDefAttributes[i].Alias == "S" ) 
							{
								Assert.IsTrue( true, "attribute 'Size' has predefined attribute 'S'");
								Assert.AreEqual( preDefAttributes[i].Value, "S", "attribute 'Size' has right predefined value 'S'" );
							}
							if ( preDefAttributes[i].Alias == "XXL" ) 
							{
								Assert.IsTrue( true, "attribute 'Size' has predefined attribute 'XXL'");
								Assert.AreEqual( preDefAttributes[i].Value, "XXL", "attribute 'Size' has right predefined value 'XXL'" );
							}
						}
					}

					// check attribute Color
					if ( attributeInfo.Alias == "Color" )
					{
						Assert.IsTrue( true, "attribute 'Color' of Type 'Jacket' exists" );
						TPreDefAttribute[] preDefAttributes = attributeInfo.PreDefAttributes;
						Assert.Greater( preDefAttributes.GetLength(0), 0, "attribute 'Color' of Type 'Jacket' has predefined attributes" );
						for ( int i=0; i<preDefAttributes.GetLength(0); i++ )
						{
							if ( preDefAttributes[i].Alias == "Black" ) 
							{
								Assert.IsTrue( true, "attribute 'Color' has predefined attribute 'Black'");
								TLocalizedValue[] locValue = preDefAttributes[i].LocalizedValues;
								for ( int j=0; j<locValue.GetLength(0); j++ ) 
								{
									if ( locValue[j].LanguageCode == "en" ) 
									{
										Assert.AreEqual( locValue[j].Value, "Black", "attribute 'Color' has right predefined value 'Black'");
									}
									if ( locValue[j].LanguageCode == "de" ) 
									{
										Assert.AreEqual( locValue[j].Value, "Schwarz", "attribute 'Color' has right predefined value 'Schwarz'");
									}
								}
							}
							if ( preDefAttributes[i].Alias == "ExtremeRed" ) 
							{
								Assert.IsTrue( true, "attribute 'Color' has predefined attribute 'ExtremeRed'");
								TLocalizedValue[] locValue = preDefAttributes[i].LocalizedValues;
								for ( int j=0; j<locValue.GetLength(0); j++ ) 
								{
									if ( locValue[j].LanguageCode == "en" ) 
									{
										Assert.AreEqual( locValue[j].Value, "Extreme red", "attribute 'Color' has right predefined value 'Extreme red'");
									}
									if ( locValue[j].LanguageCode == "de" ) 
									{
										Assert.AreEqual( locValue[j].Value, "Extrem Rot", "attribute 'Color' has right predefined value 'Extrem Rot'");
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
