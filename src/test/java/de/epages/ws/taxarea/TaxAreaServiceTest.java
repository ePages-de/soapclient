package de.epages.ws.taxarea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.taxarea.model.TGetList_Return;

public class TaxAreaServiceTest {

    private static final TaxAreaServiceClientImpl taxAreaService = new TaxAreaServiceClientImpl(new WebServiceTestConfiguration());

    /**
     * Get a list of all tax areas
     */
    @Test
    public void testGetList() {
        TGetList_Return[] TaxAreas = taxAreaService.getList();

        int count = TaxAreas.length;
        assertEquals("number of tax areas", 2, count);

        HashMap<String, TGetList_Return> results = new HashMap<String, TGetList_Return>();
        for (TGetList_Return result : TaxAreas)
            results.put(result.getPath(), result);
        assertTrue("first tax area", results.containsKey("/TaxMatrixGermany/EU"));
        assertTrue("second tax area", results.containsKey("/TaxMatrixGermany/\"non EU\""));
    }
}
