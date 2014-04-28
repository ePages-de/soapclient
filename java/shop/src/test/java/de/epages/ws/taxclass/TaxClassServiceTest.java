package de.epages.ws.taxclass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.taxclass.model.TGetList_Return;

public class TaxClassServiceTest {

    private TaxClassServiceClientImpl taxClassService = new TaxClassServiceClientImpl(new WebServiceTestConfiguration());

    /**
     * Get a list of all tax classes
     */
    @Test
    public void testGetList() {
        	TGetList_Return[] TaxClasses = taxClassService.getList();

            int count = TaxClasses.length;
            assertEquals( "number of tax classes", 3, count );

            HashMap<String, TGetList_Return> results = new HashMap<String, TGetList_Return>();
            for ( TGetList_Return result:  TaxClasses ) results.put(result.getPath(),result);
            assertTrue("first tax class", results.containsKey("/TaxMatrixGermany/normal") );
            assertTrue("second tax class", results.containsKey("/TaxMatrixGermany/reduced") );
            assertTrue("third tax class", results.containsKey("/TaxMatrixGermany/none") );

    }
}
