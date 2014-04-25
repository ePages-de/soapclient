package de.epages.ws.productbundle;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productbundle.stub.Bind_ProductBundle_SOAPStub;
import de.epages.ws.productbundle.stub.Port_ProductBundle;
import de.epages.ws.productbundle.stub.ProductBundleService;

final class ProductBundleServiceStubFactoryImpl implements ProductBundleServiceStubFactory {

    @Override
    public Port_ProductBundle create(WebServiceConfiguration config, ProductBundleService service) {

        try {
            Bind_ProductBundle_SOAPStub stub = (Bind_ProductBundle_SOAPStub) service.getport_ProductBundle(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
