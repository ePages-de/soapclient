using System;
using EpagesWebServices.ChangeLogServiceRef;

namespace EpagesWebServices
{
    /// <summary>
    /// Client that uses generated stub to call ChangeLogService methods
    /// </summary>
    public class ChangeLogServiceClient
    {
		private ChangeLogService stub;

		public ChangeLogServiceClient(WebServiceConfiguration WSConfig)
        {
            stub = new ChangeLogService();
			stub.Credentials = new System.Net.NetworkCredential(WSConfig.WEBSERVICE_LOGIN, WSConfig.WEBSERVICE_PASSWORD);
            stub.PreAuthenticate = true;
			stub.Url = WSConfig.WEBSERVICE_URL;
        }

		public TFindCreates_Return findCreates(System.DateTime CreatedAfter, string Class)
		{
			return stub.findCreates(CreatedAfter, Class);
		}

        public TFindUpdates_Return findUpdates(System.DateTime UpdatedAfter, string Class, string Profile)
        {
            return stub.findUpdates(UpdatedAfter, Class, Profile);
        }

        public TFindDeletes_Return findDeletes(System.DateTime DeletedAfter, string Class)
        {
            return stub.findDeletes(DeletedAfter, Class);
        }
    }
}