using System;
using STA.Settings;

namespace EpagesWebServices
{
	/// <summary>
	/// Common configuration data for all web services
	/// </summary>
	public class WebServiceConfiguration
	{

		public string WEBSERVICE_SERVER;
		public string WEBSERVICE_URL;
		public string WEBSERVICE_LOGIN;
		public string WEBSERVICE_PASSWORD;

		public WebServiceConfiguration()
        {
            WEBSERVICE_SERVER = getWServerFromConfig();
			WEBSERVICE_LOGIN = getWSLogin();
			WEBSERVICE_PASSWORD = getWSPassword();
			WEBSERVICE_URL = getWSUrl();
			Console.WriteLine("Using: " + WEBSERVICE_URL + " " + WEBSERVICE_LOGIN + ":" + WEBSERVICE_PASSWORD);
        }

		public String getWSUrl() {
			String wsUrl = System.Environment.GetEnvironmentVariable("wsUrl");
			if (wsUrl != null) {
				return wsUrl;
			}
			return "http://" + WEBSERVICE_SERVER + "/epages/Store.soap";
		}

		public String getWSLogin() {
			String wsUser = System.Environment.GetEnvironmentVariable("wsUser");
			if (wsUser != null) {
				return wsUser;
			}
			return "/Shops/DemoShop/Users/admin";
		}

		public String getWSPassword() {
			String wsPassword = System.Environment.GetEnvironmentVariable("wsPassword");
			if (wsPassword != null) {
				return wsPassword;
			}
			return "admin";
		}

        public String getWServerFromConfig()
		{
			// set a fixed hostname via environment parameters.
			String epHostName = System.Environment.GetEnvironmentVariable("wsHostName");
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
