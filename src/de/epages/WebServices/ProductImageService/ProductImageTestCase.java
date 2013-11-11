package de.epages.WebServices.ProductImageService;

import de.epages.WebServices.ProductImageService.Stub.*;
import de.epages.WebServices.ProductService.Stub.*;
import de.epages.WebServices.WebServiceConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.io.*;

/**
 * A JUnit TestSuite to test epages ProductImage WebServices.
 */
public class ProductImageTestCase extends WebServiceConfiguration {
    private static Logger log = Logger.getLogger(ProductImageTestCase.class.getName());

    private Bind_Product_SOAPStub productService;
    private Bind_ProductImage_SOAPStub productImageService;

    String alias = "java_test-1";
    String path = "Products/";
    String TaxClass = "/TaxMatrixGermany/normal";
    
    // for exists, delete and upload
    String FName = "cg_0100504001.jpg";
    String FName1 = "be_40401_blue.jpg";
    
    // for upload
    String FileName  = "../TestData/ProductImageService/cg_0100504001.jpg";
    String FileName1 = "../TestData/ProductImageService/be_40401_blue.jpg";

    String ImagesSlideShowUpload = "cg_0100504001.jpg;be_40401_blue.jpg";
    String ImagesSlideShowScale = "be_40401_blue.jpg;be_40401_blue_m.jpg;be_40401_blue_h.jpg";
    
    
    String SCALE_BORDER_COLOR_h = "#FFFFFF";
    String SCALE_BORDER_COLOR_m = "#FFFFFF";
    boolean SCALE_BORDER_IMAGE_h = true;
    boolean SCALE_BORDER_IMAGE_m = true;
    String SCALE_NAME_h = "ImageHotDeal";
    String SCALE_NAME_m = "ImageMedium";
    String SCALE_NAME_s = "ImageSmall";
    String SCALE_SIZE_h = "150";
    String SCALE_SIZE_m = "200";
    String SCALE_SIZE_s = "100";
    
    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() throws RemoteException, MalformedURLException {
        log.info("ProductImageTestCase: setUp");
        
        File dir = new File(".");
        for( File f  : dir.listFiles() )
        	log.info(f.getName());
        

        // set up ProductImageService
        ProductImageService serviceLocator = new ProductImageServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_ProductImageAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        productImageService = new Bind_ProductImage_SOAPStub(new java.net.URL(WEBSERVICE_URL), serviceLocator);

        // setting user-path and password of the shop
        productImageService.setUsername(WEBSERVICE_LOGIN);
        productImageService.setPassword(WEBSERVICE_PASSWORD);
        
        // set up the ProductService in order to create a test product
        ProductService productServiceLocator = new ProductServiceLocator();
        productService = new Bind_Product_SOAPStub(new java.net.URL(WEBSERVICE_URL), productServiceLocator);
        productService.setUsername(WEBSERVICE_LOGIN);
        productService.setPassword(WEBSERVICE_PASSWORD);

        // create the test product
        TCreate_Input productInfo = new TCreate_Input();
        productInfo.setAlias( alias );
        productInfo.setTaxClass(TaxClass);
        TCreate_Input[] createInput = new TCreate_Input[]{productInfo};
        productService.create( createInput );
    }

    @After
    public void cleanUp() throws RemoteException
    {
        log.info("ProductImageTestCase: cleanUp");

        String[] deletePaths = { path+alias };
        de.epages.WebServices.ProductService.Stub.TDelete_Return[] result = productService.delete(deletePaths);
        assertNull( "no error", result[0].getError() );
        assertTrue( "product is deleted", result[0].getDeleted() );
    }
   
    /**
     * test deletion of a Product image and check if method returns a true value
     */
    public void delete() throws RemoteException
    {
        log.info("ProductImageTestCase: upload");

        String ProductPath = path + alias;
        String[] FileNames = { FName, FName1 };
    
        de.epages.WebServices.ProductImageService.Stub.TDelete_Return[] Files_out = productImageService.delete(ProductPath, FileNames);

        // test if deletion was successful
        assertEquals("delete result count", 2, Files_out.length);

        de.epages.WebServices.ProductImageService.Stub.TDelete_Return File_out = Files_out[0];
        assertTrue(File_out.getPath() + " deleted?", File_out.getDeleted());
    }

