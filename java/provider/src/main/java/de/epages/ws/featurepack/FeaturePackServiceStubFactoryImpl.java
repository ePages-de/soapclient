package de.epages.ws.featurepack;

import javax.xml.rpc.ServiceException;

import de.epages.ws.StubConfigurator;
import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.featurepack.stub.FeaturePackService;
import de.epages.ws.featurepack.stub.Bind_FeaturePack_SOAPStub;
import de.epages.ws.featurepack.stub.Port_FeaturePack;

final class FeaturePackServiceStubFactoryImpl implements FeaturePackServiceStubFactory {

    @Override
    public Port_FeaturePack create(WebServiceConfiguration config, FeaturePackService service) {

        try {
            Bind_FeaturePack_SOAPStub stub = (Bind_FeaturePack_SOAPStub) service.getport_FeaturePack(config.getWebserviceURL());
            if (stub == null) {
                throw new NullPointerException("stub");
            }
            return StubConfigurator.configure(stub, config);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }

}
