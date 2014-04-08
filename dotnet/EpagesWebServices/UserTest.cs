using System;
using EpagesWebServices.UserServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of User web service
	/// </summary>
	[TestFixture]
	public class UserTest
	{
		UserServiceClient serviceClient;
		TCreate_Input User_in = new TCreate_Input();
		TUpdate_Input User_update = new TUpdate_Input();

		string alias = "dotnet_test-1";
		string path = "/Shops/DemoShop/Users/";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new UserServiceClient();
			
			// create test users that can be used with the create and update methods
			User_in.Alias = alias;
			User_in.Password = "epages";
			User_in.Name = "Klaus Klaussen";
			User_in.EMail = "dotnet-test@epages.de";
            User_in.DeleteConfirmation = false;
            User_in.DeleteConfirmationSpecified = true;

			User_update.DeleteConfirmation = true;
            User_update.DeleteConfirmationSpecified = true;

			TAddress bill = new TAddress();
			bill.FirstName = "Klaus";
			bill.LastName = "Klaussen";
			bill.Street = "Musterstraﬂe 2";
			bill.EMail = "dotnet-test@epages.de";
			bill.Birthday = new DateTime(1976,9,25,11,33,0);
			User_in.BillingAddress = bill;
			User_in.ShippingAddress = bill;

			TAttribute attr = new TAttribute();
			attr.Name = "ChallengePhrase";
			attr.Value = "my challenge phrase";
			User_in.Attributes = new TAttribute[]{attr};

			User_update.Path = path + alias;
			User_update.Password = "epages";
			User_update.Name = "Hans Hanssen";
			User_update.EMail = "dotnet-test@epages.de";

			// IMPORTANT!!!
			// .NET has the terrible behavior, to set all boolean and numeric value that are not
			// defined to "false" resp. "0"
			// So if you update an object and do not set the "IsVisible" flag, it will set the object to
			// invisible!!!
			User_update.DeleteConfirmation = true;

			TAddress bill_update = new TAddress();
			bill_update.FirstName = "Hans";
			bill_update.LastName = "Hanssen";
			bill_update.Street = "Musterstraﬂe 2b";
			bill_update.Birthday = new DateTime(1976,9,25,11,33,0);
			User_update.BillingAddress = bill_update;

			TAttribute attr_update = new TAttribute();
			attr_update.Name = "ChallengePhrase";
			attr_update.Value = "my updated challenge phrase";
			User_update.Attributes = new TAttribute[]{attr_update};
		}

		/// <summary>
		/// test getInfo() and check result against created resp. updated User
		/// </summary>
		/// <param name="alreadyUpdated">check result against created or updated User</param>
		public void getInfo(bool alreadyUpdated)
		{
			string[] UserPaths = new string[]{path + alias};
			ArrayList Users_out = serviceClient.getInfo(UserPaths, new string[]{"ChallengePhrase"});

			// test if getinfo was successful and if all data are equal to input
			Assert.AreEqual(1, Users_out.Count, "get info result set");

			TGetInfo_Return User_out = (TGetInfo_Return)Users_out.ToArray()[0];
			Assert.AreEqual(alias, User_out.Alias, "user alias");

			if (alreadyUpdated) 
			{
				Assert.AreEqual(User_update.Name, User_out.Name, "Name");
				Assert.AreEqual(User_update.BillingAddress.FirstName, User_out.BillingAddress.FirstName, "FirstName");
				Assert.AreEqual(User_update.BillingAddress.LastName, User_out.BillingAddress.LastName, "LastName");
				Assert.AreEqual(User_update.BillingAddress.Street, User_out.BillingAddress.Street, "Street");
				Assert.AreEqual(User_update.Attributes[0].Value, User_out.Attributes[0].Value, "ChallengePhrase");
				
				Assert.AreEqual(User_update.DeleteConfirmation, User_out.DeleteConfirmation, "DeleteConfirmation");				
			} 
			else 
			{
				Assert.AreEqual(User_in.Name, User_out.Name, "Name");
				Assert.AreEqual(User_in.BillingAddress.FirstName, User_out.BillingAddress.FirstName, "FirstName");
				Assert.AreEqual(User_in.BillingAddress.LastName, User_out.BillingAddress.LastName, "LastName");
				Assert.AreEqual(User_in.BillingAddress.Street, User_out.BillingAddress.Street, "Street");
				Assert.AreEqual(User_in.Attributes[0].Value, User_out.Attributes[0].Value, "ChallengePhrase");

				Assert.AreEqual(User_in.DeleteConfirmation, User_out.DeleteConfirmation, "DeleteConfirmation");				
			}
			Assert.AreEqual(User_in.EMail, User_out.EMail, "EMail");
			Assert.IsFalse(User_out.Password == User_in.Password, "Password");
		}

		/// <summary>
		/// test creation of a User and check if method returns a true value
		/// </summary>
		public void create()
		{
			TCreate_Input[] Users = new TCreate_Input[]{User_in};

			ArrayList Users_out = serviceClient.create(Users);

			// test if creation was successful
			Assert.AreEqual(1, Users_out.Count, "create result set");

			TCreate_Return User_out = (TCreate_Return)Users_out.ToArray()[0];
			Assert.AreEqual(alias, User_out.Alias, "user alias");
			Assert.AreEqual(true, User_out.created, "created?");
		}
		
		/// <summary>
		/// test update of a User and check if method returns a true value
		/// </summary>
		public void update()
		{
			TUpdate_Input[] Users = new TUpdate_Input[]{User_update};

			ArrayList Users_out = serviceClient.update(Users);

			// test if update was successful
			Assert.AreEqual(1, Users_out.Count, "update result set");

			TUpdate_Return User_out = (TUpdate_Return)Users_out.ToArray()[0];
			Assert.AreEqual(path + alias, User_out.Path, "user path");
			Assert.AreEqual(true, User_out.updated, "updated?");
		}
		
		/// <summary>
		/// this is not an actual test.
		/// delete may existing User at the beginning of the test suite
		/// </summary>
		public void deleteIfExists()
		{
			string[] UserPaths = new string[]{path + alias};
			ArrayList Users_exists_out = serviceClient.exists(UserPaths);
			TExists_Return User_exists_out = (TExists_Return)Users_exists_out.ToArray()[0];
			
			if (! User_exists_out.exists) 
			{
				return;
			}

			serviceClient.delete(UserPaths);
		}

		/// <summary>
		/// test deletion of a User and check if method returns a true value
		/// </summary>
		public void delete()
		{
			string[] UserPaths = new string[]{path + alias};
			ArrayList Users_out = serviceClient.delete(UserPaths);

			// test if deletion was successful
			Assert.AreEqual(1, Users_out.Count, "delete result set");

			TDelete_Return User_out = (TDelete_Return)Users_out.ToArray()[0];
			Assert.AreEqual(path + alias, User_out.Path, "user path");
			Assert.AreEqual(true, User_out.deleted, "deleted?");
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the User does NOT exists</param>
		public void exists(bool exists)
		{
			string[] UserPaths = new string[]{path + alias};
			ArrayList Users_out = serviceClient.exists(UserPaths);

			// test if exists check was successful
			Assert.AreEqual(1, Users_out.Count, "exists result set");

			TExists_Return User_out = (TExists_Return)Users_out.ToArray()[0];
			Assert.AreEqual(path + alias, User_out.Path, "user path");
			Assert.AreEqual(exists, User_out.exists, "exists?");
		}		

		/// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests() 
		{
			deleteIfExists();
			create();
			exists(true);
			getInfo(false);
			update();
			getInfo(true);
			delete();	
			exists(false);
		}
	}
}
