using System;
using EpagesWebServices.OrderDocumentServiceRef;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call OrderDocument web services methods
	/// </summary>
	public class OrderDocumentServiceClient : WebServiceConfiguration
	{
		OrderDocumentService stub;

		public OrderDocumentServiceClient()
		{
			stub = new OrderDocumentService();
			stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			stub.PreAuthenticate = true;
			stub.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// use stub to create a OrderDocument via web services
		/// </summary>
		/// <param name="OrderDocuments">Array of TCreate_Input</param>
		/// <returns>ArrayList of TCreate_Return</returns>
		public ArrayList create(TCreate_Input[] OrderDocuments) 
		{
			TCreate_Return[] OrderDocuments_out = stub.create(OrderDocuments);

			ArrayList result = new ArrayList();

			for(int i = 0; i < OrderDocuments_out.Length; i++)
			{
				TCreate_Return OrderDocument_out = OrderDocuments_out[i];

				if (OrderDocument_out.Error == null) 
				{
					Console.WriteLine("successfully created OrderDocument: " + OrderDocument_out.Path);
					result.Add(OrderDocument_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + OrderDocument_out.Error.Message);
				}
			}

			return result;
		}
		
		public ArrayList getInfo(string[] OrderDocumentPaths) 
		{
			return getInfo(OrderDocumentPaths, new string[0] );
		}

		public ArrayList getInfo(string[] OrderDocumentPaths, string[] attributes) 
		{
			return getInfo(OrderDocumentPaths, attributes, new string[0] );
		}

		/// <summary>
		/// use stub to get info of a OrderDocument via web services
		/// </summary>
		/// <param name="OrderDocumentPaths">OrderDocuments to get, Array of paths</param>
		/// <param name="attributes">attributes to get, Array of attribute names</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] OrderDocumentPaths, string[] attributes, string[] languages) 
		{
			TGetInfo_Return[] OrderDocuments_out = stub.getInfo(OrderDocumentPaths, attributes, languages);

			ArrayList result = new ArrayList();

			for(int i = 0; i < OrderDocuments_out.Length; i++)
			{
				TGetInfo_Return OrderDocument_out = OrderDocuments_out[i];

				if (OrderDocument_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved OrderDocument: " + OrderDocument_out.Path);
					result.Add(OrderDocument_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + OrderDocument_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to get all invoices of an Order via web services
		/// </summary>
		/// <param name="OrderPaths">Array of order paths</param>
		/// <returns>ArrayList of TGetInvoices_Return</returns>
		public ArrayList getInvoices(string[] OrderPaths) 
		{
			TGetInvoices_Return[] OrderDocuments_out = stub.getInvoices(OrderPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < OrderDocuments_out.Length; i++)
			{
				TGetInvoices_Return OrderDocument_out = OrderDocuments_out[i];

				if (OrderDocument_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved Invoices of Order: " + OrderDocument_out.Order);
					result.Add(OrderDocument_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + OrderDocument_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to get all packingslips of an Order via web services
		/// </summary>
		/// <param name="OrderPaths">Array of order paths</param>
		/// <returns>ArrayList of TGetPackingSlips_Return</returns>
		public ArrayList getPackingSlips(string[] OrderPaths) 
		{
			TGetPackingSlips_Return[] OrderDocuments_out = stub.getPackingSlips(OrderPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < OrderDocuments_out.Length; i++)
			{
				TGetPackingSlips_Return OrderDocument_out = OrderDocuments_out[i];

				if (OrderDocument_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved PackingSlips of Order: " + OrderDocument_out.Order);
					result.Add(OrderDocument_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + OrderDocument_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to get all CreditNotes of an Order via web services
		/// </summary>
		/// <param name="OrderPaths">Array of order paths</param>
		/// <returns>ArrayList of TGetCreditNotes_Return</returns>
		public ArrayList getCreditNotes(string[] OrderPaths) 
		{
			TGetCreditNotes_Return[] OrderDocuments_out = stub.getCreditNotes(OrderPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < OrderDocuments_out.Length; i++)
			{
				TGetCreditNotes_Return OrderDocument_out = OrderDocuments_out[i];

				if (OrderDocument_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved CreditNotes of Order: " + OrderDocument_out.Order);
					result.Add(OrderDocument_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + OrderDocument_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to delete a OrderDocument via web services
		/// </summary>
		/// <param name="OrderDocumentPaths">OrderDocuments to delete, Array of paths</param>
		/// <returns>ArrayList of TDelete_Return</returns>
		public ArrayList delete(string[] OrderDocumentPaths) 
		{
			TDelete_Return[] OrderDocuments_out = stub.delete(OrderDocumentPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < OrderDocuments_out.Length; i++)
			{
				TDelete_Return OrderDocument_out = OrderDocuments_out[i];

				if (OrderDocument_out.Error == null) 
				{
					Console.WriteLine("successfully deleted OrderDocument: " + OrderDocument_out.Path);
					result.Add(OrderDocument_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + OrderDocument_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to test existance of a OrderDocument via web services
		/// </summary>
		/// <param name="OrderDocumentPaths">OrderDocuments to check, Array of paths</param>
		/// <returns>ArrayList of TExists_Return</returns>
		public ArrayList exists(string[] OrderDocumentPaths) 
		{
			TExists_Return[] OrderDocuments_out = stub.exists(OrderDocumentPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < OrderDocuments_out.Length; i++)
			{
				TExists_Return OrderDocument_out = OrderDocuments_out[i];

				if (OrderDocument_out.Error == null) 
				{
					Console.WriteLine("successfully checked if OrderDocument exists: " + OrderDocument_out.Path);
					result.Add(OrderDocument_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + OrderDocument_out.Error.Message);
				}
			}

			return result;
		}
	}
}
