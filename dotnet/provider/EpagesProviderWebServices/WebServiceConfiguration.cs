using System;
using STA.Settings;

namespace EpagesProviderWebServices
{
	/// <summary>
	/// Common configuration data for all web services
	/// </summary>
	public class WebServiceConfiguration
	{

		public string WEBSERVICE_SERVER;
		public string WEBSERVICE_URL;
		public const string WEBSERVICE_LOGIN = "/Providers/Distributor/Users/admin";
		public const string WEBSERVICE_PASSWORD = "admin";

		public WebServiceConfiguration()
		{
			WEBSERVICE_SERVER = getWServerFromConfig();
			//use explicit servername and port for tracing
			//WEBSERVICE_SERVER = "hmoye:8080";
			WEBSERVICE_URL = "http://" + WEBSERVICE_SERVER + "/epages/Site.soap";
		}

		public String getWServerFromConfig()
		{
			// set a fixed hostname via environment parameters.
			String epHostName = System.Environment.GetEnvironmentVariable("ep6HostName");
			if (epHostName != null) {
				return epHostName;
			}
			String epConfDir = System.Environment.GetEnvironmentVariable("EPAGES_CONFIG");
			INIFile epConf = new INIFile(epConfDir + "\\epages.conf");
			String Server = epConf.GetValue("DE_EPAGES::Object", "SystemDomainName", "localhost");
			return Server;
		}

	}
}
