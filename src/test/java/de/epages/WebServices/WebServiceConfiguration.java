package de.epages.WebServices;

import java.util.*;
import java.io.*;

/**
 * Common configuration data for all web services
 * @author wloch@epages.de
 * $Id: WebServiceConfiguration.java,v 1.7 2011/01/28 11:32:39 agrohmann Exp $
 */
public class WebServiceConfiguration {

	public final String WEBSERVICE_URL = getWebserviceURL();
	  //use explicit servername and port for tracing
	  //public final static String WEBSERVICE_URL = "http://hmoye:8080/epages/Store.soap";
	public final static String WEBSERVICE_LOGIN = "/Shops/DemoShop/Users/admin";
	public final static String WEBSERVICE_PASSWORD = "admin";

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

	public String getWebserviceURL() {
		String WServer = getWServer();
		return "http://" + WServer + "/epages/Store.soap";
	}

}