    /**
     * test upload of a Product image and check if method returns a true value
     */
    public void upload() throws RemoteException, IOException
    {
        log.info("ProductImageTestCase: upload");

        String ProductPath = path + alias;
        
        // read files and fill the TImageData structures
        TImageData image1 = new TImageData();
        image1.setFileName(FName);
        image1.setContent(readFile(FileName));

        // read second
        TImageData image2 = new TImageData();
        image2.setFileName(FName1);
        image2.setContent(readFile(FileName1));
    
        // add to structure
        TUpload_Input Params_in = new TUpload_Input();
        Params_in.setImageData( new TImageData[]{
    		image1,
    		image2,
        });
        Params_in.setImagesSlideShowString(ImagesSlideShowUpload);
        
        TUpload_Return[] Files_out = productImageService.upload(ProductPath, Params_in);

        // test if upload was successful
        assertEquals("upload result count", 2, Files_out.length);
        assertTrue(Files_out[0].getFile() + " written?", Files_out[0].getWriteOK());
        assertTrue(Files_out[1].getFile() + " written?", Files_out[1].getWriteOK());
    }

    /**
     * test upload and scale of a Product image and check if method returns a true value
     */
    public void uploadScale() throws RemoteException, IOException
    {
        log.info("ProductImageTestCase: uploadScale");

        String ProductPath = path + alias;
        
        // read files and fill the TImageData structures
        TImageData image1 = new TImageData();
        image1.setFileName(FName);
        image1.setContent(readFile(FileName));

        // read second
        TImageData image2 = new TImageData();
        image2.setFileName(FName1);
        image2.setContent(readFile(FileName1));
    
        // add to structure
        TUploadScale_Input Params_in = new TUploadScale_Input();
        Params_in.setImageData(new TImageData[]{
    		image1,
    		image2,
        }); 
       
        Params_in.setImagesSlideShowString(ImagesSlideShowScale);
        
        TScaleParams tsp = new TScaleParams();
        tsp.setSCALE_BORDER_COLOR_h(SCALE_BORDER_COLOR_h);
        tsp.setSCALE_BORDER_COLOR_m(SCALE_BORDER_COLOR_m);
        tsp.setSCALE_BORDER_IMAGE_h(SCALE_BORDER_IMAGE_h);
        tsp.setSCALE_BORDER_IMAGE_m(SCALE_BORDER_IMAGE_m);
        tsp.setSCALE_NAME_h(SCALE_NAME_h);
        tsp.setSCALE_NAME_m(SCALE_NAME_m);
        tsp.setSCALE_NAME_s(SCALE_NAME_s);
        tsp.setSCALE_SIZE_h(SCALE_SIZE_h);
        tsp.setSCALE_SIZE_m(SCALE_SIZE_m);
        tsp.setSCALE_SIZE_s(SCALE_SIZE_s);

        TUploadScale_Return[] Files_out = productImageService.uploadscale(ProductPath,Params_in,tsp);

        // test if upload was successful
        assertEquals("uploadScale result count", 2, Files_out.length);

        TUploadScale_Return File_out = Files_out[0];
        assertTrue(File_out.getFile() + " written?", File_out.getWriteOK());
        assertTrue(File_out.getFile() + " scaled?", File_out.getScaleOK());
    }

    public void deleteIfExists() throws RemoteException
    {
        String objectPath = path + alias ;
        String fileName = FName; 
        boolean Exists_out = productImageService.exists(objectPath, fileName);

        if (Exists_out) 
        {
        	delete();
        }
    }

    /**
     * test exists method
     *
     * @param expected  if false, test is successful if the image does NOT exists
     */
    public void exists(boolean expected) throws RemoteException
    {
        log.info("ProductImageTestCase: exists");
    	
        String objectPath = path + alias ;
        String fileName = FName; 
        boolean Exists_out = productImageService.exists(objectPath, fileName);
        
        // test if exists check was successful
        assertEquals(FName + " exists?", expected, Exists_out);
    }
    
    /**
     * reads a binary file
     * @param fileName file name
     * @return binary file content
     */
    private byte[] readFile(String fileName) throws IOException
    {
        File file = new File(FileName);
        int fileSize = (int)file.length();
        InputStream in = new FileInputStream(file);
        byte[] content = new byte[fileSize];
        in.read(content, 0, fileSize);
        in.close();
    	
    	return content;
    }

    /**
     * test suite with all tests in correct order
     */
    @Test
    public void testAll() throws RemoteException, IOException
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
