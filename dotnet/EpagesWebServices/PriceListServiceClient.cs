using System;
using EpagesWebServices.PriceListServiceRef;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call PriceList web services methods
	/// </summary>
	public class PriceListServiceClient : WebServiceConfiguration
	{
		PriceListService stub;

		public PriceListServiceClient()
		{
			stub = new PriceListService();
			stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			stub.PreAuthenticate = true;
			stub.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// use stub to create a PriceList via web services
		/// </summary>
		/// <param name="PriceLists">Array of TCreate_Input</param>
		/// <returns>ArrayList of TCreate_Return</returns>
		public ArrayList create(TCreate_Input[] PriceLists) 
		{
			TCreate_Return[] PriceLists_out = stub.create(PriceLists);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceLists_out.Length; i++)
			{
				TCreate_Return PriceList_out = PriceLists_out[i];

				if (PriceList_out.Error == null) 
				{
					Console.WriteLine("successfully created PriceList: " + PriceList_out.Path);
					result.Add(PriceList_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceList_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to create a PriceList via web services
		/// </summary>
		/// <param name="PriceLists">Array of TUpdate_Input</param>
		/// <returns>ArrayList of TUpdate_Return</returns>
		public ArrayList update(TUpdate_Input[] PriceLists) 
		{
			TUpdate_Return[] PriceLists_out = stub.update(PriceLists);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceLists_out.Length; i++)
			{
				TUpdate_Return PriceList_out = PriceLists_out[i];

				if (PriceList_out.Error == null) 
				{
					Console.WriteLine("successfully updated PriceList: " + PriceList_out.Path);
					result.Add(PriceList_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceList_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to get info of a PriceList via web services
		/// </summary>
		/// <param name="PriceListPaths">Array of Strings</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] PriceListPaths) 
		{
			return getInfo(PriceListPaths, new string[0] );
		}
		public ArrayList getInfo(string[] PriceListPaths, string[] attributes) 
		{
			return getInfo(PriceListPaths, attributes, new string[0] );
		}

		/// <summary>
		/// use stub to get info of a PriceList via web services
		/// </summary>
		/// <param name="PriceListPaths">PriceLists to get, Array of paths</param>
		/// <param name="attributes">attributes to get, Array of attribute names</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] PriceListPaths, string[] attributes, string[] languages) 
		{
			TGetInfo_Return[] PriceLists_out = stub.getInfo(PriceListPaths, attributes, languages);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceLists_out.Length; i++)
			{
				TGetInfo_Return PriceList_out = PriceLists_out[i];

				if (PriceList_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved PriceList: " + PriceList_out.Path);
					result.Add(PriceList_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceList_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to delete a PriceList via web services
		/// </summary>
		/// <param name="PriceListPaths">PriceLists to delete, Array of paths</param>
		/// <returns>ArrayList of TDelete_Return</returns>
		public ArrayList delete(string[] PriceListPaths) 
		{
			TDelete_Return[] PriceLists_out = stub.delete(PriceListPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceLists_out.Length; i++)
			{
				TDelete_Return PriceList_out = PriceLists_out[i];

				if (PriceList_out.Error == null) 
				{
					Console.WriteLine("successfully deleted PriceList: " + PriceList_out.Path);
					result.Add(PriceList_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceList_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to test existance of a PriceList via web services
		/// </summary>
		/// <param name="PriceListPaths">PriceLists to check, Array of paths</param>
		/// <returns>ArrayList of TExists_Return</returns>
		public ArrayList exists(string[] PriceListPaths) 
		{
			TExists_Return[] PriceLists_out = stub.exists(PriceListPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceLists_out.Length; i++)
			{
				TExists_Return PriceList_out = PriceLists_out[i];

				if (PriceList_out.Error == null) 
				{
					Console.WriteLine("successfully checked if PriceList exists: " + PriceList_out.Path);
					result.Add(PriceList_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceList_out.Error.Message);
				}
			}

			return result;
		}
	}
}
