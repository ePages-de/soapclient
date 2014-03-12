package de.epages.ws;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WebServiceApplicationConfigurationTest {

    private static final char SEPARATOR = (char) 1;

    @Test
    public void test() {
        WebServiceApplicationConfiguration config = new WebServiceApplicationConfiguration();
        config.setUsernames("test", null);
        assertEquals("test", config.getUsername());
        config.setUsernames("test", "app");
        assertEquals("test" + SEPARATOR + "app", config.getUsername());
        config.setPasswords("test", null);
        assertEquals("test", config.getPassword());
        config.setPasswords("test", "app");
        assertEquals("test" + SEPARATOR + "app", config.getPassword());

    }

}
