package de.epages.ws.productattribute;

import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;

import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.productattribute.model.TGetInfoList_Return;

public class ProductAttributeServiceTest {

    private static final ProductAttributeServiceClientImpl productAttributeService = new ProductAttributeServiceClientImpl(new WebServiceTestConfiguration());

    /**
     * Get a list of all product attributes
     */
    @Test
    public void testGetList() throws RemoteException {
        TGetInfoList_Return[] allAttributes = productAttributeService.getInfoList();

        // test if transfer was successful
        assertTrue("number of attributes > 10", allAttributes.length > 10);

        // test if the attribute "Color" exists in product type "Jacket"
        boolean existsAttribute = false;
        for( TGetInfoList_Return attributeInfo : allAttributes )
        {
            if( attributeInfo.getAlias().equals("Color") &&
            	attributeInfo.getProductType().equals("Jacket") )
            {
                existsAttribute = true;
                assertTrue("attribute 'Color' is a variation attribute", attributeInfo.getIsVariationAttribute());
            }
        }

        assertTrue("attribute 'Color' exists in class 'Jacket'", existsAttribute);
    }
}
