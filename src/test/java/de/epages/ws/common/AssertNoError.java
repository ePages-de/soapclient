package de.epages.ws.common;

import static org.junit.Assert.fail;
import de.epages.ws.common2.model.TError;

public class AssertNoError {

    public static void assertNoError(TError error) {
        if (error != null) {
            fail(error.getMessage());
        }
    }

    public static void assertNoError(de.epages.ws.common.model.TError error) {
        if (error != null) {
            fail(error.getMessage());
        }
    }

}
