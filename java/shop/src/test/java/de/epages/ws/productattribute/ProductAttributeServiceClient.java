package de.epages.ws.productattribute;

import de.epages.ws.productattribute.model.TGetInfoList_Return;
import de.epages.ws.productattribute.stub.Port_ProductAttribute;


public interface ProductAttributeServiceClient extends Port_ProductAttribute {

    /**
     * get the list of productattributes
     */
    TGetInfoList_Return[] getInfoList();
}
