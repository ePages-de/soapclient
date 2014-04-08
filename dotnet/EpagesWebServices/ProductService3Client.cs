using System;
using EpagesWebServices.ProductService3Ref;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call Product web services methods
	/// </summary>
	public class ProductService3Client : WebServiceConfiguration
	{
		ProductService stub;

		public ProductService3Client()
		{
			stub = new ProductService();
			stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			stub.PreAuthenticate = true;
			stub.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// use stub to create a Product via web services
		/// </summary>
		/// <param name="Products">Array of TCreate_Input</param>
		/// <returns>ArrayList of TCreate_Return</returns>
		public ArrayList create(TCreate_Input[] Products)
		{
			TCreate_Return[] Products_out = stub.create(Products);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Products_out.Length; i++)
			{
				TCreate_Return Product_out = Products_out[i];

				if (Product_out.Error == null)
				{
					Console.WriteLine("successfully created Product: " + Product_out.Path);
					result.Add(Product_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Product_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to create a Product via web services
		/// </summary>
		/// <param name="Products">Array of TUpdate_Input</param>
		/// <returns>ArrayList of TUpdate_Return</returns>
		public ArrayList update(TUpdate_Input[] Products)
		{
			TUpdate_Return[] Products_out = stub.update(Products);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Products_out.Length; i++)
			{
				TUpdate_Return Product_out = Products_out[i];

				if (Product_out.Error == null)
				{
					Console.WriteLine("successfully updated Product: " + Product_out.Path);
					result.Add(Product_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Product_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to get info of a Product via web services
		/// </summary>
		/// <param name="ProductPaths">Array of Strings</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] ProductPaths)
		{
			return getInfo(ProductPaths, new string[0] );
		}

		public ArrayList getInfo(string[] ProductPaths, string[] attributes)
		{
			return getInfo(ProductPaths, attributes, new string[0] );
		}

		/// <summary>
		/// use stub to get info of a Product via web services
		/// </summary>
		/// <param name="ProductPaths">Products to get, Array of paths</param>
		/// <param name="attributes">attributes to get, Array of attribute names</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] ProductPaths, string[] attributes, string[] languages)
		{
			TGetInfo_Return[] Products_out = stub.getInfo(ProductPaths, attributes, languages);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Products_out.Length; i++)
			{
				TGetInfo_Return Product_out = Products_out[i];

				if (Product_out.Error == null)
				{
					Console.WriteLine("successfully retrieved Product: " + Product_out.Path);
					result.Add(Product_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Product_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to delete a Product via web services
		/// </summary>
		/// <param name="ProductPaths">Products to delete, Array of paths</param>
		/// <returns>ArrayList of TDelete_Return</returns>
		public ArrayList delete(string[] ProductPaths)
		{
			TDelete_Return[] Products_out = stub.delete(ProductPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Products_out.Length; i++)
			{
				TDelete_Return Product_out = Products_out[i];

				if (Product_out.Error == null)
				{
					Console.WriteLine("successfully deleted Product: " + Product_out.Path);
					result.Add(Product_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Product_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to test existance of a Product via web services
		/// </summary>
		/// <param name="ProductPaths">Products to check, Array of paths</param>
		/// <returns>ArrayList of TExists_Return</returns>
		public ArrayList exists(string[] ProductPaths)
		{
			TExists_Return[] Products_out = stub.exists(ProductPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Products_out.Length; i++)
			{
				TExists_Return Product_out = Products_out[i];

				if (Product_out.Error == null)
				{
					Console.WriteLine("successfully checked if Product exists: " + Product_out.Path);
					result.Add(Product_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Product_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to find Products via web services
		/// </summary>
		/// <param name="parameters">search parameters, TFind_Input</param>
		/// <returns>found Products, Array of paths</returns>
		public string[] find(TFind_Input parameters)
		{
			string[] paths = stub.find(parameters);

			Console.WriteLine("found entries: " + paths.Length);

			return paths;
		}
	}
}
