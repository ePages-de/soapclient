package de.epages.ws.crossselling;

import de.epages.ws.crossselling.model.TDeleteCrossSelling_Input;
import de.epages.ws.crossselling.model.TDeleteCrossSelling_Return;
import de.epages.ws.crossselling.model.TExistsCrossSelling_Input;
import de.epages.ws.crossselling.model.TExistsCrossSelling_Return;
import de.epages.ws.crossselling.model.TGetCrossSelling_Input;
import de.epages.ws.crossselling.model.TGetCrossSelling_Return;
import de.epages.ws.crossselling.model.TInsertCrossSelling_Input;
import de.epages.ws.crossselling.model.TInsertCrossSelling_Return;
import de.epages.ws.crossselling.stub.Port_CrossSelling;

public interface CrossSellingServiceClient extends Port_CrossSelling {

    /**
     * insert a cross selling (assign target product to product)
     */
    public TInsertCrossSelling_Return[] insert(TInsertCrossSelling_Input[] crossSellings);

    /**
     * delete a cross selling (delete assignment of target product
     * to product)
     */
    public TDeleteCrossSelling_Return[] delete(TDeleteCrossSelling_Input[] crossSellings);

    /**
     * check if exists a cross selling (if target product assigned
     * to product)
     */
    public TExistsCrossSelling_Return[] exists(TExistsCrossSelling_Input[] crossSellings);

    /**
     * get a cross selling (target products assigned to product)
     */
    public TGetCrossSelling_Return[] get(TGetCrossSelling_Input[] crossSellings);

}
