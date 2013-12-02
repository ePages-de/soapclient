package de.epages.webservice;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Common configuration data for all web services.
 * 
 * Tries to resolve an epages6 hostname by
 * - reading System property "ep6HostName"
 * - reading epages.conf for value "SystemDomainName"
 * - using a fallback on "localhost".
 * 
 * Default credentials for DemoShop admin are used to authenticate the user.
 */
public class WebServiceTestConfiguration implements WebServiceConfiguration {

    private static final Logger log = LoggerFactory.getLogger(WebServiceTestConfiguration.class);
    
    public final static String WEBSERVICE_LOGIN = "/Shops/DemoShop/Users/admin";
    public final static String WEBSERVICE_PASSWORD = "admin";
    public final static URL WEBSERVICE_URL = new WebServiceTestConfiguration().doGetWebserviceURL();

    @Override
    public URL getWebserviceURL() {
        return WEBSERVICE_URL;
    }

    @Override
    public String getUsername() {
        return WEBSERVICE_LOGIN;
    }

    @Override
    public String getPassword() {
        return WEBSERVICE_PASSWORD;
    }

    private String readSystemDomainName() {
        String hostname = getHostnameFromSystemProperty();
        if (hostname != null) {
            return hostname;
        }
        hostname = getHostnameFromEpagesConf();
        return hostname != null ? hostname : "localhost";
    }

    private String getHostnameFromSystemProperty() {
        return System.getProperty("ep6HostName");
    }

    private String getHostnameFromEpagesConf() {
        String confPath = System.getenv("EPAGES_CONFIG");
        if (!confPath.isEmpty()) {
            Properties p = new Properties();
                try {
                    p.load(new FileInputStream(confPath + "/epages.conf"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return p.getProperty("SystemDomainName");
        }
        return null;
    }

    private URL doGetWebserviceURL() {
        String hostname = readSystemDomainName();
        try {
            URL url = URI.create("http://" + hostname + "/epages/Store.soap").toURL();
            log.info("using epages6 SOAP URL: " + url.toString());
            return url;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

}