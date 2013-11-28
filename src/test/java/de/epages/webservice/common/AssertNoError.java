package de.epages.webservice.common;

import static org.junit.Assert.fail;
import de.epages.webservice.common.model.TError;

public class AssertNoError {

    public static void assertNoError(TError error) {
        if (error != null) {
            fail(error.getMessage());
        }
    }

}
