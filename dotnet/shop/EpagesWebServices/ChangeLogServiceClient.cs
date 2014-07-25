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

		public TFindCreatedObjects_Return findCreatedObjects(System.DateTime CreatedAfter, string Class)
		{
			return stub.findCreatedObjects(CreatedAfter, Class);
		}

		public TFindUpdatedObjects_Return findUpdatedObjects(System.DateTime UpdatedAfter, string Class, string Profile)
        {
			return stub.findUpdatedObjects(UpdatedAfter, Class, Profile);
        }

		public TFindDeletedObjects_Return findDeletedObjects(System.DateTime DeletedAfter, string Class)
        {
			return stub.findDeletedObjects(DeletedAfter, Class);
        }
    }
}