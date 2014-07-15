package de.epages.ws;

import java.net.URL;

public class SimpleWebServiceConfiguration implements WebServiceConfiguration {

	private URL webserviceURL;

	private String username;

	private String password;

	public SimpleWebServiceConfiguration() {}

	public SimpleWebServiceConfiguration(URL webserviceURL, String username, String password) {
		this();
		this.webserviceURL = webserviceURL;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public URL getWebserviceURL() {
		return webserviceURL;
	}

	public void setWebserviceURL(URL webserviceURL) {
		this.webserviceURL = webserviceURL;
	}

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
