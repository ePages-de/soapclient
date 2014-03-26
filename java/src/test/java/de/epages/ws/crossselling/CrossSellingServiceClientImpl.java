package de.epages.ws.crossselling;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.crossselling.model.TDeleteCrossSelling_Input;
import de.epages.ws.crossselling.model.TDeleteCrossSelling_Return;
import de.epages.ws.crossselling.model.TExistsCrossSelling_Input;
import de.epages.ws.crossselling.model.TExistsCrossSelling_Return;
import de.epages.ws.crossselling.model.TGetCrossSelling_Input;
import de.epages.ws.crossselling.model.TGetCrossSelling_Return;
import de.epages.ws.crossselling.model.TInsertCrossSelling_Input;
import de.epages.ws.crossselling.model.TInsertCrossSelling_Return;
import de.epages.ws.crossselling.stub.CrossSellingServiceLocator;
import de.epages.ws.crossselling.stub.Port_CrossSelling;

public final class CrossSellingServiceClientImpl implements CrossSellingServiceClient {

    private static final CrossSellingServiceLocator serviceLocator = new CrossSellingServiceLocator();
    private final Port_CrossSelling stub;

    public CrossSellingServiceClientImpl(WebServiceConfiguration config) {
        this(config, new CrossSellingServiceStubFactoryImpl());
    }

    public CrossSellingServiceClientImpl(WebServiceConfiguration config, CrossSellingServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TDeleteCrossSelling_Return[] delete(TDeleteCrossSelling_Input[] crossSellings) {
        try {
            return stub.delete(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExistsCrossSelling_Return[] exists(TExistsCrossSelling_Input[] crossSellings) {
        try {
            return stub.exists(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetCrossSelling_Return[] get(TGetCrossSelling_Input[] crossSellings) {
        try {
            return stub.get(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TInsertCrossSelling_Return[] insert(TInsertCrossSelling_Input[] crossSellings) {
        try {
            return stub.insert(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
