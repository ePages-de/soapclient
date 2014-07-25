package de.epages.ws;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Common configuration data for all web service tests.
 *
 * It can be configured by
 *  - setting System property "wsUrl" (e.g. https://yourhost/epages/Store.soap
 *     default will be from reading wsHostName and appending /epages/Store.soap
 *  - setting System property "wsHostName" (e.g. yourhost
 *     default will be from reading "SystemDomainName" from epages.conf
 *  - setting System property "wsUser" (e.g. /Shops/SomeShop/Users/someUser
 *     default will be /Shops/DemoShop/Users/admin
 *  - settign System property "wsPassword" (e.g. somPassXX)
 *      default will be admin
 */
public class ShopWebServiceTestConfiguration implements WebServiceConfiguration {

    private final String WEBSERVICE_LOGIN = System.getProperty("wsUser", "/Shops/DemoShop/Users/admin");

    private final String WEBSERVICE_PASSWORD = System.getProperty("wsPassword", "admin");

    private final URL WEBSERVICE_URL;

    public ShopWebServiceTestConfiguration() {
        String wsUrl = System.getProperty("wsUrl");
        try {
            WEBSERVICE_URL = wsUrl != null ? new URL(wsUrl) : new URL(deriveWebserviceUrl());
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("could not derive webservice url (tried wsUrl and wsHostName properties, and reading local epages.conf)", e);
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

    private static String deriveWebserviceUrl() {
        String ep6HostName = System.getProperty("wsHostName");
        if (ep6HostName == null) {
            ep6HostName = LocalEpagesConfReader.getHostNameFromEpagesConf();
        }
        return String.format("http://%1$s/epages/Store.soap", ep6HostName);
    }

}