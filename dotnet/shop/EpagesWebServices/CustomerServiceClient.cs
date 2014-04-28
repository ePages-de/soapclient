using System;
using EpagesWebServices.CustomerServiceRef;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call customer web services methods
	/// </summary>
	public class CustomerServiceClient : WebServiceConfiguration
	{
		CustomerService stub;

		public CustomerServiceClient()
		{
			stub = new CustomerService();
			stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			stub.PreAuthenticate = true;
			stub.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// use stub to create a customer via web services
		/// </summary>
		/// <param name="customers">Array of TCreate_Input</param>
		/// <returns>ArrayList of TCreate_Return</returns>
		public ArrayList create(TCreate_Input[] customers) 
		{
			TCreate_Return[] customers_out = stub.create(customers);

			ArrayList result = new ArrayList();

			for(int i = 0; i < customers_out.Length; i++)
			{
				TCreate_Return customer_out = customers_out[i];

				if (customer_out.Error == null) 
				{
					Console.WriteLine("successfully created customer: " + customer_out.Path);
					result.Add(customer_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + customer_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to create a customer via web services
		/// </summary>
		/// <param name="customers">Array of TUpdate_Input</param>
		/// <returns>ArrayList of TUpdate_Return</returns>
		public ArrayList update(TUpdate_Input[] customers) 
		{
			TUpdate_Return[] customers_out = stub.update(customers);

			ArrayList result = new ArrayList();

			for(int i = 0; i < customers_out.Length; i++)
			{
				TUpdate_Return customer_out = customers_out[i];

				if (customer_out.Error == null) 
				{
					Console.WriteLine("successfully updated customer: " + customer_out.Path);
					result.Add(customer_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + customer_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to get info of a customer via web services
		/// </summary>
		/// <param name="customerPaths">Array of Strings</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] customerPaths) 
		{
			return getInfo(customerPaths, new string[0] );
		}

		/// <summary>
		/// use stub to get info of a customer via web services
		/// </summary>
		/// <param name="customerPaths">customers to get, Array of paths</param>
		/// <param name="attributes">attributes to get, Array of attribute names</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] customerPaths, string[] attributes) 
		{
			TGetInfo_Return[] customers_out = stub.getInfo(customerPaths, attributes);

			ArrayList result = new ArrayList();

			for(int i = 0; i < customers_out.Length; i++)
			{
				TGetInfo_Return customer_out = customers_out[i];

				if (customer_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved customer: " + customer_out.Path);
					result.Add(customer_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + customer_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to delete a customer via web services
		/// </summary>
		/// <param name="customerPaths">customers to delete, Array of paths</param>
		/// <returns>ArrayList of TDelete_Return</returns>
		public ArrayList delete(string[] customerPaths) 
		{
			TDelete_Return[] customers_out = stub.delete(customerPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < customers_out.Length; i++)
			{
				TDelete_Return customer_out = customers_out[i];

				if (customer_out.Error == null) 
				{
					Console.WriteLine("successfully deleted customer: " + customer_out.Path);
					result.Add(customer_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + customer_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to test existance of a customer via web services
		/// </summary>
		/// <param name="customerPaths">customers to check, Array of paths</param>
		/// <returns>ArrayList of TExists_Return</returns>
		public ArrayList exists(string[] customerPaths) 
		{
			TExists_Return[] customers_out = stub.exists(customerPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < customers_out.Length; i++)
			{
				TExists_Return customer_out = customers_out[i];

				if (customer_out.Error == null) 
				{
					Console.WriteLine("successfully checked if customer exists: " + customer_out.Path);
					result.Add(customer_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + customer_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to find customers via web services
		/// </summary>
		/// <param name="parameters">search parameters, TFind_Input</param>
		/// <returns>found customers, Array of paths</returns>
		public string[] find(TFind_Input parameters) 
		{
			string[] paths = stub.find(parameters);

			Console.WriteLine("found entries: " + paths.Length);

			return paths;
		}
	}
}
