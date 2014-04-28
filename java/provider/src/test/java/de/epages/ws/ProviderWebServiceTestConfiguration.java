package de.epages.ws;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

import de.epages.ws.WebServiceConfiguration;

public class ProviderWebServiceTestConfiguration implements WebServiceConfiguration {

    public final static String WEBSERVICE_LOGIN = "/Providers/Distributor/Users/admin";
    public final static String WEBSERVICE_PASSWORD = "admin";
    public final static URL WEBSERVICE_URL = new ProviderWebServiceTestConfiguration().doGetWebserviceURL();

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
        if (confPath != null) {
            Properties p = new Properties();
            try {
                p.load(new FileInputStream(confPath + "/epages.conf"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return p.getProperty("SystemDomainName");
        }
        throw new NullPointerException("EPAGES_CONFIG");
    }

    private URL doGetWebserviceURL() {
        String hostname = readSystemDomainName();
        try {
            return URI.create("http://" + hostname + "/epages/Site.soap").toURL(); // ?useGuidAsPath=1
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

}
