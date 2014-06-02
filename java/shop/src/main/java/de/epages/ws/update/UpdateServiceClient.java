package de.epages.ws.update;

import java.util.Calendar;

import de.epages.ws.update.stub.Port_Update;
import de.epages.ws.update.stub.TFindDeletes_Return;
import de.epages.ws.update.stub.TFindUpdates_Return;

public interface UpdateServiceClient extends Port_Update {

    /**
     * find deleted objects
     */
    public TFindDeletes_Return[] findDeletes(Calendar deletedAfter, String _class);

    /**
     * find updated objects
     */ public TFindUpdates_Return findUpdates(Calendar updatedAfter, String _class, String profile);
}
