package de.epages.ws.assignment;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.assignment.AssignmentServiceClient;
import de.epages.ws.assignment.AssignmentServiceClientImpl;
import de.epages.ws.assignment.model.TAssignProductToCatalog_Input;
import de.epages.ws.assignment.model.TAssignProductToCatalog_Return;
import de.epages.ws.assignment.model.TAssignedCatalog;
import de.epages.ws.assignment.model.TAssignedProduct;
import de.epages.ws.assignment.model.TGetCatalogsAssignedToProduct_Return;
import de.epages.ws.assignment.model.TGetProductsAssignedToCatalog_Return;
import de.epages.ws.assignment.model.TIsProductAssignedToCatalog_Input;
import de.epages.ws.assignment.model.TIsProductAssignedToCatalog_Return;
import de.epages.ws.assignment.model.TRemoveProductFromCatalog_Input;
import de.epages.ws.assignment.model.TRemoveProductFromCatalog_Return;

public class AssignmentServiceClientImplTest {
    private AssignmentServiceClient serviceClient;

    private static final String catalog = "/Shops/DemoShop/Categories/Jackets";
    private static final String product = "/Shops/DemoShop/Products/ho_1112105010";

    /**
     * Sets all the required prerequisites for the tests. Will be called before
     * the test are run.
     */
    @Before
    public void setUp() {
        serviceClient = new AssignmentServiceClientImpl(new WebServiceTestConfiguration());
    }

    /**
     * Assign Product to Catalog and check if the assignment was successful
     */
    public void testAssignProductToCatalog() {
        TAssignProductToCatalog_Input assignment = new TAssignProductToCatalog_Input(catalog, product, new BigInteger("1000"));
        TAssignProductToCatalog_Input[] Assignments_create_in = new TAssignProductToCatalog_Input[] { assignment };
        TAssignProductToCatalog_Return[] Assignments_create_out = serviceClient.assignProductToCatalog(Assignments_create_in);

        // test if creation was successful
        assertEquals("assign result set", 1, Assignments_create_out.length);
        assertNoError(Assignments_create_out[0].getError());
        assertEquals("assigned?", new Boolean(true), Assignments_create_out[0].getAssigned());
    }

    /**
     * Get assigned Catalogs for Product. Check if the returned data are equal
     * to the data of create or update call
     */
    public void testGetCatalogsAssignedToProduct() throws RemoteException {
        TGetCatalogsAssignedToProduct_Return[] Assignments_info_out = serviceClient.getCatalogsAssignedToProduct(new String[] { product });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getCatalogsAssignedToProduct result set", 1, Assignments_info_out.length);

        TGetCatalogsAssignedToProduct_Return Assignment_info_out = Assignments_info_out[0];
        assertNoError(Assignment_info_out.getError());

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
     * Get assigned Products for Catalog. Check if the returned data are equal
     * to the data of create or update call
     */
    public void testGetProductsAssignedToCatalog() throws RemoteException {
        TGetProductsAssignedToCatalog_Return[] Assignments_info_out = serviceClient.getProductsAssignedToCatalog(new String[] { catalog });

        // test if getinfo was successful and if all data are equal to input
        assertEquals("getCatalogsAssignedToProduct result set", 1, Assignments_info_out.length);

        TGetProductsAssignedToCatalog_Return Assignment_info_out = Assignments_info_out[0];
        assertNoError(Assignment_info_out.getError());

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
    public void testRemoveProductFromCatalog() throws RemoteException {
        TRemoveProductFromCatalog_Input[] Assignments_delete_in = new TRemoveProductFromCatalog_Input[] { new TRemoveProductFromCatalog_Input(
                catalog, product) };
        TRemoveProductFromCatalog_Return[] Assignments_delete_out = serviceClient.removeProductFromCatalog(Assignments_delete_in);

        // test if deletion was successful
        assertEquals("delete result set", 1, Assignments_delete_out.length);
        assertNoError(Assignments_delete_out[0].getError());
        assertEquals("deleted?", new Boolean(true), Assignments_delete_out[0].getRemoved());
    }

    /**
     * Test if a Product is assigned to a Catalog or not
     * 
     * @param expected
     *            if false the Test will be successful if the Assignment does
     *            NOT exist
     */
    public void testIsProductAssignedToCatalog(boolean expected) throws RemoteException {
        TIsProductAssignedToCatalog_Input[] Assignments_exists_in = new TIsProductAssignedToCatalog_Input[] {new TIsProductAssignedToCatalog_Input(catalog, product)};
        TIsProductAssignedToCatalog_Return[] Assignments_exists_out = serviceClient.isProductAssignedToCatalog(Assignments_exists_in);

        // test if exists check was successful
        assertEquals("exists result set", 1, Assignments_exists_out.length);
        assertNoError(Assignments_exists_out[0].getError());
        assertEquals("exists?", new Boolean(expected), Assignments_exists_out[0].getAssigned());
    }

    /**
     * Runs all tests:
     * <ol>
     * <li>Assign Catalog to Product</li>
     * <li>Test if Product is assigned to Catalog</li>
     * <li>Get assigned Catalogs for Product</li>
     * <li>Get assigned Products for Catalog</li>
     * <li>Remove the Assignment</li>
     * <li>Test if Product is assigned to Catalog</li>
     * </ol>
     */
    @Test
    public void testAll() throws RemoteException {
        testAssignProductToCatalog();
        testIsProductAssignedToCatalog(true);
        testGetCatalogsAssignedToProduct();
        testGetProductsAssignedToCatalog();
        testRemoveProductFromCatalog();
        testIsProductAssignedToCatalog(false);
    }
}
