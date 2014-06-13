package de.epages.ws.productimage;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.epages.ws.FileUtil;
import de.epages.ws.ShopWebServiceTestConfiguration;
import de.epages.ws.product11.ProductServiceClientImpl;
import de.epages.ws.product11.model.TCreate_Input;
import de.epages.ws.productimage.model.TDelete_Return;
import de.epages.ws.productimage.model.TImageData;
import de.epages.ws.productimage.model.TScaleParams;
import de.epages.ws.productimage.model.TUploadScale_Input;
import de.epages.ws.productimage.model.TUploadScale_Return;
import de.epages.ws.productimage.model.TUpload_Input;
import de.epages.ws.productimage.model.TUpload_Return;

/**
 * A JUnit TestSuite to test epages ProductImage WebServices.
 */
public class ProductImageServiceTest {

    private static final ProductServiceClientImpl productService = new ProductServiceClientImpl(new ShopWebServiceTestConfiguration());
    private static final ProductImageServiceClientImpl productImageService = new ProductImageServiceClientImpl(
            new ShopWebServiceTestConfiguration());

    private final String alias = "java_test-1";
    private final String path = "Products/";
    private final String TaxClass = "/TaxMatrixGermany/normal";

    // for exists, delete and upload
    private final String FName = "cg_0100504001.jpg";
    private final String FName1 = "be_40401_blue.jpg";

    // for upload
    private final String FileName = "TestData/ProductImageService/cg_0100504001.jpg";
    private final String FileName1 = "TestData/ProductImageService/be_40401_blue.jpg";

    private final String ImagesSlideShowUpload = "cg_0100504001.jpg;be_40401_blue.jpg";
    private final String ImagesSlideShowScale = "be_40401_blue.jpg;be_40401_blue_m.jpg;be_40401_blue_h.jpg";

    private final String SCALE_BORDER_COLOR_h = "#FFFFFF";
    private final String SCALE_BORDER_COLOR_m = "#FFFFFF";
    private final boolean SCALE_BORDER_IMAGE_h = true;
    private final boolean SCALE_BORDER_IMAGE_m = true;
    private final String SCALE_NAME_h = "ImageHotDeal";
    private final String SCALE_NAME_m = "ImageMedium";
    private final String SCALE_NAME_s = "ImageSmall";
    private final String SCALE_SIZE_h = "150";
    private final String SCALE_SIZE_m = "200";
    private final String SCALE_SIZE_s = "100";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        // create the test product
        TCreate_Input productInfo = new TCreate_Input();
        productInfo.setAlias(alias);
        productInfo.setTaxClass(TaxClass);
        TCreate_Input[] createInput = new TCreate_Input[] { productInfo };
        productService.create(createInput);
    }

    @After
    public void cleanUp() {
        String[] deletePaths = { path + alias };
        de.epages.ws.product11.model.TDelete_Return[] result = productService.delete(deletePaths);
        assertNoError("no error", result[0].getError());
        assertTrue("product is deleted", result[0].getDeleted());
    }

    /**
     * test deletion of a Product image and check if method returns a true value
     */
    public void delete() {
        String ProductPath = path + alias;
        String[] FileNames = { FName, FName1 };

        TDelete_Return[] Files_out = productImageService.delete(ProductPath, FileNames);

        // test if deletion was successful
        assertEquals("delete result count", 2, Files_out.length);

        TDelete_Return File_out = Files_out[0];
        assertTrue(File_out.getPath() + " deleted?", File_out.getDeleted());
    }

    /**
     * test upload of a Product image and check if method returns a true value
     */
    public void upload() throws IOException {
        String ProductPath = path + alias;

        // read files and fill the TImageData structures
        TImageData image1 = new TImageData();
        image1.setFileName(FName);
        image1.setContent(FileUtil.readFileFromClasspath(FileName));

        // read second
        TImageData image2 = new TImageData();
        image2.setFileName(FName1);
        image2.setContent(FileUtil.readFileFromClasspath(FileName1));

        // add to structure
        TUpload_Input Params_in = new TUpload_Input();
        Params_in.setImageData(new TImageData[] { image1, image2, });
        Params_in.setImagesSlideShowString(ImagesSlideShowUpload);

        TUpload_Return[] Files_out = productImageService.upload(ProductPath, Params_in);

        // test if upload was successful
        assertEquals("upload result count", 2, Files_out.length);
        assertTrue(Files_out[0].getFile() + " written?", Files_out[0].getWriteOK());
        assertTrue(Files_out[1].getFile() + " written?", Files_out[1].getWriteOK());
    }

    /**
     * test upload and scale of a Product image and check if method returns a
     * true value
     */
    public void uploadScale() throws IOException {
        String ProductPath = path + alias;

        // read files and fill the TImageData structures
        TImageData image1 = new TImageData();
        image1.setFileName(FName);
        image1.setContent(FileUtil.readFileFromClasspath(FileName));

        // read second
        TImageData image2 = new TImageData();
        image2.setFileName(FName1);
        image2.setContent(FileUtil.readFileFromClasspath(FileName1));

        // add to structure
        TUploadScale_Input Params_in = new TUploadScale_Input();
        Params_in.setImageData(new TImageData[] { image1, image2, });

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

        TUploadScale_Return[] Files_out = productImageService.uploadscale(ProductPath, Params_in, tsp);

        // test if upload was successful
        assertEquals("uploadScale result count", 2, Files_out.length);

        TUploadScale_Return File_out = Files_out[0];
        assertTrue(File_out.getFile() + " written?", File_out.getWriteOK());
        assertTrue(File_out.getFile() + " scaled?", File_out.getScaleOK());
    }

    public void deleteIfExists() {
        String objectPath = path + alias;
        String fileName = FName;
        boolean Exists_out = productImageService.exists(objectPath, fileName);

        if (Exists_out) {
            delete();
        }
    }

    /**
     * test exists method
     *
     * @param expected
     *            if false, test is successful if the image does NOT exists
     */
    public void exists(boolean expected) {
        String objectPath = path + alias;
        String fileName = FName;
        boolean Exists_out = productImageService.exists(objectPath, fileName);

        // test if exists check was successful
        assertEquals(FName + " exists?", expected, Exists_out);
    }

    /**
     * test suite with all tests in correct order
     */
    @Test
    public void testAll() throws IOException {
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
