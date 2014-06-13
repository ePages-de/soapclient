package de.epages.ws;

import java.net.MalformedURLException;
import java.net.URL;

public class ProviderWebServiceTestConfiguration implements WebServiceConfiguration {

    private final String WEBSERVICE_LOGIN =
            System.getProperty("wsUser", "/Providers/Distributor/Users/admin");

    private final String WEBSERVICE_PASSWORD = System.getProperty("wsPassword", "admin");

    private final URL WEBSERVICE_URL;

    public ProviderWebServiceTestConfiguration() {
        String wsUrl = System.getProperty("wsUrl");
        try {
            WEBSERVICE_URL = wsUrl != null ? new URL(wsUrl) : new URL(deriveWebserviceUrl());
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("could not derive webservice url (tried wsUrl and wsHostName properties, and reading local epages.conf)", e);
        }
    }

    @Override
    public String getUsername() {
        return WEBSERVICE_LOGIN;
    }

    @Override
    public String getPassword() {
        return WEBSERVICE_PASSWORD;
    }

    @Override
    public URL getWebserviceURL() {
        return WEBSERVICE_URL;
    }

    private static String deriveWebserviceUrl() {
        String ep6HostName = System.getProperty("wsHostName", LocalEpagesConfReader.getHostNameFromEpagesConf());
        return String.format("http://%1$s/epages/Site.soap", ep6HostName);
    }

}
