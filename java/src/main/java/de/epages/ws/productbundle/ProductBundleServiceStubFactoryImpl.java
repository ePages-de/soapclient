package de.epages.ws.productbundle;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productbundle.stub.Bind_ProductBundle_SOAPStub;
import de.epages.ws.productbundle.stub.Port_ProductBundle;
import de.epages.ws.productbundle.stub.ProductBundleService;

final class ProductBundleServiceStubFactoryImpl implements ProductBundleServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(ProductBundleServiceStubFactoryImpl.class);

    @Override
    public Port_ProductBundle create(WebServiceConfiguration config, ProductBundleService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
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
