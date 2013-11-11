package de.epages.WebServices;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

/**
 * Common configuration data for all web services
 * @author wloch@epages.de
 * $Id: WebServiceConfiguration.java,v 1.7 2011/01/28 11:32:39 agrohmann Exp $
 */
public class WebServiceTestConfiguration implements WebServiceConfiguration {

	public final static String WEBSERVICE_LOGIN = "/Shops/DemoShop/Users/admin";
	public final static String WEBSERVICE_PASSWORD = "admin";
	public final static String WEBSERVICE_URL = new WebServiceTestConfiguration().getWebserviceURL().toString();

	private String webservice_server = "";

	private String readSystemDomainNameFromConf() {
		String WServer = new String("localhost");
		String ConfPath = System.getenv("EPAGES_CONFIG");
		if ( !ConfPath.isEmpty()){
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
		if ( "" != webservice_server ) {
			webservice_server = readSystemDomainNameFromConf();
		}
		return webservice_server;
	}

	public URL getWebserviceURL() {
		String WServer = getWServer();
		try {
			return URI.create("http://" + WServer + "/epages/Store.soap").toURL();
		} catch (MalformedURLException e) {
			throw new IllegalArgumentException(e);
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

}