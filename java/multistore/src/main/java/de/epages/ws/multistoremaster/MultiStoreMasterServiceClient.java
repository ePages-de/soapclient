package de.epages.ws.multistoremaster;

import de.epages.ws.multistoremaster.stub.*;
import de.epages.ws.multistoremaster.model.*;

public interface MultiStoreMasterServiceClient extends Port_MultiStoreMaster {

    /**
     * transfer basket to master
     */
    String buildShopUrl(String masterShopAlias, TBuildShopUrl_In buildShopUrl);


}
