using System;
using EpagesWebServices.UpdateServiceRef;

namespace EpagesWebServices
{
    /// <summary>
    /// Client that uses generated stub to call UpdateService methods
    /// </summary>
    public class UpdateServiceClient : WebServiceConfiguration
    {
        UpdateService stub;

        public UpdateServiceClient()
        {
            stub = new UpdateService();
            stub.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
            stub.PreAuthenticate = true;
            stub.Url = WEBSERVICE_URL;
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