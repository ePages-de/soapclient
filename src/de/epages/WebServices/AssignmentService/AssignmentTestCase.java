package de.epages.WebServices.AssignmentService;

import de.epages.WebServices.AssignmentService.Stub.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.*;
import java.util.logging.Logger;
import java.math.BigInteger;

/**
 * A JUnit TestSuite to test epages Assignment WebServices.
 *
 * User: tmangner
 * Date: 08.12.2005
 * Time: 14:19:18
 */
public class AssignmentTestCase {
    private static Logger log = Logger.getLogger(AssignmentTestCase.class.getName());
    AssignmentServiceClient serviceClient;

    String catalog = "/Shops/DemoShop/Categories/Jackets";
    String product = "/Shops/DemoShop/Products/ho_1112105010";

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new AssignmentServiceClient();

        // create test Assignments that can be used with the create and update methods
    }

    /**
     * Assign Catalog to Product and check if the assignment was successful
     */
    public void testAssignProductToCatalog() {
        TAssignProductToCatalog_Input assignment = new TAssignProductToCatalog_Input(catalog, product, new BigInteger("1000"));

        List<TAssignProductToCatalog_Input> Assignments_create_in = new ArrayList<TAssignProductToCatalog_Input>();
        Assignments_create_in.add(assignment);

        List<TAssignProductToCatalog_Return> Assignments_create_out = new ArrayList<TAssignProductToCatalog_Return>();

        try {
            Assignments_create_out = serviceClient.assignProductToCatalog(Assignments_create_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if creation was successful
        assertEquals("assign result set", 1, Assignments_create_out.size());
        assertEquals("assigned?", new Boolean(true), Assignments_create_out.get(0).getAssigned());
    }

    /**
     * Get assigned Catalogs for Product. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetCatalogsAssignedToProduct() {
        List<TGetCatalogsAssignedToProduct_Return> Assignments_info_out = new ArrayList<TGetCatalogsAssignedToProduct_Return>();
        try {
            Assignments_info_out = serviceClient.getCatalogsAssignedToProduct(new String[]{product});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getCatalogsAssignedToProduct result set", 1, Assignments_info_out.size());

        TGetCatalogsAssignedToProduct_Return Assignment_info_out = Assignments_info_out.get(0);

        assertEquals("path", product, Assignment_info_out.getProduct());
        assertTrue("assigned Catalogs result set", Assignment_info_out.getCatalogs().length > 0);

        boolean found = false;
        for (int i = 0; i < Assignment_info_out.getCatalogs().length; i++) {
            TAssignedCatalog tAssignedCatalog = Assignment_info_out.getCatalogs()[i];
            if (tAssignedCatalog.getPath().equals(catalog)) {
                found = true;
            }
        }
        assertTrue("assigned Catalog", found);
    }

    /**
     * Get assigned Products for Catalog. Check if the returned data are equal to
     * the data of create or update call
     */
    public void testGetProductsAssignedToCatalog() {
        List<TGetProductsAssignedToCatalog_Return> Assignments_info_out = new ArrayList<TGetProductsAssignedToCatalog_Return>();
        try {
            Assignments_info_out = serviceClient.getProductsAssignedToCatalog(new String[]{catalog});
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getCatalogsAssignedToProduct result set", 1, Assignments_info_out.size());

        TGetProductsAssignedToCatalog_Return Assignment_info_out = Assignments_info_out.get(0);

        assertEquals("path", catalog, Assignment_info_out.getCatalog());
        assertTrue("assigned Products result set", Assignment_info_out.getProducts().length > 0);

        boolean found = false;
        for (int i = 0; i < Assignment_info_out.getProducts().length; i++) {
            TAssignedProduct tAssignedProduct = Assignment_info_out.getProducts()[i];
            if (tAssignedProduct.getPath().equals(product)) {
                found = true;
            }
        }
        assertTrue("assigned Product", found);
    }

    /**
     * Remove an Assignment and check if no error occured.
     */
    public void testRemoveProductFromCatalog() {
        List<TRemoveProductFromCatalog_Input> Assignments_delete_in = new ArrayList<TRemoveProductFromCatalog_Input>();
        Assignments_delete_in.add(new TRemoveProductFromCatalog_Input(catalog, product));

        List<TRemoveProductFromCatalog_Return> Assignments_delete_out = new ArrayList<TRemoveProductFromCatalog_Return>();
        try {
            Assignments_delete_out = serviceClient.removeProductFromCatalog(Assignments_delete_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if deletion was successful
        assertEquals("delete result set", 1, Assignments_delete_out.size());
        assertEquals("deleted?", new Boolean(true), Assignments_delete_out.get(0).getRemoved());
    }

    /**
     * Test if a Product is assigned to a Catalog or not
     * @param expected if false the Test will be successful if the Assignment does NOT exist
     */
    public void testIsProductAssignedToCatalog(boolean expected) {
        List<TIsProductAssignedToCatalog_Input> Assignments_exists_in = new ArrayList<TIsProductAssignedToCatalog_Input>();
        Assignments_exists_in.add(new TIsProductAssignedToCatalog_Input(catalog, product));

        List<TIsProductAssignedToCatalog_Return> Assignments_exists_out = new ArrayList<TIsProductAssignedToCatalog_Return>();
        try {
            Assignments_exists_out = serviceClient.isProductAssignedToCatalog(Assignments_exists_in);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }

        // test if exists check was successful
        assertEquals("exists result set", 1, Assignments_exists_out.size());
        assertEquals("exists?", new Boolean(expected), Assignments_exists_out.get(0).getAssigned());
    }


    /**
     * Runs all tests:
     * <ol>
     *   <li>Assign Catalog to Product</li>
     *   <li>Test if Product is assigned to Catalog</li>
     *   <li>Get assigned Catalogs for Product</li>
     *   <li>Get assigned Products for Catalog</li>
     *   <li>Remove the Assignment</li>
     *   <li>Test if Product is assigned to Catalog</li>
     * </ol>
     */
    @Test
    public void testAll() {
        testAssignProductToCatalog();
        testIsProductAssignedToCatalog(true);
        testGetCatalogsAssignedToProduct();
        testGetProductsAssignedToCatalog();
        testRemoveProductFromCatalog();
        testIsProductAssignedToCatalog(false);
    }
}
