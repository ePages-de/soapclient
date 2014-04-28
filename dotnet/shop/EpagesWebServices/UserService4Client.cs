using System;
using EpagesWebServices.UserService4Ref;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// Client that uses generated stub to call User web services methods
	/// </summary>
	public class UserService4Client : WebServiceConfiguration
	{
		UserService stub;

		public UserService4Client()
		{
			stub = new UserService();
			stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			stub.PreAuthenticate = true;
			stub.Url = WEBSERVICE_URL;
		}

		/// <summary>
		/// use stub to create a User via web services
		/// </summary>
		/// <param name="Users">Array of TCreate_Input</param>
		/// <returns>ArrayList of TCreate_Return</returns>
		public ArrayList create(TCreate_Input[] Users)
		{
			TCreate_Return[] Users_out = stub.create(Users);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Users_out.Length; i++)
			{
				TCreate_Return User_out = Users_out[i];

				if (User_out.Error == null)
				{
					Console.WriteLine("successfully created User: " + User_out.Path);
					result.Add(User_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + User_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to create a User via web services
		/// </summary>
		/// <param name="Users">Array of TUpdate_Input</param>
		/// <returns>ArrayList of TUpdate_Return</returns>
		public ArrayList update(TUpdate_Input[] Users)
		{
			TUpdate_Return[] Users_out = stub.update(Users);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Users_out.Length; i++)
			{
				TUpdate_Return User_out = Users_out[i];

				if (User_out.Error == null)
				{
					Console.WriteLine("successfully updated User: " + User_out.Path);
					result.Add(User_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + User_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to get info of a User via web services
		/// </summary>
		/// <param name="UserPaths">Array of Strings</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
		public ArrayList getInfo(string[] UserPaths)
		{
			return getInfo(UserPaths, new string[0], new string[0] );
		}

		/// <summary>
		/// use stub to get info of a User via web services
		/// </summary>
		/// <param name="UserPaths">Users to get, Array of paths</param>
		/// <param name="attributes">attributes to get, Array of attribute names</param>
		/// <returns>ArrayList of TGetInfo_Return</returns>
        public ArrayList getInfo(string[] UserPaths, string[] attributes)
        {
            return getInfo(UserPaths, attributes, new string[0]);
        }

        /// <summary>
        /// use stub to get info of a User via web services
        /// </summary>
        /// <param name="UserPaths">Users to get, Array of paths</param>
        /// <param name="attributes">attributes to get, Array of attribute names</param>
        /// <param name="addr_attributes">address attributes to get, Array of attribute names</param>
        /// <returns>ArrayList of TGetInfo_Return</returns>
        public ArrayList getInfo(string[] UserPaths, string[] attributes, string[] addr_attributes)
		{
			TGetInfo_Return[] Users_out = stub.getInfo(UserPaths, attributes, addr_attributes);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Users_out.Length; i++)
			{
				TGetInfo_Return User_out = Users_out[i];

				if (User_out.Error == null)
				{
					Console.WriteLine("successfully retrieved User: " + User_out.Path);
					result.Add(User_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + User_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to delete a User via web services
		/// </summary>
		/// <param name="UserPaths">Users to delete, Array of paths</param>
		/// <returns>ArrayList of TDelete_Return</returns>
		public ArrayList delete(string[] UserPaths)
		{
			TDelete_Return[] Users_out = stub.delete(UserPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Users_out.Length; i++)
			{
				TDelete_Return User_out = Users_out[i];

				if (User_out.Error == null)
				{
					Console.WriteLine("successfully deleted User: " + User_out.Path);
					result.Add(User_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + User_out.Error.Message);
				}
			}

			return result;
		}

		/// <summary>
		/// use stub to test existance of a User via web services
		/// </summary>
		/// <param name="UserPaths">Users to check, Array of paths</param>
		/// <returns>ArrayList of TExists_Return</returns>
		public ArrayList exists(string[] UserPaths)
		{
			TExists_Return[] Users_out = stub.exists(UserPaths);

			ArrayList result = new ArrayList();

			for(int i = 0; i < Users_out.Length; i++)
			{
				TExists_Return User_out = Users_out[i];

				if (User_out.Error == null)
				{
					Console.WriteLine("successfully checked if User exists: " + User_out.Path);
					result.Add(User_out);
				}
				else
				{
					Console.WriteLine("an error occured (Epages Error):\n" + User_out.Error.Message);
				}
			}

			return result;
		}
	}
}
