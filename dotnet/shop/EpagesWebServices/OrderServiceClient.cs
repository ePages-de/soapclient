using System;
using EpagesWebServices.OrderServiceRef;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call Order web services methods
	/// </summary>
    public class OrderServiceClient : WebServiceConfiguration
	{
		OrderService stub;
        public OrderServiceClient()
        {
            stub = new OrderService();
            stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
            stub.PreAuthenticate = true;
            stub.Url = WEBSERVICE_URL;
        }

		/// <summary>
		/// use stub to create a Order via web services
		/// </summary>
		/// <param name="Orders">Array of TCreate_Input</param>
		/// <returns>ArrayList of TCreate_Return</returns>
		public ArrayList create(TCreate_Input[] Orders) 
		{
			TCreate_Return[] Orders_out = stub.create(Orders);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Orders_out.Length; i++)
			{
				TCreate_Return Order_out = Orders_out[i];

				if (Order_out.Error == null) 
				{
					Console.WriteLine("successfully created Order: " + Order_out.Path);
					result.Add(Order_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Order_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to create a Order via web services
		/// </summary>
		/// <param name="Orders">Array of TUpdate_Input</param>
		/// <returns>ArrayList of TUpdate_Return</returns>
		public ArrayList update(TUpdate_Input[] Orders) 
		{
			TUpdate_Return[] Orders_out = stub.update(Orders);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Orders_out.Length; i++)
			{
				TUpdate_Return Order_out = Orders_out[i];

				if (Order_out.Error == null) 
				{
					Console.WriteLine("successfully updated Order: " + Order_out.Path);
					result.Add(Order_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Order_out.Error.Message);
				}
			}

			return result;
		}
		
		public ArrayList getInfo(string[] OrderPaths) 
		{
			return getInfo(OrderPaths, new string[0] );
		}
		public ArrayList getInfo(string[] OrderPaths, string[] attributes) 
		{
			return getInfo(OrderPaths, attributes, new string[0] );
		}

		/// <summary>
		/// use stub to get info of a Order via web services
		/// </summary>
		/// <param name="OrderPaths">Orders to get, Array of paths</param>
		/// <param name="attributes">attributes to get, Array of attribute names</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] OrderPaths, string[] attributes, string[] languages) 
		{
			TGetInfo_Return[] Orders_out = stub.getInfo(OrderPaths, attributes, languages);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Orders_out.Length; i++)
			{
				TGetInfo_Return Order_out = Orders_out[i];

				if (Order_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved Order: " + Order_out.Path);
					result.Add(Order_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Order_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to delete a Order via web services
		/// </summary>
		/// <param name="OrderPaths">Orders to delete, Array of paths</param>
		/// <returns>ArrayList of TDelete_Return</returns>
		public ArrayList delete(string[] OrderPaths) 
		{
			TDelete_Return[] Orders_out = stub.delete(OrderPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Orders_out.Length; i++)
			{
				TDelete_Return Order_out = Orders_out[i];

				if (Order_out.Error == null) 
				{
					Console.WriteLine("successfully deleted Order: " + Order_out.Path);
					result.Add(Order_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Order_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to test existance of a Order via web services
		/// </summary>
		/// <param name="OrderPaths">Orders to check, Array of paths</param>
		/// <returns>ArrayList of TExists_Return</returns>
		public ArrayList exists(string[] OrderPaths) 
		{
			TExists_Return[] Orders_out = stub.exists(OrderPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Orders_out.Length; i++)
			{
				TExists_Return Order_out = Orders_out[i];

				if (Order_out.Error == null) 
				{
					Console.WriteLine("successfully checked if Order exists: " + Order_out.Path);
					result.Add(Order_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Order_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to find Orders via web services
		/// </summary>
		/// <param name="parameters">search parameters, TFind_Input</param>
		/// <returns>found Orders, Array of paths</returns>
		public string[] find(TFind_Input parameters) 
		{
			string[] paths = stub.find(parameters);

			Console.WriteLine("found entries: " + paths.Length);

			return paths;
		}
	}
}
