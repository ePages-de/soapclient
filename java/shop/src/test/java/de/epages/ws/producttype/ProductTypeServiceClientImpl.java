package de.epages.ws.producttype;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.producttype.model.TCreatePreDefAttribute_Input;
import de.epages.ws.producttype.model.TCreateProductAttribute_Input;
import de.epages.ws.producttype.model.TCreate_Input;
import de.epages.ws.producttype.model.TCreate_Return;
import de.epages.ws.producttype.model.TDelete_Return;
import de.epages.ws.producttype.model.TExists_Return;
import de.epages.ws.producttype.model.TGetInfo_Return;
import de.epages.ws.producttype.model.TUpdatePreDefAttribute_Input;
import de.epages.ws.producttype.model.TUpdateProductAttribute_Input;
import de.epages.ws.producttype.model.TUpdate_Input;
import de.epages.ws.producttype.model.TUpdate_Return;
import de.epages.ws.producttype.stub.Port_ProductType;
import de.epages.ws.producttype.stub.ProductTypeServiceLocator;
import de.epages.ws.producttype.stub.Type_createPreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_createProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_deletePreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_deleteProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_existsPreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_existsProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_getAllPreDefAttributesInfo_Out;
import de.epages.ws.producttype.stub.Type_getAllProductAttributesInfo_Out;
import de.epages.ws.producttype.stub.Type_getPreDefAttributeInfo_Out;
import de.epages.ws.producttype.stub.Type_getProductAttributeInfo_Out;
import de.epages.ws.producttype.stub.Type_updatePreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_updateProductAttribute_Out;

public final class ProductTypeServiceClientImpl implements ProductTypeServiceClient {

    private static final ProductTypeServiceLocator serviceLocator = new ProductTypeServiceLocator();
    private final Port_ProductType stub;

    public ProductTypeServiceClientImpl(WebServiceConfiguration config) {
        this(config, new ProductTypeServiceStubFactoryImpl());
    }

    public ProductTypeServiceClientImpl(WebServiceConfiguration config, ProductTypeServiceStubFactory factory) {
        this.stub = factory.create(config, serviceLocator);
    }

    @Override
    public TCreate_Return[] create(TCreate_Input[] productTypes) {
        try {
            return stub.create(productTypes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_createPreDefAttribute_Out createPreDefAttribute(String productAttribute, TCreatePreDefAttribute_Input[] preDefAttributes) {
        try {
            return stub.createPreDefAttribute(productAttribute, preDefAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_createProductAttribute_Out createProductAttribute(String productType, TCreateProductAttribute_Input[] productAttributes) {
        try {
            return stub.createProductAttribute(productType, productAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDelete_Return[] delete(String[] productTypes) {
        try {
            return stub.delete(productTypes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_deletePreDefAttribute_Out deletePreDefAttribute(String productAttribute, String[] preDefAttributes) {
        try {
            return stub.deletePreDefAttribute(productAttribute, preDefAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_deleteProductAttribute_Out deleteProductAttribute(String productType, String[] productAttributes) {
        try {
            return stub.deleteProductAttribute(productType, productAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExists_Return[] exists(String[] productTypes) {
        try {
            return stub.exists(productTypes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_existsPreDefAttribute_Out existsPreDefAttribute(String productAttribute, String[] preDefAttributes) {
        try {
            return stub.existsPreDefAttribute(productAttribute, preDefAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_existsProductAttribute_Out existsProductAttribute(String productType, String[] productAttributes) {
        try {
            return stub.existsProductAttribute(productType, productAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetInfo_Return[] getAllInfo(String[] attributes, String[] languageCodes) {
        try {
            return stub.getAllInfo(attributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_getAllPreDefAttributesInfo_Out getAllPreDefAttributesInfo(String productAttribute, String[] languageCodes) {
        try {
            return stub.getAllPreDefAttributesInfo(productAttribute, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_getAllProductAttributesInfo_Out getAllProductAttributesInfo(String productType, String[] languageCodes) {
        try {
            return stub.getAllProductAttributesInfo(productType, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public String getBaseProductType() {
        try {
            return stub.getBaseProductType();
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetInfo_Return[] getInfo(String[] productTypes, String[] attributes, String[] languageCodes) {
        try {
            return stub.getInfo(productTypes, attributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_getPreDefAttributeInfo_Out getPreDefAttributeInfo(String productAttribute, String[] preDefAttributes, String[] languageCodes) {
        try {
            return stub.getPreDefAttributeInfo(productAttribute, preDefAttributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_getProductAttributeInfo_Out getProductAttributeInfo(String productType, String[] productAttributes, String[] languageCodes) {
        try {
            return stub.getProductAttributeInfo(productType, productAttributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdate_Return[] update(TUpdate_Input[] productTypes) {
        try {
            return stub.update(productTypes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_updatePreDefAttribute_Out updatePreDefAttribute(String productAttribute, TUpdatePreDefAttribute_Input[] preDefAttributes) {
        try {
            return stub.updatePreDefAttribute(productAttribute, preDefAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public Type_updateProductAttribute_Out updateProductAttribute(String productType, TUpdateProductAttribute_Input[] productAttributes) {
        try {
            return stub.updateProductAttribute(productType, productAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

}
