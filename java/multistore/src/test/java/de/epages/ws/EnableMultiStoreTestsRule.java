package de.epages.ws;

import static org.junit.Assume.assumeTrue;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class EnableMultiStoreTestsRule implements TestRule {

    public static final EnableMultiStoreTestsRule INSTANCE = new EnableMultiStoreTestsRule();

    public static boolean checkMSTestsProperty() {
        String runTests = System.getenv().get("runMSTests");
        return runTests != null && !"false".equals(runTests);
    }

    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {

            @Override
            public void evaluate() throws Throwable {
                assumeTrue("checking SystemProperty runMSTests", EnableMultiStoreTestsRule.checkMSTestsProperty());
                base.evaluate();
            }
        };
    }
}
