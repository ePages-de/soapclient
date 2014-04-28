using System;
using System.IO;
using EpagesWebServices.ProductImageServiceRef;
using EpagesWebServices.ProductServiceRef;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{
	/// <summary>
	/// NUnit test for ProductImageService
	/// </summary>
	[TestFixture]
	public class ProductImageTest : WebServiceConfiguration
	{
		ProductService productService;
		ProductImageService productImageService;
		string alias = "dotnet_test-1";
		string path = "Products/";
		
		// for exists, delete and upload
		string FName = "cg_0100504001.jpg";
		string FName1 = "be_40401_blue.jpg";
		
		// for upload
		string FileName  = "../../../../../TestData/ProductImageService/cg_0100504001.jpg";
		string FileName1 = "../../../../../TestData/ProductImageService/be_40401_blue.jpg";

		string SCALE_BORDER_COLOR_h = "#FFFFFF";
		string SCALE_BORDER_COLOR_m = "#FFFFFF";
		bool   SCALE_BORDER_IMAGE_h = true;
		bool   SCALE_BORDER_IMAGE_m = true;
		string SCALE_NAME_h = "ImageHotDeal";
		string SCALE_NAME_m = "ImageMedium";
		string SCALE_NAME_s = "ImageSmall";
		string SCALE_SIZE_h = "150";
		string SCALE_SIZE_m = "200";
		string SCALE_SIZE_s = "100";

        string ImagesSlideShowUpload = "cg_0100504001.jpg;be_40401_blue.jpg";
        string ImagesSlideShowScale = "be_40401_blue.jpg;be_40401_blue_m.jpg;be_40401_blue_h.jpg";

        /// <summary>
		/// Initial
		/// </summary>
		[SetUp]
		public void Init()
		{
			// set up the ProductImageService
			productImageService = new ProductImageService();
			productImageService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			productImageService.PreAuthenticate = true;
			productImageService.Url = WEBSERVICE_URL;

			// set up the ProductService in order to create a test product
			productService = new ProductService();
			productService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
			productService.PreAuthenticate = true;
			productService.Url = WEBSERVICE_URL;

			// create the test product
			TCreate_Input productInfo = new TCreate_Input();
			productInfo.Alias = alias;
			TCreate_Input[] createInput = new TCreate_Input[]{productInfo};
			productService.create( createInput );
		}

		[TearDown]
		public void Cleanup()
		{
			string[] deletePaths = { path+alias };
			ProductServiceRef.TDelete_Return[] result = productService.delete(deletePaths);
			Assert.IsNull( result[0].Error, "no error" );
			Assert.IsTrue( result[0].deleted, "product is deleted" );
		}
		
		/// <summary>
		/// test deletion of a Product image and check if method returns a true value
		/// </summary>
		public void delete()
		{
			string ProductPath = path + alias;
			string[] FileNames = new string[2];
			FileNames.SetValue(FName,0);
			FileNames.SetValue(FName1,1);
		
			ProductImageServiceRef.TDelete_Return[] Files_out = productImageService.delete(ProductPath,FileNames);

			// test if deletion was successful
			Assert.AreEqual(2, Files_out.GetLength(0), "delete result set");

			ProductImageServiceRef.TDelete_Return File_out = Files_out[0];
			Assert.IsTrue(File_out.deleted, File_out.Path + " deleted?");
		}

		/// <summary>
		/// test upload of a Product image and check if method returns a true value
		/// </summary>
		public void upload()
		{
			string ProductPath = path + alias;
			
			// read 1st
			FileStream  fs = File.OpenRead(FileName); 
			BinaryReader br = new BinaryReader(fs); 
			
			TImageData TIFile = new TImageData();
			TIFile.FileName = FName;
			TIFile.Content = br.ReadBytes((int)fs.Length);

			// read second
			FileStream fs1 = File.OpenRead(FileName1); 
			BinaryReader br1 = new BinaryReader(fs1); 

			TImageData TIFile1 = new TImageData();
			TIFile1.FileName = FName1;
			TIFile1.Content = br1.ReadBytes((int)fs1.Length);
		
			// add to structure
			TUpload_Input tuip = new TUpload_Input();
			tuip.ImageData = new TImageData[]{
				TIFile,
				TIFile1,
			};
            //Params_in.setImagesSlideShowString(ImagesSlideShowUpload);
            tuip.ImagesSlideShowString = ImagesSlideShowUpload;


			TUpload_Return[] Files_out = productImageService.upload(ProductPath,tuip);

			// test if upload was successful
			Assert.AreEqual(2, Files_out.GetLength(0), "upload result set");

			TUpload_Return File_out = Files_out[0];
			Assert.IsTrue(File_out.WriteOK, File_out.File + " written?");
		}

		/// <summary>
		/// test upload and scale of a Product image and check if method returns a true value
		/// </summary>
		public void uploadScale()
		{
			string ProductPath = path + alias;
			
			// read 1st
			FileStream  fs = File.OpenRead(FileName); 
			BinaryReader br = new BinaryReader(fs); 
			
			TImageData TIFile = new TImageData();
			TIFile.FileName = FName;
			TIFile.Content = br.ReadBytes((int)fs.Length);

			// read second
			FileStream fs1 = File.OpenRead(FileName1); 
			BinaryReader br1 = new BinaryReader(fs1); 

			TImageData TIFile1 = new TImageData();
			TIFile1.FileName = FName1;
			TIFile1.Content = br1.ReadBytes((int)fs1.Length);
		
			// add to structure
			TUploadScale_Input tuip = new TUploadScale_Input();
			tuip.ImageData = new TImageData[]{
				TIFile,
				TIFile1,
			};

            tuip.ImagesSlideShowString = ImagesSlideShowScale;

            TScaleParams tsp = new TScaleParams();
			tsp.SCALE_BORDER_COLOR_h = SCALE_BORDER_COLOR_h;
			tsp.SCALE_BORDER_COLOR_m = SCALE_BORDER_COLOR_m;
			tsp.SCALE_BORDER_IMAGE_h = SCALE_BORDER_IMAGE_h;
			tsp.SCALE_BORDER_IMAGE_m = SCALE_BORDER_IMAGE_m;
			tsp.SCALE_NAME_h = SCALE_NAME_h;
			tsp.SCALE_NAME_m = SCALE_NAME_m;
			tsp.SCALE_NAME_s = SCALE_NAME_s;
			tsp.SCALE_SIZE_h = SCALE_SIZE_h;
			tsp.SCALE_SIZE_m = SCALE_SIZE_m;
			tsp.SCALE_SIZE_s = SCALE_SIZE_s;

			TUploadScale_Return[] Files_out = productImageService.uploadscale(ProductPath,tuip,tsp);

			// test if upload was successful
			Assert.AreEqual(2, Files_out.GetLength(0), "uploadScale result set");

			TUploadScale_Return File_out = Files_out[0];
			Assert.IsTrue(File_out.WriteOK, File_out.File + " written?");
			Assert.IsTrue(File_out.ScaleOK, File_out.File + " scaled?");
		}

		public void deleteIfExists()
		{
			string TObjectPath = path + alias ;
			string TFileName = FName; 
			bool Exists_out = productImageService.exists(TObjectPath,TFileName);

			if (! Exists_out) 
			{
				return;
			}
			delete();
		}

		/// <summary>
		/// test exists method
		/// </summary>
		/// <param name="exists">if false, test is successful if the Product does NOT exists</param>
		public void exists(bool exists)
		{
			string TObjectPath = path + alias ;
			string TFileName = FName; 
			bool Exists_out = productImageService.exists(TObjectPath,TFileName);
   			
			// test if exists check was successful
			Assert.AreEqual(exists, Exists_out, "exists result set");

		}


		/// <summary>
		/// test suite with all tests in correct order
		/// </summary>
		[Test]
		public void runAllTests() 
		{
			deleteIfExists();
			exists(false);
			upload();
			exists(true);
			delete();
			uploadScale();
			exists(true);
			delete();
			exists(false);
		}
	}
}
