package de.epages.WebServices;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

/**
 * Common configuration data for all web services
 */
@Deprecated
public class WebServiceTestConfiguration implements WebServiceConfiguration {

    private static final WebServiceTestConfiguration _INSTANCE = new WebServiceTestConfiguration();

    public final static String WEBSERVICE_LOGIN = "/Shops/DemoShop/Users/admin";
    public final static String WEBSERVICE_PASSWORD = "admin";
    public final static URL WEBSERVICE_URL = _INSTANCE._getWebserviceURL();

    private String webservice_server = "";

    private String readSystemDomainNameFromConf() {
        String WServer = "localhost";
        String ConfPath = System.getenv("EPAGES_CONFIG");
        if (!ConfPath.isEmpty()) {
            Properties p = new Properties();
            try {
                p.load(new FileInputStream(ConfPath + "/epages.conf"));
                WServer = p.getProperty("SystemDomainName");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return WServer;
    }

    public String getWServer() {
        if ("".equals(webservice_server)) {
            webservice_server = readSystemDomainNameFromConf();
        }
        return webservice_server;
    }

    private URL _getWebserviceURL() {
        String WServer = getWServer();
        try {
            return URI.create("http://" + WServer + "/epages/Store.soap").toURL();
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

}