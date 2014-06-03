package de.epages.ws;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/**
 * Common configuration data for all web service tests.
 *
 * It can be configured by
 *  - setting System property "wsUrl" (e.g. https://yourhost/epages/SomeShop.soap
 *     default will be from reading "SystemDomainName" from epages.conf + /epages/Store.soap
 *  - setting System property "wsUser" (e.g. /Shops/SomeShop/Users/someUser
 *     default will be /Shops/DemoShop/Users/admin
 *  - settign System property "wsPassword" (e.g. somPassXX)
 *      default will be admin
 */
public class WebServiceTestConfiguration implements WebServiceConfiguration {

    private final String WEBSERVICE_LOGIN = System.getProperty("wsUser", "/Shops/DemoShop/Users/admin");

    private final String WEBSERVICE_PASSWORD = System.getProperty("wsPassword", "admin");

    private URL WEBSERVICE_URL;

    public WebServiceTestConfiguration() {
        String wsUrl = System.getProperty("wsUrl");
        try {
            WEBSERVICE_URL = wsUrl != null ? new URL(wsUrl) : new URL(getWebserviceUrlFromEpagesConf());
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

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

    private static String getWebserviceUrlFromEpagesConf() {
        String confPath = System.getenv("EPAGES_CONFIG");
        if (confPath != null) {
            Properties p = new Properties();
            try {
                p.load(new FileInputStream(confPath + "/epages.conf"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return "http://" + p.getProperty("SystemDomainName") + "/epages/Store.soap";
        }
        throw new NullPointerException("EPAGES_CONFIG");
    }
}