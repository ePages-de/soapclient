package de.epages.ws;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocalEpagesConfReader {

    private LocalEpagesConfReader() {
        throw new UnsupportedOperationException("utility class");
    }

    public static String getHostNameFromEpagesConf() {
        String confPath = System.getenv("EPAGES_CONFIG");
        if (confPath != null) {
            Properties p = new Properties();
            try {
                p.load(new FileInputStream(confPath + "/epages.conf"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return p.getProperty("SystemDomainName");
        }
        throw new IllegalStateException("Cannot find local epages6 installation. Pass wsUrl or wsHostName");
    }
}
