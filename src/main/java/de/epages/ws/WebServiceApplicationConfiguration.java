package de.epages.ws;

import java.net.URL;

public class WebServiceApplicationConfiguration implements WebServiceConfiguration {

    private static final char SEPARATOR = (char) 1;

    private URL webserviceURL;

    private String username;

    private String password;

    public URL getWebserviceURL() {
        return webserviceURL;
    }

    public void setWebserviceURL(URL webserviceURL) {
        this.webserviceURL = webserviceURL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsernames(String username, String applicationName) {
        this.username = username;
        if (applicationName != null) {
            this.username += SEPARATOR + applicationName;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPasswords(String password, String applicationPassword) {
        this.password = password;
        if (applicationPassword != null) {
            this.password += SEPARATOR + applicationPassword;
        }
    }



}
