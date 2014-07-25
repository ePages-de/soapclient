package de.epages.ws.changelog;

import java.util.Calendar;

import de.epages.ws.changelog.stub.*;

public interface ChangeLogServiceClient extends Port_ChangeLog {

    /**
     * find newly created objects
     */
    TFindCreatedObjects_Return findCreatedObjects(java.util.Calendar createdSince, java.lang.String _class);

    /**
     * find deleted objects
     */
    TFindDeletedObjects_Return findDeletedObjects(java.util.Calendar deletedSince, java.lang.String _class);

    /**
     * find updated objects (includes created objects if data set
     * related to profile)
     */
    TFindUpdatedObjects_Return findUpdatedObjects(java.util.Calendar updatedSince, java.lang.String _class, java.lang.String profile);

}
