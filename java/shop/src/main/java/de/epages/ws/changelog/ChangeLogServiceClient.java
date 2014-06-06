package de.epages.ws.changelog;

import java.util.Calendar;

import de.epages.ws.changelog.stub.Port_ChangeLog;
import de.epages.ws.changelog.stub.TFindChanges_Return;
import de.epages.ws.changelog.stub.TFindCreates_Return;
import de.epages.ws.changelog.stub.TFindDeletes_Return;
import de.epages.ws.changelog.stub.TFindUpdates_Return;

public interface ChangeLogServiceClient extends Port_ChangeLog {

    /**
     * find new created objects
     */
    @Override
    TFindCreates_Return findCreates(Calendar createdAfter, String _class);

    /**
     * find deleted objects
     */
    @Override
    TFindDeletes_Return findDeletes(Calendar deletedAfter, String _class);

    /**
     * find updated objects
     */
    @Override
    TFindUpdates_Return findUpdates(Calendar updatedAfter, String _class, String profile);


    /**
     * find created, deleted and updated objects (updated object may
     * includes created)
     */
    @Override
    TFindChanges_Return findChanges(Calendar changedAfter, String _class, String profile);
}
