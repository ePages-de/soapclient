/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.crossselling2;

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
import de.epages.ws.crossselling2.stub.Port_CrossSelling;

public interface CrossSellingServiceClient extends Port_CrossSelling {

    /**
     * insert a cross selling (assign target product to product)
     */
    @Override
    public TCreate_Return[] create(TCreate_Input[] crossSellings);

    /**
     * update a cross selling
     */
    @Override
    public TUpdate_Return[] update(TUpdate_Input[] crossSellings);

    /**
     * delete a cross selling (delete assignment of target product to product)
     */
    @Override
    public TDelete_Return[] delete(TDelete_Input[] crossSellings);

    /**
     * check if exists a cross selling (if target product assigned to product)
     */
    @Override
    public TExists_Return[] exists(TExists_Input[] crossSellings);

    /**
     * get a cross selling (target products assigned to product)
     */
    @Override
    public TGetInfo_Return[] getInfo(TGetInfo_Input[] crossSellings);

}
