using System;
using EpagesWebServices.PriceListAssignmentServiceRef;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call PriceListAssignment web services methods
	/// </summary>
	public class PriceListAssignmentServiceClient : WebServiceConfiguration
	{
		PriceListAssignmentService stub;

		public PriceListAssignmentServiceClient()
		{
			stub = new PriceListAssignmentService();
			stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			stub.PreAuthenticate = true;
			stub.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// use stub to create a QuantityDiscount via web services
		/// </summary>
		/// <param name="PriceListAssignments">Array of TSetQuantityDiscounts_Input</param>
		/// <returns>ArrayList of TSetQuantityDiscounts_Return</returns>
		public ArrayList setQuantityDiscounts(TSetQuantityDiscounts_Input[] PriceListAssignments) 
		{
			TSetQuantityDiscounts_Return[] PriceListAssignments_out = stub.setQuantityDiscounts(PriceListAssignments);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceListAssignments_out.Length; i++)
			{
				TSetQuantityDiscounts_Return PriceListAssignment_out = PriceListAssignments_out[i];

				if (PriceListAssignment_out.Error == null) 
				{
					Console.WriteLine("successfully created QuantityDiscount for Product: " + PriceListAssignment_out.Product);
					result.Add(PriceListAssignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceListAssignment_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to get info of a QuantityDiscount via web services
		/// </summary>
		/// <param name="products">Array of product paths</param>
		/// <param name="pricelists">Array of pricelist paths</param>
		/// <returns>ArrayList of TGetQuantityDiscounts_Return</returns>
		public ArrayList getQuantityDiscounts(string[] products, string[] pricelists) 
		{
			TGetQuantityDiscounts_Return[] PriceListAssignments_out = stub.getQuantityDiscounts(products, pricelists);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceListAssignments_out.Length; i++)
			{
				TGetQuantityDiscounts_Return PriceListAssignment_out = PriceListAssignments_out[i];

				if (PriceListAssignment_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved QuantityDiscounts for Product: " + PriceListAssignment_out.Product);
					result.Add(PriceListAssignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceListAssignment_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to create a ValueDiscounts via web services
		/// </summary>
		/// <param name="PriceListAssignments">Array of TSetValueDiscounts_Input</param>
		/// <returns>ArrayList of TSetValueDiscounts_Return</returns>
		public ArrayList setValueDiscounts(TSetValueDiscounts_Input[] PriceListAssignments) 
		{
			TSetValueDiscounts_Return[] PriceListAssignments_out = stub.setValueDiscounts(PriceListAssignments);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceListAssignments_out.Length; i++)
			{
				TSetValueDiscounts_Return PriceListAssignment_out = PriceListAssignments_out[i];

				if (PriceListAssignment_out.Error == null) 
				{
					Console.WriteLine("successfully created ValueDiscounts for Product: " + PriceListAssignment_out.Product);
					result.Add(PriceListAssignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceListAssignment_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to get info of a ValueDiscounts via web services
		/// </summary>
		/// <param name="products">Array of product paths</param>
		/// <param name="pricelists">Array of price list paths</param>
		/// <returns>ArrayList of TGetValueDiscounts_Return</returns>
		public ArrayList getValueDiscounts(string[] products, string[] pricelists) 
		{
			TGetValueDiscounts_Return[] PriceListAssignments_out = stub.getValueDiscounts(products, pricelists);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceListAssignments_out.Length; i++)
			{
				TGetValueDiscounts_Return PriceListAssignment_out = PriceListAssignments_out[i];

				if (PriceListAssignment_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved ValueDiscounts for Product: " + PriceListAssignment_out.Product);
					result.Add(PriceListAssignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceListAssignment_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to create a ScalePrices via web services
		/// </summary>
		/// <param name="PriceListAssignments">Array of TSetScalePrices_Input</param>
		/// <returns>ArrayList of TSetScalePrices_Return</returns>
		public ArrayList setScalePrices(TSetScalePrices_Input[] PriceListAssignments) 
		{
			TSetScalePrices_Return[] PriceListAssignments_out = stub.setScalePrices(PriceListAssignments);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceListAssignments_out.Length; i++)
			{
				TSetScalePrices_Return PriceListAssignment_out = PriceListAssignments_out[i];

				if (PriceListAssignment_out.Error == null) 
				{
					Console.WriteLine("successfully created ScalePrices for Product: " + PriceListAssignment_out.Product);
					result.Add(PriceListAssignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceListAssignment_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to get info of a ScalePrices via web services
		/// </summary>
		/// <param name="products">Array of product paths</param>
		/// <param name="pricelists">Array of price list paths</param>
		/// <returns>ArrayList of TGetValueDiscounts_Return</returns>
		public ArrayList getScalePrices(string[] products, string[] pricelists) 
		{
			TGetScalePrices_Return[] PriceListAssignments_out = stub.getScalePrices(products, pricelists);

			ArrayList result = new ArrayList();

			for(int i = 0; i < PriceListAssignments_out.Length; i++)
			{
				TGetScalePrices_Return PriceListAssignment_out = PriceListAssignments_out[i];

				if (PriceListAssignment_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved ScalePrices for Product: " + PriceListAssignment_out.Product);
					result.Add(PriceListAssignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + PriceListAssignment_out.Error.Message);
				}
			}

			return result;
		}
	}
}
