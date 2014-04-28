using System;
using EpagesWebServices.AssignmentServiceRef;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call Assignment web services methods
	/// </summary>
	public class AssignmentServiceClient : WebServiceConfiguration
	{
		AssignmentService stub;

		public AssignmentServiceClient()
		{
			stub = new AssignmentService();
			stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			stub.PreAuthenticate = true;
			stub.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// use stub to assignment a Product to a Catalog via web services
		/// </summary>
		/// <param name="Assignments">Array of TAssignProductToCatalog_Input</param>
		/// <returns>ArrayList of TAssignProductToCatalog_Return</returns>
		public ArrayList assignProductToCatalog(TAssignProductToCatalog_Input[] Assignments) 
		{
			TAssignProductToCatalog_Return[] Assignments_out = stub.assignProductToCatalog(Assignments);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Assignments_out.Length; i++)
			{
				TAssignProductToCatalog_Return Assignment_out = Assignments_out[i];

				if (Assignment_out.Error == null) 
				{
					Console.WriteLine("successfully assigned: " + Assignment_out.Catalog + "/" + Assignment_out.Product);
					result.Add(Assignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Assignment_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to get Catalogs assigned to a Product via web services
		/// </summary>
		/// <param name="productPaths">products, Array of paths</param>
		/// <returns>ArrayList of TGetCatalogsAssignedToProduct_Return</returns>
		public ArrayList getCatalogsAssignedToProduct(string[] productPaths) 
		{
			TGetCatalogsAssignedToProduct_Return[] Assignments_out = stub.getCatalogsAssignedToProduct(productPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Assignments_out.Length; i++)
			{
				TGetCatalogsAssignedToProduct_Return Assignment_out = Assignments_out[i];

				if (Assignment_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved Assignments for Product: " + Assignment_out.Product);
					result.Add(Assignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Assignment_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to get Products assigned to a Catalog via web services
		/// </summary>
		/// <param name="catalogPaths">catalogs, Array of paths</param>
		/// <returns>ArrayList of TGetProductsAssignedToCatalog_Return</returns>
		public ArrayList getProductsAssignedToCatalog(string[] catalogPaths) 
		{
			TGetProductsAssignedToCatalog_Return[] Assignments_out = stub.getProductsAssignedToCatalog(catalogPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Assignments_out.Length; i++)
			{
				TGetProductsAssignedToCatalog_Return Assignment_out = Assignments_out[i];

				if (Assignment_out.Error == null) 
				{
					Console.WriteLine("successfully retrieved Assignments for Catalog: " + Assignment_out.Catalog);
					result.Add(Assignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Assignment_out.Error.Message);
				}
			}

			return result;
		}
		
		/// <summary>
		/// use stub to remove an Assignment via web services
		/// </summary>
		/// <param name="assignments">Assignments to delete, Array of TRemoveProductFromCatalog_Input</param>
		/// <returns>ArrayList of TRemoveProductFromCatalog_Return</returns>
		public ArrayList removeProductFromCatalog(TRemoveProductFromCatalog_Input[] assignments) 
		{
			TRemoveProductFromCatalog_Return[] Assignments_out = stub.removeProductFromCatalog(assignments);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Assignments_out.Length; i++)
			{
				TRemoveProductFromCatalog_Return Assignment_out = Assignments_out[i];

				if (Assignment_out.Error == null) 
				{
					Console.WriteLine("successfully removed Assignment: " + Assignment_out.Catalog + "/" + Assignment_out.Product);
					result.Add(Assignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Assignment_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to check via web services if a Product and a Catalog are assigned
		/// </summary>
		/// <param name="assignments">Assignments to check, Array of TIsProductAssignedToCatalog_Input</param>
		/// <returns>ArrayList of TIsProductAssignedToCatalog_Return</returns>
		public ArrayList isProductAssignedToCatalog(TIsProductAssignedToCatalog_Input[] assignments) 
		{
			TIsProductAssignedToCatalog_Return[] Assignments_out = stub.isProductAssignedToCatalog(assignments);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Assignments_out.Length; i++)
			{
				TIsProductAssignedToCatalog_Return Assignment_out = Assignments_out[i];

				if (Assignment_out.Error == null) 
				{
					Console.WriteLine("successfully checked Assignment: " + Assignment_out.Catalog + "/" + Assignment_out.Product);
					result.Add(Assignment_out);
				} 
				else 
				{
					Console.WriteLine("an error occured (Epages Error):\n" + Assignment_out.Error.Message);
				}
			}

			return result;
		}
	}
}
