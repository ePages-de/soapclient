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
 *  - setting System property "wsPassword" (e.g. somPassXX)
 *      default will be admin
 *  - setting System property "wsAppName" (e.g. somApp)
 *      default will be none
 *  - setting System property "wsAppPassword" (e.g. somAppPassword)
 *      default will be none
 */
public class ProviderWebServiceTestConfiguration implements WebServiceConfiguration {

    private String wsLogin;

    private String wsPassword;

    private final URL wsUrl;

    public ProviderWebServiceTestConfiguration() {
        String wsUrl = System.getProperty("wsUrl");
        wsLogin = System.getProperty("wsUser", "/Providers/Distributor/Users/admin");
        wsPassword = System.getProperty("wsPassword", "admin");
        if (System.getProperty("wsAppName") != null) {
        	wsLogin += (char)1 + System.getProperty("wsAppName");
        }
        if (System.getProperty("wsAppPassword") != null) {
        	wsPassword += (char)1 + System.getProperty("wsAppPassword");
        }
        
        try {
            this.wsUrl = wsUrl != null ? new URL(wsUrl) : new URL(deriveWebserviceUrl());
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("could not derive webservice url (tried wsUrl and wsHostName properties, and reading local epages.conf)", e);
        }
    }

    @Override
    public String getUsername() {
        return wsLogin;
    }

    @Override
    public String getPassword() {
        return wsPassword;
    }

    @Override
    public URL getWebserviceURL() {
        return wsUrl;
    }

    private static String deriveWebserviceUrl() {
        String ep6HostName = System.getProperty("wsHostName");
        if (ep6HostName == null) {
            ep6HostName = LocalEpagesConfReader.getHostNameFromEpagesConf();
        }
        return String.format("http://%1$s/epages/Site.soap", ep6HostName);
    }

}