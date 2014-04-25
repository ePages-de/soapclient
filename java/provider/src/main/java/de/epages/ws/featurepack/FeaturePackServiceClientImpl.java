package de.epages.ws.featurepack;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.featurepack.model.TAddShopType_Input;
import de.epages.ws.featurepack.model.TAddShopType_Return;
import de.epages.ws.featurepack.model.TApplyToAllShops_Input;
import de.epages.ws.featurepack.model.TApplyToAllShops_Return;
import de.epages.ws.featurepack.model.TApplyToShop_Input;
import de.epages.ws.featurepack.model.TApplyToShop_Return;
import de.epages.ws.featurepack.model.TCreate_Input;
import de.epages.ws.featurepack.model.TCreate_Return;
import de.epages.ws.featurepack.model.TDelete_Return;
import de.epages.ws.featurepack.model.TExists_Return;
import de.epages.ws.featurepack.model.TGetInfo_Return;
import de.epages.ws.featurepack.model.TRemoveFromShop_Input;
import de.epages.ws.featurepack.model.TRemoveFromShop_Return;
import de.epages.ws.featurepack.model.TRemoveShopType_Input;
import de.epages.ws.featurepack.model.TRemoveShopType_Return;
import de.epages.ws.featurepack.model.TUpdate_Input;
import de.epages.ws.featurepack.model.TUpdate_Return;
import de.epages.ws.featurepack.stub.FeaturePackServiceLocator;
import de.epages.ws.featurepack.stub.Port_FeaturePack;

public final class FeaturePackServiceClientImpl implements FeaturePackServiceClient {

    private static final FeaturePackServiceLocator serviceLocator = new FeaturePackServiceLocator();
    private final Port_FeaturePack stub;

    public FeaturePackServiceClientImpl(final WebServiceConfiguration config) {
        this(config, new FeaturePackServiceStubFactoryImpl());
    }

    public FeaturePackServiceClientImpl(WebServiceConfiguration config, FeaturePackServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    public FeaturePackServiceClientImpl(Port_FeaturePack stub) {
        this.stub = stub;
    }

    @Override
    public TAddShopType_Return[] addShopType(TAddShopType_Input[] featurePacks) {
        try {
            return stub.addShopType(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TApplyToAllShops_Return[] applyToAllShops(TApplyToAllShops_Input[] featurePacks) {
        try {
            return stub.applyToAllShops(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TApplyToShop_Return[] applyToShop(TApplyToShop_Input[] featurePacks) {
        try {
            return stub.applyToShop(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] featurePacks) {
        try {
            return stub.create(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] featurePacks) {
        try {
            return stub.delete(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] featurePacks) {
        try {
            return stub.exists(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] featurePacks, String[] attributes, String[] languageCodes) {
        try {
            return stub.getInfo(featurePacks, attributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TRemoveFromShop_Return[] removeFromShop(TRemoveFromShop_Input[] featurePacks) {
        try {
            return stub.removeFromShop(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TRemoveShopType_Return[] removeShopType(TRemoveShopType_Input[] featurePacks) {
        try {
            return stub.removeShopType(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] featurePacks) {
        try {
            return stub.update(featurePacks);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
