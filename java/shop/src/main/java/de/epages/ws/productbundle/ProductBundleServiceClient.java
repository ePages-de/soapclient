/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productbundle;

import de.epages.ws.productbundle.model.TCreate_Input;
import de.epages.ws.productbundle.model.TCreate_Return;
import de.epages.ws.productbundle.model.TDelete_Input;
import de.epages.ws.productbundle.model.TDelete_Return;
import de.epages.ws.productbundle.model.TExists_Input;
import de.epages.ws.productbundle.model.TExists_Return;
import de.epages.ws.productbundle.model.TGetInfo_Return;
import de.epages.ws.productbundle.stub.Port_ProductBundle;

public interface ProductBundleServiceClient extends Port_ProductBundle {

    /**
     * assign a product to a product bundle
     */
    @Override
    TCreate_Return[] create(TCreate_Input[] productBundles);

    /**
     * unassign a product from a product bundle
     */
    @Override
    TDelete_Return[] delete(TDelete_Input[] productBundles);

    /**
     * check if a product is assigned to a product bundle
     */
    @Override
    TExists_Return[] exists(TExists_Input[] productBundles);

    /**
     * get bundled products assigned to a product bundle
     */
    @Override
    TGetInfo_Return[] getInfo(String[] products);

}
