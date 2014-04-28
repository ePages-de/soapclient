using System;
using EpagesWebServices.CatalogServiceRef;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call Catalog web services methods
	/// </summary>
	public class CatalogServiceClient : WebServiceConfiguration
	{
		CatalogService stub;

		public CatalogServiceClient()
		{
			stub = new CatalogService();
			stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			stub.PreAuthenticate = true;
			stub.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// use stub to create a Catalog via web services
		/// </summary>
		/// <param name="Catalogs">Array of TCreate_Input</param>
		/// <returns>ArrayList of TCreate_Return</returns>
		public ArrayList create(TCreate_Input[] Catalogs) 
		{
			TCreate_Return[] Catalogs_out = stub.create(Catalogs);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Catalogs_out.Length; i++)
			{
				TCreate_Return Catalog_out = Catalogs_out[i];

				if (Catalog_out.Error == null) 
				{
					Console.WriteLine("successfully created Catalog: " + Catalog_out.Path);
					result.Add(Catalog_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Catalog_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to create a Catalog via web services
		/// </summary>
		/// <param name="Catalogs">Array of TUpdate_Input</param>
		/// <returns>ArrayList of TUpdate_Return</returns>
		public ArrayList update(TUpdate_Input[] Catalogs) 
		{
			TUpdate_Return[] Catalogs_out = stub.update(Catalogs);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Catalogs_out.Length; i++)
			{
				TUpdate_Return Catalog_out = Catalogs_out[i];

				if (Catalog_out.Error == null) 
				{
					Console.WriteLine("successfully updated Catalog: " + Catalog_out.Path);
					result.Add(Catalog_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Catalog_out.Error.Message);
				}
			}

			return result;
		}
		
		public ArrayList getInfo(string[] CatalogPaths) 
		{
			return getInfo(CatalogPaths, new string[0] );
		}
		public ArrayList getInfo(string[] CatalogPaths, string[] attributes) 
		{
			return getInfo(CatalogPaths, attributes, new string[0] );
		}

		/// <summary>
		/// use stub to get info of a Catalog via web services
		/// </summary>
		/// <param name="CatalogPaths">Catalogs to get, Array of paths</param>
		/// <param name="attributes">attributes to get, Array of attribute names</param>
		/// <param name="languages">languages to get, Array of language codes (de, en, etc.)</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] CatalogPaths, string[] attributes, string[] languages) 
		{
			TGetInfo_Return[] Catalogs_out = stub.getInfo(CatalogPaths, attributes, languages);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Catalogs_out.Length; i++)
			{
				TGetInfo_Return Catalog_out = Catalogs_out[i];

				if (Catalog_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved Catalog: " + Catalog_out.Path);
					result.Add(Catalog_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Catalog_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to delete a Catalog via web services
		/// </summary>
		/// <param name="CatalogPaths">Catalogs to delete, Array of paths</param>
		/// <returns>ArrayList of TDelete_Return</returns>
		public ArrayList delete(string[] CatalogPaths) 
		{
			TDelete_Return[] Catalogs_out = stub.delete(CatalogPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Catalogs_out.Length; i++)
			{
				TDelete_Return Catalog_out = Catalogs_out[i];

				if (Catalog_out.Error == null) 
				{
					Console.WriteLine("successfully deleted Catalog: " + Catalog_out.Path);
					result.Add(Catalog_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Catalog_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to test existance of a Catalog via web services
		/// </summary>
		/// <param name="CatalogPaths">Catalogs to check, Array of paths</param>
		/// <returns>ArrayList of TExists_Return</returns>
		public ArrayList exists(string[] CatalogPaths) 
		{
			TExists_Return[] Catalogs_out = stub.exists(CatalogPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Catalogs_out.Length; i++)
			{
				TExists_Return Catalog_out = Catalogs_out[i];

				if (Catalog_out.Error == null) 
				{
					Console.WriteLine("successfully checked if Catalog exists: " + Catalog_out.Path);
					result.Add(Catalog_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Catalog_out.Error.Message);
				}
			}

			return result;
		}
	}
}
