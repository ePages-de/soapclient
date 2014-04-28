using System;
using EpagesWebServices.CustomerServiceRef;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Summary description for Class1.
	/// </summary>
	class EpagesWebServices
	{
		/// <summary>
		/// The main entry point for the application.
		/// </summary>
		[STAThread]
		static void Main(string[] args)
		{
			Console.WriteLine("Please start: nunit-gui.exe EpagesWebServices.exe /run");
            CatalogServiceClient c = new CatalogServiceClient();
		}
	}
}
