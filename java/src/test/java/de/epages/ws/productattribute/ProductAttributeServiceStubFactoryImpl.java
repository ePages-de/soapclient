package de.epages.ws.productattribute;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.productattribute.stub.Bind_ProductAttribute_SOAPStub;
import de.epages.ws.productattribute.stub.Port_ProductAttribute;
import de.epages.ws.productattribute.stub.ProductAttributeService;

final class ProductAttributeServiceStubFactoryImpl implements ProductAttributeServiceStubFactory {

    private static final Logger log = LoggerFactory.getLogger(ProductAttributeServiceStubFactoryImpl.class);

    @Override
    public Port_ProductAttribute create(WebServiceConfiguration config, ProductAttributeService service) {
        log.info("Using webservice URL: " + config.getWebserviceURL());
        try {
            Bind_ProductAttribute_SOAPStub stub = (Bind_ProductAttribute_SOAPStub) service.getport_ProductAttribute(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
