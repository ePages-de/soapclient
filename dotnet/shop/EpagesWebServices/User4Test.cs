using System;
using EpagesWebServices.UserService4Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

	/// <summary>
	/// A NUnit Test Class to test all methods of User web service
	/// </summary>
	[TestFixture]
	public class User4Test
	{
		UserService4Client serviceClient;
		TCreate_Input User_in = new TCreate_Input();
		TUpdate_Input User_update = new TUpdate_Input();

		string alias = "dotnet_test-1";
		string path = "Users/";

		/// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			serviceClient = new UserService4Client();

			// create test users that can be used with the create and update methods
			User_in.Alias = alias;
			User_in.Password = "epages";
			User_in.Name = "Klaus Klaussen";
			User_in.EMail = "dotnet-test@epages.de";
            User_in.DeleteConfirmation = false;
            User_in.DeleteConfirmationSpecified = true;

			User_update.DeleteConfirmation = true;
            User_update.DeleteConfirmationSpecified = true;

			TAddressNamed bill = new TAddressNamed();
			bill.Alias = "bill";
			bill.FirstName = "Klaus";
			bill.LastName = "Klaussen2";
			bill.Street = "Musterstraﬂe 2";
            bill.CodePorte = "xyz";
            bill.EMail = "dotnet-test@epages.de";
			bill.Birthday = new DateTime(1976,9,25,11,33,0);
			User_in.BillingAddress = bill;

			TAddressNamed ship = new TAddressNamed();
			ship.Alias = "ship";
			ship.FirstName = "Klaus";
			ship.LastName = "Klaussen3";
			ship.Street = "Musterstraﬂe 3";
			ship.EMail = "dotnet-test@epages.de";
			ship.Birthday = new DateTime(1976,9,25,11,33,0);
			User_in.ShippingAddress = ship;

			TAddressNamed ship1 = new TAddressNamed();
			ship1.Alias = "ship1";
			ship1.FirstName = "Klaus";
			ship1.LastName = "Klaussen4";
			ship1.Street = "Musterstraﬂe 4";
			ship1.EMail = "dotnet-test@epages.de";
			ship1.Birthday = new DateTime(1976,9,25,11,33,0);

			TAddressNamed ship2 = new TAddressNamed();
			//--- test without Alias
			ship2.FirstName = "Klaus";
			ship2.LastName = "Klaussen5";
			ship2.Street = "Musterstraﬂe 5";
			ship2.EMail = "dotnet-test@epages.de";
			ship2.Birthday = new DateTime(1976,9,25,11,33,0);

			TAddressNamed[] addresses = new TAddressNamed[]{
				ship1,
				ship2,
			};
			User_in.AdditionalAddresses = addresses;

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

			TAddressNamed bill_update = new TAddressNamed();
			bill_update.FirstName = "Hans";
			bill_update.LastName = "Hanssen";
			bill_update.Street = "Musterstraﬂe 2b";
            bill_update.CodePorte = "uvwxyz";
            bill_update.Birthday = new DateTime(1976, 9, 25, 11, 33, 0);
			User_update.BillingAddress = bill_update;

			TAddressNamed ship1_update = new TAddressNamed();
			ship1_update.Alias = "ship1";
			ship1_update.FirstName = "Klaus";
			ship1_update.LastName = "Klaussen44";
			ship1_update.Street = "Musterstraﬂe 44";
			ship1_update.EMail = "dotnet-test@epages.de";
			ship1_update.Birthday = new DateTime(1976,9,25,11,33,0);

			TAddressNamed ship3_update = new TAddressNamed();
			ship3_update.Alias = "ship3";
			ship3_update.FirstName = "Klaus";
			ship3_update.LastName = "Klaussen33";
			ship3_update.Street = "Musterstraﬂe 33";
			ship3_update.EMail = "dotnet-test@epages.de";
			ship3_update.Birthday = new DateTime(1976,9,25,11,33,0);

			TAddressNamed[] addresses_update = new TAddressNamed[]{
				ship1_update,
				ship3_update,
			};
			User_update.AdditionalAddresses = addresses_update;

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

			Hashtable outAddresses = new Hashtable();
			foreach ( TAddressNamed address in User_out.AdditionalAddresses )
			{
				outAddresses.Add(address.Street, address);
			}

			if (alreadyUpdated)
			{
				Assert.AreEqual(User_update.Name, User_out.Name, "Name");
				Assert.AreEqual(User_update.BillingAddress.FirstName, User_out.BillingAddress.FirstName, "getInfo() updated FirstName");
				Assert.AreEqual(User_update.BillingAddress.LastName, User_out.BillingAddress.LastName, "getInfo() updated LastName");
				Assert.AreEqual(User_update.BillingAddress.Street, User_out.BillingAddress.Street, "getInfo() updated Street");
                Assert.AreEqual(User_update.BillingAddress.CodePorte, User_out.BillingAddress.CodePorte, "getInfo() updated code porte");
                Assert.AreEqual(User_update.Attributes[0].Value, User_out.Attributes[0].Value, "getInfo() updated ChallengePhrase");
				Assert.AreEqual(User_update.DeleteConfirmation, User_out.DeleteConfirmation, "getInfo() updated DeleteConfirmation");
				foreach ( TAddressNamed upAddress in User_update.AdditionalAddresses )
				{
					TAddressNamed outAddress = (TAddressNamed)outAddresses[upAddress.Street];
					if ( upAddress.Alias!=null && upAddress.Alias!="" )
					{
						Assert.AreEqual(upAddress.Alias, outAddress.Alias,	  "getInfo() updated AdditionalAddresses Alias");
					}
					Assert.AreEqual(upAddress.LastName,  outAddress.LastName, "getInfo() updated AdditionalAddresses LastName");
				}
			}
			else
			{
				Assert.AreEqual(User_in.Name, User_out.Name, "Name");
				Assert.AreEqual(User_in.BillingAddress.FirstName, User_out.BillingAddress.FirstName, "getInfo() original FirstName");
				Assert.AreEqual(User_in.BillingAddress.LastName, User_out.BillingAddress.LastName, "getInfo() original LastName");
				Assert.AreEqual(User_in.BillingAddress.Street, User_out.BillingAddress.Street, "getInfo() original Street");
                Assert.AreEqual(User_in.BillingAddress.CodePorte, User_out.BillingAddress.CodePorte, "getInfo() original code porte");
                Assert.AreEqual(User_in.Attributes[0].Value, User_out.Attributes[0].Value, "getInfo() original ChallengePhrase");
				Assert.AreEqual(User_in.DeleteConfirmation, User_out.DeleteConfirmation, "getInfo() original DeleteConfirmation");
				Assert.AreEqual(User_in.AdditionalAddresses.Length, User_out.AdditionalAddresses.Length, "getInfo() original number AdditionalAddresses");

				foreach ( TAddressNamed inAddress in User_in.AdditionalAddresses )
				{
					TAddressNamed outAddress = (TAddressNamed)outAddresses[inAddress.Street];
					if ( inAddress.Alias!=null && inAddress.Alias!="" )
					{
						Assert.AreEqual(inAddress.Alias, outAddress.Alias,	  "getInfo() original AdditionalAddresses Alias");
					}
					Assert.AreEqual(inAddress.LastName,  outAddress.LastName, "getInfo() original AdditionalAddresses LastName");
				}
			}
			Assert.AreEqual(User_in.EMail, User_out.EMail, "getInfo() EMail");
			Assert.IsFalse(User_out.Password == User_in.Password, "getInfo() Password");
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
