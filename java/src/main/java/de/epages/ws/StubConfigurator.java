package de.epages.ws;

import java.util.Hashtable;

import org.apache.axis.client.Stub;
import org.apache.axis.encoding.Base64;
import org.apache.axis.transport.http.HTTPConstants;

public class StubConfigurator {

    public static <T extends Stub> T configure(T stub, WebServiceConfiguration config) {
        Hashtable<String, String> headers = new Hashtable<String, String>();
        headers.put(HTTPConstants.HEADER_TRANSFER_ENCODING_CHUNKED, Boolean.FALSE.toString());
        String credentials = config.getUsername() + ":" + config.getPassword();
        String authHeader = "Basic " + Base64.encode(credentials.getBytes());
        headers.put(HTTPConstants.HEADER_AUTHORIZATION, authHeader);
        stub._setProperty(HTTPConstants.REQUEST_HEADERS, headers);
        return stub;
    }

}
