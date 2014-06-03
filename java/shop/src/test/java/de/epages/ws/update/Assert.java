package de.epages.ws.update;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Assert {

    static private String printDate(String msg, Calendar calendar) {
        DateTime dateTime = new DateTime(calendar.getTimeInMillis());
        return msg + ": " + DateTimeFormat.forPattern("HH:mm:ss:SS").print(dateTime);
    }

    static void assertAfterOrSame(Calendar actual, Calendar after) {
        assertTrue(printDate("Actual", actual) + "," + printDate("After", after), after.getTimeInMillis() >= actual.getTimeInMillis());
    }
}
