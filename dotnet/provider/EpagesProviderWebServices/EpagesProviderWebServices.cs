using System;

using EpagesProviderWebServices;

namespace EpagesProviderWebServices
{
	/// <summary>
	/// Summary description for Class1.
	/// </summary>
	class Class1
	{
		/// <summary>
		/// The main entry point for the application.
		/// </summary>
		[STAThread]
		static void Main(string[] args)
		{
			/*
			ShopCountTest test = new ShopCountTest();
			test.Init();
			test.getCount();
			test.getAllCounts();
			*/

            ShopConfig6Test test = new ShopConfig6Test();
            test.Init();
            test.shopInStoreDatabase();
            
            Console.WriteLine("Please start: nunit-gui.exe EpagesProviderWebServices.exe /run");
		}
	}
}
