package de.epages.ws;

public class EnableMultiStoreTest {

    public static boolean checkMSTestsProperty() {
        String runTests = System.getProperty("runMSTests");
        return runTests != null && !"false".equals(runTests);
    }
}
