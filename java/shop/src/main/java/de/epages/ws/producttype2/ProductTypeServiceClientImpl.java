package de.epages.ws.producttype2;

import java.rmi.RemoteException;

import javax.xml.ws.WebServiceException;

import de.epages.ws.WebServiceConfiguration;
import de.epages.ws.producttype2.model.TCreatePreDefAttribute_Input;
import de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return;
import de.epages.ws.producttype2.model.TCreateProductAttribute_Input;
import de.epages.ws.producttype2.model.TCreateProductAttribute_Return;
import de.epages.ws.producttype2.model.TCreate_Input;
import de.epages.ws.producttype2.model.TCreate_Return;
import de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return;
import de.epages.ws.producttype2.model.TDeleteProductAttribute_Return;
import de.epages.ws.producttype2.model.TDelete_Return;
import de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return;
import de.epages.ws.producttype2.model.TExistsProductAttribute_Return;
import de.epages.ws.producttype2.model.TExists_Return;
import de.epages.ws.producttype2.model.TGetInfo_Return;
import de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return;
import de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return;
import de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Input;
import de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return;
import de.epages.ws.producttype2.model.TUpdateProductAttribute_Input;
import de.epages.ws.producttype2.model.TUpdateProductAttribute_Return;
import de.epages.ws.producttype2.model.TUpdate_Input;
import de.epages.ws.producttype2.model.TUpdate_Return;
import de.epages.ws.producttype2.stub.Port_ProductType;
import de.epages.ws.producttype2.stub.ProductTypeServiceLocator;

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
    public TCreatePreDefAttribute_Return[] createPreDefAttribute(String productAttribute, TCreatePreDefAttribute_Input[] preDefAttributes) {
        try {
            return stub.createPreDefAttribute(productAttribute, preDefAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TCreateProductAttribute_Return[] createProductAttribute(String productType, TCreateProductAttribute_Input[] productAttributes) {
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
    public TDeletePreDefAttribute_Return[] deletePreDefAttribute(String productAttribute, String[] preDefAttributes) {
        try {
            return stub.deletePreDefAttribute(productAttribute, preDefAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TDeleteProductAttribute_Return[] deleteProductAttribute(String productType, String[] productAttributes) {
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
    public TExistsPreDefAttribute_Return[] existsPreDefAttribute(String productAttribute, String[] preDefAttributes) {
        try {
            return stub.existsPreDefAttribute(productAttribute, preDefAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TExistsProductAttribute_Return[] existsProductAttribute(String productType, String[] productAttributes) {
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
    public TGetPreDefAttributeInfo_Return[] getAllPreDefAttributesInfo(String productAttribute, String[] languageCodes) {
        try {
            return stub.getAllPreDefAttributesInfo(productAttribute, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetProductAttributeInfo_Return[] getAllProductAttributesInfo(String productType, String[] languageCodes) {
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
    public TGetPreDefAttributeInfo_Return[] getPreDefAttributeInfo(String productAttribute, String[] preDefAttributes,
            String[] languageCodes) {
        try {
            return stub.getPreDefAttributeInfo(productAttribute, preDefAttributes, languageCodes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TGetProductAttributeInfo_Return[] getProductAttributeInfo(String productType, String[] productAttributes, String[] languageCodes) {
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
    public TUpdatePreDefAttribute_Return[] updatePreDefAttribute(String productAttribute, TUpdatePreDefAttribute_Input[] preDefAttributes) {

        try {
            return stub.updatePreDefAttribute(productAttribute, preDefAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }

    @Override
    public TUpdateProductAttribute_Return[] updateProductAttribute(String productType, TUpdateProductAttribute_Input[] productAttributes) {
        try {
            return stub.updateProductAttribute(productType, productAttributes);
        } catch (RemoteException e) {
            throw new WebServiceException(e);
        }
    }
}
