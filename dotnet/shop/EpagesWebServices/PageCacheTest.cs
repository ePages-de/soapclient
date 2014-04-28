using System;
using System.IO;
using EpagesWebServices.PageCacheServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// A NUnit Test for PageCacheService
	/// </summary>
	[TestFixture]
	public class PageCacheTest : WebServiceConfiguration
	{
		PageCacheService pageCacheService;

		/// <summary>
		/// initialize the test suite
		/// </summary>
		[SetUp]
		public void Init()
		{
			pageCacheService = new PageCacheService();
			pageCacheService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			pageCacheService.PreAuthenticate = true;
			pageCacheService.Url = WEBSERVICE_URL;
		}
		
		/// <summary>
		/// test the clear() method
		/// </summary>
		[Test]
		public void clear() 
		{
			pageCacheService.clear();

			Console.WriteLine("successfully cleared the page cache");
			Assert.IsTrue( true, "PageCacheService.clear()");
		}
	}
}
