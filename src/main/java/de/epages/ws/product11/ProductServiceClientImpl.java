package de.epages.ws.product11;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.engine.AxisConfiguration;
import org.apache.axis2.transport.http.HttpTransportProperties;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.product11.model.TCreateInput;
import de.epages.ws.product11.model.TCreateReturn;
import de.epages.ws.product11.model.TDeleteReturn;
import de.epages.ws.product11.model.TExistsReturn;
import de.epages.ws.product11.model.TGetInfoReturn;
import de.epages.ws.product11.model.TUpdateInput;
import de.epages.ws.product11.model.TUpdateReturn;
import de.epages.ws.product11.stub.GetInfoDocument;
import de.epages.ws.product11.stub.GetInfoDocument.GetInfo;
import de.epages.ws.product11.stub.ProductServiceStub;
import de.epages.ws.product11.stub.TFindInput;
import de.epages.ws.product11.stub.impl.GetInfoDocumentImpl;

public class ProductServiceClientImpl implements ProductServiceClient {

    private final ProductServiceStub stub;

    public ProductServiceClientImpl(WebServiceConfiguration config) {
        try {
            AxisConfiguration axisConfiguration = new AxisConfiguration();
            ConfigurationContext configurationContext = new ConfigurationContext(axisConfiguration );
            Options options = new Options(); 
            HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator(); 
            auth.setUsername(config.getUsername());
            auth.setPassword(config.getPassword());
            auth.setPreemptiveAuthentication(true);
            options.setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE,auth);
            this.stub = new ProductServiceStub(configurationContext ,config.getWebserviceURL().toExternalForm());
            this.stub._getServiceClient().setOptions(options);
        } catch (AxisFault e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public TGetInfoReturn[] getInfo(String[] products) {
        GetInfoDocument info = GetInfoDocument.Factory.newInstance();
        for (String product : products) {
            GetInfo details = GetInfo.Factory.newInstance();
        }
        return stub.getInfo(info).getGetInfoResponse().getProducts();
    }

    @Override
    public TGetInfoReturn[] getInfo(String[] products, String[] attributes) {
        return null;
    }

    @Override
    public TGetInfoReturn[] getInfo(String[] products, String[] attributes, String[] languageCodes) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TExistsReturn[] exists(String[] products) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TDeleteReturn[] delete(String[] products) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TUpdateReturn[] update(TUpdateInput[] products) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TCreateReturn[] create(TCreateInput[] products) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] find(TFindInput searchParameters) {
        // TODO Auto-generated method stub
        return null;
    }

}
