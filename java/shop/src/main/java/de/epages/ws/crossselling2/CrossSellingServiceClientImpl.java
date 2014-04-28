package de.epages.ws.crossselling2;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.crossselling2.model.TCreate_Input;
import de.epages.ws.crossselling2.model.TCreate_Return;
import de.epages.ws.crossselling2.model.TDelete_Input;
import de.epages.ws.crossselling2.model.TDelete_Return;
import de.epages.ws.crossselling2.model.TExists_Input;
import de.epages.ws.crossselling2.model.TExists_Return;
import de.epages.ws.crossselling2.model.TGetInfo_Input;
import de.epages.ws.crossselling2.model.TGetInfo_Return;
import de.epages.ws.crossselling2.model.TUpdate_Input;
import de.epages.ws.crossselling2.model.TUpdate_Return;
import de.epages.ws.crossselling2.stub.CrossSellingServiceLocator;
import de.epages.ws.crossselling2.stub.Port_CrossSelling;

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
    public TCreate_Return[] create(TCreate_Input[] crossSellings) {
        try {
            return stub.create(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(TDelete_Input[] crossSellings) {
        try {
            return stub.delete(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(TExists_Input[] crossSellings) {
        try {
            return stub.exists(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetInfo_Return[] getInfo(TGetInfo_Input[] crossSellings) {
        try {
            return stub.getInfo(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] crossSellings) {
        try {
            return stub.update(crossSellings);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
